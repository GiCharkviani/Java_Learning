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

    @Override
    public void plot() {
        System.out.println("More blood");
    }
}

class PuplFunction extends Movie {
    public PuplFunction(String name) {
        super(name);
    }

    @Override
    public void plot() {
        System.out.println("A lot of heroine");
    }
}

class LordOfRings extends Movie {
    public LordOfRings(String name) {
        super(name);
    }

    @Override
    public void plot() {
        System.out.println("Ring");
    }
}


public class Main {
    public static void main(String[] args) {
        Movie randomMovie = randomMovie();

        // Compiler gives type automatically
        var myName = "Giorgi";

        randomMovie.plot();
    }

    public static Movie randomMovie() {
        int randomNumber = (int)(Math.random() * 3) + 1;
        switch (randomNumber) {
            case 1:
                return new NoCountryForOldMen("No Country For Old Men");
            case 2:
                return new PuplFunction("Purp Function");
            case 3:
                return new LordOfRings("Lord Of Rings");
        }

        return null;
    }
}
