import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String[] { "Cobra", "Sapo", "Tartaruga"};
        List<String> array1List = new ArrayList<>(Arrays.asList(array1));

        String[] array2 = new String[] { "Rã", "Cobra", "Jabuti"};
        List<String> array2List = new ArrayList<>(Arrays.asList(array2));

        for (int i = 0; i < array2.length; i++) {
            if (array1List.contains(array2[i])) {
                System.out.println(array2[i]);
            }
        }
    }
}