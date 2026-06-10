CREATE DATABASE if not exists StudentDB;
-- Drop table Book;
use StudentDB;
create table if not exists Book(
BookID int(50) primary key, 
BookName varchar(50), 
Price int(50),
Author varchar(50),
Genres varchar(50),
Status Varchar(50)
);

insert into Book values(29, "Harry Puttar", "540", "J.k. Rowling", "Mystery", "Reading");
insert into Book values(24, "Diary of a Wimpy Kid", "500", "Wimpy Kid","Comedy", "Reading");
insert into Book values(27, "500 Days od Summer", "800", "Scott","Romance", "Reading");
insert into Book values(26, "50 Shades of Grey", "1000", "E.L. James", "Romance", "Reading");

Update Book
set Status = "Finished"
where BookID = 26; 

Delete from Book where BookID = 29;

Select * from Book


-- select * from Employee;
