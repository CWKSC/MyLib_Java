package my_class;

public class my_convert {
	
	/*ÞD“Q byte[] to String[]*/
	public static String[] byteArr_to_String(byte[] byteArr_var) {
		String[] StringArr_var = new String[byteArr_var.length];
		for(int i = 0; i < byteArr_var.length; i++) {
			StringArr_var[i] = String.valueOf(byteArr_var[i]);
		}
		return StringArr_var;
	}
}
