FROM openjdk:8u191-jre-alpine3.8

# install curl
RUN apk update
RUN apk add --no-cache curl python bash

# install pip 
#RUN curl -O https://bootstrap.pypa.io/pip/2.7/get-pip.py && \ 
    #python get-pip.py 
RUN apk add --no-cache python3 py3-pip    
    
# install aws cli
RUN pip3 install awscli --upgrade

WORKDIR ./

# Add entry point shell script
COPY execute_test.sh execute_test.sh

ADD USA.xml  USA.xml

ADD Testdata/Breville_USA_TestData.xlsx  Testdata/Breville_USA_TestData.xlsx
ADD Screenshots  Screenshots
ADD config.properties config.properties
ADD  target/selenium-docker.jar libs/selenium-docker.jar
ADD  target/selenium-docker-tests.jar libs/selenium-docker-tests.jar
ADD  target/libs libs


ENTRYPOINT [ "bash", "execute_test.sh" ]

