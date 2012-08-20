/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *	or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *	regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package com.googlecode.fitchy.exception;

/**
 * Exception is thrown from {@link com.googlecode.fitchy.FeatureContext} when the system wants
 * to add a feature if it already added.
 *
 * User: Andreas Kaubisch <andreas.kaubisch@gmail.com>
 * Date: 6/28/12
 * Time: 6:37 PM
 */
public class FeatureAlreadyExistsException extends RuntimeException {
    public FeatureAlreadyExistsException() {
    }

    public FeatureAlreadyExistsException(String message) {
        super(message);
    }

    public FeatureAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public FeatureAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public FeatureAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
