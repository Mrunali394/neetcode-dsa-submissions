class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        long number = 0; 

        for(int i = 0 ; i<size ; i++){
            number = number * 10 + digits[i];            
        }

        number = number+1;
        
        

        long temp = number ; 
        int count = 0 ;

        while (temp > 0 ){
            temp/=10;
            count++;
        }
        int digitplus[] = new int [count];

        for(int i = count-1 ; i>=0 ; i--){
            digitplus[i]=(int) (number%10);
            number /= 10 ;
        }



       return digitplus; 
    }
}
