
public class Sample1 {

	public static void main(String[] args) {

		String s = "SWAWSWAWSA";

		String x = getFinalString(s);
		System.out.println(x);
	}

	private static String getFinalString(String s) {
		while (!s.isEmpty()) {
			int startIndex = s.indexOf("AWS");
			if (startIndex == -1) {
				return s;
			}
			int endIndex = startIndex + 3;

			String s1 = s.substring(0, startIndex);
			String s2 = s.substring(endIndex);
			s = s1 + s2;
		}
		return "-1";
	}

}
