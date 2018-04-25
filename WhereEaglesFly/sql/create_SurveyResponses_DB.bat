echo off

rem batch file to run a script to create a the surveyResponses db
rem 04/16/2018 - John Miller

sqlcmd -S localhost -E -i surveyResponses.sql
sqlcmd -S localhost -E -i SampleData_SurveyResponses.sql

rem sqlcmd -S localhost/sqlexpress -E -i surveyResponses.sql
rem sqlcmd -S localhost/mssqlserver -E -i surveyResponses.sql

ECHO .
ECHO if no error messages appear DB was created
PAUSE