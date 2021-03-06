/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.formfilter;

import org.openmrs.Patient;
import org.openmrs.User;

/**
 * This interface helps to create form filters.
 */
public interface FormFilterHandler {
	
	/**
	 * This method holds the logic to return true or false for given Patient and User.
	 * 
	 * @param patient against which filter should be defined
	 * @param user against which filter should be defined
	 * @return True/False ,if filter properties satisfy provided condition.
	 */
	public boolean shouldDisplayForm(Patient p, User u);
	
}
