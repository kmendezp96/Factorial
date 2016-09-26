package factorial;

import java.util.Scanner;

class Factorial{
  public static int factorial (int a){
    if ( a <= 1)
    {
      return 1;
    } else {
	return a * factorial(a - 1);	
    }


  public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int a = sc2.nextInt();
        System.out.print(operar(a));
    }

}


