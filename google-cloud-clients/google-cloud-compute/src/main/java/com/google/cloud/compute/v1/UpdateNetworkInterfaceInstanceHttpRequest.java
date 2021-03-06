/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class UpdateNetworkInterfaceInstanceHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final List<String> fieldMask;
  private final String fields;
  private final String instance;
  private final String key;
  private final String networkInterface;
  private final NetworkInterface networkInterfaceResource;
  private final String prettyPrint;
  private final String quotaUser;
  private final String requestId;
  private final String userIp;

  private UpdateNetworkInterfaceInstanceHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fieldMask = null;
    this.fields = null;
    this.instance = null;
    this.key = null;
    this.networkInterface = null;
    this.networkInterfaceResource = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.requestId = null;
    this.userIp = null;
  }

  private UpdateNetworkInterfaceInstanceHttpRequest(
      String access_token,
      String callback,
      List<String> fieldMask,
      String fields,
      String instance,
      String key,
      String networkInterface,
      NetworkInterface networkInterfaceResource,
      String prettyPrint,
      String quotaUser,
      String requestId,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.fieldMask = fieldMask;
    this.fields = fields;
    this.instance = instance;
    this.key = key;
    this.networkInterface = networkInterface;
    this.networkInterfaceResource = networkInterfaceResource;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.requestId = requestId;
    this.userIp = userIp;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if (fieldName.equals("access_token")) {
      return access_token;
    }
    if (fieldName.equals("callback")) {
      return callback;
    }
    if (fieldName.equals("fieldMask")) {
      return fieldMask;
    }
    if (fieldName.equals("fields")) {
      return fields;
    }
    if (fieldName.equals("instance")) {
      return instance;
    }
    if (fieldName.equals("key")) {
      return key;
    }
    if (fieldName.equals("networkInterface")) {
      return networkInterface;
    }
    if (fieldName.equals("networkInterfaceResource")) {
      return networkInterfaceResource;
    }
    if (fieldName.equals("prettyPrint")) {
      return prettyPrint;
    }
    if (fieldName.equals("quotaUser")) {
      return quotaUser;
    }
    if (fieldName.equals("requestId")) {
      return requestId;
    }
    if (fieldName.equals("userIp")) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public NetworkInterface getApiMessageRequestBody() {
    return networkInterfaceResource;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return fieldMask;
  }

  public String getAccessToken() {
    return access_token;
  }

  public String getCallback() {
    return callback;
  }

  public String getFields() {
    return fields;
  }

  public String getInstance() {
    return instance;
  }

  public String getKey() {
    return key;
  }

  public String getNetworkInterface() {
    return networkInterface;
  }

  public NetworkInterface getNetworkInterfaceResource() {
    return networkInterfaceResource;
  }

  public String getPrettyPrint() {
    return prettyPrint;
  }

  public String getQuotaUser() {
    return quotaUser;
  }

  public String getRequestId() {
    return requestId;
  }

  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(UpdateNetworkInterfaceInstanceHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static UpdateNetworkInterfaceInstanceHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final UpdateNetworkInterfaceInstanceHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new UpdateNetworkInterfaceInstanceHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private List<String> fieldMask;
    private String fields;
    private String instance;
    private String key;
    private String networkInterface;
    private NetworkInterface networkInterfaceResource;
    private String prettyPrint;
    private String quotaUser;
    private String requestId;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(UpdateNetworkInterfaceInstanceHttpRequest other) {
      if (other == UpdateNetworkInterfaceInstanceHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFieldMask() != null) {
        this.fieldMask = other.fieldMask;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getInstance() != null) {
        this.instance = other.instance;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getNetworkInterface() != null) {
        this.networkInterface = other.networkInterface;
      }
      if (other.getNetworkInterfaceResource() != null) {
        this.networkInterfaceResource = other.networkInterfaceResource;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getRequestId() != null) {
        this.requestId = other.requestId;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(UpdateNetworkInterfaceInstanceHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fieldMask = source.fieldMask;
      this.fields = source.fields;
      this.instance = source.instance;
      this.key = source.key;
      this.networkInterface = source.networkInterface;
      this.networkInterfaceResource = source.networkInterfaceResource;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.requestId = source.requestId;
      this.userIp = source.userIp;
    }

    public String getAccessToken() {
      return access_token;
    }

    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public String getCallback() {
      return callback;
    }

    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    public List<String> getFieldMask() {
      return fieldMask;
    }

    public Builder setFieldMask(List<String> fieldMask) {
      this.fieldMask = fieldMask;
      return this;
    }

    public String getFields() {
      return fields;
    }

    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    public String getInstance() {
      return instance;
    }

    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    public String getKey() {
      return key;
    }

    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    public String getNetworkInterface() {
      return networkInterface;
    }

    public Builder setNetworkInterface(String networkInterface) {
      this.networkInterface = networkInterface;
      return this;
    }

    public NetworkInterface getNetworkInterfaceResource() {
      return networkInterfaceResource;
    }

    public Builder setNetworkInterfaceResource(NetworkInterface networkInterfaceResource) {
      this.networkInterfaceResource = networkInterfaceResource;
      return this;
    }

    public String getPrettyPrint() {
      return prettyPrint;
    }

    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    public String getQuotaUser() {
      return quotaUser;
    }

    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    public String getRequestId() {
      return requestId;
    }

    public Builder setRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public UpdateNetworkInterfaceInstanceHttpRequest build() {
      String missing = "";

      if (instance == null) {
        missing += " instance";
      }

      if (networkInterface == null) {
        missing += " networkInterface";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new UpdateNetworkInterfaceInstanceHttpRequest(
          access_token,
          callback,
          fieldMask,
          fields,
          instance,
          key,
          networkInterface,
          networkInterfaceResource,
          prettyPrint,
          quotaUser,
          requestId,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFieldMask(this.fieldMask);
      newBuilder.setFields(this.fields);
      newBuilder.setInstance(this.instance);
      newBuilder.setKey(this.key);
      newBuilder.setNetworkInterface(this.networkInterface);
      newBuilder.setNetworkInterfaceResource(this.networkInterfaceResource);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRequestId(this.requestId);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "UpdateNetworkInterfaceInstanceHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "fieldMask="
        + fieldMask
        + ", "
        + "fields="
        + fields
        + ", "
        + "instance="
        + instance
        + ", "
        + "key="
        + key
        + ", "
        + "networkInterface="
        + networkInterface
        + ", "
        + "networkInterfaceResource="
        + networkInterfaceResource
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "requestId="
        + requestId
        + ", "
        + "userIp="
        + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateNetworkInterfaceInstanceHttpRequest) {
      UpdateNetworkInterfaceInstanceHttpRequest that =
          (UpdateNetworkInterfaceInstanceHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fieldMask, that.getFieldMask())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.instance, that.getInstance())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.networkInterface, that.getNetworkInterface())
          && Objects.equals(this.networkInterfaceResource, that.getNetworkInterfaceResource())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.requestId, that.getRequestId())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        callback,
        fieldMask,
        fields,
        instance,
        key,
        networkInterface,
        networkInterfaceResource,
        prettyPrint,
        quotaUser,
        requestId,
        userIp);
  }
}
