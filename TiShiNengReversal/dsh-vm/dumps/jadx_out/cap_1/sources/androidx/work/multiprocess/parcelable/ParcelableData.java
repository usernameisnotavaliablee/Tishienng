package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableData> CREATOR = null;
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;
    private final androidx.work.Data mData;


    static {
            androidx.work.multiprocess.parcelable.ParcelableData$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableData$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableData.CREATOR = r0
            return
    }

    protected ParcelableData(@androidx.annotation.NonNull android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r4.readInt()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L15
            r3.addEntry(r4, r0)
            int r2 = r2 + 1
            goto Ld
        L15:
            androidx.work.Data r4 = new androidx.work.Data
            r4.<init>(r0)
            r3.mData = r4
            return
    }

    public ParcelableData(@androidx.annotation.NonNull androidx.work.Data r1) {
            r0 = this;
            r0.<init>()
            r0.mData = r1
            return
    }

    private void addEntry(@androidx.annotation.NonNull android.os.Parcel r3, @androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> r4) {
            r2 = this;
            byte r0 = r3.readByte()
            switch(r0) {
                case 0: goto L95;
                case 1: goto L8c;
                case 2: goto L83;
                case 3: goto L7a;
                case 4: goto L71;
                case 5: goto L68;
                case 6: goto L5f;
                case 7: goto L5a;
                case 8: goto L51;
                case 9: goto L48;
                case 10: goto L3f;
                case 11: goto L36;
                case 12: goto L2d;
                case 13: goto L23;
                case 14: goto L1d;
                default: goto L7;
            }
        L7:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "Unsupported type %s"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L1d:
            java.lang.String[] r0 = r3.createStringArray()
            goto L96
        L23:
            double[] r0 = r3.createDoubleArray()
            java.lang.Double[] r0 = androidx.work.Data.convertPrimitiveDoubleArray(r0)
            goto L96
        L2d:
            float[] r0 = r3.createFloatArray()
            java.lang.Float[] r0 = androidx.work.Data.convertPrimitiveFloatArray(r0)
            goto L96
        L36:
            long[] r0 = r3.createLongArray()
            java.lang.Long[] r0 = androidx.work.Data.convertPrimitiveLongArray(r0)
            goto L96
        L3f:
            int[] r0 = r3.createIntArray()
            java.lang.Integer[] r0 = androidx.work.Data.convertPrimitiveIntArray(r0)
            goto L96
        L48:
            byte[] r0 = r3.createByteArray()
            java.lang.Byte[] r0 = androidx.work.Data.convertPrimitiveByteArray(r0)
            goto L96
        L51:
            boolean[] r0 = r3.createBooleanArray()
            java.lang.Boolean[] r0 = androidx.work.Data.convertPrimitiveBooleanArray(r0)
            goto L96
        L5a:
            java.lang.String r0 = r3.readString()
            goto L96
        L5f:
            double r0 = r3.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L96
        L68:
            float r0 = r3.readFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L96
        L71:
            long r0 = r3.readLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L96
        L7a:
            int r0 = r3.readInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L96
        L83:
            byte r0 = r3.readByte()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L96
        L8c:
            boolean r0 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L96
        L95:
            r0 = 0
        L96:
            java.lang.String r3 = r3.readString()
            r4.put(r3, r0)
            return
    }

    private void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, @androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable java.lang.Object r7) {
            r4 = this;
            r0 = 0
            if (r7 != 0) goto L8
            r5.writeByte(r0)
            goto L10e
        L8:
            java.lang.Class r1 = r7.getClass()
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 1
            if (r1 != r2) goto L1f
            r5.writeByte(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r5, r7)
            goto L10e
        L1f:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            if (r1 != r2) goto L32
            r0 = 2
            r5.writeByte(r0)
            java.lang.Byte r7 = (java.lang.Byte) r7
            byte r7 = r7.byteValue()
            r5.writeByte(r7)
            goto L10e
        L32:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 != r2) goto L45
            r0 = 3
            r5.writeByte(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.writeInt(r7)
            goto L10e
        L45:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r1 != r2) goto L58
            r0 = 4
            r5.writeByte(r0)
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            r5.writeLong(r0)
            goto L10e
        L58:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            if (r1 != r2) goto L6b
            r0 = 5
            r5.writeByte(r0)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r5.writeFloat(r7)
            goto L10e
        L6b:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            if (r1 != r2) goto L7e
            r0 = 6
            r5.writeByte(r0)
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            r5.writeDouble(r0)
            goto L10e
        L7e:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L8d
            r0 = 7
            r5.writeByte(r0)
            java.lang.String r7 = (java.lang.String) r7
            r5.writeString(r7)
            goto L10e
        L8d:
            java.lang.Class<java.lang.Boolean[]> r2 = java.lang.Boolean[].class
            if (r1 != r2) goto La1
            r0 = 8
            r5.writeByte(r0)
            java.lang.Boolean[] r7 = (java.lang.Boolean[]) r7
            boolean[] r7 = androidx.work.Data.convertToPrimitiveArray(r7)
            r5.writeBooleanArray(r7)
            goto L10e
        La1:
            java.lang.Class<java.lang.Byte[]> r2 = java.lang.Byte[].class
            if (r1 != r2) goto Lb4
            r0 = 9
            r5.writeByte(r0)
            java.lang.Byte[] r7 = (java.lang.Byte[]) r7
            byte[] r7 = androidx.work.Data.convertToPrimitiveArray(r7)
            r5.writeByteArray(r7)
            goto L10e
        Lb4:
            java.lang.Class<java.lang.Integer[]> r2 = java.lang.Integer[].class
            if (r1 != r2) goto Lc7
            r0 = 10
            r5.writeByte(r0)
            java.lang.Integer[] r7 = (java.lang.Integer[]) r7
            int[] r7 = androidx.work.Data.convertToPrimitiveArray(r7)
            r5.writeIntArray(r7)
            goto L10e
        Lc7:
            java.lang.Class<java.lang.Long[]> r2 = java.lang.Long[].class
            if (r1 != r2) goto Lda
            r0 = 11
            r5.writeByte(r0)
            java.lang.Long[] r7 = (java.lang.Long[]) r7
            long[] r7 = androidx.work.Data.convertToPrimitiveArray(r7)
            r5.writeLongArray(r7)
            goto L10e
        Lda:
            java.lang.Class<java.lang.Float[]> r2 = java.lang.Float[].class
            if (r1 != r2) goto Led
            r0 = 12
            r5.writeByte(r0)
            java.lang.Float[] r7 = (java.lang.Float[]) r7
            float[] r7 = androidx.work.Data.convertToPrimitiveArray(r7)
            r5.writeFloatArray(r7)
            goto L10e
        Led:
            java.lang.Class<java.lang.Double[]> r2 = java.lang.Double[].class
            if (r1 != r2) goto L100
            r0 = 13
            r5.writeByte(r0)
            java.lang.Double[] r7 = (java.lang.Double[]) r7
            double[] r7 = androidx.work.Data.convertToPrimitiveArray(r7)
            r5.writeDoubleArray(r7)
            goto L10e
        L100:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            if (r1 != r2) goto L112
            r0 = 14
            r5.writeByte(r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r5.writeStringArray(r7)
        L10e:
            r5.writeString(r6)
            return
        L112:
            java.lang.String r5 = r1.getName()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r0] = r5
            java.lang.String r5 = "Unsupported value type %s"
            java.lang.String r5 = java.lang.String.format(r5, r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.Data getData() {
            r1 = this;
            androidx.work.Data r0 = r1.mData
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
            r2 = this;
            androidx.work.Data r4 = r2.mData
            java.util.Map r4 = r4.getKeyValueMap()
            int r0 = r4.size()
            r3.writeInt(r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r2.writeToParcel(r3, r1, r0)
            goto L15
        L2f:
            return
    }
}
