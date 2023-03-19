class Patterns_B
{

public static void main(String args[])
{

    //Pattern 1
    System.out.println("Pattern 1");
    for(int i=0;i<=4;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 2
    System.out.println("Pattern 2");  
        for(int i=0; i<5; i++)
         { 
            for(int j=5; j>=i; j--)
            {           
                System.out.print(" ");
            } 
            for(int k=0; k<=i; k++)
            {       
                System.out.print("*");
            }           
            System.out.println();
         }
    System.out.println();

    //Pattern 3
    System.out.println("Pattern 3"); 
        for(int i=0; i<=4; i++)
         { 
            for(int j=4; j>=i; j--) 
            {           
                System.out.print("*");
            }          
            System.out.println();
         }
    
     System.out.println();

    //Pattern 4
    System.out.println("Pattern 4");
    for(int i=0;i<=4;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(int k=4;k>=i;k--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 5
    System.out.println("Pattern 5");
    for(int i=5;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<5;k++)
			{
				System.out.print("*");
			}
            for(int l=4;l>i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
    System.out.println();

    //Pattern 6
    System.out.println("Pattern 6");
    for (int i=5; i>=1; i--)
    {
        for (int j=1; j<=(i * 2) -1; j++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int k=5; k>=i; k--)
        {
            System.out.print(" ");
        }
    }
    System.out.println();

    //Pattern 7
    System.out.println("Pattern 7");
    for (int m=1; m<=5; m++)
    {
        for (int n=5; n>m; n--)
        {
            System.out.print(" ");
        }
        for (int p=1; p<=(m * 2) -1; p++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
        for (int m=5-1; m>=1; m--)
        {
            for (int n=5-1; n>=m; n--)
            {
                System.out.print(" ");
            }
            for (int p=1; p<=(m * 2) -1; p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    //Pattern 8
    System.out.println("Pattern 8");
        for (int i=1; i<=5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=1; i<=5-1; i++) 
        {  
            for (int j = 5-1; j >= i; j--)
            {
                System.out.print("*");
            }
            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        System.out.println();

    //Pattern 9
    System.out.println("Pattern 9");
    for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5-1; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 5-1; k >= i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    //Pattern 10
    System.out.println("Pattern 10");
    for (int m = 1; m <= 5; m++)
    {
        for (int n = 5-1; n>=m; n--)
        {
            System.out.print(" ");
        }
        for (int p = 1; p <= 5; p++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
    
    //Pattern 11
    System.out.println("Pattern 11");
    for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i-1; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    //Pattern 12
    System.out.println("Pattern 12");

    for (int m = 5; m >= 1; m--)
    {
        for (int n = m; n >= 1; n--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int m = 2; m <= 5; m++)
    {
        for (int n = m; n >= 1; n--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 13
    System.out.println("Pattern 13");
    for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5-1; i >= 1; i--)
        {
            for (int j = 2; j <=i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    //Pattern 14
    System.out.println("Pattern 14");

    for (int m = 1; m <= 5; m++)
    {
        for (int n = 1; n < m; n++)
        {
            System.out.print(" ");
        }
        for (int p = m; p <= 5; p++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int m = 5-1; m >= 1; m--)
    {
        for (int n = 1; n < m; n++)
        {
            System.out.print(" ");
        }
        for (int p = m; p <= 5; p++)
        {
                System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 15
    System.out.println("Pattern 15");
        for (int m = 1; m <= 5; m++)
        {
            for (int n=1; n<=m; n++)
            {
                if( n == 1 || n == m || m == 5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    System.out.println();
    
    //Pattern 16
    System.out.println("Pattern 16");

    for (int i=1; i<=5; i++)
        {
            for (int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                if( k == 1 || k == i || i == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(); 
}
}