public class Lua
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int noiteUm;
        int noiteDois;
        
        noiteUm = scan.nextInt();
        noiteDois = scan.nextInt();
        
        if(noiteDois <= 2)
        {
            System.out.println("Nova");
        }
        else if(noiteDois>=97)
        {
            System.out.println("Cheia");
        }
        else
        {
           if(noiteUm > noiteDois)
           {
               System.out.println("Minguante");
           }
           else
           {
               System.out.println("Crescente");
           }
        }
    }
}