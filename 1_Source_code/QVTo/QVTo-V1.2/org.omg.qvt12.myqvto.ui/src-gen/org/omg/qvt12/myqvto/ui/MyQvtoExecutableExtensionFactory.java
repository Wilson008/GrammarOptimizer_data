/*
 * generated by Xtext 2.25.0
 */
package org.omg.qvt12.myqvto.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.omg.qvt12.myqvto.ui.internal.MyqvtoActivator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyQvtoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MyqvtoActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MyqvtoActivator activator = MyqvtoActivator.getInstance();
		return activator != null ? activator.getInjector(MyqvtoActivator.ORG_OMG_QVT12_MYQVTO_MYQVTO) : null;
	}

}
