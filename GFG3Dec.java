class Solution {
    public static int solve(int n, int k, int[] stalls) {
        if(n<k){
            return 0;
        }
        Arrays.sort(stalls);
        int mx = stalls[n-1];
        int mn = stalls[0];
        int gap = mx-mn;
        int l = 1, r = gap;
        int ans = l;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(stalls,n,k,mid)){
                ans = mid;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] stalls,int n, int k, int gap){
        int cnt = 1;// for cow at stalls[0]
        int i=0,j=i+1;
        while(j<n){
            if(stalls[j]-stalls[i] >= gap){
                cnt += 1;
                i = j;
                j += 1;
            }
            else{
                j += 1;
            }
        }
        if(cnt >= k){
            return true;
        }
        else{
            return false;
        }
    }
}
