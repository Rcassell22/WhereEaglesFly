/* Created by James Sumner. 
retrieve list of students who have filled out the survey */
GO
CREATE PROCEDURE [dbo].[retrieve_students_have_filled_out_survey]
AS
	BEGIN
		SELECT [StudentID],[FirstName],[LastName],[Email]
		FROM [Student]
		WHERE [Complete] = true
	END
GO

/* Created by James Sumner.  
retrieve student by id */


GO
CREATE PROCEDURE [dbo].[retrieve_student_by_id]
{
		@StudentID			[int]
}
AS
	BEGIN
		SELECT [StudentID],[FirstName],[LastName],[Email],[GraduationDate],[PhoneNumber],[AreaOfEmphasis],[PriorDegree],[TraditionalStudent],[Active]
		FROM [Student]
		WHERE [StudentID] = @StudentID
	END
GO

/*created by James Sumner. 
retrieve list of students who haven't filled out the survey */

GO
CREATE PROCEDURE [dbo].[retrieve_students_have_not_filled_out_survey]
AS
	BEGIN
		SELECT [StudentID],[FirstName],[LastName],[Email]
		FROM [Student]
		WHERE [Complete] = false
	END
GO

/*Created by James Sumer
deactivate student by ID*/
GO
CREATE PROCEDURE [dbo].[deactivate_student_by_id]
{
		@StudentID			[int]
}
AS
	BEGIN
		UPDATE [Student]
		SET [active] = 0
		WHERE [StudentID] = @StudentID
	END
GO

/*Created by James Sumer
deactivate survey by ID*/
GO
CREATE PROCEDURE [dbo].[deactivate_survey_by_id]
{
		@StudentID			[int]
}
AS
	BEGIN
		UPDATE [Survey]
		SET [active] = 0
		WHERE [StudentID] = @StudentID
	END
GO

/* Created by James Sumner.  
retrieve survey by id */


GO
CREATE PROCEDURE [dbo].[retrieve_survey_by_id]
{
		@SurveyID			[int]
}
AS
	BEGIN
		SELECT [SurveyID],[StudentID],[SurveyCode],[SalaryRange],[EmployerID],[DateTimeRecorded],[EducationAfterKirkwood]
		FROM [Survey]
		WHERE [SurveyID] = @SurveyID
	END
GO

/* Created by James Sumner.  
retrieve list of surveys*/


GO
CREATE PROCEDURE [dbo].[retrieve_list_of_surveys]

AS
	BEGIN
		SELECT [SurveyID],[StudentID],[SurveyCode],[SalaryRange],[EmployerID],[DateTimeRecorded],[EducationAfterKirkwood]
		FROM [Survey]
	END
GO

/* Created by James Sumner.  
Create student */


GO
CREATE PROCEDURE [dbo].[create_student]
{
	@StudentID					[int] IDENTITY(100000, 1)
	@FirstName					[nvarchar](100)				
	@LastName					[nvarchar](100)		
	@Email						[nvarchar](254)				
	@GraduationDate				[Date]					
	@PhoneNumber				[nvarchar](15)				
	@AreaOfEmphasis				[nvarchar](100)				
	@PriorDegree				[bit]		
	@TraditionalStudent			[bit]		
	@Active						[bit]
}
AS
	BEGIN
		INSERT INTO [dbo].[Student]
			([StudentID],[FirstName],[LastName],[Email],[GraduationDate],[PhoneNumber],[AreaOfEmphasis],[PriorDegree],[TraditionalStudent],[Active])
		VALUES
			(@StudentID,@FirstName,@LastName,@Email,@GraduationDate,@PhoneNumber,@AreaOfEmphasis,@PriorDegree,@TraditionalStudent,@Active)
		SELECT SCOPE_IDENTITY()
	END
GO

/* Created by James Sumner.  
retrieve list of locations */


GO
CREATE PROCEDURE [dbo].[retrieve_list_of_locations]

AS
	BEGIN
		SELECT [LocationID],[City],[Street],[PostalCode],[RegionID],[Country]
		From [Location]
	END
GO




/* Created by James Sumner.  
retrieve  location by id */


GO
CREATE PROCEDURE [dbo].[retrieve_location_by_id]
{
	@LocationID
}
AS
	BEGIN
		SELECT [LocationID],[City],[Street],[PostalCode],[RegionID],[Country]
		From [Location]
		WHERE [LocationID]=@LocationID
	END
GO


/* Created by James Sumner.  
deactivate location by id */


GO
CREATE PROCEDURE [dbo].[deactivate_location_by_id]
{
	@LocationID
}
AS
	BEGIN
		UPDATE [Location]
		SET [active] = 0
		WHERE [LocationID]=@LocationID
	END
GO


/* Created by James Sumner.  
Create location */


GO
CREATE PROCEDURE [dbo].[create_location]
{
	@LocationID					[int] IDENTITY(100000, 1)	
	@StudentID					[int] 						
	@Country					[nvarchar](100)				
	@RegionID					[nvarchar](100)				
	@PostalCode					[nvarchar](100)				
	@Street						[nvarchar](100)				
	@City						[nvarchar](100)		
}	
AS
	BEGIN
		INSERT INTO [dbo].[Location]
			([LocationID],[StudentID],[Country],[RegionID],[PostalCode],[Street],[City])
		VALUES
			(@LocationID,@StudentID,@Country,@RegionID,@PostalCode,@Street,@City)
		SELECT SCOPE_IDENTITY()
	END
GO


/* Created by James Sumner.  
Create Survey */


GO
CREATE PROCEDURE [dbo].[create_survey]
{
	@SurveyID					[int] IDENTITY(100000, 1)	
	@StudentID					[int] 						
	@SurveyCode					[nvarchar](100)				
	@SalaryRange				[nvarchar](50)				
	@EmployerID					[nvarchar](1000)			
	@DateTimeRecorded			[Date]						
	@EducationAfterKirkwood		[bit]	
}	
AS
	BEGIN
		INSERT INTO [dbo].[Survey]
			([SurveyID],[StudentID],[SurveyCode],[SalaryRange],[EmployerID],[DateTimeRecorded],[EducationAfterKirkwood])
		VALUES
			(@SurveyID,@StudentID,@SurveyCode,@SalaryRange,@EmployerID,@DateTimeRecorded,@EducationAfterKirkwood)
		SELECT SCOPE_IDENTITY()
	END
GO

/* Created by Zouhour Brahmi.  
Update Survey */
/*print '' print '*** in file EditSurveyByIDWithSurveyCode.sql ***'
USE [I do not know the name of the database you are using]
GO*/


print '' print '*** Creating sp_edit_survey_by_id'
GO
CREATE PROCEDURE [dbo].[sp_edit_survey_by_id_with_SurveyCode]
{	
	@NewSurveyCode					[nvarchar](100)	
	@NewStudentID					[int] 										
	@NewSalaryRange					[nvarchar](50)				
	@NewEmployerID					[nvarchar](1000)			
	@NewDateTimeRecorded			[Date]						
	@NewEducationAfterKirkwood		[bit]
	@OldSurveyCode					[nvarchar](100)
	@OldStudentID					[int] 										
	@OldSalaryRange					[nvarchar](50)				
	@OldEmployerID					[nvarchar](1000)			
	@OldDateTimeRecorded			[Date]						
	@OldEducationAfterKirkwood		[bit]
	@SurveyID						[int] IDENTITY(100000, 1)
}	
AS
	BEGIN
		UPDATE [Survey]
			SET		[SurveyCode] = @NewSurveyCode,
					[StudentID] = @NewStudentID,
					[SalaryRange] = @NewSalaryRange,
					[EmployerID] = @NewEmployerID,
					[DateTimeRecorded]= @NewDateTimeRecorded,
					[EducationAfterKirkwood]=@NewEducationAfterKirkwood
			WHERE	[SurveyID] = @SurveyID
			AND		[StudentID] = @OldStudentID
			AND		[SalaryRange] = @OldSalaryRange
			AND		[EmployerID] = @OldEmployerID
			AND		[DateTimeRecorded] = @OldDateTimeRecorded
			AND		[EducationAfterKirkwood] = @OldEducationAfterKirkwood
		RETURN @@ROWCOUNT
	END
Go

/* Created by Zouhour Brahmi.  
Update Location */
/*print '' print '*** in file EditLocationByIDWithRegionID.sql ***'
USE [I do not know the name of the database you are using]
GO*/


print '' print '*** Creating sp_edit_loaction_by_id'
GO
GO
CREATE PROCEDURE [dbo].[sp_edit_location_by_id_with_RegionID]
{
	@NewRegionID					[nvarchar](100)		
	@NewStudentID					[int] 						
	@NewCountry						[nvarchar](100)								
	@NewPostalCode					[nvarchar](100)				
	@NewStreet						[nvarchar](100)				
	@NewCity						[nvarchar](100)
	@OldRegionID					[nvarchar](100)		
	@OldStudentID					[int] 						
	@OldCountry						[nvarchar](100)								
	@OldPostalCode					[nvarchar](100)				
	@OldStreet						[nvarchar](100)				
	@OldCity						[nvarchar](100)
	@LocationID						[int] IDENTITY(100000, 1)	
}	
AS
	BEGIN
		UPDATE [Location]
			SET		[RegionID] = @NewRegionID,
					[StudentID] = @NewStudentID,
					[Country] = @NewCountry,
					[PostalCode] = @NewPostalCode,
					[Street] = @NewStreet,
					[City] = @NewCity
			WHERE	[LocationID] = @LocationID
			AND		[StudentID] = @OldStudentID
			AND		[Country] = @OldCountry
			AND		[PostalCode] = @OldPostalCode
			AND		[Street] = @OldStreet
			AND		[City] = @OldCity
		RETURN @@ROWCOUNT
	END
GO

/* Created by Zouhour Brahmi.  
Update Student */
/*print '' print '*** in file EditStudentByIDWithFirstName.sql ***'
USE [I do not know the name of the database you are using]
GO*/


GO
CREATE PROCEDURE [dbo].[sp_edit_student_by_id_with_FirstName]
{
	@NewFirstName					[nvarchar](100)				
	@NewLastName					[nvarchar](100)		
	@NewEmail						[nvarchar](254)				
	@NewGraduationDate				[Date]					
	@NewPhoneNumber					[nvarchar](15)				
	@NewAreaOfEmphasis				[nvarchar](100)				
	@NewPriorDegree					[bit]		
	@NewTraditionalStudent			[bit]		
	@NewActive						[bit]
	@OldFirstName					[nvarchar](100)				
	@OldLastName					[nvarchar](100)		
	@OldEmail						[nvarchar](254)				
	@OldGraduationDate				[Date]					
	@OldPhoneNumber					[nvarchar](15)				
	@OldAreaOfEmphasis				[nvarchar](100)				
	@OldPriorDegree					[bit]		
	@OldTraditionalStudent			[bit]		
	@OldActive						[bit]
	@StudentID						[int] IDENTITY(100000, 1)
}
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
			AND		[LastName] = @OldLastName
			AND		[Email]	= @OldEmail
			AND		[GraduationDate] = @OldGraduationDate
			AND		[PhoneNumber] = @OldPhoneNumber
			AND		[AreaOfEmphasis] = @OldAreaOfEmphasis
			AND		[PriorDegree] = @OldPriorDegree
			AND		[TraditionalStudent] = @OldTraditionalStudent
			AND		[Active] = @OldActive
		RETURN @@ROWCOUNT
	END
GO
