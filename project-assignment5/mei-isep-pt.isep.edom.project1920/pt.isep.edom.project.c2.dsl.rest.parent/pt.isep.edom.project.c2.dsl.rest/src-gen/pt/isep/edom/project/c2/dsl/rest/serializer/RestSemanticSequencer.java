/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c2.dsl.rest.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import pt.isep.edom.project.c2.dsl.rest.services.RestGrammarAccess;
import pt.isep.edom.project.c2.mm.rest.Resource;
import pt.isep.edom.project.c2.mm.rest.RestModel;
import pt.isep.edom.project.c2.mm.rest.RestPackage;

@SuppressWarnings("all")
public class RestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RestGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RestPackage.RESOURCE:
				sequence_Resource(context, (Resource) semanticObject); 
				return; 
			case RestPackage.REST_MODEL:
				sequence_RestModel(context, (RestModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Resource returns Resource
	 *
	 * Constraint:
	 *     (
	 *         put?='put'? 
	 *         post?='post'? 
	 *         delete?='delete'? 
	 *         get?='get'? 
	 *         name=EString 
	 *         entity=EString? 
	 *         (reference+=[Resource|EString] reference+=[Resource|EString]*)? 
	 *         (subresource+=Resource subresource+=Resource*)?
	 *     )
	 */
	protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RestModel returns RestModel
	 *
	 * Constraint:
	 *     (name=EString url=EString? (resources+=Resource resources+=Resource*)?)
	 */
	protected void sequence_RestModel(ISerializationContext context, RestModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}