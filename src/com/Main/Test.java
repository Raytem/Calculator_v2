package com.Main;

import java.util.ArrayList;
import java.util.Collections;


public class Test {

    public static Double parseDouble (String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        String inputString = "2 * 4 ^2";
//        String[] parsedString = inputString.split(" ");
//
//        ArrayList<String> TestArr = new ArrayList<>();
//        Collections.addAll(TestArr, parsedString);
//
//        System.out.println(TestArr);

//        int brCnt = 0;
//        for (var el : TestArr) {
//            if (el.equals("(")) {
//                brCnt++;
//            }
//        }
//
//        for (int k = 0; k < brCnt; k++) {
//            int firstBrIndex = 0;
//            int lastBrIndex = 0;
//            for (int i = TestArr.size() - 1; i >= 0; i--) {
//                if (TestArr.get(i).equals("(")) {
//                    firstBrIndex = i;
//                    for (int j = firstBrIndex; j < TestArr.size(); j++) {
//                        if (TestArr.get(j).equals(")")) {
//                            lastBrIndex = j;
//                            break;
//                        }
//                    }
//                    ArrayList<String> contentsOfBr = new ArrayList<>();
//                    for (int m = firstBrIndex + 1; m < lastBrIndex; m++) {
//                        contentsOfBr.add(TestArr.get(m));
//                    }
//                    TestArr.set(firstBrIndex, String.valueOf(calculate.calculateStringWithoutBrackets(contentsOfBr)));
//                    for (int m = firstBrIndex + 1; m <= lastBrIndex; m++) {
//                        TestArr.remove(m);
//                        m--;
//                        lastBrIndex--;
//                    }
//                }
//            }
//            calculate.calculateStringWithoutBrackets(TestArr);
//        }
        calculate.calculateString(inputString);
//        System.out.println(TestArr);
        System.out.print(inputString);
        System.out.print(" = " + calculate.printResult());

//        Calculate calculate = new Calculate();
//        String inputString = "12345 + 44 + 3";
//        String[] parsedString = inputString.split("");
//        ArrayList<String> TestArr = new ArrayList<>();
//        Collections.addAll(TestArr, parsedString);
//        System.out.println(TestArr);
//
//        int startOfNum = 0;
//        int endOfNum = 0;
//        for (int i = 0; i < TestArr.size() - 1; i++) {
//            if (TestArr.size() > 1) {
//                if (parseDouble(TestArr.get(i)) != null && parseDouble(TestArr.get(i + 1)) != null) {
//                    startOfNum = i;
//                    for (int j = startOfNum; j < TestArr.size() - 1; j++) {
//                        if (parseDouble(TestArr.get(j)) == null) {
//                            endOfNum = j - 1;
//                            if (startOfNum != 0) {
//                                System.out.println("\nstartOfNum = " + startOfNum + "\nendOfNum = " + endOfNum);
//                            }
//                            startOfNum = 0;
//                            endOfNum = 0;
//                        }
//                    }
//                }
//            }
//        }



    }
}
