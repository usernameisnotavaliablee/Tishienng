package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class FixedRedisMessagePool implements io.netty.handler.codec.redis.RedisMessagePool {
    private static final java.lang.String[] DEFAULT_ERRORS = null;
    private static final java.lang.String[] DEFAULT_SIMPLE_STRINGS = null;
    public static final io.netty.handler.codec.redis.FixedRedisMessagePool INSTANCE = null;
    private static final long MAX_CACHED_INTEGER_NUMBER = 128;
    private static final long MIN_CACHED_INTEGER_NUMBER = -1;
    private static final int SIZE_CACHED_INTEGER_NUMBER = 129;
    private final java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.ErrorRedisMessage> byteBufToErrors;
    private final java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.IntegerRedisMessage> byteBufToIntegers;
    private final java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.SimpleStringRedisMessage> byteBufToSimpleStrings;
    private final io.netty.util.collection.LongObjectMap<byte[]> longToByteBufs;
    private final io.netty.util.collection.LongObjectMap<io.netty.handler.codec.redis.IntegerRedisMessage> longToIntegers;
    private final java.util.Map<java.lang.String, io.netty.handler.codec.redis.ErrorRedisMessage> stringToErrors;
    private final java.util.Map<java.lang.String, io.netty.handler.codec.redis.SimpleStringRedisMessage> stringToSimpleStrings;

    static {
            java.lang.String r0 = "PONG"
            java.lang.String r1 = "QUEUED"
            java.lang.String r2 = "OK"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            io.netty.handler.codec.redis.FixedRedisMessagePool.DEFAULT_SIMPLE_STRINGS = r0
            java.lang.String r16 = "READONLY You can't write against a read only slave."
            java.lang.String r17 = "WRONGTYPE Operation against a key holding the wrong kind of value"
            java.lang.String r1 = "ERR"
            java.lang.String r2 = "ERR index out of range"
            java.lang.String r3 = "ERR no such key"
            java.lang.String r4 = "ERR source and destination objects are the same"
            java.lang.String r5 = "ERR syntax error"
            java.lang.String r6 = "BUSY Redis is busy running a script. You can only call SCRIPT KILL or SHUTDOWN NOSAVE."
            java.lang.String r7 = "BUSYKEY Target key name already exists."
            java.lang.String r8 = "EXECABORT Transaction discarded because of previous errors."
            java.lang.String r9 = "LOADING Redis is loading the dataset in memory"
            java.lang.String r10 = "MASTERDOWN Link with MASTER is down and slave-serve-stale-data is set to 'no'."
            java.lang.String r11 = "MISCONF Redis is configured to save RDB snapshots, but is currently not able to persist on disk. Commands that may modify the data set are disabled. Please check Redis logs for details about the error."
            java.lang.String r12 = "NOAUTH Authentication required."
            java.lang.String r13 = "NOREPLICAS Not enough good slaves to write."
            java.lang.String r14 = "NOSCRIPT No matching script. Please use EVAL."
            java.lang.String r15 = "OOM command not allowed when used memory > 'maxmemory'."
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            io.netty.handler.codec.redis.FixedRedisMessagePool.DEFAULT_ERRORS = r0
            io.netty.handler.codec.redis.FixedRedisMessagePool r0 = new io.netty.handler.codec.redis.FixedRedisMessagePool
            r0.<init>()
            io.netty.handler.codec.redis.FixedRedisMessagePool.INSTANCE = r0
            return
    }

    private FixedRedisMessagePool() {
            r9 = this;
            r9.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.lang.String[] r1 = io.netty.handler.codec.redis.FixedRedisMessagePool.DEFAULT_SIMPLE_STRINGS
            int r2 = r1.length
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r3)
            r9.byteBufToSimpleStrings = r0
            java.util.HashMap r0 = new java.util.HashMap
            int r2 = r1.length
            r0.<init>(r2, r3)
            r9.stringToSimpleStrings = r0
            int r0 = r1.length
            r2 = 0
            r4 = 0
        L1a:
            if (r4 >= r0) goto L42
            r5 = r1[r4]
            java.nio.charset.Charset r6 = io.netty.util.CharsetUtil.UTF_8
            byte[] r6 = r5.getBytes(r6)
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.wrappedBuffer(r6)
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.unreleasableBuffer(r6)
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.unmodifiableBuffer(r6)
            io.netty.handler.codec.redis.SimpleStringRedisMessage r7 = new io.netty.handler.codec.redis.SimpleStringRedisMessage
            r7.<init>(r5)
            java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.SimpleStringRedisMessage> r8 = r9.byteBufToSimpleStrings
            r8.put(r6, r7)
            java.util.Map<java.lang.String, io.netty.handler.codec.redis.SimpleStringRedisMessage> r6 = r9.stringToSimpleStrings
            r6.put(r5, r7)
            int r4 = r4 + 1
            goto L1a
        L42:
            java.util.HashMap r0 = new java.util.HashMap
            java.lang.String[] r1 = io.netty.handler.codec.redis.FixedRedisMessagePool.DEFAULT_ERRORS
            int r4 = r1.length
            r0.<init>(r4, r3)
            r9.byteBufToErrors = r0
            java.util.HashMap r0 = new java.util.HashMap
            int r4 = r1.length
            r0.<init>(r4, r3)
            r9.stringToErrors = r0
            int r0 = r1.length
        L55:
            if (r2 >= r0) goto L7d
            r4 = r1[r2]
            java.nio.charset.Charset r5 = io.netty.util.CharsetUtil.UTF_8
            byte[] r5 = r4.getBytes(r5)
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.wrappedBuffer(r5)
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.unreleasableBuffer(r5)
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.unmodifiableBuffer(r5)
            io.netty.handler.codec.redis.ErrorRedisMessage r6 = new io.netty.handler.codec.redis.ErrorRedisMessage
            r6.<init>(r4)
            java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.ErrorRedisMessage> r7 = r9.byteBufToErrors
            r7.put(r5, r6)
            java.util.Map<java.lang.String, io.netty.handler.codec.redis.ErrorRedisMessage> r5 = r9.stringToErrors
            r5.put(r4, r6)
            int r2 = r2 + 1
            goto L55
        L7d:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 129(0x81, float:1.81E-43)
            r0.<init>(r1, r3)
            r9.byteBufToIntegers = r0
            io.netty.util.collection.LongObjectHashMap r0 = new io.netty.util.collection.LongObjectHashMap
            r0.<init>(r1, r3)
            r9.longToIntegers = r0
            io.netty.util.collection.LongObjectHashMap r0 = new io.netty.util.collection.LongObjectHashMap
            r0.<init>(r1, r3)
            r9.longToByteBufs = r0
            r0 = -1
        L96:
            r2 = 128(0x80, double:6.3E-322)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc4
            byte[] r2 = io.netty.handler.codec.redis.RedisCodecUtil.longToAsciiBytes(r0)
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.wrappedBuffer(r2)
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.unreleasableBuffer(r3)
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.unmodifiableBuffer(r3)
            io.netty.handler.codec.redis.IntegerRedisMessage r4 = new io.netty.handler.codec.redis.IntegerRedisMessage
            r4.<init>(r0)
            java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.IntegerRedisMessage> r5 = r9.byteBufToIntegers
            r5.put(r3, r4)
            io.netty.util.collection.LongObjectMap<io.netty.handler.codec.redis.IntegerRedisMessage> r3 = r9.longToIntegers
            r3.put(r0, r4)
            io.netty.util.collection.LongObjectMap<byte[]> r3 = r9.longToByteBufs
            r3.put(r0, r2)
            r2 = 1
            long r0 = r0 + r2
            goto L96
        Lc4:
            return
    }

    @Override // io.netty.handler.codec.redis.RedisMessagePool
    public byte[] getByteBufOfInteger(long r2) {
            r1 = this;
            io.netty.util.collection.LongObjectMap<byte[]> r0 = r1.longToByteBufs
            java.lang.Object r2 = r0.get(r2)
            byte[] r2 = (byte[]) r2
            return r2
    }

    @Override // io.netty.handler.codec.redis.RedisMessagePool
    public io.netty.handler.codec.redis.ErrorRedisMessage getError(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.ErrorRedisMessage> r0 = r1.byteBufToErrors
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.redis.ErrorRedisMessage r2 = (io.netty.handler.codec.redis.ErrorRedisMessage) r2
            return r2
    }

    @Override // io.netty.handler.codec.redis.RedisMessagePool
    public io.netty.handler.codec.redis.ErrorRedisMessage getError(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, io.netty.handler.codec.redis.ErrorRedisMessage> r0 = r1.stringToErrors
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.redis.ErrorRedisMessage r2 = (io.netty.handler.codec.redis.ErrorRedisMessage) r2
            return r2
    }

    @Override // io.netty.handler.codec.redis.RedisMessagePool
    public io.netty.handler.codec.redis.IntegerRedisMessage getInteger(long r2) {
            r1 = this;
            io.netty.util.collection.LongObjectMap<io.netty.handler.codec.redis.IntegerRedisMessage> r0 = r1.longToIntegers
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.redis.IntegerRedisMessage r2 = (io.netty.handler.codec.redis.IntegerRedisMessage) r2
            return r2
    }

    @Override // io.netty.handler.codec.redis.RedisMessagePool
    public io.netty.handler.codec.redis.IntegerRedisMessage getInteger(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.IntegerRedisMessage> r0 = r1.byteBufToIntegers
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.redis.IntegerRedisMessage r2 = (io.netty.handler.codec.redis.IntegerRedisMessage) r2
            return r2
    }

    @Override // io.netty.handler.codec.redis.RedisMessagePool
    public io.netty.handler.codec.redis.SimpleStringRedisMessage getSimpleString(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            java.util.Map<io.netty.buffer.ByteBuf, io.netty.handler.codec.redis.SimpleStringRedisMessage> r0 = r1.byteBufToSimpleStrings
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.redis.SimpleStringRedisMessage r2 = (io.netty.handler.codec.redis.SimpleStringRedisMessage) r2
            return r2
    }

    @Override // io.netty.handler.codec.redis.RedisMessagePool
    public io.netty.handler.codec.redis.SimpleStringRedisMessage getSimpleString(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, io.netty.handler.codec.redis.SimpleStringRedisMessage> r0 = r1.stringToSimpleStrings
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.redis.SimpleStringRedisMessage r2 = (io.netty.handler.codec.redis.SimpleStringRedisMessage) r2
            return r2
    }
}
