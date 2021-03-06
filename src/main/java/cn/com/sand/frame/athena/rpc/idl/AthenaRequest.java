/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.com.sand.frame.athena.rpc.idl;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-30")
public class AthenaRequest implements org.apache.thrift.TBase<AthenaRequest, AthenaRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AthenaRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AthenaRequest");

  private static final org.apache.thrift.protocol.TField REMOTE_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("remoteAddress", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INTERFACE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("interfaceName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField METHOD_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("methodName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PARAM_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("paramTypes", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField PARAM_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("paramValues", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField RESULT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("resultType", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField TRACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("traceId", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AthenaRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AthenaRequestTupleSchemeFactory());
  }

  public String remoteAddress; // required
  public String interfaceName; // required
  public String methodName; // required
  public List<String> paramTypes; // required
  public List<String> paramValues; // required
  public String resultType; // required
  public String traceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REMOTE_ADDRESS((short)1, "remoteAddress"),
    INTERFACE_NAME((short)2, "interfaceName"),
    METHOD_NAME((short)3, "methodName"),
    PARAM_TYPES((short)4, "paramTypes"),
    PARAM_VALUES((short)5, "paramValues"),
    RESULT_TYPE((short)6, "resultType"),
    TRACE_ID((short)7, "traceId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REMOTE_ADDRESS
          return REMOTE_ADDRESS;
        case 2: // INTERFACE_NAME
          return INTERFACE_NAME;
        case 3: // METHOD_NAME
          return METHOD_NAME;
        case 4: // PARAM_TYPES
          return PARAM_TYPES;
        case 5: // PARAM_VALUES
          return PARAM_VALUES;
        case 6: // RESULT_TYPE
          return RESULT_TYPE;
        case 7: // TRACE_ID
          return TRACE_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REMOTE_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("remoteAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INTERFACE_NAME, new org.apache.thrift.meta_data.FieldMetaData("interfaceName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.METHOD_NAME, new org.apache.thrift.meta_data.FieldMetaData("methodName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAM_TYPES, new org.apache.thrift.meta_data.FieldMetaData("paramTypes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PARAM_VALUES, new org.apache.thrift.meta_data.FieldMetaData("paramValues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RESULT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("resultType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRACE_ID, new org.apache.thrift.meta_data.FieldMetaData("traceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AthenaRequest.class, metaDataMap);
  }

  public AthenaRequest() {
  }

  public AthenaRequest(
    String remoteAddress,
    String interfaceName,
    String methodName,
    List<String> paramTypes,
    List<String> paramValues,
    String resultType,
    String traceId)
  {
    this();
    this.remoteAddress = remoteAddress;
    this.interfaceName = interfaceName;
    this.methodName = methodName;
    this.paramTypes = paramTypes;
    this.paramValues = paramValues;
    this.resultType = resultType;
    this.traceId = traceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AthenaRequest(AthenaRequest other) {
    if (other.isSetRemoteAddress()) {
      this.remoteAddress = other.remoteAddress;
    }
    if (other.isSetInterfaceName()) {
      this.interfaceName = other.interfaceName;
    }
    if (other.isSetMethodName()) {
      this.methodName = other.methodName;
    }
    if (other.isSetParamTypes()) {
      List<String> __this__paramTypes = new ArrayList<String>(other.paramTypes);
      this.paramTypes = __this__paramTypes;
    }
    if (other.isSetParamValues()) {
      List<String> __this__paramValues = new ArrayList<String>(other.paramValues);
      this.paramValues = __this__paramValues;
    }
    if (other.isSetResultType()) {
      this.resultType = other.resultType;
    }
    if (other.isSetTraceId()) {
      this.traceId = other.traceId;
    }
  }

  public AthenaRequest deepCopy() {
    return new AthenaRequest(this);
  }

  @Override
  public void clear() {
    this.remoteAddress = null;
    this.interfaceName = null;
    this.methodName = null;
    this.paramTypes = null;
    this.paramValues = null;
    this.resultType = null;
    this.traceId = null;
  }

  public String getRemoteAddress() {
    return this.remoteAddress;
  }

  public AthenaRequest setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

  public void unsetRemoteAddress() {
    this.remoteAddress = null;
  }

  /** Returns true if field remoteAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetRemoteAddress() {
    return this.remoteAddress != null;
  }

  public void setRemoteAddressIsSet(boolean value) {
    if (!value) {
      this.remoteAddress = null;
    }
  }

  public String getInterfaceName() {
    return this.interfaceName;
  }

  public AthenaRequest setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }

  public void unsetInterfaceName() {
    this.interfaceName = null;
  }

  /** Returns true if field interfaceName is set (has been assigned a value) and false otherwise */
  public boolean isSetInterfaceName() {
    return this.interfaceName != null;
  }

  public void setInterfaceNameIsSet(boolean value) {
    if (!value) {
      this.interfaceName = null;
    }
  }

  public String getMethodName() {
    return this.methodName;
  }

  public AthenaRequest setMethodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

  public void unsetMethodName() {
    this.methodName = null;
  }

  /** Returns true if field methodName is set (has been assigned a value) and false otherwise */
  public boolean isSetMethodName() {
    return this.methodName != null;
  }

  public void setMethodNameIsSet(boolean value) {
    if (!value) {
      this.methodName = null;
    }
  }

  public int getParamTypesSize() {
    return (this.paramTypes == null) ? 0 : this.paramTypes.size();
  }

  public java.util.Iterator<String> getParamTypesIterator() {
    return (this.paramTypes == null) ? null : this.paramTypes.iterator();
  }

  public void addToParamTypes(String elem) {
    if (this.paramTypes == null) {
      this.paramTypes = new ArrayList<String>();
    }
    this.paramTypes.add(elem);
  }

  public List<String> getParamTypes() {
    return this.paramTypes;
  }

  public AthenaRequest setParamTypes(List<String> paramTypes) {
    this.paramTypes = paramTypes;
    return this;
  }

  public void unsetParamTypes() {
    this.paramTypes = null;
  }

  /** Returns true if field paramTypes is set (has been assigned a value) and false otherwise */
  public boolean isSetParamTypes() {
    return this.paramTypes != null;
  }

  public void setParamTypesIsSet(boolean value) {
    if (!value) {
      this.paramTypes = null;
    }
  }

  public int getParamValuesSize() {
    return (this.paramValues == null) ? 0 : this.paramValues.size();
  }

  public java.util.Iterator<String> getParamValuesIterator() {
    return (this.paramValues == null) ? null : this.paramValues.iterator();
  }

  public void addToParamValues(String elem) {
    if (this.paramValues == null) {
      this.paramValues = new ArrayList<String>();
    }
    this.paramValues.add(elem);
  }

  public List<String> getParamValues() {
    return this.paramValues;
  }

  public AthenaRequest setParamValues(List<String> paramValues) {
    this.paramValues = paramValues;
    return this;
  }

  public void unsetParamValues() {
    this.paramValues = null;
  }

  /** Returns true if field paramValues is set (has been assigned a value) and false otherwise */
  public boolean isSetParamValues() {
    return this.paramValues != null;
  }

  public void setParamValuesIsSet(boolean value) {
    if (!value) {
      this.paramValues = null;
    }
  }

  public String getResultType() {
    return this.resultType;
  }

  public AthenaRequest setResultType(String resultType) {
    this.resultType = resultType;
    return this;
  }

  public void unsetResultType() {
    this.resultType = null;
  }

  /** Returns true if field resultType is set (has been assigned a value) and false otherwise */
  public boolean isSetResultType() {
    return this.resultType != null;
  }

  public void setResultTypeIsSet(boolean value) {
    if (!value) {
      this.resultType = null;
    }
  }

  public String getTraceId() {
    return this.traceId;
  }

  public AthenaRequest setTraceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  public void unsetTraceId() {
    this.traceId = null;
  }

  /** Returns true if field traceId is set (has been assigned a value) and false otherwise */
  public boolean isSetTraceId() {
    return this.traceId != null;
  }

  public void setTraceIdIsSet(boolean value) {
    if (!value) {
      this.traceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REMOTE_ADDRESS:
      if (value == null) {
        unsetRemoteAddress();
      } else {
        setRemoteAddress((String)value);
      }
      break;

    case INTERFACE_NAME:
      if (value == null) {
        unsetInterfaceName();
      } else {
        setInterfaceName((String)value);
      }
      break;

    case METHOD_NAME:
      if (value == null) {
        unsetMethodName();
      } else {
        setMethodName((String)value);
      }
      break;

    case PARAM_TYPES:
      if (value == null) {
        unsetParamTypes();
      } else {
        setParamTypes((List<String>)value);
      }
      break;

    case PARAM_VALUES:
      if (value == null) {
        unsetParamValues();
      } else {
        setParamValues((List<String>)value);
      }
      break;

    case RESULT_TYPE:
      if (value == null) {
        unsetResultType();
      } else {
        setResultType((String)value);
      }
      break;

    case TRACE_ID:
      if (value == null) {
        unsetTraceId();
      } else {
        setTraceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REMOTE_ADDRESS:
      return getRemoteAddress();

    case INTERFACE_NAME:
      return getInterfaceName();

    case METHOD_NAME:
      return getMethodName();

    case PARAM_TYPES:
      return getParamTypes();

    case PARAM_VALUES:
      return getParamValues();

    case RESULT_TYPE:
      return getResultType();

    case TRACE_ID:
      return getTraceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REMOTE_ADDRESS:
      return isSetRemoteAddress();
    case INTERFACE_NAME:
      return isSetInterfaceName();
    case METHOD_NAME:
      return isSetMethodName();
    case PARAM_TYPES:
      return isSetParamTypes();
    case PARAM_VALUES:
      return isSetParamValues();
    case RESULT_TYPE:
      return isSetResultType();
    case TRACE_ID:
      return isSetTraceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AthenaRequest)
      return this.equals((AthenaRequest)that);
    return false;
  }

  public boolean equals(AthenaRequest that) {
    if (that == null)
      return false;

    boolean this_present_remoteAddress = true && this.isSetRemoteAddress();
    boolean that_present_remoteAddress = true && that.isSetRemoteAddress();
    if (this_present_remoteAddress || that_present_remoteAddress) {
      if (!(this_present_remoteAddress && that_present_remoteAddress))
        return false;
      if (!this.remoteAddress.equals(that.remoteAddress))
        return false;
    }

    boolean this_present_interfaceName = true && this.isSetInterfaceName();
    boolean that_present_interfaceName = true && that.isSetInterfaceName();
    if (this_present_interfaceName || that_present_interfaceName) {
      if (!(this_present_interfaceName && that_present_interfaceName))
        return false;
      if (!this.interfaceName.equals(that.interfaceName))
        return false;
    }

    boolean this_present_methodName = true && this.isSetMethodName();
    boolean that_present_methodName = true && that.isSetMethodName();
    if (this_present_methodName || that_present_methodName) {
      if (!(this_present_methodName && that_present_methodName))
        return false;
      if (!this.methodName.equals(that.methodName))
        return false;
    }

    boolean this_present_paramTypes = true && this.isSetParamTypes();
    boolean that_present_paramTypes = true && that.isSetParamTypes();
    if (this_present_paramTypes || that_present_paramTypes) {
      if (!(this_present_paramTypes && that_present_paramTypes))
        return false;
      if (!this.paramTypes.equals(that.paramTypes))
        return false;
    }

    boolean this_present_paramValues = true && this.isSetParamValues();
    boolean that_present_paramValues = true && that.isSetParamValues();
    if (this_present_paramValues || that_present_paramValues) {
      if (!(this_present_paramValues && that_present_paramValues))
        return false;
      if (!this.paramValues.equals(that.paramValues))
        return false;
    }

    boolean this_present_resultType = true && this.isSetResultType();
    boolean that_present_resultType = true && that.isSetResultType();
    if (this_present_resultType || that_present_resultType) {
      if (!(this_present_resultType && that_present_resultType))
        return false;
      if (!this.resultType.equals(that.resultType))
        return false;
    }

    boolean this_present_traceId = true && this.isSetTraceId();
    boolean that_present_traceId = true && that.isSetTraceId();
    if (this_present_traceId || that_present_traceId) {
      if (!(this_present_traceId && that_present_traceId))
        return false;
      if (!this.traceId.equals(that.traceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_remoteAddress = true && (isSetRemoteAddress());
    list.add(present_remoteAddress);
    if (present_remoteAddress)
      list.add(remoteAddress);

    boolean present_interfaceName = true && (isSetInterfaceName());
    list.add(present_interfaceName);
    if (present_interfaceName)
      list.add(interfaceName);

    boolean present_methodName = true && (isSetMethodName());
    list.add(present_methodName);
    if (present_methodName)
      list.add(methodName);

    boolean present_paramTypes = true && (isSetParamTypes());
    list.add(present_paramTypes);
    if (present_paramTypes)
      list.add(paramTypes);

    boolean present_paramValues = true && (isSetParamValues());
    list.add(present_paramValues);
    if (present_paramValues)
      list.add(paramValues);

    boolean present_resultType = true && (isSetResultType());
    list.add(present_resultType);
    if (present_resultType)
      list.add(resultType);

    boolean present_traceId = true && (isSetTraceId());
    list.add(present_traceId);
    if (present_traceId)
      list.add(traceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(AthenaRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRemoteAddress()).compareTo(other.isSetRemoteAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemoteAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remoteAddress, other.remoteAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInterfaceName()).compareTo(other.isSetInterfaceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterfaceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interfaceName, other.interfaceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMethodName()).compareTo(other.isSetMethodName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMethodName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.methodName, other.methodName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParamTypes()).compareTo(other.isSetParamTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParamTypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paramTypes, other.paramTypes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParamValues()).compareTo(other.isSetParamValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParamValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paramValues, other.paramValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResultType()).compareTo(other.isSetResultType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultType, other.resultType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTraceId()).compareTo(other.isSetTraceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traceId, other.traceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AthenaRequest(");
    boolean first = true;

    sb.append("remoteAddress:");
    if (this.remoteAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.remoteAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("interfaceName:");
    if (this.interfaceName == null) {
      sb.append("null");
    } else {
      sb.append(this.interfaceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("methodName:");
    if (this.methodName == null) {
      sb.append("null");
    } else {
      sb.append(this.methodName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paramTypes:");
    if (this.paramTypes == null) {
      sb.append("null");
    } else {
      sb.append(this.paramTypes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paramValues:");
    if (this.paramValues == null) {
      sb.append("null");
    } else {
      sb.append(this.paramValues);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resultType:");
    if (this.resultType == null) {
      sb.append("null");
    } else {
      sb.append(this.resultType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("traceId:");
    if (this.traceId == null) {
      sb.append("null");
    } else {
      sb.append(this.traceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AthenaRequestStandardSchemeFactory implements SchemeFactory {
    public AthenaRequestStandardScheme getScheme() {
      return new AthenaRequestStandardScheme();
    }
  }

  private static class AthenaRequestStandardScheme extends StandardScheme<AthenaRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AthenaRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REMOTE_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.remoteAddress = iprot.readString();
              struct.setRemoteAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INTERFACE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.interfaceName = iprot.readString();
              struct.setInterfaceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // METHOD_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.methodName = iprot.readString();
              struct.setMethodNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARAM_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.paramTypes = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.paramTypes.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setParamTypesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARAM_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.paramValues = new ArrayList<String>(_list3.size);
                String _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readString();
                  struct.paramValues.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setParamValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RESULT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resultType = iprot.readString();
              struct.setResultTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TRACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.traceId = iprot.readString();
              struct.setTraceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AthenaRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.remoteAddress != null) {
        oprot.writeFieldBegin(REMOTE_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.remoteAddress);
        oprot.writeFieldEnd();
      }
      if (struct.interfaceName != null) {
        oprot.writeFieldBegin(INTERFACE_NAME_FIELD_DESC);
        oprot.writeString(struct.interfaceName);
        oprot.writeFieldEnd();
      }
      if (struct.methodName != null) {
        oprot.writeFieldBegin(METHOD_NAME_FIELD_DESC);
        oprot.writeString(struct.methodName);
        oprot.writeFieldEnd();
      }
      if (struct.paramTypes != null) {
        oprot.writeFieldBegin(PARAM_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.paramTypes.size()));
          for (String _iter6 : struct.paramTypes)
          {
            oprot.writeString(_iter6);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.paramValues != null) {
        oprot.writeFieldBegin(PARAM_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.paramValues.size()));
          for (String _iter7 : struct.paramValues)
          {
            oprot.writeString(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.resultType != null) {
        oprot.writeFieldBegin(RESULT_TYPE_FIELD_DESC);
        oprot.writeString(struct.resultType);
        oprot.writeFieldEnd();
      }
      if (struct.traceId != null) {
        oprot.writeFieldBegin(TRACE_ID_FIELD_DESC);
        oprot.writeString(struct.traceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AthenaRequestTupleSchemeFactory implements SchemeFactory {
    public AthenaRequestTupleScheme getScheme() {
      return new AthenaRequestTupleScheme();
    }
  }

  private static class AthenaRequestTupleScheme extends TupleScheme<AthenaRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AthenaRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRemoteAddress()) {
        optionals.set(0);
      }
      if (struct.isSetInterfaceName()) {
        optionals.set(1);
      }
      if (struct.isSetMethodName()) {
        optionals.set(2);
      }
      if (struct.isSetParamTypes()) {
        optionals.set(3);
      }
      if (struct.isSetParamValues()) {
        optionals.set(4);
      }
      if (struct.isSetResultType()) {
        optionals.set(5);
      }
      if (struct.isSetTraceId()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetRemoteAddress()) {
        oprot.writeString(struct.remoteAddress);
      }
      if (struct.isSetInterfaceName()) {
        oprot.writeString(struct.interfaceName);
      }
      if (struct.isSetMethodName()) {
        oprot.writeString(struct.methodName);
      }
      if (struct.isSetParamTypes()) {
        {
          oprot.writeI32(struct.paramTypes.size());
          for (String _iter8 : struct.paramTypes)
          {
            oprot.writeString(_iter8);
          }
        }
      }
      if (struct.isSetParamValues()) {
        {
          oprot.writeI32(struct.paramValues.size());
          for (String _iter9 : struct.paramValues)
          {
            oprot.writeString(_iter9);
          }
        }
      }
      if (struct.isSetResultType()) {
        oprot.writeString(struct.resultType);
      }
      if (struct.isSetTraceId()) {
        oprot.writeString(struct.traceId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AthenaRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.remoteAddress = iprot.readString();
        struct.setRemoteAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.interfaceName = iprot.readString();
        struct.setInterfaceNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.methodName = iprot.readString();
        struct.setMethodNameIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.paramTypes = new ArrayList<String>(_list10.size);
          String _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = iprot.readString();
            struct.paramTypes.add(_elem11);
          }
        }
        struct.setParamTypesIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.paramValues = new ArrayList<String>(_list13.size);
          String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.paramValues.add(_elem14);
          }
        }
        struct.setParamValuesIsSet(true);
      }
      if (incoming.get(5)) {
        struct.resultType = iprot.readString();
        struct.setResultTypeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.traceId = iprot.readString();
        struct.setTraceIdIsSet(true);
      }
    }
  }

}

