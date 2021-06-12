package Lab1;
import java.util.*;
class CalculateSum{
	
public static int CalculateSum(int N,int X,int Y ) {
	int a1, a2, a3;
    
    a1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2;
    a2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2;
    a3 = ((N / (X * Y))) * (2 * (X * Y)
                      + (N / (X * Y) - 1) * (X * Y))/ 2;
 
    return  a1 + a2 - a3;
}

	public static void main(String[] args) {
		int N;
        System.out.println("Enter value of n\n");
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        int X = 3, Y = 5;
     
        System.out.println(CalculateSum(N, X, Y));

	}

}
