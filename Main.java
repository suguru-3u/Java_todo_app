import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        
        System.out.println("�悤����! ���̃A�v����todo�Ǘ��A�v���ł�");
        System.out.println("�����Atodo��o�^���܂��傤�I");

        
        int todoOperationJudgment = 0; // �A�v�����ł̑I�����ڂ̕ϐ�
        int todoEndJudgment = 0 ; // �A�v���I�����f�ϐ�
        String todocontent;

        // todo�����J�n
        while(todoEndJudgment == 0){
            System.out.println("todo���e����͂��Ă�������");
            System.out.println("�����Ȃ���΁A���p�p������1����͂��Ă�������");

            // ���͍��ڗ�O�����m�F
            try {
                todoOperationJudgment = new java.util.Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("���͓��e�Ɍ�肪����܂��B���̓G���[���e�́F�@" + e + "�@�F�ł��B");
            }finally{
                if(todoOperationJudgment == 1){
                    System.out.println("todo���͋@�\�Ɉڂ�܂��B");
                }
                if(todoOperationJudgment == 0){
                    System.out.println("�A�v�����I�����܂��B");
                    todoEndJudgment = 1;
                }
            }

            System.out.println("todo���e����͂��Ă�������");
            todocontent = new java.util.Scanner(System.in).nextLine()
            
        }
    }
}
