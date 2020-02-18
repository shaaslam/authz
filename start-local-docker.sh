#!/bin/bash

docker-compose down -v
docker-compose -f docker-compose.yml -f docker-compose.local.yml up --no-deps -d mysql

docker-compose -f docker-compose.yml -f docker-compose.local.yml logs -f
