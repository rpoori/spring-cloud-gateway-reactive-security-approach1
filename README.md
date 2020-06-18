# spring-cloud-gateway-reactive-security-approach1
Spring Cloud Gateway - Reactive Security - Approach 1 - Using SecurityContextRepository

curl -X GET \
  http://localhost:8088/api/secure-endpoint \
  -H 'Authorization: Bearer 987654' \
  -H 'Postman-Token: 7cdaf89e-cdb6-49c9-abaa-6cd29219284d' \
  -H 'cache-control: no-cache'
