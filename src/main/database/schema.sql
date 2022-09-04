DROP TABLE IF EXISTS student;

DROP TABLE IF EXISTS course;

DROP TABLE IF EXISTS batch;

DROP TABLE IF EXISTS enrollment;


CREATE TABLE students
(
    id            char(4) primary key,
    name          varchar(20),
    birthday      date,
    city          varchar(20),
    qualification varchar(20),
    email         varchar(30),
    phone         varchar(20)
);

CREATE TABLE course
(
    courseid       char(4) primary key,
    coursename     varchar(40),
    coursecategory varchar(20),
    coursefees     decimal(10, 2),
    courseduration int
);

CREATE TABLE batch
(
    batchid   char(4) primary key,
    bsdate    date,
    bstrength int,
    courseid  char(4),
    foreign key (courseid) references course (courseid)
);

CREATE TABLE enrollment
(
    batchid char(4),
    sid     char(4),
    edate   date,
    primary key (batchid, sid),
    foreign key (sid) references student (sid),
    foreign key (batchid) references batch (batchid)
);

CREATE TABLE teacher
(
    id         char(4),
    name       varchar(20),
    birthday   date,
    department varchar(20) primary key,
    dateofjoin date,
    salary     char(6),
    sex        varchar(1)

)

CREATE TABLE studentGRADEPOINT
(
    gradpointaverage char(4),
    subject varchar(20),
foreign key (subject) references teacher(department)
);