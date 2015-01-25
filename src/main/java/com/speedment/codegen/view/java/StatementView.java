/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.codegen.view.java;

import com.speedment.codegen.CodeGenerator;
import com.speedment.codegen.model.statement.Statement_;
import com.speedment.codegen.view.CodeView;
import java.util.Optional;

/**
 *
 * @author Duncan
 */
public class StatementView extends CodeView<Statement_> {
	@Override
	public Optional<CharSequence> render(CodeGenerator renderer, Statement_ statement) {
		return Optional.of(statement.getStatementText());
	}
}