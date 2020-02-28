/*
  Bubble Sorting Algorithm on Java
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Bubble {
    public static void main(String[] args) {
        System.out.print("Bubble Sorting Algorithm\n\n");
        ArrayList<Integer> numstr = new ArrayList<>();
        Scanner n = null;
		try {
			n = new Scanner(new File("array.txt"));
			for (int i = 0; n.hasNextInt(); i++) {
                numstr.add(n.nextInt());
            }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			n.close();
		}
        printArray("Before:", numstr);
        bubble(numstr);
        printArray("\nAfter: ", numstr);
    }

    public static void bubble(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size()-i-1; j++) {
                if (a.get(j) > a.get(j+1)) a.set(j, getItself(a.get(j+1), a.set(j+1, a.get(j))));
            }
        }
    }

    public static int getItself(int a, int b) {
        return a;
    }

    public static void printArray(String message, ArrayList<Integer> a) {
        System.out.print(message);
        for (int i = 0; i < a.size(); i++)
            System.out.print(" " + a.get(i));
    }
}
