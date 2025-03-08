public class TPSalary extends SalaryDecorator{

    public TPSalary(Salary salary) {
        super(salary);
    }


    @Override
    public double getSalary() {
         return super.getSalary() + 5000000; // phụ cấp trưởng phòng 5tr
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "+ Phụ cấp trưởng phòng : 5,000,000";
    }
}
