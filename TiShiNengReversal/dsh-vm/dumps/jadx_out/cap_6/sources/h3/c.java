package h3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.internal.ContractsDsl
@kotlin.contracts.ExperimentalContracts
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static /* synthetic */ h3.a a(h3.c r0, kotlin.n r1, kotlin.contracts.InvocationKind r2, int r3, java.lang.Object r4) {
                if (r4 != 0) goto Ld
                r3 = r3 & 2
                if (r3 == 0) goto L8
                kotlin.contracts.InvocationKind r2 = kotlin.contracts.InvocationKind.UNKNOWN
            L8:
                h3.a r0 = r0.f(r1, r2)
                return r0
            Ld:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: callsInPlace"
                r0.<init>(r1)
                throw r0
        }
    }

    @kotlin.contracts.ExperimentalExtendedContracts
    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    <R> h3.f a(boolean r1, @org.jetbrains.annotations.NotNull kotlin.n<? extends R> r2);

    @kotlin.contracts.ExperimentalExtendedContracts
    @kotlin.internal.ContractsDsl
    void b(boolean r1, @org.jetbrains.annotations.NotNull h3.h r2);

    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    h3.g c();

    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    h3.g d(@org.jetbrains.annotations.Nullable java.lang.Object r1);

    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    h3.h e();

    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    <R> h3.a f(@org.jetbrains.annotations.NotNull kotlin.n<? extends R> r1, @org.jetbrains.annotations.NotNull kotlin.contracts.InvocationKind r2);
}
