abstract class SalaryDecorator implements Salary {
    protected Salary salary;

    public SalaryDecorator(Salary salary) {
        this.salary = salary;
    }
    @Override
    public double getSalary() {
        return salary.getSalary();
    }

    @Override
    public String getDescription() {
        return salary.getDescription();
    }
}
