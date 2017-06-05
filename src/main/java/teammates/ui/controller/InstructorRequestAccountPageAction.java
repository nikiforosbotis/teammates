package teammates.ui.controller;

import teammates.common.util.Assumption;
import teammates.common.util.Const;
import teammates.ui.pagedata.RequestPageData;

/**
 * Action: showing page to request an account for an instructor.
 */

public class InstructorRequestAccountPageAction extends Action {
	
	@Override
    public ActionResult execute() {
        String name = getRequestParamValue(Const.ParamsNames.FULL_NAME);
        String university = getRequestParamValue(Const.ParamsNames.UNIVERSITY);
        String country = getRequestParamValue(Const.ParamsNames.COUNTRY);
        String url = getRequestParamValue(Const.ParamsNames.URL);
        String email = getRequestParamValue(Const.ParamsNames.INSTITUTIONAL_EMAIL);
        String comments = getRequestParamValue(Const.ParamsNames.INSTRUCTOR_COMMENTS);

        Assumption.assertNotNull(name);
        Assumption.assertNotNull(university);
        Assumption.assertNotNull(email);

        //Setup page data for 'Request Account' page for an instructor 
        RequestPageData pageData = new RequestPageData(name, university, country, url, email, comments);

        return createShowPageResult(Const.ViewURIs.INSTRUCTOR_ACCOUNT_REQUEST, pageData);
    }

}
