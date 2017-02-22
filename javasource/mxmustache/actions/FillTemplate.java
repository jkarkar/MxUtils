// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxmustache.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import mxmustache.template.MxObjectToHashmapConverter;
import mxmustache.template.TemplateEngineJMustache;

public class FillTemplate extends CustomJavaAction<java.lang.String>
{
	private java.lang.String Template;
	private IMendixObject Data;
	private java.lang.Boolean RunMarkdown;
	private java.lang.Long NoObjectLevels;

	public FillTemplate(IContext context, java.lang.String Template, IMendixObject Data, java.lang.Boolean RunMarkdown, java.lang.Long NoObjectLevels)
	{
		super(context);
		this.Template = Template;
		this.Data = Data;
		this.RunMarkdown = RunMarkdown;
		this.NoObjectLevels = NoObjectLevels;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
        ILogNode logger = Core.getLogger(FillTemplate.class.getName());
        logger.info("executeAction: " + this.Data + ", " + this.Template);
        TemplateEngineJMustache te = new TemplateEngineJMustache();
        Object o = MxObjectToHashmapConverter.writeMxObjectToHashMap(this.getContext(), this.Data, NoObjectLevels.intValue());
        logger.info("data: " + o);
        String result = te.execute(this.Template, o, this.RunMarkdown);
        return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "FillTemplate";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
