#!/bin/bash
mvn spring-boot:run & echo $! > ./pid.file &
