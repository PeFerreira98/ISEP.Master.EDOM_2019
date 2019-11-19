/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.mmapdsl.tests

import com.google.inject.Inject
import mindmap.Map
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MMapDslInjectorProvider)
class MMapDslParsingTest {
	@Inject
	ParseHelper<Map> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Map { elements { 
				Topic Agenda { subtopics ( Contacts , Meeting ) } , 
				Topic Contacts { parent Agenda } , 
				Topic Meeting { parent Agenda }, 
				Topic NewTopic {}
			} }
		''') 
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}