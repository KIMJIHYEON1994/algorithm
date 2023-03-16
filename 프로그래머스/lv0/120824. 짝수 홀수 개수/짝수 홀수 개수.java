class Solution {
    public int[] solution(int[] num_list) {
        int[] result = {0, 0};

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                result[0] += 1;
            } else {
                result[1] += 1;
            }
        }
        return result;
    }
}

// for (int i = 0; i < num_list.length; i++) {
//     result = (num_list[i] % 2 == 0) ? result[0] += 1 : result[1] += 1;
// }