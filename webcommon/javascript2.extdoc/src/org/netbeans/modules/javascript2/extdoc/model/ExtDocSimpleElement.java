/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.javascript2.extdoc.model;

/**
 * Represents simple extDoc elements without any additional type or description etc.
 * <p>
 * <i>Examples:</i> @private, @method, @hide, @static, ...
 *
 * @author Martin Fousek <marfous@netbeans.org>
 */
public class ExtDocSimpleElement extends ExtDocBaseElement {

    private ExtDocSimpleElement(ExtDocElementType type) {
        super(type);
    }

    /**
     * Creates new {@code ExtDocSimpleElement}.
     * @param type simple type (tag), never {@code null}
     */
    public static ExtDocSimpleElement create(ExtDocElementType type) {
        return new ExtDocSimpleElement(type);
    }

}
