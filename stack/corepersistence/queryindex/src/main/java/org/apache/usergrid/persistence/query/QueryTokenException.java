/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  The ASF licenses this file to You
 * under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  For additional information regarding
 * copyright in this work, please see the NOTICE file in the top level
 * directory of this distribution.
 */
package org.apache.usergrid.persistence.query;


/**
 * An exception thrown when a query encounters a token it doesn't recognize
 * @author tnine
 */
public class QueryTokenException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;




    /**
     * @param arg0
     */
    public QueryTokenException( Throwable arg0 ) {
        super( arg0 );
    }


    @Override
    public String getMessage() {
        //antlr errors or strange.  We have to do this, there's no message
        return getCause().toString();
    }


    @Override
    public String getLocalizedMessage() {
        return getMessage();
    }
}
