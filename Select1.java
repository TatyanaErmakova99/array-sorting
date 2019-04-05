import java.util.Arrays;

public class Select1 extends Generator {
    public void func(int []mas) {
        long st, en, res;
        st = System.nanoTime();
        int temp;
        int j;
        for (int i = 0; i < mas.length; i++) {
            temp = mas[i];
            for (j = i - 1; j >= 0 && mas[j] > temp; j--) {
                mas[j + 1] = mas[j];
            }
            mas[j + 1] = temp;
            System.out.println(Arrays.toString(mas));
        }
        en = System.nanoTime();
        res = en - st;
        System.out.println("time: "+res+" ns");
    }

}