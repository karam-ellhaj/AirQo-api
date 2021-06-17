/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package net.airqo.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class s2_pm10 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5402681596500762121L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"s2_pm10\",\"namespace\":\"net.airqo.models\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",\"double\"]},{\"name\":\"calibratedValue\",\"type\":[\"null\",\"double\"]},{\"name\":\"uncertaintyValue\",\"type\":[\"null\",\"double\"]},{\"name\":\"standardDeviationValue\",\"type\":[\"null\",\"double\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<s2_pm10> ENCODER =
      new BinaryMessageEncoder<s2_pm10>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<s2_pm10> DECODER =
      new BinaryMessageDecoder<s2_pm10>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<s2_pm10> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<s2_pm10> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<s2_pm10> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<s2_pm10>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this s2_pm10 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a s2_pm10 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a s2_pm10 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static s2_pm10 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Double value;
   private java.lang.Double calibratedValue;
   private java.lang.Double uncertaintyValue;
   private java.lang.Double standardDeviationValue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public s2_pm10() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   * @param calibratedValue The new value for calibratedValue
   * @param uncertaintyValue The new value for uncertaintyValue
   * @param standardDeviationValue The new value for standardDeviationValue
   */
  public s2_pm10(java.lang.Double value, java.lang.Double calibratedValue, java.lang.Double uncertaintyValue, java.lang.Double standardDeviationValue) {
    this.value = value;
    this.calibratedValue = calibratedValue;
    this.uncertaintyValue = uncertaintyValue;
    this.standardDeviationValue = standardDeviationValue;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return calibratedValue;
    case 2: return uncertaintyValue;
    case 3: return standardDeviationValue;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Double)value$; break;
    case 1: calibratedValue = (java.lang.Double)value$; break;
    case 2: uncertaintyValue = (java.lang.Double)value$; break;
    case 3: standardDeviationValue = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.Double getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Double value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'calibratedValue' field.
   * @return The value of the 'calibratedValue' field.
   */
  public java.lang.Double getCalibratedValue() {
    return calibratedValue;
  }


  /**
   * Sets the value of the 'calibratedValue' field.
   * @param value the value to set.
   */
  public void setCalibratedValue(java.lang.Double value) {
    this.calibratedValue = value;
  }

  /**
   * Gets the value of the 'uncertaintyValue' field.
   * @return The value of the 'uncertaintyValue' field.
   */
  public java.lang.Double getUncertaintyValue() {
    return uncertaintyValue;
  }


  /**
   * Sets the value of the 'uncertaintyValue' field.
   * @param value the value to set.
   */
  public void setUncertaintyValue(java.lang.Double value) {
    this.uncertaintyValue = value;
  }

  /**
   * Gets the value of the 'standardDeviationValue' field.
   * @return The value of the 'standardDeviationValue' field.
   */
  public java.lang.Double getStandardDeviationValue() {
    return standardDeviationValue;
  }


  /**
   * Sets the value of the 'standardDeviationValue' field.
   * @param value the value to set.
   */
  public void setStandardDeviationValue(java.lang.Double value) {
    this.standardDeviationValue = value;
  }

  /**
   * Creates a new s2_pm10 RecordBuilder.
   * @return A new s2_pm10 RecordBuilder
   */
  public static net.airqo.models.s2_pm10.Builder newBuilder() {
    return new net.airqo.models.s2_pm10.Builder();
  }

  /**
   * Creates a new s2_pm10 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new s2_pm10 RecordBuilder
   */
  public static net.airqo.models.s2_pm10.Builder newBuilder(net.airqo.models.s2_pm10.Builder other) {
    if (other == null) {
      return new net.airqo.models.s2_pm10.Builder();
    } else {
      return new net.airqo.models.s2_pm10.Builder(other);
    }
  }

  /**
   * Creates a new s2_pm10 RecordBuilder by copying an existing s2_pm10 instance.
   * @param other The existing instance to copy.
   * @return A new s2_pm10 RecordBuilder
   */
  public static net.airqo.models.s2_pm10.Builder newBuilder(net.airqo.models.s2_pm10 other) {
    if (other == null) {
      return new net.airqo.models.s2_pm10.Builder();
    } else {
      return new net.airqo.models.s2_pm10.Builder(other);
    }
  }

  /**
   * RecordBuilder for s2_pm10 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<s2_pm10>
    implements org.apache.avro.data.RecordBuilder<s2_pm10> {

    private java.lang.Double value;
    private java.lang.Double calibratedValue;
    private java.lang.Double uncertaintyValue;
    private java.lang.Double standardDeviationValue;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(net.airqo.models.s2_pm10.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.calibratedValue)) {
        this.calibratedValue = data().deepCopy(fields()[1].schema(), other.calibratedValue);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.uncertaintyValue)) {
        this.uncertaintyValue = data().deepCopy(fields()[2].schema(), other.uncertaintyValue);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.standardDeviationValue)) {
        this.standardDeviationValue = data().deepCopy(fields()[3].schema(), other.standardDeviationValue);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing s2_pm10 instance
     * @param other The existing instance to copy.
     */
    private Builder(net.airqo.models.s2_pm10 other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.calibratedValue)) {
        this.calibratedValue = data().deepCopy(fields()[1].schema(), other.calibratedValue);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.uncertaintyValue)) {
        this.uncertaintyValue = data().deepCopy(fields()[2].schema(), other.uncertaintyValue);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.standardDeviationValue)) {
        this.standardDeviationValue = data().deepCopy(fields()[3].schema(), other.standardDeviationValue);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.Double getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public net.airqo.models.s2_pm10.Builder setValue(java.lang.Double value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public net.airqo.models.s2_pm10.Builder clearValue() {
      value = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'calibratedValue' field.
      * @return The value.
      */
    public java.lang.Double getCalibratedValue() {
      return calibratedValue;
    }


    /**
      * Sets the value of the 'calibratedValue' field.
      * @param value The value of 'calibratedValue'.
      * @return This builder.
      */
    public net.airqo.models.s2_pm10.Builder setCalibratedValue(java.lang.Double value) {
      validate(fields()[1], value);
      this.calibratedValue = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'calibratedValue' field has been set.
      * @return True if the 'calibratedValue' field has been set, false otherwise.
      */
    public boolean hasCalibratedValue() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'calibratedValue' field.
      * @return This builder.
      */
    public net.airqo.models.s2_pm10.Builder clearCalibratedValue() {
      calibratedValue = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'uncertaintyValue' field.
      * @return The value.
      */
    public java.lang.Double getUncertaintyValue() {
      return uncertaintyValue;
    }


    /**
      * Sets the value of the 'uncertaintyValue' field.
      * @param value The value of 'uncertaintyValue'.
      * @return This builder.
      */
    public net.airqo.models.s2_pm10.Builder setUncertaintyValue(java.lang.Double value) {
      validate(fields()[2], value);
      this.uncertaintyValue = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'uncertaintyValue' field has been set.
      * @return True if the 'uncertaintyValue' field has been set, false otherwise.
      */
    public boolean hasUncertaintyValue() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'uncertaintyValue' field.
      * @return This builder.
      */
    public net.airqo.models.s2_pm10.Builder clearUncertaintyValue() {
      uncertaintyValue = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'standardDeviationValue' field.
      * @return The value.
      */
    public java.lang.Double getStandardDeviationValue() {
      return standardDeviationValue;
    }


    /**
      * Sets the value of the 'standardDeviationValue' field.
      * @param value The value of 'standardDeviationValue'.
      * @return This builder.
      */
    public net.airqo.models.s2_pm10.Builder setStandardDeviationValue(java.lang.Double value) {
      validate(fields()[3], value);
      this.standardDeviationValue = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'standardDeviationValue' field has been set.
      * @return True if the 'standardDeviationValue' field has been set, false otherwise.
      */
    public boolean hasStandardDeviationValue() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'standardDeviationValue' field.
      * @return This builder.
      */
    public net.airqo.models.s2_pm10.Builder clearStandardDeviationValue() {
      standardDeviationValue = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public s2_pm10 build() {
      try {
        s2_pm10 record = new s2_pm10();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Double) defaultValue(fields()[0]);
        record.calibratedValue = fieldSetFlags()[1] ? this.calibratedValue : (java.lang.Double) defaultValue(fields()[1]);
        record.uncertaintyValue = fieldSetFlags()[2] ? this.uncertaintyValue : (java.lang.Double) defaultValue(fields()[2]);
        record.standardDeviationValue = fieldSetFlags()[3] ? this.standardDeviationValue : (java.lang.Double) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<s2_pm10>
    WRITER$ = (org.apache.avro.io.DatumWriter<s2_pm10>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<s2_pm10>
    READER$ = (org.apache.avro.io.DatumReader<s2_pm10>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.value == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.value);
    }

    if (this.calibratedValue == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.calibratedValue);
    }

    if (this.uncertaintyValue == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.uncertaintyValue);
    }

    if (this.standardDeviationValue == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.standardDeviationValue);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.value = null;
      } else {
        this.value = in.readDouble();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.calibratedValue = null;
      } else {
        this.calibratedValue = in.readDouble();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.uncertaintyValue = null;
      } else {
        this.uncertaintyValue = in.readDouble();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.standardDeviationValue = null;
      } else {
        this.standardDeviationValue = in.readDouble();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.value = null;
          } else {
            this.value = in.readDouble();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.calibratedValue = null;
          } else {
            this.calibratedValue = in.readDouble();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.uncertaintyValue = null;
          } else {
            this.uncertaintyValue = in.readDouble();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.standardDeviationValue = null;
          } else {
            this.standardDeviationValue = in.readDouble();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










