package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class MutableMapEntry<K, V> implements java.util.Map.Entry<K, V>, l3.g.a {
    private final int index;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object[] keys;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object[] values;

    public MutableMapEntry(@org.jetbrains.annotations.NotNull java.lang.Object[] r2, @org.jetbrains.annotations.NotNull java.lang.Object[] r3, int r4) {
            r1 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.keys = r2
            r1.values = r3
            r1.index = r4
            return
    }

    public static /* synthetic */ void getKey$annotations() {
            return
    }

    public static /* synthetic */ void getValue$annotations() {
            return
    }

    public final int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    @Override // java.util.Map.Entry
    public K getKey() {
            r2 = this;
            java.lang.Object[] r0 = r2.keys
            int r1 = r2.index
            r0 = r0[r1]
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Object[] getKeys() {
            r1 = this;
            java.lang.Object[] r0 = r1.keys
            return r0
    }

    @Override // java.util.Map.Entry
    public V getValue() {
            r2 = this;
            java.lang.Object[] r0 = r2.values
            int r1 = r2.index
            r0 = r0[r1]
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Object[] getValues() {
            r1 = this;
            java.lang.Object[] r0 = r1.values
            return r0
    }

    @Override // java.util.Map.Entry
    public V setValue(V r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.values
            int r1 = r3.index
            r2 = r0[r1]
            r0[r1] = r4
            return r2
    }
}
