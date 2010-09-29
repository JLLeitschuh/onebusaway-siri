/*
 * Copyright 2010, OpenPlans Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.onebusaway.siri.model;

import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.Calendar;
import java.util.List;

public class ServiceDelivery {
  
  @XStreamConverter(ISO8601GregorianCalendarConverterNoMillis.class)
  public Calendar ResponseTimestamp;
  
  public String ProducerRef;
  
  public Boolean Status;
  
  public Boolean MoreData;

  public VehicleMonitoringDelivery VehicleMonitoringDelivery;

  @XStreamImplicit
  public List<StopMonitoringDelivery> stopMonitoringDeliveries;
}
