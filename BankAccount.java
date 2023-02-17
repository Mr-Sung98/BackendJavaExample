public class BankAccount {

    // 멤버변수
    //private => 동일 클래스
    private int bankCode;
    private int accounyNo;
    private String owner;
    private int balance;
    private boolean isDormant;
    private int password;

    public BankAccount() {

    }

    // 메소드
    public void inquiry() {}
    public void deposit() {}
    public void withdraw() {}
    public void heldInDormant() {}

    // 생성자
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치!
    // new 연산자와 함께 사용
    BankAccount(
            int bankCode,
            int accounyNo,
            String owner,
            int balance,
            int password,
            boolean isDormant
    ){
        this.bankCode = bankCode;
        this.accounyNo = accounyNo;
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = isDormant;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccounyNo() {
        return accounyNo;
    }

    public void setAccounyNo(int accounyNo) {
        this.accounyNo = accounyNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
