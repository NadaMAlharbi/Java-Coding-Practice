package Coding;
/**
 *
 * @author nadaalharbi
 */
public class StackTrace {
    
    public static void main(String[] args){
        
        System.out.println("Calling myMethod...");
        myMethod();
        System.out.println("Method main is done.");
       
    }
    
    public static void myMethod(){
        System.out.println("Calling produceError...");
        produceError();
        System.out.println("myMethod is done.");
    }
    
     public static void produceError(){
         
        String str ="abd";
        System.out.println(str.charAt(2));
        System.out.println("produceError is done.");
         
     }
    
    
}
