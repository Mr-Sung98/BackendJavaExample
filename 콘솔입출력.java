import java.util.Scanner;

public class 콘솔입출력 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요. >>");
        String username = sc.nextLine();
        System.out.print("생년월일을 입력해주세요. >>");
        int birthDate = sc.nextInt();

        System.out.printf("%s\t%d",username, birthDate);
        
        // %s는 문자 %d는 숫자 \n은 다음 열로 \t는 스페이스바하나 넣은거
    }
}
