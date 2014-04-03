package test.server;

import org.realityforge.gwt.appcache.server.mgwt.AbstractMgwtManifestServlet;
import org.realityforge.gwt.appcache.server.mgwt.MgwtOsPropertyProvider;
import org.realityforge.gwt.appcache.server.mgwt.MobileUserAgentProvider;
import org.realityforge.gwt.appcache.server.propertyprovider.UserAgentPropertyProvider;


public class ManifestServlet extends AbstractMgwtManifestServlet {

	private static final long serialVersionUID = -1788095762627945145L;

	public ManifestServlet() {
		addPropertyProvider( new MgwtOsPropertyProvider() );
	    addPropertyProvider( new UserAgentPropertyProvider() );
	    addPropertyProvider( new MobileUserAgentProvider() );
//	    addPropertyProvider( new PhoneGapPropertyProvider() );
	}
	
}
