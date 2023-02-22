/*

  A person goes to a hotel and orders a meal, help him calculate the total bill which includes tax percentage and tip percentage.
  so give the tip percentage and tax percentage on the meal derive the total money he has to pay to the hotel.
  Constraints:
    0 < mealcost
    0 <= tip percentage
    0 <= tax percentage

  Sample input:

    300         // meal cost
    20.0        // tip percentage
    11          // tax percentage

  Sample output:

   the total bill to be paid is 393
*/

import java.util.Scanner;

public class Task3 {
     public static void main(String args[]){
         float mealCost ;
         float tip ;
         float tax ;

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a cost of meal :");
         mealCost = sc.nextFloat();
         //System.out.println("Cost of meal :" + mealCost);
         System.out.println("Enter a tip percentage:");
         tip = sc.nextFloat();

         System.out.println("Enter a tax percentage:");
         tax = sc.nextFloat();
         tip = ((mealCost * tip) / 100);
         tax = ((mealCost * tax) / 100);
         //System.out.println("tips :" + tip);
         //System.out.println("tax :" + tax);
         System.out.println("total amount to be paid is :" + (mealCost + tip + tax ) );
     }
}
