IF EXISTS(SELECT 1 FROM master.dbo.sysdatabases WHERE name = 'surveyResponses')
BEGIN
	DROP DATABASE surveyResponses
	print '' print '*** Dropping database surveyResponses'
END
GO

print '' print '*** Creating database surveyResponses'
GO
CREATE DATABASE surveyResponses
GO

print '' print '*** Using database surveyResponses'
GO
USE [surveyResponses]
GO

/* ******************************************
   ***************** Tables ***************** 
   ****************************************** */

print '' print '*** Creating Student Table'
GO
CREATE TABLE [Student](
	[StudentID]					[int] IDENTITY(100000, 1)	NOT NULL,
	[FirstName]					[nvarchar](100)				NOT NULL,
	[LastName]					[nvarchar](100)				NOT NULL,
	[Email]						[nvarchar](254)				NOT NULL,
	[GraduationDate]			[Date]						NOT NULL,
	[PhoneNumber]				[nvarchar](15)				NULL,
	[AreaOfEmphasis]			[nvarchar](100)				NULL,
	[PriorDegree]				[bit]						NULL,
	[TraditionalStudent]		[bit]						NULL,
	[Active]					[bit]						Not NULL DEFAULT 1,
	CONSTRAINT [pk_StudentID] PRIMARY KEY([StudentID] ASC),
	CONSTRAINT [ak_Student_Email] UNIQUE ([Email] ASC)
)
GO

print '' print '*** Creating Location Table'
GO
CREATE TABLE [Location](
	[LocationID]				[int] IDENTITY(100000, 1)	NOT NULL,
	[StudentID]					[int] 						NOT NULL,
	[Country]					[nvarchar](100)				NULL,
	[RegionID]					[nvarchar](100)				NULL,
	[PostalCode]				[nvarchar](100)				NULL,
	[Street]					[nvarchar](100)				NULL,
	[City]						[nvarchar](100)				NULL,
	CONSTRAINT [LocationID] PRIMARY KEY([LocationID] ASC),	
)
GO

print '' print '*** Creating Survey Table'
GO
CREATE TABLE [Survey](
	[SurveyID]					[int] IDENTITY(100000, 1)	NOT NULL,
	[StudentID]					[int] 						NOT NULL,
	[SurveyCode]				[nvarchar](100)				NOT NULL,
	[SalaryRange]				[nvarchar](50)				NULL,
	[EmployerID]				[nvarchar](1000)			NOT NULL,
	[DateTimeRecorded]			[Date]						NOT NULL,
	[EducationAfterKirkwood]	[bit]						NULL,
	CONSTRAINT [pk_SurveyID] PRIMARY KEY([SurveyID] ASC)
)
GO

/* ************************************************
   ***************** FOREIGN KEYS *****************
   ************************************************ */


print '' print '*** Creating Survey StudentID Foreign Key'
GO
ALTER TABLE [dbo].[Survey] WITH NOCHECK
	ADD CONSTRAINT [fk_Survey_StudentID] FOREIGN KEY([StudentID])
	REFERENCES [dbo].[Student]([StudentID])
	ON UPDATE CASCADE
GO

print '' print '*** Creating Location StudentID Foreign Key'
GO
ALTER TABLE [dbo].[Location] WITH NOCHECK
	ADD CONSTRAINT [fk_Location_StudentID] FOREIGN KEY([StudentID])
	REFERENCES [dbo].[Student]([StudentID])
	ON UPDATE CASCADE
GO

