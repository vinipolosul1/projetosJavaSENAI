import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner valores = new Scanner(System.in);
        System.out
                .println(
                        "Selecione a atividade desejada: \n 1) Maior e menor valor \n 2) Dias da semana entre 1 e 7 \n 3) Maior e menor entre 3 \n 4) Mês do ano entre 1 e 12 \n 5) A mais dificil");
        int atividade = valores.nextInt();
        while (atividade < 1 || atividade > 5) {
            System.out.println("Insira um valor válido: ");
            atividade = valores.nextInt();
        }
        System.out.println(" \n \n ---------------------------- \n \n");
        switch (atividade) {
            case 1:
                System.out.println("Insira o primeiro valor: ");
                float valor1 = valores.nextFloat();
                System.out.println("Insira o segundo valor: ");
                float valor2 = valores.nextFloat();
                if (valor1 > valor2) {
                    System.out.println("O primeiro valor é maior");
                } else {
                    System.out.println("O segundo valor é maior");
                }
                break;
            case 2:
                System.out.println("insira um número entre 1 e 7 que corresponderá a um dia da semana: ");
                int dia = valores.nextInt();
                while (dia < 1 || dia > 7) {
                    System.out.println("Insira um valor de 1 a 7: ");
                    dia = valores.nextInt();
                }
                System.out.println(" \n \n ---------------------------- \n \n");
                switch (dia) {
                    case 1:
                        System.out.println("Segunda-feira");
                        break;
                    case 2:
                        System.out.println("Terça-feira");
                        break;
                    case 3:
                        System.out.println("Quarta-feira");
                        break;
                    case 4:
                        System.out.println("Quinta-feira");
                        break;
                    case 5:
                        System.out.println("Sexta-feira");
                        break;
                    case 6:
                        System.out.println("Sábado");
                        break;
                    case 7:
                        System.out.println("Domingo");
                        break;
                }
                break;
            case 3:
                System.out.println("Insira o primeiro valor: ");
                float numero1 = valores.nextFloat();
                System.out.println("Insira o segundo valor: ");
                float numero2 = valores.nextFloat();
                System.out.println("Insira o terceiro valor: ");
                float numero3 = valores.nextFloat();
                if (numero1 > numero2 && numero1 > numero3) {
                    System.out.println("O 1° valor é o maior ");

                }
                if (numero2 > numero1 && numero2 > numero3) {
                    System.out.println("O 2° valor é o maior ");

                }
                if (numero3 > numero2 && numero3 > numero1) {
                    System.out.println("O 3° valor é o maior ");

                }
                break;
            case 4:
                System.out.println("insira um número entre 1 e 12 que corresponderá a um mês do ano: ");
                int mes = valores.nextInt();
                while (mes < 1 || mes > 12) {
                    System.out.println("Insira um valor de 1 a 12: ");
                    mes = valores.nextInt();
                }
                System.out.println(" \n \n ---------------------------- \n \n");
                switch (mes) {
                    case 1:
                        System.out.println("Janeiro");
                        break;
                    case 2:
                        System.out.println("Fevereiro");
                        break;
                    case 3:
                        System.out.println("Março");
                        break;
                    case 4:
                        System.out.println("Abril");
                        break;
                    case 5:
                        System.out.println("Maio");
                        break;
                    case 6:
                        System.out.println("Junho");
                        break;
                    case 7:
                        System.out.println("Julho");
                        break;
                    case 8:
                        System.out.println("Agosto");
                        break;
                    case 9:
                        System.out.println("Setembro");
                        break;
                    case 10:
                        System.out.println("Outubro");
                        break;
                    case 11:
                        System.out.println("Novembro");
                        break;
                    case 12:
                        System.out.println("Dezembro");
                        break;
                }
                break;
            case 5:
                System.out.println("Insira o primeiro número: ");
                int num1 = valores.nextInt();
                System.out.println("Insira o segundo número: ");
                int num2 = valores.nextInt();

                if(num1 > num2){
                    int i=num1+1;
                    while (i > num2) {
                        i--;
                        System.out.println(i);
                        
                    }
                        
                    
                }else{
                    int i=num1-1;
                    while(i < num2) {
                        i++;
                        System.out.println(i);
                       
                    }
                      
                }

                break;
        }

        valores.close();

    }
}