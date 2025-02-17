package Practice;

public class Droid{
    int batteryLevel;
    String name;

    // Droid conductor
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // droid introduction
    public String toString(){
        return "Hello, I'm the droid: " + name;
    }

    // has droid perform task. Takes energy
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    };

    // status report on energy levels
    public void energyReport() {
        System.out.println(name +"'s energy level is currently " + batteryLevel);
    }

    // Energy Transfer Method. Takes from one droid and gives to another
    public void energyTransfer(Droid receivingDroid, int energyAmount){
        if (energyAmount > batteryLevel){
            System.out.println("Error." + name  +
                    " does not have enough energy to do this transfer. Current battery levels are at: " + batteryLevel);
        } else if (energyAmount <= 0){
            System.out.println("Error. Please request more than 0.");
        } else {
            int spaceLeft = 100 - receivingDroid.batteryLevel;
            int actualTransfer = Math.min(energyAmount, spaceLeft);

            batteryLevel -= actualTransfer;
            receivingDroid.batteryLevel += actualTransfer;

            System.out.println(name + " has transferred " + actualTransfer + " energy to " + receivingDroid.name + ". "
                    + receivingDroid.name + " now has " + receivingDroid.batteryLevel + " battery level and " + name +
                    " now has " + batteryLevel + " battery left.");
        }
    }

    //main
    public static void main(String[] args){
        // creating Codey
        Droid codey = new Droid("Codey");
        System.out.println(codey);

// creating Adam
        Droid adam = new Droid("Adam");
        System.out.println();
        System.out.println();
        System.out.println(adam);


    }
}
