FROM postgres:14.2

ENV POSTGRES_HOST_AUTH_METHOD trust
ENV POSTGRES_PASSWORD postgres
ENV POSTGRES_DB ztp_rules

COPY create_tables.sql /docker-entrypoint-initdb.d/create_tables.sql