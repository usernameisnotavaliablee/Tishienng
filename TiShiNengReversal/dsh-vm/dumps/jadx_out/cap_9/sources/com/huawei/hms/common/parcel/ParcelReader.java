package com.huawei.hms.common.parcel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ParcelReader {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 65262;
    public java.util.HashMap<java.lang.Integer, java.lang.Integer[]> a;
    public android.os.Parcel b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class ParseException extends java.lang.RuntimeException {
        public final /* synthetic */ com.huawei.hms.common.parcel.ParcelReader a;

        public ParseException(com.huawei.hms.common.parcel.ParcelReader r1, java.lang.String r2, android.os.Parcel r3) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }
    }

    public ParcelReader(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            r1.b = r2
            r1.b()
            return
    }

    private int a(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 <= r0) goto La
            return r0
        La:
            return r2
    }

    private void b() {
            r11 = this;
            android.os.Parcel r0 = r11.b
            int r0 = r0.readInt()
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r0 & r1
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r0 & r3
            if (r4 == r3) goto L15
            int r0 = r0 >> 16
            r0 = r0 & r1
            goto L1b
        L15:
            android.os.Parcel r0 = r11.b
            int r0 = r0.readInt()
        L1b:
            r4 = 65262(0xfeee, float:9.1452E-41)
            if (r2 != r4) goto Lb9
            android.os.Parcel r2 = r11.b
            int r2 = r2.dataPosition()
            int r0 = r0 + r2
            if (r0 < r2) goto L98
            android.os.Parcel r4 = r11.b
            int r4 = r4.dataSize()
            if (r0 > r4) goto L98
        L31:
            android.os.Parcel r2 = r11.b
            int r2 = r2.dataPosition()
            if (r2 >= r0) goto L76
            android.os.Parcel r2 = r11.b
            int r2 = r2.readInt()
            r4 = r2 & r1
            r5 = r2 & r3
            if (r5 == r3) goto L49
            int r2 = r2 >> 16
            r2 = r2 & r1
            goto L4f
        L49:
            android.os.Parcel r2 = r11.b
            int r2 = r2.readInt()
        L4f:
            android.os.Parcel r5 = r11.b
            int r5 = r5.dataPosition()
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r6 = r11.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9 = 2
            java.lang.Integer[] r9 = new java.lang.Integer[r9]
            r10 = 0
            r9[r10] = r7
            r7 = 1
            r9[r7] = r8
            r6.put(r4, r9)
            android.os.Parcel r4 = r11.b
            int r5 = r5 + r2
            r4.setDataPosition(r5)
            goto L31
        L76:
            android.os.Parcel r1 = r11.b
            int r1 = r1.dataPosition()
            if (r1 != r0) goto L7f
            return
        L7f:
            com.huawei.hms.common.parcel.ParcelReader$ParseException r1 = new com.huawei.hms.common.parcel.ParcelReader$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "the dataPosition is not"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.os.Parcel r2 = r11.b
            r1.<init>(r11, r0, r2)
            throw r1
        L98:
            com.huawei.hms.common.parcel.ParcelReader$ParseException r1 = new com.huawei.hms.common.parcel.ParcelReader$ParseException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "invalid size, start="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " end="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.os.Parcel r2 = r11.b
            r1.<init>(r11, r0, r2)
            throw r1
        Lb9:
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            com.huawei.hms.common.parcel.ParcelReader$ParseException r1 = new com.huawei.hms.common.parcel.ParcelReader$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parse header error, not 65262. Got 0x"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.os.Parcel r2 = r11.b
            r1.<init>(r11, r0, r2)
            throw r1
    }

    private void c(int r5, int r6) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r4.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            java.lang.Integer[] r5 = (java.lang.Integer[]) r5
            if (r5 == 0) goto L4a
            r0 = 1
            r5 = r5[r0]
            int r5 = r5.intValue()
            if (r5 != r6) goto L18
            return
        L18:
            java.lang.String r0 = java.lang.Integer.toHexString(r5)
            com.huawei.hms.common.parcel.ParcelReader$ParseException r1 = new com.huawei.hms.common.parcel.ParcelReader$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "the field size is not "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " got "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = " (0x"
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ")"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.os.Parcel r6 = r4.b
            r1.<init>(r4, r5, r6)
            throw r1
        L4a:
            com.huawei.hms.common.parcel.ParcelReader$ParseException r6 = new com.huawei.hms.common.parcel.ParcelReader$ParseException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field is null:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.os.Parcel r0 = r4.b
            r6.<init>(r4, r5, r0)
            throw r6
    }

    private int d(int r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer[] r4 = (java.lang.Integer[]) r4
            if (r4 == 0) goto L22
            android.os.Parcel r0 = r3.b
            r1 = 0
            r1 = r4[r1]
            int r1 = r1.intValue()
            r0.setDataPosition(r1)
            r0 = 1
            r4 = r4[r0]
            int r4 = r4.intValue()
            return r4
        L22:
            com.huawei.hms.common.parcel.ParcelReader$ParseException r0 = new com.huawei.hms.common.parcel.ParcelReader$ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Field is null:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.os.Parcel r1 = r3.b
            r0.<init>(r3, r4, r1)
            throw r0
    }

    private int e(int r4, int r5) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r3.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            if (r0 == 0) goto L1e
            android.os.Parcel r1 = r3.b
            r2 = 0
            r0 = r0[r2]
            int r0 = r0.intValue()
            r1.setDataPosition(r0)
            r3.c(r4, r5)
            return r5
        L1e:
            com.huawei.hms.common.parcel.ParcelReader$ParseException r4 = new com.huawei.hms.common.parcel.ParcelReader$ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Field is null:"
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.os.Parcel r0 = r3.b
            r4.<init>(r3, r5, r0)
            throw r4
    }

    public java.math.BigDecimal createBigDecimal(int r4, java.math.BigDecimal r5) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r3.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r5
        Ld:
            int r4 = r3.d(r4)
            if (r4 != 0) goto L15
            r4 = 0
            return r4
        L15:
            android.os.Parcel r5 = r3.b
            int r5 = r5.dataPosition()
            android.os.Parcel r0 = r3.b
            byte[] r0 = r0.createByteArray()
            android.os.Parcel r1 = r3.b
            int r1 = r1.readInt()
            android.os.Parcel r2 = r3.b
            int r5 = r5 + r4
            r2.setDataPosition(r5)
            java.math.BigDecimal r4 = new java.math.BigDecimal
            java.math.BigInteger r5 = new java.math.BigInteger
            r5.<init>(r0)
            r4.<init>(r5, r1)
            return r4
    }

    public java.math.BigDecimal[] createBigDecimalArray(int r8, java.math.BigDecimal[] r9) {
            r7 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r7.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r9
        Ld:
            int r8 = r7.d(r8)
            if (r8 != 0) goto L15
            r8 = 0
            return r8
        L15:
            android.os.Parcel r9 = r7.b
            int r9 = r9.dataPosition()
            android.os.Parcel r0 = r7.b
            int r0 = r0.readInt()
            int r0 = r7.a(r0)
            java.math.BigDecimal[] r1 = new java.math.BigDecimal[r0]
            r2 = 0
        L28:
            if (r2 >= r0) goto L45
            android.os.Parcel r3 = r7.b
            byte[] r3 = r3.createByteArray()
            android.os.Parcel r4 = r7.b
            int r4 = r4.readInt()
            java.math.BigDecimal r5 = new java.math.BigDecimal
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r3)
            r5.<init>(r6, r4)
            r1[r2] = r5
            int r2 = r2 + 1
            goto L28
        L45:
            android.os.Parcel r0 = r7.b
            int r9 = r9 + r8
            r0.setDataPosition(r9)
            return r1
    }

    public java.math.BigInteger createBigInteger(int r3, java.math.BigInteger r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            byte[] r0 = r0.createByteArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r0)
            return r3
    }

    public java.math.BigInteger[] createBigIntegerArray(int r6, java.math.BigInteger[] r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            android.os.Parcel r0 = r5.b
            int r0 = r0.readInt()
            int r0 = r5.a(r0)
            java.math.BigInteger[] r1 = new java.math.BigInteger[r0]
            r2 = 0
        L28:
            if (r2 >= r0) goto L3a
            java.math.BigInteger r3 = new java.math.BigInteger
            android.os.Parcel r4 = r5.b
            byte[] r4 = r4.createByteArray()
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L28
        L3a:
            android.os.Parcel r0 = r5.b
            int r7 = r7 + r6
            r0.setDataPosition(r7)
            return r1
    }

    public boolean[] createBooleanArray(int r3, boolean[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            boolean[] r0 = r0.createBooleanArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public java.util.ArrayList<java.lang.Boolean> createBooleanList(int r6, java.util.ArrayList<java.lang.Boolean> r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcel r1 = r5.b
            int r1 = r1.readInt()
            int r1 = r5.a(r1)
            r2 = 0
            r3 = 0
        L2c:
            if (r3 >= r1) goto L43
            android.os.Parcel r4 = r5.b
            int r4 = r4.readInt()
            if (r4 == 0) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L2c
        L43:
            android.os.Parcel r1 = r5.b
            int r7 = r7 + r6
            r1.setDataPosition(r7)
            return r0
    }

    public byte[] createByteArray(int r3, byte[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            byte[] r0 = r0.createByteArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public byte[][] createByteArrayArray(int r5, byte[][] r6) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r4.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r6
        Ld:
            int r5 = r4.d(r5)
            if (r5 != 0) goto L15
            r5 = 0
            return r5
        L15:
            android.os.Parcel r6 = r4.b
            int r6 = r6.dataPosition()
            android.os.Parcel r0 = r4.b
            int r0 = r0.readInt()
            int r0 = r4.a(r0)
            byte[][] r1 = new byte[r0][]
            r2 = 0
        L28:
            if (r2 >= r0) goto L35
            android.os.Parcel r3 = r4.b
            byte[] r3 = r3.createByteArray()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L28
        L35:
            android.os.Parcel r0 = r4.b
            int r6 = r6 + r5
            r0.setDataPosition(r6)
            return r1
    }

    public android.util.SparseArray<byte[]> createByteArraySparseArray(int r6, android.util.SparseArray<byte[]> r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            android.os.Parcel r0 = r5.b
            int r0 = r0.readInt()
            int r0 = r5.a(r0)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>(r0)
            r2 = 0
        L2b:
            if (r2 >= r0) goto L3f
            android.os.Parcel r3 = r5.b
            int r3 = r3.readInt()
            android.os.Parcel r4 = r5.b
            byte[] r4 = r4.createByteArray()
            r1.append(r3, r4)
            int r2 = r2 + 1
            goto L2b
        L3f:
            android.os.Parcel r0 = r5.b
            int r7 = r7 + r6
            r0.setDataPosition(r7)
            return r1
    }

    public char[] createCharArray(int r3, char[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            char[] r0 = r0.createCharArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public double[] createDoubleArray(int r3, double[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            double[] r0 = r0.createDoubleArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public java.util.ArrayList<java.lang.Double> createDoubleList(int r6, java.util.ArrayList<java.lang.Double> r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcel r1 = r5.b
            int r1 = r1.readInt()
            int r1 = r5.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L3d
            android.os.Parcel r3 = r5.b
            double r3 = r3.readDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L2b
        L3d:
            android.os.Parcel r1 = r5.b
            int r7 = r7 + r6
            r1.setDataPosition(r7)
            return r0
    }

    public android.util.SparseArray<java.lang.Double> createDoubleSparseArray(int r7, android.util.SparseArray<java.lang.Double> r8) {
            r6 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r6.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r8
        Ld:
            int r7 = r6.d(r7)
            if (r7 != 0) goto L15
            r7 = 0
            return r7
        L15:
            android.os.Parcel r8 = r6.b
            int r8 = r8.dataPosition()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            android.os.Parcel r1 = r6.b
            int r1 = r1.readInt()
            int r1 = r6.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L43
            android.os.Parcel r3 = r6.b
            int r3 = r3.readInt()
            android.os.Parcel r4 = r6.b
            double r4 = r4.readDouble()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r0.append(r3, r4)
            int r2 = r2 + 1
            goto L2b
        L43:
            android.os.Parcel r1 = r6.b
            int r8 = r8 + r7
            r1.setDataPosition(r8)
            return r0
    }

    public float[] createFloatArray(int r3, float[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            float[] r0 = r0.createFloatArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public java.util.ArrayList<java.lang.Float> createFloatList(int r5, java.util.ArrayList<java.lang.Float> r6) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r4.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r6
        Ld:
            int r5 = r4.d(r5)
            if (r5 != 0) goto L15
            r5 = 0
            return r5
        L15:
            android.os.Parcel r6 = r4.b
            int r6 = r6.dataPosition()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcel r1 = r4.b
            int r1 = r1.readInt()
            int r1 = r4.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L3d
            android.os.Parcel r3 = r4.b
            float r3 = r3.readFloat()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L2b
        L3d:
            android.os.Parcel r1 = r4.b
            int r6 = r6 + r5
            r1.setDataPosition(r6)
            return r0
    }

    public android.util.SparseArray<java.lang.Float> createFloatSparseArray(int r6, android.util.SparseArray<java.lang.Float> r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            android.os.Parcel r1 = r5.b
            int r1 = r1.readInt()
            int r1 = r5.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L43
            android.os.Parcel r3 = r5.b
            int r3 = r3.readInt()
            android.os.Parcel r4 = r5.b
            float r4 = r4.readFloat()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.append(r3, r4)
            int r2 = r2 + 1
            goto L2b
        L43:
            android.os.Parcel r1 = r5.b
            int r7 = r7 + r6
            r1.setDataPosition(r7)
            return r0
    }

    public android.os.IBinder[] createIBinderArray(int r3, android.os.IBinder[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            android.os.IBinder[] r0 = r0.createBinderArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public java.util.ArrayList<android.os.IBinder> createIBinderList(int r3, java.util.ArrayList<android.os.IBinder> r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            java.util.ArrayList r0 = r0.createBinderArrayList()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public android.util.SparseArray<android.os.IBinder> createIBinderSparseArray(int r6, android.util.SparseArray<android.os.IBinder> r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            android.os.Parcel r0 = r5.b
            int r0 = r0.readInt()
            int r0 = r5.a(r0)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>(r0)
            r2 = 0
        L2b:
            if (r2 >= r0) goto L3f
            android.os.Parcel r3 = r5.b
            int r3 = r3.readInt()
            android.os.Parcel r4 = r5.b
            android.os.IBinder r4 = r4.readStrongBinder()
            r1.append(r3, r4)
            int r2 = r2 + 1
            goto L2b
        L3f:
            android.os.Parcel r0 = r5.b
            int r7 = r7 + r6
            r0.setDataPosition(r7)
            return r1
    }

    public int[] createIntArray(int r3, int[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            int[] r0 = r0.createIntArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> createIntegerList(int r5, java.util.ArrayList<java.lang.Integer> r6) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r4.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r6
        Ld:
            int r5 = r4.d(r5)
            if (r5 != 0) goto L15
            r5 = 0
            return r5
        L15:
            android.os.Parcel r6 = r4.b
            int r6 = r6.dataPosition()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcel r1 = r4.b
            int r1 = r1.readInt()
            int r1 = r4.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L3d
            android.os.Parcel r3 = r4.b
            int r3 = r3.readInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L2b
        L3d:
            android.os.Parcel r1 = r4.b
            int r6 = r6 + r5
            r1.setDataPosition(r6)
            return r0
    }

    public long[] createLongArray(int r3, long[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            long[] r0 = r0.createLongArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public java.util.ArrayList<java.lang.Long> createLongList(int r6, java.util.ArrayList<java.lang.Long> r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcel r1 = r5.b
            int r1 = r1.readInt()
            int r1 = r5.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L3d
            android.os.Parcel r3 = r5.b
            long r3 = r3.readLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L2b
        L3d:
            android.os.Parcel r1 = r5.b
            int r7 = r7 + r6
            r1.setDataPosition(r7)
            return r0
    }

    public android.os.Parcel createParcel(int r3, android.os.Parcel r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = r2.b
            r0.appendFrom(r1, r4, r3)
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public android.os.Parcel[] createParcelArray(int r9, android.os.Parcel[] r10) {
            r8 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r8.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r10
        Ld:
            int r9 = r8.d(r9)
            r10 = 0
            if (r9 != 0) goto L15
            return r10
        L15:
            android.os.Parcel r0 = r8.b
            int r0 = r0.dataPosition()
            android.os.Parcel r1 = r8.b
            int r1 = r1.readInt()
            int r1 = r8.a(r1)
            android.os.Parcel[] r2 = new android.os.Parcel[r1]
            r3 = 0
        L28:
            if (r3 >= r1) goto L4f
            android.os.Parcel r4 = r8.b
            int r4 = r4.readInt()
            if (r4 == 0) goto L4a
            android.os.Parcel r5 = r8.b
            int r5 = r5.dataPosition()
            android.os.Parcel r6 = android.os.Parcel.obtain()
            android.os.Parcel r7 = r8.b
            r6.appendFrom(r7, r5, r4)
            r2[r3] = r6
            android.os.Parcel r6 = r8.b
            int r5 = r5 + r4
            r6.setDataPosition(r5)
            goto L4c
        L4a:
            r2[r3] = r10
        L4c:
            int r3 = r3 + 1
            goto L28
        L4f:
            android.os.Parcel r10 = r8.b
            int r0 = r0 + r9
            r10.setDataPosition(r0)
            return r2
    }

    public java.util.ArrayList<android.os.Parcel> createParcelList(int r9, java.util.ArrayList<android.os.Parcel> r10) {
            r8 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r8.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r10
        Ld:
            int r9 = r8.d(r9)
            r10 = 0
            if (r9 != 0) goto L15
            return r10
        L15:
            android.os.Parcel r0 = r8.b
            int r0 = r0.dataPosition()
            android.os.Parcel r1 = r8.b
            int r1 = r1.readInt()
            int r1 = r8.a(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L2b:
            if (r3 >= r1) goto L54
            android.os.Parcel r4 = r8.b
            int r4 = r4.readInt()
            if (r4 == 0) goto L4e
            android.os.Parcel r5 = r8.b
            int r5 = r5.dataPosition()
            android.os.Parcel r6 = android.os.Parcel.obtain()
            android.os.Parcel r7 = r8.b
            r6.appendFrom(r7, r5, r4)
            r2.add(r6)
            android.os.Parcel r6 = r8.b
            int r5 = r5 + r4
            r6.setDataPosition(r5)
            goto L51
        L4e:
            r2.add(r10)
        L51:
            int r3 = r3 + 1
            goto L2b
        L54:
            android.os.Parcel r10 = r8.b
            int r0 = r0 + r9
            r10.setDataPosition(r0)
            return r2
    }

    public android.util.SparseArray<android.os.Parcel> createParcelSparseArray(int r10, android.util.SparseArray<android.os.Parcel> r11) {
            r9 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r9.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r11
        Ld:
            int r10 = r9.d(r10)
            r11 = 0
            if (r10 != 0) goto L15
            return r11
        L15:
            android.os.Parcel r0 = r9.b
            int r0 = r0.dataPosition()
            android.os.Parcel r1 = r9.b
            int r1 = r1.readInt()
            int r1 = r9.a(r1)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r3 = 0
        L2b:
            if (r3 >= r1) goto L5a
            android.os.Parcel r4 = r9.b
            int r4 = r4.readInt()
            android.os.Parcel r5 = r9.b
            int r5 = r5.readInt()
            if (r5 == 0) goto L54
            android.os.Parcel r6 = r9.b
            int r6 = r6.dataPosition()
            android.os.Parcel r7 = android.os.Parcel.obtain()
            android.os.Parcel r8 = r9.b
            r7.appendFrom(r8, r6, r5)
            r2.append(r4, r7)
            android.os.Parcel r4 = r9.b
            int r6 = r6 + r5
            r4.setDataPosition(r6)
            goto L57
        L54:
            r2.append(r4, r11)
        L57:
            int r3 = r3 + 1
            goto L2b
        L5a:
            android.os.Parcel r11 = r9.b
            int r0 = r0 + r10
            r11.setDataPosition(r0)
            return r2
    }

    public android.util.SparseBooleanArray createSparseBooleanArray(int r3, android.util.SparseBooleanArray r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            android.util.SparseBooleanArray r0 = r0.readSparseBooleanArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public android.util.SparseIntArray createSparseIntArray(int r6, android.util.SparseIntArray r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            android.os.Parcel r1 = r5.b
            int r1 = r1.readInt()
            int r1 = r5.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L3f
            android.os.Parcel r3 = r5.b
            int r3 = r3.readInt()
            android.os.Parcel r4 = r5.b
            int r4 = r4.readInt()
            r0.append(r3, r4)
            int r2 = r2 + 1
            goto L2b
        L3f:
            android.os.Parcel r1 = r5.b
            int r7 = r7 + r6
            r1.setDataPosition(r7)
            return r0
    }

    public android.util.SparseLongArray createSparseLongArray(int r7, android.util.SparseLongArray r8) {
            r6 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r6.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r8
        Ld:
            int r7 = r6.d(r7)
            if (r7 != 0) goto L15
            r7 = 0
            return r7
        L15:
            android.os.Parcel r8 = r6.b
            int r8 = r8.dataPosition()
            android.util.SparseLongArray r0 = new android.util.SparseLongArray
            r0.<init>()
            android.os.Parcel r1 = r6.b
            int r1 = r1.readInt()
            int r1 = r6.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L3f
            android.os.Parcel r3 = r6.b
            int r3 = r3.readInt()
            android.os.Parcel r4 = r6.b
            long r4 = r4.readLong()
            r0.append(r3, r4)
            int r2 = r2 + 1
            goto L2b
        L3f:
            android.os.Parcel r1 = r6.b
            int r8 = r8 + r7
            r1.setDataPosition(r8)
            return r0
    }

    public java.lang.String createString(int r3, java.lang.String r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            java.lang.String r0 = r0.readString()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public java.lang.String[] createStringArray(int r3, java.lang.String[] r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            java.lang.String[] r0 = r0.createStringArray()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public java.util.ArrayList<java.lang.String> createStringList(int r3, java.util.ArrayList<java.lang.String> r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            java.util.ArrayList r0 = r0.createStringArrayList()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public android.util.SparseArray<java.lang.String> createStringSparseArray(int r6, android.util.SparseArray<java.lang.String> r7) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r6 = r5.d(r6)
            if (r6 != 0) goto L15
            r6 = 0
            return r6
        L15:
            android.os.Parcel r7 = r5.b
            int r7 = r7.dataPosition()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            android.os.Parcel r1 = r5.b
            int r1 = r1.readInt()
            int r1 = r5.a(r1)
            r2 = 0
        L2b:
            if (r2 >= r1) goto L3f
            android.os.Parcel r3 = r5.b
            int r3 = r3.readInt()
            android.os.Parcel r4 = r5.b
            java.lang.String r4 = r4.readString()
            r0.append(r3, r4)
            int r2 = r2 + 1
            goto L2b
        L3f:
            android.os.Parcel r1 = r5.b
            int r7 = r7 + r6
            r1.setDataPosition(r7)
            return r0
    }

    public <T> T[] createTypedArray(int r3, android.os.Parcelable.Creator<T> r4, T[] r5) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r5
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r5 = r2.b
            int r5 = r5.dataPosition()
            android.os.Parcel r0 = r2.b
            java.lang.Object[] r4 = r0.createTypedArray(r4)
            android.os.Parcel r0 = r2.b
            int r5 = r5 + r3
            r0.setDataPosition(r5)
            return r4
    }

    public <T> java.util.ArrayList<T> createTypedList(int r3, android.os.Parcelable.Creator<T> r4, java.util.ArrayList<T> r5) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r5
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r5 = r2.b
            int r5 = r5.dataPosition()
            android.os.Parcel r0 = r2.b
            java.util.ArrayList r4 = r0.createTypedArrayList(r4)
            android.os.Parcel r0 = r2.b
            int r5 = r5 + r3
            r0.setDataPosition(r5)
            return r4
    }

    public <T> android.util.SparseArray<T> createTypedSparseArray(int r7, android.os.Parcelable.Creator<T> r8, android.util.SparseArray<T> r9) {
            r6 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r6.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r9
        Ld:
            int r7 = r6.d(r7)
            r9 = 0
            if (r7 != 0) goto L15
            return r9
        L15:
            android.os.Parcel r0 = r6.b
            int r0 = r0.dataPosition()
            android.os.Parcel r1 = r6.b
            int r1 = r1.readInt()
            int r1 = r6.a(r1)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r3 = 0
        L2b:
            if (r3 >= r1) goto L49
            android.os.Parcel r4 = r6.b
            int r4 = r4.readInt()
            android.os.Parcel r5 = r6.b
            int r5 = r5.readInt()
            if (r5 == 0) goto L42
            android.os.Parcel r5 = r6.b
            java.lang.Object r5 = r8.createFromParcel(r5)
            goto L43
        L42:
            r5 = r9
        L43:
            r2.append(r4, r5)
            int r3 = r3 + 1
            goto L2b
        L49:
            android.os.Parcel r8 = r6.b
            int r0 = r0 + r7
            r8.setDataPosition(r0)
            return r2
    }

    public boolean readBoolean(int r3, boolean r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            r4 = 4
            r2.e(r3, r4)
            android.os.Parcel r3 = r2.b
            int r3 = r3.readInt()
            if (r3 == 0) goto L1b
            r3 = 1
            return r3
        L1b:
            r3 = 0
            return r3
    }

    public java.lang.Boolean readBooleanObject(int r3, java.lang.Boolean r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r4 = r2.d(r3)
            r0 = 0
            if (r4 != 0) goto L15
            return r0
        L15:
            r4 = 4
            r2.c(r3, r4)
            android.os.Parcel r3 = r2.b
            int r3 = r3.readInt()
            if (r3 == 0) goto L28
            r4 = 1
            if (r3 == r4) goto L25
            return r0
        L25:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L28:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
    }

    public android.os.Bundle readBundle(int r3, android.os.Bundle r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            android.os.Bundle r0 = r0.readBundle()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public byte readByte(int r3, byte r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            r4 = 4
            r2.e(r3, r4)
            android.os.Parcel r3 = r2.b
            int r3 = r3.readInt()
            byte r3 = (byte) r3
            return r3
    }

    public char readChar(int r3, char r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            r4 = 4
            r2.e(r3, r4)
            android.os.Parcel r3 = r2.b
            int r3 = r3.readInt()
            char r3 = (char) r3
            return r3
    }

    public double readDouble(int r3, double r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            r4 = 8
            r2.e(r3, r4)
            android.os.Parcel r3 = r2.b
            double r3 = r3.readDouble()
            return r3
    }

    public java.lang.Double readDoubleObject(int r3, java.lang.Double r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            r4 = 8
            r2.c(r3, r4)
            android.os.Parcel r3 = r2.b
            double r3 = r3.readDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            return r3
    }

    public float readFloat(int r3, float r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            r4 = 4
            r2.e(r3, r4)
            android.os.Parcel r3 = r2.b
            float r3 = r3.readFloat()
            return r3
    }

    public java.lang.Float readFloatObject(int r3, java.lang.Float r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r4 = r2.d(r3)
            if (r4 != 0) goto L15
            r3 = 0
            return r3
        L15:
            r4 = 4
            r2.c(r3, r4)
            android.os.Parcel r3 = r2.b
            float r3 = r3.readFloat()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
    }

    public android.os.IBinder readIBinder(int r3, android.os.IBinder r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r4 = r2.b
            int r4 = r4.dataPosition()
            android.os.Parcel r0 = r2.b
            android.os.IBinder r0 = r0.readStrongBinder()
            android.os.Parcel r1 = r2.b
            int r4 = r4 + r3
            r1.setDataPosition(r4)
            return r0
    }

    public int readInt(int r3, int r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            r4 = 4
            r2.e(r3, r4)
            android.os.Parcel r3 = r2.b
            int r3 = r3.readInt()
            return r3
    }

    public java.lang.Integer readIntegerObject(int r3, java.lang.Integer r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            r4 = 4
            r2.c(r3, r4)
            android.os.Parcel r3 = r2.b
            int r3 = r3.readInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }

    public void readList(int r3, java.util.List r4, java.lang.ClassLoader r5) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            goto L24
        Ld:
            int r3 = r2.d(r3)
            android.os.Parcel r0 = r2.b
            int r0 = r0.dataPosition()
            if (r3 == 0) goto L24
            android.os.Parcel r1 = r2.b
            r1.readList(r4, r5)
            android.os.Parcel r4 = r2.b
            int r0 = r0 + r3
            r4.setDataPosition(r0)
        L24:
            return
    }

    public long readLong(int r3, long r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            r4 = 8
            r2.e(r3, r4)
            android.os.Parcel r3 = r2.b
            long r3 = r3.readLong()
            return r3
    }

    public java.lang.Long readLongObject(int r3, java.lang.Long r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            r4 = 8
            r2.c(r3, r4)
            android.os.Parcel r3 = r2.b
            long r3 = r3.readLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
    }

    public <T extends android.os.Parcelable> T readParcelable(int r3, android.os.Parcelable.Creator<T> r4, T r5) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r5
        Ld:
            int r3 = r2.d(r3)
            if (r3 != 0) goto L15
            r3 = 0
            return r3
        L15:
            android.os.Parcel r5 = r2.b
            int r5 = r5.dataPosition()
            android.os.Parcel r0 = r2.b
            java.lang.Object r4 = r4.createFromParcel(r0)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            android.os.Parcel r0 = r2.b
            int r5 = r5 + r3
            r0.setDataPosition(r5)
            return r4
    }

    public short readShort(int r3, short r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            return r4
        Ld:
            r4 = 4
            r2.e(r3, r4)
            android.os.Parcel r3 = r2.b
            int r3 = r3.readInt()
            short r3 = (short) r3
            return r3
    }
}
