package creationalPatterns.abstractFactory.aws;

import creationalPatterns.abstractFactory.Instance;
import creationalPatterns.abstractFactory.ResourceFactory;
import creationalPatterns.abstractFactory.Storage;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
