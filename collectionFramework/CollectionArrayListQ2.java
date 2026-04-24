import java.util.*;

class CollectionArrayListQ2 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        if (list.contains(key)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}