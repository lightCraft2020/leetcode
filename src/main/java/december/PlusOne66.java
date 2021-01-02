package december;

public class PlusOne66 {


    public static int[] plusOne(int[] digits) {
        if(digits[digits.length -1] < 9){
            digits[digits.length -1] += 1;
            return digits;
        } else {
            digits[digits.length -1] = 10;
            for (int i = digits.length-1; i > 0; i--) {
                if (digits[i] == 10) {
                    digits[i - 1] += 1;
                    digits[i] = 0;
                }
            }
            if(digits[0] == 10){
                digits[0] = 0;
                int[] r = new int[digits.length + 1];
                r[0]=1;
                for (int i = 1; i <r.length ; i++) {
                    r[i] = 0;
                }
                return r;

            }
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] d = {9,9,9};
        int[] r = plusOne(d);
        System.out.println(r);

    }
}
