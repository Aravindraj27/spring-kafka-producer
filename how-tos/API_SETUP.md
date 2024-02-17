### APIs Defined in this package.

#### Producer APIs

1. Curl call to publish from a stream from wiki-stream.
```bash
curl --location 'http://localhost:8080/api/v1/wikimedia/string/publish' \
--data ''
```

2. Curl call to publish dialogues upload data to the topic 
```bash
curl --location --request GET 'http://localhost:8080/api/v1/wikimedia/metadata/publish' \
--header 'Content-Type: application/json' \
--data '{
  "playName" : "bulgogi",
  "actNumber" : 1,
  "author" : "Asmodeus"
}'
```