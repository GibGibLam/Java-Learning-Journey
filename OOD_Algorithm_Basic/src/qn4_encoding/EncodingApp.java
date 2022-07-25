package qn4_encoding;

public class EncodingApp {
public static void main(String[] args) {
	EncodingMethod em = new EncodingMethod();
	em.encodingDevice("abcde");
	//badcf
	em.encodingDevice("two words");
	//uvp xnsct
	em.encodingDevice("aazz");
	//bzay
}	
}
