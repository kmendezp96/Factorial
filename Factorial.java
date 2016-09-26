/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

class Factorial{
  public static int operar (int a){
    if (a==0 || a==1){
      return 1;
    }
    int res=1;
    for (int i=1;i<=a;i++){
      res= res*i;
    }
    return res;
  }
  public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int a = sc2.nextInt();
        System.out.print(operar(a));
    }

}
