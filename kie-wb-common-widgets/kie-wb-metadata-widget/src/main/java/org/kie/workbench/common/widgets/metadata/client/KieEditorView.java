/*
 * Copyright 2014 JBoss Inc
 *
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
 */

package org.kie.workbench.common.widgets.metadata.client;

import com.google.gwt.user.client.ui.IsWidget;
import org.uberfire.ext.widgets.common.client.common.HasBusyIndicator;

public interface KieEditorView
        extends HasBusyIndicator,
                IsWidget {

    void showLoading();

    void showSaving();

    void alertReadOnly();

    KieEditorTitle getTitleWidget();

    void refreshTitle( String fileName,
                       String description );

    boolean confirmClose();

}
