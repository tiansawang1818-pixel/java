import java.util.InputMismatchException;
import java.util.Scanner;
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose (1-->hourly/2-->daily)");
        try{
        double choic=sc.nextDouble();
        sc.nextLine();
            if(choic==1){
                System.out.println("hour");
                double hour=sc.nextDouble();
                HourlyEmployee x=new HourlyEmployee(hour);
                System.out.println(x.calculatePay());
            }else if(choic==2){
                System.out.println("day");
                double hour=sc.nextDouble();
                HourlyEmployee x=new HourlyEmployee(hour);
                System.out.println(x.calculatePay());
            }else{
                System.out.println("input value");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("InputMismatchException");
        }finally{
            sc.close();
        }
}
    
}

