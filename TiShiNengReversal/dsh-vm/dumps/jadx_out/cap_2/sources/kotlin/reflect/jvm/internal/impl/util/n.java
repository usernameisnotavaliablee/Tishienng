package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n<K, V, T extends V> extends kotlin.reflect.jvm.internal.impl.util.a.AbstractC0077a<K, V, T> implements kotlin.properties.e<kotlin.reflect.jvm.internal.impl.util.a<K, V>, V> {
    public n(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // kotlin.properties.e
    public /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r1, kotlin.reflect.n r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.util.a r1 = (kotlin.reflect.jvm.internal.impl.util.a) r1
            java.lang.Object r1 = r0.d(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public T d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.util.a<K, V> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r3) {
            r1 = this;
            java.lang.String r0 = "thisRef"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "property"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r2 = r1.c(r2)
            return r2
    }
}
