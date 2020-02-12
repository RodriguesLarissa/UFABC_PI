public class Triangulo2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double anguloA, anguloB, anguloC;
        
        anguloA = scan.nextDouble();
        anguloB = scan.nextDouble();
        
        anguloC = 180 - anguloA - anguloB;
        
        if(anguloC == 90 || anguloA == 90 || anguloB == 90)
        {
            System.out.println("retangulo");
        }
        else if(anguloC < 90 && anguloB < 90 && anguloA < 90)
        {
            System.out.println("acutangulo");
        }
        else
        {
            System.out.println("obtusangulo");    
        }
        
    }
}