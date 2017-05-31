/*
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.serializer;

import com.google.inject.Inject;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Alert;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.CaseRule;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Conditional;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.DataSourceDeclaration;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.DropMessage;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.LiteralValue;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.ProcessorAccess;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.ProcessorDeclaration;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouteTo;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RoutingRule;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.SensorAccess;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.SystemAccess;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.SystemDeclaration;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Temperature;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Throughtput;
import fr.obeo.dsl.designer.sample.flow.routerdsl.services.RouterDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RouterDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RouterDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RouterDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RouterDslPackage.ALERT:
				sequence_Alert(context, (Alert) semanticObject); 
				return; 
			case RouterDslPackage.CASE_RULE:
				sequence_CaseRule(context, (CaseRule) semanticObject); 
				return; 
			case RouterDslPackage.CONDITIONAL:
				sequence_Conditional(context, (Conditional) semanticObject); 
				return; 
			case RouterDslPackage.DATA_SOURCE_DECLARATION:
				sequence_DataSourceDeclaration(context, (DataSourceDeclaration) semanticObject); 
				return; 
			case RouterDslPackage.DROP_MESSAGE:
				sequence_DropMessage(context, (DropMessage) semanticObject); 
				return; 
			case RouterDslPackage.LITERAL_VALUE:
				sequence_LiteralValue(context, (LiteralValue) semanticObject); 
				return; 
			case RouterDslPackage.PROCESSOR_ACCESS:
				sequence_ProcessorAccess(context, (ProcessorAccess) semanticObject); 
				return; 
			case RouterDslPackage.PROCESSOR_DECLARATION:
				sequence_ProcessorDeclaration(context, (ProcessorDeclaration) semanticObject); 
				return; 
			case RouterDslPackage.ROUTE_TO:
				sequence_RouteTo(context, (RouteTo) semanticObject); 
				return; 
			case RouterDslPackage.ROUTING_RULE:
				sequence_RoutingRules(context, (RoutingRule) semanticObject); 
				return; 
			case RouterDslPackage.SENSOR_ACCESS:
				sequence_SensorAccess(context, (SensorAccess) semanticObject); 
				return; 
			case RouterDslPackage.SYSTEM_ACCESS:
				sequence_SystemAccess(context, (SystemAccess) semanticObject); 
				return; 
			case RouterDslPackage.SYSTEM_DECLARATION:
				sequence_SystemDeclaration(context, (SystemDeclaration) semanticObject); 
				return; 
			case RouterDslPackage.TEMPERATURE:
				sequence_Temperature(context, (Temperature) semanticObject); 
				return; 
			case RouterDslPackage.THROUGHTPUT:
				sequence_Throughtput(context, (Throughtput) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Decision returns Alert
	 *     MessageDecision returns Alert
	 *     Alert returns Alert
	 *
	 * Constraint:
	 *     level=AlertLevel
	 */
	protected void sequence_Alert(ISerializationContext context, Alert semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.ALERT__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.ALERT__LEVEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlertAccess().getLevelAlertLevelEnumRuleCall_1_0(), semanticObject.getLevel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CaseRule returns CaseRule
	 *
	 * Constraint:
	 *     (condition=Conditional decisions+=Decision+)
	 */
	protected void sequence_CaseRule(ISerializationContext context, CaseRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Conditional returns Conditional
	 *
	 * Constraint:
	 *     (left=ObjectAccessOrValue op=Comparison right=ObjectAccessOrValue)
	 */
	protected void sequence_Conditional(ISerializationContext context, Conditional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.CONDITIONAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.CONDITIONAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.CONDITIONAL__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.CONDITIONAL__OP));
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.CONDITIONAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.CONDITIONAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionalAccess().getLeftObjectAccessOrValueParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConditionalAccess().getOpComparisonEnumRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getConditionalAccess().getRightObjectAccessOrValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataSourceDeclaration returns DataSourceDeclaration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataSourceDeclaration(ISerializationContext context, DataSourceDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.DATA_SOURCE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.DATA_SOURCE_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataSourceDeclarationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decision returns DropMessage
	 *     MessageDecision returns DropMessage
	 *     DropMessage returns DropMessage
	 *
	 * Constraint:
	 *     {DropMessage}
	 */
	protected void sequence_DropMessage(ISerializationContext context, DropMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectAccessOrValue returns LiteralValue
	 *     LiteralValue returns LiteralValue
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_LiteralValue(ISerializationContext context, LiteralValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.LITERAL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.LITERAL_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObjectAccessOrValue returns ProcessorAccess
	 *     ObjectAccess returns ProcessorAccess
	 *     ProcessorAccess returns ProcessorAccess
	 *
	 * Constraint:
	 *     (processor=[ProcessorDeclaration|ID] attribute=ProcessorAttribute)
	 */
	protected void sequence_ProcessorAccess(ISerializationContext context, ProcessorAccess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.PROCESSOR_ACCESS__PROCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.PROCESSOR_ACCESS__PROCESSOR));
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.PROCESSOR_ACCESS__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.PROCESSOR_ACCESS__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProcessorAccessAccess().getProcessorProcessorDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.eGet(RouterDslPackage.Literals.PROCESSOR_ACCESS__PROCESSOR, false));
		feeder.accept(grammarAccess.getProcessorAccessAccess().getAttributeProcessorAttributeEnumRuleCall_2_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProcessorDeclaration returns ProcessorDeclaration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ProcessorDeclaration(ISerializationContext context, ProcessorDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.PROCESSOR_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.PROCESSOR_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProcessorDeclarationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decision returns RouteTo
	 *     RouteTo returns RouteTo
	 *
	 * Constraint:
	 *     destination=[ProcessorDeclaration|ID]
	 */
	protected void sequence_RouteTo(ISerializationContext context, RouteTo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.ROUTE_TO__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.ROUTE_TO__DESTINATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRouteToAccess().getDestinationProcessorDeclarationIDTerminalRuleCall_1_0_1(), semanticObject.eGet(RouterDslPackage.Literals.ROUTE_TO__DESTINATION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RoutingRules returns RoutingRule
	 *
	 * Constraint:
	 *     (processors+=ProcessorDeclaration* sensors+=DataSourceDeclaration* systems+=SystemDeclaration* rules+=CaseRule*)
	 */
	protected void sequence_RoutingRules(ISerializationContext context, RoutingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectAccessOrValue returns SensorAccess
	 *     ObjectAccess returns SensorAccess
	 *     SensorAccess returns SensorAccess
	 *
	 * Constraint:
	 *     sensor=[DataSourceDeclaration|ID]
	 */
	protected void sequence_SensorAccess(ISerializationContext context, SensorAccess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.SENSOR_ACCESS__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.SENSOR_ACCESS__SENSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorAccessAccess().getSensorDataSourceDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.eGet(RouterDslPackage.Literals.SENSOR_ACCESS__SENSOR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObjectAccessOrValue returns SystemAccess
	 *     ObjectAccess returns SystemAccess
	 *     SystemAccess returns SystemAccess
	 *
	 * Constraint:
	 *     system=[SystemDeclaration|ID]
	 */
	protected void sequence_SystemAccess(ISerializationContext context, SystemAccess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.SYSTEM_ACCESS__SYSTEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.SYSTEM_ACCESS__SYSTEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemAccessAccess().getSystemSystemDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.eGet(RouterDslPackage.Literals.SYSTEM_ACCESS__SYSTEM, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SystemDeclaration returns SystemDeclaration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SystemDeclaration(ISerializationContext context, SystemDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.SYSTEM_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.SYSTEM_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObjectAccessOrValue returns Temperature
	 *     Temperature returns Temperature
	 *
	 * Constraint:
	 *     (value=INT unit=TemperatureUnit)
	 */
	protected void sequence_Temperature(ISerializationContext context, Temperature semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.TEMPERATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.TEMPERATURE__VALUE));
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.TEMPERATURE__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.TEMPERATURE__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTemperatureAccess().getValueINTTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getTemperatureAccess().getUnitTemperatureUnitEnumRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObjectAccessOrValue returns Throughtput
	 *     Throughtput returns Throughtput
	 *
	 * Constraint:
	 *     (value=INT unit=TimeUnit)
	 */
	protected void sequence_Throughtput(ISerializationContext context, Throughtput semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.THROUGHTPUT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.THROUGHTPUT__VALUE));
			if (transientValues.isValueTransient(semanticObject, RouterDslPackage.Literals.THROUGHTPUT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RouterDslPackage.Literals.THROUGHTPUT__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThroughtputAccess().getValueINTTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getThroughtputAccess().getUnitTimeUnitEnumRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
}
