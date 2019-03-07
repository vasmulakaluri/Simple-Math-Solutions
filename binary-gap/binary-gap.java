// import java.util.*;

class Solution {
    public int solution(int N) {
    
        int binaryGap = 0; 
        int count = 0;
        boolean one = false;
        
        while (N != 0)
        {
            if ((N & 1) == 1)
            {
                if (one == false)
                {
                    one = true;
                }
                else
                {
                    binaryGap = Math.max(binaryGap, count);
                }
                count = 0;
            }
            else
            {
                count++;
            }
            N >>= 1;
        }            
        return binaryGap;
    }
}
