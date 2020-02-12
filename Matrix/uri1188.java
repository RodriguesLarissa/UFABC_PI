public class uri1188{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String operacao;
        int i,j;
        float mat[][] = new float[12][12];
        
        operacao = scan.next();
        
        for(i=0; i<12; i++){
            for(j=0; j<12; j++){
                mat[i][j] = scan.nextFloat();
            }
        }
        
        System.out.printf("%.1f\n", Conta(mat, operacao));
    }
    
    public static float Conta(float mat[][], String operacao){
        int i, j, q=0;
        float soma = 0;
        
        for(i=0; i<12; i++){
            for(j=11; i+j > 11 ; j--){
                if(i>j){
                    soma += mat[i][j];
                    q++;
                }
            }
        }
        
        if(operacao.equals("S")){
            return soma;
        }
        else{
            return soma/q;
        }
    }
}