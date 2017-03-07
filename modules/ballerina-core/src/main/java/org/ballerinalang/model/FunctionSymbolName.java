/*
*  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.model;

import org.ballerinalang.model.types.BType;

/**
 * {@code FunctionSymbolName} represents a package qualified name of a {@link Symbol} in Ballerina.
 *
 * @since 0.8.4
 */
public class FunctionSymbolName extends SymbolName {
    private int noOfParameters;
    private String funcName;
    private BType[] types;

    public FunctionSymbolName(String name, String funcName, String pkgPath, int noOfParameters, BType[] types) {
        super(name, pkgPath);
        this.funcName = funcName;
        this.noOfParameters = noOfParameters;
        this.types = types;
    }

    public FunctionSymbolName(String name, String funcName, int noOfParameters, BType[] types) {
        super(name);
        this.funcName = funcName;
        this.noOfParameters = noOfParameters;
        this.types = types;
    }

    public int getNoOfParameters() {
        return noOfParameters;
    }

    public String getFuncName() {
        return funcName;
    }

    public BType[] getTypes() {
        return types;
    }
}
