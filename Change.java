public class Change {
    public void swap(int []mas, int index){
        int temp = mas[index-1];
        mas[index-1]=mas[index];
        mas[index]=temp;
    }
}
