import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This is a bill calculator");
        System.out.println("It will calculate how much each person will pay as part of the bill and tip");
        System.out.print("Start by typing in the bill amount (no $): ");
        String bill = s.nextLine();
        double actualBill = Double.parseDouble(bill);
        System.out.print("Ok now type in the tip percent (type it as a whole number: ");
        String tip = s.nextLine();
        double actualTip = Double.parseDouble(tip);
        System.out.print("Finally, tell me how many people are in your party: ");
        String people = s.nextLine();
        int actualPeople = Integer.parseInt(people);
        }
    }
