package Singletone;

/* Singleton */
// With static fields

class ChiefExecutiveOfficer {
    private static String name;
    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ChiefExecutiveOfficer.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ChiefExecutiveOfficer.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutiveOfficer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class MonoStateSingleton {
    public static void main(String[] args) {
        ChiefExecutiveOfficer officer = new ChiefExecutiveOfficer();
        officer.setAge(23);
        officer.setName("Giorgi");

        ChiefExecutiveOfficer officer2 = new ChiefExecutiveOfficer();
        System.out.println(officer2.getName());
    }
}
