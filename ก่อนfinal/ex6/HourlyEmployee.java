public class HourlyEmployee implements Payable{
    double hour;
    public HourlyEmployee(double n){
        this.hour=n;
    }
    public double calculatePay(){
        if(this.hour<=0){
            throw new IllegalArgumentException("must up 0");
        }
        return this.hour*120;
    }
}
