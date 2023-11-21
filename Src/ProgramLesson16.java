public class ProgramLesson16 {
    public static void main(String[] args) {
        String str = " Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut omnis aperiam assumenda velit amet" +
                " repellendus possimus, totam quasi vero expedita ullam quidem provident esse error a praesentium " +
                "doloremque recusandae ea, doloribus dolores officiis eius qui obcaecati. Consequatur nesciunt, alias. " +
                "Ex.";
        int bigLetters = 0;
        int smallLetters = 0;
        int spaces = 0;
        int specialSymbols = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                bigLetters++;;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                smallLetters++;
            } else if (str.charAt(i) == ' ') {
                spaces++;
            }else {
                specialSymbols++;
            }
        }

        System.out.printf("Big letters = %d, small letters = %d, spaces = %d, special symbols = %d",
        bigLetters, smallLetters, spaces, specialSymbols);
    }

}
