/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package no.mechatronics.sfi.fmu_proxy.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class AnyPrimitive extends org.apache.thrift.TUnion<AnyPrimitive, AnyPrimitive._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnyPrimitive");
  private static final org.apache.thrift.protocol.TField INT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("int_value", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REAL_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("real_value", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField STR_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("str_value", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField BOOL_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("bool_value", org.apache.thrift.protocol.TType.BOOL, (short)4);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INT_VALUE((short)1, "int_value"),
    REAL_VALUE((short)2, "real_value"),
    STR_VALUE((short)3, "str_value"),
    BOOL_VALUE((short)4, "bool_value");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INT_VALUE
          return INT_VALUE;
        case 2: // REAL_VALUE
          return REAL_VALUE;
        case 3: // STR_VALUE
          return STR_VALUE;
        case 4: // BOOL_VALUE
          return BOOL_VALUE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("int_value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REAL_VALUE, new org.apache.thrift.meta_data.FieldMetaData("real_value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.STR_VALUE, new org.apache.thrift.meta_data.FieldMetaData("str_value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BOOL_VALUE, new org.apache.thrift.meta_data.FieldMetaData("bool_value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnyPrimitive.class, metaDataMap);
  }

  public AnyPrimitive() {
    super();
  }

  public AnyPrimitive(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public AnyPrimitive(AnyPrimitive other) {
    super(other);
  }
  public AnyPrimitive deepCopy() {
    return new AnyPrimitive(this);
  }

  public static AnyPrimitive int_value(int value) {
    AnyPrimitive x = new AnyPrimitive();
    x.setInt_value(value);
    return x;
  }

  public static AnyPrimitive real_value(double value) {
    AnyPrimitive x = new AnyPrimitive();
    x.setReal_value(value);
    return x;
  }

  public static AnyPrimitive str_value(java.lang.String value) {
    AnyPrimitive x = new AnyPrimitive();
    x.setStr_value(value);
    return x;
  }

  public static AnyPrimitive bool_value(boolean value) {
    AnyPrimitive x = new AnyPrimitive();
    x.setBool_value(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case INT_VALUE:
        if (value instanceof java.lang.Integer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Integer for field 'int_value', but got " + value.getClass().getSimpleName());
      case REAL_VALUE:
        if (value instanceof java.lang.Double) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Double for field 'real_value', but got " + value.getClass().getSimpleName());
      case STR_VALUE:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'str_value', but got " + value.getClass().getSimpleName());
      case BOOL_VALUE:
        if (value instanceof java.lang.Boolean) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Boolean for field 'bool_value', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case INT_VALUE:
          if (field.type == INT_VALUE_FIELD_DESC.type) {
            java.lang.Integer int_value;
            int_value = iprot.readI32();
            return int_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case REAL_VALUE:
          if (field.type == REAL_VALUE_FIELD_DESC.type) {
            java.lang.Double real_value;
            real_value = iprot.readDouble();
            return real_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STR_VALUE:
          if (field.type == STR_VALUE_FIELD_DESC.type) {
            java.lang.String str_value;
            str_value = iprot.readString();
            return str_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BOOL_VALUE:
          if (field.type == BOOL_VALUE_FIELD_DESC.type) {
            java.lang.Boolean bool_value;
            bool_value = iprot.readBool();
            return bool_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case INT_VALUE:
        java.lang.Integer int_value = (java.lang.Integer)value_;
        oprot.writeI32(int_value);
        return;
      case REAL_VALUE:
        java.lang.Double real_value = (java.lang.Double)value_;
        oprot.writeDouble(real_value);
        return;
      case STR_VALUE:
        java.lang.String str_value = (java.lang.String)value_;
        oprot.writeString(str_value);
        return;
      case BOOL_VALUE:
        java.lang.Boolean bool_value = (java.lang.Boolean)value_;
        oprot.writeBool(bool_value);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case INT_VALUE:
          java.lang.Integer int_value;
          int_value = iprot.readI32();
          return int_value;
        case REAL_VALUE:
          java.lang.Double real_value;
          real_value = iprot.readDouble();
          return real_value;
        case STR_VALUE:
          java.lang.String str_value;
          str_value = iprot.readString();
          return str_value;
        case BOOL_VALUE:
          java.lang.Boolean bool_value;
          bool_value = iprot.readBool();
          return bool_value;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case INT_VALUE:
        java.lang.Integer int_value = (java.lang.Integer)value_;
        oprot.writeI32(int_value);
        return;
      case REAL_VALUE:
        java.lang.Double real_value = (java.lang.Double)value_;
        oprot.writeDouble(real_value);
        return;
      case STR_VALUE:
        java.lang.String str_value = (java.lang.String)value_;
        oprot.writeString(str_value);
        return;
      case BOOL_VALUE:
        java.lang.Boolean bool_value = (java.lang.Boolean)value_;
        oprot.writeBool(bool_value);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case INT_VALUE:
        return INT_VALUE_FIELD_DESC;
      case REAL_VALUE:
        return REAL_VALUE_FIELD_DESC;
      case STR_VALUE:
        return STR_VALUE_FIELD_DESC;
      case BOOL_VALUE:
        return BOOL_VALUE_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public int getInt_value() {
    if (getSetField() == _Fields.INT_VALUE) {
      return (java.lang.Integer)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'int_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setInt_value(int value) {
    setField_ = _Fields.INT_VALUE;
    value_ = value;
  }

  public double getReal_value() {
    if (getSetField() == _Fields.REAL_VALUE) {
      return (java.lang.Double)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'real_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setReal_value(double value) {
    setField_ = _Fields.REAL_VALUE;
    value_ = value;
  }

  public java.lang.String getStr_value() {
    if (getSetField() == _Fields.STR_VALUE) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'str_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStr_value(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.STR_VALUE;
    value_ = value;
  }

  public boolean getBool_value() {
    if (getSetField() == _Fields.BOOL_VALUE) {
      return (java.lang.Boolean)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'bool_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBool_value(boolean value) {
    setField_ = _Fields.BOOL_VALUE;
    value_ = value;
  }

  public boolean isSetInt_value() {
    return setField_ == _Fields.INT_VALUE;
  }


  public boolean isSetReal_value() {
    return setField_ == _Fields.REAL_VALUE;
  }


  public boolean isSetStr_value() {
    return setField_ == _Fields.STR_VALUE;
  }


  public boolean isSetBool_value() {
    return setField_ == _Fields.BOOL_VALUE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof AnyPrimitive) {
      return equals((AnyPrimitive)other);
    } else {
      return false;
    }
  }

  public boolean equals(AnyPrimitive other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(AnyPrimitive other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}