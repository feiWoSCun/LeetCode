package LeetCode;

public class LeetCodeFor2073 {
    public static void main(String[] args) {
        int[] tic = {2, 3, 2,5,4,3,2,7,8,9,6,5,3,2,1,3,45,5};
        Solution2073 solution = new Solution2073();
        System.out.println(solution.timeRequiredToBuy(tic, 16));
    }
}
    class Solution2073 {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int i = 0;
            int count = 0;
            while (tickets[k] != 0) {
                {
                    if (i > tickets.length - 1)
                        i = 0;

                    //˼·��ÿ����Ʊ���൱�����������Ʊ���ŶӰ�Ʊ���꣬�����˵ļ����Ŷӵ��ǲ�����
                    if (tickets[i] != 0) {
                        tickets[i++]--;
                        count++;
                    } else i++;
                }
            }
            return count;
        }

    }
