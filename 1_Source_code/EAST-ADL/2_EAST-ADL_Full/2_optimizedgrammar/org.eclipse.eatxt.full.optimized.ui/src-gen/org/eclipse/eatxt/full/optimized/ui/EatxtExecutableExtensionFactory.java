/*
 * generated by Xtext 2.25.0
 */
package org.eclipse.eatxt.full.optimized.ui;

import com.google.inject.Injector;
import org.eclipse.eatxt.full.optimized.ui.internal.OptimizedActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EatxtExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(OptimizedActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		OptimizedActivator activator = OptimizedActivator.getInstance();
		return activator != null ? activator.getInjector(OptimizedActivator.ORG_ECLIPSE_EATXT_FULL_OPTIMIZED_EATXT) : null;
	}

}
