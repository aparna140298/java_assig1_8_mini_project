public class Temporary extends Contract{
    private double hourlySalary;
    private int accumulatedHours;

    public Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public int getAccumulatedHours() {
        return accumulatedHours;
    }
}

