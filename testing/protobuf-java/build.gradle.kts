/*
 * Copyright (c) 2019 Toast Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.google.protobuf.gradle.ProtobufExtension
import com.google.protobuf.gradle.proto

plugins {
    id("protokt.jvm-conventions")
    id("com.google.protobuf")
}

dependencies {
    implementation(libraries.protobufJava)
}

sourceSets {
    main {
        proto {
            srcDir("${project.rootDir}/testing/runtime-tests/src/main/proto")
        }
    }
}

configure<ProtobufExtension> {
    protoc {
        artifact = libraries.protoc
    }
}
