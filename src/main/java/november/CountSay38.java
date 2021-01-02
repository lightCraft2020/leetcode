package november;

public class CountSay38 {

    public static String countAndSay(int n) {
        String str = "";
        if(1 == n){
            str = "1";
            return str;
        } else{
            String last = countAndSay(n -1);
            str = getCountSay(last);
        }

        return str;
    }

    public static String getCountSay(String last){
        String str = "";
        char[]  arr = last.toCharArray();
        char j = arr[0];
        int count = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(j == arr[i]){
                if(arr[i] != arr[i+1]){
                    count++;
                    str +=count + "" + j;
                    count = 0;
                    j = arr[i+1];
                } else{
                    count++;
                }
            } else {
                str +=count + "" + j;
                count = 1;
                j = arr[i];
            }
        }

        if(j == arr[arr.length - 1]){
            count++;
            str +=count + "" + j;
        } else {
            str +=1 + "" + arr[arr.length - 1];
        }

        return str;

    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
        //System.out.println(getCountSay("21"));

    }
}
