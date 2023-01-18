/*
 * generated by Xtext 2.25.0
 */
package org.eclipse.eatxt.simplified.optimized.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.eatxt.simplified.optimized.EatxtRuntimeModule;
import org.eclipse.eatxt.simplified.optimized.EatxtStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class EatxtIdeSetup extends EatxtStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new EatxtRuntimeModule(), new EatxtIdeModule()));
	}
	
}
