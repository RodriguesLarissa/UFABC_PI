public class OrdemAltura
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double altura1, altura2, altura3, altura4;
        
        altura1 = scan.nextDouble();
        altura2 = scan.nextDouble();
        altura3 = scan.nextDouble();
        altura4 = scan.nextDouble();
        
        if((altura1>=altura2 && altura2 >= altura3 && altura3 >= altura4) || (altura4 >= altura3 && altura3 >= altura2 && altura2 >= altura1))
        {
            System.out.println("SIM");
        }
        else
        {
            System.out.println("NAO");
        }
    }
}