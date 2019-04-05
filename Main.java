public class Main {
    public static void main(String args[]) {
        Generator gen=new Generator();
        Bubble bubb= new Bubble();
        Select1 sel1= new Select1();
        Sheycker sheyk= new Sheycker();

        System.out.println();
        System.out.println("Метод пузырька");
        bubb.bubbleSort(gen.gener(1000));

        System.out.println();
        System.out.println("Метод выборки");
        sel1.func(gen.gener(1000));

        System.out.println();
        System.out.println("Метод Шейкера");
        sheyk.SheyckerSort(gen.gener(1000));
    }
}
