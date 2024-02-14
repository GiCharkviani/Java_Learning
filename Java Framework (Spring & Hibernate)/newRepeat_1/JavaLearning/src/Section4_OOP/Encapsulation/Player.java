package Section4_OOP.Encapsulation;

public class Player {
    private String fullName;
    private int health = 100;
    private String weapon;

    public Player(String fullName) {
        this.fullName = fullName;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        if(this.health - damage <= 0) {
            System.out.println("Player is dead");
        } else {
            this.health -= damage;
        }

    }


    public int healthRemaining() {
        return this.health;
    }
}
