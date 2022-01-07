package graphwalker.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GraphWalkerOutputParser {
	
	private String filename;
	private static final String edgeName = "e_NewEdge";
	private static final String startNode = "[\"}";
	private static final String endNode = "v_endNode\"}"; 
	
	public GraphWalkerOutputParser(String filename) {
		this.setFilename(filename);
	}
	
	public TestSuiteGraphWalker parseGraphWalkerOutputFile() {
		TestSuiteGraphWalker testSuite = new TestSuiteGraphWalker();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line = "";
			try {
				TestSequenceGraphWalker testSequence = null;
				while((line = br.readLine()) != null) {
					String tokens[] = line.split("\":\"");
					if(tokens[1].contains(edgeName)) {
						continue;
					}
					else if(tokens[1].equals(startNode)) {
						testSequence = new TestSequenceGraphWalker();
					}
					else if(tokens[1].equals(endNode)) {
						testSuite.getTestSuite().add(testSequence);
					}
					else {
						String event = tokens[1].substring(0, tokens[1].length()-2);
						testSequence.getTestSequence().add(event);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return testSuite;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
