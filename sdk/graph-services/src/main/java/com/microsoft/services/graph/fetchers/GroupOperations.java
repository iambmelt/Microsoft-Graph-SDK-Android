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
 * The type GroupOperations.
 */
public class GroupOperations extends DirectoryObjectOperations {

     /**
      * Instantiates a new GroupOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public GroupOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public GroupOperations addParameter(String name, Object value) {
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
    public GroupOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * subscribeByMail listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> subscribeByMail() { 
              
        
		  
        
		
		ListenableFuture<String> future = subscribeByMailRaw();
		return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * subscribeByMailRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> subscribeByMailRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
                        
        request.getUrl().appendPathComponent("microsoft.graph.subscribeByMail");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * unsubscribeByMail listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> unsubscribeByMail() { 
              
        
		  
        
		
		ListenableFuture<String> future = unsubscribeByMailRaw();
		return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * unsubscribeByMailRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> unsubscribeByMailRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
                        
        request.getUrl().appendPathComponent("microsoft.graph.unsubscribeByMail");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * addFavorite listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> addFavorite() { 
              
        
		  
        
		
		ListenableFuture<String> future = addFavoriteRaw();
		return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * addFavoriteRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> addFavoriteRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
                        
        request.getUrl().appendPathComponent("microsoft.graph.addFavorite");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * removeFavorite listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> removeFavorite() { 
              
        
		  
        
		
		ListenableFuture<String> future = removeFavoriteRaw();
		return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * removeFavoriteRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> removeFavoriteRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
                        
        request.getUrl().appendPathComponent("microsoft.graph.removeFavorite");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * resetUnseenCount listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> resetUnseenCount() { 
              
        
		  
        
		
		ListenableFuture<String> future = resetUnseenCountRaw();
		return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * resetUnseenCountRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> resetUnseenCountRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
                        
        request.getUrl().appendPathComponent("microsoft.graph.resetUnseenCount");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
