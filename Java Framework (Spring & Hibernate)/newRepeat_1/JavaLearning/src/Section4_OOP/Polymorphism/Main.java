package Section4_OOP.Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void plot() {
        System.out.println("No Plot Here");
    }

    public String getName() {
        return name;
    }
}

class NoCountryForOldMen extends Movie {

    public NoCountryForOldMen(String name) {
        super(name);
    }

    
}


public class Main {
    public static void main(String[] args) {

    }
}
