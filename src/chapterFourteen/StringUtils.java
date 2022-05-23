package chapterFourteen;

public class StringUtils {
    private String string;

    public StringUtils(String string) {
        this.string = string;
    }
    public int lastIndexOf(char character){
        //string = string.toLowerCase();
        int lastIndex = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public int lastIndexOf(boolean value, char character){
        int lastIndex = -1;
        if(value) {
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == character) {
                    lastIndex = i;
        }
        else {
            lastIndexOf(character);
                }
             }
         }
        return lastIndex;
    }

    public int indexOf(char character) {
        int index = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                return i;
            }
        }
        return index;

    }

    public int indexOf(boolean value, char character) {
        int index = -1;
        if (value) {
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == character) {
                    return i;
                }
            }
        }
        else {
            indexOf(character);
        }
        return index;
    }

    public int countOfIndex(boolean value, char character) {
        int count = 0;
        if (value) {
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == character) {
                    count+=1;
                }
            }
        }
        else {
            return count;
        }
        return count;
    }

    public int countOfIndex(char character) {
        int count = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == character) {
                    count+=1;
                }
            }
        return count;
    }



}
