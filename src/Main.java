public class Main {

    public static void main(String[] args) {
        java.util.Queue<Client> queue = new java.util.LinkedList<>();
        for (int i = 1; i <11; i++) {
            queue.offer(new Client(i));
        }
        for (int i = 1; i < 11; i++) {
            queue.remove().buy();
        }
    }
}
