import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        int subjectNum = sc.nextInt();
        
        List<Integer> score = new ArrayList<>();
        
        for ( int i = 0; i < subjectNum; i++ ){
            score.add( sc.nextInt() );
        }
        
        Collections.sort( score );
        
        double temp = 0;
        for ( int i = 0; i < subjectNum; i++ ) {
        
            temp += (double) score.get(i) / score.get(subjectNum-1) * 100;
        }
        System.out.println(temp / subjectNum);

    }
}