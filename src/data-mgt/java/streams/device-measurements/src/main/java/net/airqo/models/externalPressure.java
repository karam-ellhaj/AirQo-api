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
public class externalPressure extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5309406319132297561L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"externalPressure\",\"namespace\":\"net.airqo.models\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",\"double\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<externalPressure> ENCODER =
      new BinaryMessageEncoder<externalPressure>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<externalPressure> DECODER =
      new BinaryMessageDecoder<externalPressure>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<externalPressure> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<externalPressure> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<externalPressure> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<externalPressure>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this externalPressure to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a externalPressure from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a externalPressure instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static externalPressure fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Double value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public externalPressure() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   */
  public externalPressure(java.lang.Double value) {
    this.value = value;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Double)value$; break;
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
   * Creates a new externalPressure RecordBuilder.
   * @return A new externalPressure RecordBuilder
   */
  public static net.airqo.models.externalPressure.Builder newBuilder() {
    return new net.airqo.models.externalPressure.Builder();
  }

  /**
   * Creates a new externalPressure RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new externalPressure RecordBuilder
   */
  public static net.airqo.models.externalPressure.Builder newBuilder(net.airqo.models.externalPressure.Builder other) {
    if (other == null) {
      return new net.airqo.models.externalPressure.Builder();
    } else {
      return new net.airqo.models.externalPressure.Builder(other);
    }
  }

  /**
   * Creates a new externalPressure RecordBuilder by copying an existing externalPressure instance.
   * @param other The existing instance to copy.
   * @return A new externalPressure RecordBuilder
   */
  public static net.airqo.models.externalPressure.Builder newBuilder(net.airqo.models.externalPressure other) {
    if (other == null) {
      return new net.airqo.models.externalPressure.Builder();
    } else {
      return new net.airqo.models.externalPressure.Builder(other);
    }
  }

  /**
   * RecordBuilder for externalPressure instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<externalPressure>
    implements org.apache.avro.data.RecordBuilder<externalPressure> {

    private java.lang.Double value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(net.airqo.models.externalPressure.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing externalPressure instance
     * @param other The existing instance to copy.
     */
    private Builder(net.airqo.models.externalPressure other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
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
    public net.airqo.models.externalPressure.Builder setValue(java.lang.Double value) {
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
    public net.airqo.models.externalPressure.Builder clearValue() {
      value = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public externalPressure build() {
      try {
        externalPressure record = new externalPressure();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Double) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<externalPressure>
    WRITER$ = (org.apache.avro.io.DatumWriter<externalPressure>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<externalPressure>
    READER$ = (org.apache.avro.io.DatumReader<externalPressure>)MODEL$.createDatumReader(SCHEMA$);

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

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.value = null;
          } else {
            this.value = in.readDouble();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










