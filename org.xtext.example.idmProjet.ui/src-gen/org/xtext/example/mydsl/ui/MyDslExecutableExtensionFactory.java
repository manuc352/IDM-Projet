/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.idmProjet.ui.internal.IdmProjetActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(IdmProjetActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		IdmProjetActivator activator = IdmProjetActivator.getInstance();
		return activator != null ? activator.getInjector(IdmProjetActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL) : null;
	}

}