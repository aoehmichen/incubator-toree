/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

//
// TEST DEPENDENCIES
//
libraryDependencies ++= 
  Seq(
       (if (Common.sparkVersion.contains("cdh")) "org.spark-project.akka" % "akka-testkit_2.10" % "2.2.3-shaded-protobuf" % "test" else "org.spark-project.akka" %% "akka-testkit" % "2.3.4-spark" % "test"), // MIT
       "com.google.guava"  % "guava" % "19.0"
     )
