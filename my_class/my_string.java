package my_class;

import java.io.IOException;

public class my_string {
	static String default_String = null;
	
	static String default_String_check = null;
	
	static String[] default_StringArr = null;
	static byte[] default_byteArr = null;
	
	static int default_start_index = 0;
	static boolean default_compare = true;
	
	/*ÔO¶¨Ä¬ÕJ”µÖµ*/
	public static void set_default_String_of_file(String file_name) throws IOException {
		default_String = my_file.get_String(file_name);
	}
	public static void set_default(String default_String, int default_start_index, boolean default_compare){
		my_string.default_String = default_String;
		my_string.default_start_index = default_start_index;
		my_string.default_compare = default_compare;
	}
	
	/**/
	public static String indexOf_String_after_StringArr(){
		return indexOf_String_after_StringArr(default_String, default_String_check, default_StringArr, default_start_index, default_compare);
	}
	public static String indexOf_String_after_StringArr(String String_var_check){
		return indexOf_String_after_StringArr(default_String, String_var_check, default_StringArr, default_start_index, default_compare);
	}
	public static String indexOf_String_after_StringArr(String String_var_check, String[] StringArr){
		return indexOf_String_after_StringArr(default_String, String_var_check, StringArr, default_start_index, default_compare);
	}
	public static String indexOf_String_after_StringArr(String String_var, String String_var_check, String[] StringArr){
		return indexOf_String_after_StringArr(String_var, String_var_check, StringArr, default_start_index, default_compare);
	}
	public static String indexOf_String_after_StringArr(String String_var, String String_var_check, String[] StringArr, int start_index, boolean compare){
		int index = String_var.indexOf(String_var_check, start_index) + String_var_check.length();
		return String_var.substring(index, indexOf_StringArr(String_var, StringArr, index, compare));
	}
	
	/* indexOf_StringArr() */
	public static int indexOf_StringArr() throws my_exception {
		if(my_string.default_String != null && my_string.default_StringArr != null) {
			return indexOf_StringArr(default_String, default_StringArr, default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String String_var) throws my_exception {
		if(my_string.default_StringArr != null) {
			return indexOf_StringArr(String_var, default_StringArr, default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String String_var, String[] StringArr) {
		return indexOf_StringArr(String_var, StringArr, default_start_index, default_compare);
	}
	public static int indexOf_StringArr(String String_var, String[] StringArr, int start_index) {
		return indexOf_StringArr(String_var, StringArr, start_index, default_compare);
	}
	public static int indexOf_StringArr(String String_var, int start_index) throws my_exception {
		if(my_string.default_StringArr != null) {
			return indexOf_StringArr(String_var, default_StringArr, start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String String_var, int start_index, boolean compare) throws my_exception {
		if(my_string.default_StringArr != null) {
			return indexOf_StringArr(String_var, default_StringArr, start_index, compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String[] StringArr_var) throws my_exception {
		if(my_string.default_String != null) {
			return indexOf_StringArr(default_String, StringArr_var, default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String[] StringArr_var, int start_index) throws my_exception {
		if(my_string.default_String != null) {
			return indexOf_StringArr(default_String, StringArr_var, start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String[] StringArr_var, int start_index, boolean compare) throws my_exception{
		if(my_string.default_String != null) {
			return indexOf_StringArr(default_String, StringArr_var, start_index, compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	
	/* Full form declaration of indexOf_StringArr() */
	public static int indexOf_StringArr(String String_var, String[] StringArr_var, int start_index, boolean compare) {
		int index = String_var.indexOf(StringArr_var[0]);
		for(int i = 1; i < StringArr_var.length ; i++) {
			int temp = String_var.indexOf(StringArr_var[i], start_index);
			index = compare ? Math.max(index, temp) : Math.min(index, temp);
		}
		return index;
	}
	
	/* indexOf_byteArr() */
	public static int indexOf_byteArr() throws my_exception {
		if( default_String != null && default_byteArr != null) {
			return indexOf_StringArr(default_String, my_convert.byteArr_to_String(default_byteArr), default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(String String_var) throws my_exception {
		if( default_byteArr != null) {
			return indexOf_StringArr(String_var, my_convert.byteArr_to_String(default_byteArr), default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(String String_var, byte[] byteArr_var) throws my_exception {
		return indexOf_StringArr(String_var, my_convert.byteArr_to_String(byteArr_var), default_start_index, default_compare);
	}
	public static int indexOf_byteArr(String String_var, byte[] byteArr_var, int start_index) throws my_exception {
		return indexOf_StringArr(String_var, my_convert.byteArr_to_String(byteArr_var), start_index, default_compare);
	}
	public static int indexOf_byteArr(String String_var, int start_index) throws my_exception {
		if( default_byteArr != null) {
			return indexOf_StringArr(String_var, my_convert.byteArr_to_String(default_byteArr), start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(String String_var, int start_index, boolean compare) throws my_exception {
		if( default_byteArr != null) {
			return indexOf_StringArr(String_var, my_convert.byteArr_to_String(default_byteArr), start_index, compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(byte[] byteArr_var) throws my_exception {
		if( default_String != null ) {
			return indexOf_StringArr(default_String, my_convert.byteArr_to_String(byteArr_var), default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(byte[] byteArr_var, int start_index) throws my_exception {
		if( default_String != null ) {
			return indexOf_StringArr(default_String, my_convert.byteArr_to_String(byteArr_var), start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(byte[] byteArr_var, int start_index, boolean compare) throws my_exception {
		if( default_String != null ) {
			return indexOf_StringArr(default_String, my_convert.byteArr_to_String(byteArr_var), start_index, compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	
	/* Full form declaration of indexOf_byteArr() */
	public static int indexOf_byteArr(String String_var, byte[] byteArr_var, int start_index, boolean compare) {
		return indexOf_StringArr(String_var, my_convert.byteArr_to_String(byteArr_var), start_index, compare);
	}
}
