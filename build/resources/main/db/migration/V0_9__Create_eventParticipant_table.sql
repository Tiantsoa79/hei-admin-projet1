do
$$
    begin
        if not exists(select from pg_type where typname = 'status_type') then
            create type "status_type" as enum ('EXPECTED', 'HERE', 'MISSING');
        end if;
    end
$$;

create table if not exists "eventParticipant"
(
    idEventParticipant                varchar
        constraint eventParticipant_pk primary key                 default uuid_generate_v4(),
    status                            status_type         not null,
    id_participant           varchar                  not null
        constraint eventParticipant_id_participant_fk references "user"(id),
    id_event           varchar                  not null
            constraint eventParticipant_id_event_fk references "event"(id)
);

create index if not exists eventParticipant_id_participant_index on "eventParticipant" (id_participant);

