class Ques13{
    public static void main(String args[]){
        short s = 12;
        System.out.println("Short to String :"+Short.toString(s));

        Short sInst = new Short(s);
        System.out.println("Short to Short Instance "+sInst);

        String strInst = new String("12");
        Short shortInst = new Short(strInst);
        System.out.println("String Instance to Short Instance "+shortInst);
    }
}