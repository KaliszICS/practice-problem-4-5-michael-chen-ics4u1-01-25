public class PracticeProblem {

	public static void main(String args[]) {
		Cow cow = new Cow("null", 0, 0);
		System.out.println(cow.equals(new Object[]{null}));
	}

}
