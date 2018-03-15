/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package no.mechatronics.sfi.fmu_proxy.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-03-15")
public class AdamsBashforthIntegrator implements org.apache.thrift.TBase<AdamsBashforthIntegrator, AdamsBashforthIntegrator._Fields>, java.io.Serializable, Cloneable, Comparable<AdamsBashforthIntegrator> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdamsBashforthIntegrator");

  private static final org.apache.thrift.protocol.TField N_STEPS_FIELD_DESC = new org.apache.thrift.protocol.TField("n_steps", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MIN__STEP_FIELD_DESC = new org.apache.thrift.protocol.TField("min_Step", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField MAX_STEP_FIELD_DESC = new org.apache.thrift.protocol.TField("max_step", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField SCAL_ABSOLUTE_TOLERANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("scal_absolute_tolerance", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField SCAL_RELATIVE_TOLERANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("scal_relative_tolerance", org.apache.thrift.protocol.TType.DOUBLE, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AdamsBashforthIntegratorStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AdamsBashforthIntegratorTupleSchemeFactory();

  private int n_steps; // required
  private double min_Step; // required
  private double max_step; // required
  private double scal_absolute_tolerance; // required
  private double scal_relative_tolerance; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    N_STEPS((short)1, "n_steps"),
    MIN__STEP((short)2, "min_Step"),
    MAX_STEP((short)3, "max_step"),
    SCAL_ABSOLUTE_TOLERANCE((short)4, "scal_absolute_tolerance"),
    SCAL_RELATIVE_TOLERANCE((short)5, "scal_relative_tolerance");

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
        case 1: // N_STEPS
          return N_STEPS;
        case 2: // MIN__STEP
          return MIN__STEP;
        case 3: // MAX_STEP
          return MAX_STEP;
        case 4: // SCAL_ABSOLUTE_TOLERANCE
          return SCAL_ABSOLUTE_TOLERANCE;
        case 5: // SCAL_RELATIVE_TOLERANCE
          return SCAL_RELATIVE_TOLERANCE;
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

  // isset id assignments
  private static final int __N_STEPS_ISSET_ID = 0;
  private static final int __MIN_STEP_ISSET_ID = 1;
  private static final int __MAX_STEP_ISSET_ID = 2;
  private static final int __SCAL_ABSOLUTE_TOLERANCE_ISSET_ID = 3;
  private static final int __SCAL_RELATIVE_TOLERANCE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.N_STEPS, new org.apache.thrift.meta_data.FieldMetaData("n_steps", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MIN__STEP, new org.apache.thrift.meta_data.FieldMetaData("min_Step", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MAX_STEP, new org.apache.thrift.meta_data.FieldMetaData("max_step", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SCAL_ABSOLUTE_TOLERANCE, new org.apache.thrift.meta_data.FieldMetaData("scal_absolute_tolerance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SCAL_RELATIVE_TOLERANCE, new org.apache.thrift.meta_data.FieldMetaData("scal_relative_tolerance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdamsBashforthIntegrator.class, metaDataMap);
  }

  public AdamsBashforthIntegrator() {
  }

  public AdamsBashforthIntegrator(
    int n_steps,
    double min_Step,
    double max_step,
    double scal_absolute_tolerance,
    double scal_relative_tolerance)
  {
    this();
    this.n_steps = n_steps;
    setN_stepsIsSet(true);
    this.min_Step = min_Step;
    setMin_StepIsSet(true);
    this.max_step = max_step;
    setMax_stepIsSet(true);
    this.scal_absolute_tolerance = scal_absolute_tolerance;
    setScal_absolute_toleranceIsSet(true);
    this.scal_relative_tolerance = scal_relative_tolerance;
    setScal_relative_toleranceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdamsBashforthIntegrator(AdamsBashforthIntegrator other) {
    __isset_bitfield = other.__isset_bitfield;
    this.n_steps = other.n_steps;
    this.min_Step = other.min_Step;
    this.max_step = other.max_step;
    this.scal_absolute_tolerance = other.scal_absolute_tolerance;
    this.scal_relative_tolerance = other.scal_relative_tolerance;
  }

  public AdamsBashforthIntegrator deepCopy() {
    return new AdamsBashforthIntegrator(this);
  }

  @Override
  public void clear() {
    setN_stepsIsSet(false);
    this.n_steps = 0;
    setMin_StepIsSet(false);
    this.min_Step = 0.0;
    setMax_stepIsSet(false);
    this.max_step = 0.0;
    setScal_absolute_toleranceIsSet(false);
    this.scal_absolute_tolerance = 0.0;
    setScal_relative_toleranceIsSet(false);
    this.scal_relative_tolerance = 0.0;
  }

  public int getN_steps() {
    return this.n_steps;
  }

  public AdamsBashforthIntegrator setN_steps(int n_steps) {
    this.n_steps = n_steps;
    setN_stepsIsSet(true);
    return this;
  }

  public void unsetN_steps() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __N_STEPS_ISSET_ID);
  }

  /** Returns true if field n_steps is set (has been assigned a value) and false otherwise */
  public boolean isSetN_steps() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __N_STEPS_ISSET_ID);
  }

  public void setN_stepsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __N_STEPS_ISSET_ID, value);
  }

  public double getMin_Step() {
    return this.min_Step;
  }

  public AdamsBashforthIntegrator setMin_Step(double min_Step) {
    this.min_Step = min_Step;
    setMin_StepIsSet(true);
    return this;
  }

  public void unsetMin_Step() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MIN_STEP_ISSET_ID);
  }

  /** Returns true if field min_Step is set (has been assigned a value) and false otherwise */
  public boolean isSetMin_Step() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MIN_STEP_ISSET_ID);
  }

  public void setMin_StepIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MIN_STEP_ISSET_ID, value);
  }

  public double getMax_step() {
    return this.max_step;
  }

  public AdamsBashforthIntegrator setMax_step(double max_step) {
    this.max_step = max_step;
    setMax_stepIsSet(true);
    return this;
  }

  public void unsetMax_step() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAX_STEP_ISSET_ID);
  }

  /** Returns true if field max_step is set (has been assigned a value) and false otherwise */
  public boolean isSetMax_step() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAX_STEP_ISSET_ID);
  }

  public void setMax_stepIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAX_STEP_ISSET_ID, value);
  }

  public double getScal_absolute_tolerance() {
    return this.scal_absolute_tolerance;
  }

  public AdamsBashforthIntegrator setScal_absolute_tolerance(double scal_absolute_tolerance) {
    this.scal_absolute_tolerance = scal_absolute_tolerance;
    setScal_absolute_toleranceIsSet(true);
    return this;
  }

  public void unsetScal_absolute_tolerance() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCAL_ABSOLUTE_TOLERANCE_ISSET_ID);
  }

  /** Returns true if field scal_absolute_tolerance is set (has been assigned a value) and false otherwise */
  public boolean isSetScal_absolute_tolerance() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCAL_ABSOLUTE_TOLERANCE_ISSET_ID);
  }

  public void setScal_absolute_toleranceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCAL_ABSOLUTE_TOLERANCE_ISSET_ID, value);
  }

  public double getScal_relative_tolerance() {
    return this.scal_relative_tolerance;
  }

  public AdamsBashforthIntegrator setScal_relative_tolerance(double scal_relative_tolerance) {
    this.scal_relative_tolerance = scal_relative_tolerance;
    setScal_relative_toleranceIsSet(true);
    return this;
  }

  public void unsetScal_relative_tolerance() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCAL_RELATIVE_TOLERANCE_ISSET_ID);
  }

  /** Returns true if field scal_relative_tolerance is set (has been assigned a value) and false otherwise */
  public boolean isSetScal_relative_tolerance() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCAL_RELATIVE_TOLERANCE_ISSET_ID);
  }

  public void setScal_relative_toleranceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCAL_RELATIVE_TOLERANCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case N_STEPS:
      if (value == null) {
        unsetN_steps();
      } else {
        setN_steps((java.lang.Integer)value);
      }
      break;

    case MIN__STEP:
      if (value == null) {
        unsetMin_Step();
      } else {
        setMin_Step((java.lang.Double)value);
      }
      break;

    case MAX_STEP:
      if (value == null) {
        unsetMax_step();
      } else {
        setMax_step((java.lang.Double)value);
      }
      break;

    case SCAL_ABSOLUTE_TOLERANCE:
      if (value == null) {
        unsetScal_absolute_tolerance();
      } else {
        setScal_absolute_tolerance((java.lang.Double)value);
      }
      break;

    case SCAL_RELATIVE_TOLERANCE:
      if (value == null) {
        unsetScal_relative_tolerance();
      } else {
        setScal_relative_tolerance((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case N_STEPS:
      return getN_steps();

    case MIN__STEP:
      return getMin_Step();

    case MAX_STEP:
      return getMax_step();

    case SCAL_ABSOLUTE_TOLERANCE:
      return getScal_absolute_tolerance();

    case SCAL_RELATIVE_TOLERANCE:
      return getScal_relative_tolerance();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case N_STEPS:
      return isSetN_steps();
    case MIN__STEP:
      return isSetMin_Step();
    case MAX_STEP:
      return isSetMax_step();
    case SCAL_ABSOLUTE_TOLERANCE:
      return isSetScal_absolute_tolerance();
    case SCAL_RELATIVE_TOLERANCE:
      return isSetScal_relative_tolerance();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AdamsBashforthIntegrator)
      return this.equals((AdamsBashforthIntegrator)that);
    return false;
  }

  public boolean equals(AdamsBashforthIntegrator that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_n_steps = true;
    boolean that_present_n_steps = true;
    if (this_present_n_steps || that_present_n_steps) {
      if (!(this_present_n_steps && that_present_n_steps))
        return false;
      if (this.n_steps != that.n_steps)
        return false;
    }

    boolean this_present_min_Step = true;
    boolean that_present_min_Step = true;
    if (this_present_min_Step || that_present_min_Step) {
      if (!(this_present_min_Step && that_present_min_Step))
        return false;
      if (this.min_Step != that.min_Step)
        return false;
    }

    boolean this_present_max_step = true;
    boolean that_present_max_step = true;
    if (this_present_max_step || that_present_max_step) {
      if (!(this_present_max_step && that_present_max_step))
        return false;
      if (this.max_step != that.max_step)
        return false;
    }

    boolean this_present_scal_absolute_tolerance = true;
    boolean that_present_scal_absolute_tolerance = true;
    if (this_present_scal_absolute_tolerance || that_present_scal_absolute_tolerance) {
      if (!(this_present_scal_absolute_tolerance && that_present_scal_absolute_tolerance))
        return false;
      if (this.scal_absolute_tolerance != that.scal_absolute_tolerance)
        return false;
    }

    boolean this_present_scal_relative_tolerance = true;
    boolean that_present_scal_relative_tolerance = true;
    if (this_present_scal_relative_tolerance || that_present_scal_relative_tolerance) {
      if (!(this_present_scal_relative_tolerance && that_present_scal_relative_tolerance))
        return false;
      if (this.scal_relative_tolerance != that.scal_relative_tolerance)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + n_steps;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(min_Step);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(max_step);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(scal_absolute_tolerance);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(scal_relative_tolerance);

    return hashCode;
  }

  @Override
  public int compareTo(AdamsBashforthIntegrator other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetN_steps()).compareTo(other.isSetN_steps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetN_steps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.n_steps, other.n_steps);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMin_Step()).compareTo(other.isSetMin_Step());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMin_Step()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.min_Step, other.min_Step);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMax_step()).compareTo(other.isSetMax_step());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax_step()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max_step, other.max_step);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetScal_absolute_tolerance()).compareTo(other.isSetScal_absolute_tolerance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScal_absolute_tolerance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scal_absolute_tolerance, other.scal_absolute_tolerance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetScal_relative_tolerance()).compareTo(other.isSetScal_relative_tolerance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScal_relative_tolerance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scal_relative_tolerance, other.scal_relative_tolerance);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AdamsBashforthIntegrator(");
    boolean first = true;

    sb.append("n_steps:");
    sb.append(this.n_steps);
    first = false;
    if (!first) sb.append(", ");
    sb.append("min_Step:");
    sb.append(this.min_Step);
    first = false;
    if (!first) sb.append(", ");
    sb.append("max_step:");
    sb.append(this.max_step);
    first = false;
    if (!first) sb.append(", ");
    sb.append("scal_absolute_tolerance:");
    sb.append(this.scal_absolute_tolerance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("scal_relative_tolerance:");
    sb.append(this.scal_relative_tolerance);
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

  private static class AdamsBashforthIntegratorStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AdamsBashforthIntegratorStandardScheme getScheme() {
      return new AdamsBashforthIntegratorStandardScheme();
    }
  }

  private static class AdamsBashforthIntegratorStandardScheme extends org.apache.thrift.scheme.StandardScheme<AdamsBashforthIntegrator> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AdamsBashforthIntegrator struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // N_STEPS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.n_steps = iprot.readI32();
              struct.setN_stepsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MIN__STEP
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.min_Step = iprot.readDouble();
              struct.setMin_StepIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAX_STEP
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.max_step = iprot.readDouble();
              struct.setMax_stepIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SCAL_ABSOLUTE_TOLERANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.scal_absolute_tolerance = iprot.readDouble();
              struct.setScal_absolute_toleranceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SCAL_RELATIVE_TOLERANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.scal_relative_tolerance = iprot.readDouble();
              struct.setScal_relative_toleranceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AdamsBashforthIntegrator struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(N_STEPS_FIELD_DESC);
      oprot.writeI32(struct.n_steps);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MIN__STEP_FIELD_DESC);
      oprot.writeDouble(struct.min_Step);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_STEP_FIELD_DESC);
      oprot.writeDouble(struct.max_step);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SCAL_ABSOLUTE_TOLERANCE_FIELD_DESC);
      oprot.writeDouble(struct.scal_absolute_tolerance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SCAL_RELATIVE_TOLERANCE_FIELD_DESC);
      oprot.writeDouble(struct.scal_relative_tolerance);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdamsBashforthIntegratorTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AdamsBashforthIntegratorTupleScheme getScheme() {
      return new AdamsBashforthIntegratorTupleScheme();
    }
  }

  private static class AdamsBashforthIntegratorTupleScheme extends org.apache.thrift.scheme.TupleScheme<AdamsBashforthIntegrator> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AdamsBashforthIntegrator struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetN_steps()) {
        optionals.set(0);
      }
      if (struct.isSetMin_Step()) {
        optionals.set(1);
      }
      if (struct.isSetMax_step()) {
        optionals.set(2);
      }
      if (struct.isSetScal_absolute_tolerance()) {
        optionals.set(3);
      }
      if (struct.isSetScal_relative_tolerance()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetN_steps()) {
        oprot.writeI32(struct.n_steps);
      }
      if (struct.isSetMin_Step()) {
        oprot.writeDouble(struct.min_Step);
      }
      if (struct.isSetMax_step()) {
        oprot.writeDouble(struct.max_step);
      }
      if (struct.isSetScal_absolute_tolerance()) {
        oprot.writeDouble(struct.scal_absolute_tolerance);
      }
      if (struct.isSetScal_relative_tolerance()) {
        oprot.writeDouble(struct.scal_relative_tolerance);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AdamsBashforthIntegrator struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.n_steps = iprot.readI32();
        struct.setN_stepsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.min_Step = iprot.readDouble();
        struct.setMin_StepIsSet(true);
      }
      if (incoming.get(2)) {
        struct.max_step = iprot.readDouble();
        struct.setMax_stepIsSet(true);
      }
      if (incoming.get(3)) {
        struct.scal_absolute_tolerance = iprot.readDouble();
        struct.setScal_absolute_toleranceIsSet(true);
      }
      if (incoming.get(4)) {
        struct.scal_relative_tolerance = iprot.readDouble();
        struct.setScal_relative_toleranceIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

