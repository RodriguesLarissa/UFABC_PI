public class Conceito
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double nota;
        int falta;
        int faltaMax;
        
        nota = scan.nextDouble();
        falta = scan.nextInt();
        faltaMax = scan.nextInt();
        
        if(falta > faltaMax)
        {
            System.out.println("O");
        }
        else if(nota >= 8.5)
        {
            System.out.println("A");
        }
        else if(nota >= 7)
        {
            System.out.println("B");
        }
        else if(nota >= 6)
        {
            System.out.println("C");
        }
        else if(nota >= 5)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
        
    }
}