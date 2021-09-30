package web_day14;

public class ThrowExam extends RuntimeException{
    public void sayNick(String nick){
        try {
        if ("fool".equals(nick)) throw new ThrowExam();
        System.out.println("당신의 별명은 "+nick+" 입니다");
        } catch(ThrowExam e) {
            System.out.println("에러가 발생했습니다.");
        }

        // say 메소드는 fool이라는 글자가 들어오면 return으로 메소드를 종료해서
        // 아무것도 출력하지 않는다
        // 단순하게 별명을 출력하지 못하게만 하는게 아니라 적극적으로 에러를 발생시켜보자
    }

    public static void main(String[] args) {
        ThrowExam throwExam = new ThrowExam();
        throwExam.sayNick("fool");
        throwExam.sayNick("Rojee");
    }
}
