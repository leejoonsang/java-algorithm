package practice.programmers;

public class WeaponOfOrder {

    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            int numOfDivisor = getNumOfDivisor(i);
            if(numOfDivisor > limit) {
                numOfDivisor = power;
            }
            answer += numOfDivisor;
        }

        return answer;
    }

    public int getNumOfDivisor(int n) {
        int result = 0;
        for(int i=1; i*i<=n; i++) {
            if(n % i == 0) {
                result++;
                if(i*i < n) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;

        WeaponOfOrder woo = new WeaponOfOrder();
        System.out.println(woo.solution(number, limit, power));
    }
}
