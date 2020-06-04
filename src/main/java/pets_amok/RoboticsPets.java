package pets_amok;

public class RoboticsPets extends VirtualPet {

    int oilMaintenance;

    public RoboticsPets(String name, String desc, int boredom, int health, int happiness, int oilMaintenance) {
        super(name, desc, boredom, health, happiness);
        this.oilMaintenance = oilMaintenance;
    }

//    public void oiling(){ }



    public int getOilMaintenance() {
        return oilMaintenance;
    }


    public void actionOilMaintenance(){
        oilMaintenance += 5;
        health += 5;
    }
}


  //  public void actionCleanCage() {
    //    cageClean = 20;
    //}
//    public int getCageCleanliness() {
      //  return cageCleanliness;
    //}





