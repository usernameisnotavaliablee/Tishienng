package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0 implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
    private final /* synthetic */ kotlin.jvm.functions.Function1 function;

    CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(kotlin.jvm.functions.Function1 r2) {
            r1 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.function = r2
            return
    }

    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.lifecycle.Observer
            r1 = 0
            if (r0 == 0) goto L18
            boolean r0 = r3 instanceof kotlin.jvm.internal.b0
            if (r0 == 0) goto L18
            kotlin.n r0 = r2.getFunctionDelegate()
            kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
            kotlin.n r3 = r3.getFunctionDelegate()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            return r3
        L18:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.n<?> getFunctionDelegate() {
            r1 = this;
            kotlin.jvm.functions.Function1 r0 = r1.function
            return r0
    }

    public final int hashCode() {
            r1 = this;
            kotlin.n r0 = r1.getFunctionDelegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(java.lang.Object r2) {
            r1 = this;
            kotlin.jvm.functions.Function1 r0 = r1.function
            r0.invoke(r2)
            return
    }
}
