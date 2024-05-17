import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        //int -> Integer 형으로 변환
        Integer[] numbersArray = Arrays.stream(numbers)
                                        .boxed()
                                        .toArray(Integer[]::new);

        
        Comparator<Integer> comparator = (o1, o2) -> {
            String str1 = o1.toString() + o2.toString();
            String str2 = o2.toString() + o1.toString();
            return str2.compareTo(str1);
        };

        Arrays.sort( numbersArray, comparator );
        
        for ( Integer integer : numbersArray ){
            answer += integer;
        }

        if( answer.charAt(0)=='0' ){
            return "0";
        }else 
            return answer;
    }
}