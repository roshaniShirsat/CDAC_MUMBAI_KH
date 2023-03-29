class Ques28{
    public static void main(String args[]){
        double d = 12.67;
        System.out.println("Double to String : "+String.valueOf(d));

        System.out.println("Double to Double Instance : "+(new Double(d)));

        System.out.println("Double to Double Instance : "+(new Double(new String("123.789"))));

        System.out.println("Double to Double Instance : "+Double.toHexString(d));

        System.out.println("Double to Double Instance : "+(Long.toBinaryString(Double.doubleToLongBits(d))));

        System.out.println("Double to Double Instance : "+(Long.toHexString(Double.doubleToLongBits(d))));
    }

}
