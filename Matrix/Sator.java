public class Sator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade =1, i, j;
        boolean sator = true;
        
        while(quantidade!= 0){
            quantidade = scan.nextInt();
            sator = true;
            if(quantidade == 0){
                break;
            }
            String mat[][] = new String[quantidade][quantidade];
        
            for(i=0; i<quantidade; i++){
                for(j=0; j<quantidade; j++){
                    mat[i][j] = scan.next();
                }
            }
            
            for(i=0; i<quantidade; i++){
                for(j=0; j<quantidade; j++){
                    if(!mat[i][j].equals(mat[j][i])){
                        sator = false;
                    }
                }
            }
            
            if(sator == true){
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }
        }
    }
}