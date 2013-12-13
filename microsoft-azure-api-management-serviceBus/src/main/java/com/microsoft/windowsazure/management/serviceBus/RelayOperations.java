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

package com.microsoft.windowsazure.management.servicebus;

import com.microsoft.windowsazure.management.servicebus.models.ServiceBusConnectionDetailsResponse;
import com.microsoft.windowsazure.services.core.ServiceException;
import java.io.IOException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
* The Service Bus Management API includes operations for managing Service Bus
* relays.
*/
public interface RelayOperations
{
    /**
    * Gets the set of connection strings for a relay.
    *
    * @return The set of connection details for a service bus entity.
    */
    ServiceBusConnectionDetailsResponse getConnectionDetails(String namespaceName, String relayName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Gets the set of connection strings for a relay.
    *
    * @return The set of connection details for a service bus entity.
    */
    Future<ServiceBusConnectionDetailsResponse> getConnectionDetailsAsync(String namespaceName, String relayName);
}
