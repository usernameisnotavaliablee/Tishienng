package kotlin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {
    @kotlin.internal.InlineOnly
    private static final java.lang.Void a() {
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = "Deserialization is supported via proxy only"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.internal.InlineOnly
    private static final void b(kotlin.jvm.functions.Function0<kotlin.n1> r2) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2.invoke()     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            java.lang.Throwable r2 = r0.initCause(r2)
            java.lang.String r0 = "initCause(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            throw r2
    }
}
