package graphwalker.parser;

import java.util.ArrayList;
import java.util.List;

public class TestSequenceGraphWalker {
	private List<String> testSequence;
	
	public TestSequenceGraphWalker() {
		testSequence = new ArrayList<String>();
	}

	public List<String> getTestSequence() {
		return testSequence;
	}

	public void setTestSequence(List<String> testSequence) {
		this.testSequence = testSequence;
	}
	
	public void printTestSequenceInfo() {
		System.out.print(testSequence.size() + " : ");
		for(int i=0; i<testSequence.size(); i++) {
			if(i == testSequence.size()-1) {
				System.out.println(testSequence.get(i));
			}
			else {
				System.out.print(testSequence.get(i) + ", ");
			}
		}
	}
}
