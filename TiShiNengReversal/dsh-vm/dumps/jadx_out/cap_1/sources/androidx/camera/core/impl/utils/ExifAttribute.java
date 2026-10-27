package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ExifAttribute {
    static final java.nio.charset.Charset ASCII = null;
    public static final long BYTES_OFFSET_UNKNOWN = -1;
    static final byte[] EXIF_ASCII_PREFIX = null;
    static final int IFD_FORMAT_BYTE = 1;
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = null;
    static final int IFD_FORMAT_DOUBLE = 12;
    static final java.lang.String[] IFD_FORMAT_NAMES = null;
    static final int IFD_FORMAT_SBYTE = 6;
    static final int IFD_FORMAT_SINGLE = 11;
    static final int IFD_FORMAT_SLONG = 9;
    static final int IFD_FORMAT_SRATIONAL = 10;
    static final int IFD_FORMAT_SSHORT = 8;
    static final int IFD_FORMAT_STRING = 2;
    static final int IFD_FORMAT_ULONG = 4;
    static final int IFD_FORMAT_UNDEFINED = 7;
    static final int IFD_FORMAT_URATIONAL = 5;
    static final int IFD_FORMAT_USHORT = 3;
    private static final java.lang.String TAG = "ExifAttribute";
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            androidx.camera.core.impl.utils.ExifAttribute.ASCII = r0
            java.lang.String r13 = "DOUBLE"
            java.lang.String r14 = "IFD"
            java.lang.String r1 = ""
            java.lang.String r2 = "BYTE"
            java.lang.String r3 = "STRING"
            java.lang.String r4 = "USHORT"
            java.lang.String r5 = "ULONG"
            java.lang.String r6 = "URATIONAL"
            java.lang.String r7 = "SBYTE"
            java.lang.String r8 = "UNDEFINED"
            java.lang.String r9 = "SSHORT"
            java.lang.String r10 = "SLONG"
            java.lang.String r11 = "SRATIONAL"
            java.lang.String r12 = "SINGLE"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_NAMES = r0
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1} // fill-array
            androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT = r0
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [65, 83, 67, 73, 73, 0, 0, 0} // fill-array
            androidx.camera.core.impl.utils.ExifAttribute.EXIF_ASCII_PREFIX = r0
            return
    }

    ExifAttribute(int r1, int r2, long r3, byte[] r5) {
            r0 = this;
            r0.<init>()
            r0.format = r1
            r0.numberOfComponents = r2
            r0.bytesOffset = r3
            r0.bytes = r5
            return
    }

    ExifAttribute(int r7, int r8, byte[] r9) {
            r6 = this;
            r3 = -1
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createByte(@androidx.annotation.NonNull java.lang.String r5) {
            int r0 = r5.length()
            r1 = 1
            if (r0 != r1) goto L28
            r0 = 0
            char r2 = r5.charAt(r0)
            r3 = 48
            if (r2 < r3) goto L28
            char r2 = r5.charAt(r0)
            r4 = 49
            if (r2 > r4) goto L28
            char r5 = r5.charAt(r0)
            int r5 = r5 - r3
            byte r5 = (byte) r5
            byte[] r2 = new byte[r1]
            r2[r0] = r5
            androidx.camera.core.impl.utils.ExifAttribute r5 = new androidx.camera.core.impl.utils.ExifAttribute
            r5.<init>(r1, r1, r2)
            return r5
        L28:
            java.nio.charset.Charset r0 = androidx.camera.core.impl.utils.ExifAttribute.ASCII
            byte[] r5 = r5.getBytes(r0)
            androidx.camera.core.impl.utils.ExifAttribute r0 = new androidx.camera.core.impl.utils.ExifAttribute
            int r2 = r5.length
            r0.<init>(r1, r2, r5)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createDouble(double r2, @androidx.annotation.NonNull java.nio.ByteOrder r4) {
            r0 = 1
            double[] r0 = new double[r0]
            r1 = 0
            r0[r1] = r2
            androidx.camera.core.impl.utils.ExifAttribute r2 = createDouble(r0, r4)
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createDouble(@androidx.annotation.NonNull double[] r5, @androidx.annotation.NonNull java.nio.ByteOrder r6) {
            int[] r0 = androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT
            r1 = 12
            r0 = r0[r1]
            int r2 = r5.length
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.order(r6)
            int r6 = r5.length
            r2 = 0
        L14:
            if (r2 >= r6) goto L1e
            r3 = r5[r2]
            r0.putDouble(r3)
            int r2 = r2 + 1
            goto L14
        L1e:
            androidx.camera.core.impl.utils.ExifAttribute r6 = new androidx.camera.core.impl.utils.ExifAttribute
            int r5 = r5.length
            byte[] r0 = r0.array()
            r6.<init>(r1, r5, r0)
            return r6
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createSLong(int r0, @androidx.annotation.NonNull java.nio.ByteOrder r1) {
            int[] r0 = new int[]{r0}
            androidx.camera.core.impl.utils.ExifAttribute r0 = createSLong(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createSLong(@androidx.annotation.NonNull int[] r4, @androidx.annotation.NonNull java.nio.ByteOrder r5) {
            int[] r0 = androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT
            r1 = 9
            r0 = r0[r1]
            int r2 = r4.length
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.order(r5)
            int r5 = r4.length
            r2 = 0
        L14:
            if (r2 >= r5) goto L1e
            r3 = r4[r2]
            r0.putInt(r3)
            int r2 = r2 + 1
            goto L14
        L1e:
            androidx.camera.core.impl.utils.ExifAttribute r5 = new androidx.camera.core.impl.utils.ExifAttribute
            int r4 = r4.length
            byte[] r0 = r0.array()
            r5.<init>(r1, r4, r0)
            return r5
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createSRational(@androidx.annotation.NonNull androidx.camera.core.impl.utils.LongRational r2, @androidx.annotation.NonNull java.nio.ByteOrder r3) {
            r0 = 1
            androidx.camera.core.impl.utils.LongRational[] r0 = new androidx.camera.core.impl.utils.LongRational[r0]
            r1 = 0
            r0[r1] = r2
            androidx.camera.core.impl.utils.ExifAttribute r2 = createSRational(r0, r3)
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createSRational(@androidx.annotation.NonNull androidx.camera.core.impl.utils.LongRational[] r6, @androidx.annotation.NonNull java.nio.ByteOrder r7) {
            int[] r0 = androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT
            r1 = 10
            r0 = r0[r1]
            int r2 = r6.length
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.order(r7)
            int r7 = r6.length
            r2 = 0
        L14:
            if (r2 >= r7) goto L2b
            r3 = r6[r2]
            long r4 = r3.getNumerator()
            int r5 = (int) r4
            r0.putInt(r5)
            long r3 = r3.getDenominator()
            int r4 = (int) r3
            r0.putInt(r4)
            int r2 = r2 + 1
            goto L14
        L2b:
            androidx.camera.core.impl.utils.ExifAttribute r7 = new androidx.camera.core.impl.utils.ExifAttribute
            int r6 = r6.length
            byte[] r0 = r0.array()
            r7.<init>(r1, r6, r0)
            return r7
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createString(@androidx.annotation.NonNull java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 0
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.nio.charset.Charset r0 = androidx.camera.core.impl.utils.ExifAttribute.ASCII
            byte[] r3 = r3.getBytes(r0)
            androidx.camera.core.impl.utils.ExifAttribute r0 = new androidx.camera.core.impl.utils.ExifAttribute
            r1 = 2
            int r2 = r3.length
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createULong(long r2, @androidx.annotation.NonNull java.nio.ByteOrder r4) {
            r0 = 1
            long[] r0 = new long[r0]
            r1 = 0
            r0[r1] = r2
            androidx.camera.core.impl.utils.ExifAttribute r2 = createULong(r0, r4)
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createULong(@androidx.annotation.NonNull long[] r5, @androidx.annotation.NonNull java.nio.ByteOrder r6) {
            int[] r0 = androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT
            r1 = 4
            r0 = r0[r1]
            int r2 = r5.length
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.order(r6)
            int r6 = r5.length
            r2 = 0
        L13:
            if (r2 >= r6) goto L1e
            r3 = r5[r2]
            int r4 = (int) r3
            r0.putInt(r4)
            int r2 = r2 + 1
            goto L13
        L1e:
            androidx.camera.core.impl.utils.ExifAttribute r6 = new androidx.camera.core.impl.utils.ExifAttribute
            int r5 = r5.length
            byte[] r0 = r0.array()
            r6.<init>(r1, r5, r0)
            return r6
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createURational(@androidx.annotation.NonNull androidx.camera.core.impl.utils.LongRational r2, @androidx.annotation.NonNull java.nio.ByteOrder r3) {
            r0 = 1
            androidx.camera.core.impl.utils.LongRational[] r0 = new androidx.camera.core.impl.utils.LongRational[r0]
            r1 = 0
            r0[r1] = r2
            androidx.camera.core.impl.utils.ExifAttribute r2 = createURational(r0, r3)
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createURational(@androidx.annotation.NonNull androidx.camera.core.impl.utils.LongRational[] r6, @androidx.annotation.NonNull java.nio.ByteOrder r7) {
            int[] r0 = androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT
            r1 = 5
            r0 = r0[r1]
            int r2 = r6.length
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.order(r7)
            int r7 = r6.length
            r2 = 0
        L13:
            if (r2 >= r7) goto L2a
            r3 = r6[r2]
            long r4 = r3.getNumerator()
            int r5 = (int) r4
            r0.putInt(r5)
            long r3 = r3.getDenominator()
            int r4 = (int) r3
            r0.putInt(r4)
            int r2 = r2 + 1
            goto L13
        L2a:
            androidx.camera.core.impl.utils.ExifAttribute r7 = new androidx.camera.core.impl.utils.ExifAttribute
            int r6 = r6.length
            byte[] r0 = r0.array()
            r7.<init>(r1, r6, r0)
            return r7
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createUShort(int r0, @androidx.annotation.NonNull java.nio.ByteOrder r1) {
            int[] r0 = new int[]{r0}
            androidx.camera.core.impl.utils.ExifAttribute r0 = createUShort(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.ExifAttribute createUShort(@androidx.annotation.NonNull int[] r4, @androidx.annotation.NonNull java.nio.ByteOrder r5) {
            int[] r0 = androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT
            r1 = 3
            r0 = r0[r1]
            int r2 = r4.length
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.order(r5)
            int r5 = r4.length
            r2 = 0
        L13:
            if (r2 >= r5) goto L1e
            r3 = r4[r2]
            short r3 = (short) r3
            r0.putShort(r3)
            int r2 = r2 + 1
            goto L13
        L1e:
            androidx.camera.core.impl.utils.ExifAttribute r5 = new androidx.camera.core.impl.utils.ExifAttribute
            int r4 = r4.length
            byte[] r0 = r0.array()
            r5.<init>(r1, r4, r0)
            return r5
    }

    public double getDoubleValue(@androidx.annotation.NonNull java.nio.ByteOrder r5) {
            r4 = this;
            java.lang.Object r5 = r4.getValue(r5)
            if (r5 == 0) goto L6b
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L11
            java.lang.String r5 = (java.lang.String) r5
            double r0 = java.lang.Double.parseDouble(r5)
            return r0
        L11:
            boolean r0 = r5 instanceof long[]
            java.lang.String r1 = "There are more than one component"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L28
            long[] r5 = (long[]) r5
            int r0 = r5.length
            if (r0 != r3) goto L22
            r0 = r5[r2]
            double r0 = (double) r0
            return r0
        L22:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            r5.<init>(r1)
            throw r5
        L28:
            boolean r0 = r5 instanceof int[]
            if (r0 == 0) goto L3b
            int[] r5 = (int[]) r5
            int r0 = r5.length
            if (r0 != r3) goto L35
            r5 = r5[r2]
            double r0 = (double) r5
            return r0
        L35:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            r5.<init>(r1)
            throw r5
        L3b:
            boolean r0 = r5 instanceof double[]
            if (r0 == 0) goto L4d
            double[] r5 = (double[]) r5
            int r0 = r5.length
            if (r0 != r3) goto L47
            r0 = r5[r2]
            return r0
        L47:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            r5.<init>(r1)
            throw r5
        L4d:
            boolean r0 = r5 instanceof androidx.camera.core.impl.utils.LongRational[]
            if (r0 == 0) goto L63
            androidx.camera.core.impl.utils.LongRational[] r5 = (androidx.camera.core.impl.utils.LongRational[]) r5
            int r0 = r5.length
            if (r0 != r3) goto L5d
            r5 = r5[r2]
            double r0 = r5.toDouble()
            return r0
        L5d:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            r5.<init>(r1)
            throw r5
        L63:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r0 = "Couldn't find a double value"
            r5.<init>(r0)
            throw r5
        L6b:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r0 = "NULL can't be converted to a double value"
            r5.<init>(r0)
            throw r5
    }

    public int getIntValue(@androidx.annotation.NonNull java.nio.ByteOrder r5) {
            r4 = this;
            java.lang.Object r5 = r4.getValue(r5)
            if (r5 == 0) goto L42
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L11
            java.lang.String r5 = (java.lang.String) r5
            int r5 = java.lang.Integer.parseInt(r5)
            return r5
        L11:
            boolean r0 = r5 instanceof long[]
            java.lang.String r1 = "There are more than one component"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L28
            long[] r5 = (long[]) r5
            int r0 = r5.length
            if (r0 != r3) goto L22
            r0 = r5[r2]
            int r5 = (int) r0
            return r5
        L22:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            r5.<init>(r1)
            throw r5
        L28:
            boolean r0 = r5 instanceof int[]
            if (r0 == 0) goto L3a
            int[] r5 = (int[]) r5
            int r0 = r5.length
            if (r0 != r3) goto L34
            r5 = r5[r2]
            return r5
        L34:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            r5.<init>(r1)
            throw r5
        L3a:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r0 = "Couldn't find a integer value"
            r5.<init>(r0)
            throw r5
        L42:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r0 = "NULL can't be converted to a integer value"
            r5.<init>(r0)
            throw r5
    }

    @androidx.annotation.Nullable
    public java.lang.String getStringValue(@androidx.annotation.NonNull java.nio.ByteOrder r8) {
            r7 = this;
            java.lang.Object r8 = r7.getValue(r8)
            r0 = 0
            if (r8 != 0) goto L8
            return r0
        L8:
            boolean r1 = r8 instanceof java.lang.String
            if (r1 == 0) goto Lf
            java.lang.String r8 = (java.lang.String) r8
            return r8
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r8 instanceof long[]
            java.lang.String r3 = ","
            r4 = 0
            if (r2 == 0) goto L33
            long[] r8 = (long[]) r8
        L1d:
            int r0 = r8.length
            if (r4 >= r0) goto L2e
            r5 = r8[r4]
            r1.append(r5)
            int r4 = r4 + 1
            int r0 = r8.length
            if (r4 == r0) goto L1d
            r1.append(r3)
            goto L1d
        L2e:
            java.lang.String r8 = r1.toString()
            return r8
        L33:
            boolean r2 = r8 instanceof int[]
            if (r2 == 0) goto L4f
            int[] r8 = (int[]) r8
        L39:
            int r0 = r8.length
            if (r4 >= r0) goto L4a
            r0 = r8[r4]
            r1.append(r0)
            int r4 = r4 + 1
            int r0 = r8.length
            if (r4 == r0) goto L39
            r1.append(r3)
            goto L39
        L4a:
            java.lang.String r8 = r1.toString()
            return r8
        L4f:
            boolean r2 = r8 instanceof double[]
            if (r2 == 0) goto L6b
            double[] r8 = (double[]) r8
        L55:
            int r0 = r8.length
            if (r4 >= r0) goto L66
            r5 = r8[r4]
            r1.append(r5)
            int r4 = r4 + 1
            int r0 = r8.length
            if (r4 == r0) goto L55
            r1.append(r3)
            goto L55
        L66:
            java.lang.String r8 = r1.toString()
            return r8
        L6b:
            boolean r2 = r8 instanceof androidx.camera.core.impl.utils.LongRational[]
            if (r2 == 0) goto L99
            androidx.camera.core.impl.utils.LongRational[] r8 = (androidx.camera.core.impl.utils.LongRational[]) r8
        L71:
            int r0 = r8.length
            if (r4 >= r0) goto L94
            r0 = r8[r4]
            long r5 = r0.getNumerator()
            r1.append(r5)
            r0 = 47
            r1.append(r0)
            r0 = r8[r4]
            long r5 = r0.getDenominator()
            r1.append(r5)
            int r4 = r4 + 1
            int r0 = r8.length
            if (r4 == r0) goto L71
            r1.append(r3)
            goto L71
        L94:
            java.lang.String r8 = r1.toString()
            return r8
        L99:
            return r0
    }

    java.lang.Object getValue(java.nio.ByteOrder r11) {
            r10 = this;
            java.lang.String r0 = "IOException occurred while closing InputStream"
            java.lang.String r1 = "ExifAttribute"
            r2 = 0
            androidx.camera.core.impl.utils.ByteOrderedDataInputStream r3 = new androidx.camera.core.impl.utils.ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L136 java.io.IOException -> L138
            byte[] r4 = r10.bytes     // Catch: java.lang.Throwable -> L136 java.io.IOException -> L138
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L136 java.io.IOException -> L138
            r3.setByteOrder(r11)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r11 = r10.format     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r4 = 0
            switch(r11) {
                case 1: goto L10c;
                case 2: goto Lcb;
                case 3: goto Lba;
                case 4: goto La9;
                case 5: goto L8f;
                case 6: goto L10c;
                case 7: goto Lcb;
                case 8: goto L7e;
                case 9: goto L6d;
                case 10: goto L51;
                case 11: goto L3f;
                case 12: goto L1e;
                default: goto L15;
            }
        L15:
            r3.close()     // Catch: java.io.IOException -> L19
            return r2
        L19:
            r11 = move-exception
            androidx.camera.core.Logger.e(r1, r0, r11)
            return r2
        L1e:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            double[] r11 = new double[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L22:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L36
            double r5 = r3.readDouble()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11[r4] = r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r4 = r4 + 1
            goto L22
        L2f:
            r11 = move-exception
            r2 = r3
            goto L14a
        L33:
            r11 = move-exception
            goto L13a
        L36:
            r3.close()     // Catch: java.io.IOException -> L3a
            return r11
        L3a:
            r2 = move-exception
            androidx.camera.core.Logger.e(r1, r0, r2)
            return r11
        L3f:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            double[] r11 = new double[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L43:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L36
            float r5 = r3.readFloat()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11[r4] = r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r4 = r4 + 1
            goto L43
        L51:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            androidx.camera.core.impl.utils.LongRational[] r11 = new androidx.camera.core.impl.utils.LongRational[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L55:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L36
            int r5 = r3.readInt()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            androidx.camera.core.impl.utils.LongRational r9 = new androidx.camera.core.impl.utils.LongRational     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r9.<init>(r5, r7)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11[r4] = r9     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r4 = r4 + 1
            goto L55
        L6d:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int[] r11 = new int[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L71:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L36
            int r5 = r3.readInt()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11[r4] = r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r4 = r4 + 1
            goto L71
        L7e:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int[] r11 = new int[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L82:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L36
            short r5 = r3.readShort()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11[r4] = r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r4 = r4 + 1
            goto L82
        L8f:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            androidx.camera.core.impl.utils.LongRational[] r11 = new androidx.camera.core.impl.utils.LongRational[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L93:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L36
            long r5 = r3.readUnsignedInt()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            long r7 = r3.readUnsignedInt()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            androidx.camera.core.impl.utils.LongRational r9 = new androidx.camera.core.impl.utils.LongRational     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r9.<init>(r5, r7)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11[r4] = r9     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r4 = r4 + 1
            goto L93
        La9:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            long[] r11 = new long[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        Lad:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L36
            long r5 = r3.readUnsignedInt()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11[r4] = r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r4 = r4 + 1
            goto Lad
        Lba:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int[] r11 = new int[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        Lbe:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L36
            int r5 = r3.readUnsignedShort()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11[r4] = r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r4 = r4 + 1
            goto Lbe
        Lcb:
            int r11 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            byte[] r5 = androidx.camera.core.impl.utils.ExifAttribute.EXIF_ASCII_PREFIX     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r5 = r5.length     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r11 < r5) goto Le5
            r11 = 0
        Ld3:
            byte[] r5 = androidx.camera.core.impl.utils.ExifAttribute.EXIF_ASCII_PREFIX     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r6 = r5.length     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r11 >= r6) goto Le4
            byte[] r6 = r10.bytes     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r6 = r6[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r5 = r5[r11]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r6 == r5) goto Le1
            goto Le5
        Le1:
            int r11 = r11 + 1
            goto Ld3
        Le4:
            int r4 = r5.length     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        Le5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11.<init>()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        Lea:
            int r5 = r10.numberOfComponents     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r4 >= r5) goto L106
            byte[] r5 = r10.bytes     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r5 != 0) goto Lf5
            goto L106
        Lf5:
            r6 = 32
            if (r5 < r6) goto Lfe
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11.append(r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            goto L103
        Lfe:
            r5 = 63
            r11.append(r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L103:
            int r4 = r4 + 1
            goto Lea
        L106:
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            goto L36
        L10c:
            byte[] r11 = r10.bytes     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r5 = r11.length     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r6 = 1
            if (r5 != r6) goto L126
            r5 = r11[r4]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r5 < 0) goto L126
            if (r5 > r6) goto L126
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            int r5 = r5 + 48
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r6[r4] = r5     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r11.<init>(r6)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            goto L36
        L126:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            java.nio.charset.Charset r5 = androidx.camera.core.impl.utils.ExifAttribute.ASCII     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r4.<init>(r11, r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            r3.close()     // Catch: java.io.IOException -> L131
            return r4
        L131:
            r11 = move-exception
            androidx.camera.core.Logger.e(r1, r0, r11)
            return r4
        L136:
            r11 = move-exception
            goto L14a
        L138:
            r11 = move-exception
            r3 = r2
        L13a:
            java.lang.String r4 = "IOException occurred during reading a value"
            androidx.camera.core.Logger.w(r1, r4, r11)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L149
            r3.close()     // Catch: java.io.IOException -> L145
            goto L149
        L145:
            r11 = move-exception
            androidx.camera.core.Logger.e(r1, r0, r11)
        L149:
            return r2
        L14a:
            if (r2 == 0) goto L154
            r2.close()     // Catch: java.io.IOException -> L150
            goto L154
        L150:
            r2 = move-exception
            androidx.camera.core.Logger.e(r1, r0, r2)
        L154:
            throw r11
    }

    public int size() {
            r2 = this;
            int[] r0 = androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT
            int r1 = r2.format
            r0 = r0[r1]
            int r1 = r2.numberOfComponents
            int r0 = r0 * r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String[] r1 = androidx.camera.core.impl.utils.ExifAttribute.IFD_FORMAT_NAMES
            int r2 = r3.format
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r1 = ", data length:"
            r0.append(r1)
            byte[] r1 = r3.bytes
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
