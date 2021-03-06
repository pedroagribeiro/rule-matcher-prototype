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
    template                varchar(255)         ,
    priority                integer     
);

CREATE TABLE parameters (
    id                      integer PRIMARY KEY NOT NULL UNIQUE,
    name                    varchar(255)        NOT NULL       ,
    value                   varchar(255)        NOT NULL       ,
    rule_token              integer             NOT NULL       ,
    CONSTRAINT fk_rule FOREIGN KEY(rule_token) REFERENCES rules(token)
);

INSERT INTO rules VALUES (1, 'gt 1.0.0 and lt 3.0.0', null, null, null, null, null, null, null, 'template_1.yml', 1);
INSERT INTO rules VALUES (2, null, 'eq 192.168.1.6', 'OLT2T2', null, null, null, null, null, 'template_2.yml', 1);
INSERT INTO rules VALUES (3, null, null, 'OLT2T2', 'CARD-TYPE-1', null, null, null, null, 'template_3.yml', 2);
INSERT INTO rules VALUES (4, 'gt 1.0.0', 'startswith 192.168', null, null, null, null, null, null, 'template_4.yml', 2);
INSERT INTO rules VALUES (5, null, 'startswith 192 and endswith 8', null, null, null, null, null, null, 'template_4.yml', 2);
INSERT INTO rules VALUES (6, 'lt 5.0.0', 'endswith 1.6', null, null, null, null, null, null, 'template_5.yml', 3);

CREATE SEQUENCE rule_id_seq START 7;
CREATE SEQUENCE parameter_id_seq START 1;
