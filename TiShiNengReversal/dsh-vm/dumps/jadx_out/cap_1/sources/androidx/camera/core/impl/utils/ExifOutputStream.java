package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ExifOutputStream extends java.io.FilterOutputStream {
    private static final short BYTE_ALIGN_II = 18761;
    private static final short BYTE_ALIGN_MM = 19789;
    private static final boolean DEBUG = false;
    private static final byte[] IDENTIFIER_EXIF_APP1 = null;
    private static final int IFD_OFFSET = 8;
    private static final byte START_CODE = 42;
    private static final int STATE_FRAME_HEADER = 1;
    private static final int STATE_JPEG_DATA = 2;
    private static final int STATE_SOI = 0;
    private static final int STREAMBUFFER_SIZE = 65536;
    private static final java.lang.String TAG = "ExifOutputStream";
    private final java.nio.ByteBuffer mBuffer;
    private int mByteToCopy;
    private int mByteToSkip;
    private final androidx.camera.core.impl.utils.ExifData mExifData;
    private final byte[] mSingleByteArray;
    private int mState;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class JpegHeader {
        public static final short APP1 = -31;
        public static final short DAC = -52;
        public static final short DHT = -60;
        public static final short EOI = -39;
        public static final short JPG = -56;
        public static final short SOF0 = -64;
        public static final short SOF15 = -49;
        public static final short SOI = -40;

        private JpegHeader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean isSofMarker(short r1) {
                r0 = -64
                if (r1 < r0) goto L16
                r0 = -49
                if (r1 > r0) goto L16
                r0 = -60
                if (r1 == r0) goto L16
                r0 = -56
                if (r1 == r0) goto L16
                r0 = -52
                if (r1 == r0) goto L16
                r1 = 1
                return r1
            L16:
                r1 = 0
                return r1
        }
    }

    static {
            java.lang.String r0 = "Exif\u0000\u0000"
            java.nio.charset.Charset r1 = androidx.camera.core.impl.utils.ExifAttribute.ASCII
            byte[] r0 = r0.getBytes(r1)
            androidx.camera.core.impl.utils.ExifOutputStream.IDENTIFIER_EXIF_APP1 = r0
            return
    }

    public ExifOutputStream(@androidx.annotation.NonNull java.io.OutputStream r3, @androidx.annotation.NonNull androidx.camera.core.impl.utils.ExifData r4) {
            r2 = this;
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r1 = 65536(0x10000, float:9.1835E-41)
            r0.<init>(r3, r1)
            r2.<init>(r0)
            r3 = 1
            byte[] r3 = new byte[r3]
            r2.mSingleByteArray = r3
            r3 = 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r2.mBuffer = r3
            r3 = 0
            r2.mState = r3
            r2.mExifData = r4
            return
    }

    private int requestByteToBuffer(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.mBuffer
            int r0 = r0.position()
            int r2 = r2 - r0
            int r2 = java.lang.Math.min(r5, r2)
            java.nio.ByteBuffer r5 = r1.mBuffer
            r5.put(r3, r4, r2)
            return r2
    }

    private void writeExifSegment(@androidx.annotation.NonNull androidx.camera.core.impl.utils.ByteOrderedDataOutputStream r15) throws java.io.IOException {
            r14 = this;
            androidx.camera.core.impl.utils.ExifTag[][] r0 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            androidx.camera.core.impl.utils.ExifTag[] r2 = androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS
            int r3 = r2.length
            r4 = 0
            r5 = 0
        Ld:
            if (r5 >= r3) goto L28
            r6 = r2[r5]
            r7 = 0
        L12:
            androidx.camera.core.impl.utils.ExifTag[][] r8 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
            int r8 = r8.length
            if (r7 >= r8) goto L25
            androidx.camera.core.impl.utils.ExifData r8 = r14.mExifData
            java.util.Map r8 = r8.getAttributes(r7)
            java.lang.String r9 = r6.name
            r8.remove(r9)
            int r7 = r7 + 1
            goto L12
        L25:
            int r5 = r5 + 1
            goto Ld
        L28:
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            r3 = 1
            java.util.Map r2 = r2.getAttributes(r3)
            boolean r2 = r2.isEmpty()
            r5 = 0
            if (r2 != 0) goto L50
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            java.util.Map r2 = r2.getAttributes(r4)
            androidx.camera.core.impl.utils.ExifTag[] r7 = androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS
            r7 = r7[r3]
            java.lang.String r7 = r7.name
            androidx.camera.core.impl.utils.ExifData r8 = r14.mExifData
            java.nio.ByteOrder r8 = r8.getByteOrder()
            androidx.camera.core.impl.utils.ExifAttribute r8 = androidx.camera.core.impl.utils.ExifAttribute.createULong(r5, r8)
            r2.put(r7, r8)
        L50:
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            r7 = 2
            java.util.Map r2 = r2.getAttributes(r7)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L76
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            java.util.Map r2 = r2.getAttributes(r4)
            androidx.camera.core.impl.utils.ExifTag[] r8 = androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS
            r8 = r8[r7]
            java.lang.String r8 = r8.name
            androidx.camera.core.impl.utils.ExifData r9 = r14.mExifData
            java.nio.ByteOrder r9 = r9.getByteOrder()
            androidx.camera.core.impl.utils.ExifAttribute r9 = androidx.camera.core.impl.utils.ExifAttribute.createULong(r5, r9)
            r2.put(r8, r9)
        L76:
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            r8 = 3
            java.util.Map r2 = r2.getAttributes(r8)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L9c
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            java.util.Map r2 = r2.getAttributes(r3)
            androidx.camera.core.impl.utils.ExifTag[] r9 = androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS
            r9 = r9[r8]
            java.lang.String r9 = r9.name
            androidx.camera.core.impl.utils.ExifData r10 = r14.mExifData
            java.nio.ByteOrder r10 = r10.getByteOrder()
            androidx.camera.core.impl.utils.ExifAttribute r10 = androidx.camera.core.impl.utils.ExifAttribute.createULong(r5, r10)
            r2.put(r9, r10)
        L9c:
            r2 = 0
        L9d:
            androidx.camera.core.impl.utils.ExifTag[][] r9 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
            int r9 = r9.length
            r10 = 4
            if (r2 >= r9) goto Ld4
            androidx.camera.core.impl.utils.ExifData r9 = r14.mExifData
            java.util.Map r9 = r9.getAttributes(r2)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            r11 = 0
        Lb2:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto Lcc
            java.lang.Object r12 = r9.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r12 = r12.getValue()
            androidx.camera.core.impl.utils.ExifAttribute r12 = (androidx.camera.core.impl.utils.ExifAttribute) r12
            int r12 = r12.size()
            if (r12 <= r10) goto Lb2
            int r11 = r11 + r12
            goto Lb2
        Lcc:
            r9 = r0[r2]
            int r9 = r9 + r11
            r0[r2] = r9
            int r2 = r2 + 1
            goto L9d
        Ld4:
            r2 = 8
            r9 = 0
            r11 = 8
        Ld9:
            androidx.camera.core.impl.utils.ExifTag[][] r12 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
            int r12 = r12.length
            if (r9 >= r12) goto L101
            androidx.camera.core.impl.utils.ExifData r12 = r14.mExifData
            java.util.Map r12 = r12.getAttributes(r9)
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto Lfe
            r1[r9] = r11
            androidx.camera.core.impl.utils.ExifData r12 = r14.mExifData
            java.util.Map r12 = r12.getAttributes(r9)
            int r12 = r12.size()
            int r12 = r12 * 12
            int r12 = r12 + 6
            r13 = r0[r9]
            int r12 = r12 + r13
            int r11 = r11 + r12
        Lfe:
            int r9 = r9 + 1
            goto Ld9
        L101:
            int r11 = r11 + r2
            androidx.camera.core.impl.utils.ExifData r0 = r14.mExifData
            java.util.Map r0 = r0.getAttributes(r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12a
            androidx.camera.core.impl.utils.ExifData r0 = r14.mExifData
            java.util.Map r0 = r0.getAttributes(r4)
            androidx.camera.core.impl.utils.ExifTag[] r2 = androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS
            r2 = r2[r3]
            java.lang.String r2 = r2.name
            r9 = r1[r3]
            long r12 = (long) r9
            androidx.camera.core.impl.utils.ExifData r9 = r14.mExifData
            java.nio.ByteOrder r9 = r9.getByteOrder()
            androidx.camera.core.impl.utils.ExifAttribute r9 = androidx.camera.core.impl.utils.ExifAttribute.createULong(r12, r9)
            r0.put(r2, r9)
        L12a:
            androidx.camera.core.impl.utils.ExifData r0 = r14.mExifData
            java.util.Map r0 = r0.getAttributes(r7)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L152
            androidx.camera.core.impl.utils.ExifData r0 = r14.mExifData
            java.util.Map r0 = r0.getAttributes(r4)
            androidx.camera.core.impl.utils.ExifTag[] r2 = androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS
            r2 = r2[r7]
            java.lang.String r2 = r2.name
            r9 = r1[r7]
            long r12 = (long) r9
            androidx.camera.core.impl.utils.ExifData r9 = r14.mExifData
            java.nio.ByteOrder r9 = r9.getByteOrder()
            androidx.camera.core.impl.utils.ExifAttribute r9 = androidx.camera.core.impl.utils.ExifAttribute.createULong(r12, r9)
            r0.put(r2, r9)
        L152:
            androidx.camera.core.impl.utils.ExifData r0 = r14.mExifData
            java.util.Map r0 = r0.getAttributes(r8)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L17a
            androidx.camera.core.impl.utils.ExifData r0 = r14.mExifData
            java.util.Map r0 = r0.getAttributes(r3)
            androidx.camera.core.impl.utils.ExifTag[] r2 = androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS
            r2 = r2[r8]
            java.lang.String r2 = r2.name
            r3 = r1[r8]
            long r8 = (long) r3
            androidx.camera.core.impl.utils.ExifData r3 = r14.mExifData
            java.nio.ByteOrder r3 = r3.getByteOrder()
            androidx.camera.core.impl.utils.ExifAttribute r3 = androidx.camera.core.impl.utils.ExifAttribute.createULong(r8, r3)
            r0.put(r2, r3)
        L17a:
            r15.writeUnsignedShort(r11)
            byte[] r0 = androidx.camera.core.impl.utils.ExifOutputStream.IDENTIFIER_EXIF_APP1
            r15.write(r0)
            androidx.camera.core.impl.utils.ExifData r0 = r14.mExifData
            java.nio.ByteOrder r0 = r0.getByteOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r2) goto L18f
            r0 = 19789(0x4d4d, float:2.773E-41)
            goto L191
        L18f:
            r0 = 18761(0x4949, float:2.629E-41)
        L191:
            r15.writeShort(r0)
            androidx.camera.core.impl.utils.ExifData r0 = r14.mExifData
            java.nio.ByteOrder r0 = r0.getByteOrder()
            r15.setByteOrder(r0)
            r0 = 42
            r15.writeUnsignedShort(r0)
            r2 = 8
            r15.writeUnsignedInt(r2)
            r0 = 0
        L1a8:
            androidx.camera.core.impl.utils.ExifTag[][] r2 = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS
            int r2 = r2.length
            if (r0 >= r2) goto L286
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            java.util.Map r2 = r2.getAttributes(r0)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L282
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            java.util.Map r2 = r2.getAttributes(r0)
            int r2 = r2.size()
            r15.writeUnsignedShort(r2)
            r2 = r1[r0]
            int r2 = r2 + r7
            androidx.camera.core.impl.utils.ExifData r3 = r14.mExifData
            java.util.Map r3 = r3.getAttributes(r0)
            int r3 = r3.size()
            int r3 = r3 * 12
            int r2 = r2 + r3
            int r2 = r2 + r10
            androidx.camera.core.impl.utils.ExifData r3 = r14.mExifData
            java.util.Map r3 = r3.getAttributes(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1e5:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L255
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.util.List<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.ExifTag>> r9 = androidx.camera.core.impl.utils.ExifData.Builder.sExifTagMapsForWriting
            java.lang.Object r9 = r9.get(r0)
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r11 = r8.getKey()
            java.lang.Object r9 = r9.get(r11)
            androidx.camera.core.impl.utils.ExifTag r9 = (androidx.camera.core.impl.utils.ExifTag) r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Tag not supported: "
            r11.append(r12)
            java.lang.Object r12 = r8.getKey()
            java.lang.String r12 = (java.lang.String) r12
            r11.append(r12)
            java.lang.String r12 = ". Tag needs to be ported from ExifInterface to ExifData."
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object r9 = androidx.core.util.Preconditions.checkNotNull(r9, r11)
            androidx.camera.core.impl.utils.ExifTag r9 = (androidx.camera.core.impl.utils.ExifTag) r9
            int r9 = r9.number
            java.lang.Object r8 = r8.getValue()
            androidx.camera.core.impl.utils.ExifAttribute r8 = (androidx.camera.core.impl.utils.ExifAttribute) r8
            int r11 = r8.size()
            r15.writeUnsignedShort(r9)
            int r9 = r8.format
            r15.writeUnsignedShort(r9)
            int r9 = r8.numberOfComponents
            r15.writeInt(r9)
            if (r11 <= r10) goto L246
            long r8 = (long) r2
            r15.writeUnsignedInt(r8)
            int r2 = r2 + r11
            goto L1e5
        L246:
            byte[] r8 = r8.bytes
            r15.write(r8)
            if (r11 >= r10) goto L1e5
        L24d:
            if (r11 >= r10) goto L1e5
            r15.writeByte(r4)
            int r11 = r11 + 1
            goto L24d
        L255:
            r15.writeUnsignedInt(r5)
            androidx.camera.core.impl.utils.ExifData r2 = r14.mExifData
            java.util.Map r2 = r2.getAttributes(r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L266:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L282
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            androidx.camera.core.impl.utils.ExifAttribute r3 = (androidx.camera.core.impl.utils.ExifAttribute) r3
            byte[] r3 = r3.bytes
            int r8 = r3.length
            if (r8 <= r10) goto L266
            int r8 = r3.length
            r15.write(r3, r4, r8)
            goto L266
        L282:
            int r0 = r0 + 1
            goto L1a8
        L286:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r15.setByteOrder(r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.mSingleByteArray
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r2.write(r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@androidx.annotation.NonNull byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@androidx.annotation.NonNull byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
        L0:
            int r0 = r6.mByteToSkip
            r1 = 2
            if (r0 > 0) goto Ld
            int r2 = r6.mByteToCopy
            if (r2 > 0) goto Ld
            int r2 = r6.mState
            if (r2 == r1) goto L108
        Ld:
            if (r9 <= 0) goto L108
            if (r0 <= 0) goto L1c
            int r0 = java.lang.Math.min(r9, r0)
            int r9 = r9 - r0
            int r2 = r6.mByteToSkip
            int r2 = r2 - r0
            r6.mByteToSkip = r2
            int r8 = r8 + r0
        L1c:
            int r0 = r6.mByteToCopy
            if (r0 <= 0) goto L30
            int r0 = java.lang.Math.min(r9, r0)
            java.io.OutputStream r2 = r6.out
            r2.write(r7, r8, r0)
            int r9 = r9 - r0
            int r2 = r6.mByteToCopy
            int r2 = r2 - r0
            r6.mByteToCopy = r2
            int r8 = r8 + r0
        L30:
            if (r9 != 0) goto L34
            goto L10f
        L34:
            int r0 = r6.mState
            r2 = -31
            r3 = 1
            r4 = 0
            if (r0 == 0) goto Lbf
            if (r0 == r3) goto L3f
            goto L0
        L3f:
            r0 = 4
            int r3 = r6.requestByteToBuffer(r0, r7, r8, r9)
            int r8 = r8 + r3
            int r9 = r9 - r3
            java.nio.ByteBuffer r3 = r6.mBuffer
            int r3 = r3.position()
            if (r3 != r1) goto L68
            java.nio.ByteBuffer r3 = r6.mBuffer
            short r3 = r3.getShort()
            r5 = -39
            if (r3 != r5) goto L68
            java.io.OutputStream r3 = r6.out
            java.nio.ByteBuffer r5 = r6.mBuffer
            byte[] r5 = r5.array()
            r3.write(r5, r4, r1)
            java.nio.ByteBuffer r3 = r6.mBuffer
            r3.rewind()
        L68:
            java.nio.ByteBuffer r3 = r6.mBuffer
            int r3 = r3.position()
            if (r3 >= r0) goto L72
            goto L10f
        L72:
            java.nio.ByteBuffer r3 = r6.mBuffer
            r3.rewind()
            java.nio.ByteBuffer r3 = r6.mBuffer
            short r3 = r3.getShort()
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r2) goto L8f
            java.nio.ByteBuffer r0 = r6.mBuffer
            short r0 = r0.getShort()
            r0 = r0 & r5
            int r0 = r0 - r1
            r6.mByteToSkip = r0
            r6.mState = r1
            goto Lb8
        L8f:
            boolean r2 = androidx.camera.core.impl.utils.ExifOutputStream.JpegHeader.isSofMarker(r3)
            if (r2 != 0) goto Lab
            java.io.OutputStream r2 = r6.out
            java.nio.ByteBuffer r3 = r6.mBuffer
            byte[] r3 = r3.array()
            r2.write(r3, r4, r0)
            java.nio.ByteBuffer r0 = r6.mBuffer
            short r0 = r0.getShort()
            r0 = r0 & r5
            int r0 = r0 - r1
            r6.mByteToCopy = r0
            goto Lb8
        Lab:
            java.io.OutputStream r2 = r6.out
            java.nio.ByteBuffer r3 = r6.mBuffer
            byte[] r3 = r3.array()
            r2.write(r3, r4, r0)
            r6.mState = r1
        Lb8:
            java.nio.ByteBuffer r0 = r6.mBuffer
            r0.rewind()
            goto L0
        Lbf:
            int r0 = r6.requestByteToBuffer(r1, r7, r8, r9)
            int r8 = r8 + r0
            int r9 = r9 - r0
            java.nio.ByteBuffer r0 = r6.mBuffer
            int r0 = r0.position()
            if (r0 >= r1) goto Lce
            goto L10f
        Lce:
            java.nio.ByteBuffer r0 = r6.mBuffer
            r0.rewind()
            java.nio.ByteBuffer r0 = r6.mBuffer
            short r0 = r0.getShort()
            r5 = -40
            if (r0 != r5) goto L100
            java.io.OutputStream r0 = r6.out
            java.nio.ByteBuffer r5 = r6.mBuffer
            byte[] r5 = r5.array()
            r0.write(r5, r4, r1)
            r6.mState = r3
            java.nio.ByteBuffer r0 = r6.mBuffer
            r0.rewind()
            androidx.camera.core.impl.utils.ByteOrderedDataOutputStream r0 = new androidx.camera.core.impl.utils.ByteOrderedDataOutputStream
            java.io.OutputStream r1 = r6.out
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r0.<init>(r1, r3)
            r0.writeShort(r2)
            r6.writeExifSegment(r0)
            goto L0
        L100:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Not a valid jpeg image, cannot write exif"
            r7.<init>(r8)
            throw r7
        L108:
            if (r9 <= 0) goto L10f
            java.io.OutputStream r0 = r6.out
            r0.write(r7, r8, r9)
        L10f:
            return
    }
}
