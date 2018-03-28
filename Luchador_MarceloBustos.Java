/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_luchador;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;


/**
 *
 * @author marclo
 */

//This is an incomplete program, as such, it has various place-holders that do nothing other than presenting a message.

//These place-holders will eventually be replaced with functioning lines of code.

//Because I am still learning, some parts of the program are made with non optimal code, these sectiosn will eventually be replaced
//as I gain more knowledge and experience.

//Porque no puedo dejar de cambiar de un idioma al otro mientras programo, algunas partes del programa se presentan en Inglés y 
//otras en Español.

//WARNING

//This program keeps track of how many times you try to use a non-exiting command (or you simply make a mistake)
//do this too many times and the program WILL CLOSE itself. This IS INTENTIONAL.
public class Luchador_MarceloBustos {

    /**
     * @param args the command line arguments
     */
    
    //método para crear e interactuar con el menu
    public static void menu(int checker, Luchador[] list, int numList, int[] inventory){
         
     System.out.println();
     
     System.out.println();
     
    
    if(checker < 4){
     System.out.println("Welcome to Monster Slayer. ¿What is your command? ");
     
     System.out.println("1) Check Fighters.");
     
     System.out.println("2) Check Inventory.");
     
     System.out.println("3) Create Fighter.");
     
     System.out.println("4) FIGHT!!!!!!!");
     
     System.out.println("5) Wuss out(leave).");
     
     System.out.println();
     
     System.out.println();
     
     respuestaMenu(checker, list, numList, inventory);
        
       }
    else {
    
        System.out.println("THAT'S IT. I'M OUT.");
        
        System.out.println();
                        
        System.out.println();
        
        System.out.println("You pissed off a battle game and made it close itself.");
        
        System.out.println();
                        
        System.out.println("Are you proud of that?");
        
    }
    
     }
     
    //método que lee la respuesta al menú y llama al método correspondiente para la acción seleccionada
    public static void respuestaMenu(int checker, Luchador[] list, int numList, int[] inventory){
    
            int numero;
     
            Scanner scan = new Scanner(System.in);
     
            numero = scan.nextInt();
        
            switch (numero) {
            
                case 1: mostrarListaLuchadores(list, numList, inventory);
            
                    menu(checker, list, numList,inventory);
                    break;
                
                case 2: verInventario(inventory);
            
                    menu(checker, list, numList,inventory);
                 break;
                
                case 3: crearLuchador (list ,numList);
                    
                    numList ++;
                
                    menu(checker, list, numList,inventory);
                    break;
                
                case 4:fight(inventory);
            
                    menu(checker, list, numList,inventory);
                    break;
                
                case 5: System.out.println("You COWARD. Come back when you find your courage.");
                    break;
                
                default: 
                    switch (checker) {
                        
                        case 0:
                            
                        System.out.println(); 
                        
                        System.out.println();
                            
                        System.out.println("How about you stick to the AVAILABLE comamands?");
                        
                        System.out.println();
                        
                        System.out.println();
                        break;
                        
                    case 1:
                        
                        System.out.println();
                        
                        System.out.println();
                        
                        System.out.println("I'm warning you.");
                        
                        System.out.println();
                        
                        System.out.println();
                        break;
                      
                    case 2:
                        
                        System.out.println();
                        
                        System.out.println();
                        
                        System.out.println("Last chance wise guy.");
                        
                        System.out.println();
                        
                        System.out.println();
                        break;
                        
                    default:
                        break;
            }
                    
                    checker ++;
                
                    menu(checker, list, numList,inventory);
                    break;
            }
        }

    //método para mostrar la lista de Luchadores
    public static void mostrarListaLuchadores(Luchador list[] ,int numList, int[] inventory){
        
        
        //este método muestra a todos ls Luchadores que posee el jugador con sus resectivas estadísticas y objetos
        
        //de no tener Luchadores, el método despliega un mensaje indicándoselo al usuario
          
           System.out.println();
           
           System.out.println();
          
           System.out.println();
           
           if (numList == 0){
           
               System.out.println("You have no fighters.");
               
           }
           
           else{
           System.out.println("Start of Fighter list");
              
           System.out.println();
              
           System.out.println();
              
           System.out.println();
          
          if (numList < 25){
          
              for (int i=0; i < numList; i++){
              
                  mostarLuchador(list [i]);
              
                }
            }
          
          else{
              
              for (int i=0; i < 25; i++){
              
                  mostarLuchador(list [i]);
                }
            }
          
           System.out.println();
              
           System.out.println();
              
           System.out.println();
              
           System.out.println("End of Fighter list");
          
           equipItemsAsk(list, inventory);
           
           }
      }
     
    //método para mostrar el inventario
    public static void verInventario(int[] inventory){
        
        //este método muestra todos los objetos que el usuario posee en su inventario
        
        //si el espacio de inventario está vacío, se muestra "espacio disponible" en lugar del nombre del objeto
        
        System.out.println();
        
        System.out.println();
        
        System.out.println("Inventory start.");
        
        System.out.println();
        
        System.out.println();
     
            for(int i = 0; i < 10; i++){
                
                mostrarItem(inventory[i]);
            
            }
            
        System.out.println();
        
        System.out.println();
        
        System.out.println("Inventory end"); 
        
        System.out.println();
        
        System.out.println();
        
     }
    
    //método para crear un luchador de manera aleatoria 
    public static void crearLuchador(Luchador list[], int numList){
        
        //este método crea un nuevo Luchador y muetsra sus estadísticas por pantalla
        
        if (numList < 25){
        
          list [numList] = new Luchador();
         
            if(numList > 0){
          
            checkName(list, numList);
          
            }
          
          System.out.println("Your new Fighter is: "); 
         
          mostarLuchador(list[numList]);
          
        }
    
        else{
            
        System.out.println("You cannot have any more fighters.");
        
        }
     }

    //método para pelear contra un monstruo (actualmente solo despliega un mensaje)
    public static void fight(int[] inventory){
        
    //This is a place-holder
     System.out.println("This function is under development.");
     
     System.out.println("");
     
     System.out.println("");
     
     System.out.println("Here, have a free Item.");
     
     int newItem = createItem();
     
     
         
     }
    
    //creación de la clase "Luchador"
    public static class Luchador{
        
        //inicialización de los atributos de la clase Luchador
        private String Name;
        private String Type;
        private int HP;
        private int ATK;
        private int DEF;
        private int SPD;
        private int RANK;
        int ITEM;
   
        //para asignar los valores correspondienes a un Luchador
        public Luchador(){
            
            Name = darName();
            
            RANK = darRANK();

            HP = darHP() * RANK;
            
            ATK = darATK() * RANK;
        
            DEF = darDEF() * RANK;
        
            SPD = darSPD() * RANK;
        
            Type = darType();
            
            ITEM = 0;
        }
        
    }
  
    //método para asignarle un nombre a un Luchador
    public static String darName(){
    
        //este método selciona uno de los 26 nombres disponibles y  se lo aigna al Luchador
        
        int randomNum = ThreadLocalRandom.current().nextInt(1, 25 + 1);
        
        String nombre = "Insert Name";
        
        switch (randomNum) {
            
            case 1: nombre = "Jack";
                break;
                
            case 2: nombre = "Jill";
                break;
                
            case 3: nombre = "Peter";
                break;
                
            case 4: nombre = "Ayla";
                break;
                
            case 5: nombre = "Kirtash";
                break;
                
            case 6: nombre = "Lucy";
                break;
                
            case 7: nombre = "Mordecai";
                break;
            
            case 8: nombre = "Leliana";
                break; 
                
            case 9: nombre = "David";
                break; 
                
            case 10: nombre = "Lethaline";
                break; 
                
            case 11: nombre = "Asmodeus";
                break; 
                
            case 12: nombre = "Lilith";
                break; 
                
            case 13: nombre = "Marcus";
                break;
                
            case 14: nombre = "Morgana";
                break; 
                
            case 15: nombre = "Frederick";
                break; 
            
            case 16: nombre = "Krysta";
                break;
               
            case 17: nombre = "Kaiser";
                break;
                
            case 18: nombre = "Echo";
                break;
                
             case 19: nombre = "Zack";
                break;
                
            case 20: nombre = "Susan";
            break;
            
            case 21: nombre = "Hector";
             break;
            
            case 22: nombre = "Chain";
                break;
            
            case 23: nombre = "Soul";
                break;
            
            case 24: nombre = "Memphis";
                break;
            
            case 25: nombre = "Leroy";
                break;
                
            case 26: nombre = "Hana";
                break;
        }
   
        return nombre;
    }
    
    //método para revisar los nombres de los luchadroes y así evitar la repetición de nombres
    public static void checkName(Luchador[] list, int numList){
        
        //este método revisa el nombre del último Luchador creado y lo compara con todos los Luchadores creados anteriormente
        
        //si el nombre se del Luchador nuevo ya está en uso, invoca al método "darName", asigna uno nuevo y luego lo compara con los nombres de
        
        //los luchadores creado hasta que al nuevo Luchador se le aigne un nombre que no esté repetido
        
        int i = numList;
        
        while (i >= 0){
        
            if(list[numList].Name. equals (list[i].Name)){
            
                list[numList].Name = darName();
                
                i = numList;
                
            }
            
            i--;
            
        }
        
    }
    
    //método para asignar una facción a un Luchador
    public static String darType(){
        
       int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        
        String Tipo = "Insert Type";
        
            switch (randomNum) {
            
            case 1: Tipo = "Fire";
                break;
                
            case 2: Tipo = "Water";
                break;
                
            case 3: Tipo = "Earth";
                break;
            }
    
            
        return Tipo;
    }
    
    //método para asignar la HP de un Luchador
    public static int darHP(){        
           
           int randomNum = ThreadLocalRandom.current().nextInt(200, 500 + 1);
           
           int HP = randomNum;
           
           return HP;
    }
    
    //método para asignar el ATK de un Luchador
    public static int darATK(){
    
           int randomNum = ThreadLocalRandom.current().nextInt(20, 70 + 1);
                
           int ATK = randomNum;
           
           return ATK;
    }
     
    //método para asignar la DEF de un Luchador
    public static int darDEF(){
    
          int randomNum = ThreadLocalRandom.current().nextInt(5, 25 + 1);
                
          int DEF = randomNum;
           
          return DEF;
    }
     
    //método para asignar la SPD de un Luchador
    public static int darSPD(){
    
           int randomNum = ThreadLocalRandom.current().nextInt(10, 100 + 1);
                
           int SPD = randomNum;
           
           return SPD;
    }
     
    //método para asignar las estrellas de un Luchador
    public static int darRANK(){
         
           int RANK = 1;
    
           int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
                
           if (randomNum > 95){
           
               RANK = 5;
           }
           
           else{
               
               if (randomNum > 85){
               
                   RANK = 4;
                   
                 }
               
                    else{
                   
                        if(randomNum > 70){
                   
                        RANK = 3;                       
                       
                        }
                     
                        else{
                        
                            if(randomNum > 40){
                        
                                RANK = 2;
                            }
                            
                        }
               
               }
               
     
            }
           
           
           return RANK;
    }

    //método para mostrar un Luchador
    public static void mostarLuchador(Luchador luchador) {
          
        //este método muestra todas als estadíticas de un Luchador
        
        System.out.println();
        
        System.out.println();
        
        System.out.println("Name: "+ luchador.Name );
        
        System.out.println("Tipo: "+ luchador.Type );
        
        System.out.println("HP: " + luchador.HP );
        
        System.out.println("ATK: " + luchador.ATK );
         
        System.out.println("DEF: " + luchador.DEF);
        
        System.out.println("SPD: " + luchador.SPD);
        
        System.out.println("RANK: " + luchador.RANK);
        
        mostrarItem(luchador.ITEM);
   }
     
    //método para mostrar un objeto
    public static void mostrarItem(int item){
          
        //este método  muestra el nombre del objeto seleccionado
        
        //este método es llamado tanto como para mostrar elinventario, como para mostrar las estadísticas del Luchador
        
          String objeto = "Free ITEM slot.";
          
          switch (item) {
            
            case 1: objeto = "Shield";
                break;
                
            case 2: objeto = "Swift Boots";
                break;
                
            case 3: objeto = "Cloak";
                break;
            }
          
          System.out.println(objeto);
          
      }
      
    //método para preguntarle al usuario si desea equipar un objeto a un Luchador (actualmente en desarrollo)
    public static void equipItemsAsk(Luchador[] luchador, int[] inventory){
        
        //de momento, este método presenta place-holders, pero su función futura será preguntarle al usario si desea o no equipar un objeto a un Luchador
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("Do you wish to equip items?");
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("1) Yes.");
        
        System.out.println("");
        
        System.out.println("2) No.");
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("3) I'd rather destroy one.");
        
        System.out.println("");
        
        System.out.println("");
        
        int numero;
     
        Scanner scan = new Scanner(System.in);
     
        numero = scan.nextInt();
      
        switch(numero){
    
        case 1:  System.out.println("This function is under development.");
        
                 System.out.println("");
                
                 System.out.println("");
            break;
    
        case 2: System.out.println("OK, let's just leave them there, gathering dust.");
        
                System.out.println("");
                
                System.out.println("");
            break;
    
        case 3: System.out.println("Are you sure about that?");    
         
                System.out.println("");
                
                System.out.println("");
            
        
                int itemAsk;
     
                scan = new Scanner(System.in);  
                          
                System.out.println("");
                
                System.out.println("1) Yes");
                
                System.out.println("");
                
                System.out.println("2) No");
                
                itemAsk = scan.nextInt();
                
                switch(itemAsk){
    
                    case 1: 
                        
                        System.out.println("");
                    
                        System.out.println("");
                            
                        System.out.println("Sorry, but this function is under development.");
         
                        System.out.println("");
                
                        System.out.println("");
                        break;
                        
                    case 2: 
                        
                        System.out.println("That's what I thought.");
                        break;
                        
                    default:
                        System.out.println("Try again.");
        
                        equipItemsAsk( luchador, inventory);
                        break;
                }
                
            break;
        
        
        default:System.out.println("Try again.");
        
        equipItemsAsk( luchador, inventory);
        break;
        }
      }
      
    //método para "crear" objetos. (para ser llamada cuando muere un mostruo)
    public static int createItem(){
        
        int Item = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        
        return Item;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //incialización de la variable "checker" que se usa para revisar cauntas veces el usuario ha introducido un comando no válido
        int checker = 0;
        
        //inicialización del inventario para objetos no equipados
        int [] inventory = new int [10];
        
        //inicialización del contador de luchadores
        int numList = 0;
        
        //inicialización del Array que contendrá a los Luchadores
        Luchador[] list = new Luchador[25];
        
        //llamada al método menú
        menu(checker , list, numList,inventory);
        
        
        
    }
    
}
