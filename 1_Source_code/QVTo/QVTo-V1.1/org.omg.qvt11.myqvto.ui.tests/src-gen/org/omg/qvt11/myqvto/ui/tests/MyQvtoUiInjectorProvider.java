/*
 * generated by Xtext 2.25.0
 */
package org.omg.qvt11.myqvto.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.omg.qvt11.myqvto.ui.internal.MyqvtoActivator;

public class MyQvtoUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MyqvtoActivator.getInstance().getInjector("org.omg.qvt11.myqvto.MyQvto");
	}

}
