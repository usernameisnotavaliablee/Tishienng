package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.l {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.h.a c = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.f d = null;
    private boolean a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.h$a r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.h$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.h.c = r0
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.f r0 = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.f
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.jvm.internal.h> r1 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.h.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.h.d = r0
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.b
            return r0
    }

    public final boolean b() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public final void c(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.jvm.internal.h> r2 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.h.class
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension"
            kotlin.jvm.internal.g0.n(r5, r1)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.h r5 = (kotlin.reflect.jvm.internal.impl.km.jvm.internal.h) r5
            boolean r1 = r4.a
            boolean r3 = r5.a
            if (r1 == r3) goto L24
            return r2
        L24:
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r1 = r4.b
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L2f
            return r2
        L2f:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.e
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.f getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.f r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.h.d
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.a
            int r0 = kotlin.reflect.jvm.internal.impl.km.f.a(r0)
            int r0 = r0 * 31
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
