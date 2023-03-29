class Ques11{
    public static void main(String args[]){
        String str = args[0];
        char s = str.charAt(0);
        if(Character.isLetter(s)==true){
            System.out.println("It is Letter");
            if(Character.isUpperCase(s)==true) {
                System.out.println(s+ " in LowerCase : "+Character.toLowerCase(s));
                System.out.println("Code Point value of "+s+" is : "+str.codePointAt(0));
            }
            else if(Character.isLowerCase(s)==true) {
                System.out.println(s+ " in UpperCase : "+Character.toUpperCase(s));
                System.out.println("Code Point value of "+s+" is : "+str.codePointAt(0));
            }
        }
        else if(Character.isDigit(s)==true){
            System.out.println("It is Digit which is : "+s);
            System.out.println("Code Point value of "+s+" is : "+str.codePointAt(0));

        }
    }
}