package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {

    @org.jetbrains.annotations.NotNull
    private static final java.util.Collection<kotlinx.coroutines.n0> a = null;

    static {
            java.lang.Class<kotlinx.coroutines.n0> r0 = kotlinx.coroutines.n0.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            kotlin.sequences.m r0 = kotlin.sequences.p.j(r0)
            java.util.List r0 = kotlin.sequences.p.I3(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.internal.i.a = r0
            return
    }

    public static final void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.n0 r1) {
            java.util.Collection<kotlinx.coroutines.n0> r0 = kotlinx.coroutines.internal.i.a
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Exception handler was not found via a ServiceLoader"
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlinx.coroutines.n0> b() {
            java.util.Collection<kotlinx.coroutines.n0> r0 = kotlinx.coroutines.internal.i.a
            return r0
    }

    public static final void c(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()
            r1.uncaughtException(r0, r2)
            return
    }
}
