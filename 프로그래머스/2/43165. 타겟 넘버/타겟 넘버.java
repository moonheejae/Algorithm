class Solution {
    int answer;
    
    void dfs( int index, int sum, int[] numbers, int target ) {
        if ( index == numbers.length ){
            if(sum == target) {
                answer++;
            }
            return;
        }
        
        dfs( index + 1, sum + numbers[index], numbers, target );
        dfs( index + 1, sum - numbers[index], numbers, target );
    }
    public int solution(int[] numbers, int target) {
        answer = 0;
  
        dfs(0, 0, numbers, target);
        
        return answer;
    }
}