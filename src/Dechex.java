public class Dechex extends madProgrammedRegisttrationApplication {

	private String input;

	private Dechex(String input) {
		this.input = input;
	}

	public String deztohex() {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException nfe) {
			return "NaN";
		}
		return Long.toHexString(Long.valueOf(input));
	}

	public String hextodez() {
		try {
			Long.parseLong(input, 16);
		} catch (NumberFormatException nfe) {
			return "NaN";
		}
		return String.valueOf(Long.parseLong(input, 16));
	}
/*
	public static void main(String[] args) {

		Dechex in = new Dechex("01031996");
		System.out.println(in.deztohex());
		
		Dechex out = new Dechex("a");
		System.out.println(out.hextodez());

	}*/

}
