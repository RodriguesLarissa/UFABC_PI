public class CachorrosQuentes
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int H;
        int P;
        double Media;
        
        H = scan.nextInt();
        P = scan.nextInt();
        Media = ((H + 0.0)/(P + 0.0));
        
        System.out.println(String.format("%.2f", Media));
    }
}