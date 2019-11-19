/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c4.dsl.dbase.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import pt.isep.edom.project.c4.dsl.dbase.services.DbaseGrammarAccess;
import pt.isep.edom.project.c4.mm.dbase.Column;
import pt.isep.edom.project.c4.mm.dbase.DbaseModel;
import pt.isep.edom.project.c4.mm.dbase.DbasePackage;
import pt.isep.edom.project.c4.mm.dbase.Table;

@SuppressWarnings("all")
public class DbaseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DbaseGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DbasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DbasePackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case DbasePackage.DBASE_MODEL:
				sequence_DbaseModel(context, (DbaseModel) semanticObject); 
				return; 
			case DbasePackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Column returns Column
	 *
	 * Constraint:
	 *     (key?='key'? name=EString type=ColumnType? (foreignKey+=Column foreignKey+=Column*)?)
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DbaseModel returns DbaseModel
	 *
	 * Constraint:
	 *     (name=EString (tables+=Table tables+=Table*)?)
	 */
	protected void sequence_DbaseModel(ISerializationContext context, DbaseModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=EString entity=EString? (columns+=Column columns+=Column*)?)
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}