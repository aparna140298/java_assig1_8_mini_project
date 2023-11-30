import java.time.Year;

public class Employee {


    final static int GAIN_FACTOR_CLIENT = 500;
    final static int GAIN_FACTOR_TRAVEL = 100;
    final static int GAIN_FACTOR_ERROR = 10;
    final static int GAIN_FACTOR_PROJECTS = 200;
    private String name;
    private int birthYear;
    private Vehicle vehicle;
    private Contract contract;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Employee(String name, int birthYear, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public Vehicle vehicle(){
        return vehicle;
    }

    public double annualIncome(){
        return 0;
    }

    public int getAge(){
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public String getEmployeeType(){
        return "Employee";
    }

    public void signContract(Contract contract) {
        this.contract = contract;
    }

    public Contract contract() {
        return contract;
    }

    public String contractInfo() {
        String info = "";
        if (contract instanceof Permanent){
            info = name + " is a " + getEmployeeType() + ". He/She is " + ((Permanent) contract).isMarried() + " and " +
                    "he/she has " + ((Permanent) contract).getNbChildren() + " children." +
                    "\nHe/She has worked for " + ((Permanent) contract).getAccumulatedDays() + " days and upon contract his/her" +
                    " monthly salary is " + ((Permanent) contract).getMonthlySalary();
        }
        else if (contract instanceof Temporary) {
            info = name + ", is a " + getEmployeeType() +". He/She is a temporary employee with " +
                    ((Temporary) contract).getHourlySalary() + " hourly salary and he worked for " +
                    ((Temporary) contract).getAccumulatedHours() + " hours";
        }
        return info;
    }
}
