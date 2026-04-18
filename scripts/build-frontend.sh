#!/bin/bash
cd frontend
npm run build
rm -rf ../src/main/resources/static
cp -r dist ../src/main/resources/static
