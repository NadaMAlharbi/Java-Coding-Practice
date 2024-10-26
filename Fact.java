/**
 *
 * @author nadaalharbi
 */
public class Fact {

    public static int Factorial(int n ){
        
        if(n==0){
            return 1; 
            
        }
        else{
            return n * Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Factorial(4));
    }
    
}
