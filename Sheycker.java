import java.util.Arrays;

public class Sheycker extends Generator {
    public void SheyckerSort(int []mas){
        long st, en, res;
        st = System.nanoTime();
        int left = 1, right = mas.length - 1;
        do {

            for (int i = right; i >= left; i--) {
                if (mas[i - 1] > mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                    System.out.println(Arrays.toString(mas));
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (mas[i - 1] > mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                    System.out.println(Arrays.toString(mas));
                }
            }
            right--;

        } while (left<=right);
        en = System.nanoTime();
        res = en - st;
        System.out.println("time: "+res+" ns");
    }
}
