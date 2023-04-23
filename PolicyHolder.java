// File Name: PolicyHolder.java

// Developer Name: CAIUS ILIESI
// Date: 4/23/2023


public class PolicyHolder {

    private String fName;
    private String lName;
    private int age;
    private boolean isSmoker;
    private double height;
    private double weight;

    public PolicyHolder(String fName, String lName, int age, boolean isSmoker, double height, double weight) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.isSmoker = isSmoker;
        this.height = height;
        this.weight = weight;
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

    @Override
    public String toString() {
        return "Policyholder's First Name: " + fName +
                "\nPolicyholder's Last Name: " + lName +
                "\nPolicyholder's Age: " + age +
                "\nPolicyholder's Smoking Status(Y/N): " + (isSmoker ? "smoker" : "non-smoker") +
                "\nPolicyholder's Height: " + height + " inches" +
                "\nPolicyholder's Weight: " + weight + " pounds";
    }
}

