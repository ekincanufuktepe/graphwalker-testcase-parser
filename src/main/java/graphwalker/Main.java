package graphwalker;

import graphwalker.parser.GraphWalkerOutputParser;
import graphwalker.parser.TestSequenceGraphWalker;
import graphwalker.parser.TestSuiteGraphWalker;

public class Main {

	public static void main(String[] args) {
		GraphWalkerOutputParser parser = new GraphWalkerOutputParser("files/ESG_Email_GraphWalker_Output.txt");
		TestSuiteGraphWalker ts = parser.parseGraphWalkerOutputFile();
		for(TestSequenceGraphWalker test : ts.getTestSuite()) {
			test.printTestSequenceInfo();
		}
		ts.printTestSuiteInformation();
	}

}
