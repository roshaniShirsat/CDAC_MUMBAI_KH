class Ques14{
    public static void main(String args[]){
        short shr = 12;
        Short s = new Short(shr);
        System.out.println("Short Instance to Byte : "+s.byteValue());
        System.out.println("Short Instance to Short : "+s.shortValue());
        System.out.println("Short Instance to Integer : "+s.intValue());
        System.out.println("Short Instance to Long : "+s.longValue());
        System.out.println("Short Instance to Float : "+s.floatValue());
        System.out.println("Short Instance to Double : "+s.doubleValue());
    }
}