package kotlin.coroutines.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {

    @org.jetbrains.annotations.Nullable
    private final kotlin.coroutines.i _context;

    @org.jetbrains.annotations.Nullable
    private transient kotlin.coroutines.e<java.lang.Object> intercepted;

    public ContinuationImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.e<java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            kotlin.coroutines.i r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
    }

    public ContinuationImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.e<java.lang.Object> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.i r2) {
            r0 = this;
            r0.<init>(r1)
            r0._context = r2
            return
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1._context
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<java.lang.Object> intercepted() {
            r2 = this;
            kotlin.coroutines.e<java.lang.Object> r0 = r2.intercepted
            if (r0 != 0) goto L1b
            kotlin.coroutines.i r0 = r2.getContext()
            kotlin.coroutines.f$b r1 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r0 = r0.get(r1)
            kotlin.coroutines.f r0 = (kotlin.coroutines.f) r0
            if (r0 == 0) goto L18
            kotlin.coroutines.e r0 = r0.interceptContinuation(r2)
            if (r0 != 0) goto L19
        L18:
            r0 = r2
        L19:
            r2.intercepted = r0
        L1b:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected void releaseIntercepted() {
            r3 = this;
            kotlin.coroutines.e<java.lang.Object> r0 = r3.intercepted
            if (r0 == 0) goto L18
            if (r0 == r3) goto L18
            kotlin.coroutines.i r1 = r3.getContext()
            kotlin.coroutines.f$b r2 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r1 = r1.get(r2)
            kotlin.jvm.internal.g0.m(r1)
            kotlin.coroutines.f r1 = (kotlin.coroutines.f) r1
            r1.releaseInterceptedContinuation(r0)
        L18:
            kotlin.coroutines.jvm.internal.b r0 = kotlin.coroutines.jvm.internal.b.a
            r3.intercepted = r0
            return
    }
}
