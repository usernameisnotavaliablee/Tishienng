package kotlin.coroutines.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class BaseContinuationImpl implements kotlin.coroutines.e<java.lang.Object>, kotlin.coroutines.jvm.internal.c, java.io.Serializable {

    @org.jetbrains.annotations.Nullable
    private final kotlin.coroutines.e<java.lang.Object> completion;

    public BaseContinuationImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.e<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.completion = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
            r0 = this;
            java.lang.String r1 = "completion"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "create(Any?;Continuation) has not been overridden"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
            r1 = this;
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "create(Continuation) has not been overridden"
            r2.<init>(r0)
            throw r2
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
            r2 = this;
            kotlin.coroutines.e<java.lang.Object> r0 = r2.completion
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.c
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.c r0 = (kotlin.coroutines.jvm.internal.c) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.e<java.lang.Object> getCompletion() {
            r1 = this;
            kotlin.coroutines.e<java.lang.Object> r0 = r1.completion
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            java.lang.StackTraceElement r0 = kotlin.coroutines.jvm.internal.d.e(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected abstract java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r1);

    protected void releaseIntercepted() {
            r0 = this;
            return
    }

    @Override // kotlin.coroutines.e
    public final void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            r0 = r3
        L1:
            kotlin.coroutines.jvm.internal.e.b(r0)
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r0 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r0
            kotlin.coroutines.e<java.lang.Object> r1 = r0.completion
            kotlin.jvm.internal.g0.m(r1)
            java.lang.Object r4 = r0.invokeSuspend(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()     // Catch: java.lang.Throwable -> L1d
            if (r4 != r2) goto L16
            return
        L16:
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = kotlin.Result.m11constructorimpl(r4)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r4 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.g0.a(r4)
            java.lang.Object r4 = kotlin.Result.m11constructorimpl(r4)
        L28:
            r0.releaseIntercepted()
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 == 0) goto L31
            r0 = r1
            goto L1
        L31:
            r1.resumeWith(r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation at "
            r0.append(r1)
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 != 0) goto L18
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
        L18:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
