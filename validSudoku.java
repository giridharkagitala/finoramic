import java.util.HashSet;
import java.util.Set;

public class validSudoku {
    public int isValidSudoku(final String[] Array) {
        int x = Array.length;
        if (x == 0){   
            return 1;
        }
        int y = Array[0].length();
        
        for (int i = 0; i < x; i++) {
            Set<Character> row = new HashSet<Character>();
            Set<Character> col = new HashSet<Character>();
            Set<Character> squareBox = new HashSet<Character>();
            for (int j = 0; j < y; j++) {
                if (Array[i].charAt(j) != '.' && !row.add(Array[i].charAt(j))) {
                    return 0;
                    
                }
                if (Array[j].charAt(i) != '.' && !col.add(Array[j].charAt(i))) {
                    return 0;
                    
                }
                int a = 3 * (i / 3) + j / 3;
                int b = 3 * (i % 3) + j % 3;
                if (Array[a].charAt(b) != '.' && !squareBox.add(Array[a].charAt(b)))  { 
                    return 0;
                    
                }
            }
        }
        return 1;
    }
}
