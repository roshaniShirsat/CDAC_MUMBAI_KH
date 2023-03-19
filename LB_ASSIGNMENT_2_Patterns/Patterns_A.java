class Patterns_A
{

public static void main(String args[])
{
    //Pattern 1
    System.out.println("Pattern 1");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println();
    //Pattern 2
    System.out.println("Pattern 2");
    int alpha =65;
    for(int i=0;i<=4;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char)(alpha+j)+" ");
        }
        System.out.println();
    }  
    System.out.println();
     //Pattern 3
    System.out.println("Pattern 3");
    for(int i=0;i<=4;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
    //Pattern 4
    System.out.println("Pattern 4");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    System.out.println();
    //Pattern 5
    System.out.println("Pattern 5");
    // int alpha =65;
    for(int i=0;i<=4;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char)(alpha+i)+" ");
        }
        System.out.println();
    } 
    System.out.println();
    //Pattern 6
    System.out.println("Pattern 6");        
    for(int i=0;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print("  ");
        }
        for(int k=0;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
    
    //Pattern 7
    System.out.println("Pattern 7");
    for(int i=1;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 8
    System.out.println("Pattern 8");
    for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
    System.out.println();

    //Pattern 9
    System.out.println("Pattern 9");
    for(int i=0;i<=4;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print((char)(alpha+k)+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 10
    System.out.println("Pattern 10");
    for(int i=4;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++)
			{
				System.out.print((char)(alpha+k)+" ");
			}
			System.out.println();
		}
    System.out.println();

    //Pattern 11
    System.out.println("Pattern 11");        
    for(int i=0;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 12
    System.out.println("Pattern 12");
    for(int i=1;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 13
    System.out.println("Pattern 13");
    for(int i=0;i<=4;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print((char)(alpha+i)+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 14
    System.out.println("Pattern 14");
    for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 15
    System.out.println("Pattern 15");
    for(int i=1;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 16
    System.out.println("Pattern 16");
    for(int i=5;i>=1;i--)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 17
    System.out.println("Pattern 17");
    int num=1;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }
    System.out.println();

    //Pattern 18
    System.out.println("Pattern 18");
    for(int i=5;i>=0;i--)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print((char)(alpha+j)+" ");
        }
        System.out.println();
    }
    System.out.println();

}

}