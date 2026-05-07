public class KoreanFood extends MenuItem {
    public KoreanFood(String name, double price){
        super(name,price);
    }

    @Override
    public double calculateDiscountedPrice(int quantity){
        double total=sumPriceRecursive(quantity);
        if (quantity>3) {
            return total*0.9;
        }

        return total;
    }
}
