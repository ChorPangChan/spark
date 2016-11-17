/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.streaming.status.api.v1

import java.util.Date

class StreamingInfo private[streaming](
  val name: String,
  val completedBatchCount: Long
)

class StreamingStatistics private[streaming](
  val startTime: Date,
  val batchDuration: Long,
  val numReceivers: Int,
  val numActiveReceivers: Int,
  val numInactiveReceivers: Int,
  val numTotalCompletedBatches: Long,
  val numRetainedCompletedBatches: Long,
  val numActiveBatches: Long,
  val numProcessedRecords: Long,
  val numReceivedRecords: Long,
  val avgInputRate: Option[Double],
  val avgSchedulingDelay: Option[Long],
  val avgProcessingTime: Option[Long],
  val avgTotalDelay: Option[Long]
)

class ReceiverInfo private[streaming](
  val streamId: Int,
  val streamName: String,
  val isActive: Option[Boolean],
  val executorId: Option[String],
  val executorHost: Option[String],
  val lastErrorTime: Option[Long],
  val lastErrorMessage: Option[String],
  val lastError: Option[String],
  val avgEventRate: Option[Double],
  val eventRates: Seq[(Long, Double)]
)
