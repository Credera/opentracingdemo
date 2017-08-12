#!/bin/sh
file="../activity.db"
if [ -f "$file" ]
then
    echo "Activity database already exists"
else
    echo "Creating activity database"
    go run main.go
fi
