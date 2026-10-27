package androidx.collection.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LruHashMap<K, V> {

    @org.jetbrains.annotations.NotNull
    private final java.util.LinkedHashMap<K, V> map;

    public LruHashMap() {
            r4 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3 = 0
            r4.<init>(r2, r3, r0, r1)
            return
    }

    public LruHashMap(int r3, float r4) {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 1
            r0.<init>(r3, r4, r1)
            r2.map = r0
            return
    }

    public /* synthetic */ LruHashMap(int r1, float r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L6
            r1 = 16
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 1061158912(0x3f400000, float:0.75)
        Lc:
            r0.<init>(r1, r2)
            return
    }

    public LruHashMap(@org.jetbrains.annotations.NotNull androidx.collection.internal.LruHashMap<? extends K, V> r5) {
            r4 = this;
            java.lang.String r0 = "original"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 3
            r1 = 0
            r2 = 0
            r3 = 0
            r4.<init>(r2, r3, r0, r1)
            java.util.Set r5 = r5.getEntries()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4.put(r1, r0)
            goto L14
        L2c:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final V get(@org.jetbrains.annotations.NotNull K r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashMap<K, V> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
            r2 = this;
            java.util.LinkedHashMap<K, V> r0 = r2.map
            java.util.Set r0 = r0.entrySet()
            java.lang.String r1 = "map.entries"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            java.util.LinkedHashMap<K, V> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final V put(@org.jetbrains.annotations.NotNull K r2, @org.jetbrains.annotations.NotNull V r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.LinkedHashMap<K, V> r0 = r1.map
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final V remove(@org.jetbrains.annotations.NotNull K r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashMap<K, V> r0 = r1.map
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }
}
