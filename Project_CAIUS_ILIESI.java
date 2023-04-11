// File Name: Project_CAIUS_ILIESI

// Developer Name: CAIUS ILIESI
// Date: 4/10/2023

/* This is the Demo Class. Everything went well until the last step when I tested the program. The "Compile File" button did not give me any errors,
   but when running the program, I was met with the error "Exception in thread "main" java.lang.NumberFormatException: For input string: ""."
   I rewrote the demo and policy classes several times, but I was presented with the same error every time. I also tried looking through my textbook 
   and online for how to address this issue, but I couldn't find anything to help me. 
   
   I'm confident the program would originally work and that it can read the .txt file, but I couldn't find a way to fix or bypass this issue. 
   If you know what the problem is, I would really appreciate to see how I could fix it, because I feel very embarrased for submitting a program that 
   can't run.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_CAIUS_ILIESI {

    /**
     * Reads the policy information from the specified text file and returns an ArrayList containing Policy objects.
     * 
     * @param fileName the name of the text file containing the policy information
     * @return an ArrayList containing Policy objects
     * @throws FileNotFoundException if the specified file does not exist
     */
     
    public static ArrayList<Policy> readPolicyInformation(String fileName) throws FileNotFoundException {
        ArrayList<Policy> policies = new ArrayList<>();
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextLine()) {
            int policyNumber = Integer.parseInt(input.nextLine());
            String providerName = input.nextLine();
            String firstName = input.nextLine();
            String lastName = input.nextLine();
            int age = Integer.parseInt(input.nextLine());
            boolean isSmoker = input.nextLine().equals("smoker");
            double height = Double.parseDouble(input.nextLine());
            double weight = Double.parseDouble(input.nextLine());
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, isSmoker, height, weight);
            policies.add(policy);
        }
        input.close();
        return policies;
    }

    /**
     * Displays the policy information for the specified Policy object.
     * 
     * @param policy the Policy object to display information for
     */
     
    public static void displayPolicyInformation(Policy policy) {
        System.out.println("Policy Number: " + policy.getpNumber());
        System.out.println("Provider Name: " + policy.getpName());
        System.out.println("Policyholder's First Name: " + policy.getfName());
        System.out.println("Policyholder's Last Name: " + policy.getlName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status(smoker/non-smoker): " + (policy.isSmoker() ? "smoker" : "non-smoker"));
        System.out.println("Policyholder's Height : " + policy.getHeight()+" inches");
        System.out.println("Policyholder's Weight : " + policy.getWeight()+" pounds");
        System.out.println("Policyholder's BMI: " + String.format("%.2f",policy.getBMI()));
        System.out.println("Policy Price: $" + String.format("%.2f",policy.getPolicyPrice()));
        System.out.println();
    }

    /**
     * Displays the number of policyholders that are smokers and the number of
     * policyholders that are non-smokers for the specified list of Policy objects.
     * 
     * @param policies the list of Policy objects to analyze
     */
     
    public static void displaySmokerInformation(ArrayList<Policy> policies) {
        int smokers = 0;
        int nonSmokers = 0;
        for (Policy policy : policies) {
            if (policy.isSmoker()) {
                smokers++;
            } else {
                nonSmokers++;
            }
        }
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
    }

    /**
     * The main method of the Demo class.
     * 
     * @param args command-line arguments (not used)
     */
     
    public static void main(String[] args) {
        try {
            ArrayList<Policy> policies = readPolicyInformation("PolicyInformation.txt");
            for (Policy policy : policies) {
                displayPolicyInformation(policy);
            }
            displaySmokerInformation(policies);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

}


