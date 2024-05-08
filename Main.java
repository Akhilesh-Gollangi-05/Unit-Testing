public class Main  {
    public static void main(String[] args) {

        System.out.println(covertToUppercase("Hello World"));
        System.out.println(tc1SingleInputString());
        System.out.println(tc2String());
        System.out.println(tc3StringWithNumber());
        System.out.println(tc4StringWithSpecialCharacter());
        System.out.println(tc5EmptyString());
        System.out.println(tc6StringWithSpaces());
        System.out.println(tc7UpperCaseString());
        System.out.println(tc9StringWithNumberAndSpecialCharcters());
        System.out.println(tc8Null());

    }

    public static String covertToUppercase(String input) {
        char[] inputArray= input.toCharArray();
        for(int i=0,e=inputArray.length;i<e;++i){
            if(Character.isLetter(inputArray[i]) && Character.isLowerCase(inputArray[i])){
                inputArray[i]=(char)(inputArray[i]-32);
            }
        }
        return new String(inputArray);
    }
    public static boolean tc1SingleInputString(){
        String input="   a   ";
        String expected="   A   ";
        String result=covertToUppercase(input);
        return result.equals((expected));
    }

    public static  boolean tc2String(){
        String input="akhilesh";
        String expected="AKHILESH";
        String result=covertToUppercase(input);
        return result.equals(expected);
    }
    public static  boolean tc3StringWithNumber(){
        String input="akhilesh457";
        String expected="AKHILESH457";
        String result=covertToUppercase(input);
        return result.equals(expected);
    }
    public static  boolean tc4StringWithSpecialCharacter(){
        String input="akhilesh@@$#@!goll";
        String expected="AKHILESH@@$#@!GOLL";
        String result=covertToUppercase(input);
        return result.equals(expected);
    }
    public static  boolean tc5EmptyString(){
        String input="";
        String expected="";
        String result=covertToUppercase(input);
        return result.equals(expected);
    }
    public static  boolean tc6StringWithSpaces(){
        String input=" ";
        String expected=" ";
        String result=covertToUppercase(input);
        return result.equals(expected);
    }
    public static  boolean tc7UpperCaseString(){
        String input="AKHILESH";
        String expected="AKHILESH";
        String result=covertToUppercase(input);
        return result.equals(expected);
    }

    public static  boolean tc9StringWithNumberAndSpecialCharcters(){
        String input="123@#$@";
        String expected="123@#$@";
        String result=covertToUppercase(input);
        return result.equals(expected);
    }
    public static  boolean tc8Null(){
        String input=null;
        String expected=null;
        String result=covertToUppercase(input);
        return result.equals(expected);
    }
}


