class Count{
    static int evenlyDivides(int n) {
        int count=0;
        int num;
        int temp=n;
        while(n>0){
            num=n%10;
            n=n/10;
            if (num == 0) continue;
            if(temp%num==0){
                count++;
            }
            
            
        }
        return count;
    }
}

