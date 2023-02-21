//Write a Program in java to print the following patterns using for loops?
public class pattern_a {
    public static void main(String[] args) {
        int k=0,jump=4;
        for(int i=0;i<4;i++)
        {
            k=i;
            int c=0;
            for(int j=0;j<9;j++)
            {
                if(j==k)
                {
                    System.out.print(" * ");
                    k=k+jump;
                    c=c+1;
                }
                else if(c==3)
                {
                    System.out.print(" 0 ");
                }
                else
                    System.out.print(" 0 ");
            }
            jump--;
            System.out.print("\n");
        }

    }
}
