/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package no.ntnu.ihb.fmuproxy.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-12-03")
public class Unknown implements org.apache.thrift.TBase<Unknown, Unknown._Fields>, java.io.Serializable, Cloneable, Comparable<Unknown> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Unknown");

  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DEPENDENCIES_FIELD_DESC = new org.apache.thrift.protocol.TField("dependencies", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField DEPENDENCIES_KIND_FIELD_DESC = new org.apache.thrift.protocol.TField("dependencies_kind", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UnknownStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UnknownTupleSchemeFactory();

  private int index; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> dependencies; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> dependencies_kind; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INDEX((short)1, "index"),
    DEPENDENCIES((short)2, "dependencies"),
    DEPENDENCIES_KIND((short)3, "dependencies_kind");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INDEX
          return INDEX;
        case 2: // DEPENDENCIES
          return DEPENDENCIES;
        case 3: // DEPENDENCIES_KIND
          return DEPENDENCIES_KIND;
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
    @org.apache.thrift.annotation.Nullable
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

  // isset id assignments
  private static final int __INDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DEPENDENCIES, new org.apache.thrift.meta_data.FieldMetaData("dependencies", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.DEPENDENCIES_KIND, new org.apache.thrift.meta_data.FieldMetaData("dependencies_kind", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Unknown.class, metaDataMap);
  }

  public Unknown() {
  }

  public Unknown(
    int index,
    java.util.List<java.lang.Integer> dependencies,
    java.util.List<java.lang.String> dependencies_kind)
  {
    this();
    this.index = index;
    setIndexIsSet(true);
    this.dependencies = dependencies;
    this.dependencies_kind = dependencies_kind;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Unknown(Unknown other) {
    __isset_bitfield = other.__isset_bitfield;
    this.index = other.index;
    if (other.isSetDependencies()) {
      java.util.List<java.lang.Integer> __this__dependencies = new java.util.ArrayList<java.lang.Integer>(other.dependencies);
      this.dependencies = __this__dependencies;
    }
    if (other.isSetDependenciesKind()) {
      java.util.List<java.lang.String> __this__dependencies_kind = new java.util.ArrayList<java.lang.String>(other.dependencies_kind);
      this.dependencies_kind = __this__dependencies_kind;
    }
  }

  public Unknown deepCopy() {
    return new Unknown(this);
  }

  @Override
  public void clear() {
    setIndexIsSet(false);
    this.index = 0;
    this.dependencies = null;
    this.dependencies_kind = null;
  }

  public int getIndex() {
    return this.index;
  }

  public Unknown setIndex(int index) {
    this.index = index;
    setIndexIsSet(true);
    return this;
  }

  public void unsetIndex() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  public void setIndexIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INDEX_ISSET_ID, value);
  }

  public int getDependenciesSize() {
    return (this.dependencies == null) ? 0 : this.dependencies.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getDependenciesIterator() {
    return (this.dependencies == null) ? null : this.dependencies.iterator();
  }

  public void addToDependencies(int elem) {
    if (this.dependencies == null) {
      this.dependencies = new java.util.ArrayList<java.lang.Integer>();
    }
    this.dependencies.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getDependencies() {
    return this.dependencies;
  }

  public Unknown setDependencies(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public void unsetDependencies() {
    this.dependencies = null;
  }

  /** Returns true if field dependencies is set (has been assigned a value) and false otherwise */
  public boolean isSetDependencies() {
    return this.dependencies != null;
  }

  public void setDependenciesIsSet(boolean value) {
    if (!value) {
      this.dependencies = null;
    }
  }

  public int getDependenciesKindSize() {
    return (this.dependencies_kind == null) ? 0 : this.dependencies_kind.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getDependenciesKindIterator() {
    return (this.dependencies_kind == null) ? null : this.dependencies_kind.iterator();
  }

  public void addToDependenciesKind(java.lang.String elem) {
    if (this.dependencies_kind == null) {
      this.dependencies_kind = new java.util.ArrayList<java.lang.String>();
    }
    this.dependencies_kind.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getDependenciesKind() {
    return this.dependencies_kind;
  }

  public Unknown setDependenciesKind(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> dependencies_kind) {
    this.dependencies_kind = dependencies_kind;
    return this;
  }

  public void unsetDependenciesKind() {
    this.dependencies_kind = null;
  }

  /** Returns true if field dependencies_kind is set (has been assigned a value) and false otherwise */
  public boolean isSetDependenciesKind() {
    return this.dependencies_kind != null;
  }

  public void setDependenciesKindIsSet(boolean value) {
    if (!value) {
      this.dependencies_kind = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((java.lang.Integer)value);
      }
      break;

    case DEPENDENCIES:
      if (value == null) {
        unsetDependencies();
      } else {
        setDependencies((java.util.List<java.lang.Integer>)value);
      }
      break;

    case DEPENDENCIES_KIND:
      if (value == null) {
        unsetDependenciesKind();
      } else {
        setDependenciesKind((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INDEX:
      return getIndex();

    case DEPENDENCIES:
      return getDependencies();

    case DEPENDENCIES_KIND:
      return getDependenciesKind();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INDEX:
      return isSetIndex();
    case DEPENDENCIES:
      return isSetDependencies();
    case DEPENDENCIES_KIND:
      return isSetDependenciesKind();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Unknown)
      return this.equals((Unknown)that);
    return false;
  }

  public boolean equals(Unknown that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_index = true;
    boolean that_present_index = true;
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (this.index != that.index)
        return false;
    }

    boolean this_present_dependencies = true && this.isSetDependencies();
    boolean that_present_dependencies = true && that.isSetDependencies();
    if (this_present_dependencies || that_present_dependencies) {
      if (!(this_present_dependencies && that_present_dependencies))
        return false;
      if (!this.dependencies.equals(that.dependencies))
        return false;
    }

    boolean this_present_dependencies_kind = true && this.isSetDependenciesKind();
    boolean that_present_dependencies_kind = true && that.isSetDependenciesKind();
    if (this_present_dependencies_kind || that_present_dependencies_kind) {
      if (!(this_present_dependencies_kind && that_present_dependencies_kind))
        return false;
      if (!this.dependencies_kind.equals(that.dependencies_kind))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + index;

    hashCode = hashCode * 8191 + ((isSetDependencies()) ? 131071 : 524287);
    if (isSetDependencies())
      hashCode = hashCode * 8191 + dependencies.hashCode();

    hashCode = hashCode * 8191 + ((isSetDependenciesKind()) ? 131071 : 524287);
    if (isSetDependenciesKind())
      hashCode = hashCode * 8191 + dependencies_kind.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Unknown other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetIndex()).compareTo(other.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index, other.index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDependencies()).compareTo(other.isSetDependencies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDependencies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dependencies, other.dependencies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDependenciesKind()).compareTo(other.isSetDependenciesKind());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDependenciesKind()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dependencies_kind, other.dependencies_kind);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(");
    boolean first = true;

    sb.append("index:");
    sb.append(this.index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dependencies:");
    if (this.dependencies == null) {
      sb.append("null");
    } else {
      sb.append(this.dependencies);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dependencies_kind:");
    if (this.dependencies_kind == null) {
      sb.append("null");
    } else {
      sb.append(this.dependencies_kind);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UnknownStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UnknownStandardScheme getScheme() {
      return new UnknownStandardScheme();
    }
  }

  private static class UnknownStandardScheme extends org.apache.thrift.scheme.StandardScheme<Unknown> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Unknown struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.index = iprot.readI32();
              struct.setIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEPENDENCIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.dependencies = new java.util.ArrayList<java.lang.Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.dependencies.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setDependenciesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEPENDENCIES_KIND
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.dependencies_kind = new java.util.ArrayList<java.lang.String>(_list3.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readString();
                  struct.dependencies_kind.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setDependenciesKindIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Unknown struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeI32(struct.index);
      oprot.writeFieldEnd();
      if (struct.dependencies != null) {
        oprot.writeFieldBegin(DEPENDENCIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.dependencies.size()));
          for (int _iter6 : struct.dependencies)
          {
            oprot.writeI32(_iter6);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.dependencies_kind != null) {
        oprot.writeFieldBegin(DEPENDENCIES_KIND_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.dependencies_kind.size()));
          for (java.lang.String _iter7 : struct.dependencies_kind)
          {
            oprot.writeString(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UnknownTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UnknownTupleScheme getScheme() {
      return new UnknownTupleScheme();
    }
  }

  private static class UnknownTupleScheme extends org.apache.thrift.scheme.TupleScheme<Unknown> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Unknown struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIndex()) {
        optionals.set(0);
      }
      if (struct.isSetDependencies()) {
        optionals.set(1);
      }
      if (struct.isSetDependenciesKind()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetIndex()) {
        oprot.writeI32(struct.index);
      }
      if (struct.isSetDependencies()) {
        {
          oprot.writeI32(struct.dependencies.size());
          for (int _iter8 : struct.dependencies)
          {
            oprot.writeI32(_iter8);
          }
        }
      }
      if (struct.isSetDependenciesKind()) {
        {
          oprot.writeI32(struct.dependencies_kind.size());
          for (java.lang.String _iter9 : struct.dependencies_kind)
          {
            oprot.writeString(_iter9);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Unknown struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.index = iprot.readI32();
        struct.setIndexIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.dependencies = new java.util.ArrayList<java.lang.Integer>(_list10.size);
          int _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = iprot.readI32();
            struct.dependencies.add(_elem11);
          }
        }
        struct.setDependenciesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.dependencies_kind = new java.util.ArrayList<java.lang.String>(_list13.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.dependencies_kind.add(_elem14);
          }
        }
        struct.setDependenciesKindIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

