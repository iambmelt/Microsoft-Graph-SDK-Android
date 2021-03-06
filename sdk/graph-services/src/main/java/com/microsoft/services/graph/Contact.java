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
 * The type Contact.
*/
public class Contact extends OutlookItem {

    public Contact(){
        setODataType("#microsoft.graph.contact");
    }
            
    private String parentFolderId;
     
    /**
    * Gets the parent Folder Id.
    *
    * @return the String
    */
    public String getParentFolderId() {
        return this.parentFolderId; 
    }

    /**
    * Sets the parent Folder Id.
    *
    * @param value the String
    */
    public void setParentFolderId(String value) { 
        this.parentFolderId = value; 
        valueChanged("parentFolderId", value);

    }
            
    private java.util.Calendar birthday;
     
    /**
    * Gets the birthday.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getBirthday() {
        return this.birthday; 
    }

    /**
    * Sets the birthday.
    *
    * @param value the java.util.Calendar
    */
    public void setBirthday(java.util.Calendar value) { 
        this.birthday = value; 
        valueChanged("birthday", value);

    }
            
    private String fileAs;
     
    /**
    * Gets the file As.
    *
    * @return the String
    */
    public String getFileAs() {
        return this.fileAs; 
    }

    /**
    * Sets the file As.
    *
    * @param value the String
    */
    public void setFileAs(String value) { 
        this.fileAs = value; 
        valueChanged("fileAs", value);

    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.displayName = value; 
        valueChanged("displayName", value);

    }
            
    private String givenName;
     
    /**
    * Gets the given Name.
    *
    * @return the String
    */
    public String getGivenName() {
        return this.givenName; 
    }

    /**
    * Sets the given Name.
    *
    * @param value the String
    */
    public void setGivenName(String value) { 
        this.givenName = value; 
        valueChanged("givenName", value);

    }
            
    private String initials;
     
    /**
    * Gets the initials.
    *
    * @return the String
    */
    public String getInitials() {
        return this.initials; 
    }

    /**
    * Sets the initials.
    *
    * @param value the String
    */
    public void setInitials(String value) { 
        this.initials = value; 
        valueChanged("initials", value);

    }
            
    private String middleName;
     
    /**
    * Gets the middle Name.
    *
    * @return the String
    */
    public String getMiddleName() {
        return this.middleName; 
    }

    /**
    * Sets the middle Name.
    *
    * @param value the String
    */
    public void setMiddleName(String value) { 
        this.middleName = value; 
        valueChanged("middleName", value);

    }
            
    private String nickName;
     
    /**
    * Gets the nick Name.
    *
    * @return the String
    */
    public String getNickName() {
        return this.nickName; 
    }

    /**
    * Sets the nick Name.
    *
    * @param value the String
    */
    public void setNickName(String value) { 
        this.nickName = value; 
        valueChanged("nickName", value);

    }
            
    private String surname;
     
    /**
    * Gets the surname.
    *
    * @return the String
    */
    public String getSurname() {
        return this.surname; 
    }

    /**
    * Sets the surname.
    *
    * @param value the String
    */
    public void setSurname(String value) { 
        this.surname = value; 
        valueChanged("surname", value);

    }
            
    private String title;
     
    /**
    * Gets the title.
    *
    * @return the String
    */
    public String getTitle() {
        return this.title; 
    }

    /**
    * Sets the title.
    *
    * @param value the String
    */
    public void setTitle(String value) { 
        this.title = value; 
        valueChanged("title", value);

    }
            
    private String yomiGivenName;
     
    /**
    * Gets the yomi Given Name.
    *
    * @return the String
    */
    public String getYomiGivenName() {
        return this.yomiGivenName; 
    }

    /**
    * Sets the yomi Given Name.
    *
    * @param value the String
    */
    public void setYomiGivenName(String value) { 
        this.yomiGivenName = value; 
        valueChanged("yomiGivenName", value);

    }
            
    private String yomiSurname;
     
    /**
    * Gets the yomi Surname.
    *
    * @return the String
    */
    public String getYomiSurname() {
        return this.yomiSurname; 
    }

    /**
    * Sets the yomi Surname.
    *
    * @param value the String
    */
    public void setYomiSurname(String value) { 
        this.yomiSurname = value; 
        valueChanged("yomiSurname", value);

    }
            
    private String yomiCompanyName;
     
    /**
    * Gets the yomi Company Name.
    *
    * @return the String
    */
    public String getYomiCompanyName() {
        return this.yomiCompanyName; 
    }

    /**
    * Sets the yomi Company Name.
    *
    * @param value the String
    */
    public void setYomiCompanyName(String value) { 
        this.yomiCompanyName = value; 
        valueChanged("yomiCompanyName", value);

    }
            
    private String generation;
     
    /**
    * Gets the generation.
    *
    * @return the String
    */
    public String getGeneration() {
        return this.generation; 
    }

    /**
    * Sets the generation.
    *
    * @param value the String
    */
    public void setGeneration(String value) { 
        this.generation = value; 
        valueChanged("generation", value);

    }
    
        
    private java.util.List<EmailAddress> emailAddresses = null;
    
    
     
    /**
    * Gets the email Addresses.
    *
    * @return the java.util.List<EmailAddress>
    */
    public java.util.List<EmailAddress> getEmailAddresses() {
        return this.emailAddresses; 
    }

    /**
    * Sets the email Addresses.
    *
    * @param value the java.util.List<EmailAddress>
    */
    public void setEmailAddresses(java.util.List<EmailAddress> value) { 
        this.emailAddresses = value; 
        valueChanged("emailAddresses", value);

    }
    
        
    private java.util.List<String> imAddresses = null;
    
    
     
    /**
    * Gets the im Addresses.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getImAddresses() {
        return this.imAddresses; 
    }

    /**
    * Sets the im Addresses.
    *
    * @param value the java.util.List<String>
    */
    public void setImAddresses(java.util.List<String> value) { 
        this.imAddresses = value; 
        valueChanged("imAddresses", value);

    }
            
    private String jobTitle;
     
    /**
    * Gets the job Title.
    *
    * @return the String
    */
    public String getJobTitle() {
        return this.jobTitle; 
    }

    /**
    * Sets the job Title.
    *
    * @param value the String
    */
    public void setJobTitle(String value) { 
        this.jobTitle = value; 
        valueChanged("jobTitle", value);

    }
            
    private String companyName;
     
    /**
    * Gets the company Name.
    *
    * @return the String
    */
    public String getCompanyName() {
        return this.companyName; 
    }

    /**
    * Sets the company Name.
    *
    * @param value the String
    */
    public void setCompanyName(String value) { 
        this.companyName = value; 
        valueChanged("companyName", value);

    }
            
    private String department;
     
    /**
    * Gets the department.
    *
    * @return the String
    */
    public String getDepartment() {
        return this.department; 
    }

    /**
    * Sets the department.
    *
    * @param value the String
    */
    public void setDepartment(String value) { 
        this.department = value; 
        valueChanged("department", value);

    }
            
    private String officeLocation;
     
    /**
    * Gets the office Location.
    *
    * @return the String
    */
    public String getOfficeLocation() {
        return this.officeLocation; 
    }

    /**
    * Sets the office Location.
    *
    * @param value the String
    */
    public void setOfficeLocation(String value) { 
        this.officeLocation = value; 
        valueChanged("officeLocation", value);

    }
            
    private String profession;
     
    /**
    * Gets the profession.
    *
    * @return the String
    */
    public String getProfession() {
        return this.profession; 
    }

    /**
    * Sets the profession.
    *
    * @param value the String
    */
    public void setProfession(String value) { 
        this.profession = value; 
        valueChanged("profession", value);

    }
            
    private String businessHomePage;
     
    /**
    * Gets the business Home Page.
    *
    * @return the String
    */
    public String getBusinessHomePage() {
        return this.businessHomePage; 
    }

    /**
    * Sets the business Home Page.
    *
    * @param value the String
    */
    public void setBusinessHomePage(String value) { 
        this.businessHomePage = value; 
        valueChanged("businessHomePage", value);

    }
            
    private String assistantName;
     
    /**
    * Gets the assistant Name.
    *
    * @return the String
    */
    public String getAssistantName() {
        return this.assistantName; 
    }

    /**
    * Sets the assistant Name.
    *
    * @param value the String
    */
    public void setAssistantName(String value) { 
        this.assistantName = value; 
        valueChanged("assistantName", value);

    }
            
    private String manager;
     
    /**
    * Gets the manager.
    *
    * @return the String
    */
    public String getManager() {
        return this.manager; 
    }

    /**
    * Sets the manager.
    *
    * @param value the String
    */
    public void setManager(String value) { 
        this.manager = value; 
        valueChanged("manager", value);

    }
    
        
    private java.util.List<String> homePhones = null;
    
    
     
    /**
    * Gets the home Phones.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getHomePhones() {
        return this.homePhones; 
    }

    /**
    * Sets the home Phones.
    *
    * @param value the java.util.List<String>
    */
    public void setHomePhones(java.util.List<String> value) { 
        this.homePhones = value; 
        valueChanged("homePhones", value);

    }
    
        
    private java.util.List<String> businessPhones = null;
    
    
     
    /**
    * Gets the business Phones.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getBusinessPhones() {
        return this.businessPhones; 
    }

    /**
    * Sets the business Phones.
    *
    * @param value the java.util.List<String>
    */
    public void setBusinessPhones(java.util.List<String> value) { 
        this.businessPhones = value; 
        valueChanged("businessPhones", value);

    }
            
    private PhysicalAddress homeAddress;
     
    /**
    * Gets the home Address.
    *
    * @return the PhysicalAddress
    */
    public PhysicalAddress getHomeAddress() {
        return this.homeAddress; 
    }

    /**
    * Sets the home Address.
    *
    * @param value the PhysicalAddress
    */
    public void setHomeAddress(PhysicalAddress value) { 
        this.homeAddress = value; 
        valueChanged("homeAddress", value);

    }
            
    private PhysicalAddress businessAddress;
     
    /**
    * Gets the business Address.
    *
    * @return the PhysicalAddress
    */
    public PhysicalAddress getBusinessAddress() {
        return this.businessAddress; 
    }

    /**
    * Sets the business Address.
    *
    * @param value the PhysicalAddress
    */
    public void setBusinessAddress(PhysicalAddress value) { 
        this.businessAddress = value; 
        valueChanged("businessAddress", value);

    }
            
    private PhysicalAddress otherAddress;
     
    /**
    * Gets the other Address.
    *
    * @return the PhysicalAddress
    */
    public PhysicalAddress getOtherAddress() {
        return this.otherAddress; 
    }

    /**
    * Sets the other Address.
    *
    * @param value the PhysicalAddress
    */
    public void setOtherAddress(PhysicalAddress value) { 
        this.otherAddress = value; 
        valueChanged("otherAddress", value);

    }
            
    private String spouseName;
     
    /**
    * Gets the spouse Name.
    *
    * @return the String
    */
    public String getSpouseName() {
        return this.spouseName; 
    }

    /**
    * Sets the spouse Name.
    *
    * @param value the String
    */
    public void setSpouseName(String value) { 
        this.spouseName = value; 
        valueChanged("spouseName", value);

    }
            
    private String personalNotes;
     
    /**
    * Gets the personal Notes.
    *
    * @return the String
    */
    public String getPersonalNotes() {
        return this.personalNotes; 
    }

    /**
    * Sets the personal Notes.
    *
    * @param value the String
    */
    public void setPersonalNotes(String value) { 
        this.personalNotes = value; 
        valueChanged("personalNotes", value);

    }
    
        
    private java.util.List<String> children = null;
    
    
     
    /**
    * Gets the children.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getChildren() {
        return this.children; 
    }

    /**
    * Sets the children.
    *
    * @param value the java.util.List<String>
    */
    public void setChildren(java.util.List<String> value) { 
        this.children = value; 
        valueChanged("children", value);

    }
            
    private ProfilePhoto photo;
     
    /**
    * Gets the photo.
    *
    * @return the ProfilePhoto
    */
    public ProfilePhoto getPhoto() {
        return this.photo; 
    }

    /**
    * Sets the photo.
    *
    * @param value the ProfilePhoto
    */
    public void setPhoto(ProfilePhoto value) { 
        this.photo = value; 
        valueChanged("photo", value);

    }
}

