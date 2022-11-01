# EventApi

All URIs are relative to *https://api-dev.hei.school*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEventEventParticipants**](EventApi.md#createEventEventParticipants) | **POST** /events/{event_id}/event_participants | Create new event event_participants
[**createEventEventParticipantsWithHttpInfo**](EventApi.md#createEventEventParticipantsWithHttpInfo) | **POST** /events/{event_id}/event_participants | Create new event event_participants
[**createOrUpdateEvents**](EventApi.md#createOrUpdateEvents) | **PUT** /events | Create new events or update existing events
[**createOrUpdateEventsWithHttpInfo**](EventApi.md#createOrUpdateEventsWithHttpInfo) | **PUT** /events | Create new events or update existing events
[**createOrUpdatePlaces**](EventApi.md#createOrUpdatePlaces) | **PUT** /places | Create new places or update existing places
[**createOrUpdatePlacesWithHttpInfo**](EventApi.md#createOrUpdatePlacesWithHttpInfo) | **PUT** /places | Create new places or update existing places
[**getEventById**](EventApi.md#getEventById) | **GET** /events/{id} | Get event by identifier
[**getEventByIdWithHttpInfo**](EventApi.md#getEventByIdWithHttpInfo) | **GET** /events/{id} | Get event by identifier
[**getEventEventParticipantById**](EventApi.md#getEventEventParticipantById) | **GET** /events/{event_id}/event_participants/{event_participant_id} | Get event event_participant by identifier
[**getEventEventParticipantByIdWithHttpInfo**](EventApi.md#getEventEventParticipantByIdWithHttpInfo) | **GET** /events/{event_id}/event_participants/{event_participant_id} | Get event event_participant by identifier
[**getEventEventParticipants**](EventApi.md#getEventEventParticipants) | **GET** /events/{event_id}/event_participants | Get all event event_participants
[**getEventEventParticipantsWithHttpInfo**](EventApi.md#getEventEventParticipantsWithHttpInfo) | **GET** /events/{event_id}/event_participants | Get all event event_participants
[**getEventParticipants**](EventApi.md#getEventParticipants) | **GET** /event_participants | Get all event event_participants filtered by status
[**getEventParticipantsWithHttpInfo**](EventApi.md#getEventParticipantsWithHttpInfo) | **GET** /event_participants | Get all event event_participants filtered by status
[**getEvents**](EventApi.md#getEvents) | **GET** /events | Get all events order by starting_hours
[**getEventsWithHttpInfo**](EventApi.md#getEventsWithHttpInfo) | **GET** /events | Get all events order by starting_hours
[**getPlaceById**](EventApi.md#getPlaceById) | **GET** /places/{id} | Get place by identifier
[**getPlaceByIdWithHttpInfo**](EventApi.md#getPlaceByIdWithHttpInfo) | **GET** /places/{id} | Get place by identifier
[**getPlaces**](EventApi.md#getPlaces) | **GET** /places | Get all places
[**getPlacesWithHttpInfo**](EventApi.md#getPlacesWithHttpInfo) | **GET** /places | Get all places
[**updateEventEventParticipants**](EventApi.md#updateEventEventParticipants) | **PUT** /events/{event_id}/event_participants | Update existing event event_participants
[**updateEventEventParticipantsWithHttpInfo**](EventApi.md#updateEventEventParticipantsWithHttpInfo) | **PUT** /events/{event_id}/event_participants | Update existing event event_participants



## createEventEventParticipants

> List<EventParticipant> createEventEventParticipants(eventId, event)

Create new event event_participants

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        List<Event> event = Arrays.asList(); // List<Event> | Event event participants to create
        try {
            List<EventParticipant> result = apiInstance.createEventEventParticipants(eventId, event);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#createEventEventParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **event** | [**List&lt;Event&gt;**](Event.md)| Event event participants to create |

### Return type

[**List&lt;EventParticipant&gt;**](EventParticipant.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created Event event participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## createEventEventParticipantsWithHttpInfo

> ApiResponse<List<EventParticipant>> createEventEventParticipants createEventEventParticipantsWithHttpInfo(eventId, event)

Create new event event_participants

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        List<Event> event = Arrays.asList(); // List<Event> | Event event participants to create
        try {
            ApiResponse<List<EventParticipant>> response = apiInstance.createEventEventParticipantsWithHttpInfo(eventId, event);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#createEventEventParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **event** | [**List&lt;Event&gt;**](Event.md)| Event event participants to create |

### Return type

ApiResponse<[**List&lt;EventParticipant&gt;**](EventParticipant.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created Event event participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## createOrUpdateEvents

> List<CreateEvent> createOrUpdateEvents(createEvent)

Create new events or update existing events

Update events when id are provided, create them otherwise.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        List<CreateEvent> createEvent = Arrays.asList(); // List<CreateEvent> | 
        try {
            List<CreateEvent> result = apiInstance.createOrUpdateEvents(createEvent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#createOrUpdateEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEvent** | [**List&lt;CreateEvent&gt;**](CreateEvent.md)|  |

### Return type

[**List&lt;CreateEvent&gt;**](CreateEvent.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created or updated events |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## createOrUpdateEventsWithHttpInfo

> ApiResponse<List<CreateEvent>> createOrUpdateEvents createOrUpdateEventsWithHttpInfo(createEvent)

Create new events or update existing events

Update events when id are provided, create them otherwise.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        List<CreateEvent> createEvent = Arrays.asList(); // List<CreateEvent> | 
        try {
            ApiResponse<List<CreateEvent>> response = apiInstance.createOrUpdateEventsWithHttpInfo(createEvent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#createOrUpdateEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEvent** | [**List&lt;CreateEvent&gt;**](CreateEvent.md)|  |

### Return type

ApiResponse<[**List&lt;CreateEvent&gt;**](CreateEvent.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created or updated events |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## createOrUpdatePlaces

> List<Place> createOrUpdatePlaces(place)

Create new places or update existing places

Update places when id are provided, create them otherwise.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        List<Place> place = Arrays.asList(); // List<Place> | 
        try {
            List<Place> result = apiInstance.createOrUpdatePlaces(place);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#createOrUpdatePlaces");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **place** | [**List&lt;Place&gt;**](Place.md)|  |

### Return type

[**List&lt;Place&gt;**](Place.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created or updated places |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## createOrUpdatePlacesWithHttpInfo

> ApiResponse<List<Place>> createOrUpdatePlaces createOrUpdatePlacesWithHttpInfo(place)

Create new places or update existing places

Update places when id are provided, create them otherwise.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        List<Place> place = Arrays.asList(); // List<Place> | 
        try {
            ApiResponse<List<Place>> response = apiInstance.createOrUpdatePlacesWithHttpInfo(place);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#createOrUpdatePlaces");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **place** | [**List&lt;Place&gt;**](Place.md)|  |

### Return type

ApiResponse<[**List&lt;Place&gt;**](Place.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created or updated places |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getEventById

> Event getEventById(id)

Get event by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Event result = apiInstance.getEventById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEventById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Event**](Event.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The identified event |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getEventByIdWithHttpInfo

> ApiResponse<Event> getEventById getEventByIdWithHttpInfo(id)

Get event by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<Event> response = apiInstance.getEventByIdWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEventById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

ApiResponse<[**Event**](Event.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The identified event |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getEventEventParticipantById

> EventParticipant getEventEventParticipantById(eventId, eventParticipantId)

Get event event_participant by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        String eventParticipantId = "eventParticipantId_example"; // String | 
        try {
            EventParticipant result = apiInstance.getEventEventParticipantById(eventId, eventParticipantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEventEventParticipantById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **eventParticipantId** | **String**|  |

### Return type

[**EventParticipant**](EventParticipant.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Identified event event participant |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getEventEventParticipantByIdWithHttpInfo

> ApiResponse<EventParticipant> getEventEventParticipantById getEventEventParticipantByIdWithHttpInfo(eventId, eventParticipantId)

Get event event_participant by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        String eventParticipantId = "eventParticipantId_example"; // String | 
        try {
            ApiResponse<EventParticipant> response = apiInstance.getEventEventParticipantByIdWithHttpInfo(eventId, eventParticipantId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEventEventParticipantById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **eventParticipantId** | **String**|  |

### Return type

ApiResponse<[**EventParticipant**](EventParticipant.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Identified event event participant |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getEventEventParticipants

> List<EventParticipant> getEventEventParticipants(eventId, page, pageSize, status)

Get all event event_participants

Event participants can be filtered with an optional status parameter.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        String status = "EXPECTED"; // String | 
        try {
            List<EventParticipant> result = apiInstance.getEventEventParticipants(eventId, page, pageSize, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEventEventParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **status** | **String**|  | [optional] [enum: EXPECTED, HERE, MISSING]

### Return type

[**List&lt;EventParticipant&gt;**](EventParticipant.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all event event_participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getEventEventParticipantsWithHttpInfo

> ApiResponse<List<EventParticipant>> getEventEventParticipants getEventEventParticipantsWithHttpInfo(eventId, page, pageSize, status)

Get all event event_participants

Event participants can be filtered with an optional status parameter.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        String status = "EXPECTED"; // String | 
        try {
            ApiResponse<List<EventParticipant>> response = apiInstance.getEventEventParticipantsWithHttpInfo(eventId, page, pageSize, status);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEventEventParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **status** | **String**|  | [optional] [enum: EXPECTED, HERE, MISSING]

### Return type

ApiResponse<[**List&lt;EventParticipant&gt;**](EventParticipant.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all event event_participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getEventParticipants

> List<EventParticipant> getEventParticipants(status, page, pageSize)

Get all event event_participants filtered by status

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String status = "EXPECTED"; // String | See the event_participants object for its value.
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            List<EventParticipant> result = apiInstance.getEventParticipants(status, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEventParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| See the event_participants object for its value. | [optional] [default to EXPECTED] [enum: EXPECTED, HERE, MISSING]
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;EventParticipant&gt;**](EventParticipant.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of filtered event event_participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getEventParticipantsWithHttpInfo

> ApiResponse<List<EventParticipant>> getEventParticipants getEventParticipantsWithHttpInfo(status, page, pageSize)

Get all event event_participants filtered by status

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String status = "EXPECTED"; // String | See the event_participants object for its value.
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            ApiResponse<List<EventParticipant>> response = apiInstance.getEventParticipantsWithHttpInfo(status, page, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEventParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| See the event_participants object for its value. | [optional] [default to EXPECTED] [enum: EXPECTED, HERE, MISSING]
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

ApiResponse<[**List&lt;EventParticipant&gt;**](EventParticipant.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of filtered event event_participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getEvents

> List<Event> getEvents(page, pageSize)

Get all events order by starting_hours

Update students when &#x60;id&#x60; are provided, create them otherwise.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            List<Event> result = apiInstance.getEvents(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;Event&gt;**](Event.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all events |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getEventsWithHttpInfo

> ApiResponse<List<Event>> getEvents getEventsWithHttpInfo(page, pageSize)

Get all events order by starting_hours

Update students when &#x60;id&#x60; are provided, create them otherwise.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            ApiResponse<List<Event>> response = apiInstance.getEventsWithHttpInfo(page, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

ApiResponse<[**List&lt;Event&gt;**](Event.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all events |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getPlaceById

> Place getPlaceById(id)

Get place by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Place result = apiInstance.getPlaceById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getPlaceById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Place**](Place.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The identified place |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getPlaceByIdWithHttpInfo

> ApiResponse<Place> getPlaceById getPlaceByIdWithHttpInfo(id)

Get place by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<Place> response = apiInstance.getPlaceByIdWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getPlaceById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

ApiResponse<[**Place**](Place.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The identified place |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getPlaces

> List<Place> getPlaces()

Get all places

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        try {
            List<Place> result = apiInstance.getPlaces();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getPlaces");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Place&gt;**](Place.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all places |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getPlacesWithHttpInfo

> ApiResponse<List<Place>> getPlaces getPlacesWithHttpInfo()

Get all places

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        try {
            ApiResponse<List<Place>> response = apiInstance.getPlacesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#getPlaces");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**List&lt;Place&gt;**](Place.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all places |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## updateEventEventParticipants

> List<EventParticipant> updateEventEventParticipants(eventId, eventParticipant)

Update existing event event_participants

Update event event_participants when id are provided, create them otherwise.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        List<EventParticipant> eventParticipant = Arrays.asList(); // List<EventParticipant> | Event event participants to update
        try {
            List<EventParticipant> result = apiInstance.updateEventEventParticipants(eventId, eventParticipant);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#updateEventEventParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **eventParticipant** | [**List&lt;EventParticipant&gt;**](EventParticipant.md)| Event event participants to update |

### Return type

[**List&lt;EventParticipant&gt;**](EventParticipant.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Event event participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## updateEventEventParticipantsWithHttpInfo

> ApiResponse<List<EventParticipant>> updateEventEventParticipants updateEventEventParticipantsWithHttpInfo(eventId, eventParticipant)

Update existing event event_participants

Update event event_participants when id are provided, create them otherwise.

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EventApi apiInstance = new EventApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        List<EventParticipant> eventParticipant = Arrays.asList(); // List<EventParticipant> | Event event participants to update
        try {
            ApiResponse<List<EventParticipant>> response = apiInstance.updateEventEventParticipantsWithHttpInfo(eventId, eventParticipant);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#updateEventEventParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **eventParticipant** | [**List&lt;EventParticipant&gt;**](EventParticipant.md)| Event event participants to update |

### Return type

ApiResponse<[**List&lt;EventParticipant&gt;**](EventParticipant.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Event event participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

