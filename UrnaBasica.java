import java.util.Scanner;

public class UrnaBasica {
    public static void main(String[] args) {

        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int voto0 = 0;
        int soma = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o voto: \n" + 
        "Digito 1 = candidato 1 \n" +
        "Digito 2 = candidato 2 \n" +
        "Digito 3 = candidato 3 \n" +
        "Digito 4 = voto nulo \n" +
        "Digito 0 = voto em branco \n");

        while(ler.hasNextInt()){
                                          
            switch (ler.nextInt()) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                case 4:
                    voto4++;
                    break;
                case 0:
                    voto0++;
                    break;
                default:
                    break;
            }
            System.out.println("Digite o voto: ");
        }

// colection stream
        if(voto1 > voto2 && voto1 > voto3)
            System.out.println("Candidato 1 é o vencedor");
        else if(voto2 > voto1 && voto2 > voto3)
            System.out.println("Candidato 2 é o vencedor");           
        else
            System.out.println("Candidato 3 é o vencedor");
            
        soma = voto1 + voto2 + voto3 + voto4 + voto0;

        System.out.println("Número de eleitores foi: " + soma);
        
    }

}
