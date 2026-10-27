package kotlin.properties;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class c<V> implements kotlin.properties.f<java.lang.Object, V> {
    private V a;

    public c(V r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    public V a(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r2) {
            r0 = this;
            java.lang.String r1 = "property"
            kotlin.jvm.internal.g0.p(r2, r1)
            V r1 = r0.a
            return r1
    }

    @Override // kotlin.properties.f
    public void b(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r3, V r4) {
            r1 = this;
            java.lang.String r2 = "property"
            kotlin.jvm.internal.g0.p(r3, r2)
            V r2 = r1.a
            boolean r0 = r1.d(r3, r2, r4)
            if (r0 != 0) goto Le
            return
        Le:
            r1.a = r4
            r1.c(r3, r2, r4)
            return
    }

    protected void c(@org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r1, V r2, V r3) {
            r0 = this;
            java.lang.String r2 = "property"
            kotlin.jvm.internal.g0.p(r1, r2)
            return
    }

    protected boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r1, V r2, V r3) {
            r0 = this;
            java.lang.String r2 = "property"
            kotlin.jvm.internal.g0.p(r1, r2)
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ObservableProperty(value="
            r0.append(r1)
            V r1 = r2.a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
