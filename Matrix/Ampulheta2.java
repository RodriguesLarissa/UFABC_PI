public class Ampulheta2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int quantidade, i, j, soma=0;
        quantidade = scan.nextInt();
        int mat[][] = new int[quantidade][quantidade];
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        
        for(i=0; i<quantidade-2; i++){
            for(j=0; j<quantidade-2; j++){
                if((soma < mat[i][j] + mat[i][j+1] + mat[i][j+2] + mat[i+1][j+1] + mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]) || (i==0 && j==0))
                {
                     soma = mat[i][j] + mat[i][j+1] + mat[i][j+2] + mat[i+1][j+1] + mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];
                }
            }
        }
        
        System.out.println(soma);
    }
} 