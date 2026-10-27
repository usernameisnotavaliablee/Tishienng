package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class j0 {
    public j0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.Void a() {
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.Void b(java.lang.String r3) {
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An operation is not implemented: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> T c(T r1, kotlin.jvm.functions.Function1<? super T, kotlin.n1> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2.invoke(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T d(T r1, kotlin.jvm.functions.Function1<? super T, kotlin.n1> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2.invoke(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T, R> R e(T r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r1 = r2.invoke(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final void f(int r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r3) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
        L6:
            if (r0 >= r2) goto L12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3.invoke(r1)
            int r0 = r0 + 1
            goto L6
        L12:
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T, R> R g(T r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r1 = r2.invoke(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <R> R h(kotlin.jvm.functions.Function0<? extends R> r1) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.invoke()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> T i(T r1, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L12
            return r1
        L12:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> T j(T r1, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L12
            return r1
        L12:
            r1 = 0
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T, R> R k(T r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r1 = r2.invoke(r1)
            return r1
    }
}
