import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // setting up
        Scanner s = new Scanner(System.in);
        //user input part
        System.out.println("This is a bill calculator");
        System.out.println("It will calculate how much each person will pay as part of the bill and tip");
        System.out.print("Start by typing in the bill amount (no $): ");
        String bill = s.nextLine();
        double actualBill = Double.parseDouble(bill);
        System.out.print("Ok now type in the tip percent (type it as a whole number): ");
        String tip = s.nextLine();
        double actualTip = Double.parseDouble(tip);
        System.out.print("Finally, tell me how many people are in your party: ");
        String people = s.nextLine();
        // ok here comes the fun part (calculations)
        int actualPeople = Integer.parseInt(people);
        double tipTip = actualTip / 100;
        double tippingsTippington = tipTip * actualBill;
        double billAndTip = tippingsTippington + actualBill;
        double tipPerPerson = tippingsTippington / actualPeople;
        double billPerPerson = billAndTip / actualPeople;
        // and then we put it all together
        System.out.println("Aight we did the math and... ");
        System.out.println("The total in tips will come to $" + Math.round(tippingsTippington * 100.0) / 100.0);
        System.out.println("The total of the bill is $" + Math.round(billAndTip * 100.0) / 100.0);
        System.out.println("For the tips, each person will have to pay $" + Math.round(tipPerPerson * 100.0) / 100.0);
        System.out.println("And finally, for the total bill, each person will pay $" + Math.round(billPerPerson * 100.0) / 100.0);
        // nice and satisfying
        }
    }
