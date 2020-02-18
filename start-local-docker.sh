#!/bin/bash

docker-compose down -v

docker-compose -f docker-compose.yml up

docker-compose -f docker-compose.yml logs -f