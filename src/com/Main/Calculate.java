package com.Main;

import java.util.ArrayList;
import java.util.Collections;

public class Calculate {
    private Double m_preResult;

    public double sum (double num1, double num2) {
        return num1 + num2;
    }

    public double difference (double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication (double num1, double num2) {
        return num1 * num2;
    }

    public double division (double num1, double num2) {
        return num1 / num2;
    }

    public void calculateString (String inputString) {
        String[] parsedString = inputString.split(" ");
        //convert array(parsedString) of el to ArrayList(parsedStringList)
        ArrayList<String> parsedStringList = new ArrayList<>();
        Collections.addAll(parsedStringList, parsedString);

        calculateStringWithBrackets(parsedStringList);
    }

    public void calculateSqrt (ArrayList<String> parsedStringList, int i) {
        parsedStringList.set(i, String.valueOf(Math.sqrt(Double.valueOf(parsedStringList.get(i + 1)))));
        parsedStringList.remove(i + 1);
    }

    public void calculatePow (ArrayList<String> parsedStringList, int i) {
        parsedStringList.set(i, String.valueOf(Math.pow(Double.valueOf(parsedStringList.get(i)), 2)));
        parsedStringList.remove(i + 1);
    }


    public double calculateStringWithoutBrackets (ArrayList<String> parsedStringList) {
        //find and calculate "*" and "/" first of all and add result back to the parsedStringList
        for (int i = 0; i < parsedStringList.size(); i++) {
            for (int j = 0; j < parsedStringList.size(); j++) {
                if (parsedStringList.get(j).equals("sqrt")) {
                    calculateSqrt(parsedStringList, j);
                }
                if (parsedStringList.get(j).equals("^2")) {
                    calculatePow(parsedStringList, j - 1);
                }
            }

            if (parsedStringList.get(i).equals("*") || parsedStringList.get(i).equals("/")) {
                ArrayList<String> multAndDivString = new ArrayList<>();
                multAndDivString.add(parsedStringList.get(i - 1));
                multAndDivString.add(parsedStringList.get(i));
                multAndDivString.add(parsedStringList.get(i + 1));

                //calculate A * B or A / B and return result back to ArrayList
                double calculatedEl = 0;
                switch (multAndDivString.get(1)) {
                    case ("*"): {
                        calculatedEl = multiplication( Double.valueOf(multAndDivString.get(0)),  Double.valueOf(multAndDivString.get(2)) );
                        break;
                    }
                    case ("/"): {
                        calculatedEl = division( Double.valueOf(multAndDivString.get(0)),  Double.valueOf(multAndDivString.get(2)) );
                        break;
                    }
                }

                parsedStringList.set(i, String.valueOf(calculatedEl));
                parsedStringList.remove(i - 1);
                parsedStringList.remove(i);
                i--;
            }
        }

        //calculate "+" and "-" and return result
        ArrayList<Double> middleResults = new ArrayList<>();
        int i = 0;
        while (i < parsedStringList.size()) {
            switch (parsedStringList.get(i)) {
                case ("+"): {
                    if (i == 1) {
                        middleResults.add(sum(Double.valueOf(parsedStringList.get(i - 1)), Double.valueOf(parsedStringList.get(i + 1))));
                    } else {
                        middleResults.add(sum(middleResults.get(middleResults.size() - 1), Double.valueOf(parsedStringList.get(i + 1))));
                    }
                    i++;
                    break;
                }
                case ("-"): {
                    if (i == 1) {
                        middleResults.add(difference(Double.valueOf(parsedStringList.get(i - 1)), Double.valueOf(parsedStringList.get(i + 1))));
                    } else {
                        middleResults.add(difference(middleResults.get(middleResults.size() - 1), Double.valueOf(parsedStringList.get(i + 1))));
                    }
                    i++;
                    break;
                }
            }
            i++;
        }

        if (middleResults.size() == 0) {
            return Double.valueOf(parsedStringList.get(0));
        } else {
            return middleResults.get(middleResults.size() - 1);
        }
    }


    public void calculateStringWithBrackets (ArrayList<String> parsedStringList) {

        int brCnt1 = 0;
        int brCnt2 = 0;
        int br1Index = -1;
        int br2Index = -1;
        for (int i = 0; i < parsedStringList.size(); i++) {
            if (parsedStringList.get(i).equals("(")) {
                brCnt1++;
            }
            if (parsedStringList.get(i).equals(")")) {
                brCnt2++;
            }
            if (parsedStringList.size() >= 2 && i != parsedStringList.size() - 1 && parsedStringList.get(i).equals("(") && parsedStringList.get(i + 1).equals(")")) {
                brCnt1 = -1;
            }
        }

        if (brCnt1 == brCnt2 && brCnt1 >= 0) {
            if (brCnt1 > 0) {
                for (int k = 0; k < brCnt1; k++) {
                    int firstBrIndex = 0;
                    int lastBrIndex = 0;
                    for (int i = parsedStringList.size() - 1; i >= 0; i--) {
                        if (parsedStringList.get(i).equals("(")) {
                            firstBrIndex = i;
                            for (int j = firstBrIndex; j < parsedStringList.size(); j++) {
                                if (parsedStringList.get(j).equals(")")) {
                                    lastBrIndex = j;
                                    break;
                                }
                            }
                            ArrayList<String> contentsOfBr = new ArrayList<>();
                            for (int m = firstBrIndex + 1; m < lastBrIndex; m++) {
                                contentsOfBr.add(parsedStringList.get(m));
                            }
                            parsedStringList.set(firstBrIndex, String.valueOf(calculateStringWithoutBrackets(contentsOfBr)));
                            for (int m = firstBrIndex + 1; m <= lastBrIndex; m++) {
                                parsedStringList.remove(m);
                                m--;
                                lastBrIndex--;
                            }
                        }
                    }
                    m_preResult = calculateStringWithoutBrackets(parsedStringList);
                }
            } else {
                m_preResult = calculateStringWithoutBrackets(parsedStringList);
            }
        } else {
            m_preResult = null;
        }
    }


    public String printResult () {
        double inf = Double.POSITIVE_INFINITY;
        if (m_preResult != null && m_preResult != inf && m_preResult != -1 * inf) {
            String[] resultString = String.valueOf(m_preResult).split("");
            ArrayList<String> resultStringList = new ArrayList<>();
            Collections.addAll(resultStringList, resultString);

            int resultInt = 0;
            if (resultStringList.get(resultStringList.size() - 2).equals(".") && resultStringList.get(resultStringList.size() - 1).equals("0")) {
                resultStringList.remove(resultStringList.size() - 2);
                resultStringList.remove(resultStringList.size() - 1);
                String resStr = new String();
                for (var el : resultStringList) {
                    resStr += el;
                }
                resultInt = Integer.valueOf(resStr);
                return String.valueOf(resultInt);
            } else {
                return String.valueOf(m_preResult);
            }
        } else {
            return "Ошибка";
        }
    }



}
