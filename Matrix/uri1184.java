public class uri1184{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String operacao;
        float mat[][] = new float[12][12];
        int i, j;
        
        operacao = scan.next();
        
        for(i=0; i<12; i++){
            for(j=0; j<12; j++){
                mat[i][j] = scan.nextFloat();
            }
        }

        System.out.printf("%.1f\n" ,Operacao(mat, operacao));
    }
    
    public static float Operacao(float mat[][], String operacao){
        int i,j, n=0;
        float soma=0;
        
        for(i=0; i<12; i++){
            for(j=0; j<i; j++){
                soma += mat[i][j];
                n++;
            }
        }
        
        if(operacao.equals("S")){
            return soma;
        }
        else{
            return soma/n;
        }
    }
}