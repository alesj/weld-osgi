/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jboss.weld.environment.osgi;

import java.util.HashSet;
import java.util.Set;
import org.jboss.weld.bootstrap.api.Environment;
import org.jboss.weld.bootstrap.api.Service;
import org.jboss.weld.resources.spi.ResourceLoader;
import org.jboss.weld.resources.spi.ScheduledExecutorServiceFactory;
import org.jboss.weld.serialization.spi.ProxyServices;

/**
 *
 * @author mathieu
 */
public class OSGiEnvironment implements Environment {

    @Override
    public Set<Class<? extends Service>> getRequiredDeploymentServices() {
        HashSet set = new HashSet();
        set.add(ScheduledExecutorServiceFactory.class);
        return set;
    }

    @Override
    public Set<Class<? extends Service>> getRequiredBeanDeploymentArchiveServices() {
        HashSet set = new HashSet();
        set.add(ResourceLoader.class);
        set.add(ProxyServices.class);
        return set;
    }
}
