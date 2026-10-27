package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {
    public static final void a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            java.util.Collection r0 = kotlinx.coroutines.internal.i.b()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.n0 r1 = (kotlinx.coroutines.n0) r1
            r1.s(r2, r3)     // Catch: java.lang.Throwable -> L18 kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed -> L21
            goto L8
        L18:
            r1 = move-exception
            java.lang.Throwable r1 = kotlinx.coroutines.o0.c(r3, r1)
            kotlinx.coroutines.internal.i.c(r1)
            goto L8
        L21:
            return
        L22:
            kotlinx.coroutines.internal.DiagnosticCoroutineContextException r0 = new kotlinx.coroutines.internal.DiagnosticCoroutineContextException     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            kotlin.l.a(r3, r0)     // Catch: java.lang.Throwable -> L2a
        L2a:
            kotlinx.coroutines.internal.i.c(r3)
            return
    }
}
