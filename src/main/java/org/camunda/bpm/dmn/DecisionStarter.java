/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.camunda.bpm.dmn;

import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.dmn.engine.DmnEngine;
import org.camunda.bpm.dmn.engine.impl.DefaultDmnEngineConfiguration;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

public class DecisionStarter {

  public static void main(String[] args) {
    DmnEngine dmnEngine = new DefaultDmnEngineConfiguration().buildEngine();

    VariableMap variables = Variables.createVariables()
      .putValue("status", "silver")
      .putValue("sum", 9000);

    DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable("decision", "Example.dmn", variables);

    System.out.println("Decision Result: " + results);
  }

}
