/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Corporation. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Special Folder.
*/
public class SpecialFolder extends ODataBaseEntity {

    public SpecialFolder(){
        setODataType("#microsoft.graph.specialFolder");
    }

    private String name;

    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getName() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.name = value;
        valueChanged("name", value);

    }
}
