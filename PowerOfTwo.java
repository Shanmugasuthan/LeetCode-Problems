class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n==1)
            return true;

        else if(n%2!=0)        
            return false;

        else
        {
            while(n>1)
            {
                n/=2;
                if(n==1)
                    return true;
                else if(n%2!=0)
                    return false;
            }
        }    

        return false;        
    }
}
