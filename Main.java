public class Main {
    public static void main(String[] args){
        
        System.out.println("�悤����! ���̃A�v����todo�Ǘ��A�v���ł�");
        System.out.println("�����Atodo��o�^���܂��傤�I");
        int todoOperationJudgment = 0;
        int todoEndJudgment = 0 ;

        while(todoEndJudgment == 0){
            System.out.println("todo���e����͂��Ă�������");
            System.out.println("�����Ȃ���΁A���p�p������1����͂��Ă�������");
            try {
                todoOperationJudgment = new java.util.Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("���̓G���[���e�́F�@" + e );
            }
            if(todoOperationJudgment == 1){
                System.out.println("�A�v�����I�����܂��B");
                todoEndJudgment = 1;
            }
            
        }
    }
}
