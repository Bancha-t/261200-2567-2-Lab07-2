public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;

    Character(int maxHealth, int maxStamina){
        this.health = maxHealth;
        this.stamina = maxStamina;
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        System.out.println("Character created with " + maxHealth + " health and " + maxStamina + " stamina.");
    }

    public int getHealth(){
        return health;
    }

    public int getStamina(){
        return stamina;
    }

    public void swingSword(){
        int staminaCost = 10;
        if(getHealth() <= 0){
            System.out.println("Are you kidding me? Character is dead.");
        }
        else{
            if(stamina >= staminaCost){
                stamina -= staminaCost;
                System.out.println("Character swings sword. Stamina is now " + getStamina() + ".");
            }
            else{
                System.out.println("Your character needs to cool down.");
            }
        }
    }

    public void takeDamage(int damage){
        health -= damage;
        if(getHealth() >= 0){
            System.out.println("Character takes " + damage + " damage. Health is now " + getHealth() + ".");
            if(getHealth() == 0){
                System.out.println("Character is dead.");
            }   
        }
        else{
            System.out.println("Noooooo Are you kidding me? Your Character is dead.");
        }
    }

    public void rest(){
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }

}
