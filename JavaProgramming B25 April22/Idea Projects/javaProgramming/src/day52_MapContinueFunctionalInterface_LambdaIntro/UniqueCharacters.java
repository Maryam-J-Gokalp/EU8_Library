package day52_MapContinueFunctionalInterface_LambdaIntro;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

//INTERVIEW QUESTION Get a Map Contain character of the Key and frequency of Value @ the end
//String Key--> String str = "aabcccdeeeef"; value Integer-->
//I Need To Find Frequency Of Unique Character Instead Of Use Nested Loop I Can Convert String Into Collection Type...
//StringCanNotBeConvertIntoCollectionType ButOutOfTheStringICanApplyArray&useSplit()use-->String[] arr=str.split("");...
//My Array contain Element and each element re[resent each character of the string
// Character Can Be String and I can Duplicate, Key Can Be Integer and I can not duplicate the key...
// LinkedHashMap ToMakeSureOrderIsNotChange-->Map<String, Integer> result = new LinkedHashMap<>();
//I Need to apply for each loop below to get access each character of the string--> for (String each : arr) {
//Frequency Of Character From Collection Utility Use Frequency() ToApply frequency U need to Provide two Argument..
//1st ArgumentPass collectionType-->Array<--2rd argument-->each<-->Object U want to find frequency off each element....
//Use asList()2convertMyArrayIntoAsListThenIAddFrequency->int frequency=Collections.frequency(Arrays.asList(arr),each);
//Then I use If condition to find if each character is frequency is == to 1 ---> if(frequency == 1){
//IfCondition is==1 ToAddFrequency into map use put()1stArgumentPassKey-->result.put(each, frequency);
//result.put(each,frequency);<-twoWaysToFindFrequencyOfEachCharacterIfFrequencyIsTrueConditionBe1->result.put(each,1);

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency( Arrays.asList(arr) , each );
            if(frequency == 1){
                result.put(each, frequency);
            }
        }

        System.out.println(result);

    }

}
/*
1. Write a program that can find the unique characters from a String
			Ex:
					str = "aabcccdeeeef";
			output:
					{b=1, d=1, f=1}  <--GetThisResultNeedToFindFrequencyOfCharacter
 */
