package hbcu.stay.ready.ttime;

public class Display extends Calculator {
   String[] switchDisplayMode = {"binary","octal","decimal","hexadecimal"};
   String displayMode = "binary";
   String unitsMode = "degree";
   int i = 0;
   public void switchDisplayModes(){
      i++;
      if(i == 4){
         i = 0;
      }
      displayMode = switchDisplayMode[i];
   }
   public void switchDisplayModes(String mode){
      displayMode = mode;
}
   public void switchUnitsMode(){
      if(unitsMode == "Degrees"){
         unitsMode = "Radians";
      }
      else{
         unitsMode = "Degrees";
      }
   }
}
