#!/usr/bin/env bash
#set -e
## Execute tests by running the java program
java -cp classes:libs/* -DENVIRONMENT=$ENVIRONMENT -DBROWSER=$BROWSER org.testng.TestNG $MODULE
## Copy the test file to S3 bucket
countryname=$(echo $MODULE | cut -d. -f1)
filename=SmokeTest-"$ENVIRONMENT"-${countryname}-$(date "+%d%m%Y%S")
#epochTime=Breville$(date "+%d%m%Y%S")
epochTimelogs=logs$(date "+%d%m%Y%S")
aws s3 cp Screenshots  s3://testautomation-new/Test-cases-results/Screenshots/ --recursive
aws s3 cp Breville.html s3://testautomation-new/Test-cases-results/${filename}.html
aws s3 cp logs/testlogs.log s3://testautomation-new/Test-cases-results/${epochTimelogs}.log