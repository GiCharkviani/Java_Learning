public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1)
//            System.out.println("Value was 1");
//        else if(value == 2)
//            System.out.println("Value was 2");
//        else
//            System.out.println("Value not 1 or 2");

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value not 1 or 2");
        }


        char myChar = 'A';

        switch (myChar) {
            case 'A':
                System.out.println("Char is A");
                break;
            case 'B':
                System.out.println("Char is B");
                break;
            case 'C':
                System.out.println("Char is C");
                break;
            case 'D':
                System.out.println("Char is D");
                break;
            case 'E':
                System.out.println("Char is E");
                break;
            default:
                System.out.println("A, B, C, D or E was not found");
                break;
        }
    }
}
