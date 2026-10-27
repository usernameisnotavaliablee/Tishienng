package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s1 {
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.CancellationException a(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    public static final void b(@org.jetbrains.annotations.NotNull java.lang.Throwable r0, @org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            kotlin.l.a(r0, r1)
            return
    }
}
