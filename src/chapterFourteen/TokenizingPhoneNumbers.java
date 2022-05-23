package chapterFourteen;

public class TokenizingPhoneNumbers {
    public static void main(String[] args) {
        String telephoneNumber = "(555) 555-5555";
        String []  firstToken = telephoneNumber.split(" ");
        StringBuilder newToken =  new StringBuilder();
        String areaCode = firstToken[0].substring(1, 4);
        newToken.append(areaCode).append("-");
        String [] secondToken =  firstToken[1].split("-");

        for (String token: secondToken ){
         newToken.append(token);
       }
        System.out.println(newToken);
   }
}
