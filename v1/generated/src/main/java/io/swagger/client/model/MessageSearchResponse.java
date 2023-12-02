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
import io.swagger.client.model.MessageResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * eMail message payload
 */
@ApiModel(description = "eMail message payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-02T16:32:58.090+13:00")
public class MessageSearchResponse {
  @SerializedName("messages")
  private List<MessageResponse> messages = null;

  public MessageSearchResponse messages(List<MessageResponse> messages) {
    this.messages = messages;
    return this;
  }

  public MessageSearchResponse addMessagesItem(MessageResponse messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<MessageResponse>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * The list of emails that is returned.
   * @return messages
  **/
  @ApiModelProperty(value = "The list of emails that is returned.")
  public List<MessageResponse> getMessages() {
    return messages;
  }

  public void setMessages(List<MessageResponse> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageSearchResponse messageSearchResponse = (MessageSearchResponse) o;
    return Objects.equals(this.messages, messageSearchResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSearchResponse {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

