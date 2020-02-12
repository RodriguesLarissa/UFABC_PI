public class MaisMenos
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int A;
        int antes;
        int depois;
        
        A = scan.nextInt();
        
        antes = A-1;
        depois = A+1;
        
        System.out.println(antes + " " + depois);
    }
}