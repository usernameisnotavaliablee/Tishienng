package i3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.util.concurrent.CancellationException a(java.lang.String r1, java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.util.concurrent.CancellationException b(java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            if (r2 == 0) goto L9
            java.lang.String r1 = java.lang.String.valueOf(r2)
            goto La
        L9:
            r1 = 0
        La:
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static /* synthetic */ void c() {
            return
    }
}
