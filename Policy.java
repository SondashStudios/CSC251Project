// File Name: Policy.java

// Developer Name: CAIUS ILIESI
// Date: 4/10/23


public class Policy {

    private int pNumber;
    private String pName;
    private String fName;
    private String lName;
    private int age;
    private boolean isSmoker;
    private double height;
    private double weight;

    /**
     * Constructor with arguments.
     *
     * @param pNumber   The policy number.
     * @param pName     The provider name.
     * @param fName     The policyholder's first name.
     * @param lName     The policyholder's last name.
     * @param age       The policyholder's age.
     * @param isSmoker  The policyholder's smoking status (true if smoker, false if non-smoker).
     * @param height    The policyholder's height in inches.
     * @param weight    The policyholder's weight in pounds.
     */
     
    public Policy(int pNumber, String pName, String fName, String lName, int age, boolean isSmoker, double height,
                  double weight) {
        this.pNumber = pNumber;
        this.pName = pName;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.isSmoker = isSmoker;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Calculates the policyholder's body mass index (BMI).
     *
     * @return The policyholder's BMI.
     */
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates the price of the policy.
     *
     * @return The price of the policy.
     */
    public double getPolicyPrice() {
        double policyCost = 0;

        int BASE_PRICE = 600;
        int ADD_FEE = 75;
        int SMOKER_FEE = 100;

        policyCost = policyCost + BASE_PRICE;

        if (age > 50) {
            policyCost = policyCost + ADD_FEE;
        }

        if (isSmoker) {
            policyCost = policyCost + SMOKER_FEE;
        }

        if (getBMI() > 35) {
            policyCost = policyCost + (getBMI() - 35) * 20;
        }

        return policyCost;
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

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setSmoker(boolean isSmoker) {
        this.isSmoker = isSmoker;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


