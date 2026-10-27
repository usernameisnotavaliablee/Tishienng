package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ClassValueCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class k<V> extends kotlin.reflect.jvm.internal.a<V> {

    @org.jetbrains.annotations.NotNull
    private volatile kotlin.reflect.jvm.internal.l<V> a;

    public k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "compute"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            kotlin.reflect.jvm.internal.l r0 = new kotlin.reflect.jvm.internal.l
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // kotlin.reflect.jvm.internal.a
    public void a() {
            r1 = this;
            kotlin.reflect.jvm.internal.l<V> r0 = r1.a
            kotlin.reflect.jvm.internal.l r0 = r0.b()
            r1.a = r0
            return
    }

    @Override // kotlin.reflect.jvm.internal.a
    public V b(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.l<V> r0 = r2.a
            java.lang.Object r1 = kotlin.reflect.jvm.internal.i.a(r0, r3)
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L14
            return r1
        L14:
            kotlin.reflect.jvm.internal.j.a(r0, r3)
            java.lang.Object r1 = kotlin.reflect.jvm.internal.i.a(r0, r3)
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L24
            return r1
        L24:
            kotlin.jvm.functions.Function1<java.lang.Class<?>, V> r0 = r0.a
            java.lang.Object r3 = r0.invoke(r3)
            return r3
    }
}
