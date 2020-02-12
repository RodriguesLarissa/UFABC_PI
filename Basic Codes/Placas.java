public class Placas
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String placa1, placa2;
        int soma1=0, soma2=0, soma3=0, valor1=0, valor2=0, resposta = 0;
        
        placa1 = scan.next();
        placa2 = scan.next();
        
        soma1 += placa2.charAt(0) - placa1.charAt(0);
        soma2 += placa2.charAt(1) - placa1.charAt(1);
        soma3 += placa2.charAt(2) - placa1.charAt(2);
       
        valor1 = placa1.charAt(3)*1000 + placa1.charAt(4)*100 + placa1.charAt(5)*10 + placa1.charAt(6);
        valor2 = placa2.charAt(3)*1000 + placa2.charAt(4)*100 + placa2.charAt(5)*10 + placa2.charAt(6);
        
        if(valor1 == 53328 && valor2!=53328)
        {
            resposta = (valor2 - 1) - valor1;
        }
        else if(valor1 != 53328 && valor2==53328)
        {
            resposta = (valor1 -1) - valor2;
        }
        else if(valor1 <= valor2)
        {
            resposta = valor2 - valor1;
        }
        else
        {
            resposta = valor1 - valor2;
        }
        
        resposta = soma1*1000000 + soma2*100000 + soma3*10000 + resposta;
        
        System.out.println(resposta);
    }
}