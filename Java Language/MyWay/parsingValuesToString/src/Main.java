public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= number; j++) {
                if(i == 1 || i == number)
                    System.out.print("*");
                if(i == 2 || i == 4) {
                    if(j != 3)
                        System.out.print("*");
                    if(j == 3)
                        System.out.print(" ");
                }
                if(i == 3) {
                    if(j % 2 == 0)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }

            }
            System.out.println("");
        }
    }
}
