class Ques25{
public static void main(String args[]){
    Float f = 123.6f;
    System.out.println("Float Instance to byte : "+((new Float(f)).byteValue()));
    System.out.println("Float Instance to short : "+((new Float(f)).shortValue()));
    System.out.println("Float Instance to int : "+((new Float(f)).intValue()));
    System.out.println("Float Instance to long : "+((new Float(f)).longValue()));
    System.out.println("Float Instance to float : "+((new Float(f)).floatValue()));
    System.out.println("Float Instance to double : "+((new Float(f)).doubleValue()));
}
}