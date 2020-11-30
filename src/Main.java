public class Main {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.decodeFromString("&#171;Это что&nbsp;же получается, мне не&nbsp;получить свои триста долларов назад?&raquo;");
        System.out.println(result);
    }
}
