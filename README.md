# READ ME

This project was developed during a full week course of Java and Spring Boot by Dev Superior platform.
It uses technologies such as:
- Java 21;
- Spring Boot;
- H2 database for tests;
- Docker-compose;
- Postgres and PG Admin;

## To run Test profile with H2:
- be sure that active attribute on `application.yaml` is set to `test`
- run `Dslist Application`
- run h2 on: http://localhost:8080/h2-console

## To run Dev profile with Docker-Compose:
- be sure that active attribute on `application.yaml` is set to `dev`
- uncomment lines 12 to 15 on `application-dev.yaml`
- run `docker-compose up` command
- run PG Admin on: http://localhost:5050
- configure new server:
  - name: postgres-local-docker
  - connection: 
    - host name: pg-docker
    - port: 5432
    - maintenance: mydatabase
    - username: postgres
    - password: same used on docker file

- create table on PG admin:
  - get queries from create.sql;
  - create database on pg admin with the same name used on application-dev;
  - dslist > schemas > tables > query tool > paste copied query


## Query to follow move endpoint belonging positions:
```
SELECT tb_belonging .*, tb_game.title from tb_belonging
inner join tb_game on tb_game.id = tb_belonging.game_id
where list_id = 2
order by position
```