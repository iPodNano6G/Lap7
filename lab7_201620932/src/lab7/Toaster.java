package lab7;

public class Toaster extends Product implements Cooker {

	@Override
	public String prepareFood() {
		return "Preparing toast";
	}

	@Override
	public String getName() {
		return Toaster.class.getSimpleName();
	}
}
