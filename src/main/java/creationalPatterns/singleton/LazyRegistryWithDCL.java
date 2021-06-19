package creationalPatterns.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {
    	
    }

    //to avoid the cached version of INSTANCE (threads maintain the cached value of objects)
    private static volatile LazyRegistryWithDCL INSTANCE;
    
    public static LazyRegistryWithDCL getInstance() {
    	//since we have not created the object
    	if(INSTANCE == null) {
    		synchronized (LazyRegistryWithDCL.class) {
    			//to avoid creation of two objects getting created - example one thread is waiting at synchronized while other one creates the object
    			if(INSTANCE == null) {
    				INSTANCE = new LazyRegistryWithDCL();
				}
			}
		}
    	return INSTANCE;
	}
}
