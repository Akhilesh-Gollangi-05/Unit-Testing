public class Main  {
    public static void main(String[] args) {
        String input="Hello World";
        System.out.println(covertToUppercase(input));
    }

    private static String covertToUppercase(String input) {
        char[] inputArray= input.toCharArray();
        for(int i=0,e=inputArray.length;i<e;++i){
            input ="";
            if(Character.isLetter(inputArray[i]) && Character.isLowerCase(inputArray[i])){
                inputArray[i]=(char)(inputArray[i]-32);
            }
        }
        String result =new String(inputArray);
        return result;
    }
}


