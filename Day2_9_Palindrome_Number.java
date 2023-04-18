
public class Day2_9_Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));
	}
	public static  boolean isPalindrome(int x) { 
        if(x>=0 && x<10){ //single digits are palindromes
            return true;
        } 
        if(x<0 || x%10==0){ //can't be negative and cant end in 0
            return false;
        } 
        int secondHalf=0;   
        while(x>secondHalf){
            secondHalf = secondHalf*10 + x%10; //bring over last digit of x
            x=x/10; //remove last digit from x
        }
        return (x==secondHalf || x==secondHalf/10); //x==secondHalf/10 accounts for odd digit mismatching numbers
    }

}
