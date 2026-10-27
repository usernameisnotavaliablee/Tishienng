package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class l<V> extends java.lang.ClassValue<java.lang.ref.SoftReference<V>> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.Class<?>, V> a;

    public l(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "compute"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.ref.SoftReference<V> a(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            kotlin.jvm.functions.Function1<java.lang.Class<?>, V> r1 = r2.a
            java.lang.Object r3 = r1.invoke(r3)
            r0.<init>(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.l<V> b() {
            r2 = this;
            kotlin.reflect.jvm.internal.l r0 = new kotlin.reflect.jvm.internal.l
            kotlin.jvm.functions.Function1<java.lang.Class<?>, V> r1 = r2.a
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ java.lang.Object computeValue(java.lang.Class r1) {
            r0 = this;
            java.lang.ref.SoftReference r1 = r0.a(r1)
            return r1
    }
}
