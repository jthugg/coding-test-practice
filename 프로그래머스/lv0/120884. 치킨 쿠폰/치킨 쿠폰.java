class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int service = 0;
        int newCoupon = 0;
        while (coupon >= 10) {
            newCoupon = coupon / 10;
            service += newCoupon;
            coupon %= 10;
            coupon += newCoupon;
        }
        return service;
    }
}