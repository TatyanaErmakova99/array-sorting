import java.util.Arrays;

public class Generator {
    public int[] gener(int a) {
        //�������� ������
        System.out.println();
        int[] mas = new int[a];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println("�������� ������: "+Arrays.toString(mas));
        return mas;
    }
}
