import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] name={'a','b','c','d'};
        for(int i=0,e=name.length;i<e;++i){
            if(Character.isLetter(name[i]) && Character.isLowerCase(name[i])) {
                name[i] = (char) (name[i] - 32);
            }
        }
        System.out.println(Arrays.toString(name));

    }
}



