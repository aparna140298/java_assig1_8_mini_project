public class Manager extends Employee{
    private int nbClients;
    private int nbTravelDays;
    private int rate;

    double baseRate = 0;
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = rate;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = rate;
    }

    public int getNbClients() {
        return nbClients;
    }
    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public int getRate() {
        if (rate > 100) {
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
        return "Manager";
    }

    @Override
    public double annualIncome(){
        double income = 0;
        income = ((12 * baseRate) * rate) + (nbClients * GAIN_FACTOR_CLIENT) + (nbTravelDays * GAIN_FACTOR_TRAVEL);
        return income;
    }
}
