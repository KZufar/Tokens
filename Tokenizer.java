
package tokens;

public class Tokenizer {
   
    public static LinkedList tokenize1(String s){
        char text[]=s.toCharArray();
        String temp = "";
        LinkedList token = new LinkedList();
        
        for(int i = 0; i<text.length; i++){
            Token newToken= new Token();
            if(i<s.length() && Character.isLetter(text[i])){
                newToken.setBegin(i);
                while(i<s.length() && Character.isLetter(text[i])){
                    temp+=text[i];
                    i++;
                }
                i--;
                newToken.setType("Word");
                newToken.setText(temp);
                newToken.setEnd(i);
                token.add(newToken);
                temp = "";
            } else if(i<s.length() && Character.isDigit(text[i])){
                newToken.setBegin(i);
                while(i<s.length() && Character.isDigit(text[i])){
                    temp+=text[i];
                    i++;
                }
                i--;
                newToken.setType("Number");
                newToken.setText(temp);
                newToken.setEnd(i);
                token.add(newToken);
                temp ="";
            } else if(i<s.length() && Character.isSpaceChar(text[i])){
                newToken.setBegin(i);
                while(i<s.length() && Character.isSpaceChar(text[i])){
                    temp+=text[i];
                    i++;
                }
                i--;
                newToken.setType("Space");
                newToken.setText(temp);
                newToken.setEnd(i);
                token.add(newToken);
                temp ="";
            } else if(i<s.length() && (!Character.isLetter(text[i]) & !Character.isDigit(text[i]) & !Character.isSpaceChar(text[i]))){
                newToken.setBegin(i);
                while(i<s.length() && (!Character.isLetter(text[i]) & !Character.isDigit(text[i]) & !Character.isSpaceChar(text[i]))){
                    temp+=text[i];
                    i++;
                }
                i--;
                newToken.setType("Punktuation mark");
                newToken.setText(temp);
                newToken.setEnd(i);
                token.add(newToken);
                temp = "";
            }
        }
        return token;
    }
}