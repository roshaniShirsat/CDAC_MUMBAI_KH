class Ques33{
    public static void main(String args[]){
        int i = Integer.parseInt(args[0]);
        float f = Float.parseFloat(args[1]);
        double d = Double.parseDouble(args[2]);
        // char c = Character.parseCharacter(args[3]);
        double result=0;
        switch(args[3].charAt(0)){
            case '+':
            result = i + f;
            break;
            case '-':
            result = i - f;
            break;
            case '*':
            result=i*f;
            break;
            case '/':
            result = i/f;
            break;
            default:
            System.out.println("Invalid Opersator!!");
            break;
        }
        System.out.println("Result : "+result);
    }
}