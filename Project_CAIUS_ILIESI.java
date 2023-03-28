// File Name: Project_CAIUS_ILIESI

// Developer Name: CAIUS ILIESI
// Date: 3/27/2023

// This is the Demo Class, but I did not know whether to change the file name or not, so I left it to Project_firstname_lastname


import java.util.Scanner;
public class Project_CAIUS_ILIESI
{
public static void main(String[] args)
{

// Declare variables
int pNumber;
String pName;
String fName;
String lName;
int age;
boolean isSmoker;
double height;
double weight;

// Create an instance of Scanner class
Scanner console=new Scanner(System.in);
System.out.print("Please enter the Policy Number: ");
pNumber=Integer.parseInt(console.nextLine());
System.out.print("Please enter the Provider Name: ");
pName=console.nextLine();
System.out.print("Please enter the Policyholder's First Name: ");
fName=console.nextLine();
System.out.print("Please enter the Policyholder's Last Name: ");
lName=console.nextLine();
System.out.print("Please enter the Policyholder's Age: ");
age=Integer.parseInt(console.nextLine());
System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
String smoker=console.nextLine();
if(smoker.equals("smoker"))
isSmoker=true;
else
isSmoker=false;

System.out.print("Please enter the Policyholder's Height (in inches): ");
height=Double.parseDouble(console.nextLine());
System.out.print("Please enter the Policyholder's Weight (in pounds):");
weight=Double.parseDouble(console.nextLine());

// Create a Policy object
Policy policy=new Policy(pNumber, pName, fName, lName, age, isSmoker, height, weight);

System.out.println();
System.out.printf("Policy Number: %d\n",policy.getpNumber());
System.out.printf("Provider Name: %s\n",policy.getpName());
System.out.printf("Policyholder's First Name: %s\n",policy.getfName());
System.out.printf("Policyholder's Last Name: %s\n",policy.getlName());
System.out.printf("Policyholder's Age: %d\n",policy.getAge());
System.out.printf("Policyholder's Smoking Status: %s\n",policy.isSmoker());
System.out.printf("Policyholder's Height: %.2f\n",policy.getHeight());
System.out.printf("Policyholder's Weight: %.2f\n",policy.getWeight());
System.out.printf("Policyholder's BMI: %.2f\n",policy.getBMI());
System.out.printf("Policy Price: $%.2f\n",policy.getpolicyprice());

}
}