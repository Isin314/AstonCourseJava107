package HomeworkPackage;

import java.util.Objects;

public final class OuterClass {
	private final int intData;
	private final АssociatedСlass associatedСlass;
	
	OuterClass(int intData, АssociatedСlass associatedСlass){
		this.intData = intData;
		this.associatedСlass = new АssociatedСlass(associatedСlass.getData());
	}
	
	public int getIntData() {
		return intData;
	}
	public АssociatedСlass getAssociatedClass() {
		return new АssociatedСlass(associatedСlass.getData());
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		
		if(o == null || this.getClass() != o.getClass())
			return false;
		
		OuterClass outerClass = (OuterClass) o;
		return outerClass.getIntData() == intData 
				&& outerClass.getAssociatedClass().getData().equals(associatedСlass.getData());
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(intData,associatedСlass.getData());
	}
}
