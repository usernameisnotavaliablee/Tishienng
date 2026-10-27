package kotlin.reflect.jvm.internal.impl.name;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nClassId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassId.kt\norg/jetbrains/kotlin/name/ClassId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,141:1\n1#2:142\n231#3:143\n231#3:144\n*S KotlinDebug\n*F\n+ 1 ClassId.kt\norg/jetbrains/kotlin/name/ClassId\n*L\n37#1:143\n47#1:144\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.b.a d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c b;
    private final boolean c;

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

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.b b(kotlin.reflect.jvm.internal.impl.name.b.a r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                kotlin.reflect.jvm.internal.impl.name.b r0 = r0.a(r1, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.b a(@org.jetbrains.annotations.NotNull java.lang.String r10, boolean r11) {
                r9 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.g0.p(r10, r0)
                r5 = 6
                r6 = 0
                r2 = 96
                r3 = 0
                r4 = 0
                r1 = r10
                int r10 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
                r0 = r1
                r6 = -1
                if (r10 != r6) goto L18
                int r10 = r0.length()
            L18:
                r2 = r10
                r4 = 4
                r5 = 0
                java.lang.String r1 = "/"
                r3 = 0
                int r10 = kotlin.text.u.W3(r0, r1, r2, r3, r4, r5)
                if (r10 != r6) goto L32
                r4 = 4
                r5 = 0
                java.lang.String r1 = "`"
                java.lang.String r2 = ""
                r3 = 0
                java.lang.String r10 = kotlin.text.u.x2(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = ""
                goto L5c
            L32:
                r1 = 0
                java.lang.String r2 = r0.substring(r1, r10)
                java.lang.String r1 = "substring(...)"
                kotlin.jvm.internal.g0.o(r2, r1)
                r6 = 4
                r7 = 0
                r3 = 47
                r4 = 46
                r5 = 0
                java.lang.String r2 = kotlin.text.u.w2(r2, r3, r4, r5, r6, r7)
                int r10 = r10 + 1
                java.lang.String r3 = r0.substring(r10)
                kotlin.jvm.internal.g0.o(r3, r1)
                r7 = 4
                r8 = 0
                java.lang.String r4 = "`"
                java.lang.String r5 = ""
                r6 = 0
                java.lang.String r10 = kotlin.text.u.x2(r3, r4, r5, r6, r7, r8)
                r0 = r2
            L5c:
                kotlin.reflect.jvm.internal.impl.name.b r1 = new kotlin.reflect.jvm.internal.impl.name.b
                kotlin.reflect.jvm.internal.impl.name.c r2 = new kotlin.reflect.jvm.internal.impl.name.c
                r2.<init>(r0)
                kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
                r0.<init>(r10)
                r1.<init>(r2, r0, r11)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.b c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
                r2 = this;
                java.lang.String r0 = "topLevelFqName"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.name.b r0 = new kotlin.reflect.jvm.internal.impl.name.b
                kotlin.reflect.jvm.internal.impl.name.c r1 = r3.d()
                kotlin.reflect.jvm.internal.impl.name.f r3 = r3.f()
                r0.<init>(r1, r3)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.name.b$a r0 = new kotlin.reflect.jvm.internal.impl.name.b$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.name.b.d = r0
            return
    }

    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "relativeClassName"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r3.c()
            return
    }

    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "topLevelName"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.c$a r0 = kotlin.reflect.jvm.internal.impl.name.c.c
            kotlin.reflect.jvm.internal.impl.name.c r3 = r0.a(r3)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private static final java.lang.String c(kotlin.reflect.jvm.internal.impl.name.c r4) {
            java.lang.String r4 = r4.a()
            r0 = 2
            r1 = 0
            r2 = 47
            r3 = 0
            boolean r0 = kotlin.text.u.k3(r4, r2, r3, r0, r1)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 96
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
        L23:
            return r4
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.b k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1) {
            kotlin.reflect.jvm.internal.impl.name.b$a r0 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.b r1 = r0.c(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c a() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r3.a
            boolean r0 = r0.c()
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.name.c r0 = r3.b
            return r0
        Lb:
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.name.c r2 = r3.a
            java.lang.String r2 = r2.a()
            r1.append(r2)
            r2 = 46
            r1.append(r2)
            kotlin.reflect.jvm.internal.impl.name.c r2 = r3.b
            java.lang.String r2 = r2.a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b() {
            r8 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r8.a
            boolean r0 = r0.c()
            if (r0 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.name.c r0 = r8.b
            java.lang.String r0 = c(r0)
            return r0
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r8.a
            java.lang.String r2 = r1.a()
            r6 = 4
            r7 = 0
            r3 = 46
            r4 = 47
            r5 = 0
            java.lang.String r1 = kotlin.text.u.w2(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r8.b
            java.lang.String r1 = c(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r1 = r3.a
            kotlin.reflect.jvm.internal.impl.name.c r2 = r3.b
            kotlin.reflect.jvm.internal.impl.name.c r4 = r2.b(r4)
            boolean r2 = r3.c
            r0.<init>(r1, r4, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.name.b e() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r4.b
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
            boolean r1 = r0.c()
            if (r1 != 0) goto L16
            kotlin.reflect.jvm.internal.impl.name.b r1 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r2 = r4.a
            boolean r3 = r4.c
            r1.<init>(r2, r0, r3)
            return r1
        L16:
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.name.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.name.b r5 = (kotlin.reflect.jvm.internal.impl.name.b) r5
            kotlin.reflect.jvm.internal.impl.name.c r1 = r4.a
            kotlin.reflect.jvm.internal.impl.name.c r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlin.reflect.jvm.internal.impl.name.c r1 = r4.b
            kotlin.reflect.jvm.internal.impl.name.c r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.c
            boolean r5 = r5.c
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.b
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.f()
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.c
            int r1 = kotlin.reflect.jvm.internal.impl.km.f.a(r1)
            int r0 = r0 + r1
            return r0
    }

    public final boolean i() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public final boolean j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.b
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
            boolean r0 = r0.c()
            r0 = r0 ^ 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.a
            boolean r0 = r0.c()
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 47
            r0.append(r1)
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1e:
            java.lang.String r0 = r2.b()
            return r0
    }
}
