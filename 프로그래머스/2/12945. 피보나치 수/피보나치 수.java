// class Solution {

//     public int solution(int n) {
//         return getAnswer(0, 1, 1, n, 1);
//     }
    
//     int getAnswer(int f0, int f1, int f2, int limit, int count) {
//         if (count < limit) {
//             count++;
//             f2 = (f0 + f1) % 1234567;
//             f0 = f1;
//             f1 = f2;
//             return getAnswer(f0, f1, f2, limit, count);
//         }
//         return f2;
//     }

// }

class Solution {

    public int solution(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;
        return getValue(n, arr);
    }
    
    int getValue(int n, int[] arr) {
        if (n < 3) {
            return arr[n];
        }
        if (arr[n] == 0) {
            arr[n] = (getValue(n - 2, arr) + getValue(n - 1, arr)) % 1234567;
        }
        return arr[n];
    }

}
