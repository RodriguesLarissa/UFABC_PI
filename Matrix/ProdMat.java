public class ProdMat{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dimensao, i, j, k;
        
        dimensao = scan.nextInt();
        int mat1[][]= new int[dimensao][dimensao];
        int mat2[][] = new int[dimensao][dimensao];
        
        for(i=0; i<dimensao; i++){
            for(j=0; j<dimensao; j++){
                mat1[i][j] = scan.nextInt();
            }
        }
        
        for(i=0; i<dimensao; i++){
            for(j=0; j<dimensao; j++){
                mat2[i][j] = scan.nextInt();
            }
        }
        
        int resultado[][] = Multiplica(mat1, mat2, dimensao);
        
        for(i=0; i<dimensao; i++){
            for(j=0; j<dimensao; j++){
                if(j!= dimensao-1){
                    System.out.print(resultado[i][j] + " ");
                }
                else{
                    System.out.println(resultado[i][j]);
                }
            }
        }
    }
    
    public static int[][] Multiplica(int mat1[][], int mat2[][], int tam){
        int i, j, k;
        
        int result[][] = new int[tam][tam];
        
        for(i=0; i<tam; i++){
            for(j=0; j<tam; j++){
                for(k=0; k<tam; k++){
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        
        return result;
    }
} 