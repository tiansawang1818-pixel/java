public class DailyEmployee implements Payable{
    double day;
    public DailyEmployee(double n){
        this.day=n;
    }
    public double calculatePay(){
        if(this.day<=0){
            throw new IllegalArgumentException("must up 0");
        }
        return this.day*600;
    }
}
