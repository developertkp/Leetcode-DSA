class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int p=1;
            int k=n;
            while(k>0){
                p *= (k%10);
                k /=10;
            }
            if(p%t==0)
                return n;
            n++;
        }
    }
}

