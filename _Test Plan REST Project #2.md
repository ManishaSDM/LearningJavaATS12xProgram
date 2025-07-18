# **Test Plan  for the playground API restful-booker**

# ---

## **✅ Test Plan: REST API — Restful Booker API**

### **1\. Overview**

Test Plan for the Restful Booker API based on the endpoints and requirements provided. This plan covers authentication, booking CRUD operations, and health check, including both positive and negative scenarios.

---

### **2\. Objective**

Ensure all endpoints of the Restful Booker API function as expected, including:

* authentication,   
* CRUD operations on bookings  
* and health check

---

### **3\. Test Scope**

**In Scope:**

* Authentication (/auth)  
* Booking management (/booking, /booking/:id)  
* Health check (/ping)


**Out of Scope:**

*  Internal/private endpoints

* UI Testing

* Security/Penetration Testing

---

### **4\. Test Environment**

| Component | Detail |
| ----- | ----- |
| Endpoint | Auth \- CreateToken-https://restful-booker.herokuapp.com/auth Booking \- GetBookingIds-https://restful-booker.herokuapp.com/booking Booking \- GetBooking-https://restful-booker.herokuapp.com/booking/:id Booking \- CreateBooking-https://restful-booker.herokuapp.com/booking Booking \- UpdateBooking-https://restful-booker.herokuapp.com/booking/:id Booking \- PartialUpdateBooking-https://restful-booker.herokuapp.com/booking/:id Booking \- DeleteBooking-https://restful-booker.herokuapp.com/booking/1 Ping \- HealthCheck-https://restful-booker.herokuapp.com/ping   |
| Protocols Supported | REST, JSON |
| Response Type | token,Sucess,Failure |
| Authentication |   "username" : "admin",     "password" : "password123"  |
| Tools | Postman / JMeter / Curl / Custom Java or Python scripts |

---

### **5\. Test Data**

| Test Case Type | Sample ISBN | Expected Result |
| ----- | ----- | ----- |
| Valid ISBN | `0306406152` | `true` |
| Valid with X | `048665088X` | `true` |
| Invalid ISBN | `1234567890` | `false` |
| Invalid characters | `ABCDEF1234` | `false` / error |
| Too short | `12345` | error/false |
| Too long | `1234567890123` | error/false |
| Empty string | `""` | error/false |
| Null | `null` | error |

---

### **6\. Test Scenarios**

* Functional Testing: CRUD operations, data validation, status codes.  
* Negative Testing: Invalid inputs, missing parameters, unauthorized access.  
* Security Testing: Authentication, authorization, data privacy.  
* Performance Testing: Response time, load, stress.  
* Edge Cases: Empty, large, or boundary value inputs.

#### **6.1 Functional Tests**

* Verify successful user creation  
* Retrieve user details  
* Update user info  
* Delete user  
* Create user with invalid email  
* Get non-existent user  
* Unauthorized access  
* Create user with empty fields  
* Create user with max length fields  
* Valid credentials return token  
* Invalid credentials fail  
* Missing fields  
* Empty payload  
* Create booking with valid data  
* Create booking \-Missing required field  
* Create booking-Invalid date format  
* Get all booking IDs  
* Filter booking IDs by firstname  
* Filter booking IDs by checkin date  
* Get booking by valid ID  
* Get booking by invalid ID  
* Update booking with valid token  
* Update booking with invalid token  
* Update booking without token  
* Update booking with partial data (PATCH)  
* Delete booking with valid token  
* Delete booking with invalid token  
* Delete booking without token  
* Delete non-existent booking  
* API health check

#### **6.2 Security Tests**

* Access with invalid token  
* Access other user’s data  
* SQL injection attempt

#### **6.3 Negative& Edge Tests**

* Create user with invalid email  
* Get non-existent user  
* Unauthorized access  
* Create user with empty fields  
* Create user with max length fields

#### **6.4 Response Validation**

* \[✓\] HTTP 200 status check

* \[✓\] Content-Type matches the protocol

* \[✓\] XML/JSON schema matches documented structure

* 

#### **6.5 Performance Tests (Optional)**

* \[✓\] 100 concurrent requests — should not fail or delay

* \[✓\] Average response time under 500ms

---

### **7\. Test Approach**

| Phase | Tool | Description |
| ----- | ----- | ----- |
| Manual Testing | Postman, REST | Manual execution of all scenarios across protocols |
| Automation | Python \+ `zeep` / Java \+ TestNG | Automate basic validation using scripts |
| Load Testing | JMeter / Locust | Optional stress testing with varied payloads |

---

### **8\. Roles & Responsibilities**

| Role | Responsibility |
| ----- | ----- |
| QA Engineer | Design & execute test cases |
| Automation Engineer | Automate SOAP/JSON scenarios |
| Developer (Optional) | Fix backend issues based on test results |

---

### **9\. Entry and Exit Criteria**

#### **Entry Criteria:**

* API documentation is available

* Endpoint is stable and responsive

* Test environment is accessible

#### **Exit Criteria:**

* All functional and negative test cases executed

* All critical defects resolved

* API response verified across all supported protocols

---

### **10\. Risks & Mitigation**

| Risk | Mitigation |
| ----- | ----- |
| Service downtime | Check availability before execution |
| Invalid/missing documentation | Use actual responses to build test cases |
| Protocol mismatch | Test against all Content-Type variations |

---

### **11\. Sample  Request (REST 1.1)**

POST https://restful-booker.herokuapp.com/ping  
Host:restful-booker.herokuapp.com  
Content-Type: application/json  
{  
  "firstname": "Jim",  
  "lastname": "Brown",  
  "totalprice": 111,  
  "depositpaid": true,  
  "bookingdates": {  
    "checkin": "2018-01-01",  
    "checkout": "2019-01-01"  
  },  
  "additionalneeds": "Breakfast"  
}

---

### **12\. Reporting & Metrics**

* Test Execution Report

* Defect Summary Report

* Protocol-wise success/failure matrix

* Performance test graphs (if applicable)

---

