package decisions;
import java.util.Scanner;
public class CostOfInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
final int BASEPAY = 200;
final int SENIOR = 125;
final int YOUTH = -25;
final int OVERWEIGHT = 300;
final int SMOKER = 50;
final int CLEAN = -40;
int agepay = -99;
int weightpay = -99;
int smokingpay = -99;
System.out.println("How old are you?");
int age = input.nextInt();
System.out.println("How much do you weigh?");
double weight = input.nextDouble();
System.out.println("Do you smoke? (True/False)");
boolean smoke = input.nextBoolean();
if
(age<30) {
	agepay = YOUTH; }
if
(age>75) {
	agepay = SENIOR; }
if
(age>30&&age<75) {
	agepay = 0; }
if
(weight>=700) {
	weightpay = OVERWEIGHT; }
if
(weight <700) {
	weightpay = 0; }
if 
(smoke == true) {
	smokingpay = SMOKER; }
if
(smoke == false) {
	smokingpay = CLEAN; }
double totalcost = BASEPAY + smokingpay + agepay + weightpay;
System.out.println("Your insurance price is $" + totalcost);
	}

}
