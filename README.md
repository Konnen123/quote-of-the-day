APIs available

GET /api/v1/quotes/random - get a random quote
POST /api/v1/quotes - creates a quote given a string in the body called quote
GET /api/v1/quotes/{id} - get a quote based on id given. It will throw an error if the id given is out of bounds
