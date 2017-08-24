import java.util.Scanner;

import com.RegularExpression.MatcherUntils;

public class RegexTest {
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			if (MatcherUntils.isChanese(str)) {
				System.out.println(str + "是中文！");
			}
			else {
				System.out.println(str + "不是中文！");
			}
			
		}
	}
}
