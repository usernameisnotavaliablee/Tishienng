package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1963#2,14:135\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n38#1:135,14\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.d0 a = null;
    private static final boolean b = false;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.p2 c = null;

    static {
            kotlinx.coroutines.internal.d0 r0 = new kotlinx.coroutines.internal.d0
            r0.<init>()
            kotlinx.coroutines.internal.d0.a = r0
            java.lang.String r1 = "kotlinx.coroutines.fast.service.loader"
            r2 = 1
            kotlinx.coroutines.internal.v0.f(r1, r2)
            kotlinx.coroutines.p2 r0 = r0.a()
            kotlinx.coroutines.internal.d0.c = r0
            return
    }

    private d0() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.p2 a() {
            r7 = this;
            java.lang.Class<kotlinx.coroutines.internal.c0> r0 = kotlinx.coroutines.internal.c0.class
            r1 = 0
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L59
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L59
            kotlin.sequences.m r0 = kotlin.sequences.p.j(r0)     // Catch: java.lang.Throwable -> L59
            java.util.List r0 = kotlin.sequences.p.I3(r0)     // Catch: java.lang.Throwable -> L59
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L59
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r3 != 0) goto L26
            r3 = r1
            goto L4d
        L26:
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L59
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L31
            goto L4d
        L31:
            r4 = r3
            kotlinx.coroutines.internal.c0 r4 = (kotlinx.coroutines.internal.c0) r4     // Catch: java.lang.Throwable -> L59
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L59
        L38:
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L59
            r6 = r5
            kotlinx.coroutines.internal.c0 r6 = (kotlinx.coroutines.internal.c0) r6     // Catch: java.lang.Throwable -> L59
            int r6 = r6.a()     // Catch: java.lang.Throwable -> L59
            if (r4 >= r6) goto L47
            r3 = r5
            r4 = r6
        L47:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L38
        L4d:
            kotlinx.coroutines.internal.c0 r3 = (kotlinx.coroutines.internal.c0) r3     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L5b
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.internal.e0.f(r3, r0)     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L58
            goto L5b
        L58:
            return r0
        L59:
            r0 = move-exception
            goto L61
        L5b:
            r0 = 3
            kotlinx.coroutines.internal.f0 r0 = kotlinx.coroutines.internal.e0.b(r1, r1, r0, r1)     // Catch: java.lang.Throwable -> L59
            return r0
        L61:
            r2 = 2
            kotlinx.coroutines.internal.f0 r0 = kotlinx.coroutines.internal.e0.b(r0, r1, r2, r1)
            return r0
    }
}
