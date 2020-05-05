class Solution {
    public int firstUniqChar(String s) {
        char ch[]= s.toCharArray();
        int i=0;
        int j;
        for( i=0;i<ch.length;i++)
        {
            int k=1;
            for( j=0;j<ch.length;j++)
            {
                if(i!=j && ch[i]==ch[j])
                {
                    k=0;
                    break;
                }
            }
            if(k==1)
            {
               return i;
            }
        }
        return -1;  
    }
}