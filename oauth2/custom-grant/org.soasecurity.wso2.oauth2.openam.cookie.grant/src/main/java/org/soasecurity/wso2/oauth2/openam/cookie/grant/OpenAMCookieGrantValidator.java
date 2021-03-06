/*
 * Copyright (c) soasecurity.org  All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.soasecurity.wso2.oauth2.openam.cookie.grant;

import org.apache.oltu.oauth2.common.validators.AbstractValidator;

import javax.servlet.http.HttpServletRequest;


/**
 * This validate the OpenAM Cookie grant request.
 */
public class OpenAMCookieGrantValidator extends AbstractValidator<HttpServletRequest> {


    public OpenAMCookieGrantValidator() {

        //cookie must be as a request parameter
        requiredParams.add(OpenAMCookieGrantHandler.OPENAM_COOKIE_GRANT_PARAM);
    }
}
