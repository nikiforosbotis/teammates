package teammates.ui.controller;

import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.util.Assumption;
import teammates.common.util.Const;
import teammates.ui.pagedata.InstructorAccountRequestResultPageData;

/**
 * Action: saving the details of the new applicant-instructor.
 */
public class InstructorRequestAccountSaveAction extends Action {

	 @Override
	 public ActionResult execute() throws EntityDoesNotExistException {
	     String name = getRequestParamValue(Const.ParamsNames.FULL_NAME);
	     Assumption.assertPostParamNotNull(Const.ParamsNames.FULL_NAME, name);
	     String university = getRequestParamValue(Const.ParamsNames.UNIVERSITY);
	     Assumption.assertPostParamNotNull(Const.ParamsNames.UNIVERSITY, university);
	     String country = getRequestParamValue(Const.ParamsNames.COUNTRY);
	     String email = getRequestParamValue(Const.ParamsNames.INSTITUTIONAL_EMAIL);
	     Assumption.assertPostParamNotNull(Const.ParamsNames.INSTITUTIONAL_EMAIL, email);
	     String url = getRequestParamValue(Const.ParamsNames.URL);
	     String comments = getRequestParamValue(Const.ParamsNames.INSTRUCTOR_COMMENTS);

	     /* Setup data for process results */
	     try {
	         InstructorAccountRequestResultPageData pageData = new InstructorAccountRequestResultPageData(name,
	                                                                 university, country, email, url, comments);

	         return createShowPageResult(Const.ViewURIs.INSTRUCTOR_ACCOUNT_REQUEST_RESULT, pageData);
	    } finally {
	    }
	 }
}
