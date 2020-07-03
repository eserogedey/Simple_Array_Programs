package Arrayss;

// this program grades multiple-choice test.
public class GradeExam {
	public static void main(String[] args) {

		char[][] answers = { { 'A', 'B', 'A', 'C', 'A', 'D', 'E', 'E', 'A', 'A' },
				{ 'E', 'D', 'D', 'C', 'D', 'E', 'A', 'D', 'B', 'E' },
				{ 'D', 'A', 'A', 'E', 'E', 'D', 'B', 'B', 'B', 'C' },
				{ 'C', 'E', 'D', 'D', 'A', 'C', 'C', 'A', 'C', 'D' },
				{ 'B', 'A', 'D', 'B', 'E', 'B', 'D', 'C', 'C', 'B' },
				{ 'A', 'D', 'C', 'A', 'B', 'A', 'E', 'E', 'D', 'A' },

		};
		char[] answerKey = { 'D', 'A', 'D', 'E', 'D', 'E', 'E', 'B', 'B', 'A' };
		for (int i = 0; i < answers.length; i++) {
			int count = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answerKey[j] == answers[i][j]) {
					count++;
				}

			}
			System.out.println("Student " + i + "'s correct answer count is " + count);
		}

	}
}