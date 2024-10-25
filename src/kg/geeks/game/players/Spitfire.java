package kg.geeks.game.players;

public class Spitfire extends Hero {
    private boolean isAggressive = false;

    public Spitfire(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.AGGRESSION);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        // Если Spitfire агрессивен, он наносит дополнительный урон
        if (isAggressive && boss.getHealth() > 0) {
            System.out.println(getName() + " is furious and deals additional 80 damage!");
            boss.setHealth(boss.getHealth() - 80);
            isAggressive = false; // Сбрасываем агрессию после атаки
        }
    }

    public void triggerAggression() {
        isAggressive = true;
    }
}