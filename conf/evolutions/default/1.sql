# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table actor (
  id                            serial not null,
  last_name                     varchar(255),
  first_name                    varchar(255),
  nationality                   varchar(255),
  constraint pk_actor primary key (id)
);

create table board_game (
  id                            serial not null,
  name                          varchar(255),
  categorie                     varchar(255),
  date                          timestamp,
  picture_link                  varchar(255),
  editeur                       varchar(255),
  resume                        varchar(255),
  is_collection                 boolean,
  num_collection                integer,
  num_max_collection            integer,
  genre                         varchar(255),
  language                      varchar(255),
  duration                      varchar(255),
  age_min                       integer,
  num_min_player                integer,
  num_max_player                integer,
  constraint pk_board_game primary key (id)
);

create table book (
  id                            serial not null,
  name                          varchar(255),
  categorie                     varchar(255),
  date                          timestamp,
  picture_link                  varchar(255),
  editeur                       varchar(255),
  resume                        varchar(255),
  is_collection                 boolean,
  num_collection                integer,
  num_max_collection            integer,
  genre                         varchar(255),
  language                      varchar(255),
  constraint pk_book primary key (id)
);

create table movie (
  id                            serial not null,
  name                          varchar(255),
  categorie                     varchar(255),
  date                          timestamp,
  picture_link                  varchar(255),
  editeur                       varchar(255),
  resume                        varchar(255),
  is_collection                 boolean,
  num_collection                integer,
  num_max_collection            integer,
  realisator                    varchar(255),
  genre                         varchar(255),
  language                      varchar(255),
  duration                      varchar(255),
  constraint pk_movie primary key (id)
);

create table music (
  id                            serial not null,
  name                          varchar(255),
  categorie                     varchar(255),
  date                          timestamp,
  picture_link                  varchar(255),
  editeur                       varchar(255),
  resume                        varchar(255),
  is_collection                 boolean,
  num_collection                integer,
  num_max_collection            integer,
  genre                         varchar(255),
  language                      varchar(255),
  duration                      varchar(255),
  singer_name                   varchar(255),
  constraint pk_music primary key (id)
);


# --- !Downs

drop table if exists actor cascade;

drop table if exists board_game cascade;

drop table if exists book cascade;

drop table if exists movie cascade;

drop table if exists music cascade;

