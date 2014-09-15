/*
 * Copyright 2011-2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * Interface to make it possible to cache the expensive type determination behavior.
 */
interface ArgumentMarshaller {
    
    /**
     * Marshalls the object given into an AttributeValue.
     */
    public AttributeValue marshall(Object obj);
    
    static interface StringAttributeMarshaller extends ArgumentMarshaller {}
    static interface NumberAttributeMarshaller extends ArgumentMarshaller {}
    static interface BinaryAttributeMarshaller extends ArgumentMarshaller {}
    static interface StringSetAttributeMarshaller extends ArgumentMarshaller {}
    static interface NumberSetAttributeMarshaller extends ArgumentMarshaller {}
    static interface BinarySetAttributeMarshaller extends ArgumentMarshaller {}
}
