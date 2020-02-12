public class ConvTemperatura
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double temperaturaC;
        double temperaturaK;
        double temperaturaF;
        double temperaturaRk;
        double temperaturaRm;
        double temperaturaRo;
        double temperaturaD;
        
        temperaturaC = scan.nextDouble();
        
        temperaturaK = temperaturaC + 273.15;
        temperaturaF = (temperaturaC*9/5) + 32;
        temperaturaRk = ((temperaturaC+273.15)*9/5);
        temperaturaRm = (temperaturaC * 4/5);
        temperaturaRo = ((temperaturaC*21/40)+7.5);
        temperaturaD = ((100 - temperaturaC)*3/2);
        
        System.out.println(new DecimalFormat("0.0").format(temperaturaK));
        System.out.println(new DecimalFormat("0.0").format(temperaturaF));
        System.out.println(new DecimalFormat("0.0").format(temperaturaRk));
        System.out.println(new DecimalFormat("0.0").format(temperaturaRm));
        System.out.println(new DecimalFormat("0.0").format(temperaturaRo));
        System.out.println(new DecimalFormat("0.0").format(temperaturaD));

        
    }
}