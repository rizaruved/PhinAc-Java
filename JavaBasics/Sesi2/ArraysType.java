package JavaBasics.Sesi2;

import java.util.Arrays;

public class ArraysType {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        float[] heights = {173.5f, 182.3f, 190.0f};
        String[] names = new String[4];
        names[0] = "Tasya";
        names[1] = "Pangeran";
        names[2] = "Abdan";
        names[3] = "Lita";

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(names));
    }
}
