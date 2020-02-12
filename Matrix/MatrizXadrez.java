public class MatrizXadrez
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int coluna, linha, i, j;
        
        linha = scan.nextInt();
        coluna = scan.nextInt();
        
        int mat[][] = new int[linha][coluna];
        
        for(i=0; i<linha; i++){
            for(j=0; j<coluna; j++){
                if(((i%2 == 0) && (j%2 != 0)) || (i%2 != 0 && j%2 ==0))
                {
                    mat[i][j] = 1;
                }
                else
                {
                    mat[i][j] = 0;
                }
            }
        }
        
        for(i=0; i<linha; i++){
            for(j=0; j<coluna; j++){
                if(j<coluna-1){
                    System.out.print(mat[i][j] + " ");
                }
                else{
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}