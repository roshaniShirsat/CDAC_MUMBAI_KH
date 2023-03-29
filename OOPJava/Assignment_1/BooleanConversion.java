class BooleanConversion{
    public static void main(String args[]){
         
        boolean example = false;
        String exampleString = Boolean.toString(example);   //converting boolean to string
        System.out.println("Boolean to String :"+exampleString);
        
        Boolean booleanInstance = new Boolean(example); //converting boolean to boolean instance
        System.out.println("Boolean to Boolean Instance :"+booleanInstance);

        String example1 = "true";
        Boolean example1Boolean = Boolean.valueOf(example1);    //converting string to boolean
        System.out.println("String to Boolean :"+example1Boolean);

        Boolean strBooleanInst = new Boolean(example1); //converting string to boolean instance
        System.out.println("String to Boolean Instance :"+strBooleanInst);

    }
}