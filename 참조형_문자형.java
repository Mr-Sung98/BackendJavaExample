public class 참조형_문자형 {
    public static void main(String[]args)
    {
        /*
        잠조형
        잠조형 데이터의 값 = 힙 메모리 영역
        변수에 대입되는 값 = 힙 메모리 영역의 주소값
        String = 문자열 객체
        
        String a = new String("Hello!"); 이건 생성자
        System.out.println(a);

        String b = "Hello!"; 이건 문자열 리터럴

        if (a == b)
        {
            System.out.println("a == b");
        } 안뜸
        if (b == c)
        {
            System.out.println("b == c");
        } 뜸
        우리가 직접 작성한 문자열은 먼저 동일한 데이터를 검색함 그래서 같은 주소.
        이것을 잘 알아둬야 참조형 데이터를 쉽게 사용가능.

        Sting str = "Hello";
        Sting str_2 = new String("Hello");

        if (str.equals(str_2)
        {
        System.out.println("str.equals(str_2");
        }

        1. '+' 연산자
        String str_1 = "Hello,";
        String str_2 = "World!";
        System.out.println(str_1 + " " + str_2);

        2. StringBuilder
        StringBuilder strBdr_1 = new StringBuilder("Hello,");
        strBdr_1.append(" ");
        strBdr_1.append("World!");
        String str_new = strBdr_1.toString();
        System.out.println(str_new);

        String str_1 = "이름: 김자바";
        System.out.println(str_1.indexOf("이"));
        System.out.println(str_1.indexOf("름"));

        String str_name = str_1.substring(4,7);
        System.out.println(str_name);

        문자열 대소문자변환
        String str_1 = "abc";
        String str_2 = "ABC";

        str_1 = str_1.toUpperCase();
        str_2 = str_2.toLowerCase();

        System.out.println(str_1);
        System.out.println(str_2);

        if (str_1.equals(str_2))
        {
          System.out.println(str_1.equals(str_2));
        } 틀림

        if (str_1.equalsIgnore(str_2))
        {
          System.out.println(str_1.equals(str_2));
        }같음 대소문자 무시

        공백 제거
        양쪽 끝 공백
        String str_1 = "    Hello    ";
        str_1 = str_1.trim();
        System.out.println(str_1);

        문자열 중간 공백
        String str_1 = "   Hel lo  ";
        str_1 = str_1.trim();
        str_1 = str_1.replace(" ","");
        System.out.println(str_1);
         */

    }
}
