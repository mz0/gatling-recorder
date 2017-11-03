/*
 * Copyright 2011-2017 GatlingCorp (http://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.recorder.ui.swing.util

import io.gatling.recorder.util.Labelled

import scala.swing.ComboBox
import scala.swing.ListView.Renderer

private[swing] class LabelledComboBox[T <: Labelled](elements: List[T]) extends ComboBox[T](elements) {
  selection.index = 0
  renderer = Renderer(_.label)
}
