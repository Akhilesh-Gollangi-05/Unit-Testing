import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        char[] input={'a','b','c','d','e'};
        convertToUppercase(input);
        System.out.println(Arrays.toString(input));
    }

    private static void convertToUppercase(char[] name) {
        for(int i = 0, e = name.length; i<e; ++i){
            if(Character.isLetter(name[i]) && Character.isLowerCase(name[i])) {
                name[i] = (char) (name[i] - 32);
            }
        }
    }
}

