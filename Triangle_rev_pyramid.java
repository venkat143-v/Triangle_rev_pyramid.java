public class Triangle_rev_pyramid {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) // 5 rows -> 1 2 3 4 5 
		{
			for( int j = 1; j < i; j++) // 0 1 2 3 4 spaces
			{
				System.out.print(" ");
			}
			for(int n=5; n >= i;n--) // 5 4 3 2 1 stars
			{
				System.out.print( "* ");
			}
			System.out.println();
		}
} }