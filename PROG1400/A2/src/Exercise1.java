public class Range {
    private String energySource;
    private boolean[] stoveTopUnits; // True if on, false if off
    private int ovenTemperature;
    private int timer; // in minutes

    public Range(String energySource) {
        this.energySource = energySource;
        this.stoveTopUnits = new boolean[4]; // four stove top units
        this.ovenTemperature = 0;
        this.timer = 0;
    }

    public void turnStoveTopUnitOn(int unit) {
        if (unit >= 0 && unit < 4) {
            stoveTopUnits[unit] = true;
        }
    }

    public void turnStoveTopUnitOff(int unit) {
        if (unit >= 0 && unit < 4) {
            stoveTopUnits[unit] = false;
        }
    }

    public void bake(int temperature) {
        this.ovenTemperature = temperature;
        System.out.println("Baking at " + temperature + " degrees Celsius.");
    }

    public void broil() {
        System.out.println("Broiling...");
    }

    public void setTimer(int minutes) {
        this.timer = minutes;
        System.out.println("Timer set for " + minutes + " minutes.");
    }

    public void startCookTimer() {
        System.out.println("Cooking timer started for " + timer + " minutes.");
    }
}

public class Refrigerator {
    private int fridgeTemp;
    private int freezerTemp;
    private boolean doorOpen;
    private long doorOpenTime;

    public Refrigerator() {
        this.fridgeTemp = 3; // default fridge temperature
        this.freezerTemp = -18; // default freezer temperature
        this.doorOpen = false;
        this.doorOpenTime = 0;
    }

    public void setFridgeTemp(int temp) {
        this.fridgeTemp = temp;
        System.out.println("Fridge temperature set to " + temp + " degrees Celsius.");
    }

    public void setFreezerTemp(int temp) {
        this.freezerTemp = temp;
        System.out.println("Freezer temperature set to " + temp + " degrees Celsius.");
    }

    public void openDoor() {
        this.doorOpen = true;
        this.doorOpenTime = System.currentTimeMillis();
    }

    public void closeDoor() {
        this.doorOpen = false;
        if (System.currentTimeMillis() - doorOpenTime > 60000) {
            System.out.println("Beep! The door was open for more than 60 seconds.");
        }
    }

    public void defrost() {
        System.out.println("Defrosting freezer...");
    }
}

public class Microwave {
    private int powerLevel;
    private int timer;

    public Microwave() {
        this.powerLevel = 5; // default power level
        this.timer = 0;
    }

    public void setPowerLevel(int level) {
        if (level >= 1 && level <= 10) {
            this.powerLevel = level;
            System.out.println("Power level set to " + level);
        } else {
            System.out.println("Invalid power level. Please choose between 1 and 10.");
        }
    }

    public void setTimer(int minutes) {
        this.timer = minutes;
        System.out.println("Timer set for " + minutes + " minutes.");
    }

    public void cook() {
        System.out.println("Cooking at power level " + powerLevel + "...");
    }

    public void defrost() {
        System.out.println("Defrosting...");
    }

    public void reheat() {
        System.out.println("Reheating at power level " + powerLevel + "...");
    }
}

public class Main {
    public static void main(String[] args) {
        Range range = new Range("electric");
        range.turnStoveTopUnitOn(1);
        range.bake(180);
        range.setTimer(30);
        range.startCookTimer();

        Refrigerator fridge = new Refrigerator();
        fridge.setFridgeTemp(5);
        fridge.openDoor();
        fridge.closeDoor(); // Test if the beep works when door is open for over 60 seconds

        Microwave microwave = new Microwave();
        microwave.setPowerLevel(7);
        microwave.setTimer(5);
        microwave.cook();
    }
}