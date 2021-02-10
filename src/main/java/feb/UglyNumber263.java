package feb;

/**
 * Created By think
 * Created At 2021/2/10 23:00
 */
public class UglyNumber263 {


    public boolean isUgly(int num) {
        if(num <= 0){
            return false;
        }
        if(1==num){
            return true;
        }
        while(!stop(num)){
            if(num % 2 == 0){
                num = num / 2;
            }
            if(num % 3 == 0){
                num = num / 3;
            }
            if(num % 5 == 0){
                num = num / 5;
            }
        }
        if(1 == num){
            return true;
        }
        return false;
    }
    private boolean stop(int number){
        if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0){
            return false;
        }
        return true;
    }
}
