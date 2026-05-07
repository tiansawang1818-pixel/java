public abstract class MenuItem {
    String name;
    double price;
    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }


    protected double sumPriceRecursive(int quantity) {
        if (quantity <= 0){
            return 0;
        }
        return price + sumPriceRecursive(quantity - 1);
    }

    public abstract double calculateDiscountedPrice(int quantity);
}
