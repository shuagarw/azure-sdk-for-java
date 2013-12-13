// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.models;

import java.util.Calendar;

/**
* Parameters supplied to the List Subscription Operations operation.
*/
public class SubscriptionListOperationsParameters
{
    private String continuationToken;
    
    /**
    * Optional. When there are too many operations to list, such as when the
    * requested timeframe is very large, the response includes an incomplete
    * list and a token that can be used to return the rest of the list.
    * Subsequent requests must include this parameter to continue listing
    * operations from where the last response left off. If no token is
    * specified, a filter is not applied and the response will begin at the
    * specified StartTime.
    */
    public String getContinuationToken() { return this.continuationToken; }
    
    /**
    * Optional. When there are too many operations to list, such as when the
    * requested timeframe is very large, the response includes an incomplete
    * list and a token that can be used to return the rest of the list.
    * Subsequent requests must include this parameter to continue listing
    * operations from where the last response left off. If no token is
    * specified, a filter is not applied and the response will begin at the
    * specified StartTime.
    */
    public void setContinuationToken(String continuationToken) { this.continuationToken = continuationToken; }
    
    private Calendar endTime;
    
    /**
    * Required. The end of the timeframe to begin listing subscription
    * operations in UTC format. This parameter and the StartTime parameter
    * indicate the timeframe to retrieve subscription operations.
    */
    public Calendar getEndTime() { return this.endTime; }
    
    /**
    * Required. The end of the timeframe to begin listing subscription
    * operations in UTC format. This parameter and the StartTime parameter
    * indicate the timeframe to retrieve subscription operations.
    */
    public void setEndTime(Calendar endTime) { this.endTime = endTime; }
    
    private String objectIdFilter;
    
    /**
    * Optional. Returns subscription operations only for the specified object
    * type and object ID. This parameter must be set equal to the URL value
    * for performing an HTTP GET on the object. If no object is specified, a
    * filter is not applied.
    */
    public String getObjectIdFilter() { return this.objectIdFilter; }
    
    /**
    * Optional. Returns subscription operations only for the specified object
    * type and object ID. This parameter must be set equal to the URL value
    * for performing an HTTP GET on the object. If no object is specified, a
    * filter is not applied.
    */
    public void setObjectIdFilter(String objectIdFilter) { this.objectIdFilter = objectIdFilter; }
    
    private OperationStatus operationStatus;
    
    /**
    * Optional. Returns subscription operations only for thespecified result
    * status, either Succeeded, Failed, or InProgress.This filter can be
    * combined with the ObjectIdFilter to selectsubscription operations for an
    * object with a specific resultstatus. If no result status is specified, a
    * filter is not applied.
    */
    public OperationStatus getOperationStatus() { return this.operationStatus; }
    
    /**
    * Optional. Returns subscription operations only for thespecified result
    * status, either Succeeded, Failed, or InProgress.This filter can be
    * combined with the ObjectIdFilter to selectsubscription operations for an
    * object with a specific resultstatus. If no result status is specified, a
    * filter is not applied.
    */
    public void setOperationStatus(OperationStatus operationStatus) { this.operationStatus = operationStatus; }
    
    private Calendar startTime;
    
    /**
    * Required. The start of the timeframe to begin listingsubscription
    * operations in UTC format. This parameter and theEndTime parameter
    * indicate the timeframe to retrieve subscription operations. This
    * parameter cannot indicate a start date of more than 90 days in the past.
    */
    public Calendar getStartTime() { return this.startTime; }
    
    /**
    * Required. The start of the timeframe to begin listingsubscription
    * operations in UTC format. This parameter and theEndTime parameter
    * indicate the timeframe to retrieve subscription operations. This
    * parameter cannot indicate a start date of more than 90 days in the past.
    */
    public void setStartTime(Calendar startTime) { this.startTime = startTime; }
    
    /**
    * Initializes a new instance of the SubscriptionListOperationsParameters
    * class.
    *
    */
    public SubscriptionListOperationsParameters()
    {
    }
}
