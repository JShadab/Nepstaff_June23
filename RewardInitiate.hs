Demo:
-------------
{
  "provider": "MILES",
  "countryCode": "KSA",
  "mobileNumber": "36333883",
  "amount": "100",
  "trackId": "a924b962-2466-11ee-be56-0242ac120002",
  "meta": {
    
  }
}

-----------------------------------
PUT https://staging.lumirental.com/api/tariff-service/tariff/v2/price

Request:
-----------
{"dropOffBranchId":"2","dropOffDate":"1690005600","pickupBranchId":"2","pickupDate":"1689919200"}

=========================================================================

Header:
---------
https://staging.lumirental.com/api/tariff-service/tariff/v2/price/d391d81b-52f1-4c2a-8422-0836a6a016a8/quote/6?&insuranceIds=1&


=============================================

https://staging.lumirental.com/api/booking-service/checkout/payment/d0dcd594-1207-4c0e-9cef-a81ba821b4f7

{"paymentType":"PAY_AT_BRANCH","reward":{"provider":"QITAF","customerIdentifier":557862064}}

------------------
Response:

{
    "pickupBranchId": 2,
    "pickupDateTime": 1689832800,
    "dropOffBranchId": 2,
    "dropOffDateTime": 1689919200,
    "vehicleGroupId": 2,
    "id": 2498,
    "referenceNo": "d0dcd594-1207-4c0e-9cef-a81ba821b4f7",
    "customerId": 10970,
    "bookingDateTime": 1689580217,
    "status": "CREATED",
    "bookingPrice": {
        "id": 2498,
        "rateCode": "544",
        "rateName": "2022",
        "totalPrice": "146.63",
        "rentalSum": "170.00",
        "dropOffSum": "0.00",
        "vat": "19.13",
        "vatPercentage": "15.00",
        "promoCode": "ONP25",
        "discount": "42.50",
        "discountPercentage": "25.00",
        "cdw": "0.00",
        "addOnIds": [],
        "insuranceIds": [
            1
        ],
        "extraSum": "0.00",
        "tariff": "DEFAULT",
        "dailyKmsAllowance": 300,
        "extraKmsCharge": 0.3
    },
    "driver": {
        "firstName": "Achin",
        "lastName": "Prakash",
        "mobileNumber": "9113530578",
        "countryCode": 91,
        "email": "Achin.Prakash+7@seera.sa",
        "dob": "12-05-1993",
        "title": "Mr",
        "id": 11184,
        "driverCode": "1022936",
        "createdOn": 1689580138,
        "updatedOn": 1689580139,
        "driverUId": "87f656c0-f7a6-417a-8737-489a93d25bc7"
    },
    "paymentType": "PAY_AT_BRANCH",
    "soldDays": "1.0",
    "currency": "SAR",
    "cancellable": true,
    "refundable": false,
    "displayId": "STG2307117",
    "providerStatus": "SYNC_FAILED",
    "userPlatform": "desktop",
    "paymentStatus": "SUCCESS"
}