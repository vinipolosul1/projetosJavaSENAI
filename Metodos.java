import java.util.Scanner;
public class App {
    public static void metodo1(){
        Scanner valores1 = new Scanner(System.in);
        System.out.println("Insira o usuario: ");
        String usuario = valores1.nextLine();
        System.out.println("Insira a senha: ");
        String senha = valores1.nextLine();
        if ((senha.equals("3456")) && (usuario.equals("carlinda"))) {
            System.out.println("Logado");
            
        }else{
            System.out.println("Usuario não autorizado");
        }
    }
    public static void metodo2(){
        Scanner valores1 = new Scanner(System.in);
        float[] notas = new float[4];
        float media = 0;
        for (int i = 0; i != 4; i++) {
            System.out.println("Insira a "+(i+1)+"° nota: ");
            notas[i] = valores1.nextFloat();
            media += notas[i];
        }
        System.out.println("A média final é: "+media/4);
        
    }
    public static void metodo3(){
        System.out.println("Seja bem vindo!");
    }
    public static void metodo4(){
        Scanner valores1 = new Scanner(System.in);

       
        System.out.println("Insira a distância: ");
       int distancia = valores1.nextInt();
       System.out.println("Insira a velocidade: ");
       int velocidade = valores1.nextInt();
        System.out.println("A velocidade média é: "+distancia/velocidade);
    }
    public static void main(String[] args){
        Scanner valores = new Scanner(System.in);
        System.out.println("Qual método vc deseja acessar? \n 1) 2) 3) 4)");
        int metodo = valores.nextInt();
        while (metodo < 1 || metodo >4) {
            System.out.println("Insira um valor válido");
            metodo = valores.nextInt();
        }
        switch (metodo) {
            case 1:
                metodo1();
                break;
            case 2:
                metodo2();
                break;
            case 3:
                metodo3();
                break;
            case 4:
                metodo4();
                break;
        }
        valores.close();
    }
   
}
