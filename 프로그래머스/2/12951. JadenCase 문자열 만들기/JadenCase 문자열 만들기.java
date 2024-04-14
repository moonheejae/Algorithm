
class Solution {
    public String solution(String s) {
        String answer = "";
        char end = s.charAt(s.length() - 1);
        String[] input = s.split(" ");

        for (int i = 0; i < input.length; i++) {
            String temp = "";
            for (int j = 0; j < input[i].length(); j++) {
                if (j == 0) {
                    temp += Character.toUpperCase(input[i].charAt(0));
                } else {
                    temp += Character.toLowerCase(input[i].charAt(j));
                }
            }
            input[i] = temp;
        }

        for (int i = 0; i < input.length; i++) {
            answer += input[i] + " ";
            
        }

        if(end == ' '){
            return answer;
        }
        return answer.trim();
    }
}