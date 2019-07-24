package hbcu.stay.ready.ttime;

public class Display extends Calculator {
   String[] switchDisplayMode = {"binary","octal","decimal","hexadecimal"};
   int i = 0;
   String displayMode = switchDisplayMode[i];

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
}
