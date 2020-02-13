package my_class;

public class my_math{
	static public int factorial(int n){
		if(n > 0){
			int result = 1;
			do{
				result *= n;
			}while(--n != 0);
			return result;
		}else{
			return 0;
		}
	}
}