public class SearchPattern {
    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        NaiveSearch(txt, pat);
        
    }
    public static void NaiveSearch(String str, String pattern){
        int n=pattern.length();
        int m=str.length();
        for(int i=0;i<m-n;i++){
            int j;
            for(j=0;j<n;j++){
                if(str.charAt(i+j)!=pattern.charAt(j))
                break;
                if(j==n-1){
                    System.out.println("Pattern found at index n"+i);
                }
            }
        }

    }
    
}
