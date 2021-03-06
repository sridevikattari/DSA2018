import java.util.Arrays;
import java.util.Scanner;

/**
 * Class for question.
 */
class Question {
	/**
	 * { var_description }.
	 */
	private String questiontext;
	/**
	 * { var_description }.
	 */
	private String[] choices;
	/**
	 * { var_description }.
	 */
	private int correctAnswer;
	/**
	 * { var_description }.
	 */
	private int maxMarks;
	/**
	 * { var_description }.
	 */
	private int penalty;
	/**
	 * { var_description }.
	 */
	private String response;

	/**
	 * Constructs the object.
	 */
	Question() {

	}

	/**
	 * Constructs the object.
	 *
	 * @param question1
	 *            The question 1
	 * @param choices1
	 *            The choices 1
	 * @param correctAnswer1
	 *            The correct answer 1
	 * @param maxMarks1
	 *            The maximum marks 1
	 * @param penalty1
	 *            The penalty 1
	 */
	Question(final String question1, final String[] choices1, final int correctAnswer1, final int maxMarks1,
			final int penalty1) {
		this.questiontext = question1;
		this.choices = choices1;
		this.correctAnswer = correctAnswer1;
		this.maxMarks = maxMarks1;
		this.penalty = penalty1;
		// this.response = response1;
	}

	/**
	 * { function_description }.
	 *
	 * @param choice
	 *            The choice
	 *
	 * @return { description_of_the_return_value }
	 */
	public boolean evaluateResponse(final String choice) {
		if (choice.equals(getCorrectAnswer()))
			return true;
		else
			return false;

	}

	/**
	 * Gets the correct answer.
	 *
	 * @return The correct answer.
	 */
	public String getCorrectAnswer() {
		return choices[correctAnswer];
	}

	/**
	 * Gets the question text.
	 *
	 * @return The question text.
	 */
	public String getQuestionText() {
		return questiontext;
	}

	/**
	 * Gets the choice.
	 *
	 * @return The choice.
	 */
	public String[] getChoice() {
		return choices;
	}

	/**
	 * Gets the maximum marks.
	 *
	 * @return The maximum marks.
	 */
	public int getMaxMarks() {
		return maxMarks;
	}

	/**
	 * Gets the penalty.
	 *
	 * @return The penalty.
	 */
	public int getPenalty() {
		return penalty;
	}

	/**
	 * Sets the response.
	 *
	 * @param answer
	 *            The answer
	 */
	public void setResponse(final String answer) {
		response = answer;
	}

	/**
	 * Gets the response.
	 *
	 * @return The response.
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	public String toString() {
		String s = "\n Q" + this.questiontext + "\n" + Arrays.toString(choices) + "\n";
		return s;
	}
}

/**
 * Class for quiz.
 */
class Quiz {
	/**
	 * { var_description }.
	 */
	private final int onehundred = 100;
	/**
	 * { var_description }.
	 */
	private Question[] questions;

	@Override
	public String toString() {
		return "Quiz [questions=" + Arrays.toString(questions) + ", size=" + size + "]";
	}

	/**
	 * { var_description }.
	 */
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private int cur;

	/**
	 * Constructs the object.
	 */
	Quiz() {
		questions = new Question[onehundred];
		cur = 0;
	}

	/**
	 * Adds a question.
	 *
	 * @param q
	 *            The question
	 */
	public void addQuestion(final Question q) {
		questions[cur++] = q;
	}

	/**
	 * Gets the question.
	 *
	 * @param index
	 *            The index
	 *
	 * @return The question.
	 */
	public Question getQuestion(final int index) {
		return questions[index];
	}

	/**
	 * Shows the report.
	 *
	 * @return { description_of_the_return_value }
	 */
	public String showReport() {
		String s = "";
		return s;
	}

}

/**
 * Solution class for code-eval.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */

	private Solution() {
		// leave this blank

	}

	/**
	 * main function to execute test cases.
	 *
	 * @param args
	 *            The arguments
	 */
	public static void main(final String[] args) {
		// instantiate this Quiz
		Quiz q = new Quiz();
		// code to read the test cases input file
		Scanner s = new Scanner(System.in);
		// check if there is one more line to process
		while (s.hasNext()) {
			// read the line
			String line = s.nextLine();
			// split the line using space
			String[] tokens = line.split(" ");
			// based on the list operation invoke the corresponding method

			switch (tokens[0]) {
			case "LOAD_QUESTIONS":
				System.out.println("|----------------|");
				System.out.println("| Load Questions |");
				System.out.println("|----------------|");
				if(Integer.parseInt(tokens[1])<=0)
					System.out.println("Quiz does not have questions");
				else
					q = loadQuestions(s, q, Integer.parseInt(tokens[1]));
				break;
			case "START_QUIZ":
				System.out.println("|------------|");
				System.out.println("| Start Quiz |");
				System.out.println("|------------|");
				if(q.getSize()>0)
				{startQuiz(s, q, Integer.parseInt(tokens[1]));}
				break;
			case "SCORE_REPORT":
				System.out.println("|--------------|");
				System.out.println("| Score Report |");
				System.out.println("|--------------|");
				if(q.getSize()>0)
				{	
					displayScore(q);
					q= new Quiz();
				}
				break;
			default:

				break;

			}
		}
	}

	/**
	 * Loads questions.
	 *
	 * @param scan
	 *            The scan
	 * @param quiz
	 *            The quiz
	 * @param q
	 *            The question count
	 *
	 */
	public static Quiz loadQuestions(final Scanner scan, final Quiz quiz, final int q) {
		// write your code here to read the questions from the console
		// tokenize the question line and create the question object
		// add the question objects to the quiz class

		quiz.setSize(q);

		for (int i = 0; i < q; i++) {

			String[] tokens = scan.nextLine().split(":");
			//System.out.println("q"+tokens[0]+tokens.length);
			if(tokens.length!=5)
			{System.out.println("Error! Malformed question");
			quiz.setSize(0);
			break;
			}
			String[] cho = tokens[1].split(",");

			String questiontext=tokens[0];

			int correctAnswer = Integer.parseInt(tokens[2]) - 1;
			int maxMarks =Integer.parseInt(tokens[3]);
			int penalty = Integer.parseInt(tokens[4]);


			if(tokens[0].isEmpty()||tokens[1].isEmpty()||tokens[2].isEmpty()||tokens[3].isEmpty()||tokens[4].isEmpty())
			{System.out.println("Error! Malformed question");
			quiz.setSize(0);
			break;
			}
			if(cho.length<=1)
			{System.out.println("trick question  does not have enough answer choices");
			quiz.setSize(0);
			break;
			}
			//System.out.println((Integer.parseInt(tokens[2])-1 )+".."+cho.length);

			if(correctAnswer>=cho.length)
			{
				System.out.println("Error! Correct answer choice number is out of range for "+ questiontext);
				quiz.setSize(0);
				break;
			}
			if(penalty>0)
			{
				System.out.println("Invalid penalty for "+ questiontext);
				quiz.setSize(0);
				break;
			}
			if(maxMarks<0)
			{
				System.out.println("Invalid max marks for "+ questiontext);
				quiz.setSize(0);
				break;
			}



			//		System.out.println("pana;ity:"+Integer.parseInt(tokens[4]));
			Question ques = new Question(questiontext,cho,correctAnswer,maxMarks,penalty );
			quiz.addQuestion(ques);

		}
		if(quiz.getSize()>0)
			System.out.println(quiz.getSize()+" quesions are added");
		return quiz;
	}

	/**
	 * Starts a quiz.
	 *
	 * @param scan
	 *            The scan
	 * @param quiz
	 *            The quiz
	 * @param q
	 *            The answer count
	 */
	public static void startQuiz(final Scanner scan, final Quiz quiz, final int q) {
		// write your code here to display the quiz questions on the console.
		// read the user responses from the console using scanner object.
		// store the user respone in the question object
		int k = 0;
		String[] cho = new String[q];

		for (int i = 0; i < q; i++)
			cho[k++] = scan.nextLine();

		for (int i = 0; i < q; i++) {
			System.out.println(quiz.getQuestion(i).getQuestionText() + " (" + quiz.getQuestion(i).getMaxMarks() + ")");
			for(int j=0;j<quiz.getQuestion(i).getChoice().length;j++)
				System.out.print(quiz.getQuestion(i).getChoice()[j]+" ");
			quiz.getQuestion(i).setResponse(cho[i]);
			System.out.println();


		}
	}

	/**
	 * Displays the score report.
	 *
	 * @param quiz
	 *            The quiz object
	 */
	public static void displayScore(final Quiz quiz) {
		// write your code here to display the score report using quiz object.
		int sc = 0;

		for (int i = 0; i < quiz.getSize(); i++) {
			System.out.println(quiz.getQuestion(i).getQuestionText());

			if (quiz.getQuestion(i).getResponse().equals(quiz.getQuestion(i).getCorrectAnswer())) {
				sc = sc + quiz.getQuestion(i).getMaxMarks();
				System.out.println(" Correct Answer! - Marks awarded " + quiz.getQuestion(i).getMaxMarks());

			} else {
				System.out.println(" Wrong Answer! - Panality " + quiz.getQuestion(i).getPenalty());
				sc += quiz.getQuestion(i).getPenalty();
			}

		}
		System.out.println("Total Score : " + sc);

	}

}
