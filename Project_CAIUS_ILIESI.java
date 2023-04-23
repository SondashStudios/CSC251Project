// File Name: Project_CAIUS_ILIESI.java

// Developer Name: CAIUS ILIESI
// Date: 4/23/2023


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_CAIUS_ILIESI {

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
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, isSmoker, height, weight);
            Policy policy = new Policy(policyNumber, providerName, policyHolder);
            policies.add(policy);
        }
        input.close();
        return policies;
    }

    public static void displayPolicyInformation(Policy policy) {
        System.out.println(policy.toString() + "\n");
    }

    public static void displaySmokerInformation(ArrayList<Policy> policies) {
        int smokers = 0;
        int nonSmokers = 0;
        for (Policy policy : policies) {
            if (policy.getPolicyHolder().isSmoker()) {
                smokers++;
            } else {
                nonSmokers++;
            }
        }
        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
    }

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