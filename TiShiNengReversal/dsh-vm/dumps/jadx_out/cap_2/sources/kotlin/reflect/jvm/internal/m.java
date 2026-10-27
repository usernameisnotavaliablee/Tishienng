package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n72#2,2:99\n1#3:101\n*S KotlinDebug\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n*L\n92#1:99,2\n92#1:101\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class m<V> extends kotlin.reflect.jvm.internal.a<V> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Class<?>, V> a;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, V> b;

    public m(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "compute"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.b = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.a
    public void a() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, V> r0 = r1.b
            r0.clear()
            return
    }

    @Override // kotlin.reflect.jvm.internal.a
    public V b(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, V> r0 = r2.b
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L1b
            kotlin.jvm.functions.Function1<java.lang.Class<?>, V> r1 = r2.a
            java.lang.Object r1 = r1.invoke(r3)
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            return r3
        L1b:
            return r1
    }
}
