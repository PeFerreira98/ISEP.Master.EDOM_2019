/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c2.dsl.rest


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RestStandaloneSetup extends RestStandaloneSetupGenerated {

	def static void doSetup() {
		new RestStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}