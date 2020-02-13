package my_class;

import java.io.IOException;

public class my_stringbuffer   {
	static StringBuffer default_StringBuffer = null;
	
	static String default_StringBuffer_check = null;
	
	static String[] default_StringArr = null;
	static byte[] default_byteArr = null;
	
	static int default_start_index = 0;
	static boolean default_compare = true;
	
	/*設定默認數值*/
	public static void set_default_StringBuffer_of_file(String file_name) throws IOException {
		default_StringBuffer = my_file.get_StringBuffer(file_name);
	}
	public static void set_default(StringBuffer default_StringBuffer, int default_start_index, boolean default_compare){
		my_stringbuffer.default_StringBuffer  = default_StringBuffer;
		my_stringbuffer.default_start_index = default_start_index;
		my_stringbuffer.default_compare = default_compare;
	}
	
	/*截取字串及字串祖之間的字串*/
	public static StringBuffer indexOf_String_after_StringArr(){
		return indexOf_String_after_StringArr(default_StringBuffer, default_StringBuffer_check, default_StringArr, default_start_index, default_compare);
	}
	public static StringBuffer indexOf_String_after_StringArr(String String_var_check){
		return indexOf_String_after_StringArr(default_StringBuffer, String_var_check, default_StringArr, default_start_index, default_compare);
	}
	public static StringBuffer indexOf_String_after_StringArr(String String_var_check, String[] StringArr){
		return indexOf_String_after_StringArr(default_StringBuffer, String_var_check, StringArr, default_start_index, default_compare);
	}
	public static StringBuffer indexOf_String_after_StringArr(StringBuffer String_var, String String_var_check, String[] StringArr){
		return indexOf_String_after_StringArr(String_var, String_var_check, StringArr, default_start_index, default_compare);
	}
	public static StringBuffer indexOf_String_after_StringArr(StringBuffer String_var, String String_var_check, String[] StringArr, int start_index, boolean compare){
		int index = String_var.indexOf(String_var_check, start_index) + String_var_check.length();
		return new StringBuffer( String_var.substring(index, indexOf_StringArr(String_var, StringArr, index, compare)) );
	}
	
	/* indexOf_StringArr() */
	public static int indexOf_StringArr() throws my_exception {
		if(my_stringbuffer.default_StringBuffer  != null && my_stringbuffer.default_StringArr != null) {
			return indexOf_StringArr(default_StringBuffer, default_StringArr, default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(StringBuffer StringBuffer_var) throws my_exception {
		if(my_stringbuffer.default_StringArr != null) {
			return indexOf_StringArr(StringBuffer_var, default_StringArr, default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(StringBuffer StringBuffer_var, String[] StringArr) {
		return indexOf_StringArr(StringBuffer_var, StringArr, default_start_index, default_compare);
	}
	public static int indexOf_StringArr(StringBuffer StringBuffer_var, String[] StringArr, int start_index) {
		return indexOf_StringArr(StringBuffer_var, StringArr, start_index, default_compare);
	}
	public static int indexOf_StringArr(StringBuffer StringBuffer_var, int start_index) throws my_exception {
		if(my_stringbuffer.default_StringArr != null) {
			return indexOf_StringArr(StringBuffer_var, default_StringArr, start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(StringBuffer StringBuffer_var, int start_index, boolean compare) throws my_exception {
		if(my_stringbuffer.default_StringArr != null) {
			return indexOf_StringArr(StringBuffer_var, default_StringArr, start_index, compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String[] StringArr_var) throws my_exception {
		if(my_stringbuffer.default_StringBuffer  != null) {
			return indexOf_StringArr(default_StringBuffer, StringArr_var, default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String[] StringArr_var, int start_index) throws my_exception {
		if(my_stringbuffer.default_StringBuffer  != null) {
			return indexOf_StringArr(default_StringBuffer, StringArr_var, start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_StringArr(String[] StringArr_var, int start_index, boolean compare) throws my_exception{
		if(my_stringbuffer.default_StringBuffer  != null) {
			return indexOf_StringArr(default_StringBuffer, StringArr_var, start_index, compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	
	/* Full form declaration of indexOf_StringArr() */
	public static int indexOf_StringArr(StringBuffer StringBuffer_var, String[] StringArr_var, int start_index, boolean compare) {
		int index = StringBuffer_var.indexOf(StringArr_var[0]);
		for(int i = 1; i < StringArr_var.length ; i++) {
			int temp = StringBuffer_var.indexOf(StringArr_var[i], start_index);
			index = compare ? Math.max(index, temp) : Math.min(index, temp);
		}
		return index;
	}
	
	/* indexOf_byteArr() */
	public static int indexOf_byteArr() throws my_exception {
		if( default_StringBuffer  != null && default_byteArr != null) {
			return indexOf_StringArr(default_StringBuffer, my_convert.byteArr_to_String(default_byteArr), default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(StringBuffer StringBuffer_var) throws my_exception {
		if( default_byteArr != null) {
			return indexOf_StringArr(StringBuffer_var, my_convert.byteArr_to_String(default_byteArr), default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(StringBuffer StringBuffer_var, byte[] byteArr_var) throws my_exception {
		return indexOf_StringArr(StringBuffer_var, my_convert.byteArr_to_String(byteArr_var), default_start_index, default_compare);
	}
	public static int indexOf_byteArr(StringBuffer StringBuffer_var, byte[] byteArr_var, int start_index) throws my_exception {
		return indexOf_StringArr(StringBuffer_var, my_convert.byteArr_to_String(byteArr_var), start_index, default_compare);
	}
	public static int indexOf_byteArr(StringBuffer StringBuffer_var, int start_index) throws my_exception {
		if( default_byteArr != null) {
			return indexOf_StringArr(StringBuffer_var, my_convert.byteArr_to_String(default_byteArr), start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(StringBuffer StringBuffer_var, int start_index, boolean compare) throws my_exception {
		if( default_byteArr != null) {
			return indexOf_StringArr(StringBuffer_var, my_convert.byteArr_to_String(default_byteArr), start_index, compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(byte[] byteArr_var) throws my_exception {
		if( default_StringBuffer  != null ) {
			return indexOf_StringArr(default_StringBuffer, my_convert.byteArr_to_String(byteArr_var), default_start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(byte[] byteArr_var, int start_index) throws my_exception {
		if( default_StringBuffer  != null ) {
			return indexOf_StringArr(default_StringBuffer, my_convert.byteArr_to_String(byteArr_var), start_index, default_compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	public static int indexOf_byteArr(byte[] byteArr_var, int start_index, boolean compare) throws my_exception {
		if( default_StringBuffer  != null ) {
			return indexOf_StringArr(default_StringBuffer, my_convert.byteArr_to_String(byteArr_var), start_index, compare);
		}else {
			throw new my_exception("default value haven't set.");
		}
	}
	
	/* Full form declaration of indexOf_byteArr() */
	public static int indexOf_byteArr(StringBuffer StringBuffer_var, byte[] byteArr_var, int start_index, boolean compare) {
		return indexOf_StringArr(StringBuffer_var, my_convert.byteArr_to_String(byteArr_var), start_index, compare);
	}
}
