public class DiagPrin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int i, j;
        int quantidade = scan.nextInt();
        int mat[][] = new int[quantidade][quantidade];
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        
        for(i=0; i<quantidade; i++){
            System.out.println(mat[i][i]);
        }
    }
}