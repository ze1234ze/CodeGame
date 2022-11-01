package CodeGame.Model;

public class Test {

    public static void main(String[] args) {
        int[] table = { 5, 4, 3, 2, 1 };
        table[1] = table[0]/table[1];
        System.out.println(table[1]);
    }
}