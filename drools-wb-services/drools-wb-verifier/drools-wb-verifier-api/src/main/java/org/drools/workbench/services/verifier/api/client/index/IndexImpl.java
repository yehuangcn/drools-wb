/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.workbench.services.verifier.api.client.index;

public class IndexImpl
        implements Index {

    private Rules rules = new Rules();

    private Columns columns = new Columns();

    private ObjectTypes objectTypes = new ObjectTypes();

    @Override
    public Rules getRules() {
        return rules;
    }

    @Override
    public Columns getColumns() {
        return columns;
    }

    @Override
    public ObjectTypes getObjectTypes() {
        return objectTypes;
    }
}