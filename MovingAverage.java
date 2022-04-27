/*Write a program that prompts the user to enter an array of 10 integers, 
and then displays the moving average of this number series. 
Below is the formula to calculate moving average:
MA(i) = Sum(number[0] + number[1] + ... + number[i-1]) / (i + 1)
Below is a sample run:

Enter 10 integers: 
1 2 3 4 5 6 7 8 9 10
Moving averages: 
1.0 1.5 2.0 2.5 3.0 3.5 4.0 4.5 5.0 5.5
*/
import java.util.Scanner;
public class MovingAvg{
		public static void main(String[] args){
	//make an array 		
	int [] array = new int[10];
	//scanner input
	Scanner input = new Scanner(System.in);
	//make an input for the array
	System.out.println("Type 10 integers:");
for(int i = 0; i< array.length ; i++){	
	array[i] = input.nextInt();
}				
//call a sum variable			
double avg = 0.0;
double sum = 0.0;
System.out.println("Moving average:");
for(int i = 0; i<array.length; i++){
sum+= array[i];	
	avg = sum/(i+1);
System.out.print(avg + " ");
}
		}
}
