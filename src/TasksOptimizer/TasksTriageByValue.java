package TasksOptimizer;
import java.util.ArrayList;
import java.util.List;

public class TasksTriageByValue {

    static class Task {
        int duration;
        int value;

        Task(int duration, int value) {
            this.duration = duration;
            this.value = value;
        }
    }

    // Знаходження оптимального набору задач
    public static List<Integer> findOptimalTasks(List<Task> tasks, int totalTime) {
        int n = tasks.size();
        int[][] dp = new int[n + 1][totalTime + 1];

        // Заповнення таблиці dp
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= totalTime; j++) {
                if (tasks.get(i - 1).duration <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], tasks.get(i - 1).value + dp[i - 1][j - tasks.get(i - 1).duration]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Відновлення оптимального набору задач
        List<Integer> setOfTasks = new ArrayList<>();
        int w = totalTime;
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                setOfTasks.add(i); // Додаємо індекс задачі до списку
                w -= tasks.get(i - 1).duration;
            }
        }

        return setOfTasks;
    }

    public static void main(String[] args) {
        // Перевірочний кейс 1
        List<Task> tasks1 = new ArrayList<>();
        tasks1.add(new Task(1, 1));
        tasks1.add(new Task(3, 2));
        tasks1.add(new Task(4, 3));
        int totalTime1 = 7;

        List<Integer> optimalTasks1 = findOptimalTasks(tasks1, totalTime1);
        System.out.println("Перевірочний кейс 1: " + optimalTasks1); // Очікувано: [3, 2]

        // Перевірочний кейс 2
        List<Task> tasks2 = new ArrayList<>();
        tasks2.add(new Task(1, 1));
        tasks2.add(new Task(2, 3));
        tasks2.add(new Task(3, 4));
        int totalTime2 = 5;

        List<Integer> optimalTasks2 = findOptimalTasks(tasks2, totalTime2);
        System.out.println("Перевірочний кейс 2: " + optimalTasks2); // Очікувано: [3, 2]
    }
}
