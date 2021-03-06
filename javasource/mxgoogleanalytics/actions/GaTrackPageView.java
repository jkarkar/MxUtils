// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxgoogleanalytics.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import mxgoogleanalytics.impl.GoogleAnalyticsConnector;
import mxgoogleanalytics.proxies.constants.Constants;

public class GaTrackPageView extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String ProjectToken;
	private java.lang.String ClientId;
	private java.lang.String UserId;
	private java.lang.String DocumentHostname;
	private java.lang.String Page;
	private java.lang.String Title;

	public GaTrackPageView(IContext context, java.lang.String ProjectToken, java.lang.String ClientId, java.lang.String UserId, java.lang.String DocumentHostname, java.lang.String Page, java.lang.String Title)
	{
		super(context);
		this.ProjectToken = ProjectToken;
		this.ClientId = ClientId;
		this.UserId = UserId;
		this.DocumentHostname = DocumentHostname;
		this.Page = Page;
		this.Title = Title;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        GoogleAnalyticsConnector conn = new GoogleAnalyticsConnector();
        conn.setLogger(Core.getLogger(GoogleAnalyticsConnector.LOGNODE));
        conn.setDebug(Constants.getGA_DEBUG());
        conn.trackPageView(this.ProjectToken, this.ClientId, this.UserId, this.DocumentHostname, this.Page, this.Title);
        return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GaTrackPageView";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
