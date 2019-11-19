/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c4.dsl.dbase.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import pt.isep.edom.project.c4.dsl.dbase.services.DbaseGrammarAccess
import pt.isep.edom.project.c4.mm.dbase.Column
import pt.isep.edom.project.c4.mm.dbase.DbaseModel
import pt.isep.edom.project.c4.mm.dbase.Table

class DbaseFormatter extends AbstractFormatter2 {
	
	@Inject extension DbaseGrammarAccess

	def dispatch void format(DbaseModel dbaseModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Table table : dbaseModel.getTables()) {
			table.format;
		}
	}

	def dispatch void format(Table table, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Column column : table.getColumns()) {
			column.format;
		}
	}
	
	// TODO: implement for Column
}