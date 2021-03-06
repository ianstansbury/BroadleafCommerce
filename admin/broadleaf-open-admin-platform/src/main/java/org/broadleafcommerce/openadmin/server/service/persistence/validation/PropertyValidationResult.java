/*
 * #%L
 * BroadleafCommerce Open Admin Platform
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.openadmin.server.service.persistence.validation;


/**
 * Empty DTO for now that just denotes that this validation error is from a property
 *
 * @author Phillip Verheyden (phillipuniverse)
 * @see {@link PropertyValidator}
 */
public class PropertyValidationResult extends GlobalValidationResult {

    public PropertyValidationResult(boolean valid, String errorMessage) {
        super(valid, errorMessage);
    }
    
    public PropertyValidationResult(boolean valid) {
        super(valid);
    }
    
}
