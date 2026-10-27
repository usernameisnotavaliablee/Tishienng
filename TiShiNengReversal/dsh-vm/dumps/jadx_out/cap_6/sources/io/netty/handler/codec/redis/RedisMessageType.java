package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum RedisMessageType extends java.lang.Enum<io.netty.handler.codec.redis.RedisMessageType> {
    private static final /* synthetic */ io.netty.handler.codec.redis.RedisMessageType[] $VALUES = null;
    public static final io.netty.handler.codec.redis.RedisMessageType ARRAY_HEADER = null;
    public static final io.netty.handler.codec.redis.RedisMessageType BULK_STRING = null;
    public static final io.netty.handler.codec.redis.RedisMessageType ERROR = null;
    public static final io.netty.handler.codec.redis.RedisMessageType INLINE_COMMAND = null;
    public static final io.netty.handler.codec.redis.RedisMessageType INTEGER = null;
    public static final io.netty.handler.codec.redis.RedisMessageType SIMPLE_STRING = null;
    private final boolean inline;
    private final java.lang.Byte value;

    static {
            io.netty.handler.codec.redis.RedisMessageType r0 = new io.netty.handler.codec.redis.RedisMessageType
            java.lang.String r1 = "INLINE_COMMAND"
            r2 = 0
            r3 = 0
            r4 = 1
            r0.<init>(r1, r2, r3, r4)
            io.netty.handler.codec.redis.RedisMessageType.INLINE_COMMAND = r0
            io.netty.handler.codec.redis.RedisMessageType r1 = new io.netty.handler.codec.redis.RedisMessageType
            r3 = 43
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.String r5 = "SIMPLE_STRING"
            r1.<init>(r5, r4, r3, r4)
            io.netty.handler.codec.redis.RedisMessageType.SIMPLE_STRING = r1
            io.netty.handler.codec.redis.RedisMessageType r3 = new io.netty.handler.codec.redis.RedisMessageType
            r5 = 45
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            java.lang.String r6 = "ERROR"
            r7 = 2
            r3.<init>(r6, r7, r5, r4)
            io.netty.handler.codec.redis.RedisMessageType.ERROR = r3
            io.netty.handler.codec.redis.RedisMessageType r5 = new io.netty.handler.codec.redis.RedisMessageType
            r6 = 58
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            java.lang.String r8 = "INTEGER"
            r9 = 3
            r5.<init>(r8, r9, r6, r4)
            io.netty.handler.codec.redis.RedisMessageType.INTEGER = r5
            io.netty.handler.codec.redis.RedisMessageType r6 = new io.netty.handler.codec.redis.RedisMessageType
            r8 = 36
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
            java.lang.String r10 = "BULK_STRING"
            r11 = 4
            r6.<init>(r10, r11, r8, r2)
            io.netty.handler.codec.redis.RedisMessageType.BULK_STRING = r6
            io.netty.handler.codec.redis.RedisMessageType r8 = new io.netty.handler.codec.redis.RedisMessageType
            r10 = 42
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)
            java.lang.String r12 = "ARRAY_HEADER"
            r13 = 5
            r8.<init>(r12, r13, r10, r2)
            io.netty.handler.codec.redis.RedisMessageType.ARRAY_HEADER = r8
            r10 = 6
            io.netty.handler.codec.redis.RedisMessageType[] r10 = new io.netty.handler.codec.redis.RedisMessageType[r10]
            r10[r2] = r0
            r10[r4] = r1
            r10[r7] = r3
            r10[r9] = r5
            r10[r11] = r6
            r10[r13] = r8
            io.netty.handler.codec.redis.RedisMessageType.$VALUES = r10
            return
    }

    RedisMessageType(java.lang.String r1, int r2, java.lang.Byte r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            r0.inline = r4
            return
    }

    public static io.netty.handler.codec.redis.RedisMessageType readFrom(io.netty.buffer.ByteBuf r3, boolean r4) {
            int r0 = r3.readerIndex()
            byte r1 = r3.readByte()
            io.netty.handler.codec.redis.RedisMessageType r1 = valueOf(r1)
            io.netty.handler.codec.redis.RedisMessageType r2 = io.netty.handler.codec.redis.RedisMessageType.INLINE_COMMAND
            if (r1 != r2) goto L1e
            if (r4 == 0) goto L16
            r3.readerIndex(r0)
            return r1
        L16:
            io.netty.handler.codec.redis.RedisCodecException r3 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.String r4 = "Decoding of inline commands is disabled"
            r3.<init>(r4)
            throw r3
        L1e:
            return r1
    }

    private static io.netty.handler.codec.redis.RedisMessageType valueOf(byte r1) {
            r0 = 36
            if (r1 == r0) goto L23
            r0 = 45
            if (r1 == r0) goto L20
            r0 = 58
            if (r1 == r0) goto L1d
            r0 = 42
            if (r1 == r0) goto L1a
            r0 = 43
            if (r1 == r0) goto L17
            io.netty.handler.codec.redis.RedisMessageType r1 = io.netty.handler.codec.redis.RedisMessageType.INLINE_COMMAND
            return r1
        L17:
            io.netty.handler.codec.redis.RedisMessageType r1 = io.netty.handler.codec.redis.RedisMessageType.SIMPLE_STRING
            return r1
        L1a:
            io.netty.handler.codec.redis.RedisMessageType r1 = io.netty.handler.codec.redis.RedisMessageType.ARRAY_HEADER
            return r1
        L1d:
            io.netty.handler.codec.redis.RedisMessageType r1 = io.netty.handler.codec.redis.RedisMessageType.INTEGER
            return r1
        L20:
            io.netty.handler.codec.redis.RedisMessageType r1 = io.netty.handler.codec.redis.RedisMessageType.ERROR
            return r1
        L23:
            io.netty.handler.codec.redis.RedisMessageType r1 = io.netty.handler.codec.redis.RedisMessageType.BULK_STRING
            return r1
    }

    public static io.netty.handler.codec.redis.RedisMessageType valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.redis.RedisMessageType> r0 = io.netty.handler.codec.redis.RedisMessageType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.redis.RedisMessageType r1 = (io.netty.handler.codec.redis.RedisMessageType) r1
            return r1
    }

    public static io.netty.handler.codec.redis.RedisMessageType[] values() {
            io.netty.handler.codec.redis.RedisMessageType[] r0 = io.netty.handler.codec.redis.RedisMessageType.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.redis.RedisMessageType[] r0 = (io.netty.handler.codec.redis.RedisMessageType[]) r0
            return r0
    }

    public boolean isInline() {
            r1 = this;
            boolean r0 = r1.inline
            return r0
    }

    public int length() {
            r1 = this;
            java.lang.Byte r0 = r1.value
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void writeTo(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            java.lang.Byte r0 = r1.value
            if (r0 != 0) goto L5
            return
        L5:
            byte r0 = r0.byteValue()
            r2.writeByte(r0)
            return
    }
}
