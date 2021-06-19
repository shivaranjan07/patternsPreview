package creationalPatterns.singleton;

/**
 * Lazy initialization holder Idiom
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

	private LazyRegistryIODH() {
		System.out.println("In LazyRegistryIODH singleton");
	}

	//inner class
	private static class RegistryHolder {
		static LazyRegistryIODH INSTANACE = new LazyRegistryIODH();
	}
	/**
	 * we have not declared the static variable in our main class.
	 *
	 * Instead, we have an inner class, a private static inner class, and that has this static variable.
	 *
	 * So applying the same logic, as soon as the classloader loads our RegisteryHolder class, it will initialize
	 *
	 * this instance variable and create or singleton instance.
	 *
	 * But the only way anybody can access this class or make the class or to load this is if somebody called
	 *
	 * our instance method, because inside this method we are referring or making the first reference to
	 *
	 * our registry holder.
	 *
	 * And that way we are indeed using lazy initialization.
	 * */
	//instance is available only when client calls getInstance method
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANACE;
	}
}
