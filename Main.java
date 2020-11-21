public class Main {
    public static void main(String[] args){
        
        System.out.println("ようこそ! このアプリはtodo管理アプリです");
        System.out.println("さあ、todoを登録しましょう！");
        int todoOperationJudgment = 0;
        int todoEndJudgment = 0 ;

        while(todoEndJudgment == 0){
            System.out.println("todo内容を入力してください");
            System.out.println("もしなければ、半角英数字の1を入力してください");
            try {
                todoOperationJudgment = new java.util.Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("入力エラー内容は：　" + e );
            }
            if(todoOperationJudgment == 1){
                System.out.println("アプリを終了します。");
                todoEndJudgment = 1;
            }
            
        }
    }
}
