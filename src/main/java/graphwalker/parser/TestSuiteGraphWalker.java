package graphwalker.parser;

import java.util.ArrayList;
import java.util.List;

public class TestSuiteGraphWalker {
	private List<TestSequenceGraphWalker> testSuite;
	
	public TestSuiteGraphWalker() {
		testSuite = new ArrayList<TestSequenceGraphWalker>();
	}

	public List<TestSequenceGraphWalker> getTestSuite() {
		return testSuite;
	}

	public void setTestSuite(List<TestSequenceGraphWalker> testSuite) {
		this.testSuite = testSuite;
	}
	
	public void printTestSuiteInformation() {
		Integer numberOfEvents = 0;
		for(TestSequenceGraphWalker test : testSuite) {
			numberOfEvents = numberOfEvents + test.getTestSequence().size();
		}
		System.out.println("Test Cases: " + testSuite.size());
		System.out.println("No. of Events: " + numberOfEvents);
	}
}
