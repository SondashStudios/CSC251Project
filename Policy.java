// File Name: Policy.java

// Developer Name: CAIUS ILIESI
// Date: 4/23/23


public class Policy {

    private int pNumber;
    private String pName;
    private PolicyHolder policyHolder;
    private static int policyCount = 0;

    public Policy(int pNumber, String pName, PolicyHolder policyHolder) {
        this.pNumber = pNumber;
        this.pName = pName;
        this.policyHolder = policyHolder;
        policyCount++;
    }

    public double getBMI() {
        return (policyHolder.getWeight() * 703) / (policyHolder.getHeight() * policyHolder.getHeight());
    }

    public double getPolicyPrice() {
        double policyCost = 0;

        int BASE_PRICE = 600;
        int ADD_FEE = 75;
        int SMOKER_FEE = 100;

        policyCost = policyCost + BASE_PRICE;
        if (policyHolder.getAge() > 50) {
            policyCost = policyCost + ADD_FEE;
        }
        if (policyHolder.isSmoker()) {
            policyCost = policyCost + SMOKER_FEE;
        }
        if (getBMI() > 35) {
            policyCost = policyCost + (getBMI() - 35) * 20;
        }

        return policyCost;
    }

    public static int getPolicyCount() {
        return policyCount;
    }

    public int getpNumber() {
        return pNumber;
    }
    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    @Override
    public String toString() {
        return "Policy Number: " + pNumber +
                "\nProvider Name: " + pName +
                "\n" + policyHolder.toString() +
                "\nPolicyholder's BMI: " + String.format("%.2f", getBMI()) +
                "\nPolicy Price: $" + String.format("%.2f", getPolicyPrice());
    }
}