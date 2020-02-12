public class DiagSec
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int quantidade = scan.nextInt();
        int mat[][] = new int[quantidade][quantidade];
        int i,j;
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        j =0;
        for(i=quantidade-1; i>= 0; i--){
            System.out.println(mat[j][i]);
            j++;
        }
    }
}