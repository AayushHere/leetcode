class Solution {
    public boolean isPerfectSquare(int num) {
        int n=1;
        if(num==1)
        {
            return true;
        }
        while(n<=num/2)
        {
            if(n*n==num)
            {
                return true;
            }
            if(n*n>num)
            {
                return false;
            }
            n++;
        }
        return false;
        
    }
}