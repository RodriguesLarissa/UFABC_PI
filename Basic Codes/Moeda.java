public class Moeda
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int aposta;

        aposta = scan.nextInt();
        
        if((Math.random() < 0.5 && aposta < 0.5) || (Math.random() >= 0.5 && aposta >= 0.5))
        {
            System.out.println("ganhou");
        }
        else
        {
            System.out.println("perdeu");
        }
        
    }
}