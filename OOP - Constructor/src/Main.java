public class Main {
    public static void main(String[] args) {
        Account gioAccount = new Account("12345", 0, "Gio Charkvi",
                "myemail@gmail.com", "995 - 231321");
        Account gagaAccount = new Account();
        Account timAccount = new Account("Tim", "tim@gmail.com", "12345");
        System.out.println(timAccount.getCustomerName());

        System.out.println(gioAccount.getBalance());
        System.out.println(gioAccount.getCustomerName());

        gioAccount.withdraw(100);

        gioAccount.deposit(50);
        gioAccount.withdraw(100);

        gioAccount.deposit(51);
        gioAccount.withdraw(100);

        /* VIP Customer Class Challenge */
        VipCustomer giusha = new VipCustomer();
        VipCustomer gioCharkvi = new VipCustomer("Giorgi", 33d);
        VipCustomer giorgiCharkviani = new VipCustomer("Giusha", 555d, "vipGio@gmail.com");

        System.out.println(giusha.getEmailAddress());
        System.out.println(gioCharkvi.getEmailAddress());
        System.out.println(giorgiCharkviani.getCreditLimit());

        /* Wall Class Challenge */
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        /* Point Class Challenge */
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        /* Floor, Carpet & Calculator Classes Challenge */
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        /* Complex Number Class Challenge */
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
