import java.sql.SQLOutput;

public class ArraysExample {
    public static void main(String[] args) {
        //배열(Arrays)

        int[] price = {10000, 9000, 40000, 7000};
        String[] mbti = {"INFP","EMFP", "ISTJ", "ESTP"};

//        System.out.println(price[0]);
//        System.out.println(mbti[0]);
//
//        price[1] = 8000;
//        System.out.println(price[1]);
//
//        System.out.println(price); //이거도 객체이기 때문에 주소를 알려줌

        System.out.println(mbti.length);

        for (int i = 0; i < mbti.length; i++){
            System.out.println(mbti[i]);
        }
    }
}
