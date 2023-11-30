public class Tester extends Employee{
    private int nbBugs;
    private int rate;

    double baseRate = 0;

    public Tester(String name, int birthYear, int nbBugs, int rate){
        super(name, birthYear);
        this.nbBugs = nbBugs;
        this.rate = rate;
    }

    public Tester(String name, int birthYear, int nbBugs, int rate, Vehicle vehicle){
        super(name, birthYear, vehicle);
        this.nbBugs = nbBugs;
        this.rate = rate;
    }

    public int getNbBugs() {
        return nbBugs;
    }

    public int getRate() {
        if(rate > 100){
            return 100;
        } else if (rate < 10 && rate > 0) {
            return 10;
        } else if (rate == 0) {
            return 100;
        } else {
            return rate;
        }
    }
    @Override
    public String getEmployeeType(){
        return "Tester";
    }

    @Override
    public double annualIncome(){
        double income = 0;
        income = ((12 * baseRate) * rate) + nbBugs * GAIN_FACTOR_ERROR;
        return income;
    }
}

