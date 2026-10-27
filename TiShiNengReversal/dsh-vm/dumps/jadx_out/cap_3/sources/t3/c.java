package t3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements t3.c {

        @org.jetbrains.annotations.NotNull
        public static final t3.c.a a = null;

        static {
                t3.c$a r0 = new t3.c$a
                r0.<init>()
                t3.c.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // t3.c
        public boolean a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // t3.c
        public void b(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.incremental.components.Position r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
                r1 = this;
                java.lang.String r0 = "filePath"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "position"
                kotlin.jvm.internal.g0.p(r3, r2)
                java.lang.String r2 = "scopeFqName"
                kotlin.jvm.internal.g0.p(r4, r2)
                java.lang.String r2 = "scopeKind"
                kotlin.jvm.internal.g0.p(r5, r2)
                java.lang.String r2 = "name"
                kotlin.jvm.internal.g0.p(r6, r2)
                return
        }
    }

    boolean a();

    void b(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.incremental.components.Position r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r4, @org.jetbrains.annotations.NotNull java.lang.String r5);
}
