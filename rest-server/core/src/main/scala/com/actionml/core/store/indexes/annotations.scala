/*
 * Copyright ActionML, LLC under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * ActionML licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.actionml.core.store.indexes

import com.actionml.core.store.Ordering._

import scala.concurrent.duration.Duration


object annotations {

  sealed trait Index
  case class SingleIndex(order: Ordering, isTtl: Boolean) extends scala.annotation.StaticAnnotation with Index
  case class CompoundIndex(fields: List[(String, Ordering)]) extends scala.annotation.StaticAnnotation with Index
}
