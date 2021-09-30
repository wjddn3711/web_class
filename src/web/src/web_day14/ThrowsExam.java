package web_day14;

public class ThrowsExam extends RuntimeException {
    public static void main(String[] args) {
        ThrowsExam t = new ThrowsExam();
        try{
            t.sayNick("fool");
            t.sayNick("nick");
        }catch(ThrowsExam e) {
            System.out.println("에러 발생");
        }
    }

    public void sayNick(String nick) throws ThrowsExam{
        if ("fool".equals(nick)) throw new ThrowsExam();
        System.out.println("당신의 별명은 "+nick+" 입니다");
    }


}
