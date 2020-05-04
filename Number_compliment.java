class comp
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        String ss="";
        
        ss= Integer.toBinaryString(n);

        char  ch[]= ss.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='0')
            {
                ch[i]='1';
            }
            else if (ch[i]=='1')
            {
                ch[i]='0';
            }
        }
     
        String a= new String(ch);
       
        int decimal = Integer.parseInt(a, 2);
        System.out.print(decimal);
        
    }
}