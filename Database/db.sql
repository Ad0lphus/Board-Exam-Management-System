SELECT * FROM pg_catalog.pg_tables
	WHERE schemaname != 'pg_catalog' AND 	-- To show all tables
    schemaname != 'information_schema';
SELECT 
table_name, 
column_name as "Columns", 
data_type as "DataTypes"
 FROM 							-- describe tables
 information_schema.columns
 where "table_schema"='public'
  order by table_name,column_name
  ;
  
select kcu.table_schema,
       kcu.table_name,
       tco.constraint_name,
       kcu.ordinal_position as position,
       kcu.column_name as key_column
from information_schema.table_constraints tco
join information_schema.key_column_usage kcu 
     on kcu.constraint_name = tco.constraint_name
     and kcu.constraint_schema = tco.constraint_schema
     and kcu.constraint_name = tco.constraint_name
where tco.constraint_type = 'PRIMARY KEY'
order by kcu.table_schema,
         kcu.table_name,
         position;

select tc.table_schema, tc.table_name, kc.column_name
from information_schema.table_constraints tc
  join information_schema.key_column_usage kc 
    on kc.table_name = tc.table_name and kc.table_schema = tc.table_schema and kc.constraint_name = tc.constraint_name
where tc.constraint_type = 'FOREIGN KEY'
  and kc.ordinal_position is not null
order by tc.table_schema,
         tc.table_name,
         kc.position_in_unique_constraint;

CREATE TABLE school
(
    schoolid integer NOT NULL,
    schoolname character varying(30) COLLATE pg_catalog."default",
    city character varying(30) COLLATE pg_catalog."default",
    state character varying(30) COLLATE pg_catalog."default",
    pincode integer,
    CONSTRAINT school_pkey PRIMARY KEY (schoolid)
);
select * from school;
		 
CREATE TABLE centers
(
    centerid integer NOT NULL,
    schoolid integer NOT NULL,
	capacity bigint,
    CONSTRAINT centers_pkey PRIMARY KEY (centerid),
    CONSTRAINT centers_schoolid_fkey FOREIGN KEY (schoolid)
        REFERENCES school (schoolid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
select * from centers;
insert into centers values(3,3,256),(4,4,256),(5,5,256);
CREATE TABLE exam
(
    examid integer NOT NULL,
    date date,
    "time" time without time zone,
    subjectid integer,
    exam_type character varying(10) COLLATE pg_catalog."default",
    CONSTRAINT exam_pkey PRIMARY KEY (examid)
);
insert into exam values(1,'2022-05-22','04:05:06.789',1,'written');
select * from exam;
CREATE TABLE conducts
(
    centerid integer,
    examid integer,
    CONSTRAINT conducts_centerid_fkey FOREIGN KEY (centerid)
        REFERENCES centers (centerid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT conducts_examid_fkey FOREIGN KEY (examid)
        REFERENCES exam (examid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

select * from conducts;
drop table examinar;
CREATE TABLE examinar
(
    e_id integer NOT NULL,
    fname character varying(30) COLLATE pg_catalog."default" NOT NULL,
    --mname character varying(30) COLLATE pg_catalog."default" NOT NULL,
    lname character varying(30) COLLATE pg_catalog."default" NOT NULL,
    phone character varying(30) COLLATE pg_catalog."default" NOT NULL,
    email character varying(30) COLLATE pg_catalog."default" NOT NULL,
    qualification character varying(550) COLLATE pg_catalog."default" NOT NULL,
    gender character varying(35) COLLATE pg_catalog."default" NOT NULL,
    stream integer NOT NULL,
    ischecker boolean NOT NULL,
    issupervisor boolean NOT NULL,
    issetter boolean NOT NULL,
    center integer,
    examid integer,
	state varchar(30),
	city varchar(30),
	username varchar(50),
	password varchar(50),
    CONSTRAINT examinar_pkey PRIMARY KEY (e_id),
    CONSTRAINT examinar_center_fkey FOREIGN KEY (center)
        REFERENCES centers (centerid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT examinar_examid_fkey FOREIGN KEY (examid)
        REFERENCES exam (examid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
select * from examinar;
CREATE TABLE marks
(
	enrollno int,
	name varchar(50),
	stream varchar(30),
	physics int,
	chemistry int,
	maths int,
	english int,
	biology int,
	cs int,
	business int,
	geography int,
	history int
);
select * from marks;
delete from marks where name ='Nithin';
CREATE TABLE stream
(
    sid integer NOT NULL,
    stream_name character varying(30) COLLATE pg_catalog."default",
    CONSTRAINT stream_pkey PRIMARY KEY (sid)
);
select * from stream;
CREATE TABLE statehead
(
	shusername varchar(30),
	shpassword varchar(30)
);
select * from statehead;
insert into statehead values
	('statehead1','password1'),
	('statehead2','password2'),
	('statehead3','password3')
	;
	
CREATE TABLE student
(
    enrollment_number integer NOT NULL,
    firstname character varying(30) COLLATE pg_catalog."default" NOT NULL,
    --middlename character varying(30) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(30) COLLATE pg_catalog."default" NOT NULL,
    fathername character varying(30) COLLATE pg_catalog."default" NOT NULL,
	mothersname character varying(30) COLLATE pg_catalog."default" NOT NULL,
    aadharnumber bigint NOT NULL,
    mobilenumber bigint NOT NULL,
    date_of_birth date NOT NULL,
    city character varying(30) COLLATE pg_catalog."default" NOT NULL,
    state character varying(30) COLLATE pg_catalog."default" NOT NULL,
    --pincode integer NOT NULL,
    gender character varying(1) COLLATE pg_catalog."default" NOT NULL,
    --physical_handicap boolean NOT NULL,
    email character varying(30) COLLATE pg_catalog."default" NOT NULL,
	username character varying(30) COLLATE pg_catalog."default" NOT NULL,
	password character varying(30) COLLATE pg_catalog."default" NOT NULL,
    center integer NOT NULL,
    stream integer NOT NULL,
    school integer NOT NULL,
    CONSTRAINT student_pkey PRIMARY KEY (enrollment_number),
    CONSTRAINT student_center_fkey FOREIGN KEY (center)
        REFERENCES centers (centerid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT student_school_fkey FOREIGN KEY (school)
        REFERENCES school (schoolid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT student_stream_fkey FOREIGN KEY (stream)
        REFERENCES stream (sid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
select * from student;

CREATE TABLE gives
(
    student integer,
    exam integer,
    CONSTRAINT gives_exam_fkey FOREIGN KEY (exam)
        REFERENCES exam (examid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT gives_student_fkey FOREIGN KEY (student)
        REFERENCES student (enrollment_number) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE result
(
    result_id integer NOT NULL,
    studentid integer NOT NULL,
    persentage integer,
    is_pass boolean NOT NULL,
    CONSTRAINT result_pkey PRIMARY KEY (result_id),
    CONSTRAINT result_studentid_fkey FOREIGN KEY (studentid)
        REFERENCES student (enrollment_number) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);



CREATE TABLE school_representative
(
    srid integer,
    schoolid integer NOT NULL,
    address character varying(50) COLLATE pg_catalog."default",
    phone integer,
    email character varying(50) COLLATE pg_catalog."default",
    pincode integer,
    fname character varying(30) COLLATE pg_catalog."default",
    mname character varying(30) COLLATE pg_catalog."default",
    lname character varying(30) COLLATE pg_catalog."default",
    CONSTRAINT school_representative_schoolid_key UNIQUE (schoolid)
,
    CONSTRAINT school_representative_schoolid_fkey FOREIGN KEY (schoolid)
        REFERENCES school (schoolid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE subject
(
    subjectid integer NOT NULL,
    subject_name character varying(30) COLLATE pg_catalog."default",
    streamid integer,
    CONSTRAINT subject_pkey PRIMARY KEY (subjectid),
    CONSTRAINT subject_streamid_fkey FOREIGN KEY (streamid)
        REFERENCES stream (sid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
--------------------------------------------------

select firstname, lastname, username, password from student;
select fname, lname, username, password from examinar;
select * from statehead;
select * from marks;
select * from school;