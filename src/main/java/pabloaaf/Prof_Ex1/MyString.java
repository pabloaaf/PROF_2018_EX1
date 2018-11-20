package pabloaaf.Prof_Ex1;

public class MyString {
	private String str;
	
	public MyString() {
		this.str = "";
	}
	
	public MyString(String str) {
		this.str = str;
	}
	
	public int compareTo(MyString segundo) {
		//nodo 1
		if(this.str.length() == segundo.str.length()) {
			char[] chars_str1 = this.str.toCharArray();
			char[] chars_str2 = segundo.str.toCharArray();
			
			//nodo 2
			for(int i=0; i< chars_str1.length; i++) {
				//nodo 3
				if(chars_str1[i] != chars_str2[i]) {
					//nodo 4
					return chars_str1[i] - chars_str2[i];
				}
			}
			//nodo 5
			return 0;
		}
		//nodo 6
		return this.str.length() - segundo.str.length();
	} //nodo 7
}
