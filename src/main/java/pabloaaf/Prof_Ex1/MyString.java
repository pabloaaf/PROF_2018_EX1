package pabloaaf.Prof_Ex1;

public class MyString {
	private String str;
	
	public MyString() {
		this.str = "";
	}
	
	public int compareTo(MyString segundo) {
		if(this.str.length() == segundo.str.length()) {
			char[] chars_str1 = this.str.toCharArray();
			char[] chars_str2 = segundo.str.toCharArray();
			
			for(int i=0; i< chars_str1.length; i++) {
				if(chars_str1[i] != chars_str2[i]) {
					return chars_str1[i] - chars_str2[i];
				}
			}
			return 0;
		}		
		return this.str.length() - segundo.str.length();
	}
}
