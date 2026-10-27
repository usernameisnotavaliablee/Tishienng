package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.name.f a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.text.Regex b;

    @org.jetbrains.annotations.Nullable
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.f> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.y, java.lang.String> d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.util.f[] e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements kotlin.jvm.functions.Function1 {
        public static final kotlin.reflect.jvm.internal.impl.util.h.a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.h$a r0 = new kotlin.reflect.jvm.internal.impl.util.h$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.h.a.a = r0
                return
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Void a(kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.y r1 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r1
                java.lang.Void r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements kotlin.jvm.functions.Function1 {
        public static final kotlin.reflect.jvm.internal.impl.util.h.b a = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.h$b r0 = new kotlin.reflect.jvm.internal.impl.util.h$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.h.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Void a(kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.y r1 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r1
                java.lang.Void r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c implements kotlin.jvm.functions.Function1 {
        public static final kotlin.reflect.jvm.internal.impl.util.h.c a = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.h$c r0 = new kotlin.reflect.jvm.internal.impl.util.h$c
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.h.c.a = r0
                return
        }

        c() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Void a(kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.y r1 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r1
                java.lang.Void r1 = r0.a(r1)
                return r1
        }
    }

    public h(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.name.f> r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.util.f[] r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.y, java.lang.String> r9) {
            r6 = this;
            java.lang.String r0 = "nameList"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "checks"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "additionalChecks"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            r5 = r8
            kotlin.reflect.jvm.internal.impl.util.f[] r5 = (kotlin.reflect.jvm.internal.impl.util.f[]) r5
            r1 = 0
            r2 = 0
            r0 = r6
            r3 = r7
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public /* synthetic */ h(java.util.Collection r1, kotlin.reflect.jvm.internal.impl.util.f[] r2, kotlin.jvm.functions.Function1 r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.util.h$c r3 = kotlin.reflect.jvm.internal.impl.util.h.c.a
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    private h(kotlin.reflect.jvm.internal.impl.name.f r1, kotlin.text.Regex r2, java.util.Collection<kotlin.reflect.jvm.internal.impl.name.f> r3, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.y, java.lang.String> r4, kotlin.reflect.jvm.internal.impl.util.f... r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.util.f[] r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.y, java.lang.String> r9) {
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "checks"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "additionalChecks"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            r5 = r8
            kotlin.reflect.jvm.internal.impl.util.f[] r5 = (kotlin.reflect.jvm.internal.impl.util.f[]) r5
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public /* synthetic */ h(kotlin.reflect.jvm.internal.impl.name.f r1, kotlin.reflect.jvm.internal.impl.util.f[] r2, kotlin.jvm.functions.Function1 r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.util.h$a r3 = kotlin.reflect.jvm.internal.impl.util.h.a.a
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    public h(@org.jetbrains.annotations.NotNull kotlin.text.Regex r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.util.f[] r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.y, java.lang.String> r9) {
            r6 = this;
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "checks"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "additionalChecks"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            r5 = r8
            kotlin.reflect.jvm.internal.impl.util.f[] r5 = (kotlin.reflect.jvm.internal.impl.util.f[]) r5
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public /* synthetic */ h(kotlin.text.Regex r1, kotlin.reflect.jvm.internal.impl.util.f[] r2, kotlin.jvm.functions.Function1 r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.util.h$b r3 = kotlin.reflect.jvm.internal.impl.util.h.b.a
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.util.g a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r5) {
            r4 = this;
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.util.f[] r0 = r4.e
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            java.lang.String r3 = r3.a(r5)
            if (r3 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.util.g$b r5 = new kotlin.reflect.jvm.internal.impl.util.g$b
            r5.<init>(r3)
            return r5
        L19:
            int r2 = r2 + 1
            goto L9
        L1c:
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.y, java.lang.String> r0 = r4.d
            java.lang.Object r5 = r0.invoke(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.util.g$b r0 = new kotlin.reflect.jvm.internal.impl.util.g$b
            r0.<init>(r5)
            return r0
        L2c:
            kotlin.reflect.jvm.internal.impl.util.g$c r5 = kotlin.reflect.jvm.internal.impl.util.g.c.b
            return r5
    }

    public final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r4) {
            r3 = this;
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r3.a
            r1 = 0
            if (r0 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.f r2 = r3.a
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L17
            return r1
        L17:
            kotlin.text.Regex r0 = r3.b
            if (r0 == 0) goto L31
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "asString(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            kotlin.text.Regex r2 = r3.b
            boolean r0 = r2.matches(r0)
            if (r0 != 0) goto L31
            return r1
        L31:
            java.util.Collection<kotlin.reflect.jvm.internal.impl.name.f> r0 = r3.c
            if (r0 == 0) goto L40
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L40
            return r1
        L40:
            r4 = 1
            return r4
    }
}
