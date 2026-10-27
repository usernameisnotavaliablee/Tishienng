package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class e0 extends kotlin.d0 {
    public e0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void c(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r1.<init>(r0)
            throw r1
    }

    @kotlin.internal.InlineOnly
    private static final void d(boolean r1, kotlin.jvm.functions.Function0<? extends java.lang.Object> r2) {
            java.lang.String r0 = "lazyMessage"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r1 == 0) goto L8
            return
        L8:
            java.lang.Object r1 = r2.invoke()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T e(T r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r1.<init>(r0)
            throw r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T f(T r1, kotlin.jvm.functions.Function0<? extends java.lang.Object> r2) {
            java.lang.String r0 = "lazyMessage"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r1 == 0) goto L8
            return r1
        L8:
            java.lang.Object r1 = r2.invoke()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.Void g(java.lang.Object r1) {
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @kotlin.internal.InlineOnly
    private static final void h(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r1.<init>(r0)
            throw r1
    }

    @kotlin.internal.InlineOnly
    private static final void i(boolean r1, kotlin.jvm.functions.Function0<? extends java.lang.Object> r2) {
            java.lang.String r0 = "lazyMessage"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r1 == 0) goto L8
            return
        L8:
            java.lang.Object r1 = r2.invoke()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T j(T r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r1.<init>(r0)
            throw r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T k(T r1, kotlin.jvm.functions.Function0<? extends java.lang.Object> r2) {
            java.lang.String r0 = "lazyMessage"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r1 == 0) goto L8
            return r1
        L8:
            java.lang.Object r1 = r2.invoke()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }
}
