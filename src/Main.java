import java.util.List;
import java.util.Locale;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sca = new Scanner(System.in);
            String str = sca.next();
            rightBin(buWei(hex(str)));
        }
        public static String hex(String str) {
            return Integer.toBinaryString(Integer.valueOf(str, 10));
        }

        static String buWei(String bin) {
            switch (bin.length() % 4) {
                case 1:
                    bin = "000" + bin;
                    break;
                case 2:
                    bin = "00" + bin;
                    break;
                case 3:
                    bin = "0" + bin;
                    break;
            }
            return bin;
        }

        public static String rightBin(String rightBin) {
          //方法一 String a=Integer.toHexString(Integer.valueOf( rightBin,2));
            //String b=a.toUpperCase();
            //System.out.println(b);
            //return b;
            // 方法二：
            StringBuilder builder = new StringBuilder();
            for (int k = 0; k < rightBin.length() - 3; k += 4) {
                builder.append(Integer.toHexString(Integer.valueOf(rightBin.substring(k, k + 4), 2)));
            }
            System.out.println(builder.toString().toUpperCase());
            return builder.toString();
        }
    }

