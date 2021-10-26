// Team names: Graham Koenig, Alex Hils, Maggie Korte, Tanner Daria
//10/29/2021
import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Happy Halloween!");
    System.out.println("How many houses should we trick or treat at?");

    Scanner s = new Scanner(System.in);
int number = s.nextInt();

Candy candy1 = new Candy();

    if (number > 0) {
      while (number >= 0){
        System.out.println("Trick or Treat! We got " + candy1);
        number--;
      }
    }


  }
}