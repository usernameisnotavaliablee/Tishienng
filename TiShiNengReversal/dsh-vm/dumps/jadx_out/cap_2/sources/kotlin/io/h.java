package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h implements kotlin.sequences.m<java.io.File> {

    @org.jetbrains.annotations.NotNull
    private final java.io.File a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.io.FileWalkDirection b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> d;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.n1> e;
    private final int f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    private static abstract class a extends kotlin.io.h.c {
        public a(@org.jetbrains.annotations.NotNull java.io.File r2) {
                r1 = this;
                java.lang.String r0 = "rootDir"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class b extends kotlin.collections.c<java.io.File> {

        @org.jetbrains.annotations.NotNull
        private final java.util.ArrayDeque<kotlin.io.h.c> c;
        final /* synthetic */ kotlin.io.h d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private final class a extends kotlin.io.h.a {
            private boolean b;

            @org.jetbrains.annotations.Nullable
            private java.io.File[] c;
            private int d;
            private boolean e;
            final /* synthetic */ kotlin.io.h.b f;

            public a(@org.jetbrains.annotations.NotNull kotlin.io.h.b r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootDir"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r1.f = r2
                    r1.<init>(r3)
                    return
            }

            @Override // kotlin.io.h.c
            @org.jetbrains.annotations.Nullable
            public java.io.File b() {
                    r10 = this;
                    boolean r0 = r10.e
                    r1 = 0
                    r2 = 1
                    if (r0 != 0) goto L52
                    java.io.File[] r0 = r10.c
                    if (r0 != 0) goto L52
                    kotlin.io.h$b r0 = r10.f
                    kotlin.io.h r0 = r0.d
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.h.e(r0)
                    if (r0 == 0) goto L25
                    java.io.File r3 = r10.a()
                    java.lang.Object r0 = r0.invoke(r3)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L25
                    return r1
                L25:
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.c = r0
                    if (r0 != 0) goto L52
                    kotlin.io.h$b r0 = r10.f
                    kotlin.io.h r0 = r0.d
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.h.f(r0)
                    if (r0 == 0) goto L50
                    java.io.File r3 = r10.a()
                    kotlin.io.AccessDeniedException r4 = new kotlin.io.AccessDeniedException
                    java.io.File r5 = r10.a()
                    r8 = 2
                    r9 = 0
                    r6 = 0
                    java.lang.String r7 = "Cannot list files in a directory"
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.invoke(r3, r4)
                L50:
                    r10.e = r2
                L52:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L6c
                    int r3 = r10.d
                    kotlin.jvm.internal.g0.m(r0)
                    int r0 = r0.length
                    if (r3 >= r0) goto L6c
                    java.io.File[] r0 = r10.c
                    kotlin.jvm.internal.g0.m(r0)
                    int r1 = r10.d
                    int r2 = r1 + 1
                    r10.d = r2
                    r0 = r0[r1]
                    return r0
                L6c:
                    boolean r0 = r10.b
                    if (r0 != 0) goto L77
                    r10.b = r2
                    java.io.File r0 = r10.a()
                    return r0
                L77:
                    kotlin.io.h$b r0 = r10.f
                    kotlin.io.h r0 = r0.d
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L88
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L88:
                    return r1
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: kotlin.io.h$b$b, reason: collision with other inner class name */
        private final class C0019b extends kotlin.io.h.c {
            private boolean b;
            final /* synthetic */ kotlin.io.h.b c;

            public C0019b(@org.jetbrains.annotations.NotNull kotlin.io.h.b r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootFile"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r1.c = r2
                    r1.<init>(r3)
                    return
            }

            @Override // kotlin.io.h.c
            @org.jetbrains.annotations.Nullable
            public java.io.File b() {
                    r1 = this;
                    boolean r0 = r1.b
                    if (r0 == 0) goto L6
                    r0 = 0
                    return r0
                L6:
                    r0 = 1
                    r1.b = r0
                    java.io.File r0 = r1.a()
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private final class c extends kotlin.io.h.a {
            private boolean b;

            @org.jetbrains.annotations.Nullable
            private java.io.File[] c;
            private int d;
            final /* synthetic */ kotlin.io.h.b e;

            public c(@org.jetbrains.annotations.NotNull kotlin.io.h.b r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootDir"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r1.e = r2
                    r1.<init>(r3)
                    return
            }

            @Override // kotlin.io.h.c
            @org.jetbrains.annotations.Nullable
            public java.io.File b() {
                    r9 = this;
                    boolean r0 = r9.b
                    r1 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.h$b r0 = r9.e
                    kotlin.io.h r0 = r0.d
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.h.e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.b = r0
                    java.io.File r0 = r9.a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.c
                    if (r0 == 0) goto L47
                    int r2 = r9.d
                    kotlin.jvm.internal.g0.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    kotlin.io.h$b r0 = r9.e
                    kotlin.io.h r0 = r0.d
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.c = r0
                    if (r0 != 0) goto L76
                    kotlin.io.h$b r0 = r9.e
                    kotlin.io.h r0 = r0.d
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.h.f(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.g0.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    kotlin.io.h$b r0 = r9.e
                    kotlin.io.h r0 = r0.d
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.c
                    kotlin.jvm.internal.g0.m(r0)
                    int r1 = r9.d
                    int r2 = r1 + 1
                    r9.d = r2
                    r0 = r0[r1]
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final /* synthetic */ class d {
            public static final /* synthetic */ int[] a = null;

            static {
                    kotlin.io.FileWalkDirection[] r0 = kotlin.io.FileWalkDirection.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.TOP_DOWN     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.BOTTOM_UP     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    kotlin.io.h.b.d.a = r0
                    return
            }
        }

        public b(kotlin.io.h r3) {
                r2 = this;
                r2.d = r3
                r2.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r2.c = r0
                java.io.File r1 = kotlin.io.h.h(r3)
                boolean r1 = r1.isDirectory()
                if (r1 == 0) goto L22
                java.io.File r3 = kotlin.io.h.h(r3)
                kotlin.io.h$a r3 = r2.g(r3)
                r0.push(r3)
                return
            L22:
                java.io.File r1 = kotlin.io.h.h(r3)
                boolean r1 = r1.isFile()
                if (r1 == 0) goto L39
                kotlin.io.h$b$b r1 = new kotlin.io.h$b$b
                java.io.File r3 = kotlin.io.h.h(r3)
                r1.<init>(r2, r3)
                r0.push(r1)
                return
            L39:
                r2.c()
                return
        }

        private final kotlin.io.h.a g(java.io.File r3) {
                r2 = this;
                kotlin.io.h r0 = r2.d
                kotlin.io.FileWalkDirection r0 = kotlin.io.h.c(r0)
                int[] r1 = kotlin.io.h.b.d.a
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L20
                r1 = 2
                if (r0 != r1) goto L1a
                kotlin.io.h$b$a r0 = new kotlin.io.h$b$a
                r0.<init>(r2, r3)
                return r0
            L1a:
                kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
                r3.<init>()
                throw r3
            L20:
                kotlin.io.h$b$c r0 = new kotlin.io.h$b$c
                r0.<init>(r2, r3)
                return r0
        }

        private final java.io.File h() {
                r3 = this;
            L0:
                java.util.ArrayDeque<kotlin.io.h$c> r0 = r3.c
                java.lang.Object r0 = r0.peek()
                kotlin.io.h$c r0 = (kotlin.io.h.c) r0
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                java.io.File r1 = r0.b()
                if (r1 != 0) goto L18
                java.util.ArrayDeque<kotlin.io.h$c> r0 = r3.c
                r0.pop()
                goto L0
            L18:
                java.io.File r0 = r0.a()
                boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
                if (r0 != 0) goto L41
                boolean r0 = r1.isDirectory()
                if (r0 == 0) goto L41
                java.util.ArrayDeque<kotlin.io.h$c> r0 = r3.c
                int r0 = r0.size()
                kotlin.io.h r2 = r3.d
                int r2 = kotlin.io.h.d(r2)
                if (r0 < r2) goto L37
                goto L41
            L37:
                java.util.ArrayDeque<kotlin.io.h$c> r0 = r3.c
                kotlin.io.h$a r1 = r3.g(r1)
                r0.push(r1)
                goto L0
            L41:
                return r1
        }

        @Override // kotlin.collections.c
        protected void a() {
                r1 = this;
                java.io.File r0 = r1.h()
                if (r0 == 0) goto La
                r1.e(r0)
                return
            La:
                r1.c()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class c {

        @org.jetbrains.annotations.NotNull
        private final java.io.File a;

        public c(@org.jetbrains.annotations.NotNull java.io.File r2) {
                r1 = this;
                java.lang.String r0 = "root"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.io.File a() {
                r1 = this;
                java.io.File r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public abstract java.io.File b();
    }

    public h(@org.jetbrains.annotations.NotNull java.io.File r11, @org.jetbrains.annotations.NotNull kotlin.io.FileWalkDirection r12) {
            r10 = this;
            java.lang.String r0 = "start"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "direction"
            kotlin.jvm.internal.g0.p(r12, r0)
            r8 = 32
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public /* synthetic */ h(java.io.File r1, kotlin.io.FileWalkDirection r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            kotlin.io.FileWalkDirection r2 = kotlin.io.FileWalkDirection.TOP_DOWN
        L6:
            r0.<init>(r1, r2)
            return
    }

    private h(java.io.File r1, kotlin.io.FileWalkDirection r2, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> r3, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r4, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.n1> r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    /* synthetic */ h(java.io.File r8, kotlin.io.FileWalkDirection r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11, kotlin.jvm.functions.Function2 r12, int r13, int r14, kotlin.jvm.internal.v r15) {
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L6
            kotlin.io.FileWalkDirection r9 = kotlin.io.FileWalkDirection.TOP_DOWN
        L6:
            r2 = r9
            r9 = r14 & 32
            if (r9 == 0) goto L17
            r13 = 2147483647(0x7fffffff, float:NaN)
            r6 = 2147483647(0x7fffffff, float:NaN)
        L11:
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            goto L19
        L17:
            r6 = r13
            goto L11
        L19:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static final /* synthetic */ kotlin.io.FileWalkDirection c(kotlin.io.h r0) {
            kotlin.io.FileWalkDirection r0 = r0.b
            return r0
    }

    public static final /* synthetic */ int d(kotlin.io.h r0) {
            int r0 = r0.f
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 e(kotlin.io.h r0) {
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r0 = r0.c
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 f(kotlin.io.h r0) {
            kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.n1> r0 = r0.e
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 g(kotlin.io.h r0) {
            kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r0 = r0.d
            return r0
    }

    public static final /* synthetic */ java.io.File h(kotlin.io.h r0) {
            java.io.File r0 = r0.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.h i(int r8) {
            r7 = this;
            if (r8 <= 0) goto L13
            kotlin.io.h r0 = new kotlin.io.h
            java.io.File r1 = r7.a
            kotlin.io.FileWalkDirection r2 = r7.b
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r3 = r7.c
            kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r4 = r7.d
            kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.n1> r5 = r7.e
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L13:
            r6 = r8
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "depth must be positive, but was "
            r0.append(r1)
            r0.append(r6)
            r1 = 46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<java.io.File> iterator() {
            r1 = this;
            kotlin.io.h$b r0 = new kotlin.io.h$b
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.h j(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.io.h r1 = new kotlin.io.h
            java.io.File r2 = r8.a
            kotlin.io.FileWalkDirection r3 = r8.b
            kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r5 = r8.d
            kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.n1> r6 = r8.e
            int r7 = r8.f
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.h k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.n1> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.io.h r1 = new kotlin.io.h
            java.io.File r2 = r8.a
            kotlin.io.FileWalkDirection r3 = r8.b
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r4 = r8.c
            kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r5 = r8.d
            int r7 = r8.f
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.h l(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.io.h r1 = new kotlin.io.h
            java.io.File r2 = r8.a
            kotlin.io.FileWalkDirection r3 = r8.b
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r4 = r8.c
            kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.n1> r6 = r8.e
            int r7 = r8.f
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }
}
