/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.mmapdsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import pt.isep.edom.mmapdsl.ui.internal.MmapdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MMapDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MmapdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MmapdslActivator.getInstance().getInjector(MmapdslActivator.PT_ISEP_EDOM_MMAPDSL_MMAPDSL);
	}
	
}