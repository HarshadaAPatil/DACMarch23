/**
Accept character from command line and perform below 
operations. Here you can use charAt() method to extract 
character:
    a. Check whether entered character is letter or digit. If it is digit then print its values as 
        well as code point.
    b. If it is character then check whether it is in lowercase? If it is in lowercase then convert 
        it into upper case and print it well as its code point. If it is in uppercase then convert 
        it into lower case and print it well as its code point.
 */

class CommandLine{
    public static void main(String[] args){
        int code_point= args[0].codePointAt(0);
        char ch= args[0].charAt(0);
        //boolean flag=character.isDigit(ch);
        if(Character.isDigit(ch)){
            System.out.println("The entered character is a digit : "+ch);
            System.out.println("Code point is : "+code_point);
        }
        else if(Character.isLowerCase(ch)){
             System.out.println("The entered character is a digit : "+Character.toUpperCase(ch));
             System.out.println("Code point is : "+code_point);
        }
        else{
            System.out.println("The entered character is a digit : "+Character.toLowerCase(ch));
             System.out.println("Code point is : "+code_point);
        }
    }
}