package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b extends kotlin.random.a {

    @org.jetbrains.annotations.NotNull
    private final kotlin.random.b.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends java.lang.ThreadLocal<java.util.Random> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        protected java.util.Random a() {
                r1 = this;
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                return r0
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ java.util.Random initialValue() {
                r1 = this;
                java.util.Random r0 = r1.a()
                return r0
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            kotlin.random.b$a r0 = new kotlin.random.b$a
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // kotlin.random.a
    @org.jetbrains.annotations.NotNull
    public java.util.Random a() {
            r2 = this;
            kotlin.random.b$a r0 = r2.a
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }
}
