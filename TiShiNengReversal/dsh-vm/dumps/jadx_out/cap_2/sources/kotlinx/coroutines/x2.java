package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class x2 implements java.lang.Runnable {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.m0 a;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.p<kotlin.n1> b;

    public x2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super kotlin.n1> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            kotlinx.coroutines.p<kotlin.n1> r0 = r3.b
            kotlinx.coroutines.m0 r1 = r3.a
            kotlin.n1 r2 = kotlin.n1.a
            r0.P(r1, r2)
            return
    }
}
