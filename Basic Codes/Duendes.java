public class Duendes
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int minutosTotal;
        int minutosPresente1;
        int minutosPresente2;
        
        minutosTotal = scan.nextInt();
        minutosPresente1 = scan.nextInt();
        minutosPresente2 = scan.nextInt();
        
        if((minutosPresente1 + minutosPresente2) <= minutosTotal)
        {
            System.out.println("Farei hoje!");
        }
        else
        {
            System.out.println("Deixa para amanha!");
        }
        
    }
}