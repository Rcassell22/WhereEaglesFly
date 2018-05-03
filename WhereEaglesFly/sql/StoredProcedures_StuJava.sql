print '' print '*** Using database stujava';

GO
USE [stujava];
GO

/* ********** STORED PROCEDURES ********** */

/*	
	Creating Stored Procedure sp_retrieve_student_list 
	Created by John Miller 2018/04/26 
*/
-- DROP PROCEDURE [dbo].[sp_retrieve_student_list];

GO
CREATE PROCEDURE [dbo].[sp_retrieve_student_list]
AS
	BEGIN
		SELECT [Student].[StudentID]
			, [FirstName]
			, [LastName]
			, [Email]
			, [GraduationDate]
			, [AreaOfEmphasis]
			, [PhoneNumber]
			, [TraditionalStudent]
			, [Active]
		FROM [Student]
	END
GO

/*	
Creating Stored Procedure sp_retrieve_students_have_completed_survey 
	Created by John Miller 2018/04/26	
*/

-- DROP PROCEDURE [dbo].[sp_retrieve_students_have_completed_survey];
GO
CREATE PROCEDURE [dbo].[sp_retrieve_students_have_completed_survey]
AS
	BEGIN
		SELECT [Student].[StudentID]
			, [FirstName]
			, [LastName]
			, [Email]
			, [GraduationDate]
			, [AreaOfEmphasis]
			, [PhoneNumber]
			, [TraditionalStudent]
			, [Active]
		FROM [Student]
		INNER JOIN [Survey] 
		ON [Student].[StudentID] = [Survey].[StudentID]
	END
GO

/*	
	Creating Stored Procedure sp_retrieve_students_have_not_completed_survey 
	Created by John Miller 2018/04/26	
*/

-- DROP PROCEDURE [sp_retrieve_students_have_not_completed_survey];
GO
CREATE PROCEDURE [dbo].[sp_retrieve_students_have_not_completed_survey]
AS
	BEGIN
		SELECT [Student].[StudentID]
			, [FirstName]
			, [LastName]
			, [Email]
			, [GraduationDate]
			, [AreaOfEmphasis]
			, [PhoneNumber]
			, [TraditionalStudent]
			, [Active]
		FROM [Student]
		WHERE [StudentID] NOT IN(
			SELECT [StudentID] 
			FROM [Survey]
		)
	END
GO

/*	
	Creating Stored Procedure sp_retrieve_student_by_id 
	Created by James Sumner 2018/04/24	
*/

-- DROP PROCEDURE [dbo].[sp_retrieve_student_by_id];
GO
CREATE PROCEDURE [dbo].[sp_retrieve_student_by_id]
(
		@StudentID			[int]
)
AS
	BEGIN
		SELECT [Student].[StudentID]
			, [FirstName]
			, [LastName]
			, [Email]
			, [GraduationDate]
			, [AreaOfEmphasis]
			, [PhoneNumber]
			, [TraditionalStudent]
			, [Active]
		FROM [Student]
		WHERE [StudentID] = @StudentID
	END
GO

/*	
	Creating Stored Procedure sp_deactivate_student_by_id 
	Created by James Sumner 2018/04/24	
*/

-- Drop Procedure [dbo].[sp_deactivate_student_by_id];

GO
CREATE PROCEDURE [dbo].[sp_deactivate_student_by_id]
(
		@StudentID			[int]
)
AS
	BEGIN
		UPDATE [Student]
		SET [active] = 0
		WHERE [StudentID] = @StudentID;
		SELECT @@ROWCOUNT as RowsAffected;
	END
GO

/*  
	Created by James Sumner
	deactivate survey by ID	
*/

/*
GO
CREATE PROCEDURE [dbo].[deactivate_survey_by_id]
(
		@SurveyID			[int]
)
AS
	BEGIN
		UPDATE [Survey]
		SET [active] = 0
		WHERE [SurveyID] = @SurveyID;
		SELECT @@ROWCOUNT as RowsAffected;
	END
GO
*/


/*	Creating Stored Procedure sp_retrieve_survey_by_id
	Created by James Sumner 2018/04/24	
*/
-- Drop PROCEDURE [dbo].[sp_retrieve_survey_by_id];

GO
CREATE PROCEDURE [dbo].[sp_retrieve_survey_by_id]
(
		@SurveyID			[int]
)
AS
	BEGIN
		SELECT 
			[SurveyID]
			, [StudentID]
			, [SurveyCode] 
			, [SalaryRange]
			, [EmployerID]
			, [DateTimeRecorded]
			, [EducationAfterKirkwood]
		FROM [Survey]
		WHERE [SurveyID] = @SurveyID
	END
GO

/*	Creating Stored Procedure sp_retrieve_survey_by_id
	Created by James Sumner 2018/04/26	
*/

-- DROP PROCEDURE [dbo].[sp_retrieve_survey_list];

GO
CREATE PROCEDURE [dbo].[sp_retrieve_survey_list]
AS
	BEGIN
		SELECT [SurveyID]
		,[StudentID]
		,[SurveyCode]
		,[SalaryRange]
		,[EmployerID]
		,[DateTimeRecorded]
		,[EducationAfterKirkwood]
		FROM [Survey]
	END
GO

/*	
	Creating Stored Procedure sp_create_student
	Created by James Sumner 2018/04/26	
*/

-- DROP PROCEDURE [dbo].[sp_create_student];

GO
CREATE PROCEDURE [dbo].[sp_create_student]
(
	@FirstName					[nvarchar](100),				
	@LastName					[nvarchar](100),		
	@Email						[nvarchar](254),				
	@GraduationDate				[Date],					
	@PhoneNumber				[nvarchar](15),				
	@AreaOfEmphasis				[nvarchar](100),				
	@PriorDegree				[bit],		
	@TraditionalStudent			[bit],		
	@Active						[bit]
)
AS
	BEGIN
		INSERT INTO [dbo].[Student]
			([FirstName],[LastName],[Email],[GraduationDate],[PhoneNumber],[AreaOfEmphasis],[PriorDegree],[TraditionalStudent],[Active])
		VALUES
		(	
			@FirstName
			,@LastName
			,@Email
			,@GraduationDate
			,@PhoneNumber
			,@AreaOfEmphasis
			,@PriorDegree
			,@TraditionalStudent
			,@Active
		)
		SELECT SCOPE_IDENTITY()
	END
GO

/*	
	Creating Stored Procedure sp_retrieve_location_list
	Created by James Sumner 2018/04/26	
*/

-- DROP PROCEDURE [dbo].[sp_retrieve_list_of_locations];

GO
CREATE PROCEDURE [dbo].[sp_retrieve_location_list]
AS
	BEGIN
		SELECT [LocationID]
		,[City]
		,[Street]
		,[PostalCode]
		,[RegionID]
		,[Country]
		From [Location]
	END
GO

/*	Creating Stored Procedure retrieve_location_by_id
	Created by James Sumner 2018/04/26	
*/

-- DROP PROCEDURE [dbo].[retrieve_location_by_id];

GO
CREATE PROCEDURE [dbo].[retrieve_location_by_id]
(
	@LocationID		[int]
)

AS
	BEGIN
		SELECT [LocationID]
		,[City]
		,[Street]
		,[PostalCode]
		,[RegionID]
		,[Country]
		From [Location]
		WHERE [LocationID] = @LocationID
	END
GO

/*	
	Creating Stored Procedure sp_create_location
	Created by James Sumner 2018/04/26	
*/

-- DROP PROCEDURE sp_create_location
GO
CREATE PROCEDURE [dbo].[sp_create_location]
(
	@StudentID					[int], 						
	@Country					[nvarchar](100),
	@RegionID					[nvarchar](100),				
	@PostalCode					[nvarchar](100),				
	@Street						[nvarchar](100),				
	@City						[nvarchar](100)		
)	
AS
	BEGIN
		INSERT INTO [dbo].[Location]
			([StudentID],[Country],[RegionID],[PostalCode],[Street],[City])
		VALUES
			(@StudentID,@Country,@RegionID,@PostalCode,@Street,@City)
		SELECT SCOPE_IDENTITY()
	END
GO

/*	Creating Stored Procedure sp_create_location
	Created by James Sumner 2018/04/26	
*/

-- DROP PROCEDURE sp_create_survey

GO
CREATE PROCEDURE [dbo].[sp_create_survey]
(
	@StudentID					[int],		
	@SurveyCode					[nvarchar](100),
	@SalaryRange				[nvarchar](50),				
	@EmployerID					[nvarchar](1000),			
	@DateTimeRecorded			[Date],						
	@EducationAfterKirkwood		[bit]	
)	
AS
	BEGIN
		INSERT INTO [dbo].[Survey]
			([StudentID],[SurveyCode],[SalaryRange],[EmployerID],[DateTimeRecorded],[EducationAfterKirkwood])
		VALUES
			(@StudentID,@SurveyCode,@SalaryRange,@EmployerID,@DateTimeRecorded,@EducationAfterKirkwood)
		SELECT SCOPE_IDENTITY()
	END
GO


/*	
	Creating Stored Procedure sp_edit_survey_by_id
	Created by Zouhour Brahmi. 2018/04/26
*/

-- DROP PROCEDURE sp_edit_survey_by_id

print '' print '*** Creating sp_edit_survey_by_id'
GO
CREATE PROCEDURE [dbo].[sp_edit_survey_by_id]
	(	
	@StudentID						[int],
	@NewSurveyCode					[nvarchar](100),	
	@NewStudentID					[int], 										
	@NewSalaryRange					[nvarchar](50),				
	@NewEmployerID					[nvarchar](1000),			
	@NewDateTimeRecorded			[Date],						
	@NewEducationAfterKirkwood		[bit],
	@SurveyID						[int]
	)	
AS
	BEGIN
		UPDATE [Survey]
			SET		[SurveyCode] = @NewSurveyCode
					, [SalaryRange] = @NewSalaryRange
					, [EmployerID] = @NewEmployerID
					, [DateTimeRecorded]= @NewDateTimeRecorded
					, [EducationAfterKirkwood]=@NewEducationAfterKirkwood
			WHERE	[SurveyID] = @SurveyID
			AND		[StudentID] = @StudentID
		RETURN @@ROWCOUNT
	END
GO

/* 
	Created by Zouhour Brahmi.  
	Update Location 
*/

-- DROP PROCEDURE sp_edit_location_by_id

print '' print '*** Creating sp_edit_location_by_id'
GO
CREATE PROCEDURE [dbo].[sp_edit_location_by_id]
(
	@LocationID						[int],
	@StudentID						[int],
	@NewRegionID					[nvarchar](100),		
	@NewStudentID					[int], 						
	@NewCountry						[nvarchar](100),								
	@NewPostalCode					[nvarchar](100),				
	@NewStreet						[nvarchar](100),				
	@NewCity						[nvarchar](100)
)	
AS
	BEGIN
		UPDATE [Location]
			SET		[RegionID] = @NewRegionID,
					[StudentID] = @StudentID,
					[Country] = @NewCountry,
					[PostalCode] = @NewPostalCode,
					[Street] = @NewStreet,
					[City] = @NewCity
			WHERE	[LocationID] = @LocationID
			AND		[StudentID] = @StudentID
		RETURN @@ROWCOUNT
	END
GO

/* 
	Created by Zouhour Brahmi.  
	Update Student
*/
print '' print '*** Creating sp_edit_student_by_id'
GO
CREATE PROCEDURE [dbo].[sp_edit_student_by_id]
(
	@NewFirstName					[nvarchar](100),				
	@NewLastName					[nvarchar](100),		
	@NewEmail						[nvarchar](254),				
	@NewGraduationDate				[Date],					
	@NewPhoneNumber					[nvarchar](15),				
	@NewAreaOfEmphasis				[nvarchar](100),				
	@NewPriorDegree					[bit],		
	@NewTraditionalStudent			[bit],		
	@NewActive						[bit],
	@StudentID						[int]
)
AS
	BEGIN
		UPDATE [Student]
			SET		[FirstName] = @NewFirstName,
					[LastName] = @NewLastName,
					[Email] = @NewEmail,
					[GraduationDate] = @NewGraduationDate,
					[PhoneNumber] = @NewPhoneNumber,
					[AreaOfEmphasis] = @NewAreaOfEmphasis,
					[PriorDegree] = @NewPriorDegree,
					[TraditionalStudent] = @NewTraditionalStudent,
					[Active] = @NewActive
			WHERE	[StudentID] = @StudentID
		RETURN @@ROWCOUNT
	END
GO

GO