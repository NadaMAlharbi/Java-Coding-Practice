/**
 *
 * @author nadaalharbi
 */
public class RangSum {

    public static int SumRange(int[] number , int start , int end){
        
        if(start>end){
            return 0;
        }
        
        else {
            return number[start] + SumRange(number, start+1 ,end);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] number = {1,2,3,4,5,6,7};
        int s=SumRange(number,3,6);
        
        System.out.println("Sum ="+s);
    }
    
}
