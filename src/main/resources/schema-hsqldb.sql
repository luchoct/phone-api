DROP TABLE phone_catalog IF EXISTS CASCADE;

-- phone_catalog
CREATE TABLE phone_catalog (
    id int NOT NULL,
    title character varying(100) NOT NULL,
    description character varying(1000) NOT NULL,
    picture_id character varying(30) NOT NULL,
    sim_free_fee numeric(6,2) NOT NULL,
    phone_features character varying(3000) NOT NULL,
);

ALTER TABLE phone_catalog ADD CONSTRAINT phone_catalog_pk PRIMARY KEY (id);
