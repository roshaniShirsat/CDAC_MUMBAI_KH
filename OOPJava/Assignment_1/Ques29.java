class Ques29{
    public static void main(String args[]){
        double d = 1234.56;
        System.out.println("Double Instance to Byte : "+((new Double(d)).byteValue()));
        System.out.println("Double Instance to Short : "+((new Double(d)).shortValue()));
        System.out.println("Double Instance to Int : "+((new Double(d)).intValue()));
        System.out.println("Double Instance to Long : "+((new Double(d)).longValue()));
        System.out.println("Double Instance to Float : "+((new Double(d)).floatValue()));
        System.out.println("Double Instance to Double : "+((new Double(d)).doubleValue()));
    }
}