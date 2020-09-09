
package depcalc;

public class Asset {
   public String name;
    public Double cost,salvage;
   public int life;
    public String DepMeth;
public Asset()
{
    
}
    public Asset(String name, Double cost, Double salvage, int life) {
        this.name = name;
        this.cost = cost;
        this.salvage = salvage;
        this.life = life;
    }
  public void valid(String DepMeth)
  {
      if(DepMeth.equals("Straight Line"))
      {
          
      }
//      return name,"fds";
  }
  public double getAnnualDep(Double cost, Double salvage, int life)
  {
      int dept = 0;
      return dept;
  }
 public double BeginningBalance(int i, String meth)
 {
     return 0;
 } 
public double AnnualDepreciation()
{
     return 0;
}
public double EndingBalance(int i, String meth)
{
     return 0;
}

 public double AnnualDepreciation(int i, String meth)
 {
     return 0;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getSalvage() {
        return salvage;
    }

    public void setSalvage(Double salvage) {
        this.salvage = salvage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    
    
}

