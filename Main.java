public class Main {
    public static void main(String args[]) {
        Generator gen=new Generator();
        Bubble bubb= new Bubble();
        Select1 sel1= new Select1();
        Sheycker sheyk= new Sheycker();

        System.out.println();
        System.out.println("����� ��������");
        bubb.bubbleSort(gen.gener(1000));

        System.out.println();
        System.out.println("����� �������");
        sel1.func(gen.gener(1000));

        System.out.println();
        System.out.println("����� �������");
        sheyk.SheyckerSort(gen.gener(1000));
    }
}
