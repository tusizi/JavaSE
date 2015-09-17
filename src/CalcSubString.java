
public class CalcSubString {
	public static void main (String args[]){
		String s = "sunjavahellojavajavaworld";
				int count = 0;
				int index = -1;
				String sToFind = "java";
		while((index = s.indexOf(sToFind)) != -1){
			s = s.substring(index + sToFind.length() );
			count++;
		}
		System.out.print(count);
	}
}
