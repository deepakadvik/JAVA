//Array Passes as (Call by reference)
public class Arrays3 {
    public static void Update(int Marks[], int NonChangable) {
        NonChangable = 10;
        for(int i = 0; i <Marks.length; i++) {
            Marks[i] = Marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int Marks[] = {98, 96, 97};
        int NonChangable = 5;
        Update(Marks, NonChangable);
        for(int i = 0; i <Marks.length; i++) {
            System.out.print(Marks[i] + " ");
        }
        System.out.println();
        System.out.print(NonChangable);
    }
}
