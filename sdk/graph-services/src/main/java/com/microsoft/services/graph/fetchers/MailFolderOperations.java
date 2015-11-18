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
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import static com.microsoft.services.orc.core.Helpers.*;
import com.microsoft.services.orc.serialization.JsonSerializer;

/**
 * The type MailFolderOperations.
 */
public class MailFolderOperations extends EntityOperations {

     /**
      * Instantiates a new MailFolderOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public MailFolderOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public MailFolderOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public MailFolderOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * copy listenable future.
     * @param destinationId the destinationId 
     * @return the listenable future
     */         
    public ListenableFuture<MailFolder> copy(String destinationId) { 
        
		JsonSerializer serializer = getResolver().getJsonSerializer();      
        
		String serializedDestinationId = serializer.serialize(destinationId);
		  
        
		
		ListenableFuture<String> future = copyRaw(serializedDestinationId);
		return transformToEntityListenableFuture(future, MailFolder.class, getResolver());
        
    }

     /**
     * copyRaw listenable future.
     * @param destinationId the destinationId 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyRaw(String destinationId){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("DestinationId", destinationId);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("microsoft.graph.copy");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * move listenable future.
     * @param destinationId the destinationId 
     * @return the listenable future
     */         
    public ListenableFuture<MailFolder> move(String destinationId) { 
        
		JsonSerializer serializer = getResolver().getJsonSerializer();      
        
		String serializedDestinationId = serializer.serialize(destinationId);
		  
        
		
		ListenableFuture<String> future = moveRaw(serializedDestinationId);
		return transformToEntityListenableFuture(future, MailFolder.class, getResolver());
        
    }

     /**
     * moveRaw listenable future.
     * @param destinationId the destinationId 
     * @return the listenable future
     */ 
    public ListenableFuture<String> moveRaw(String destinationId){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("DestinationId", destinationId);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("microsoft.graph.move");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
