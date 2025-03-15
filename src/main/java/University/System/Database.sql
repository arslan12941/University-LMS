create database UNIVERSITY_LMS;

use university_lms;

CREATE TABLE faculty (
    id int AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL
);

CREATE TABLE course (
    id int AUTO_INCREMENT PRIMARY KEY,
    title varchar(255) NOT NULL,
    code varchar(255) Not NULL,
    faculty_id int,
    FOREIGN KEY (faculty_id) REFERENCES faculty(id) ON DELETE SET NULL
);

CREATE TABLE student (
    id int AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL
);

CREATE TABLE studentprofile (
    id int PRIMARY KEY,
    email varchar(255),
    address varchar(255),
    phone varchar(50),
    dob int,
    student_id int UNIQUE,
    FOREIGN KEY (student_id) REFERENCES student(id) ON DELETE CASCADE
);

CREATE TABLE student_courses (
    student_id int,
    course_id int,
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES student(id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES course(id) ON DELETE CASCADE
);

insert into studentprofile(email, address, phone, dob)
value('zaman@gmail.com', 'Lahore', 'Number', '10-10-2001');

select * from studentprofile;
select * from student;

ALTER TABLE studentprofile MODIFY COLUMN dob varchar(111);

SET SQL_SAFE_UPDATES = 0;

update studentprofile
Set student_id=5
where address='Lahore';

select * from course;

insert into student_courses(student_id, course_id)
value('5', '5');

select * from student_courses;