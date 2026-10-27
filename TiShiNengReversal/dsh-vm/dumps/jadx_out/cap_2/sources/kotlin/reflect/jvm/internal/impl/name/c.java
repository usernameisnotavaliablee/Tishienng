package kotlin.reflect.jvm.internal.impl.name;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFqName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqName.kt\norg/jetbrains/kotlin/name/FqName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.c.a c = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.c d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.d a;

    @org.jetbrains.annotations.Nullable
    private transient kotlin.reflect.jvm.internal.impl.name.c b;

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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.c a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
                r2 = this;
                java.lang.String r0 = "shortName"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
                kotlin.reflect.jvm.internal.impl.name.d$a r1 = kotlin.reflect.jvm.internal.impl.name.d.e
                kotlin.reflect.jvm.internal.impl.name.d r3 = r1.a(r3)
                r0.<init>(r3)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.name.c$a r0 = new kotlin.reflect.jvm.internal.impl.name.c$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.name.c.c = r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r1 = ""
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.name.c.d = r0
            return
    }

    public c(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.name.d r0 = new kotlin.reflect.jvm.internal.impl.name.d
            r0.<init>(r2, r1)
            r1.a = r0
            return
    }

    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    private c(kotlin.reflect.jvm.internal.impl.name.d r1, kotlin.reflect.jvm.internal.impl.name.c r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            java.lang.String r0 = r0.a()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            kotlin.reflect.jvm.internal.impl.name.d r1 = r2.a
            kotlin.reflect.jvm.internal.impl.name.d r3 = r1.b(r3)
            r0.<init>(r3, r2)
            return r0
    }

    public final boolean c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            boolean r0 = r0.e()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.b
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = r2.c()
            if (r0 != 0) goto L19
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            kotlin.reflect.jvm.internal.impl.name.d r1 = r2.a
            kotlin.reflect.jvm.internal.impl.name.d r1 = r1.g()
            r0.<init>(r1)
            r2.b = r0
            return r0
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "root"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.f> e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            java.util.List r0 = r0.h()
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.name.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.name.d r1 = r3.a
            kotlin.reflect.jvm.internal.impl.name.c r4 = (kotlin.reflect.jvm.internal.impl.name.c) r4
            kotlin.reflect.jvm.internal.impl.name.d r4 = r4.a
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.j()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.k()
            return r0
    }

    public final boolean h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            boolean r2 = r0.l(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.d i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
