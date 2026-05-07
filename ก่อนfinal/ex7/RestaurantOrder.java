import java.util.*;
public class RestaurantOrder {
    public static void main(String[] args) {
        Map<String,List<MenuItem>> menu=new HashMap<>();

        MenuItem friedRice = new ThaiFood("Fried Rice", 85.0);
        MenuItem sushi = new JapaneseFood("Sushi", 200.0);
        MenuItem tteokbokki = new KoreanFood("Tteokbokki", 180.0);

        menu.put("thai", Arrays.asList(friedRice));
        menu.put("Japanese", Arrays.asList(sushi));
        menu.put("Korean", Arrays.asList(tteokbokki));

        Map<MenuItem,Integer> order=new HashMap<>();
        order.put(friedRice, 2);
        order.put(sushi, 4);   
        order.put(tteokbokki, 1);

        System.out.println("Order Summary:");
        System.out.println(calculateTotalSales(order));
    }


    public static double calculateTotalSales(Map<MenuItem,Integer> orders){
        double grandTotal = 0;
        for(Map.Entry<MenuItem, Integer> i : orders.entrySet()){
            MenuItem x=i.getKey();
            grandTotal+=x.calculateDiscountedPrice(i.getValue());
            System.out.println("- "+x.name +" (" + x.getClass().getSimpleName()+") *"+i.getValue());
        }
        return grandTotal;
    }
    
}
