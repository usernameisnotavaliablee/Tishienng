package kotlin.reflect.jvm.internal.impl.name;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFqNameUnsafe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqNameUnsafe.kt\norg/jetbrains/kotlin/name/FqNameUnsafe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.d.a e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.f f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.regex.Pattern g = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

    @org.jetbrains.annotations.Nullable
    private transient kotlin.reflect.jvm.internal.impl.name.c b;

    @org.jetbrains.annotations.Nullable
    private transient kotlin.reflect.jvm.internal.impl.name.d c;

    @org.jetbrains.annotations.Nullable
    private transient kotlin.reflect.jvm.internal.impl.name.f d;

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
        public final kotlin.reflect.jvm.internal.impl.name.d a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5) {
                r4 = this;
                java.lang.String r0 = "shortName"
                kotlin.jvm.internal.g0.p(r5, r0)
                kotlin.reflect.jvm.internal.impl.name.d r0 = new kotlin.reflect.jvm.internal.impl.name.d
                java.lang.String r1 = r5.b()
                java.lang.String r2 = "asString(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.name.c.d
                kotlin.reflect.jvm.internal.impl.name.d r2 = r2.i()
                r3 = 0
                r0.<init>(r1, r2, r5, r3)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.name.d$a r0 = new kotlin.reflect.jvm.internal.impl.name.d$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.name.d.e = r0
            java.lang.String r0 = "<root>"
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.k(r0)
            java.lang.String r1 = "special(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.name.d.f = r0
            java.lang.String r0 = "\\."
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.lang.String r1 = "compile(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.name.d.g = r0
            return
    }

    public d(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public d(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "safe"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    private d(java.lang.String r1, kotlin.reflect.jvm.internal.impl.name.d r2, kotlin.reflect.jvm.internal.impl.name.f r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.d = r3
            return
    }

    public /* synthetic */ d(java.lang.String r1, kotlin.reflect.jvm.internal.impl.name.d r2, kotlin.reflect.jvm.internal.impl.name.f r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private final void c() {
            r5 = this;
            java.lang.String r0 = r5.a
            int r0 = r5.d(r0)
            if (r0 < 0) goto L2d
            java.lang.String r1 = r5.a
            int r2 = r0 + 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.d(r1)
            r5.d = r1
            kotlin.reflect.jvm.internal.impl.name.d r1 = new kotlin.reflect.jvm.internal.impl.name.d
            java.lang.String r3 = r5.a
            r4 = 0
            java.lang.String r0 = r3.substring(r4, r0)
            kotlin.jvm.internal.g0.o(r0, r2)
            r1.<init>(r0)
            r5.c = r1
            return
        L2d:
            java.lang.String r0 = r5.a
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.d(r0)
            r5.d = r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.name.c.d
            kotlin.reflect.jvm.internal.impl.name.d r0 = r0.i()
            r5.c = r0
            return
    }

    private final int d(java.lang.String r6) {
            r5 = this;
            int r0 = r6.length()
            int r0 = r0 + (-1)
            r1 = 0
        L7:
            r2 = -1
            if (r0 < 0) goto L24
            char r3 = r6.charAt(r0)
            r4 = 46
            if (r3 != r4) goto L15
            if (r1 != 0) goto L15
            return r0
        L15:
            r4 = 96
            if (r3 != r4) goto L1c
            r1 = r1 ^ 1
            goto L22
        L1c:
            r4 = 92
            if (r3 != r4) goto L22
            int r0 = r0 + (-1)
        L22:
            int r0 = r0 + r2
            goto L7
        L24:
            return r2
    }

    private static final java.util.List<kotlin.reflect.jvm.internal.impl.name.f> i(kotlin.reflect.jvm.internal.impl.name.d r1) {
            boolean r0 = r1.e()
            if (r0 == 0) goto Lc
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        Lc:
            kotlin.reflect.jvm.internal.impl.name.d r0 = r1.g()
            java.util.List r0 = i(r0)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.j()
            r0.add(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2.e()
            if (r0 == 0) goto L10
            java.lang.String r0 = r3.b()
            goto L2a
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r1 = r3.b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L2a:
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.name.d r1 = new kotlin.reflect.jvm.internal.impl.name.d
            r1.<init>(r0, r2, r3)
            return r1
    }

    public final boolean e() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.length()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.name.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r1 = r3.a
            kotlin.reflect.jvm.internal.impl.name.d r4 = (kotlin.reflect.jvm.internal.impl.name.d) r4
            java.lang.String r4 = r4.a
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final boolean f() {
            r7 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r7.b
            if (r0 != 0) goto L17
            java.lang.String r1 = r7.a()
            r5 = 6
            r6 = 0
            r2 = 60
            r3 = 0
            r4 = 0
            int r0 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
            if (r0 >= 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.d g() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = r2.c
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = r2.e()
            if (r0 != 0) goto L14
            r2.c()
            kotlin.reflect.jvm.internal.impl.name.d r0 = r2.c
            kotlin.jvm.internal.g0.m(r0)
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "root"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.f> h() {
            r1 = this;
            java.util.List r0 = i(r1)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f j() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.d
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = r2.e()
            if (r0 != 0) goto L14
            r2.c()
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.d
            kotlin.jvm.internal.g0.m(r0)
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "root"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f k() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L9
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.d.f
            return r0
        L9:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.j()
            return r0
    }

    public final boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r11) {
            r10 = this;
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.g0.p(r11, r0)
            boolean r0 = r10.e()
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.lang.String r2 = r10.a
            r6 = 6
            r7 = 0
            r3 = 46
            r4 = 0
            r5 = 0
            int r0 = kotlin.text.u.G3(r2, r3, r4, r5, r6, r7)
            r2 = -1
            if (r0 != r2) goto L22
            java.lang.String r0 = r10.a
            int r0 = r0.length()
        L22:
            r6 = r0
            java.lang.String r4 = r11.b()
            java.lang.String r11 = "asString(...)"
            kotlin.jvm.internal.g0.o(r4, r11)
            int r11 = r4.length()
            if (r6 != r11) goto L42
            java.lang.String r2 = r10.a
            r8 = 16
            r9 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            boolean r11 = kotlin.text.u.s2(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto L42
            r11 = 1
            return r11
        L42:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c m() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.b
            if (r0 != 0) goto Lb
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            r0.<init>(r1)
            r1.b = r0
        Lb:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.d.f
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "asString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
        L12:
            java.lang.String r0 = r2.a
            return r0
    }
}
