public enum Product {
    NIKERS(5000),
    SHIRT(3000),
    TROUSERS(4000),
    HATS(2500);

    int price;
    Product(int price) {
        this.price = price;
    }
    public static Product getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
