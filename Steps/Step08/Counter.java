package Day_08;

public class Counter {
    private int count = 0;
    private boolean locked = false;

    public void lock() {
        locked = true;
        System.out.println("잠금 시작");
    }

    public void unlock() {
        locked = false;
        System.out.println("잠금 해제");
    }

    public void increment(int value) {
        lock();

        try {
            if (value < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다.1");
            }
            count += value;
            System.out.println("현재 값: " + count);
        }

        catch (IllegalArgumentException e) {
            System.out.println("음수는 허용되지 않습니다.2" + e);
        }

        finally {
            // System.out.println("음수는 허용되지 않습니다.3");
            unlock(); // 문제에 실행결과의 순서와는 무관하게, unlock()을 항상 실행할 수 있도록 작성하라는 의도인 듯.
        }

        // unlock();
    }
}