public class TicTacToy
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, j, n;
        boolean x = false, y = false;
        
        quantidade = scan.nextInt();
        String jogo[][] = new String[3][3];
        
        for(n=0; n<quantidade; n++){
           
           x = false;
           y = false;
           
            for(i=0; i<3; i++){
                for(j=0; j<3; j++){
                    jogo[i][j] = scan.next();
                }
            }
            
            for(i=0; i<3; i++){
                if(jogo[i][0].equals(jogo[i][1]) && jogo[i][1].equals(jogo[i][2])){
                    if(jogo[i][0].equals("X")){
                        x = true;
                    }
                    else{
                        y = true;
                    }
                }
                else if(jogo[0][i].equals(jogo[1][i]) && jogo[1][i].equals(jogo[2][i])){
                    if(jogo[0][i].equals("X")){
                        x = true;
                    }
                    else{
                        y = true;
                    }
                }
                else if(jogo[0][0].equals(jogo[1][1]) && jogo[1][1].equals(jogo[2][2])){
                    if(jogo[0][0].equals("X")){
                        x = true;
                    }
                    else{
                        y = true;
                    }
                }
                else if(jogo[0][2].equals(jogo[1][1]) && jogo[1][1].equals(jogo[2][0])){
                    if(jogo[0][2].equals("X")){
                        x = true;
                    }
                    else{
                        y = true;
                    }
                }
            }
            
            if(x == true){
                System.out.println("o jogador X venceu");
            }
            else if(y == true){
                System.out.println("o jogador O venceu");
            }
            else{
                System.out.println("o jogo deu velha");
            }
        }
    }
}