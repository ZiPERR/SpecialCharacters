public class Main {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.decodeFromString("&#171;Это что&nbsp;же получается, мне не&nbsp;получить свои триста долларов назад?&raquo;");
        String result1 = stringUtils.encodeToName("Я должен быть один дома. Кто говорит? &");
        String result2 = stringUtils.encodeToCode("Я должен быть один дома. Кто говорит? &");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
