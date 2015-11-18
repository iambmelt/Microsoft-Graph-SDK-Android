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
 * The type Photo.
*/
public class Photo extends ODataBaseEntity {

    public Photo(){
        setODataType("#microsoft.graph.photo");
    }

    private String cameraMake;

    /**
    * Gets the camera Make.
    *
    * @return the String
    */
    public String getCameraMake() {
        return this.cameraMake; 
    }

    /**
    * Sets the camera Make.
    *
    * @param value the String
    */
    public void setCameraMake(String value) { 
        this.cameraMake = value;
        valueChanged("cameraMake", value);

    }

    private String cameraModel;

    /**
    * Gets the camera Model.
    *
    * @return the String
    */
    public String getCameraModel() {
        return this.cameraModel; 
    }

    /**
    * Sets the camera Model.
    *
    * @param value the String
    */
    public void setCameraModel(String value) { 
        this.cameraModel = value;
        valueChanged("cameraModel", value);

    }

    private Double exposureDenominator;

    /**
    * Gets the exposure Denominator.
    *
    * @return the Double
    */
    public Double getExposureDenominator() {
        return this.exposureDenominator; 
    }

    /**
    * Sets the exposure Denominator.
    *
    * @param value the Double
    */
    public void setExposureDenominator(Double value) { 
        this.exposureDenominator = value;
        valueChanged("exposureDenominator", value);

    }

    private Double exposureNumerator;

    /**
    * Gets the exposure Numerator.
    *
    * @return the Double
    */
    public Double getExposureNumerator() {
        return this.exposureNumerator; 
    }

    /**
    * Sets the exposure Numerator.
    *
    * @param value the Double
    */
    public void setExposureNumerator(Double value) { 
        this.exposureNumerator = value;
        valueChanged("exposureNumerator", value);

    }

    private Double focalLength;

    /**
    * Gets the focal Length.
    *
    * @return the Double
    */
    public Double getFocalLength() {
        return this.focalLength; 
    }

    /**
    * Sets the focal Length.
    *
    * @param value the Double
    */
    public void setFocalLength(Double value) { 
        this.focalLength = value;
        valueChanged("focalLength", value);

    }

    private Double fNumber;

    /**
    * Gets the f Number.
    *
    * @return the Double
    */
    public Double getFNumber() {
        return this.fNumber; 
    }

    /**
    * Sets the f Number.
    *
    * @param value the Double
    */
    public void setFNumber(Double value) { 
        this.fNumber = value;
        valueChanged("fNumber", value);

    }

    private java.util.Calendar takenDateTime;

    /**
    * Gets the taken Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getTakenDateTime() {
        return this.takenDateTime; 
    }

    /**
    * Sets the taken Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setTakenDateTime(java.util.Calendar value) { 
        this.takenDateTime = value;
        valueChanged("takenDateTime", value);

    }

    private Integer iso;

    /**
    * Gets the iso.
    *
    * @return the Integer
    */
    public Integer getIso() {
        return this.iso; 
    }

    /**
    * Sets the iso.
    *
    * @param value the Integer
    */
    public void setIso(Integer value) { 
        this.iso = value;
        valueChanged("iso", value);

    }
}
