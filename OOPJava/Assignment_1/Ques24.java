class Ques24{
    public static void main(String args[]){
        float f = 24.7f;
        System.out.println("Float to String : "+String.valueOf(f));
        
        System.out.println("Float to Float Instance : "+(new Float(f)));


        System.out.println("Float Instane to String Instance: "+(new Float(new String("123.6f"))));

        System.out.println("Float to HexString : "+Float.toHexString(f));
        
    }
}