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
import com.microsoft.services.orc.core.Readable;

/**
 * The type  Conversation
 */
public class ConversationFetcher extends OrcEntityFetcher<Conversation,ConversationOperations> 
                                     implements Readable<Conversation> {

     /**
     * Instantiates a new ConversationFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ConversationFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Conversation.class, ConversationOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ConversationFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }
	
	/**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ConversationFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    
     /**
     * Gets threads.
     *
     * @return the threads
     */
    public OrcCollectionFetcher<ConversationThread, ConversationThreadFetcher, ConversationThreadCollectionOperations> getThreads() {
        return new OrcCollectionFetcher<ConversationThread, ConversationThreadFetcher, ConversationThreadCollectionOperations>("threads", this, ConversationThread.class, ConversationThreadCollectionOperations.class);
    }

    /**
     * Gets thread.
     *
     * @return the thread
     */
    public ConversationThreadFetcher getThread(String id){
         return new OrcCollectionFetcher<ConversationThread, ConversationThreadFetcher, ConversationThreadCollectionOperations>("threads", this, ConversationThread.class, ConversationThreadCollectionOperations.class).getById(id);
    }

}
