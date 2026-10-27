package kotlin.internal.jdk8;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d extends kotlin.internal.jdk7.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
    private static final class a {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.internal.jdk8.d.a a = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public static final java.lang.Integer b = null;

        static {
                kotlin.internal.jdk8.d$a r0 = new kotlin.internal.jdk8.d$a
                r0.<init>()
                kotlin.internal.jdk8.d.a.a = r0
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
                kotlin.internal.jdk8.d.a.b = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements kotlin.time.e {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.time.e
        public kotlin.time.Instant a() {
                r2 = this;
                java.time.Instant r0 = kotlin.internal.jdk8.e.a()
                java.lang.String r1 = "now(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                kotlin.time.Instant r0 = j4.h.b(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements kotlin.time.e {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.time.e
        public kotlin.time.Instant a() {
                r3 = this;
                kotlin.time.Instant$a r0 = kotlin.time.Instant.Companion
                long r1 = java.lang.System.currentTimeMillis()
                kotlin.time.Instant r0 = r0.a(r1)
                return r0
        }
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean f(int r2) {
            r1 = this;
            java.lang.Integer r0 = kotlin.internal.jdk8.d.a.b
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
    @org.jetbrains.annotations.NotNull
    public kotlin.random.Random b() {
            r1 = this;
            r0 = 34
            boolean r0 = r1.f(r0)
            if (r0 == 0) goto Le
            p3.a r0 = new p3.a
            r0.<init>()
            return r0
        Le:
            kotlin.random.Random r0 = super.b()
            return r0
    }

    @Override // kotlin.internal.a
    @org.jetbrains.annotations.Nullable
    public kotlin.text.m c(@org.jetbrains.annotations.NotNull java.util.regex.MatchResult r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "matchResult"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = r5 instanceof java.util.regex.Matcher
            r1 = 0
            if (r0 == 0) goto L12
            java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
            goto L13
        L12:
            r5 = r1
        L13:
            if (r5 == 0) goto L3d
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = kotlin.internal.jdk8.a.a(r5, r6)
            int r3 = kotlin.internal.jdk8.b.a(r5, r6)
            int r3 = r3 + (-1)
            r0.<init>(r2, r3)
            java.lang.Integer r2 = r0.r()
            int r2 = r2.intValue()
            if (r2 < 0) goto L3c
            kotlin.text.m r1 = new kotlin.text.m
            java.lang.String r5 = kotlin.internal.jdk8.c.a(r5, r6)
            java.lang.String r6 = "group(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            r1.<init>(r5, r0)
        L3c:
            return r1
        L3d:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Retrieving groups by name is not supported on this platform."
            r5.<init>(r6)
            throw r5
    }

    @Override // kotlin.internal.a
    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public kotlin.time.e e() {
            r1 = this;
            r0 = 26
            boolean r0 = r1.f(r0)
            if (r0 == 0) goto Le
            kotlin.internal.jdk8.d$b r0 = new kotlin.internal.jdk8.d$b
            r0.<init>()
            return r0
        Le:
            kotlin.internal.jdk8.d$c r0 = new kotlin.internal.jdk8.d$c
            r0.<init>()
            return r0
    }
}
