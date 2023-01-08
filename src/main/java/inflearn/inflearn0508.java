package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 응급실 */
// https://cote.inflearn.com/contest/10/problem/05-08
class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class inflearn0508 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Person person = Q.poll();
            for (Person p : Q) {
                if (p.priority > person.priority) {
                    Q.offer(person);
                    person = null;
                    break;
                }
            }
            if (person != null) {
                answer++;
                if (person.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        inflearn0508 T = new inflearn0508();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
