package com.huawei.hms.common.parcel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ParcelWrite {
    public static final int b = 65262;
    public android.os.Parcel a;

    public ParcelWrite(android.os.Parcel r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private int a(int r3) {
            r2 = this;
            android.os.Parcel r0 = r2.a
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 | r1
            r0.writeInt(r3)
            android.os.Parcel r3 = r2.a
            r0 = 0
            r3.writeInt(r0)
            android.os.Parcel r3 = r2.a
            int r3 = r3.dataPosition()
            return r3
    }

    private void b(int r3, int r4) {
            r2 = this;
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r4 < r0) goto L13
            android.os.Parcel r0 = r2.a
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 | r1
            r0.writeInt(r3)
            android.os.Parcel r3 = r2.a
            r3.writeInt(r4)
            return
        L13:
            android.os.Parcel r0 = r2.a
            int r4 = r4 << 16
            r3 = r3 | r4
            r0.writeInt(r3)
            return
    }

    private <T extends android.os.Parcelable> void c(T r4, int r5) {
            r3 = this;
            android.os.Parcel r0 = r3.a
            int r0 = r0.dataPosition()
            android.os.Parcel r1 = r3.a
            r2 = 1
            r1.writeInt(r2)
            android.os.Parcel r1 = r3.a
            int r1 = r1.dataPosition()
            android.os.Parcel r2 = r3.a
            r4.writeToParcel(r2, r5)
            android.os.Parcel r4 = r3.a
            int r4 = r4.dataPosition()
            android.os.Parcel r5 = r3.a
            r5.setDataPosition(r0)
            android.os.Parcel r5 = r3.a
            int r0 = r4 - r1
            r5.writeInt(r0)
            android.os.Parcel r5 = r3.a
            r5.setDataPosition(r4)
            return
    }

    private void d(int r4) {
            r3 = this;
            android.os.Parcel r0 = r3.a
            int r0 = r0.dataPosition()
            int r1 = r0 - r4
            android.os.Parcel r2 = r3.a
            int r4 = r4 + (-4)
            r2.setDataPosition(r4)
            android.os.Parcel r4 = r3.a
            r4.writeInt(r1)
            android.os.Parcel r4 = r3.a
            r4.setDataPosition(r0)
            return
    }

    public int beginObjectHeader() {
            r1 = this;
            r0 = 65262(0xfeee, float:9.1452E-41)
            int r0 = r1.a(r0)
            return r0
    }

    public void finishObjectHeader(int r1) {
            r0 = this;
            r0.d(r1)
            return
    }

    public void writeBigDecimal(int r2, java.math.BigDecimal r3, boolean r4) {
            r1 = this;
            if (r3 != 0) goto L9
            if (r4 == 0) goto L8
            r3 = 0
            r1.b(r2, r3)
        L8:
            return
        L9:
            int r2 = r1.a(r2)
            android.os.Parcel r4 = r1.a
            java.math.BigInteger r0 = r3.unscaledValue()
            byte[] r0 = r0.toByteArray()
            r4.writeByteArray(r0)
            android.os.Parcel r4 = r1.a
            int r3 = r3.scale()
            r4.writeInt(r3)
            r1.d(r2)
            return
    }

    public void writeBigDecimalArray(int r4, java.math.BigDecimal[] r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.length
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L13:
            if (r0 >= r6) goto L32
            android.os.Parcel r1 = r3.a
            r2 = r5[r0]
            java.math.BigInteger r2 = r2.unscaledValue()
            byte[] r2 = r2.toByteArray()
            r1.writeByteArray(r2)
            android.os.Parcel r1 = r3.a
            r2 = r5[r0]
            int r2 = r2.scale()
            r1.writeInt(r2)
            int r0 = r0 + 1
            goto L13
        L32:
            r3.d(r4)
            return
    }

    public void writeBigInteger(int r1, java.math.BigInteger r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            byte[] r2 = r2.toByteArray()
            r3.writeByteArray(r2)
            r0.d(r1)
            return
    }

    public void writeBigIntegerArray(int r4, java.math.BigInteger[] r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.length
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L13:
            if (r0 >= r6) goto L23
            android.os.Parcel r1 = r3.a
            r2 = r5[r0]
            byte[] r2 = r2.toByteArray()
            r1.writeByteArray(r2)
            int r0 = r0 + 1
            goto L13
        L23:
            r3.d(r4)
            return
    }

    public void writeBoolean(int r2, boolean r3) {
            r1 = this;
            r0 = 4
            r1.b(r2, r0)
            android.os.Parcel r2 = r1.a
            r2.writeInt(r3)
            return
    }

    public void writeBooleanArray(int r1, boolean[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeBooleanArray(r2)
            r0.d(r1)
            return
    }

    public void writeBooleanList(int r4, java.util.List<java.lang.Boolean> r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L16:
            if (r0 >= r6) goto L2a
            android.os.Parcel r1 = r3.a
            java.lang.Object r2 = r5.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.writeInt(r2)
            int r0 = r0 + 1
            goto L16
        L2a:
            r3.d(r4)
            return
    }

    public void writeBooleanObject(int r2, java.lang.Boolean r3) {
            r1 = this;
            r0 = 0
            r1.writeBooleanObject(r2, r3, r0)
            return
    }

    public void writeBooleanObject(int r1, java.lang.Boolean r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            r3 = 4
            r0.b(r1, r3)
            android.os.Parcel r1 = r0.a
            boolean r2 = r2.booleanValue()
            r1.writeInt(r2)
            return
    }

    public void writeBundle(int r1, android.os.Bundle r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeBundle(r2)
            r0.d(r1)
            return
    }

    public void writeByte(int r2, byte r3) {
            r1 = this;
            r0 = 4
            r1.b(r2, r0)
            android.os.Parcel r2 = r1.a
            r2.writeInt(r3)
            return
    }

    public void writeByteArray(int r1, byte[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeByteArray(r2)
            r0.d(r1)
            return
    }

    public void writeByteArrayArray(int r4, byte[][] r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.length
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L13:
            if (r0 >= r6) goto L1f
            android.os.Parcel r1 = r3.a
            r2 = r5[r0]
            r1.writeByteArray(r2)
            int r0 = r0 + 1
            goto L13
        L1f:
            r3.d(r4)
            return
    }

    public void writeByteArraySparseArray(int r4, android.util.SparseArray<byte[]> r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L16:
            if (r0 >= r6) goto L2f
            android.os.Parcel r1 = r3.a
            int r2 = r5.keyAt(r0)
            r1.writeInt(r2)
            android.os.Parcel r1 = r3.a
            java.lang.Object r2 = r5.valueAt(r0)
            byte[] r2 = (byte[]) r2
            r1.writeByteArray(r2)
            int r0 = r0 + 1
            goto L16
        L2f:
            r3.d(r4)
            return
    }

    public void writeChar(int r2, char r3) {
            r1 = this;
            r0 = 4
            r1.b(r2, r0)
            android.os.Parcel r2 = r1.a
            r2.writeInt(r3)
            return
    }

    public void writeCharArray(int r1, char[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeCharArray(r2)
            r0.d(r1)
            return
    }

    public void writeDouble(int r2, double r3) {
            r1 = this;
            r0 = 8
            r1.b(r2, r0)
            android.os.Parcel r2 = r1.a
            r2.writeDouble(r3)
            return
    }

    public void writeDoubleArray(int r1, double[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeDoubleArray(r2)
            r0.d(r1)
            return
    }

    public void writeDoubleList(int r5, java.util.List<java.lang.Double> r6, boolean r7) {
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L9
            if (r7 == 0) goto L8
            r4.b(r5, r0)
        L8:
            return
        L9:
            int r5 = r4.a(r5)
            int r7 = r6.size()
            android.os.Parcel r1 = r4.a
            r1.writeInt(r7)
        L16:
            if (r0 >= r7) goto L2a
            android.os.Parcel r1 = r4.a
            java.lang.Object r2 = r6.get(r0)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r1.writeDouble(r2)
            int r0 = r0 + 1
            goto L16
        L2a:
            r4.d(r5)
            return
    }

    public void writeDoubleObject(int r1, java.lang.Double r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            r3 = 8
            r0.b(r1, r3)
            android.os.Parcel r1 = r0.a
            double r2 = r2.doubleValue()
            r1.writeDouble(r2)
            return
    }

    public void writeDoubleSparseArray(int r5, android.util.SparseArray<java.lang.Double> r6, boolean r7) {
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L9
            if (r7 == 0) goto L8
            r4.b(r5, r0)
        L8:
            return
        L9:
            int r5 = r4.a(r5)
            int r7 = r6.size()
            android.os.Parcel r1 = r4.a
            r1.writeInt(r7)
        L16:
            if (r0 >= r7) goto L33
            android.os.Parcel r1 = r4.a
            int r2 = r6.keyAt(r0)
            r1.writeInt(r2)
            android.os.Parcel r1 = r4.a
            java.lang.Object r2 = r6.valueAt(r0)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r1.writeDouble(r2)
            int r0 = r0 + 1
            goto L16
        L33:
            r4.d(r5)
            return
    }

    public void writeFloat(int r2, float r3) {
            r1 = this;
            r0 = 4
            r1.b(r2, r0)
            android.os.Parcel r2 = r1.a
            r2.writeFloat(r3)
            return
    }

    public void writeFloatArray(int r1, float[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeFloatArray(r2)
            r0.d(r1)
            return
    }

    public void writeFloatList(int r4, java.util.List<java.lang.Float> r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L16:
            if (r0 >= r6) goto L2a
            android.os.Parcel r1 = r3.a
            java.lang.Object r2 = r5.get(r0)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.writeFloat(r2)
            int r0 = r0 + 1
            goto L16
        L2a:
            r3.d(r4)
            return
    }

    public void writeFloatObject(int r1, java.lang.Float r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            r3 = 4
            r0.b(r1, r3)
            android.os.Parcel r1 = r0.a
            float r2 = r2.floatValue()
            r1.writeFloat(r2)
            return
    }

    public void writeFloatSparseArray(int r4, android.util.SparseArray<java.lang.Float> r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L16:
            if (r0 >= r6) goto L33
            android.os.Parcel r1 = r3.a
            int r2 = r5.keyAt(r0)
            r1.writeInt(r2)
            android.os.Parcel r1 = r3.a
            java.lang.Object r2 = r5.valueAt(r0)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.writeFloat(r2)
            int r0 = r0 + 1
            goto L16
        L33:
            r3.d(r4)
            return
    }

    public void writeIBinder(int r1, android.os.IBinder r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeStrongBinder(r2)
            r0.d(r1)
            return
    }

    public void writeIBinderArray(int r1, android.os.IBinder[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeBinderArray(r2)
            r0.d(r1)
            return
    }

    public void writeIBinderList(int r1, java.util.List<android.os.IBinder> r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeBinderList(r2)
            r0.d(r1)
            return
    }

    public void writeIBinderSparseArray(int r4, android.util.SparseArray<android.os.IBinder> r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L16:
            if (r0 >= r6) goto L2f
            android.os.Parcel r1 = r3.a
            int r2 = r5.keyAt(r0)
            r1.writeInt(r2)
            android.os.Parcel r1 = r3.a
            java.lang.Object r2 = r5.valueAt(r0)
            android.os.IBinder r2 = (android.os.IBinder) r2
            r1.writeStrongBinder(r2)
            int r0 = r0 + 1
            goto L16
        L2f:
            r3.d(r4)
            return
    }

    public void writeInt(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.b(r2, r0)
            android.os.Parcel r2 = r1.a
            r2.writeInt(r3)
            return
    }

    public void writeIntArray(int r1, int[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeIntArray(r2)
            r0.d(r1)
            return
    }

    public void writeIntegerList(int r4, java.util.List<java.lang.Integer> r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L16:
            if (r0 >= r6) goto L2a
            android.os.Parcel r1 = r3.a
            java.lang.Object r2 = r5.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.writeInt(r2)
            int r0 = r0 + 1
            goto L16
        L2a:
            r3.d(r4)
            return
    }

    public void writeIntegerObject(int r1, java.lang.Integer r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            r3 = 4
            r0.b(r1, r3)
            android.os.Parcel r1 = r0.a
            int r2 = r2.intValue()
            r1.writeInt(r2)
            return
    }

    public void writeList(int r1, java.util.List r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeList(r2)
            r0.d(r1)
            return
    }

    public void writeLong(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.b(r2, r0)
            android.os.Parcel r2 = r1.a
            r2.writeLong(r3)
            return
    }

    public void writeLongArray(int r1, long[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeLongArray(r2)
            r0.d(r1)
            return
    }

    public void writeLongList(int r5, java.util.List<java.lang.Long> r6, boolean r7) {
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L9
            if (r7 == 0) goto L8
            r4.b(r5, r0)
        L8:
            return
        L9:
            int r5 = r4.a(r5)
            int r7 = r6.size()
            android.os.Parcel r1 = r4.a
            r1.writeInt(r7)
        L16:
            if (r0 >= r7) goto L2a
            android.os.Parcel r1 = r4.a
            java.lang.Object r2 = r6.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.writeLong(r2)
            int r0 = r0 + 1
            goto L16
        L2a:
            r4.d(r5)
            return
    }

    public void writeLongObject(int r1, java.lang.Long r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            r3 = 8
            r0.b(r1, r3)
            android.os.Parcel r1 = r0.a
            long r2 = r2.longValue()
            r1.writeLong(r2)
            return
    }

    public void writeParcel(int r3, android.os.Parcel r4, boolean r5) {
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            r2.b(r3, r0)
        L8:
            return
        L9:
            int r3 = r2.a(r3)
            android.os.Parcel r5 = r2.a
            int r1 = r4.dataSize()
            r5.appendFrom(r4, r0, r1)
            r2.d(r3)
            return
    }

    public void writeParcelArray(int r6, android.os.Parcel[] r7, boolean r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L9
            if (r8 == 0) goto L8
            r5.b(r6, r0)
        L8:
            return
        L9:
            int r6 = r5.a(r6)
            int r8 = r7.length
            android.os.Parcel r1 = r5.a
            r1.writeInt(r8)
            r1 = 0
        L14:
            if (r1 >= r8) goto L35
            r2 = r7[r1]
            if (r2 == 0) goto L2d
            android.os.Parcel r3 = r5.a
            int r4 = r2.dataSize()
            r3.writeInt(r4)
            android.os.Parcel r3 = r5.a
            int r4 = r2.dataSize()
            r3.appendFrom(r2, r0, r4)
            goto L32
        L2d:
            android.os.Parcel r2 = r5.a
            r2.writeInt(r0)
        L32:
            int r1 = r1 + 1
            goto L14
        L35:
            r5.d(r6)
            return
    }

    public void writeParcelList(int r6, java.util.List<android.os.Parcel> r7, boolean r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L9
            if (r8 == 0) goto L8
            r5.b(r6, r0)
        L8:
            return
        L9:
            int r6 = r5.a(r6)
            int r8 = r7.size()
            android.os.Parcel r1 = r5.a
            r1.writeInt(r8)
            r1 = 0
        L17:
            if (r1 >= r8) goto L3c
            java.lang.Object r2 = r7.get(r1)
            android.os.Parcel r2 = (android.os.Parcel) r2
            if (r2 == 0) goto L34
            android.os.Parcel r3 = r5.a
            int r4 = r2.dataSize()
            r3.writeInt(r4)
            android.os.Parcel r3 = r5.a
            int r4 = r2.dataSize()
            r3.appendFrom(r2, r0, r4)
            goto L39
        L34:
            android.os.Parcel r2 = r5.a
            r2.writeInt(r0)
        L39:
            int r1 = r1 + 1
            goto L17
        L3c:
            r5.d(r6)
            return
    }

    public void writeParcelSparseArray(int r6, android.util.SparseArray<android.os.Parcel> r7, boolean r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L9
            if (r8 == 0) goto L8
            r5.b(r6, r0)
        L8:
            return
        L9:
            int r6 = r5.a(r6)
            int r8 = r7.size()
            android.os.Parcel r1 = r5.a
            r1.writeInt(r8)
            r1 = 0
        L17:
            if (r1 >= r8) goto L45
            android.os.Parcel r2 = r5.a
            int r3 = r7.keyAt(r1)
            r2.writeInt(r3)
            java.lang.Object r2 = r7.valueAt(r1)
            android.os.Parcel r2 = (android.os.Parcel) r2
            if (r2 == 0) goto L3d
            android.os.Parcel r3 = r5.a
            int r4 = r2.dataSize()
            r3.writeInt(r4)
            android.os.Parcel r3 = r5.a
            int r4 = r2.dataSize()
            r3.appendFrom(r2, r0, r4)
            goto L42
        L3d:
            android.os.Parcel r2 = r5.a
            r2.writeInt(r0)
        L42:
            int r1 = r1 + 1
            goto L17
        L45:
            r5.d(r6)
            return
    }

    public void writeParcelable(int r1, android.os.Parcelable r2, int r3, boolean r4) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r4 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r4 = r0.a
            r2.writeToParcel(r4, r3)
            r0.d(r1)
            return
    }

    public void writeShort(int r2, short r3) {
            r1 = this;
            r0 = 4
            r1.b(r2, r0)
            android.os.Parcel r2 = r1.a
            r2.writeInt(r3)
            return
    }

    public void writeSparseBooleanArray(int r1, android.util.SparseBooleanArray r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeSparseBooleanArray(r2)
            r0.d(r1)
            return
    }

    public void writeSparseIntArray(int r4, android.util.SparseIntArray r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L16:
            if (r0 >= r6) goto L2d
            android.os.Parcel r1 = r3.a
            int r2 = r5.keyAt(r0)
            r1.writeInt(r2)
            android.os.Parcel r1 = r3.a
            int r2 = r5.valueAt(r0)
            r1.writeInt(r2)
            int r0 = r0 + 1
            goto L16
        L2d:
            r3.d(r4)
            return
    }

    public void writeSparseLongArray(int r5, android.util.SparseLongArray r6, boolean r7) {
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L9
            if (r7 == 0) goto L8
            r4.b(r5, r0)
        L8:
            return
        L9:
            int r5 = r4.a(r5)
            int r7 = r6.size()
            android.os.Parcel r1 = r4.a
            r1.writeInt(r7)
        L16:
            if (r0 >= r7) goto L2d
            android.os.Parcel r1 = r4.a
            int r2 = r6.keyAt(r0)
            r1.writeInt(r2)
            android.os.Parcel r1 = r4.a
            long r2 = r6.valueAt(r0)
            r1.writeLong(r2)
            int r0 = r0 + 1
            goto L16
        L2d:
            r4.d(r5)
            return
    }

    public void writeString(int r1, java.lang.String r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeString(r2)
            r0.d(r1)
            return
    }

    public void writeStringArray(int r1, java.lang.String[] r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeStringArray(r2)
            r0.d(r1)
            return
    }

    public void writeStringList(int r1, java.util.List<java.lang.String> r2, boolean r3) {
            r0 = this;
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            r0.b(r1, r2)
        L8:
            return
        L9:
            int r1 = r0.a(r1)
            android.os.Parcel r3 = r0.a
            r3.writeStringList(r2)
            r0.d(r1)
            return
    }

    public void writeStringSparseArray(int r4, android.util.SparseArray<java.lang.String> r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
        L16:
            if (r0 >= r6) goto L2f
            android.os.Parcel r1 = r3.a
            int r2 = r5.keyAt(r0)
            r1.writeInt(r2)
            android.os.Parcel r1 = r3.a
            java.lang.Object r2 = r5.valueAt(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.writeString(r2)
            int r0 = r0 + 1
            goto L16
        L2f:
            r3.d(r4)
            return
    }

    public <T extends android.os.Parcelable> void writeTypedArray(int r4, T[] r5, int r6, boolean r7) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r7 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r7 = r5.length
            android.os.Parcel r1 = r3.a
            r1.writeInt(r7)
            r1 = 0
        L14:
            if (r1 >= r7) goto L26
            r2 = r5[r1]
            if (r2 != 0) goto L20
            android.os.Parcel r2 = r3.a
            r2.writeInt(r0)
            goto L23
        L20:
            r3.c(r2, r6)
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            r3.d(r4)
            return
    }

    public <T extends android.os.Parcelable> void writeTypedList(int r4, java.util.List<T> r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            r3.b(r4, r0)
        L8:
            return
        L9:
            int r4 = r3.a(r4)
            int r6 = r5.size()
            android.os.Parcel r1 = r3.a
            r1.writeInt(r6)
            r1 = 0
        L17:
            if (r1 >= r6) goto L2d
            java.lang.Object r2 = r5.get(r1)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            if (r2 != 0) goto L27
            android.os.Parcel r2 = r3.a
            r2.writeInt(r0)
            goto L2a
        L27:
            r3.c(r2, r0)
        L2a:
            int r1 = r1 + 1
            goto L17
        L2d:
            r3.d(r4)
            return
    }

    public <T extends android.os.Parcelable> void writeTypedSparseArray(int r5, android.util.SparseArray<T> r6, boolean r7) {
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L9
            if (r7 == 0) goto L8
            r4.b(r5, r0)
        L8:
            return
        L9:
            int r5 = r4.a(r5)
            int r7 = r6.size()
            android.os.Parcel r1 = r4.a
            r1.writeInt(r7)
            r1 = 0
        L17:
            if (r1 >= r7) goto L36
            android.os.Parcel r2 = r4.a
            int r3 = r6.keyAt(r1)
            r2.writeInt(r3)
            java.lang.Object r2 = r6.valueAt(r1)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            if (r2 != 0) goto L30
            android.os.Parcel r2 = r4.a
            r2.writeInt(r0)
            goto L33
        L30:
            r4.c(r2, r0)
        L33:
            int r1 = r1 + 1
            goto L17
        L36:
            r4.d(r5)
            return
    }
}
