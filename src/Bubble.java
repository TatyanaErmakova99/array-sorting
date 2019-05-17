import java.util.Arrays;

public class Bubble extends Generator{
    public void bubbleSort(int []mas){
        Change ch=new Change();
        long st, en, res;
        st = System.nanoTime();
        for(int i=1; i<mas.length; i++){

            for(int j=mas.length-1; j>=i; j--){
                if(mas[j-1]>mas[j]) {
                    ch.swap(mas, j);
                    System.out.println(Arrays.toString(mas));
                }
            }
        }
        en = System.nanoTime();
        res = en - st;
        System.out.println("time: "+res+" ns");
    }
}
