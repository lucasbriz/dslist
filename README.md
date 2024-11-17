- h2: http://localhost:8080/h2-console
- uses docker-compose up
- pg admin on localhost:5050
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

- test dev:
  - change application.yaml active to dev
  - uncomment lines 12 to 15 on application-dev.yaml

query for move belonging positions:
```
SELECT tb_belonging .*, tb_game.title from tb_belonging
inner join tb_game on tb_game.id = tb_belonging.game_id
where list_id = 2
order by position
```