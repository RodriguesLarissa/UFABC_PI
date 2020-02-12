public class Sudoku{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int mat[][] = new int[9][9];
        int i, j;
        
        for(i=0; i<9; i++){
            for(j=0; j<9; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        
        System.out.println(valida_Sudoku(mat));
    }
    
    public static boolean valida_Sudoku(int mat[][]){
        int i, j, n, k, q, u=0;
        
        for(i=0; i<9; i++){
            for(j=0; j<9; j++){
                for(k=0; k<9; k++){
                    if((mat[i][j] == mat[i][k]) && (k !=j) || (mat[j][i] == mat[k][i]) && (j != k)){
                        return false;
                    }
                }
            }
        }
        
        for(q=1; q<=3; q++){
            u = (q-1)*3;
            for(i=0; i<3; i++){
                for(j=0+u; j<q*3; j++){
                    for(k=0; k<3; k++){
                        for(n=0+u; n<q*3; n++){
                            if(mat[i][j] == mat[k][n] && (i != k || j != n)){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        for(q=1; q<=3; q++){
            u = (q-1)*3;
            for(i=3; i<6; i++){
                for(j=0+u; j<q*3; j++){
                    for(k=3; k<6; k++){
                        for(n=0+u; n<q*3; n++){
                            if(mat[i][j] == mat[k][n] && (i != k || j != n)){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        for(q=1; q<=3; q++){
            u = (q-1)*3;
            for(i=6; i<9; i++){
                for(j=0+u; j<q*3; j++){
                    for(k=6; k<9; k++){
                        for(n=0+u; n<q*3; n++){
                            if(mat[i][j] == mat[k][n] && (i != k || j != n)){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        return true;
    }
}