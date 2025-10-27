package mid;

public class _2125NumberOfLaserBeamsInABank {
    public static int numberOfBeams(String[] bank) {
        int totalBeams = 0;
        for (int i = 0; i < bank.length - 1; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
//                    表明当前位置有激光灯
//                    向下行遍历
                    for (int l = i + 1; l < bank.length; l++) {
                        boolean isHaveBlock = false;
                        for (int k = 0; k < bank[l].length(); k++) {
                            if (bank[l].charAt(k) == '1') {
                                isHaveBlock = true;
                                totalBeams++;
                            }
                        }
                        if (isHaveBlock) break;
                    }
                }
            }
        }
        return totalBeams;
    }
}
