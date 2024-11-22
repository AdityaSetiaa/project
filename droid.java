public class droid{

    String name;
    int batteryLevel; 

    public droid(String droidName){
       name = droidName;
       batteryLevel = 100;
       

    }

    public void performingTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;

    }

    public void displayBatteryLevel(){

    }
    public String toString(){
       return "hello, im droid: " + name;

    }
    public void energyReport(){
         System.out.println("my battery level is " + batteryLevel);

    } 
    public static void energyTransfer(droid a, droid b){
        int c = a.batteryLevel;
        int d = b.batteryLevel;

        a.batteryLevel = d;
        b.batteryLevel = c;

       

    }
    public static void main(String[] args) {
      droid codey = new droid ("codey");
      System.out.println(codey);
     codey.performingTask("gooning");
     codey.energyReport();//100
     codey.performingTask("edging");
     codey.energyReport();//90
     codey.performingTask("from the screen. to the ring, to the pen, to the king!!!!!!!");
     codey.energyReport();//80
     int codeybatterylev = codey.batteryLevel;
     
     
      



     droid droid1 = new droid ("the droid");
     droid1.energyReport();
     System.out.println(droid1);
     droid1.energyReport();
     droid1.performingTask("gooning");
     droid1.energyReport();
     int droid1batterylev = droid1.batteryLevel;
     
     




     System.out.println("result before special method...");
     System.out.println(codey.name + " battery level is " + codey.batteryLevel );
     System.out.println(droid1.name + " battery level is " + droid1.batteryLevel );
    

    energyTransfer(codey, droid1);
    
    System.out.println("result after special method...");
    System.out.println(codey.name + " battery level is " + codey.batteryLevel );
    System.out.println(droid1.name + " battery level is " + droid1.batteryLevel );



    }
}