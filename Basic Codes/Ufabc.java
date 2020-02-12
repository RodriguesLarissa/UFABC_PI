public class Ufabc
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String conceitoInicial;
        
        conceitoInicial = scan.next();
        
        if(conceitoInicial.equals("A"))
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("A");
        }
    }
}