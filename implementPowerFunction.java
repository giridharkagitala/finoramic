public class implementPowerFunction {
    public int pow(int x, int n, int d) {
      
        long remainder = 1;
        int  numcheck= 0;
        if(x < 0){
            x = Math.abs(x);
            if(n%2 != 0){
                numcheck = 1;
            }
        }
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        long valtemp = x%d;
        while(n != 0){
            if(n%2 != 0){
                remainder = (remainder*valtemp)%d;
            }
            valtemp = valtemp*valtemp;
            valtemp = valtemp%d;
            n = n/2;
            if(remainder > d){
                remainder = remainder%d;
            }
        }
        if(numcheck == 1){
            return d-(int)remainder;
        }
        return (int)remainder;
    }
}
