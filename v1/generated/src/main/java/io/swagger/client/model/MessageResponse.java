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
import io.swagger.client.model.MessageRequest;
import java.io.IOException;

/**
 * eMail message payload
 */
@ApiModel(description = "eMail message payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-02T16:32:58.090+13:00")
public class MessageResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("content")
  private MessageRequest content = null;

  public MessageResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The GUUID generated for the message.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The GUUID generated for the message.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * If the eMail is in one of the following states. Ex: DRAFT, SENT, OUTBOX
   * @return status
  **/
  @ApiModelProperty(value = "If the eMail is in one of the following states. Ex: DRAFT, SENT, OUTBOX")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MessageResponse content(MessageRequest content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public MessageRequest getContent() {
    return content;
  }

  public void setContent(MessageRequest content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.id, messageResponse.id) &&
        Objects.equals(this.status, messageResponse.status) &&
        Objects.equals(this.content, messageResponse.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
