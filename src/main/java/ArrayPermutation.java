import java.util.List;

/**
 * Created by bgabonyi on 2017. 03. 30..
 */
public class ArrayPermutation {

    private int[] source;
    private List<int[]> permutations;

    public ArrayPermutation(int length) {
        source = new int[length];
        for (int i = 0; i < length; i++) {
            source[i] = i + 1;
        }
    }

    public List<int[]> getPermutations() {
        return permutations;
    }


}
