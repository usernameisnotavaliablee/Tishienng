package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n348#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n87#1:112,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class h1<K, V> implements kotlin.collections.g1<K, V> {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<K, V> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<K, V> b;

    public h1(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r3) {
            r1 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "default"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<java.util.Map.Entry<K, V>> a() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<K> c() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    public int d() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            int r0 = r0.size()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<V> e() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.a()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V get(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // kotlin.collections.g1
    @org.jetbrains.annotations.NotNull
    public java.util.Map<K, V> getMap() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.a
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.c()
            return r0
    }

    @Override // java.util.Map
    public V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public boolean remove(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlin.collections.g1
    public V s(K r3) {
            r2 = this;
            java.util.Map r0 = r2.getMap()
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L17
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L17
            kotlin.jvm.functions.Function1<K, V> r0 = r2.b
            java.lang.Object r3 = r0.invoke(r3)
            return r3
        L17:
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.d()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.e()
            return r0
    }
}
