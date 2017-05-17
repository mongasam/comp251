package lab2;

public class D {
	static class PostIncrement {
		  public static void main(String args[]) {
			  int sum =0;
			  int n = 4;
			  for (int i = 0; i < n; i++)
				  for (int j = 0; j < n*n; j ++ )
					  sum++; 
			  System.out.println(sum ); 
		  }
	}

}
