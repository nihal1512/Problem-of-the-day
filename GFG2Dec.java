class Solution {
    int isItPossible(String S, String T, int M, int N) {
        // code here
         int c1=0,c2=0;

        

        if(M!=N)return 0;

        for(int i=0;i<M;i++){

            if(S.charAt(i)=='#')

            c1++;

            if(T.charAt(i)=='#')

            c2++;

        }

        if(c1!=c2)return 0;

        int i=0;int j=0;

        while(i<M && j<N){

            while(i<M && S.charAt(i)=='#')

            {

                i++;

            }

            while(j<N && T.charAt(j)=='#')

            {

                j++;

            }

            if(i<M && j<N && S.charAt(i)!=T.charAt(j)){

                return 0;

            }

            i++;j++;

        }

        return 1;
    }
};
