public class SomaMat
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int quantidade = scan.nextInt();
        int mat1[][] = new int[quantidade][quantidade];
        int mat2[][] = new int[quantidade][quantidade];
        int matsoma[][] = new int[quantidade][quantidade];
        int i,j;
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                mat1[i][j] = scan.nextInt();
            }
        }
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                mat2[i][j] = scan.nextInt();
            }
        }
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                if(j<quantidade-1){
                    System.out.print((matsoma[i][j] = mat1[i][j] + mat2[i][j]) + " ");
                }
                else{
                    System.out.println(matsoma[i][j] = mat1[i][j] + mat2[i][j]);
                }
            }
        }
    }
}