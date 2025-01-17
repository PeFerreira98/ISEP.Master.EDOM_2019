/**
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c2.dsl.rest.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import pt.isep.edom.project.c2.dsl.rest.RestRuntimeModule;
import pt.isep.edom.project.c2.dsl.rest.RestStandaloneSetup;
import pt.isep.edom.project.c2.dsl.rest.ide.RestIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RestIdeSetup extends RestStandaloneSetup {
  @Override
  public Injector createInjector() {
    RestRuntimeModule _restRuntimeModule = new RestRuntimeModule();
    RestIdeModule _restIdeModule = new RestIdeModule();
    return Guice.createInjector(Modules2.mixin(_restRuntimeModule, _restIdeModule));
  }
}
