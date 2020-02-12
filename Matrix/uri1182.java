public class uri1182{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int coluna, i, j;
        float soma=0;
        String operacao;
        float mat[][] = new float[12][12];
        
        coluna = scan.nextInt();
        operacao = scan.next();
        
        for(i=0; i<12; i++){
            for(j=0; j<12; j++){
                mat[i][j] = scan.nextFloat();
            }
        }
        
        for(i=0; i<12; i++){
            soma += mat[i][coluna];
        }
        
        if(operacao.equals("S")){
            System.out.printf("%.1f\n" ,soma);
        }
        else{
            System.out.printf("%.1f\n" ,soma/12);
        }
    }
}