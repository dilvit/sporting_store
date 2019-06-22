public class Client {
    private int id;
    public Client (int id) {
        this.id = id;
    }
    public void buy() {
        System.out.println("Client № " + id + " bought " + Product.getRandom());
    }
}
