class Ques16{
    public static void main(String args[]){
        int i = 59;
        System.out.println("Integer to String : "+String.valueOf(i));

        System.out.println("Integer to String : "+(new Integer(i)));

        System.out.println("Integer to String : "+(new Integer(new String("145"))));

        System.out.println("Integer to String : "+Integer.toBinaryString(i));
        System.out.println("Integer to String : "+Integer.toOctalString(i));
        System.out.println("Integer to String : "+Integer.toHexString(i));
    }
}