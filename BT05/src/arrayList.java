import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i <= 50; i++){
            if ( i % 2 == 0){
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);


//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
//        }
    }
}
