/*Display a geometric progression
Write a program that displays the first ten terms of a geometric progression with
initial value 1 and common ratio 2. The n-th term of this geometric progression
is given by:

a(0) = 1                if n = 0
a(n) = 2 * a(n-1)   if n >= 1

Below is a sample run:

1 2 4 8 16 32 64 128 256 512

This code only does the common ratio of 2, but can become any value with the addition of the Scanner class
*/
public class GeoProg{
		public static void main(String[] args){
for(int i = 0; i<10; i++){
	System.out.print(geoProg(i) + " ");
}
}
	public static int geoProg(int n){
		if ( n == 0){
		return 1;
	}
	else{
		return 2 * geoProg(n-1);
	}	
	}
}
