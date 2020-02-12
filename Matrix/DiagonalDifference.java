public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int quantidade = scan.nextInt();
        int mat[][] = new int[quantidade][quantidade];
        int i,j, soma1=0, soma2=0;
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        
        for(i=0; i<quantidade; i++){
            soma1 += mat[i][i];
        }
        
        j=0;
        for(i=quantidade-1; i>=0; i--){
            soma2 += mat[j][i];
            j++;
        }
        
        if(soma1 > soma2)
        {
            System.out.println(soma1-soma2);
        }
        else
        {
            System.out.println(soma2-soma1);
        }
    }
}