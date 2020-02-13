package my_class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*檔案相關函數*/
public class my_file {
	/*輸出*/
	public static StringBuffer get_StringBuffer(String file_name) throws IOException {
		return new StringBuffer(get_String(file_name));
	}
	
	public static String get_String(String file_name) throws IOException {
		return new String(get_byteArr(file_name));
	}
	
	public static byte[] get_byteArr(String file_name) throws IOException {
		InputStream file = new FileInputStream(file_name);
		byte[] byte_file_data = new byte[file.available()];
		file.read(byte_file_data);
		file.close();
		return byte_file_data;
	}
	
	/*輸入*/
	public static void write_StringBuffer(String file_name, StringBuffer StringBuffer_var) throws IOException {
		write_String(file_name, new String(StringBuffer_var));
	}
	
	public static void write_String(String file_name, String String_var) throws IOException {
		write_byteArr(file_name, String_var.getBytes());
	}
	
	public static void write_byteArr(String file_name, byte[] byteArr_var) throws IOException {
		OutputStream file = new FileOutputStream(file_name);
		file.write(byteArr_var);
		file.close();
	}
}
