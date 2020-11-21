import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    // アプリ内での数字入力判断メソッド
    // public static void enterNumberCheck(int enterNumber){
    //     String regex_Alphabet = "^[A-Za-z]+$";//正規表現のパターン
    //     Pattern p1 = Pattern.compile(regex_Alphabet); // 正規表現パターンの読み込み
    //     Matcher m1 = p1.matcher(enterNumber); // パターンと検査対象文字列の照合
    //     boolean result = m1.matches(); // 照合結果をtrueまたはfalseで取得する

    //     if(result){
    //         System.out.println("文字を入力しています。半角英数字を入力してください");
    //     }
    // }

    public static void main(String[] args){
        
        System.out.println("ようこそ! このアプリはtodo管理アプリです");
        System.out.println("さあ、todoを登録しましょう！");

        
        int todoOperationJudgment = 0; // アプリ内での選択項目の変数
        int todoEndJudgment = 0 ; // アプリ終了判断変数
        String todocontent;

        // todo処理開始
        while(todoEndJudgment == 0){
            System.out.println("todo内容を入力してください");
            System.out.println("もしなければ、半角英数字の1を入力してください");

            // 入力項目例外処理確認
            try {
                todoOperationJudgment = new java.util.Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("入力内容に誤りがあります。入力エラー内容は：　" + e + "　：です。");
            }finally{
                if(todoOperationJudgment == 1){
                    System.out.println("todo入力機能に移ります。");
                }
                if(todoOperationJudgment == 0){
                    System.out.println("アプリを終了します。");
                    todoEndJudgment = 1;
                }
            }

            System.out.println("todo内容を入力してください");
            todocontent = new java.util.Scanner(System.in).nextLine()
            
        }
    }
}
