public class Programmer extends Employee{
    private int nbProjects;
    private int rate;
    double baseRate = 0;

    public Programmer(String name, int birthYear, int nbProjects) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
    }
    public Programmer(String name, int birthYear, int nbProjects, int rate) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        this.rate = rate;
    }

    public Programmer(String name, int birthYear, int nbProjects, int rate, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbProjects = nbProjects;
        this.rate = rate;
    }

    public Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbProjects = nbProjects;
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

    public int getNbProjects() {
        return nbProjects;
    }
    @Override
    public String getEmployeeType(){
        return "Programmer";
    }
    @Override
    public double annualIncome(){
        double income = 0;
        income = ((12 * baseRate) * rate) + GAIN_FACTOR_PROJECTS * nbProjects;
        return income;
    }
}
