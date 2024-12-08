package Ex1;
public class Ex1 {
    public static void main(String[] args){
        System.out.println(equals("101b2", "8"));
    }
    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     * @param num a String representing a number in basis [2,16]
     * @return
     */
    public static int number2Int(String num) {
        int ans = -1;
        if (num.matches("\\d+")) {  //If input contains only digits
            ans = Integer.parseInt(num);
            return ans;                    //Return number value
        }
        if (!isNumber(num)) return ans;    //Invalid input return -1
        int indexOfB = num.indexOf('b');   //set my own "border" for 'b' in the string
        String stringNum = num.substring(0, indexOfB);//Copy only number
        int weight = 0;
        int base = getBase(num);
        ans = 0;
        for (int i = stringNum.length()-1; i >= 0; i--){
            ans += (int)((Character.getNumericValue(stringNum.charAt(i))) * (Math.pow(base, weight)));  //Calculation for converting between bases
            weight++;
        }
        return ans;
    }
    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        if (a == "" || a == null) return false;       //If string is empty
        else if(a.indexOf('b') == -1){                //'b' isn't in the string
            if (a.matches("\\d+")) return true; //But if string contains digits so its ok
            else return false;
        }
        //We have nothing before 'b' or nothing after 'b'
        else if((a.indexOf('b') == 0) || (a.indexOf('b') == a.length()-1)){
            return false;
        }
        else if (a.indexOf(' ') != -1 || a.matches(".*[^a-zA-Z0-9].*")) return false;   //If I have space or special character in the input
        else if (a.substring(0, a.indexOf('b')).matches(".*[a-z].*")) return false;     //If I have a lowercase letter before 'b'
        int base = getBase(a);
        if (base == -1) return false;   //If invalid base
        for (int i = 0; i < a.indexOf('b'); i++){
            if ((Character.getNumericValue(a.charAt(i)) >= base) || a.charAt(i) == '-') return false;   //Check all digits before 'b' are lower than given base
            else if(Character.isLetter(a.charAt(i))){
                char digitLetter = a.charAt(i);
                if (getBase(Character.toString(digitLetter)) >= base) return false;                     //If letter is grater then base
            }
        }
        return true;
    }

    //In this function we will return what base is asked in the given input
    public static int getBase(String a) {
        String baseStr = a.substring(a.indexOf('b')+1); //Save aside everythong after 'b'
        if (baseStr.matches("\\d+") && Integer.parseInt(baseStr) > 1) return Integer.parseInt(baseStr);  //If base is numbers only
        else {
            switch (baseStr) {  //Match letters to values
                case "A":
                    return 10;
                case "B":
                    return 11;
                case "C":
                    return 12;
                case "D":
                    return 13;
                case "E":
                    return 14;
                case "F":
                    return 15;
                case "G":
                    return 16;
                default:
                    return -1;
            }
        }
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     * @param num the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String ans = "";
        if (num < 0 || (base < 2 || base > 16)){    //If invalid input
            return "";
        }
        while (num > 0){
            if (num%base > 9){
                int remainder = num%base;
                switch (remainder){                 //Pair large remainder to letter
                    case 10: ans += 'A'; break;
                    case 11: ans += 'B'; break;
                    case 12: ans += 'C'; break;
                    case 13: ans += 'D'; break;
                    case 14: ans += 'E'; break;
                    case 15: ans += 'F'; break;
                    case 16: ans += 'G'; break;
                }
                num /= base;                        //Add remainder
                continue;
            }
            ans += (char) num%base;
            num /= base;                            //Add remainder
        }
        //Return answer in valid format
        if (base == 10) return new StringBuilder(ans).reverse().toString();
        return new StringBuilder(ans).reverse().toString() + 'b' + base;
    }

    /**
     * Checks if the two numbers have the same value.
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {
        boolean ans = true;
        ans = number2Int(n1) == number2Int(n2); //Boolean value if both are equal
        return ans;
    }

    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     *
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++){
            if (number2Int(arr[i]) > number2Int(arr[ans])) ans = i; //Update largest number index
        }
        return ans;
    }
}