package androidx.emoji2.text.flatbuffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;
    private final androidx.emoji2.text.flatbuffer.ReadWriteBuf bb;
    private boolean finished;
    private final int flags;
    private java.util.Comparator<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> keyComparator;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> keyPool;
    private final java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> stack;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> stringPool;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        static {
                return
        }

        Value(int r1, int r2, int r3, double r4) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.type = r2
                r0.minBitWidth = r3
                r0.dValue = r4
                r1 = -9223372036854775808
                r0.iValue = r1
                return
        }

        Value(int r1, int r2, int r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.type = r2
                r0.minBitWidth = r3
                r0.iValue = r4
                r1 = 1
                r0.dValue = r1
                return
        }

        static /* synthetic */ int access$100(int r0, int r1) {
                int r0 = paddingBytes(r0, r1)
                return r0
        }

        static /* synthetic */ int access$200(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r0, int r1, int r2) {
                int r0 = r0.elemWidth(r1, r2)
                return r0
        }

        static /* synthetic */ byte access$300(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r0) {
                byte r0 = r0.storedPackedType()
                return r0
        }

        static /* synthetic */ byte access$400(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r0, int r1) {
                byte r0 = r0.storedPackedType(r1)
                return r0
        }

        static /* synthetic */ int access$500(int r0, int r1, long r2, int r4, int r5) {
                int r0 = elemWidth(r0, r1, r2, r4, r5)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value blob(int r6, int r7, int r8, int r9) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                long r4 = (long) r7
                r1 = r6
                r2 = r8
                r3 = r9
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value bool(int r6, boolean r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                if (r7 == 0) goto L8
                r1 = 1
            L6:
                r4 = r1
                goto Lb
            L8:
                r1 = 0
                goto L6
            Lb:
                r2 = 26
                r3 = 0
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        private int elemWidth(int r7, int r8) {
                r6 = this;
                int r0 = r6.type
                int r1 = r6.minBitWidth
                long r2 = r6.iValue
                r4 = r7
                r5 = r8
                int r7 = elemWidth(r0, r1, r2, r4, r5)
                return r7
        }

        private static int elemWidth(int r5, int r6, long r7, int r9, int r10) {
                boolean r5 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypeInline(r5)
                if (r5 == 0) goto L7
                return r6
            L7:
                r5 = 1
            L8:
                r6 = 32
                if (r5 > r6) goto L28
                int r6 = paddingBytes(r9, r5)
                int r6 = r6 + r9
                int r0 = r10 * r5
                int r6 = r6 + r0
                long r0 = (long) r6
                long r0 = r0 - r7
                int r6 = (int) r0
                long r0 = (long) r6
                int r6 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.widthUInBits(r0)
                r0 = 1
                long r0 = r0 << r6
                long r2 = (long) r5
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L25
                return r6
            L25:
                int r5 = r5 * 2
                goto L8
            L28:
                r5 = 3
                return r5
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value float32(int r6, float r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                double r4 = (double) r7
                r2 = 3
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value float64(int r6, double r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 3
                r3 = 3
                r1 = r6
                r4 = r7
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int16(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 1
                long r4 = (long) r7
                r2 = 1
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int32(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                long r4 = (long) r7
                r2 = 1
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int64(int r6, long r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 1
                r3 = 3
                r1 = r6
                r4 = r7
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int8(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 0
                long r4 = (long) r7
                r2 = 1
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        private static byte packedType(int r0, int r1) {
                int r1 = r1 << 2
                r0 = r0 | r1
                byte r0 = (byte) r0
                return r0
        }

        private static int paddingBytes(int r0, int r1) {
                int r0 = ~r0
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                r0 = r0 & r1
                return r0
        }

        private byte storedPackedType() {
                r1 = this;
                r0 = 0
                byte r0 = r1.storedPackedType(r0)
                return r0
        }

        private byte storedPackedType(int r2) {
                r1 = this;
                int r2 = r1.storedWidth(r2)
                int r0 = r1.type
                byte r2 = packedType(r2, r0)
                return r2
        }

        private int storedWidth(int r2) {
                r1 = this;
                int r0 = r1.type
                boolean r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypeInline(r0)
                if (r0 == 0) goto Lf
                int r0 = r1.minBitWidth
                int r2 = java.lang.Math.max(r0, r2)
                return r2
            Lf:
                int r2 = r1.minBitWidth
                return r2
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt16(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 1
                long r4 = (long) r7
                r2 = 2
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt32(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                long r4 = (long) r7
                r2 = 2
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt64(int r6, long r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 2
                r3 = 3
                r1 = r6
                r4 = r7
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt8(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 0
                long r4 = (long) r7
                r2 = 2
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }
    }

    static {
            return
    }

    public FlexBuffersBuilder() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1.<init>(r0)
            return
    }

    public FlexBuffersBuilder(int r2) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            r0.<init>(r2)
            r2 = 1
            r1.<init>(r0, r2)
            return
    }

    public FlexBuffersBuilder(androidx.emoji2.text.flatbuffer.ReadWriteBuf r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.stack = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.keyPool = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringPool = r0
            r0 = 0
            r1.finished = r0
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1 r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1
            r0.<init>(r1)
            r1.keyComparator = r0
            r1.bb = r2
            r1.flags = r3
            return
    }

    public FlexBuffersBuilder(java.nio.ByteBuffer r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public FlexBuffersBuilder(java.nio.ByteBuffer r2, int r3) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            byte[] r2 = r2.array()
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    static /* synthetic */ androidx.emoji2.text.flatbuffer.ReadWriteBuf access$000(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder r0) {
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r0.bb
            return r0
    }

    private int align(int r4) {
            r3 = this;
            r0 = 1
            int r4 = r0 << r4
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r3.bb
            int r0 = r0.writePosition()
            int r0 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$100(r0, r4)
        Ld:
            int r1 = r0 + (-1)
            if (r0 == 0) goto L19
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r3.bb
            r2 = 0
            r0.put(r2)
            r0 = r1
            goto Ld
        L19:
            return r4
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value createKeyVector(int r14, int r15) {
            r13 = this;
            long r0 = (long) r15
            int r15 = widthUInBits(r0)
            r2 = 0
            int r15 = java.lang.Math.max(r2, r15)
            r6 = r15
            r15 = r14
        Lc:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r13.stack
            int r3 = r3.size()
            if (r15 >= r3) goto L33
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r13.stack
            java.lang.Object r3 = r3.get(r15)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r3
            int r3 = r3.key
            long r9 = (long) r3
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r13.bb
            int r11 = r3.writePosition()
            int r12 = r15 + 1
            r7 = 4
            r8 = 0
            int r15 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$500(r7, r8, r9, r11, r12)
            int r6 = java.lang.Math.max(r6, r15)
            r15 = r12
            goto Lc
        L33:
            int r15 = r13.align(r6)
            r13.writeInt(r0, r15)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r13.bb
            int r0 = r0.writePosition()
        L40:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r13.stack
            int r1 = r1.size()
            if (r14 >= r1) goto L63
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r13.stack
            java.lang.Object r1 = r1.get(r14)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r1
            int r1 = r1.key
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r13.stack
            java.lang.Object r1 = r1.get(r14)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r1
            int r1 = r1.key
            long r3 = (long) r1
            r13.writeOffset(r3, r15)
            int r14 = r14 + 1
            goto L40
        L63:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
            r14 = 4
            int r5 = androidx.emoji2.text.flatbuffer.FlexBuffers.toTypedVector(r14, r2)
            long r7 = (long) r0
            r4 = -1
            r3.<init>(r4, r5, r6, r7)
            return r3
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value createVector(int r15, int r16, int r17, boolean r18, boolean r19, androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r20) {
            r14 = this;
            r0 = r17
            r1 = r20
            long r2 = (long) r0
            int r4 = widthUInBits(r2)
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            if (r1 == 0) goto L20
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r6 = r14.bb
            int r6 = r6.writePosition()
            int r6 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r1, r6, r5)
            int r4 = java.lang.Math.max(r4, r6)
            r6 = 3
            goto L21
        L20:
            r6 = 1
        L21:
            r7 = 4
            r11 = r4
            r4 = r16
        L25:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r14.stack
            int r8 = r8.size()
            if (r4 >= r8) goto L67
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r14.stack
            java.lang.Object r8 = r8.get(r4)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r8
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r9 = r14.bb
            int r9 = r9.writePosition()
            int r10 = r4 + r6
            int r8 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r8, r9, r10)
            int r11 = java.lang.Math.max(r11, r8)
            r8 = r16
            if (r18 == 0) goto L64
            if (r4 != r8) goto L64
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r7 = r14.stack
            java.lang.Object r7 = r7.get(r4)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r7 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r7
            int r7 = r7.type
            boolean r9 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVectorElementType(r7)
            if (r9 == 0) goto L5c
            goto L64
        L5c:
            androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException r15 = new androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException
            java.lang.String r0 = "TypedVector does not support this element type"
            r15.<init>(r0)
            throw r15
        L64:
            int r4 = r4 + 1
            goto L25
        L67:
            r8 = r16
            int r4 = r14.align(r11)
            if (r1 == 0) goto L7c
            long r9 = r1.iValue
            r14.writeOffset(r9, r4)
            r9 = 1
            int r6 = r1.minBitWidth
            long r9 = r9 << r6
            r14.writeInt(r9, r4)
        L7c:
            if (r19 != 0) goto L81
            r14.writeInt(r2, r4)
        L81:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r14.bb
            int r2 = r2.writePosition()
            r3 = r8
        L88:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r6 = r14.stack
            int r6 = r6.size()
            if (r3 >= r6) goto L9e
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r6 = r14.stack
            java.lang.Object r6 = r6.get(r3)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r6
            r14.writeAny(r6, r4)
            int r3 = r3 + 1
            goto L88
        L9e:
            if (r18 != 0) goto Lbc
        La0:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r14.stack
            int r3 = r3.size()
            if (r8 >= r3) goto Lbc
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r14.bb
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r4 = r14.stack
            java.lang.Object r4 = r4.get(r8)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r4 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r4
            byte r4 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$400(r4, r11)
            r3.put(r4)
            int r8 = r8 + 1
            goto La0
        Lbc:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
            if (r1 == 0) goto Lc5
            r0 = 9
            r10 = 9
            goto Ld5
        Lc5:
            if (r18 == 0) goto Ld1
            if (r19 == 0) goto Lca
            goto Lcb
        Lca:
            r0 = 0
        Lcb:
            int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.toTypedVector(r7, r0)
            r10 = r0
            goto Ld5
        Ld1:
            r0 = 10
            r10 = 10
        Ld5:
            long r12 = (long) r2
            r9 = r15
            r8.<init>(r9, r10, r11, r12)
            return r8
    }

    private int putKey(java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L4
            r6 = -1
            return r6
        L4:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r5.bb
            int r0 = r0.writePosition()
            int r1 = r5.flags
            r1 = r1 & 1
            r2 = 0
            if (r1 == 0) goto L3b
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.keyPool
            java.lang.Object r1 = r1.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L36
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r1)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r5.bb
            int r4 = r1.length
            r3.put(r1, r2, r4)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r5.bb
            r1.put(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.keyPool
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r2)
            return r0
        L36:
            int r6 = r1.intValue()
            return r6
        L3b:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r1)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r5.bb
            int r4 = r1.length
            r3.put(r1, r2, r4)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r5.bb
            r1.put(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.keyPool
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r2)
            return r0
    }

    private void putUInt(java.lang.String r3, long r4) {
            r2 = this;
            int r3 = r2.putKey(r3)
            int r0 = widthUInBits(r4)
            if (r0 != 0) goto L10
            int r5 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt8(r3, r5)
            goto L26
        L10:
            r1 = 1
            if (r0 != r1) goto L19
            int r5 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt16(r3, r5)
            goto L26
        L19:
            r1 = 2
            if (r0 != r1) goto L22
            int r5 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt32(r3, r5)
            goto L26
        L22:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt64(r3, r4)
        L26:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r4 = r2.stack
            r4.add(r3)
            return
    }

    private void putUInt64(java.lang.String r2, long r3) {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r2 = r1.putKey(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt64(r2, r3)
            r0.add(r2)
            return
    }

    static int widthUInBits(long r4) {
            r0 = -1
            int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(r0)
            long r1 = (long) r1
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 > 0) goto Lc
            r4 = 0
            return r4
        Lc:
            int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.shortToUnsignedInt(r0)
            long r1 = (long) r1
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 > 0) goto L17
            r4 = 1
            return r4
        L17:
            long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.intToUnsignedLong(r0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L21
            r4 = 2
            return r4
        L21:
            r4 = 3
            return r4
    }

    private void writeAny(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r3, int r4) {
            r2 = this;
            int r0 = r3.type
            if (r0 == 0) goto L1d
            r1 = 1
            if (r0 == r1) goto L1d
            r1 = 2
            if (r0 == r1) goto L1d
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 26
            if (r0 == r1) goto L1d
            long r0 = r3.iValue
            r2.writeOffset(r0, r4)
            return
        L17:
            double r0 = r3.dValue
            r2.writeDouble(r0, r4)
            return
        L1d:
            long r0 = r3.iValue
            r2.writeInt(r0, r4)
            return
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value writeBlob(int r6, byte[] r7, int r8, boolean r9) {
            r5 = this;
            int r0 = r7.length
            long r0 = (long) r0
            int r0 = widthUInBits(r0)
            int r1 = r5.align(r0)
            int r2 = r7.length
            long r2 = (long) r2
            r5.writeInt(r2, r1)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r5.bb
            int r1 = r1.writePosition()
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r5.bb
            int r3 = r7.length
            r4 = 0
            r2.put(r7, r4, r3)
            if (r9 == 0) goto L23
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r7 = r5.bb
            r7.put(r4)
        L23:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.blob(r6, r1, r8, r0)
            return r6
    }

    private void writeDouble(double r2, int r4) {
            r1 = this;
            r0 = 4
            if (r4 != r0) goto La
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            float r2 = (float) r2
            r4.putFloat(r2)
            return
        La:
            r0 = 8
            if (r4 != r0) goto L13
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            r4.putDouble(r2)
        L13:
            return
    }

    private void writeInt(long r2, int r4) {
            r1 = this;
            r0 = 1
            if (r4 == r0) goto L23
            r0 = 2
            if (r4 == r0) goto L1b
            r0 = 4
            if (r4 == r0) goto L14
            r0 = 8
            if (r4 == r0) goto Le
            return
        Le:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            r4.putLong(r2)
            return
        L14:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            int r3 = (int) r2
            r4.putInt(r3)
            return
        L1b:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            int r3 = (int) r2
            short r2 = (short) r3
            r4.putShort(r2)
            return
        L23:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            int r3 = (int) r2
            byte r2 = (byte) r3
            r4.put(r2)
            return
    }

    private void writeOffset(long r3, int r5) {
            r2 = this;
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r2.bb
            int r0 = r0.writePosition()
            long r0 = (long) r0
            long r0 = r0 - r3
            int r3 = (int) r0
            long r3 = (long) r3
            r2.writeInt(r3, r5)
            return
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value writeString(int r3, java.lang.String r4) {
            r2 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r0)
            r0 = 5
            r1 = 1
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = r2.writeBlob(r3, r4, r0, r1)
            return r3
    }

    public int endMap(java.lang.String r8, int r9) {
            r7 = this;
            int r1 = r7.putKey(r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r7.stack
            int r0 = r8.size()
            java.util.List r8 = r8.subList(r9, r0)
            java.util.Comparator<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r7.keyComparator
            java.util.Collections.sort(r8, r0)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r7.stack
            int r8 = r8.size()
            int r8 = r8 - r9
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = r7.createKeyVector(r9, r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r7.stack
            int r8 = r8.size()
            int r3 = r8 - r9
            r4 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = r0.createVector(r1, r2, r3, r4, r5, r6)
        L2e:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r0.stack
            int r9 = r9.size()
            if (r9 <= r2) goto L42
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r0.stack
            int r1 = r9.size()
            int r1 = r1 + (-1)
            r9.remove(r1)
            goto L2e
        L42:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r0.stack
            r9.add(r8)
            long r8 = r8.iValue
            int r9 = (int) r8
            return r9
    }

    public int endVector(java.lang.String r8, int r9, boolean r10, boolean r11) {
            r7 = this;
            int r1 = r7.putKey(r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r7.stack
            int r8 = r8.size()
            int r3 = r8 - r9
            r6 = 0
            r0 = r7
            r2 = r9
            r4 = r10
            r5 = r11
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = r0.createVector(r1, r2, r3, r4, r5, r6)
        L15:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r0.stack
            int r9 = r9.size()
            if (r9 <= r2) goto L29
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r0.stack
            int r10 = r9.size()
            int r10 = r10 + (-1)
            r9.remove(r10)
            goto L15
        L29:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r0.stack
            r9.add(r8)
            long r8 = r8.iValue
            int r9 = (int) r8
            return r9
    }

    public java.nio.ByteBuffer finish() {
            r4 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r4.stack
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r0
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r4.bb
            int r2 = r2.writePosition()
            int r0 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r0, r2, r1)
            int r0 = r4.align(r0)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r4.stack
            java.lang.Object r2 = r2.get(r1)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r2
            r4.writeAny(r2, r0)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r4.bb
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r4.stack
            java.lang.Object r3 = r3.get(r1)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r3
            byte r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$300(r3)
            r2.put(r3)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r4.bb
            byte r0 = (byte) r0
            r2.put(r0)
            r0 = 1
            r4.finished = r0
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r4.bb
            byte[] r0 = r0.data()
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r4.bb
            int r2 = r2.writePosition()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
            return r0
    }

    public androidx.emoji2.text.flatbuffer.ReadWriteBuf getBuffer() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r1.bb
            return r0
    }

    public int putBlob(java.lang.String r3, byte[] r4) {
            r2 = this;
            int r3 = r2.putKey(r3)
            r0 = 25
            r1 = 0
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = r2.writeBlob(r3, r4, r0, r1)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r4 = r2.stack
            r4.add(r3)
            long r3 = r3.iValue
            int r4 = (int) r3
            return r4
    }

    public int putBlob(byte[] r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.putBlob(r0, r2)
            return r2
    }

    public void putBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r2 = r1.putKey(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.bool(r2, r3)
            r0.add(r2)
            return
    }

    public void putBoolean(boolean r2) {
            r1 = this;
            r0 = 0
            r1.putBoolean(r0, r2)
            return
    }

    public void putFloat(double r2) {
            r1 = this;
            r0 = 0
            r1.putFloat(r0, r2)
            return
    }

    public void putFloat(float r2) {
            r1 = this;
            r0 = 0
            r1.putFloat(r0, r2)
            return
    }

    public void putFloat(java.lang.String r2, double r3) {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r2 = r1.putKey(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.float64(r2, r3)
            r0.add(r2)
            return
    }

    public void putFloat(java.lang.String r2, float r3) {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r2 = r1.putKey(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.float32(r2, r3)
            r0.add(r2)
            return
    }

    public void putInt(int r2) {
            r1 = this;
            r0 = 0
            r1.putInt(r0, r2)
            return
    }

    public void putInt(long r2) {
            r1 = this;
            r0 = 0
            r1.putInt(r0, r2)
            return
    }

    public void putInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = (long) r4
            r2.putInt(r3, r0)
            return
    }

    public void putInt(java.lang.String r4, long r5) {
            r3 = this;
            int r4 = r3.putKey(r4)
            r0 = -128(0xffffffffffffff80, double:NaN)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L1b
            r0 = 127(0x7f, double:6.27E-322)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L1b
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r3.stack
            int r6 = (int) r5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r4 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int8(r4, r6)
            r0.add(r4)
            return
        L1b:
            r0 = -32768(0xffffffffffff8000, double:NaN)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L32
            r0 = 32767(0x7fff, double:1.6189E-319)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r3.stack
            int r6 = (int) r5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r4 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int16(r4, r6)
            r0.add(r4)
            return
        L32:
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L4b
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L4b
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r3.stack
            int r6 = (int) r5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r4 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int32(r4, r6)
            r0.add(r4)
            return
        L4b:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r3.stack
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r4 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int64(r4, r5)
            r0.add(r4)
            return
    }

    public int putString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.putString(r0, r2)
            return r2
    }

    public int putString(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            int r5 = r4.putKey(r5)
            int r0 = r4.flags
            r0 = r0 & 2
            if (r0 == 0) goto L49
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.stringPool
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L2d
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r5 = r4.writeString(r5, r6)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.stringPool
            long r1 = r5.iValue
            int r2 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r6, r1)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r6 = r4.stack
            r6.add(r5)
            long r5 = r5.iValue
        L2b:
            int r6 = (int) r5
            return r6
        L2d:
            int r6 = r6.length()
            long r1 = (long) r6
            int r6 = widthUInBits(r1)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r4.stack
            int r2 = r0.intValue()
            r3 = 5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r5 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.blob(r5, r2, r3, r6)
            r1.add(r5)
            int r5 = r0.intValue()
            return r5
        L49:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r5 = r4.writeString(r5, r6)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r6 = r4.stack
            r6.add(r5)
            long r5 = r5.iValue
            goto L2b
    }

    public void putUInt(int r4) {
            r3 = this;
            r0 = 0
            long r1 = (long) r4
            r3.putUInt(r0, r1)
            return
    }

    public void putUInt(long r2) {
            r1 = this;
            r0 = 0
            r1.putUInt(r0, r2)
            return
    }

    public void putUInt64(java.math.BigInteger r4) {
            r3 = this;
            r0 = 0
            long r1 = r4.longValue()
            r3.putUInt64(r0, r1)
            return
    }

    public int startMap() {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }

    public int startVector() {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }
}
