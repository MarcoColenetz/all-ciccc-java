package Animals;

import main.Animal;


public class Fish extends Animal
 {
  private boolean liveInWater;
  private boolean gills;


  public Fish() {
    super(); 
    this.liveInWater = true;
    this.gills = true;
  }


  public boolean isLiveInWater() {
    return liveInWater;
  }


  public boolean isGills() {
    return gills;
  }

  public String showInfo() {
    return "🐠Fishes[liveInWater= " + liveInWater + "gills= " + gills + "]";
  }


}

