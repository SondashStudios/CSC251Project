// File Name: Policy.java

// Developer Name: CAIUS ILIESI
// Date: 3/27/2023


public class Policy
{

// Private instance variabels
private int pNumber;
private String pName;
private String fName;
private String lName;
private int age;
private boolean isSmoker;
private double height;
private double weight;

// Constructor that arguments
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

// Calculate BMI
public double getBMI()
{
return (weight * 703 ) / (height*height );
}

// Calculate policy price
public double getpolicyprice()
{
double policy_cost=0;

int BASE_PRICE=600;
int ADD_FEE=75;
int SMOKER_FEE=100;

policy_cost=policy_cost+BASE_PRICE;

// Check if age is above 50
if(age>50)
policy_cost=policy_cost+ADD_FEE;

// Check person is smoker
if(isSmoker)
policy_cost=policy_cost+SMOKER_FEE;

// Check BMI is over 35
if(getBMI()>35)
policy_cost=policy_cost+( getBMI() - 35 ) * 20 ;

// Return policy cost
return policy_cost;
}

public int getpNumber()
{
return pNumber;
}

public void setpNumber(int pNumber)
{
this.pNumber = pNumber;
}

public String getpName()
{
return pName;
}

public void setpName(String pName)
{
this.pName = pName;
}

public String getfName()
{
return fName;
}

public void setfName(String fName)
{
this.fName = fName;
}

public String getlName()
{
return lName;
}

public void setlName(String lName)
{
this.lName = lName;
}

public int getAge()
{
return age;
}

public void setAge(int age)
{
this.age = age;
}

public boolean isSmoker()
{
return isSmoker;
}

public void setSmoker(boolean isSmoker)
{
this.isSmoker = isSmoker;
}

public double getHeight()
{
return height;
}

public void setHeight(double height)
{
this.height = height;
}

public double getWeight()
{
return weight;
}

public void setWeight(double weight)
{
this.weight = weight;
}
}