package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class v2<T> extends kotlinx.coroutines.k2 {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.q<T> e;

    public v2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.q<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.z(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // kotlinx.coroutines.f0
    public void z(@org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r2 = this;
            kotlinx.coroutines.l2 r3 = r2.A()
            java.lang.Object r3 = r3.H0()
            boolean r0 = r3 instanceof kotlinx.coroutines.d0
            if (r0 == 0) goto L20
            kotlinx.coroutines.q<T> r0 = r2.e
            kotlin.Result$a r1 = kotlin.Result.Companion
            kotlinx.coroutines.d0 r3 = (kotlinx.coroutines.d0) r3
            java.lang.Throwable r3 = r3.a
            java.lang.Object r3 = kotlin.g0.a(r3)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r0.resumeWith(r3)
            return
        L20:
            kotlinx.coroutines.q<T> r0 = r2.e
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlinx.coroutines.m2.h(r3)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r0.resumeWith(r3)
            return
    }
}
