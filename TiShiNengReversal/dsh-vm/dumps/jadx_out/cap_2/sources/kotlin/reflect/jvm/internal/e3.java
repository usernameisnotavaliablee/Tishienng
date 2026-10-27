package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nmoduleByClassLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 moduleByClassLoader.kt\nkotlin/reflect/jvm/internal/ModuleByClassLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e3 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.q3, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            kotlin.reflect.jvm.internal.e3.a = r0
            return
    }

    public static final void a() {
            java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.q3, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> r0 = kotlin.reflect.jvm.internal.e3.a
            r0.clear()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k b(@org.jetbrains.annotations.NotNull java.lang.Class<?> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.ClassLoader r5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.j(r5)
            kotlin.reflect.jvm.internal.q3 r0 = new kotlin.reflect.jvm.internal.q3
            r0.<init>(r5)
            java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.q3, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> r1 = kotlin.reflect.jvm.internal.e3.a
            java.lang.Object r2 = r1.get(r0)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L24
            java.lang.Object r3 = r2.get()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k r3 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) r3
            if (r3 == 0) goto L21
            return r3
        L21:
            r1.remove(r0, r2)
        L24:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k.c
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k r5 = r1.a(r5)
        L2a:
            r1 = 0
            java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.q3, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>> r2 = kotlin.reflect.jvm.internal.e3.a     // Catch: java.lang.Throwable -> L4e
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L4e
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = r2.putIfAbsent(r0, r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L4e
            if (r3 != 0) goto L3e
            r0.a(r1)
            return r5
        L3e:
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L4e
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k r4 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) r4     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L4a
            r0.a(r1)
            return r4
        L4a:
            r2.remove(r0, r3)     // Catch: java.lang.Throwable -> L4e
            goto L2a
        L4e:
            r5 = move-exception
            r0.a(r1)
            throw r5
    }
}
