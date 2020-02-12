public class Regioes
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int cortes = 0;
        int cortes2 = 1;
        int cortes3;
        int regiao;
        
        cortes3 = scan.nextInt();
        
        while(cortes3 != 0)        
        {
            cortes = cortes + 1;
            cortes2 = cortes2 + cortes;
            cortes3 = cortes3 - 1;
        }

        System.out.println(cortes2);
    }
}