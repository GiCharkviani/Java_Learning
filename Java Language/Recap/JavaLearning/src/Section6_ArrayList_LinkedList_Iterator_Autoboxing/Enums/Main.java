package Section6_ArrayList_LinkedList_Iterator_Autoboxing.Enums;

public class Main {
    public static void main(String[] args) {

    }

    public static void weekDay(DaysOfWeek weekDay) {
        switch (weekDay) {
            case SUN:
                System.out.println("Today is a Sunday");
                break;
            case MON:
                System.out.println("Today is a Monday");
                break;
            case TUES:
                System.out.println("Today is a Tuesday");
                break;
            case WED:
                System.out.println("Today is a Wednesday");
                break;
            case THURS:
                System.out.println("Today is a Thursday");
                break;
            case FRI:
                System.out.println("Today is a Friday");
                break;
            case SAT:
                System.out.println("Today is a Saturday");
                break;
        }
    }
}
