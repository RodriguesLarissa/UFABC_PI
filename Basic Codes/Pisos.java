public class Pisos
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int comprimento;
        int largura;
        int piso1;
        int piso2;
        
        largura = scan.nextInt();
        comprimento = scan.nextInt();
        
        /* Piso 1 */
        
        piso1 = (comprimento*largura) + ((largura-1)*(comprimento-1));
        
        /* Piso 2 */
        
        piso2 = ((comprimento - 1) * 2) + ((largura-1) * 2);
        
        System.out.println(piso1);
        System.out.println(piso2);
    }
}