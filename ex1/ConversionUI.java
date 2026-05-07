package ex1;
import java.util.InputMismatchException;
import  java.util.Scanner;
public class ConversionUI {
    private Scanner sc;
    public ConversionUI(){
        this.sc=new Scanner(System.in);
    }

    public double getInput(String prompt){
        System.out.println(prompt);
        try{
            return sc.nextDouble();
        }catch(InputMismatchException e){
            sc.nextLine();
            throw new InputMismatchException("ค่าinputไม่ถูกต้อง");
        }
    }

    public void displayResult(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        try{
            ConversionUI x=new ConversionUI();
            UnitConverter y=new UnitConverter();
            double choice = x.getInput("เลือกเมนู (1: CไปF, 2: MไปFt, 3: KgไปLb): ");
            if (choice==1){
                System.out.println(y.celsiusToFahrenheit(x.getInput("ใส่เลขมา")));
            }

            else if (choice==2){
                System.out.println(y.metersToFeet(x.getInput("ใส่เลขมา")));
            } 
            else if (choice==3){
                System.out.println(y.kilogramsToPounds(x.getInput("ใส่เลขมา")));
            }
            else {
                System.out.println("ไม่มีเมนูที่คุณเลือก (กรุณาเลือก 1, 2 หรือ 3)");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}