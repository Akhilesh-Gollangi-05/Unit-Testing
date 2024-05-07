import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] input={'a','b','c','D','e'};
        convertToUppercase(input);
        System.out.println(Arrays.toString(input));
    }

    private static void convertToUppercase(char[] input) {
        for(int i = 0, e = input.length; i<e; ++i){
            if(Character.isLetter(input[i]) && Character.isLowerCase(input[i])) {
                input[i] = (char) (input[i] - 32);
            }
        }
    }
}



