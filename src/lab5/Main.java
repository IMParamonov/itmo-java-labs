package lab5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String tex1 = "Тэфи самая лучшая собака на планете";
//        String longestWord = task1(tex1);
//        System.out.println("Самое длинное слово в тексте: " + "'" + longestWord + "'");

//        String tex2 = "А роза упала на лапу Азора";
//        boolean isTrue = task2(tex2);
//        if (isTrue) System.out.println("Это палиндром");
//        else System.out.println("Это не палиндром");

//        String text3 = "Только бяка не учит Java";
//        String textTarget = "бяка";
//        String textReplacement = "[ВЫРЕЗАНО ЦЕНЗУРОЙ]";
//        String replacedText = task3(text3, textTarget, textReplacement);
//        System.out.println(replacedText);

//        String text1 = "Исходная строка, которая содержит основной текст";
//        String text2 = "д";
//        int count = task4(text1, text2);
//        System.out.println("Количество вхождений подстроки " + "\"" + text2 + "\": " + count);

//        String text5 = "Это тестовый текст";
//        String join = task5(text5);
//        System.out.println("The given string is: " + text5 + "\n" + "The string reversed word by word is: " + join);

    }
    public static String task1(String text1) {
        String[] textArr = text1.split(" ");
//        System.out.println(Arrays.toString(textArr));

        int length = textArr.length;
        int[] list = new int[length];

        for(int i = 0; i<textArr.length; i++){
            list[i] = textArr[i].length();
        }
//        System.out.println(Arrays.toString(list));

        int indexOfMax = 0;
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] > list[indexOfMax])
            {
                indexOfMax = i;
            }
        }
        return textArr[indexOfMax];
    }

    public static boolean task2 (String text2) {
        String noSpaceText = text2.replaceAll(" ", "").toLowerCase();
//        System.out.println(noSpaceText);

        String[] textArr = noSpaceText.split("");
        int length = textArr.length;
//        System.out.println(Arrays.toString(textArr));

        String[] textArrNew = new String[length];

        int num = 0;
        for (int i = 0; i < textArr.length; i++) {
            textArrNew[num] = textArr[length-1];
            num++;
            length--;
        }
//        System.out.println(Arrays.toString(textArrNew));
        boolean flag = Arrays.equals(textArr, textArrNew);
        return flag;
    }

    public static String task3 (String text3, String textTarget, String textReplacement) {
        return text3.replace(textTarget, textReplacement);
    }

    public static int task4 (String textBasic, String textEntry) {
        int count = 0;
        int index = 0;

        while ((index = textBasic.indexOf(textEntry, index)) != -1) {
            count++;
            index += textEntry.length();
        }
        return count;
    }

    public static String task5 (String text5) {

        StringBuilder builder = new StringBuilder(text5);
        StringBuilder reversedText = builder.reverse();

//        char[] reversedTextArr = String.valueOf(reversedText).toCharArray();
//        System.out.println(Arrays.toString(reversedTextArr));

        String intermediateText = String.valueOf(reversedText);
        String[] reversedTextArr = intermediateText.split(" ");

        int length = reversedTextArr.length;
        String[] textArrNew = new String[length];

        int num = 0;
        for (int i = 0; i < reversedTextArr.length; i++) {
            textArrNew[num] = reversedTextArr[length-1];
            num++;
            length--;
        }
        return String.join(" ", textArrNew);
    }
}