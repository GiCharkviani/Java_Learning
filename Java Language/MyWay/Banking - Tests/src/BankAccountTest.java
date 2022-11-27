import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount;
    private static int count;


    @org.junit.jupiter.api.BeforeAll
    public static void beforeAll() {
        System.out.println("This executes before any tests cases. Count = " + count++);
    }

    @org.junit.jupiter.api.BeforeEach
    public void setup() {
        bankAccount = new BankAccount("Gis", "Charkvi", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() {
        double balance = bankAccount.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_atm() {
        try {
            bankAccount.withdraw(600.00, false);
            fail("Should have thrown an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        bankAccount.withdraw(200.00, true);
        assertEquals(800.00, bankAccount.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true() {
        BankAccount bankAccount = new BankAccount("Gis", "Charkvi", 1000.00, BankAccount.CHECKING);
        assertTrue(bankAccount.isChecking(), "The account is NOT a checking account");
    }


    @org.junit.jupiter.api.AfterAll
    public static void afterAll() {
        System.out.println("This executes after any tests cases Count = " + count++);
    }

    @org.junit.jupiter.api.AfterEach
    public void teardown() {
        System.out.println("Count = " + count++);
    }
}

