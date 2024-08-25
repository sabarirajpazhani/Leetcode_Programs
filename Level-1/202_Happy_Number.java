class Solution {
    public boolean isHappy(int n) {
        
        int n1=n;
        if(n==1){
            return true;
        }
        int c=0;
        while(n1>1){
            while(n1>0){
                int x=n1%10;
                c+=x*x;
                n1/=10;
            }
            if(c==1){
                return true;
            }
            n1=c;
            c=0;
            if(n1==4){
                return false;
            }
        }
        return false;
    }
}

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

//LINK: https://leetcode.com/problems/happy-number/description/