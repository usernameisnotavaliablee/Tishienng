package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n23#3,3:357\n23#3,3:361\n23#3,3:365\n23#3,3:369\n23#3,3:373\n23#3,3:377\n23#3,3:381\n23#3,3:385\n23#3,3:389\n23#3,3:393\n23#3,3:397\n23#3,3:401\n23#3,3:405\n23#3,3:409\n23#3,3:415\n26#4:360\n26#4:364\n26#4:368\n26#4:372\n26#4:376\n26#4:380\n26#4:384\n26#4:388\n26#4:392\n26#4:396\n26#4:400\n26#4:404\n26#4:408\n26#4:412\n26#4:418\n1855#5,2:413\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n65#1:357,3\n78#1:361,3\n95#1:365,3\n122#1:369,3\n151#1:373,3\n180#1:377,3\n255#1:381,3\n262#1:385,3\n268#1:389,3\n274#1:393,3\n279#1:397,3\n284#1:401,3\n289#1:405,3\n299#1:409,3\n308#1:415,3\n65#1:360\n78#1:364\n95#1:368\n122#1:372\n151#1:376\n180#1:380\n255#1:384\n262#1:388\n268#1:392\n274#1:396\n279#1:400\n284#1:404\n289#1:408\n299#1:412\n308#1:418\n300#1:413,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @org.jetbrains.annotations.NotNull
    private final androidx.collection.internal.Lock lock;

    @org.jetbrains.annotations.NotNull
    private final androidx.collection.internal.LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(@androidx.annotation.IntRange(from = 1, to = Long.MAX_VALUE) int r3) {
            r2 = this;
            r2.<init>()
            r2.maxSize = r3
            if (r3 <= 0) goto L19
            androidx.collection.internal.LruHashMap r3 = new androidx.collection.internal.LruHashMap
            r0 = 0
            r1 = 1061158912(0x3f400000, float:0.75)
            r3.<init>(r0, r1)
            r2.map = r3
            androidx.collection.internal.Lock r3 = new androidx.collection.internal.Lock
            r3.<init>()
            r2.lock = r3
            return
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r3.<init>(r0)
            throw r3
    }

    private final int safeSizeOf(K r3, V r4) {
            r2 = this;
            int r0 = r2.sizeOf(r3, r4)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Negative size: "
            r0.append(r1)
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @org.jetbrains.annotations.Nullable
    protected V create(@org.jetbrains.annotations.NotNull K r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    public final int createCount() {
            r2 = this;
            androidx.collection.internal.Lock r0 = r2.lock
            monitor-enter(r0)
            int r1 = r2.createCount     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    protected void entryRemoved(boolean r1, @org.jetbrains.annotations.NotNull K r2, @org.jetbrains.annotations.NotNull V r3, @org.jetbrains.annotations.Nullable V r4) {
            r0 = this;
            java.lang.String r1 = "key"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "oldValue"
            kotlin.jvm.internal.g0.p(r3, r1)
            return
    }

    public final void evictAll() {
            r1 = this;
            r0 = -1
            r1.trimToSize(r0)
            return
    }

    public final int evictionCount() {
            r2 = this;
            androidx.collection.internal.Lock r0 = r2.lock
            monitor-enter(r0)
            int r1 = r2.evictionCount     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @org.jetbrains.annotations.Nullable
    public final V get(@org.jetbrains.annotations.NotNull K r6) {
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r6, r0)
            androidx.collection.internal.Lock r0 = r5.lock
            monitor-enter(r0)
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            int r6 = r5.hitCount     // Catch: java.lang.Throwable -> L18
            int r6 = r6 + 1
            r5.hitCount = r6     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return r1
        L18:
            r6 = move-exception
            goto L5d
        L1a:
            int r1 = r5.missCount     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + 1
            r5.missCount = r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            java.lang.Object r0 = r5.create(r6)
            if (r0 != 0) goto L29
            r6 = 0
            return r6
        L29:
            androidx.collection.internal.Lock r1 = r5.lock
            monitor-enter(r1)
            int r2 = r5.createCount     // Catch: java.lang.Throwable -> L40
            int r2 = r2 + 1
            r5.createCount = r2     // Catch: java.lang.Throwable -> L40
            androidx.collection.internal.LruHashMap<K, V> r2 = r5.map     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r2.put(r6, r0)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L42
            androidx.collection.internal.LruHashMap<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L40
            r3.put(r6, r2)     // Catch: java.lang.Throwable -> L40
            goto L4d
        L40:
            r6 = move-exception
            goto L5b
        L42:
            int r3 = r5.size     // Catch: java.lang.Throwable -> L40
            int r4 = r5.safeSizeOf(r6, r0)     // Catch: java.lang.Throwable -> L40
            int r3 = r3 + r4
            r5.size = r3     // Catch: java.lang.Throwable -> L40
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L40
        L4d:
            monitor-exit(r1)
            if (r2 == 0) goto L55
            r1 = 0
            r5.entryRemoved(r1, r6, r0, r2)
            return r2
        L55:
            int r6 = r5.maxSize
            r5.trimToSize(r6)
            return r0
        L5b:
            monitor-exit(r1)
            throw r6
        L5d:
            monitor-exit(r0)
            throw r6
    }

    public final int hitCount() {
            r2 = this;
            androidx.collection.internal.Lock r0 = r2.lock
            monitor-enter(r0)
            int r1 = r2.hitCount     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final int maxSize() {
            r2 = this;
            androidx.collection.internal.Lock r0 = r2.lock
            monitor-enter(r0)
            int r1 = r2.maxSize     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final int missCount() {
            r2 = this;
            androidx.collection.internal.Lock r0 = r2.lock
            monitor-enter(r0)
            int r1 = r2.missCount     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @org.jetbrains.annotations.Nullable
    public final V put(@org.jetbrains.annotations.NotNull K r5, @org.jetbrains.annotations.NotNull V r6) {
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r6, r0)
            androidx.collection.internal.Lock r0 = r4.lock
            monitor-enter(r0)
            int r1 = r4.putCount     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 + 1
            r4.putCount = r1     // Catch: java.lang.Throwable -> L2f
            int r1 = r4.size     // Catch: java.lang.Throwable -> L2f
            int r2 = r4.safeSizeOf(r5, r6)     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 + r2
            r4.size = r1     // Catch: java.lang.Throwable -> L2f
            androidx.collection.internal.LruHashMap<K, V> r1 = r4.map     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            int r2 = r4.size     // Catch: java.lang.Throwable -> L2f
            int r3 = r4.safeSizeOf(r5, r1)     // Catch: java.lang.Throwable -> L2f
            int r2 = r2 - r3
            r4.size = r2     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r5 = move-exception
            goto L40
        L31:
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            if (r1 == 0) goto L3a
            r0 = 0
            r4.entryRemoved(r0, r5, r1, r6)
        L3a:
            int r5 = r4.maxSize
            r4.trimToSize(r5)
            return r1
        L40:
            monitor-exit(r0)
            throw r5
    }

    public final int putCount() {
            r2 = this;
            androidx.collection.internal.Lock r0 = r2.lock
            monitor-enter(r0)
            int r1 = r2.putCount     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @org.jetbrains.annotations.Nullable
    public final V remove(@org.jetbrains.annotations.NotNull K r5) {
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.collection.internal.Lock r0 = r4.lock
            monitor-enter(r0)
            androidx.collection.internal.LruHashMap<K, V> r1 = r4.map     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.remove(r5)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            int r2 = r4.size     // Catch: java.lang.Throwable -> L1a
            int r3 = r4.safeSizeOf(r5, r1)     // Catch: java.lang.Throwable -> L1a
            int r2 = r2 - r3
            r4.size = r2     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r5 = move-exception
            goto L27
        L1c:
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            if (r1 == 0) goto L26
            r0 = 0
            r2 = 0
            r4.entryRemoved(r0, r5, r1, r2)
        L26:
            return r1
        L27:
            monitor-exit(r0)
            throw r5
    }

    public void resize(@androidx.annotation.IntRange(from = 1, to = Long.MAX_VALUE) int r3) {
            r2 = this;
            if (r3 <= 0) goto L11
            androidx.collection.internal.Lock r0 = r2.lock
            monitor-enter(r0)
            r2.maxSize = r3     // Catch: java.lang.Throwable -> Le
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            r2.trimToSize(r3)
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L11:
            java.lang.String r3 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    public final int size() {
            r2 = this;
            androidx.collection.internal.Lock r0 = r2.lock
            monitor-enter(r0)
            int r1 = r2.size     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    protected int sizeOf(@org.jetbrains.annotations.NotNull K r2, @org.jetbrains.annotations.NotNull V r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "value"
            kotlin.jvm.internal.g0.p(r3, r2)
            r2 = 1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<K, V> snapshot() {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            androidx.collection.internal.Lock r1 = r5.lock
            monitor-enter(r1)
            androidx.collection.internal.LruHashMap<K, V> r2 = r5.map     // Catch: java.lang.Throwable -> L2a
            java.util.Set r2 = r2.getEntries()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2a
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2a
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L2a
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L2a
            goto L12
        L2a:
            r0 = move-exception
            goto L30
        L2c:
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)
            return r0
        L30:
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            androidx.collection.internal.Lock r0 = r4.lock
            monitor-enter(r0)
            int r1 = r4.hitCount     // Catch: java.lang.Throwable -> Le
            int r2 = r4.missCount     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r1
            if (r2 == 0) goto L10
            int r1 = r1 * 100
            int r1 = r1 / r2
            goto L11
        Le:
            r1 = move-exception
            goto L47
        L10:
            r1 = 0
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r2.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "LruCache[maxSize="
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            int r3 = r4.maxSize     // Catch: java.lang.Throwable -> Le
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = ",hits="
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            int r3 = r4.hitCount     // Catch: java.lang.Throwable -> Le
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = ",misses="
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            int r3 = r4.missCount     // Catch: java.lang.Throwable -> Le
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = ",hitRate="
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            r2.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "%]"
            r2.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r1
        L47:
            monitor-exit(r0)
            throw r1
    }

    public void trimToSize(int r6) {
            r5 = this;
        L0:
            androidx.collection.internal.Lock r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L57
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L57
            goto L16
        L14:
            r6 = move-exception
            goto L5f
        L16:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 <= r6) goto L55
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            goto L55
        L23:
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.getEntries()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = kotlin.collections.f0.J2(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L33
            monitor-exit(r0)
            return
        L33:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            androidx.collection.internal.LruHashMap<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L14
            r3.remove(r2)     // Catch: java.lang.Throwable -> L14
            int r3 = r5.size     // Catch: java.lang.Throwable -> L14
            int r4 = r5.safeSizeOf(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L14
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L14
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L55:
            monitor-exit(r0)
            return
        L57:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L5f:
            monitor-exit(r0)
            throw r6
    }
}
