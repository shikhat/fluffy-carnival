package generalPrograms;

public class RemwhiteSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="a b n b n m m";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		

	}

}
