FROM gradle:8.4-jdk20

WORKDIR /java-web-ru/database

COPY /java-web-ru/database .

RUN gradle installDist

CMD ./build/install/mvc/bin/mvc
