public class uri1183{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int i, j, q=0;
        String operacao;
        float soma=0;
        float mat[][] = new float[12][12];

        operacao = scan.next();
        
        for(i=0; i<12; i++){
            for(j=0; j<12; j++){
                mat[i][j] = scan.nextFloat();
            }
        }
        
        for(i=0; i<12; i++){
            for(j=11; j>i; j--){
                soma += mat[i][j];
                q++;
            }
        }
        
        if(operacao.equals("S")){
            System.out.printf("%.1f\n",soma);
        }
        else{
            System.out.printf("%.1f\n",soma/q);
        }
        
    }
}