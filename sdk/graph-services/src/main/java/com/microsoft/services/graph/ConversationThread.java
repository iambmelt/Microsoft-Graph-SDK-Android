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
 * The type Conversation Thread.
*/
public class ConversationThread extends Entity {

    public ConversationThread(){
        setODataType("#microsoft.graph.conversationThread");
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
            
    private String topic;
     
    /**
    * Gets the topic.
    *
    * @return the String
    */
    public String getTopic() {
        return this.topic; 
    }

    /**
    * Sets the topic.
    *
    * @param value the String
    */
    public void setTopic(String value) { 
        this.topic = value; 
        valueChanged("topic", value);

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
            
    private java.util.Calendar lastDeliveredDateTime;
     
    /**
    * Gets the last Delivered Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastDeliveredDateTime() {
        return this.lastDeliveredDateTime; 
    }

    /**
    * Sets the last Delivered Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastDeliveredDateTime(java.util.Calendar value) { 
        this.lastDeliveredDateTime = value; 
        valueChanged("lastDeliveredDateTime", value);

    }
    
        
    private java.util.List<String> uniqueSenders = null;
    
    
     
    /**
    * Gets the unique Senders.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getUniqueSenders() {
        return this.uniqueSenders; 
    }

    /**
    * Sets the unique Senders.
    *
    * @param value the java.util.List<String>
    */
    public void setUniqueSenders(java.util.List<String> value) { 
        this.uniqueSenders = value; 
        valueChanged("uniqueSenders", value);

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
            
    private String preview;
     
    /**
    * Gets the preview.
    *
    * @return the String
    */
    public String getPreview() {
        return this.preview; 
    }

    /**
    * Sets the preview.
    *
    * @param value the String
    */
    public void setPreview(String value) { 
        this.preview = value; 
        valueChanged("preview", value);

    }
            
    private Boolean isLocked;
     
    /**
    * Gets the is Locked.
    *
    * @return the Boolean
    */
    public Boolean getIsLocked() {
        return this.isLocked; 
    }

    /**
    * Sets the is Locked.
    *
    * @param value the Boolean
    */
    public void setIsLocked(Boolean value) { 
        this.isLocked = value; 
        valueChanged("isLocked", value);

    }
    
        
    private java.util.List<Post> posts = null;
    
    
     
    /**
    * Gets the posts.
    *
    * @return the java.util.List<Post>
    */
    public java.util.List<Post> getPosts() {
        return this.posts; 
    }

    /**
    * Sets the posts.
    *
    * @param value the java.util.List<Post>
    */
    public void setPosts(java.util.List<Post> value) { 
        this.posts = value; 
        valueChanged("posts", value);

    }
}

