import java.util.*;

class CollectionArrayListQ4 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter element to delete:");
        int key = sc.nextInt();

        list.remove(Integer.valueOf(key));

        System.out.println("After deletion:");
        System.out.println(list);
    }
}