#!/bin/bash

cd /home/ec2-user/inventory-app/backend
nohup java -jar target/*.jar > backend.log 2>&1 &

cd /home/ec2-user/inventory-app/frontend
npm install
npm run build
