public class Triangulo4
{
    public static void main(String[] args)
    {
        double angulo1, angulo2, angulo3;
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext())
        {
            angulo1 = scan.nextDouble();
            angulo2 = scan.nextDouble();
        
            angulo3 = 180 - (angulo1 + angulo2);
        
            if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90)
            {
                System.out.println("retangulo");
            }
            else if(angulo1 < 90 && angulo2 < 90 && angulo3 < 90)
            {
                System.out.println("acutangulo");
            }
            else
            {
                System.out.println("obtusangulo");
            }
        
        }
    }
}