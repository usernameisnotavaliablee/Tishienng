package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class InternalThreadLocalMap extends io.netty.util.internal.UnpaddedInternalThreadLocalMap {
    private static final int DEFAULT_ARRAY_LIST_INITIAL_CAPACITY = 8;
    private static final int STRING_BUILDER_INITIAL_SIZE = 0;
    private static final int STRING_BUILDER_MAX_SIZE = 0;
    public static final java.lang.Object UNSET = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private java.util.BitSet cleanerFlags;
    public long rp1;
    public long rp2;
    public long rp3;
    public long rp4;
    public long rp5;
    public long rp6;
    public long rp7;
    public long rp8;
    public long rp9;

    static {
            java.lang.Class<io.netty.util.internal.InternalThreadLocalMap> r0 = io.netty.util.internal.InternalThreadLocalMap.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.InternalThreadLocalMap.logger = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            io.netty.util.internal.InternalThreadLocalMap.UNSET = r1
            java.lang.String r1 = "io.netty.threadLocalMap.stringBuilder.initialSize"
            r2 = 1024(0x400, float:1.435E-42)
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r1, r2)
            io.netty.util.internal.InternalThreadLocalMap.STRING_BUILDER_INITIAL_SIZE = r1
            java.lang.String r2 = "-Dio.netty.threadLocalMap.stringBuilder.initialSize: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.debug(r2, r1)
            java.lang.String r1 = "io.netty.threadLocalMap.stringBuilder.maxSize"
            r2 = 4096(0x1000, float:5.74E-42)
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r1, r2)
            io.netty.util.internal.InternalThreadLocalMap.STRING_BUILDER_MAX_SIZE = r1
            java.lang.String r2 = "-Dio.netty.threadLocalMap.stringBuilder.maxSize: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.debug(r2, r1)
            return
    }

    private InternalThreadLocalMap() {
            r1 = this;
            java.lang.Object[] r0 = newIndexedVariableTable()
            r1.<init>(r0)
            return
    }

    public static void destroy() {
            java.lang.ThreadLocal<io.netty.util.internal.InternalThreadLocalMap> r0 = io.netty.util.internal.UnpaddedInternalThreadLocalMap.slowThreadLocalMap
            r0.remove()
            return
    }

    private void expandIndexedVariableTableAndSet(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Object[] r0 = r4.indexedVariables
            int r1 = r0.length
            int r2 = r5 >>> 1
            r2 = r2 | r5
            int r3 = r2 >>> 2
            r2 = r2 | r3
            int r3 = r2 >>> 4
            r2 = r2 | r3
            int r3 = r2 >>> 8
            r2 = r2 | r3
            int r3 = r2 >>> 16
            r2 = r2 | r3
            int r2 = r2 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            int r2 = r0.length
            java.lang.Object r3 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            java.util.Arrays.fill(r0, r1, r2, r3)
            r0[r5] = r6
            r4.indexedVariables = r0
            return
    }

    private static io.netty.util.internal.InternalThreadLocalMap fastGet(io.netty.util.concurrent.FastThreadLocalThread r1) {
            io.netty.util.internal.InternalThreadLocalMap r0 = r1.threadLocalMap()
            if (r0 != 0) goto Le
            io.netty.util.internal.InternalThreadLocalMap r0 = new io.netty.util.internal.InternalThreadLocalMap
            r0.<init>()
            r1.setThreadLocalMap(r0)
        Le:
            return r0
    }

    public static io.netty.util.internal.InternalThreadLocalMap get() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof io.netty.util.concurrent.FastThreadLocalThread
            if (r1 == 0) goto Lf
            io.netty.util.concurrent.FastThreadLocalThread r0 = (io.netty.util.concurrent.FastThreadLocalThread) r0
            io.netty.util.internal.InternalThreadLocalMap r0 = fastGet(r0)
            return r0
        Lf:
            io.netty.util.internal.InternalThreadLocalMap r0 = slowGet()
            return r0
    }

    public static io.netty.util.internal.InternalThreadLocalMap getIfSet() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof io.netty.util.concurrent.FastThreadLocalThread
            if (r1 == 0) goto Lf
            io.netty.util.concurrent.FastThreadLocalThread r0 = (io.netty.util.concurrent.FastThreadLocalThread) r0
            io.netty.util.internal.InternalThreadLocalMap r0 = r0.threadLocalMap()
            return r0
        Lf:
            java.lang.ThreadLocal<io.netty.util.internal.InternalThreadLocalMap> r0 = io.netty.util.internal.UnpaddedInternalThreadLocalMap.slowThreadLocalMap
            java.lang.Object r0 = r0.get()
            io.netty.util.internal.InternalThreadLocalMap r0 = (io.netty.util.internal.InternalThreadLocalMap) r0
            return r0
    }

    public static int lastVariableIndex() {
            java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.internal.UnpaddedInternalThreadLocalMap.nextIndex
            int r0 = r0.get()
            int r0 = r0 + (-1)
            return r0
    }

    private static java.lang.Object[] newIndexedVariableTable() {
            r0 = 32
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            java.util.Arrays.fill(r0, r1)
            return r0
    }

    public static int nextVariableIndex() {
            java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.internal.UnpaddedInternalThreadLocalMap.nextIndex
            int r1 = r0.getAndIncrement()
            if (r1 < 0) goto L9
            return r1
        L9:
            r0.decrementAndGet()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "too many thread-local indexed variables"
            r0.<init>(r1)
            throw r0
    }

    public static void remove() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof io.netty.util.concurrent.FastThreadLocalThread
            if (r1 == 0) goto Lf
            io.netty.util.concurrent.FastThreadLocalThread r0 = (io.netty.util.concurrent.FastThreadLocalThread) r0
            r1 = 0
            r0.setThreadLocalMap(r1)
            return
        Lf:
            java.lang.ThreadLocal<io.netty.util.internal.InternalThreadLocalMap> r0 = io.netty.util.internal.UnpaddedInternalThreadLocalMap.slowThreadLocalMap
            r0.remove()
            return
    }

    private static io.netty.util.internal.InternalThreadLocalMap slowGet() {
            java.lang.ThreadLocal<io.netty.util.internal.InternalThreadLocalMap> r0 = io.netty.util.internal.UnpaddedInternalThreadLocalMap.slowThreadLocalMap
            java.lang.Object r1 = r0.get()
            io.netty.util.internal.InternalThreadLocalMap r1 = (io.netty.util.internal.InternalThreadLocalMap) r1
            if (r1 != 0) goto L12
            io.netty.util.internal.InternalThreadLocalMap r1 = new io.netty.util.internal.InternalThreadLocalMap
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    public <E> java.util.ArrayList<E> arrayList() {
            r1 = this;
            r0 = 8
            java.util.ArrayList r0 = r1.arrayList(r0)
            return r0
    }

    public <E> java.util.ArrayList<E> arrayList(int r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.arrayList
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.arrayList = r0
            return r0
        Lc:
            r0.clear()
            r0.ensureCapacity(r2)
            return r0
    }

    public java.util.Map<java.nio.charset.Charset, java.nio.charset.CharsetDecoder> charsetDecoderCache() {
            r1 = this;
            java.util.Map<java.nio.charset.Charset, java.nio.charset.CharsetDecoder> r0 = r1.charsetDecoderCache
            if (r0 != 0) goto Lb
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.charsetDecoderCache = r0
        Lb:
            return r0
    }

    public java.util.Map<java.nio.charset.Charset, java.nio.charset.CharsetEncoder> charsetEncoderCache() {
            r1 = this;
            java.util.Map<java.nio.charset.Charset, java.nio.charset.CharsetEncoder> r0 = r1.charsetEncoderCache
            if (r0 != 0) goto Lb
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.charsetEncoderCache = r0
        Lb:
            return r0
    }

    @java.lang.Deprecated
    public io.netty.util.internal.IntegerHolder counterHashCode() {
            r1 = this;
            io.netty.util.internal.IntegerHolder r0 = r1.counterHashCode
            return r0
    }

    public int futureListenerStackDepth() {
            r1 = this;
            int r0 = r1.futureListenerStackDepth
            return r0
    }

    public java.util.Map<java.lang.Class<?>, java.lang.Boolean> handlerSharableCache() {
            r2 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r0 = r2.handlerSharableCache
            if (r0 != 0) goto Lc
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 4
            r0.<init>(r1)
            r2.handlerSharableCache = r0
        Lc:
            return r0
    }

    public java.lang.Object indexedVariable(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.indexedVariables
            int r1 = r0.length
            if (r3 >= r1) goto L8
            r3 = r0[r3]
            return r3
        L8:
            java.lang.Object r3 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            return r3
    }

    public boolean isCleanerFlagSet(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.cleanerFlags
            if (r0 == 0) goto Lc
            boolean r2 = r0.get(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public boolean isIndexedVariableSet(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.indexedVariables
            int r1 = r0.length
            if (r3 >= r1) goto Ld
            r3 = r0[r3]
            java.lang.Object r0 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r3 == r0) goto Ld
            r3 = 1
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public int localChannelReaderStackDepth() {
            r1 = this;
            int r0 = r1.localChannelReaderStackDepth
            return r0
    }

    public io.netty.util.internal.ThreadLocalRandom random() {
            r1 = this;
            io.netty.util.internal.ThreadLocalRandom r0 = r1.random
            if (r0 != 0) goto Lb
            io.netty.util.internal.ThreadLocalRandom r0 = new io.netty.util.internal.ThreadLocalRandom
            r0.<init>()
            r1.random = r0
        Lb:
            return r0
    }

    public java.lang.Object removeIndexedVariable(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.indexedVariables
            int r1 = r0.length
            if (r4 >= r1) goto Lc
            r1 = r0[r4]
            java.lang.Object r2 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            r0[r4] = r2
            return r1
        Lc:
            java.lang.Object r4 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            return r4
    }

    public void setCleanerFlag(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.cleanerFlags
            if (r0 != 0) goto Lb
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r1.cleanerFlags = r0
        Lb:
            java.util.BitSet r0 = r1.cleanerFlags
            r0.set(r2)
            return
    }

    @java.lang.Deprecated
    public void setCounterHashCode(io.netty.util.internal.IntegerHolder r1) {
            r0 = this;
            r0.counterHashCode = r1
            return
    }

    public void setFutureListenerStackDepth(int r1) {
            r0 = this;
            r0.futureListenerStackDepth = r1
            return
    }

    public boolean setIndexedVariable(int r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.indexedVariables
            int r1 = r0.length
            r2 = 1
            if (r4 >= r1) goto L11
            r1 = r0[r4]
            r0[r4] = r5
            java.lang.Object r4 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r1 != r4) goto Lf
            return r2
        Lf:
            r4 = 0
            return r4
        L11:
            r3.expandIndexedVariableTableAndSet(r4, r5)
            return r2
    }

    public void setLocalChannelReaderStackDepth(int r1) {
            r0 = this;
            r0.localChannelReaderStackDepth = r1
            return
    }

    public int size() {
            r7 = this;
            int r0 = r7.futureListenerStackDepth
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            int r3 = r7.localChannelReaderStackDepth
            if (r3 == 0) goto Lf
            int r0 = r0 + 1
        Lf:
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r3 = r7.handlerSharableCache
            if (r3 == 0) goto L15
            int r0 = r0 + 1
        L15:
            io.netty.util.internal.IntegerHolder r3 = r7.counterHashCode
            if (r3 == 0) goto L1b
            int r0 = r0 + 1
        L1b:
            io.netty.util.internal.ThreadLocalRandom r3 = r7.random
            if (r3 == 0) goto L21
            int r0 = r0 + 1
        L21:
            java.util.Map<java.lang.Class<?>, io.netty.util.internal.TypeParameterMatcher> r3 = r7.typeParameterMatcherGetCache
            if (r3 == 0) goto L27
            int r0 = r0 + 1
        L27:
            java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, io.netty.util.internal.TypeParameterMatcher>> r3 = r7.typeParameterMatcherFindCache
            if (r3 == 0) goto L2d
            int r0 = r0 + 1
        L2d:
            java.lang.StringBuilder r3 = r7.stringBuilder
            if (r3 == 0) goto L33
            int r0 = r0 + 1
        L33:
            java.util.Map<java.nio.charset.Charset, java.nio.charset.CharsetEncoder> r3 = r7.charsetEncoderCache
            if (r3 == 0) goto L39
            int r0 = r0 + 1
        L39:
            java.util.Map<java.nio.charset.Charset, java.nio.charset.CharsetDecoder> r3 = r7.charsetDecoderCache
            if (r3 == 0) goto L3f
            int r0 = r0 + 1
        L3f:
            java.util.ArrayList<java.lang.Object> r3 = r7.arrayList
            if (r3 == 0) goto L45
            int r0 = r0 + 1
        L45:
            java.lang.Object[] r3 = r7.indexedVariables
            int r4 = r3.length
        L48:
            if (r2 >= r4) goto L55
            r5 = r3[r2]
            java.lang.Object r6 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r5 == r6) goto L52
            int r0 = r0 + 1
        L52:
            int r2 = r2 + 1
            goto L48
        L55:
            int r0 = r0 - r1
            return r0
    }

    public java.lang.StringBuilder stringBuilder() {
            r3 = this;
            java.lang.StringBuilder r0 = r3.stringBuilder
            if (r0 != 0) goto Le
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = io.netty.util.internal.InternalThreadLocalMap.STRING_BUILDER_INITIAL_SIZE
            r0.<init>(r1)
            r3.stringBuilder = r0
            return r0
        Le:
            int r1 = r0.capacity()
            int r2 = io.netty.util.internal.InternalThreadLocalMap.STRING_BUILDER_MAX_SIZE
            if (r1 <= r2) goto L1e
            int r1 = io.netty.util.internal.InternalThreadLocalMap.STRING_BUILDER_INITIAL_SIZE
            r0.setLength(r1)
            r0.trimToSize()
        L1e:
            r1 = 0
            r0.setLength(r1)
            return r0
    }

    public java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, io.netty.util.internal.TypeParameterMatcher>> typeParameterMatcherFindCache() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, io.netty.util.internal.TypeParameterMatcher>> r0 = r1.typeParameterMatcherFindCache
            if (r0 != 0) goto Lb
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.typeParameterMatcherFindCache = r0
        Lb:
            return r0
    }

    public java.util.Map<java.lang.Class<?>, io.netty.util.internal.TypeParameterMatcher> typeParameterMatcherGetCache() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, io.netty.util.internal.TypeParameterMatcher> r0 = r1.typeParameterMatcherGetCache
            if (r0 != 0) goto Lb
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.typeParameterMatcherGetCache = r0
        Lb:
            return r0
    }
}
