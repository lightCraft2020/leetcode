package november;

public class RomeInteger13 {

    public static int romanToInt(String s) {
        int sum = 0;

        char[] arr = s.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            char c = arr[i];
            if('I' == c || 'X' == c|| 'C' == c){
                if(i < arr.length - 1){
                    if('I' == c){
                        if(arr[i+1] == 'V'){
                            sum += 4;
                            i++;
                        } else if(arr[i+1] == 'X'){
                            sum += 9;
                            i++;
                        } else {
                            sum += 1;
                        }
                    } else if('X' == c){
                        if(arr[i+1] == 'L'){
                            sum += 40;
                            i++;
                        } else if(arr[i+1] == 'C'){
                            sum += 90;
                            i++;
                        } else {
                            sum += 10;
                        }
                    } else if('C' == c){
                        if(arr[i+1] == 'D'){
                            sum += 400;
                            i++;
                        } else if(arr[i+1] == 'M'){
                            sum += 900;
                            i++;
                        } else {
                            sum += 100;
                        }
                    } else {
                        sum = getSum(sum, c);
                    }

                } else {
                    switch (c) {
                        case 'I':
                            sum += 1;
                            break;
                        case 'X':
                            sum += 10;
                            break;
                        case 'C':
                            sum += 100;
                            break;
                    }
                }
            } else {
                sum = getSum(sum, c);

            }

        }


        return sum;
    }

    private static int getSum(int sum, char c) {
        switch (c){
            case 'I':
                sum+=1;
                break;
            case 'V':
                sum+=5;
                break;
            case 'X':
                sum+=10;
                break;
            case 'L':
                sum+=50;
                break;
            case 'C':
                sum+=100;
                break;
            case 'D':
                sum+=500;
                break;
            case 'M':
                sum+=1000;
                break;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int sum = romanToInt(s);
        System.out.println(sum);

    }
}
