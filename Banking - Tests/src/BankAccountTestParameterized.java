public class BankAccountTestParameterized {
    private BankAccount account;

    @org.junit.jupiter.api.BeforeEach
    public void setup() {
        account = new BankAccount("Gis", "Charkvi", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


}
