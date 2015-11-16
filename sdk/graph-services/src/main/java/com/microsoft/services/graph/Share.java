/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;





/**
 * The type Share.
*/
public class Share extends Entity {

    public Share(){
        setODataType("#microsoft.graph.share");
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
            
    private IdentitySet owner;
     
    /**
    * Gets the owner.
    *
    * @return the IdentitySet
    */
    public IdentitySet getOwner() {
        return this.owner; 
    }

    /**
    * Sets the owner.
    *
    * @param value the IdentitySet
    */
    public void setOwner(IdentitySet value) { 
        this.owner = value; 
        valueChanged("owner", value);

    }
    
        
    private java.util.List<DriveItem> items = null;
    
    
     
    /**
    * Gets the items.
    *
    * @return the java.util.List<DriveItem>
    */
    public java.util.List<DriveItem> getItems() {
        return this.items; 
    }

    /**
    * Sets the items.
    *
    * @param value the java.util.List<DriveItem>
    */
    public void setItems(java.util.List<DriveItem> value) { 
        this.items = value; 
        valueChanged("items", value);

    }
}
