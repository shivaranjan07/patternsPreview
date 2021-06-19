package creationalPatterns.singleton;

public class Client {
    public static void main(String[] args) {
//        EagerRegistry registry1 = EagerRegistry.getInstance();
//        EagerRegistry registry2 = EagerRegistry.getInstance();
//
//        System.out.println(registry1 == registry2);
//
//        LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
//        LazyRegistryWithDCL lazyRegistryWithDCL1 = LazyRegistryWithDCL.getInstance();
//        System.out.println(lazyRegistryWithDCL1 == lazyRegistryWithDCL);

        //only one instance gets created
        LazyRegistryIODH lazyRegistryIODH;
        lazyRegistryIODH = LazyRegistryIODH.getInstance();
        lazyRegistryIODH = LazyRegistryIODH.getInstance();
        lazyRegistryIODH = LazyRegistryIODH.getInstance();
        lazyRegistryIODH = LazyRegistryIODH.getInstance();

    }
}
