    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;


    public class Main {

        // �A�v�����ł̐������͔��f���\�b�h
        // public static void enterNumberCheck(int enterNumber){
        //     String regex_Alphabet = "^[A-Za-z]+$";//���K�\���̃p�^�[��
        //     Pattern p1 = Pattern.compile(regex_Alphabet); // ���K�\���p�^�[���̓ǂݍ���
        //     Matcher m1 = p1.matcher(enterNumber); // �p�^�[���ƌ����Ώە�����̏ƍ�
        //     boolean result = m1.matches(); // �ƍ����ʂ�true�܂���false�Ŏ擾����

        //     if(result){
        //         System.out.println("��������͂��Ă��܂��B���p�p��������͂��Ă�������");
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
            //     msg = "�g?���C�n?�̃��[�g?�ɐ������܂���";
            // }
            // catch (SQLException e) {
            //     msg = "�g?���C�n?�̃��[�g?��s���s���܂���";
            //     e.printStackTrace();
            // }
            
            System.out.println("�悤����! ���̃A�v����todo�Ǘ��A�v���ł�");
            System.out.println("�����Atodo��o�^���܂��傤�I");
     
            int todoEndJudgment = 0 ; // �A�v���I�����f�ϐ�
            
            // todo���C�������J�n
            while(todoEndJudgment == 0){
                int todoOperationJudgment = 0 ; // �A�v�����ł̑I�����ڂ̕ϐ�
                String todocontent = "test";
                int todocount = 0;

                System.out.println("todo�A�v�����I������ꍇ��0����͂��Ă�������");
                System.out.println("todo���e����͂���ꍇ��1����͂��Ă�������");
                System.out.println("todo�o�^����m��ꍇ�͓��͂���ɂ�2����͂��Ă�������");

                // ���͍��ڗ�O�����m�F
                try {
                    todoOperationJudgment = new java.util.Scanner(System.in).nextInt();
                } catch (Exception e) {
                    System.out.println("���͓��e�Ɍ�肪����܂��B���̓G���[���e�́F�@" + e + "�@�F�ł��B");
                }

                // ���͓��e�ɂ���ď�������
                if(todoOperationJudgment == 0){
                    System.out.println("�A�v�����I�����܂��B");
                    todoEndJudgment = 1;
                }
                if(todoOperationJudgment == 1){
                    System.out.println("todo���͋@�\�Ɉڂ�܂��B");
                    System.out.println("todo���e����͂��Ă�������");
                    try {
                        todocontent = new java.util.Scanner(System.in).nextLine();
                        System.out.println("todo���X�g�̓o�^�ɐ������܂���");
                        System.out.println("�o�^���e�F�@" + todocontent );
                        todocount++;
                    } catch (Exception e) {
                        System.out.println("���͓��e�Ɍ�肪����܂��B���̓G���[���e�́F�@" + e + "�@�F�ł��B");
                    }          
                }
                if(todoOperationJudgment == 2){
                    if(todocount == 0){
                        System.out.println("���ݕ����Ă���todo���X�g�͂���܂���B");
                    }else{                            
                        System.out.println("���ݕ����Ă���todo���X�g���� " + todocontent + " �ł��B");
                        }
                    }
                            
            }
        }
    }
