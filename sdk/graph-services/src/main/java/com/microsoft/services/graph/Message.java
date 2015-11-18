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
 * The type Message.
*/
public class Message extends OutlookItem {

    public Message(){
        setODataType("#microsoft.graph.message");
    }
            
    private java.util.Calendar receivedDateTime;
     
    /**
    * Gets the received Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getReceivedDateTime() {
        return this.receivedDateTime; 
    }

    /**
    * Sets the received Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setReceivedDateTime(java.util.Calendar value) { 
        this.receivedDateTime = value; 
        valueChanged("receivedDateTime", value);

    }
            
    private java.util.Calendar sentDateTime;
     
    /**
    * Gets the sent Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getSentDateTime() {
        return this.sentDateTime; 
    }

    /**
    * Sets the sent Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setSentDateTime(java.util.Calendar value) { 
        this.sentDateTime = value; 
        valueChanged("sentDateTime", value);

    }
            
    private Boolean hasAttachments;
     
    /**
    * Gets the has Attachments.
    *
    * @return the Boolean
    */
    public Boolean getHasAttachments() {
        return this.hasAttachments; 
    }

    /**
    * Sets the has Attachments.
    *
    * @param value the Boolean
    */
    public void setHasAttachments(Boolean value) { 
        this.hasAttachments = value; 
        valueChanged("hasAttachments", value);

    }
            
    private String subject;
     
    /**
    * Gets the subject.
    *
    * @return the String
    */
    public String getSubject() {
        return this.subject; 
    }

    /**
    * Sets the subject.
    *
    * @param value the String
    */
    public void setSubject(String value) { 
        this.subject = value; 
        valueChanged("subject", value);

    }
            
    private ItemBody body;
     
    /**
    * Gets the body.
    *
    * @return the ItemBody
    */
    public ItemBody getBody() {
        return this.body; 
    }

    /**
    * Sets the body.
    *
    * @param value the ItemBody
    */
    public void setBody(ItemBody value) { 
        this.body = value; 
        valueChanged("body", value);

    }
            
    private String bodyPreview;
     
    /**
    * Gets the body Preview.
    *
    * @return the String
    */
    public String getBodyPreview() {
        return this.bodyPreview; 
    }

    /**
    * Sets the body Preview.
    *
    * @param value the String
    */
    public void setBodyPreview(String value) { 
        this.bodyPreview = value; 
        valueChanged("bodyPreview", value);

    }
            
    private Importance importance;
     
    /**
    * Gets the importance.
    *
    * @return the Importance
    */
    public Importance getImportance() {
        return this.importance; 
    }

    /**
    * Sets the importance.
    *
    * @param value the Importance
    */
    public void setImportance(Importance value) { 
        this.importance = value; 
        valueChanged("importance", value);

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
            
    private Recipient sender;
     
    /**
    * Gets the sender.
    *
    * @return the Recipient
    */
    public Recipient getSender() {
        return this.sender; 
    }

    /**
    * Sets the sender.
    *
    * @param value the Recipient
    */
    public void setSender(Recipient value) { 
        this.sender = value; 
        valueChanged("sender", value);

    }
            
    private Recipient from;
     
    /**
    * Gets the from.
    *
    * @return the Recipient
    */
    public Recipient getFrom() {
        return this.from; 
    }

    /**
    * Sets the from.
    *
    * @param value the Recipient
    */
    public void setFrom(Recipient value) { 
        this.from = value; 
        valueChanged("from", value);

    }
    
        
    private java.util.List<Recipient> toRecipients = null;
    
    
     
    /**
    * Gets the to Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getToRecipients() {
        return this.toRecipients; 
    }

    /**
    * Sets the to Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setToRecipients(java.util.List<Recipient> value) { 
        this.toRecipients = value; 
        valueChanged("toRecipients", value);

    }
    
        
    private java.util.List<Recipient> ccRecipients = null;
    
    
     
    /**
    * Gets the cc Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getCcRecipients() {
        return this.ccRecipients; 
    }

    /**
    * Sets the cc Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setCcRecipients(java.util.List<Recipient> value) { 
        this.ccRecipients = value; 
        valueChanged("ccRecipients", value);

    }
    
        
    private java.util.List<Recipient> bccRecipients = null;
    
    
     
    /**
    * Gets the bcc Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getBccRecipients() {
        return this.bccRecipients; 
    }

    /**
    * Sets the bcc Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setBccRecipients(java.util.List<Recipient> value) { 
        this.bccRecipients = value; 
        valueChanged("bccRecipients", value);

    }
    
        
    private java.util.List<Recipient> replyTo = null;
    
    
     
    /**
    * Gets the reply To.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getReplyTo() {
        return this.replyTo; 
    }

    /**
    * Sets the reply To.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setReplyTo(java.util.List<Recipient> value) { 
        this.replyTo = value; 
        valueChanged("replyTo", value);

    }
            
    private String conversationId;
     
    /**
    * Gets the conversation Id.
    *
    * @return the String
    */
    public String getConversationId() {
        return this.conversationId; 
    }

    /**
    * Sets the conversation Id.
    *
    * @param value the String
    */
    public void setConversationId(String value) { 
        this.conversationId = value; 
        valueChanged("conversationId", value);

    }
            
    private ItemBody uniqueBody;
     
    /**
    * Gets the unique Body.
    *
    * @return the ItemBody
    */
    public ItemBody getUniqueBody() {
        return this.uniqueBody; 
    }

    /**
    * Sets the unique Body.
    *
    * @param value the ItemBody
    */
    public void setUniqueBody(ItemBody value) { 
        this.uniqueBody = value; 
        valueChanged("uniqueBody", value);

    }
            
    private Boolean isDeliveryReceiptRequested;
     
    /**
    * Gets the is Delivery Receipt Requested.
    *
    * @return the Boolean
    */
    public Boolean getIsDeliveryReceiptRequested() {
        return this.isDeliveryReceiptRequested; 
    }

    /**
    * Sets the is Delivery Receipt Requested.
    *
    * @param value the Boolean
    */
    public void setIsDeliveryReceiptRequested(Boolean value) { 
        this.isDeliveryReceiptRequested = value; 
        valueChanged("isDeliveryReceiptRequested", value);

    }
            
    private Boolean isReadReceiptRequested;
     
    /**
    * Gets the is Read Receipt Requested.
    *
    * @return the Boolean
    */
    public Boolean getIsReadReceiptRequested() {
        return this.isReadReceiptRequested; 
    }

    /**
    * Sets the is Read Receipt Requested.
    *
    * @param value the Boolean
    */
    public void setIsReadReceiptRequested(Boolean value) { 
        this.isReadReceiptRequested = value; 
        valueChanged("isReadReceiptRequested", value);

    }
            
    private Boolean isRead;
     
    /**
    * Gets the is Read.
    *
    * @return the Boolean
    */
    public Boolean getIsRead() {
        return this.isRead; 
    }

    /**
    * Sets the is Read.
    *
    * @param value the Boolean
    */
    public void setIsRead(Boolean value) { 
        this.isRead = value; 
        valueChanged("isRead", value);

    }
            
    private Boolean isDraft;
     
    /**
    * Gets the is Draft.
    *
    * @return the Boolean
    */
    public Boolean getIsDraft() {
        return this.isDraft; 
    }

    /**
    * Sets the is Draft.
    *
    * @param value the Boolean
    */
    public void setIsDraft(Boolean value) { 
        this.isDraft = value; 
        valueChanged("isDraft", value);

    }
            
    private String webLink;
     
    /**
    * Gets the web Link.
    *
    * @return the String
    */
    public String getWebLink() {
        return this.webLink; 
    }

    /**
    * Sets the web Link.
    *
    * @param value the String
    */
    public void setWebLink(String value) { 
        this.webLink = value; 
        valueChanged("webLink", value);

    }
    
        
    private java.util.List<Attachment> attachments = null;
    
    
     
    /**
    * Gets the attachments.
    *
    * @return the java.util.List<Attachment>
    */
    public java.util.List<Attachment> getAttachments() {
        return this.attachments; 
    }

    /**
    * Sets the attachments.
    *
    * @param value the java.util.List<Attachment>
    */
    public void setAttachments(java.util.List<Attachment> value) { 
        this.attachments = value; 
        valueChanged("attachments", value);

    }
}

