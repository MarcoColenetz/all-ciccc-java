package Animals;

import main.Animal;

public class Reptile extends Animal {  
  private boolean drySkin;
  private boolean backbone;
  private boolean softEggs;


  public Reptile() {
    super();
    this.drySkin = true;
    this.backbone = true;
    this.softEggs = true;
  }


  public boolean isDrySkin() {
    return drySkin;
  }


  public boolean isBackbone() {
    return backbone;
  }


  public boolean isSoftEggs() {
    return softEggs;
  }

public String showInfo() {
  return "🦎Reptile [drySkin= " + drySkin + "backbone= " + backbone + "softEggs= " + softEggs + "]";
}
  
  
}