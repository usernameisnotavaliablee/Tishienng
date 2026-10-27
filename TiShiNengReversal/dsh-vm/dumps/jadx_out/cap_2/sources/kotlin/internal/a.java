package kotlin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
    /* renamed from: kotlin.internal.a$a, reason: collision with other inner class name */
    private static final class C0016a {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.internal.a.C0016a a = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public static final java.lang.reflect.Method b = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public static final java.lang.reflect.Method c = null;

        static {
                kotlin.internal.a$a r0 = new kotlin.internal.a$a
                r0.<init>()
                kotlin.internal.a.C0016a.a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                kotlin.jvm.internal.g0.m(r1)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L13:
                r5 = 0
                if (r4 >= r2) goto L3b
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.g0.g(r7, r8)
                if (r7 == 0) goto L38
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "getParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r7, r8)
                java.lang.Object r7 = kotlin.collections.n.Ut(r7)
                boolean r7 = kotlin.jvm.internal.g0.g(r7, r0)
                if (r7 == 0) goto L38
                goto L3c
            L38:
                int r4 = r4 + 1
                goto L13
            L3b:
                r6 = r5
            L3c:
                kotlin.internal.a.C0016a.b = r6
                int r0 = r1.length
            L3f:
                if (r3 >= r0) goto L54
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.g0.g(r4, r6)
                if (r4 == 0) goto L51
                r5 = r2
                goto L54
            L51:
                int r3 = r3 + 1
                goto L3f
            L54:
                kotlin.internal.a.C0016a.c = r5
                return
        }

        private C0016a() {
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

    public void a(@org.jetbrains.annotations.NotNull java.lang.Throwable r4, @org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
            r3 = this;
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.reflect.Method r0 = kotlin.internal.a.C0016a.b
            if (r0 == 0) goto L17
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r0.invoke(r4, r1)
        L17:
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.random.Random b() {
            r1 = this;
            kotlin.random.b r0 = new kotlin.random.b
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.text.m c(@org.jetbrains.annotations.NotNull java.util.regex.MatchResult r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "matchResult"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "name"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Retrieving groups by name is not supported on this platform."
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Throwable> d(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.reflect.Method r0 = kotlin.internal.a.C0016a.c
            if (r0 == 0) goto L1a
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L1a
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = kotlin.collections.n.t(r3)
            if (r3 != 0) goto L19
            goto L1a
        L19:
            return r3
        L1a:
            java.util.List r3 = kotlin.collections.f0.J()
            return r3
    }

    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public kotlin.time.e e() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "getSystemClock should not be called on the base PlatformImplementations."
            r0.<init>(r1)
            throw r0
    }
}
