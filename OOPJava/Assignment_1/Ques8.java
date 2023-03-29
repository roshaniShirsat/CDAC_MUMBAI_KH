class Ques8{

    public static void main(String args[]){

        byte example = 101;
        String exampleString = Byte.toString(example);
        System.out.println("Byte to string : "+exampleString);

        Byte exampleInst = new Byte(example);
        System.out.println("Byte Instance : "+exampleInst);

        String strInst = new String("99");
        Byte byteInst = new Byte(strInst);
        System.out.println("String Instance to Byte Instance : "+byteInst);
    }
}