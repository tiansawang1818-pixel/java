package ex1;

public class UnitConverter {
    public double celsiusToFahrenheit(double celsius){
        if (celsius<-273.15){
            throw new IllegalArgumentException("อุณหภูมิไม่สามารต่ำได้มากกว่านี้");
        }
        return (celsius * 9 / 5) + 32;
    }

    public double metersToFeet(double meters){
        if(meters<-1){
            throw new IllegalArgumentException("ค่าไม่สามารถติดลบได้");
        }
        return meters*3.28084;
    }

     public double kilogramsToPounds(double kilograms){
        if(kilograms<-1){
            throw new IllegalArgumentException("ค่าไม่สามารถติดลบได้");
        }
        return kilograms*3.28084;
    }
}
