
import java.util.Scanner;


public class Ejercicio_11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase a codificar: ");
        frase = input.nextLine();
        
        String retorno = cambioVocal(frase);
        
        System.out.println("La frase cambiada es: " + retorno);
        
        
    }
    
    public static String cambioVocal(String frase) {
        
        char[] characters = frase.toCharArray();
        
        for (int i = 0; i < characters.length; i++){
            switch (characters[i]){
                case 'a':
                    characters[i] = '@';
                    break;
                case 'e':
                    characters[i] = '#';
                    break;
                case 'i':
                    characters[i] = '$';
                    break;
                case 'o':
                    characters[i] = '%';
                    break;
                case 'u':
                    characters[i] = '*';
                    break;  
            }
        }
        
        return String.valueOf(characters);
        
    }
    
}
