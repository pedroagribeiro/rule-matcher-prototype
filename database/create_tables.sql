CREATE TABLE rules (
    token                   integer PRIMARY KEY NOT NULL UNIQUE,
    fw_version              varchar(255)         ,
    ip_address              varchar(255)         ,
    olt                     varchar(255)         ,
    card                    varchar(255)         ,
    interface               varchar(255)         ,
    equipment_id            varchar(255)         ,
    password                varchar(255)         ,
    vendor                  varchar(255)         ,
    template                varchar(255)         
);

INSERT INTO rules VALUES (1, 'gt 1.0.0', null, null, null, null, null, null, null, 'template_1.yml');
INSERT INTO rules VALUES (2, null, 'eq 192.168.1.6', 'OLT2T2', null, null, null, null, null, 'template_2.yml');
INSERT INTO rules VALUES (3, null, null, 'OLT2T2', 'CARD-TYPE-1', null, null, null, null, 'template_3.yml');
INSERT INTO rules VALUES (4, 'gt 1.0.0', 'startswith 192.168', null, null, null, null, null, null, 'template_4.yml');
INSERT INTO rules VALUES (5, 'lt 5.0.0', 'endswith 1.6', null, null, null, null, null, null, 'template_5.yml');

CREATE SEQUENCE rule_id_seq START 6;

