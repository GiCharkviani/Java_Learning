
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}


/* Car Classes Challenge */
class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        // getClass() comes from Object (Super Class)
        System.out.println(getClass().getSimpleName() + " Started engine");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " Accelerated");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() + " Broke");
    }

}

class BMW extends Car {
    public BMW(int cylinders) {
        super(cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " Started engine");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " Accelerated");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() +" BMW Broke");
    }
}

class Porsche extends Car {
    public Porsche(int cylinders) {
        super(cylinders);
    }
}


public class Main {
    public static void main(String[] args) {
//        for(int i = 0; i < 11; i++) {
//            Movie movie = randomMovie();
//            System.out.println("Movie #" + i +
//                    " : " + movie.getName() + "\n" +
//                    "Plot: " + movie.plot() + "\n");
//        }

        /* Car Classes Challenge */
        Car myCar = new BMW(3);
        myCar.accelerate();

        Car yourCar = new Porsche(5);
        yourCar.accelerate();
    }

    public static Movie randomMovie() {
        int random = (int)(Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + random);
        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
