package kotlin.internal.jdk7;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a extends kotlin.internal.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: kotlin.internal.jdk7.a$a, reason: collision with other inner class name */
    private static final class C0017a {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.internal.jdk7.a.C0017a a = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public static final java.lang.Integer b = null;

        static {
                kotlin.internal.jdk7.a$a r0 = new kotlin.internal.jdk7.a$a
                r0.<init>()
                kotlin.internal.jdk7.a.C0017a.a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L20
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L21
            L1f:
            L20:
                r1 = r0
            L21:
                if (r1 == 0) goto L2a
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r0 = r1
            L2a:
                kotlin.internal.jdk7.a.C0017a.b = r0
                return
        }

        private C0017a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean f(int r2) {
            r1 = this;
            java.lang.Integer r0 = kotlin.internal.jdk7.a.C0017a.b
            if (r0 == 0) goto Ld
            int r0 = r0.intValue()
            if (r0 < r2) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    @Override // kotlin.internal.a
    public void a(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 19
            boolean r0 = r1.f(r0)
            if (r0 == 0) goto L16
            r2.addSuppressed(r3)
            return
        L16:
            super.a(r2, r3)
            return
    }

    @Override // kotlin.internal.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Throwable> d(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 19
            boolean r0 = r1.f(r0)
            if (r0 == 0) goto L1b
            java.lang.Throwable[] r2 = r2.getSuppressed()
            java.lang.String r0 = "getSuppressed(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.util.List r2 = kotlin.collections.n.t(r2)
            return r2
        L1b:
            java.util.List r2 = super.d(r2)
            return r2
    }
}
