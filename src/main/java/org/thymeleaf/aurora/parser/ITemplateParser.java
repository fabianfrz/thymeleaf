/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.aurora.parser;

import org.thymeleaf.aurora.context.ITemplateProcessingContext;
import org.thymeleaf.aurora.engine.ITemplateHandler;
import org.thymeleaf.aurora.resource.IResource;
import org.thymeleaf.aurora.text.ITextRepository;


/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface ITemplateParser {


    public void parse(final IResource templateResource,
                      final ITextRepository textRepository,
                      final ITemplateHandler handler);

    public void parse(final IResource templateResource,
                      final String dialectPrefix, final String[] selectors,
                      final ITextRepository textRepository,
                      final ITemplateHandler handler);

}