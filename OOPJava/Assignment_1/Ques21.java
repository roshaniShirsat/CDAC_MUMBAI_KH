class Ques21{
    public static void main(String args[]){
        long l = 12345;
        System.out.println("Long Instance to Byte : "+((new Long(l)).byteValue()));
        System.out.println("Long Instance to short : "+((new Long(l)).shortValue()));
        System.out.println("Long Instance to int : "+((new Long(l)).intValue()));
        System.out.println("Long Instance to long : "+((new Long(l)).longValue()));
        System.out.println("Long Instance to float : "+((new Long(l)).floatValue()));
        System.out.println("Long Instance to double : "+((new Long(l)).doubleValue()));
    }
}