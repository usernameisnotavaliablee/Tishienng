package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class i<K, V> extends java.util.AbstractMap<K, V> implements java.util.Map<K, V>, l3.g {
    protected i() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.util.Set<java.util.Map.Entry<K, V>> a();

    public /* bridge */ java.util.Set<java.lang.Object> c() {
            r1 = this;
            java.util.Set r0 = super.keySet()
            return r0
    }

    public /* bridge */ int d() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    public /* bridge */ java.util.Collection<java.lang.Object> e() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.a()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.c()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.jetbrains.annotations.Nullable
    public abstract V put(K r1, V r2);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.d()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.e()
            return r0
    }
}
