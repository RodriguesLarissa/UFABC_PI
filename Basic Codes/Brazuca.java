public class Brazuca
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int diametro;
        int altura;
        int largura;
        int profundidade;
        
        diametro = scan.nextInt();
        altura = scan.nextInt();
        largura = scan.nextInt();
        profundidade = scan.nextInt();
        
        if(largura >= diametro && altura >= diametro && profundidade >= diametro)
        {
            System.out.println("S");
        }
        else
        {
            System.out.println("N");
        }
    }
}