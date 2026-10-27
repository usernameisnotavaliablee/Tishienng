package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class RedisDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private final boolean decodeInlineCommands;
    private final int maxInlineMessageLength;
    private final io.netty.handler.codec.redis.RedisMessagePool messagePool;
    private int remainingBulkLength;
    private io.netty.handler.codec.redis.RedisDecoder.State state;
    private final io.netty.handler.codec.redis.RedisDecoder.ToPositiveLongProcessor toPositiveLongProcessor;
    private io.netty.handler.codec.redis.RedisMessageType type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.redis.RedisDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$redis$RedisDecoder$State = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$redis$RedisMessageType = null;

        static {
                io.netty.handler.codec.redis.RedisMessageType[] r0 = io.netty.handler.codec.redis.RedisMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisMessageType = r0
                r1 = 1
                io.netty.handler.codec.redis.RedisMessageType r2 = io.netty.handler.codec.redis.RedisMessageType.ARRAY_HEADER     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisMessageType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.redis.RedisMessageType r3 = io.netty.handler.codec.redis.RedisMessageType.BULK_STRING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisMessageType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.redis.RedisMessageType r4 = io.netty.handler.codec.redis.RedisMessageType.INLINE_COMMAND     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisMessageType     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.redis.RedisMessageType r5 = io.netty.handler.codec.redis.RedisMessageType.SIMPLE_STRING     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisMessageType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.redis.RedisMessageType r6 = io.netty.handler.codec.redis.RedisMessageType.ERROR     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r5 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisMessageType     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.redis.RedisMessageType r6 = io.netty.handler.codec.redis.RedisMessageType.INTEGER     // Catch: java.lang.NoSuchFieldError -> L49
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r7 = 6
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                io.netty.handler.codec.redis.RedisDecoder$State[] r5 = io.netty.handler.codec.redis.RedisDecoder.State.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisDecoder$State = r5
                io.netty.handler.codec.redis.RedisDecoder$State r6 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_TYPE     // Catch: java.lang.NoSuchFieldError -> L5a
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r5[r6] = r1     // Catch: java.lang.NoSuchFieldError -> L5a
            L5a:
                int[] r1 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisDecoder$State     // Catch: java.lang.NoSuchFieldError -> L64
                io.netty.handler.codec.redis.RedisDecoder$State r5 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_INLINE     // Catch: java.lang.NoSuchFieldError -> L64
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r1[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                int[] r0 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisDecoder$State     // Catch: java.lang.NoSuchFieldError -> L6e
                io.netty.handler.codec.redis.RedisDecoder$State r1 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_LENGTH     // Catch: java.lang.NoSuchFieldError -> L6e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
            L6e:
                int[] r0 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisDecoder$State     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.redis.RedisDecoder$State r1 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_BULK_STRING_EOL     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisDecoder$State     // Catch: java.lang.NoSuchFieldError -> L82
                io.netty.handler.codec.redis.RedisDecoder$State r1 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_BULK_STRING_CONTENT     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L82
            L82:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.redis.RedisDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.redis.RedisDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.redis.RedisDecoder.State DECODE_BULK_STRING_CONTENT = null;
        public static final io.netty.handler.codec.redis.RedisDecoder.State DECODE_BULK_STRING_EOL = null;
        public static final io.netty.handler.codec.redis.RedisDecoder.State DECODE_INLINE = null;
        public static final io.netty.handler.codec.redis.RedisDecoder.State DECODE_LENGTH = null;
        public static final io.netty.handler.codec.redis.RedisDecoder.State DECODE_TYPE = null;

        static {
                io.netty.handler.codec.redis.RedisDecoder$State r0 = new io.netty.handler.codec.redis.RedisDecoder$State
                java.lang.String r1 = "DECODE_TYPE"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.redis.RedisDecoder.State.DECODE_TYPE = r0
                io.netty.handler.codec.redis.RedisDecoder$State r1 = new io.netty.handler.codec.redis.RedisDecoder$State
                java.lang.String r3 = "DECODE_INLINE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.redis.RedisDecoder.State.DECODE_INLINE = r1
                io.netty.handler.codec.redis.RedisDecoder$State r3 = new io.netty.handler.codec.redis.RedisDecoder$State
                java.lang.String r5 = "DECODE_LENGTH"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.redis.RedisDecoder.State.DECODE_LENGTH = r3
                io.netty.handler.codec.redis.RedisDecoder$State r5 = new io.netty.handler.codec.redis.RedisDecoder$State
                java.lang.String r7 = "DECODE_BULK_STRING_EOL"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.redis.RedisDecoder.State.DECODE_BULK_STRING_EOL = r5
                io.netty.handler.codec.redis.RedisDecoder$State r7 = new io.netty.handler.codec.redis.RedisDecoder$State
                java.lang.String r9 = "DECODE_BULK_STRING_CONTENT"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.redis.RedisDecoder.State.DECODE_BULK_STRING_CONTENT = r7
                r9 = 5
                io.netty.handler.codec.redis.RedisDecoder$State[] r9 = new io.netty.handler.codec.redis.RedisDecoder.State[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                io.netty.handler.codec.redis.RedisDecoder.State.$VALUES = r9
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.redis.RedisDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.redis.RedisDecoder$State> r0 = io.netty.handler.codec.redis.RedisDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.redis.RedisDecoder$State r1 = (io.netty.handler.codec.redis.RedisDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.redis.RedisDecoder.State[] values() {
                io.netty.handler.codec.redis.RedisDecoder$State[] r0 = io.netty.handler.codec.redis.RedisDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.redis.RedisDecoder$State[] r0 = (io.netty.handler.codec.redis.RedisDecoder.State[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ToPositiveLongProcessor implements io.netty.util.ByteProcessor {
        private long result;

        private ToPositiveLongProcessor() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ToPositiveLongProcessor(io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public long content() {
                r2 = this;
                long r0 = r2.result
                return r0
        }

        public boolean process(byte r6) throws java.lang.Exception {
                r5 = this;
                r0 = 48
                if (r6 < r0) goto L15
                r1 = 57
                if (r6 > r1) goto L15
                long r1 = r5.result
                r3 = 10
                long r1 = r1 * r3
                int r6 = r6 - r0
                long r3 = (long) r6
                long r1 = r1 + r3
                r5.result = r1
                r6 = 1
                return r6
            L15:
                io.netty.handler.codec.redis.RedisCodecException r0 = new io.netty.handler.codec.redis.RedisCodecException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "bad byte in number: "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }

        public void reset() {
                r2 = this;
                r0 = 0
                r2.result = r0
                return
        }
    }

    public RedisDecoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public RedisDecoder(int r2, io.netty.handler.codec.redis.RedisMessagePool r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public RedisDecoder(int r3, io.netty.handler.codec.redis.RedisMessagePool r4, boolean r5) {
            r2 = this;
            r2.<init>()
            io.netty.handler.codec.redis.RedisDecoder$ToPositiveLongProcessor r0 = new io.netty.handler.codec.redis.RedisDecoder$ToPositiveLongProcessor
            r1 = 0
            r0.<init>(r1)
            r2.toPositiveLongProcessor = r0
            io.netty.handler.codec.redis.RedisDecoder$State r0 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_TYPE
            r2.state = r0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 <= 0) goto L1c
            if (r3 > r0) goto L1c
            r2.maxInlineMessageLength = r3
            r2.messagePool = r4
            r2.decodeInlineCommands = r5
            return
        L1c:
            io.netty.handler.codec.redis.RedisCodecException r4 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "maxInlineMessageLength: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r3 = " (expected: <= "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    public RedisDecoder(boolean r3) {
            r2 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            io.netty.handler.codec.redis.FixedRedisMessagePool r1 = io.netty.handler.codec.redis.FixedRedisMessagePool.INSTANCE
            r2.<init>(r0, r1, r3)
            return
    }

    private boolean decodeBulkString(io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.remainingBulkLength
            r1 = -1
            if (r0 == r1) goto L21
            if (r0 == 0) goto L18
            io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1 = new io.netty.handler.codec.redis.BulkStringHeaderRedisMessage
            r1.<init>(r0)
            r4.add(r1)
            io.netty.handler.codec.redis.RedisDecoder$State r0 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_BULK_STRING_CONTENT
            r2.state = r0
            boolean r3 = r2.decodeBulkStringContent(r3, r4)
            return r3
        L18:
            io.netty.handler.codec.redis.RedisDecoder$State r0 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_BULK_STRING_EOL
            r2.state = r0
            boolean r3 = r2.decodeBulkStringEndOfLine(r3, r4)
            return r3
        L21:
            io.netty.handler.codec.redis.FullBulkStringRedisMessage r3 = io.netty.handler.codec.redis.FullBulkStringRedisMessage.NULL_INSTANCE
            r4.add(r3)
            r2.resetDecoder()
            r3 = 1
            return r3
    }

    private boolean decodeBulkStringContent(io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r4 = this;
            int r0 = r5.readableBytes()
            if (r0 == 0) goto L44
            int r1 = r4.remainingBulkLength
            if (r1 != 0) goto Le
            r2 = 2
            if (r0 >= r2) goto Le
            goto L44
        Le:
            int r2 = r1 + 2
            r3 = 1
            if (r0 < r2) goto L2a
            io.netty.buffer.ByteBuf r0 = r5.readSlice(r1)
            readEndOfLine(r5)
            io.netty.handler.codec.redis.DefaultLastBulkStringRedisContent r5 = new io.netty.handler.codec.redis.DefaultLastBulkStringRedisContent
            io.netty.buffer.ByteBuf r0 = r0.retain()
            r5.<init>(r0)
            r6.add(r5)
            r4.resetDecoder()
            return r3
        L2a:
            int r0 = java.lang.Math.min(r1, r0)
            int r1 = r4.remainingBulkLength
            int r1 = r1 - r0
            r4.remainingBulkLength = r1
            io.netty.handler.codec.redis.DefaultBulkStringRedisContent r1 = new io.netty.handler.codec.redis.DefaultBulkStringRedisContent
            io.netty.buffer.ByteBuf r5 = r5.readSlice(r0)
            io.netty.buffer.ByteBuf r5 = r5.retain()
            r1.<init>(r5)
            r6.add(r1)
            return r3
        L44:
            r5 = 0
            return r5
    }

    private boolean decodeBulkStringEndOfLine(io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r2 = this;
            int r0 = r3.readableBytes()
            r1 = 2
            if (r0 >= r1) goto L9
            r3 = 0
            return r3
        L9:
            readEndOfLine(r3)
            io.netty.handler.codec.redis.FullBulkStringRedisMessage r3 = io.netty.handler.codec.redis.FullBulkStringRedisMessage.EMPTY_INSTANCE
            r4.add(r3)
            r2.resetDecoder()
            r3 = 1
            return r3
    }

    private boolean decodeInline(io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = readLine(r3)
            if (r0 != 0) goto L3a
            int r4 = r3.readableBytes()
            int r0 = r2.maxInlineMessageLength
            if (r4 > r0) goto L10
            r3 = 0
            return r3
        L10:
            io.netty.handler.codec.redis.RedisCodecException r4 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "length: "
            r0.append(r1)
            int r3 = r3.readableBytes()
            r0.append(r3)
            java.lang.String r3 = " (expected: <= "
            r0.append(r3)
            int r3 = r2.maxInlineMessageLength
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3a:
            io.netty.handler.codec.redis.RedisMessageType r3 = r2.type
            io.netty.handler.codec.redis.RedisMessage r3 = r2.newInlineRedisMessage(r3, r0)
            r4.add(r3)
            r2.resetDecoder()
            r3 = 1
            return r3
    }

    private boolean decodeLength(io.netty.buffer.ByteBuf r8, java.util.List<java.lang.Object> r9) throws java.lang.Exception {
            r7 = this;
            io.netty.buffer.ByteBuf r0 = readLine(r8)
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            long r0 = r7.parseRedisNumber(r0)
            r2 = -1
            java.lang.String r4 = ")"
            java.lang.String r5 = "length: "
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L7c
            int[] r2 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisMessageType
            io.netty.handler.codec.redis.RedisMessageType r3 = r7.type
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L70
            r3 = 2
            if (r2 != r3) goto L57
            r2 = 536870912(0x20000000, double:2.65249474E-315)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L35
            int r1 = (int) r0
            r7.remainingBulkLength = r1
            boolean r8 = r7.decodeBulkString(r8, r9)
            return r8
        L35:
            io.netty.handler.codec.redis.RedisCodecException r8 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r0)
            java.lang.String r0 = " (expected: <= "
            r9.append(r0)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r9.append(r0)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L57:
            io.netty.handler.codec.redis.RedisCodecException r8 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "bad type: "
            r9.append(r0)
            io.netty.handler.codec.redis.RedisMessageType r0 = r7.type
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L70:
            io.netty.handler.codec.redis.ArrayHeaderRedisMessage r8 = new io.netty.handler.codec.redis.ArrayHeaderRedisMessage
            r8.<init>(r0)
            r9.add(r8)
            r7.resetDecoder()
            return r3
        L7c:
            io.netty.handler.codec.redis.RedisCodecException r8 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r0)
            java.lang.String r0 = " (expected: >= "
            r9.append(r0)
            r0 = -1
            r9.append(r0)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private boolean decodeType(io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2.isReadable()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r0 = r1.decodeInlineCommands
            io.netty.handler.codec.redis.RedisMessageType r2 = io.netty.handler.codec.redis.RedisMessageType.readFrom(r2, r0)
            r1.type = r2
            boolean r2 = r2.isInline()
            if (r2 == 0) goto L19
            io.netty.handler.codec.redis.RedisDecoder$State r2 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_INLINE
            goto L1b
        L19:
            io.netty.handler.codec.redis.RedisDecoder$State r2 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_LENGTH
        L1b:
            r1.state = r2
            r2 = 1
            return r2
    }

    private io.netty.handler.codec.redis.RedisMessage newInlineRedisMessage(io.netty.handler.codec.redis.RedisMessageType r3, io.netty.buffer.ByteBuf r4) {
            r2 = this;
            int[] r0 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisMessageType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L68
            r1 = 4
            if (r0 == r1) goto L53
            r1 = 5
            if (r0 == r1) goto L3e
            r1 = 6
            if (r0 != r1) goto L27
            io.netty.handler.codec.redis.RedisMessagePool r3 = r2.messagePool
            io.netty.handler.codec.redis.IntegerRedisMessage r3 = r3.getInteger(r4)
            if (r3 == 0) goto L1d
            return r3
        L1d:
            io.netty.handler.codec.redis.IntegerRedisMessage r3 = new io.netty.handler.codec.redis.IntegerRedisMessage
            long r0 = r2.parseRedisNumber(r4)
            r3.<init>(r0)
            return r3
        L27:
            io.netty.handler.codec.redis.RedisCodecException r4 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bad type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3e:
            io.netty.handler.codec.redis.RedisMessagePool r3 = r2.messagePool
            io.netty.handler.codec.redis.ErrorRedisMessage r3 = r3.getError(r4)
            if (r3 == 0) goto L47
            return r3
        L47:
            io.netty.handler.codec.redis.ErrorRedisMessage r3 = new io.netty.handler.codec.redis.ErrorRedisMessage
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r4 = r4.toString(r0)
            r3.<init>(r4)
            return r3
        L53:
            io.netty.handler.codec.redis.RedisMessagePool r3 = r2.messagePool
            io.netty.handler.codec.redis.SimpleStringRedisMessage r3 = r3.getSimpleString(r4)
            if (r3 == 0) goto L5c
            return r3
        L5c:
            io.netty.handler.codec.redis.SimpleStringRedisMessage r3 = new io.netty.handler.codec.redis.SimpleStringRedisMessage
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r4 = r4.toString(r0)
            r3.<init>(r4)
            return r3
        L68:
            io.netty.handler.codec.redis.InlineCommandRedisMessage r3 = new io.netty.handler.codec.redis.InlineCommandRedisMessage
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r4 = r4.toString(r0)
            r3.<init>(r4)
            return r3
    }

    private long parsePositiveNumber(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.redis.RedisDecoder$ToPositiveLongProcessor r0 = r2.toPositiveLongProcessor
            r0.reset()
            io.netty.handler.codec.redis.RedisDecoder$ToPositiveLongProcessor r0 = r2.toPositiveLongProcessor
            r3.forEachByte(r0)
            io.netty.handler.codec.redis.RedisDecoder$ToPositiveLongProcessor r3 = r2.toPositiveLongProcessor
            long r0 = r3.content()
            return r0
    }

    private long parseRedisNumber(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            int r0 = r4.readableBytes()
            if (r0 <= 0) goto L14
            int r1 = r4.readerIndex()
            byte r1 = r4.getByte(r1)
            r2 = 45
            if (r1 != r2) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            if (r0 <= r1) goto L49
            int r2 = r1 + 19
            if (r0 > r2) goto L2c
            if (r1 == 0) goto L27
            io.netty.buffer.ByteBuf r4 = r4.skipBytes(r1)
            long r0 = r3.parsePositiveNumber(r4)
            long r0 = -r0
            return r0
        L27:
            long r0 = r3.parsePositiveNumber(r4)
            return r0
        L2c:
            io.netty.handler.codec.redis.RedisCodecException r0 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "too many characters to be a valid RESP Integer: "
            r1.append(r2)
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r4 = r4.toString(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L49:
            io.netty.handler.codec.redis.RedisCodecException r0 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no number to parse: "
            r1.append(r2)
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r4 = r4.toString(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static void readEndOfLine(io.netty.buffer.ByteBuf r3) {
            short r3 = r3.readShort()
            short r0 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            if (r0 != r3) goto L9
            return
        L9:
            byte[] r3 = io.netty.handler.codec.redis.RedisCodecUtil.shortToBytes(r3)
            io.netty.handler.codec.redis.RedisCodecException r0 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "delimiter: ["
            r1.append(r2)
            r2 = 0
            r2 = r3[r2]
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            r2 = 1
            r3 = r3[r2]
            r1.append(r3)
            java.lang.String r3 = "] (expected: \\r\\n)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static io.netty.buffer.ByteBuf readLine(io.netty.buffer.ByteBuf r2) {
            r0 = 2
            boolean r0 = r2.isReadable(r0)
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            io.netty.util.ByteProcessor r0 = io.netty.util.ByteProcessor.FIND_LF
            int r0 = r2.forEachByte(r0)
            if (r0 >= 0) goto L12
            return r1
        L12:
            int r1 = r2.readerIndex()
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            io.netty.buffer.ByteBuf r0 = r2.readSlice(r0)
            readEndOfLine(r2)
            return r0
    }

    private void resetDecoder() {
            r1 = this;
            io.netty.handler.codec.redis.RedisDecoder$State r0 = io.netty.handler.codec.redis.RedisDecoder.State.DECODE_TYPE
            r1.state = r0
            r0 = 0
            r1.remainingBulkLength = r0
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
        L0:
            int[] r2 = io.netty.handler.codec.redis.RedisDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$redis$RedisDecoder$State     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            io.netty.handler.codec.redis.RedisDecoder$State r0 = r1.state     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            int r0 = r0.ordinal()     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            r2 = r2[r0]     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            r0 = 1
            if (r2 == r0) goto L52
            r0 = 2
            if (r2 == r0) goto L4b
            r0 = 3
            if (r2 == r0) goto L44
            r0 = 4
            if (r2 == r0) goto L3d
            r0 = 5
            if (r2 != r0) goto L24
            boolean r2 = r1.decodeBulkStringContent(r3, r4)     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            if (r2 != 0) goto L0
            goto L58
        L20:
            r2 = move-exception
            goto L59
        L22:
            r2 = move-exception
            goto L62
        L24:
            io.netty.handler.codec.redis.RedisCodecException r2 = new io.netty.handler.codec.redis.RedisCodecException     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            r3.<init>()     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            java.lang.String r4 = "Unknown state: "
            r3.append(r4)     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            io.netty.handler.codec.redis.RedisDecoder$State r4 = r1.state     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            r3.append(r4)     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            r2.<init>(r3)     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            throw r2     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
        L3d:
            boolean r2 = r1.decodeBulkStringEndOfLine(r3, r4)     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            if (r2 != 0) goto L0
            goto L58
        L44:
            boolean r2 = r1.decodeLength(r3, r4)     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            if (r2 != 0) goto L0
            goto L58
        L4b:
            boolean r2 = r1.decodeInline(r3, r4)     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            if (r2 != 0) goto L0
            goto L58
        L52:
            boolean r2 = r1.decodeType(r3)     // Catch: java.lang.Exception -> L20 io.netty.handler.codec.redis.RedisCodecException -> L22
            if (r2 != 0) goto L0
        L58:
            return
        L59:
            r1.resetDecoder()
            io.netty.handler.codec.redis.RedisCodecException r3 = new io.netty.handler.codec.redis.RedisCodecException
            r3.<init>(r2)
            throw r3
        L62:
            r1.resetDecoder()
            throw r2
    }
}
