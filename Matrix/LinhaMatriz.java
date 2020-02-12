public class LinhaMatriz{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int linha, i, j;
        String operacao;
        float soma=0;
        
        linha = scan.nextInt();
        operacao = scan.next();
        float mat[][] = new float[12][12];
        
        for(i=0; i<12; i++){
            for(j=0; j<12; j++){
                mat[i][j] = scan.nextFloat();
            }
        }
        
        for(i=0; i<12; i++){
            soma += mat[linha][i];
        }
        
        if(operacao.equals("S")){
            System.out.printf("%.1f\n", soma);
        }
        else{
            System.out.printf("%.1f\n", soma/12);
        }
    }
}