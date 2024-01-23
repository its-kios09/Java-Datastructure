import java.util.Vector;

public class Vectors {
    public static void main(String [] args){
        int size = 5;

        Vector<Integer> v = new Vector<Integer>(size);

//        Appending new elements
        for(int i = 1; i <= size; i++){
            v.add(i);

            System.out.println("The vector has:- " + v);

            if (v.size() > 3) {
                v.remove(3);
                System.out.println("The vector has after remove keyword:- " + v);
            } else {
                System.out.println("The vector does not have index 3 to remove.");
            }
        }
    }
}
