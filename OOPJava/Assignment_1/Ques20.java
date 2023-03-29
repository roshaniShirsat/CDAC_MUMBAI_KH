class Ques20{
    public static void main(String args[]){
        long l = 1234;

        System.out.println("Long to String : "+String.valueOf(l));

        System.out.println("Long to String : "+(new Long(l)));

        String s = new String("12345678");
        System.out.println("String Instance to Long Instance : "+(new Long(s)));

        System.out.println("Long to Binary String : "+Long.toBinaryString(l));
        System.out.println("Long to Ocatl String : "+Long.toOctalString(l));
        System.out.println("Long to Hex String : "+Long.toHexString(l));



        
    }
}