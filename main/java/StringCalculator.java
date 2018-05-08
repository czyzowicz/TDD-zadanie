public class StringCalculator {

    private int result;

    public StringCalculator() {
    }

    public int add (String inputString)throws NegativeNumberException {
        String goodString = removeDelimeter(inputString);
        if (goodString == "") return 0;
        else {
            String[] numbers = goodString.split(","); //tworzymy tablice i wyciagamy wszystkie plusy.
            for (String s:numbers){
                int n = Integer.parseInt(s);
                if (n<0)throw new NegativeNumberException("liczba nie moze byc ujemna");
                result += n;

            }
            return result;
        }

    }

    public String removeDelimeter(String inputString){
        String stringresult = inputString.replaceAll("\\n", ",");
        return stringresult;
    }

}