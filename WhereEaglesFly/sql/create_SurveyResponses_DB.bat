echo off

rem batch file to run a script to create a the stujava DB
rem 04/16/2018 - John Miller

sqlcmd -S localhost -E -i stujava.sql
sqlcmd -S localhost -E -i SampleData_StuJava.sql
sqlcmd -S localhost -E -i StoredProcedures_StuJava.sql

rem sqlcmd -S localhost/sqlexpress -E -i stuJava.sql
rem sqlcmd -S localhost/mssqlserver -E -i stuJava.sql

ECHO .
ECHO if no error messages appear DB was created
PAUSE