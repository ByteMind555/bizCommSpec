/*
 * bizcommserv
 * Business communication serv for Air New Zealand. This REST service supports services like eMail, SMS and chats(user to user & user to group) in the future.
 *
 * OpenAPI spec version: V1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Attachment;
import io.swagger.client.model.EmailAddress;
import io.swagger.client.model.MessagePayload;
import io.swagger.client.model.RecipientDetail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * eMail message payload
 */
@ApiModel(description = "eMail message payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-02T16:32:58.090+13:00")
public class MessageRequest {
  @SerializedName("sender_details")
  private EmailAddress senderDetails = null;

  @SerializedName("recipient_details")
  private RecipientDetail recipientDetails = null;

  @SerializedName("content_details")
  private MessagePayload contentDetails = null;

  @SerializedName("attachments")
  private List<Attachment> attachments = null;

  @SerializedName("is_message_read")
  private Boolean isMessageRead = null;

  public MessageRequest senderDetails(EmailAddress senderDetails) {
    this.senderDetails = senderDetails;
    return this;
  }

   /**
   * The list of email Ids to which the email need to be sent.
   * @return senderDetails
  **/
  @ApiModelProperty(value = "The list of email Ids to which the email need to be sent.")
  public EmailAddress getSenderDetails() {
    return senderDetails;
  }

  public void setSenderDetails(EmailAddress senderDetails) {
    this.senderDetails = senderDetails;
  }

  public MessageRequest recipientDetails(RecipientDetail recipientDetails) {
    this.recipientDetails = recipientDetails;
    return this;
  }

   /**
   * The list of recipient ids to which the eMail need to be sent.
   * @return recipientDetails
  **/
  @ApiModelProperty(required = true, value = "The list of recipient ids to which the eMail need to be sent.")
  public RecipientDetail getRecipientDetails() {
    return recipientDetails;
  }

  public void setRecipientDetails(RecipientDetail recipientDetails) {
    this.recipientDetails = recipientDetails;
  }

  public MessageRequest contentDetails(MessagePayload contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

   /**
   * The list of email Ids to which the email need to be sent.
   * @return contentDetails
  **/
  @ApiModelProperty(value = "The list of email Ids to which the email need to be sent.")
  public MessagePayload getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(MessagePayload contentDetails) {
    this.contentDetails = contentDetails;
  }

  public MessageRequest attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public MessageRequest addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * The list of attachments added to the email.
   * @return attachments
  **/
  @ApiModelProperty(value = "The list of attachments added to the email.")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public MessageRequest isMessageRead(Boolean isMessageRead) {
    this.isMessageRead = isMessageRead;
    return this;
  }

   /**
   * Optional param, will be set to true if the eMail has landed to the user inbox and has not been read. Helps distinguish mails that are read from ones that are not read.
   * @return isMessageRead
  **/
  @ApiModelProperty(value = "Optional param, will be set to true if the eMail has landed to the user inbox and has not been read. Helps distinguish mails that are read from ones that are not read.")
  public Boolean isIsMessageRead() {
    return isMessageRead;
  }

  public void setIsMessageRead(Boolean isMessageRead) {
    this.isMessageRead = isMessageRead;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRequest messageRequest = (MessageRequest) o;
    return Objects.equals(this.senderDetails, messageRequest.senderDetails) &&
        Objects.equals(this.recipientDetails, messageRequest.recipientDetails) &&
        Objects.equals(this.contentDetails, messageRequest.contentDetails) &&
        Objects.equals(this.attachments, messageRequest.attachments) &&
        Objects.equals(this.isMessageRead, messageRequest.isMessageRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderDetails, recipientDetails, contentDetails, attachments, isMessageRead);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRequest {\n");
    
    sb.append("    senderDetails: ").append(toIndentedString(senderDetails)).append("\n");
    sb.append("    recipientDetails: ").append(toIndentedString(recipientDetails)).append("\n");
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    isMessageRead: ").append(toIndentedString(isMessageRead)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

