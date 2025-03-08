public class Main {
    public static void main(String[] args) {

        // Nhân viên 1 : Trưởng phòng
        Salary nv1 = new TPSalary(new BasicSalary(2000000));
        System.out.println("Nhân viên 1 : " + nv1.getDescription());
        System.out.println("Nhân viên 1 : " + nv1.getSalary() + "vnđ");
        Salary nv2 = new HTSalary(new BasicSalary(1000000));
        System.out.println("Nhân viên 2 : " + nv2.getDescription());
        System.out.println("Nhân viên 2 : " + nv2.getSalary() + "vnđ");
    }
}