FROM mysql:5.7.15

ENV MYSQL_DATABASE=laptopshop \
    MYSQL_ROOT_PASSWORD=RootPassword

ADD schema.sql /docker-entrypoint-initdb.d

EXPOSE 3306