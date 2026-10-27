package kotlin.properties;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class b<T> implements kotlin.properties.f<java.lang.Object, T> {

    @org.jetbrains.annotations.Nullable
    private T a;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    @org.jetbrains.annotations.NotNull
    public T a(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r4) {
            r2 = this;
            java.lang.String r3 = "property"
            kotlin.jvm.internal.g0.p(r4, r3)
            T r3 = r2.a
            if (r3 == 0) goto La
            return r3
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Property "
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = " should be initialized before get."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // kotlin.properties.f
    public void b(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r2, @org.jetbrains.annotations.NotNull T r3) {
            r0 = this;
            java.lang.String r1 = "property"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "value"
            kotlin.jvm.internal.g0.p(r3, r1)
            r0.a = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NotNullProperty("
            r0.append(r1)
            T r1 = r3.a
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "value="
            r1.append(r2)
            T r2 = r3.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L24
        L22:
            java.lang.String r1 = "value not initialized yet"
        L24:
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
