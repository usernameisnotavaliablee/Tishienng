package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class d extends kotlin.random.a implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.random.d.a b = null;
    private static final long serialVersionUID = 0;

    @org.jetbrains.annotations.NotNull
    private final java.util.Random a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
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
            kotlin.random.d$a r0 = new kotlin.random.d$a
            r1 = 0
            r0.<init>(r1)
            kotlin.random.d.b = r0
            return
    }

    public d(@org.jetbrains.annotations.NotNull java.util.Random r2) {
            r1 = this;
            java.lang.String r0 = "impl"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.random.a
    @org.jetbrains.annotations.NotNull
    public java.util.Random a() {
            r1 = this;
            java.util.Random r0 = r1.a
            return r0
    }
}
