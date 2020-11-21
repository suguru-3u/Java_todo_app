    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;


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

            // String connectionUrl =
            //         "jdbc:sqlserver://yourserver.database.windows.net:1433;"
            //         + "database=javaTodoApp;"
            //         + "user=yourusername@yourserver;"
            //         + "password=yourpassword;"
            //         + "encrypt=true;"
            //         + "trustServerCertificate=false;"
            //         + "loginTimeout=30;";

            // ResultSet resultSet = null;

            // try (Connection connection = DriverManager.getConnection(connectionUrl){
            //     msg = "ト?ライハ?のロート?に成功しました";
            // }
            // catch (SQLException e) {
            //     msg = "ト?ライハ?のロート?にs失敗しました";
            //     e.printStackTrace();
            // }
            
            System.out.println("ようこそ! このアプリはtodo管理アプリです");
            System.out.println("さあ、todoを登録しましょう！");
     
            int todoEndJudgment = 0 ; // アプリ終了判断変数
            
            // todoメイン処理開始
            while(todoEndJudgment == 0){
                int todoOperationJudgment = 0 ; // アプリ内での選択項目の変数
                String todocontent = "test";
                int todocount = 0;

                System.out.println("todoアプリを終了する場合は0を入力してください");
                System.out.println("todo内容を入力する場合は1を入力してください");
                System.out.println("todo登録数を知る場合は入力するには2を入力してください");

                // 入力項目例外処理確認
                try {
                    todoOperationJudgment = new java.util.Scanner(System.in).nextInt();
                } catch (Exception e) {
                    System.out.println("入力内容に誤りがあります。入力エラー内容は：　" + e + "　：です。");
                }

                // 入力内容によって条件分岐
                if(todoOperationJudgment == 0){
                    System.out.println("アプリを終了します。");
                    todoEndJudgment = 1;
                }
                if(todoOperationJudgment == 1){
                    System.out.println("todo入力機能に移ります。");
                    System.out.println("todo内容を入力してください");
                    try {
                        todocontent = new java.util.Scanner(System.in).nextLine();
                        System.out.println("todoリストの登録に成功しました");
                        System.out.println("登録内容：　" + todocontent );
                        todocount++;
                    } catch (Exception e) {
                        System.out.println("入力内容に誤りがあります。入力エラー内容は：　" + e + "　：です。");
                    }          
                }
                if(todoOperationJudgment == 2){
                    if(todocount == 0){
                        System.out.println("現在抱えているtodoリストはありません。");
                    }else{                            
                        System.out.println("現在抱えているtodoリスト数は " + todocontent + " です。");
                        }
                    }
                            
            }
        }
    }
