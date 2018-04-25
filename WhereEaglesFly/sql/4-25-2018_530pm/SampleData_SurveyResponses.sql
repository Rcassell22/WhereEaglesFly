/* ******************** SurveyResponses ****************
   ******************** Sample Data ******************** */

print '' print '*** Using database surveyResponses'
GO
USE [surveyResponses]
GO

print '' print '*** Inserting Student Sample Data'
GO
	INSERT INTO [dbo].[Student]
		([Email], [FirstName], [LastName], [GraduationDate])
	VALUES
		("Employee1@email.com", "John", "Smith", '2017-05-11'),
		("Employee2@email.com", "Mark", "Doe", '2016-05-10'),
		("Employee3@email.com", "Jen", "Doe", '2015-05-09'),
		("Employee4@email.com", "Sarah", "Smith", '2014-05-08')
GO
   
print '' print '*** Inserting Location Sample Data'
GO
	INSERT INTO [dbo].[Location]
		([StudentID])
	VALUES
		(100000),
		(100001),
		(100002),
		(100003)
GO

print '' print '*** Inserting Survey Sample Data'
GO
	INSERT INTO [dbo].[Survey]
		([StudentID], [EmployerID], [SurveyCode], [DateTimeRecorded])
	VALUES
		(100000, "IT Services", "exampleSurveyCode1000", '2018-05-30'),
		(100001, "Business Co.", "exampleSurveyCode1001", '2018-10-12'),
		(100002, "Data Inc.", "exampleSurveyCode1002", '2025-08-08'), 
		(100003, "Servers 'R' Us", "exampleSurveyCode1003", '2077-07-04')
GO