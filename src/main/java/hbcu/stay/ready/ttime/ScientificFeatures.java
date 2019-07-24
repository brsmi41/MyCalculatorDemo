package hbcu.stay.ready.ttime;

public class ScientificFeatures extends Calculator{

    private double memory = 0;

    public ScientificFeatures(){
        memory = 0;
    }

    public ScientificFeatures(double memory){
        this.memory = memory;
    }
    public double sinFeature(){
        memory = Math.sin(memory);
        return  memory;
    }
    public double cosFeature(){
        memory = Math.cos(memory);
        return memory;
    }
    public double tanFeature(){
        memory = Math.tan(memory);
        return memory;
    }
    public double inverseSin(){
        memory = Math.asin(memory);
        return memory;
    }
    public double inverseCos(){
        memory = Math.acos(memory);
        return memory;
    }
    public double inverseTan(){
        memory = Math.atan(memory);
        return memory;
    }
    public double logFunction(){
        memory = Math.log(memory);
        return memory;
    }
    public double inverseLog(){
        memory = Math.log10(memory);
        return memory;
    }
    public double naturalLog(){
        memory = Math.log1p(memory);
        return  memory;
    }
    public double factorial(){
       double factorial = 1;
        for(double x=1; x <= memory; x++){
           factorial = factorial * x;

        }return factorial;
    }
    public double switchUnitsMode(){
        double degree = Math.toDegrees(memory);
        double radian = Math.toRadians(memory);
        return memory;
    }
}
