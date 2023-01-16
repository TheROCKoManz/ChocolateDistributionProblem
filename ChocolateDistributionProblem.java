import java.io.DataInputStream;
import java.io.IOException;

public class ChocolateDistributionProblem
{
    public static void main(String[] args) throws IOException
    {
        DataInputStream inp = new DataInputStream(System.in);
        System.out.print("Enter no of Packs N: ");
        int N= Integer.parseInt(inp.readLine());

        System.out.println("Enter no of Chocolates in each packs: ");
        int choco[] = new int[N+1];
        for(int i=0; i<N; i++)
            choco[i]=Integer.parseInt(inp.readLine());

        System.out.print("Enter no of Students M: ");
        int M= Integer.parseInt(inp.readLine());

        for(int i=0; i<N-1; i++)
            for(int j=i+1;j<N;j++)
                if(choco[i]>choco[j])
                {
                    int temp = choco[i];
                    choco[i] = choco[j];
                    choco[j] = temp;
                }

        System.out.println("Min Diff: "+(choco[M-1]-choco[0]));
    }
}
