package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class d extends kotlinx.coroutines.internal.k {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.d a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.d.a b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends java.lang.ClassValue<kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable>> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        protected kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> a(@org.jetbrains.annotations.Nullable java.lang.Class<?> r2) {
                r1 = this;
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>"
                kotlin.jvm.internal.g0.n(r2, r0)
                kotlin.jvm.functions.Function1 r2 = kotlinx.coroutines.internal.n.a(r2)
                return r2
        }

        @Override // java.lang.ClassValue
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> computeValue(java.lang.Class r1) {
                r0 = this;
                kotlin.jvm.functions.Function1 r1 = r0.a(r1)
                return r1
        }
    }

    static {
            kotlinx.coroutines.internal.d r0 = new kotlinx.coroutines.internal.d
            r0.<init>()
            kotlinx.coroutines.internal.d.a = r0
            kotlinx.coroutines.internal.d$a r0 = new kotlinx.coroutines.internal.d$a
            r0.<init>()
            kotlinx.coroutines.internal.d.b = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.k
    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> a(@org.jetbrains.annotations.NotNull java.lang.Class<? extends java.lang.Throwable> r2) {
            r1 = this;
            kotlinx.coroutines.internal.d$a r0 = kotlinx.coroutines.internal.d.b
            java.lang.Object r2 = kotlinx.coroutines.internal.c.a(r0, r2)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            return r2
    }
}
