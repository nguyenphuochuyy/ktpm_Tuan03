public class BasicSalary implements Salary {
    private double basicSalary;
    public BasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    @Override
    public double getSalary() {
        return basicSalary;
    }

    @Override
    public String getDescription() {
        return "Lương cơ bản : " + basicSalary;
    }
}
