package Section4_OOP.Encapsulation;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player is dead");
        }
    }


    public int healthRemaining() {
        return this.health;
    }
}
