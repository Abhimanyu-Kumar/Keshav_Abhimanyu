/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Abhi
 * Created: 24 Sep, 2017
 */



-- Table: public.bill_challan_master

-- DROP TABLE public.bill_challan_master;

CREATE TABLE public.bill_challan_master
(
    bill_no integer NOT NULL DEFAULT nextval('bill_challan_master_bill_no_seq'::regclass),
    order_no character varying(20) COLLATE pg_catalog."default" NOT NULL,
    challan_date character varying(20) COLLATE pg_catalog."default",
    name character varying(100) COLLATE pg_catalog."default",
    address_line1 character varying(500) COLLATE pg_catalog."default",
    address_line2 character varying(500) COLLATE pg_catalog."default",
    telephone character varying(50) COLLATE pg_catalog."default",
    sender_message character varying(500) COLLATE pg_catalog."default",
    sender_details character varying(500) COLLATE pg_catalog."default",
    thank_you_message character varying(1000) COLLATE pg_catalog."default",
    company_id integer,
    CONSTRAINT "billNo_Pkey" PRIMARY KEY (bill_no),
    CONSTRAINT "company_id_fgnKey" FOREIGN KEY (company_id)
        REFERENCES public.company_master (company_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.bill_challan_master
    OWNER to postgres;

-- Table: public.company_master

-- DROP TABLE public.company_master;

CREATE TABLE public.company_master
(
    company_id integer NOT NULL DEFAULT nextval('company_master_company_id_seq'::regclass),
    company_name character varying(200) COLLATE pg_catalog."default",
    company_alias_name character varying(200) COLLATE pg_catalog."default",
    company_add1 character varying(200) COLLATE pg_catalog."default",
    company_add2 character varying(200) COLLATE pg_catalog."default",
    company_add3 character varying(200) COLLATE pg_catalog."default",
    company_telephone character varying(200) COLLATE pg_catalog."default",
    company_mobile character varying(200) COLLATE pg_catalog."default",
    company_website character varying(200) COLLATE pg_catalog."default",
    company_emailid character varying(200) COLLATE pg_catalog."default",
    company_gstno character varying(200) COLLATE pg_catalog."default",
    company_tinno character varying(100) COLLATE pg_catalog."default",
    company_logo_path bytea,
    CONSTRAINT company_master_pkey PRIMARY KEY (company_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.company_master
    OWNER to postgres;


-- Table: public.customer_master

-- DROP TABLE public.customer_master;

CREATE TABLE public.customer_master
(
    customer_no integer NOT NULL DEFAULT nextval('customer_master_custeomer_no_seq'::regclass),
    customer_name character varying(200) COLLATE pg_catalog."default",
    customer_add1 character varying(200) COLLATE pg_catalog."default",
    customer_add2 character varying(200) COLLATE pg_catalog."default",
    customer_add3 character varying(200) COLLATE pg_catalog."default",
    customer_emailid character varying(200) COLLATE pg_catalog."default",
    customer_gstno character varying(200) COLLATE pg_catalog."default",
    customer_tinno character varying(100) COLLATE pg_catalog."default",
    customer_mobileno character varying(100) COLLATE pg_catalog."default",
    website character varying(100) COLLATE pg_catalog."default",
    customer_landline character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT customer_master_pkey PRIMARY KEY (customer_no)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.customer_master
    OWNER to postgres;


-- Table: public.invoice_master

-- DROP TABLE public.invoice_master;

CREATE TABLE public.invoice_master
(
    id integer NOT NULL DEFAULT nextval('invoice_master_id_seq'::regclass),
    invoice_id character varying(200) COLLATE pg_catalog."default" NOT NULL,
    tax_reverse_charge boolean,
    transport_mode character varying(200) COLLATE pg_catalog."default",
    vehicle_no character varying(50) COLLATE pg_catalog."default",
    plcae_of_supply character varying(200) COLLATE pg_catalog."default",
    receiver_id integer,
    consignee_id integer,
    cgst numeric,
    sgst numeric,
    igst numeric,
    freight numeric,
    grandtotal numeric,
    invoice_by character varying(200) COLLATE pg_catalog."default",
    company_id integer,
    CONSTRAINT invoice_master_pkey PRIMARY KEY (id),
    CONSTRAINT invoice_id_unique UNIQUE (invoice_id),
    CONSTRAINT "company_id_fgnKey" FOREIGN KEY (company_id)
        REFERENCES public.company_master (company_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT "consignee_id_fgnKey" FOREIGN KEY (consignee_id)
        REFERENCES public.customer_master (customer_no) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT "receiver_id_fgnKey" FOREIGN KEY (receiver_id)
        REFERENCES public.customer_master (customer_no) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.invoice_master
    OWNER to postgres;


-- Table: public.product_master

-- DROP TABLE public.product_master;

CREATE TABLE public.product_master
(
    id integer NOT NULL DEFAULT nextval('product_master_id_seq'::regclass),
    product_name character varying(200) COLLATE pg_catalog."default" NOT NULL,
    product_quantity integer,
    product_rate integer,
    hsn_code character varying(100) COLLATE pg_catalog."default",
    invoice_id character varying(200) COLLATE pg_catalog."default",
    CONSTRAINT product_master_pkey PRIMARY KEY (id),
    CONSTRAINT "invoice_id_fgnKey" FOREIGN KEY (invoice_id)
        REFERENCES public.invoice_master (invoice_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.product_master
    OWNER to postgres;