#!/bin/bash

mvn clean package
echo ""
java -jar ./target/aspectj.jar