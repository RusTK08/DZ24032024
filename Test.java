

public class Test {
    public static void main(String[] args) {
    Pair<Integer, String> pair = new Pair<>(10, "Hello");
    System.out.println("First element: " + pair.getFirst());
    System.out.println("Second element: " + pair.getSecond());

    pair.setFirst(20);
    pair.setSecond("World");
    System.out.println("Updated first element: " + pair.getFirst());
    System.out.println("Updated second element: " + pair.getSecond());
    pair.print();
    System.out.println("\n");
    
    //ПРОВЕРКА НИЖЕ
    Pair<Integer, String> pair1 = new Pair<>(40, "Hello111");
    pair1.print();
    pair1.setFirst(100);
    pair1.setSecond("World111");
    pair1.print();
    
}
}
