package feb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By think
 * Created At 2021/2/17 23:18
 */
public class FizzBuzz412 {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            } else if(i % 3 == 0){
                list.add("Fizz");
            } else if(i % 5 == 0){
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }
        return list;
    }



}
