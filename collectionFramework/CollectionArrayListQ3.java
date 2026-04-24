import java.util.*;

class CollectionArrayListQ3 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter element:");
        int key = sc.nextInt();

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if ((int)list.get(i) == key) {
                count++;
            }
        }

        System.out.println("Occurrence: " + count);
    }
}