package Section3_ControlFlow.SwitchStatement;

public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 7;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 5:
                System.out.println("Value is 5");
                break;
            case 4:
                System.out.println("Value is 4");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }
}