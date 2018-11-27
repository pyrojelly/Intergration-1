
public class Character {
  private String name;
  private int health;
  
  public Character() {
    name="bob";
    health= 100;
  }
  public Character(String name, int health) {
    this.name=name;
    this.health= health;
  }
  public void setName(String nam) {
   name= nam;
  }
  public void setHealth(int num) {
    health= num;
  }
  public int getHealth() {
    return health;
  }
  public String getname() {
    return name;
  }
}

