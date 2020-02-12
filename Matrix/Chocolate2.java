public class Chocolate2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int linha, coluna, i, j, dia, mes, soma=0, n, k;
        
        linha = scan.nextInt();
        coluna = scan.nextInt();
        
        int mat[][] = new int[linha][coluna];
        
        for(i=0; i<linha; i++){
            for(j=0; j<coluna; j++){
                mat[i][j] = scan.nextInt();            
            }
        }
        
        dia = scan.nextInt();
        mes = scan.nextInt();
        
        //soma linha
        for(i=0; i<linha; i++){
            for(j=0; j<coluna; j++){
                for(k=1; k<mes; k++){
                    n = 0;
                    if(j+k<coluna){
                        if(mat[i][j+n] + mat[i][j+k] == dia){
                            soma += 1;
                        }
                    }
                    n++;
                }
            }
        }
        
        //soma coluna
        for(i=0; i<linha; i++){
            for(j=0; j<coluna; j++){
                for(k=1; k<mes; k++){
                    n = 0;
                    if(i+k<linha){
                        if(mat[i+n][j] + mat[i+k][j] == dia){
                            soma += 1;
                        }
                    }
                    n++;
                }
            }
        }
        
        System.out.println(soma);
    }
}