public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];  

        // 100 دانش‌آموز
        for (int student = 1; student <= 100; student++) {
            for (int locker = student - 1; locker < 100; locker += student) {
                lockers[locker] = !lockers[locker]; 
            }
        }

        System.out.println("Open lockers:");
			for (int i = 0; i < 100; i++) {
				if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
