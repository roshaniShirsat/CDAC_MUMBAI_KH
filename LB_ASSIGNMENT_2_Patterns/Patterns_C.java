class Patterns_C
{
    public static void main(String args[])
    {

        //Pyramid Pattern-1
        System.out.println("Pyramid Pattern-1");
        for(int i=1;i<=9;i++)
        {
            for(int j=9;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Pyramid Pattern-2
        System.out.println("Pyramid Pattern-2");
        for(int i=1;i<=9;i++)
        {
            for(int j=9;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Pyramid Pattern-3
        System.out.println("Pyramid Pattern-3");
        for(int i=1;i<=9;i++)
        {
            for(int j=9;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Pyramid Pattern-4
        System.out.println("Pyramid Pattern-4");
        int rowCount = 1;  
   
        for (int i = 9; i > 0; i--)  
        {  
            for (int j = 1; j <= i*2; j++)  
            {  
                System.out.print(" ");  
            }  
            for (int j = 1; j <= rowCount; j++)            
            {  
                System.out.print(j+" ");  
            }    
            for (int j = rowCount-1; j >= 1; j--)  
            {                 
                System.out.print(j+" ");              
            }                         
               
            System.out.println();  
            rowCount++;  
        } 
        System.out.println(); 

        //Pyramid Pattern-5
        System.out.println("Pyramid Pattern-5");
        for (int i = 9; i >= 1; i--)  
        {  
            for (int j = 1; j <= i*2; j++)  
            {  
                System.out.print(" ");  
            } 
            for (int j = i; j <= 9; j++)            
            {  
                System.out.print(j+" ");  
            }    
            for (int j = 9-1; j >= i; j--)  
            {                 
                System.out.print(j+" ");              
            }  
               
            System.out.println();  
            rowCount++;  
        } 
        System.out.println(); 

        //Inverted Pyramid Pattern-6
        System.out.println("Inverted Pyramid Pattern-6"); 
        for(int i=9;i>=1;i--)
        {
            for(int j=i;j<=9;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted Pyramid Pattern-7
        System.out.println("Inverted Pyramid Pattern-7");
        for(int i=9;i>=1;i--)
        {
            for(int j=i;j<=9;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Half Pyramid
        System.out.println("Half Pyramid");
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted Half Pyramid
        System.out.println("Inverted Half Pyramid"); 
        for(int i=0; i<=4; i++)
        { 
            for(int j=4; j>=i; j--) 
            {           
                System.out.print("* ");
            }          
            System.out.println();
        }
        System.out.println();

        //Hollow Inverted Half Pyramid
        System.out.println("Hollow Inverted Half Pyramid"); 
        for (int i=1; i<=6; i++)
        {
            for (int j=6; j >=i; j--)
            {
                if( i == 1 || j == i || j == 6)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int k=1; k<i; k++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        //Full Pyramid
        System.out.println("Full Pyramid");
        for(int i=1;i<=6;i++)
        {
            for(int j=6;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted Full Pyramid
        System.out.println("Inverted Full Pyramid"); 
        for(int i=6;i>=1;i--)
        {
            for(int j=i;j<=6;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Hollow Full Pyramid
        System.out.println("Hollow Full Pyramid");
        for (int i=1; i<=6; i++)
        {
            for (int j=6; j>i; j--)
            {
                System.out.print("  ");
            }
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 || i == 6)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}