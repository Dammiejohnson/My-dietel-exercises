package chapterFourteen;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils("test");
        System.out.println(stringUtils.lastIndexOf('t'));
        System.out.println(stringUtils.lastIndexOf(true, 'T'));
        System.out.println(stringUtils.lastIndexOf(false, 'T'));
        System.out.println(stringUtils.indexOf('t'));
        System.out.println(stringUtils.indexOf(true, 'T'));
        System.out.println(stringUtils.indexOf(false, 'T'));
    }
}
