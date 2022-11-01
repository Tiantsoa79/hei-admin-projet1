create extension if not exists "uuid-ossp";

create table if not exists "event"
(
    id                varchar
        constraint event_pk primary key                 default uuid_generate_v4(),
    event_type              varchar                  not null,
    start_time               varchar                  not null,
    end_time               varchar                  not null,
    id_place               varchar                  not null
    constraint event_id_fk references "place"(id)
);
