class Ques9{

    public static void main(String args[]){

        byte b = 12;
        System.out.println("Byte Instance to Byte : "+((new Byte(b).byteValue())));
        System.out.println("Byte Instance to Integer : "+((new Byte(b).byteValue())));
        System.out.println("Byte Instance to Short : "+((new Byte(b).shortValue())));
        System.out.println("Byte Instance to Long : "+((new Byte(b).longValue())));
        System.out.println("Byte Instance to Float : "+((new Byte(b).floatValue())));
        System.out.println("Byte Instance to Double : "+((new Byte(b).doubleValue())));

    }
}