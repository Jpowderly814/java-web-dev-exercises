
package exercises;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,5,8};
        String[] eggArray;
        String eggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        for (int i : array){
            if (i%2 != 0) {
                System.out.println(i);
            }
        }

        eggArray = eggs.split("\\.");
        System.out.println(Arrays.toString(eggArray));


    }
}
