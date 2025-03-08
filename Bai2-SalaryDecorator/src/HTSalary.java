public class HTSalary extends SalaryDecorator{
    public HTSalary(Salary salary) {
        super(salary);
    }
    @Override
    public double getSalary() {
        return super.getSalary() + 3000000;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "+ phụ cấp hiệu trưởng : 3,000,000";
    }
}
