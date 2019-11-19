/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c2.dsl.rest.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import pt.isep.edom.project.c2.dsl.rest.services.RestGrammarAccess
import pt.isep.edom.project.c2.mm.rest.Resource
import pt.isep.edom.project.c2.mm.rest.RestModel

class RestFormatter extends AbstractFormatter2 {
	
	@Inject extension RestGrammarAccess

	def dispatch void format(RestModel restModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Resource resource : restModel.getResources()) {
			resource.format;
		}
	}

	def dispatch void format(Resource resource, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Resource _resource : resource.getSubresource()) {
			_resource.format;
		}
	}
	
	// TODO: implement for 
}