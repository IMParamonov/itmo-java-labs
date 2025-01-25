package lab5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String tex1 = "Тэфи самая лучшая собака на планете";
//        task1(tex1);

//        String tex2 = "А роза упала на лапу Азора";
//        task2(tex2);

//        String tex3 = "Только бяка не учит Java";
//        task3(tex3);

//        String text1 = "Исходная строка, которая содержит основной текст";
//        String text2 = "д";
//        task4(text1, text2);

        String text5 = "Это тестовый текст";
        task5(text5);
    }
    public static void task1(String text1) {
        String text = text1;

        String[] textArr = text.split(" ");
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
//        System.out.println(indexOfMax);
        String s = textArr[indexOfMax];
        System.out.println("Самое длинное слово в тексте: " + "'" + s + "'");
    }

    public static void task2 (String text2) {
        String text = text2;
        System.out.println(text);

        String noSpaceText = text.replaceAll(" ", "").toLowerCase();
        System.out.println(noSpaceText);

        String[] textArr = noSpaceText.split("");
        int length = textArr.length;
        System.out.println(Arrays.toString(textArr));

        String[] textArrNew = new String[length];

        int num = 0;
        for (int i = 0; i < textArr.length; i++) {
            textArrNew[num] = textArr[length-1];
            num++;
            length--;
        }
        System.out.println(Arrays.toString(textArrNew));

        boolean flag = Arrays.equals(textArr, textArrNew);
        if (flag) System.out.println("Это палиндром");
        else System.out.println("Это не палиндром");
    }

    public static void task3 (String text3) {
        String text = text3;
        System.out.println(text);

        String replace = text.replace("бяка", "[ВЫРЕЗАНО ЦЕНЗУРОЙ]");
        System.out.println(replace);
    }
    public static void task4 (String text1, String text2) {
        String textBasic = text1;
        String textEntry = text2;
//        System.out.println(textBasic + textEntry);
        int count = 0;
        int index = 0;

        while ((index = textBasic.indexOf(textEntry, index)) != -1) {
            count++;
            index += textEntry.length();
        }
        System.out.println("Количество вхождений подстроки " + "\"" + textEntry + "\": " + count);
    }

    public static void task5 (String text5) {
        String text = text5;
        System.out.println("The given string is: " + text);

        StringBuilder builder = new StringBuilder(text);
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
        String join = String.join(" ", textArrNew);
        System.out.println("The string reversed word by word is: " + join);
    }
}