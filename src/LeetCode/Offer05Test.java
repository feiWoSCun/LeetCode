package LeetCode;


public class Offer05Test {
        public static void main(String[] args) {

            Solution s = new Solution();
            String str = "we are happy.";
            s.replaceSpace(str);
        }

        static class Solution {
            public static String replaceSpace(String s) {
                char[] help = s.toCharArray();
                int num=0;
                for(int ii=0;ii<help.length;ii++){
                    if(help[ii]==' ')
                        num++;
                }
                char[] result = new char[help.length+(num<<1)];
                int point = 0;
                for (int i = 0; i < help.length; i++) {
                    if (help[i] != ' ') {
                        result[point++]=help[i];
                    } else {
                        result[point++] = '%';
                        result[point++] = '2';
                        result[point++] = '0';
                    }
                }
                String ans = new String(result);
                return ans;
            }
        }

}
