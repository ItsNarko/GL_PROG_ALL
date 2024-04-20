// Abstract class for players
abstract class Player {
    protected String name;
    protected int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Abstract method for player's action
    public abstract void action();

    // Getter and setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

// Boss class
class Boss {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int defensePower;

    public Boss(String name, int health, int attackPower, int defensePower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    // Methods for boss's attack and defense
    public void attack() {
        System.out.println(name + " attacks with its power!");
    }

    public void defense() {
        System.out.println(name + " defends against the attack!");
    }
}

// Fangora class
class Fangora extends Boss {
    public Fangora() {
        super("Fangora", 100, 20, 10);
    }

    // Specific method for Fangora
    public void poisonAttack() {
        System.out.println("Fangora releases poisonous gas!");
    }
}

// HotWings class
class HotWings extends Boss {
    public HotWings() {
        super("Hot Wings", 120, 25, 15);
    }

    // Specific method for Hot Wings
    public void fireAttack() {
        System.out.println("Hot Wings spews out fireballs!");
    }
}

// Squashini class
class Squashini extends Boss {
    public Squashini() {
        super("Squashini", 150, 30, 20);
    }

    // Specific method for Squashini
    public void magicTrick() {
        System.out.println("Squashini performs a disappearing act!");
    }
}

// Kirby class
class Kirby extends Player {
    public Kirby() {
        super("Kirby", 100);
    }

    @Override
    public void action() {
        System.out.println(name + " inhales enemies and copies their abilities!");
    }
}

// PrinceFluff class
class PrinceFluff extends Player {
    public PrinceFluff() {
        super("Prince Fluff", 100);
    }

    @Override
    public void action() {
        System.out.println(name + " spins to entangle enemies!");
    }
}
