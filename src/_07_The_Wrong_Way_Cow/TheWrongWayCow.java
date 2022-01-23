/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		int upCow = 0;
		int downCow = 0;
		int leftCow = 0;
		int rightCow = 0;
		int[] right = new int[2];
		int[] left = new int[2];
		int[] up = new int[2];
		int[] down = new int[2];

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (i <= field.length - 3 && field[i][j] == 'c' && field[i + 1][j] == 'o' && field[i + 2][j] == 'w') {
					rightCow += 1;
					right[0] = j;
					right[1] = i;

				}
				if (j >= 2 && field[i][j] == 'c' && field[i][j - 1] == 'o' && field[i][j - 2] == 'w') {
					upCow += 1;
					up[0] = j;
					up[1] = i;

				}
				if (i <= field.length - 3 && field[i][j] == 'w' && field[i + 1][j] == 'o' && field[i + 2][j] == 'c') {
					leftCow += 1;
					left[0] = j;
					left[1] = i;

				}
				if (j >= 2 && field[i][j] == 'w' && field[i][j - 1] == 'o' && field[i][j - 2] == 'c') {
					downCow += 1;
					down[0] = j;
					down[1] = i;

				}

			}
		}
		if (rightCow == 1) {
			return right;
		} else if (leftCow == 1) {
			return left;
		} else if (upCow == 1) {
			return up;
		} else {
			return down;
		}
	}
}
