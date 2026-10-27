package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class TimeoutCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.k0<kotlinx.coroutines.TimeoutCancellationException> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final transient kotlinx.coroutines.e2 coroutine;

    public TimeoutCancellationException(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TimeoutCancellationException(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.coroutine = r2
            return
    }

    @Override // kotlinx.coroutines.k0
    public /* bridge */ /* synthetic */ kotlinx.coroutines.TimeoutCancellationException createCopy() {
            r1 = this;
            kotlinx.coroutines.TimeoutCancellationException r0 = r1.createCopy2()
            return r0
    }

    @Override // kotlinx.coroutines.k0
    @org.jetbrains.annotations.NotNull
    /* renamed from: createCopy, reason: avoid collision after fix types in other method */
    public kotlinx.coroutines.TimeoutCancellationException createCopy2() {
            r3 = this;
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto La
            java.lang.String r1 = ""
        La:
            kotlinx.coroutines.e2 r2 = r3.coroutine
            r0.<init>(r1, r2)
            r0.initCause(r3)
            return r0
    }
}
