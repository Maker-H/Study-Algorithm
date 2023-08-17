class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (s + overwrite_string.length() - 1 < i || i < s) {
                answer += my_string.charAt(i);
            } else {
                answer += overwrite_string.charAt(count);
                count ++;
            }
        }
        return answer;
    }
}