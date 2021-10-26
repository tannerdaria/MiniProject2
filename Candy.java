import java.util.*;

class Candy {
  private String candyName;

  Candy() {
    candyName = "";
  }

  Candy(String aName) {
    candyName = aName;
  }

  void setName(String theName) {    
  candyName = theName;  
  }  

  String getName() {    
    return candyName;
  }


{
  Random r = new Random();
  int randomNum = r.nextInt(100) + 1;

  if(randomNum<=10){
    candyName = "M&Ms";
  }
  else if(randomNum>=11&&randomNum<=30){
    candyName = "Pink Starburst";
  }
  else if(randomNum>=31&&randomNum<=45){
    candyName = "Hershey's bar";
  }
  else if(randomNum>=46&&randomNum<=55){
    candyName = "Milky Way";
  }
  else if(randomNum>=56&&randomNum<=70){
    candyName = "Twix";
  }
  else if(randomNum>=71&&randomNum<=95){
    candyName = "Reese's";
  }
  else{
    candyName = "Kit Kat";
  }

  System.out.println(randomNum);

  System.out.println (candyName);
}
}

