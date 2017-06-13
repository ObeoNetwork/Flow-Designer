package io.typefox.dsl.designer.flow.xtext;

/**
 * EMF setup for the support for the flow DSL in MWE2 workflows that run the Xtext generator. 
 * Usually not needed.
 * 
 * @author koehnlein
 */
public class FlowSupportStandaloneSetup {
	public static void setup() {
		new FlowSupportStandaloneSetup();
	}
	
	public FlowSupportStandaloneSetup() {
		new FlowSupport().registerServices(false);
	}
}
