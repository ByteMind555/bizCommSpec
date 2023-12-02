
# MessageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**senderDetails** | [**EmailAddress**](EmailAddress.md) | The list of email Ids to which the email need to be sent. |  [optional]
**recipientDetails** | [**RecipientDetail**](RecipientDetail.md) | The list of recipient ids to which the eMail need to be sent. | 
**contentDetails** | [**MessagePayload**](MessagePayload.md) | The list of email Ids to which the email need to be sent. |  [optional]
**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | The list of attachments added to the email. |  [optional]
**isMessageRead** | **Boolean** | Optional param, will be set to true if the eMail has landed to the user inbox and has not been read. Helps distinguish mails that are read from ones that are not read. |  [optional]



