public class EnhancedPlayer {
    private String fullName;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.fullName = name;
        if(health > 0 && health <= 100)
            this.hitPoints = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
