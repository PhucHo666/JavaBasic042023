public class vonglapforinsochan050 {
    public static void main(String[] args) {



        for(int i = 2; i <= 50; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("================================================");
        int mang1[] = new int[50];
        int mang2[] = new int[50];
        for (int i = 0; i < mang1.length; i++) {
            mang1[i] = i + 1;
            if (mang1[i] % 2 == 0) {
                mang2[i] = mang1[i];
            }
        }

        for(int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
        }


    }
}
