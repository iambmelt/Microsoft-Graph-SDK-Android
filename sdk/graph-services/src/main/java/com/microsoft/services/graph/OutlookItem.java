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





/**
 * The type Outlook Item.
*/
public class OutlookItem extends Entity {

    public OutlookItem(){
        setODataType("#microsoft.graph.outlookItem");
    }
            
    private java.util.Calendar createdDateTime;
     
    /**
    * Gets the created Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getCreatedDateTime() {
        return this.createdDateTime; 
    }

    /**
    * Sets the created Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setCreatedDateTime(java.util.Calendar value) { 
        this.createdDateTime = value; 
        valueChanged("createdDateTime", value);

    }
            
    private java.util.Calendar lastModifiedDateTime;
     
    /**
    * Gets the last Modified Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedDateTime() {
        return this.lastModifiedDateTime; 
    }

    /**
    * Sets the last Modified Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedDateTime(java.util.Calendar value) { 
        this.lastModifiedDateTime = value; 
        valueChanged("lastModifiedDateTime", value);

    }
            
    private String changeKey;
     
    /**
    * Gets the change Key.
    *
    * @return the String
    */
    public String getChangeKey() {
        return this.changeKey; 
    }

    /**
    * Sets the change Key.
    *
    * @param value the String
    */
    public void setChangeKey(String value) { 
        this.changeKey = value; 
        valueChanged("changeKey", value);

    }
    
        
    private java.util.List<String> categories = null;
    
    
     
    /**
    * Gets the categories.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getCategories() {
        return this.categories; 
    }

    /**
    * Sets the categories.
    *
    * @param value the java.util.List<String>
    */
    public void setCategories(java.util.List<String> value) { 
        this.categories = value; 
        valueChanged("categories", value);

    }
}

