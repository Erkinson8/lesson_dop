package kg.geeks.game.players;

public abstract class Hero implements HavingSuperAbility {
    private String name;
    private int health;
    private int damage;
    private SuperAbility ability;

    public Hero(String name, int health, int damage, SuperAbility ability) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.ability = ability;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0; // здоровье не может быть отрицательным
        } else {
            this.health = health;
        }
    }


    public boolean isAlive() {
        return this.health > 0;
    }

    public void attack(Boss boss) {
        if (this.isAlive()) {
            boss.setHealth(boss.getHealth() - this.damage);
            System.out.println(this.name + " атакует босса " + boss.getName() + " на " + this.damage + " единиц урона.");
        }
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name + " health: " + health + " damage: " + damage;
    }
}