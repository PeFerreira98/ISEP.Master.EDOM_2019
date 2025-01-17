/**
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c4.dsl.dbase.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import pt.isep.edom.project.c4.dsl.dbase.DbaseRuntimeModule;
import pt.isep.edom.project.c4.dsl.dbase.DbaseStandaloneSetup;
import pt.isep.edom.project.c4.dsl.dbase.ide.DbaseIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DbaseIdeSetup extends DbaseStandaloneSetup {
  @Override
  public Injector createInjector() {
    DbaseRuntimeModule _dbaseRuntimeModule = new DbaseRuntimeModule();
    DbaseIdeModule _dbaseIdeModule = new DbaseIdeModule();
    return Guice.createInjector(Modules2.mixin(_dbaseRuntimeModule, _dbaseIdeModule));
  }
}
