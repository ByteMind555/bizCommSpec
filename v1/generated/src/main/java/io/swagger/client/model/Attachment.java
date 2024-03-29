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
import java.io.IOException;

/**
 * eMail message payload
 */
@ApiModel(description = "eMail message payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-02T16:32:58.090+13:00")
public class Attachment {
  @SerializedName("attachment_type")
  private String attachmentType = null;

  @SerializedName("attachment_content")
  private Object attachmentContent = null;

  public Attachment attachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * Mime type of the content that is sent.
   * @return attachmentType
  **/
  @ApiModelProperty(required = true, value = "Mime type of the content that is sent.")
  public String getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  public Attachment attachmentContent(Object attachmentContent) {
    this.attachmentContent = attachmentContent;
    return this;
  }

   /**
   * Binary of the actual attachment.
   * @return attachmentContent
  **/
  @ApiModelProperty(required = true, value = "Binary of the actual attachment.")
  public Object getAttachmentContent() {
    return attachmentContent;
  }

  public void setAttachmentContent(Object attachmentContent) {
    this.attachmentContent = attachmentContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.attachmentType, attachment.attachmentType) &&
        Objects.equals(this.attachmentContent, attachment.attachmentContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentType, attachmentContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    attachmentContent: ").append(toIndentedString(attachmentContent)).append("\n");
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

