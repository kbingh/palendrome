public class Palendrome {


    String palendrome1 = "ABBA";

    public boolean getPalendrome(String palendrome){

        char[] charArray = new char[palendrome.length()];

        CharSequence charSequence = palendrome;
        for(int i = 0; i < charSequence.length(); i++){

            charArray[i] = charSequence.charAt(i);
        }
        boolean isPalendrome = false;
        int position = charArray.length -1;
        for(char ch : charArray){

            if(ch == charArray[position]){

                isPalendrome = true;
            } else {

                isPalendrome = false;
            }
            position--;
        }
        return isPalendrome;
    }

    public static void main(String[] args) {
        Palendrome pal = new Palendrome();
        if(pal.getPalendrome("ABBA")){

            System.out.println("Is a Palendrome");
        } else {

            System.out.println("Is not a Palendrome");
        }


    }
}
