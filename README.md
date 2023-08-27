# unleash-practice
Repo to get to know some features from Unleash.

## Links
[Unleash GitHub](https://github.com/Unleash/unleash)  
[Java SDK](https://docs.getunleash.io/reference/sdks/java)    
[Unleash Doc](https://docs.getunleash.io/)  

## Commands
```
- Getting started with Docker
git clone git@github.com:Unleash/unleash.git
cd unleash
docker compose up -d
Then point your browser to localhost:4242 and log in using:
username: admin
password: unleash4all

- Create an API token
Go to the 'Personal API tokens' page:
http://localhost:4242/profile/personal-api-tokens?sort=createdAt
Create a token like this:
user:d262c7c7e1388dd6298f460719d7c86285833c8a75ff2f1d43e9f64e
Use it in the subsequent calls to the API

- Create a feature-toggle
curl --location --request POST 'http://localhost:4242/api/admin/projects/default/features' \
    --header 'Authorization: user:d262c7c7e1388dd6298f460719d7c86285833c8a75ff2f1d43e9f64e' \
    --header 'Content-Type: application/json' \
    --data-raw '{
  "type": "release",
  "name": "MY_FIRST_FT",
  "description": "First feature toggle",
  "impressionData": false
}'
```
