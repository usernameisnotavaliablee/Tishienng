package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,532:1\n378#1,2:536\n386#1:538\n386#1:539\n380#1,4:540\n378#1,2:544\n386#1:546\n380#1,4:547\n386#1:551\n378#1,6:552\n378#1,2:558\n386#1:560\n380#1,4:561\n1#2:533\n1869#3,2:534\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n394#1:536,2\n409#1:538\n412#1:539\n394#1:540,4\n420#1:544,2\n421#1:546\n420#1:547,4\n432#1:551\n440#1:552,6\n463#1:558,2\n464#1:560\n463#1:561,4\n314#1:534,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class y1 extends kotlin.io.path.t0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;
        public static final /* synthetic */ int[] b = null;

        static {
                kotlin.io.path.CopyActionResult[] r0 = kotlin.io.path.CopyActionResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                kotlin.io.path.CopyActionResult r2 = kotlin.io.path.CopyActionResult.CONTINUE     // Catch: java.lang.NoSuchFieldError -> L10
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                r2 = 2
                kotlin.io.path.CopyActionResult r3 = kotlin.io.path.CopyActionResult.TERMINATE     // Catch: java.lang.NoSuchFieldError -> L19
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.io.path.CopyActionResult r3 = kotlin.io.path.CopyActionResult.SKIP_SUBTREE     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r4 = 3
                r0[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.io.path.y1.a.a = r0
                kotlin.io.path.OnErrorResult[] r0 = kotlin.io.path.OnErrorResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.io.path.OnErrorResult r3 = kotlin.io.path.OnErrorResult.TERMINATE     // Catch: java.lang.NoSuchFieldError -> L33
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                kotlin.io.path.OnErrorResult r1 = kotlin.io.path.OnErrorResult.SKIP_SUBTREE     // Catch: java.lang.NoSuchFieldError -> L3b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b
            L3b:
                kotlin.io.path.y1.a.b = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements kotlin.jvm.functions.Function3 {
        public static final kotlin.io.path.y1.b a = null;

        static {
                kotlin.io.path.y1$b r0 = new kotlin.io.path.y1$b
                r0.<init>()
                kotlin.io.path.y1.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Void a(java.nio.file.Path r2, java.nio.file.Path r3, java.lang.Exception r4) {
                r1 = this;
                java.lang.String r0 = "<unused var>"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r2 = "exception"
                kotlin.jvm.internal.g0.p(r4, r2)
                throw r4
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.nio.file.Path r1 = kotlin.io.path.f.a(r1)
                java.nio.file.Path r2 = kotlin.io.path.f.a(r2)
                java.lang.Exception r3 = (java.lang.Exception) r3
                java.lang.Void r1 = r0.a(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c implements kotlin.jvm.functions.Function3 {
        public static final kotlin.io.path.y1.c a = null;

        static {
                kotlin.io.path.y1$c r0 = new kotlin.io.path.y1$c
                r0.<init>()
                kotlin.io.path.y1.c.a = r0
                return
        }

        c() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Void a(java.nio.file.Path r2, java.nio.file.Path r3, java.lang.Exception r4) {
                r1 = this;
                java.lang.String r0 = "<unused var>"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r2 = "exception"
                kotlin.jvm.internal.g0.p(r4, r2)
                throw r4
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.nio.file.Path r1 = kotlin.io.path.f.a(r1)
                java.nio.file.Path r2 = kotlin.io.path.f.a(r2)
                java.lang.Exception r3 = (java.lang.Exception) r3
                java.lang.Void r1 = r0.a(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class d extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> {
        final /* synthetic */ java.util.ArrayList<java.nio.file.Path> a;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlin.io.path.a, java.nio.file.Path, java.nio.file.Path, kotlin.io.path.CopyActionResult> b;
        final /* synthetic */ java.nio.file.Path c;
        final /* synthetic */ java.nio.file.Path d;
        final /* synthetic */ java.nio.file.Path e;
        final /* synthetic */ kotlin.jvm.functions.Function3<java.nio.file.Path, java.nio.file.Path, java.lang.Exception, kotlin.io.path.OnErrorResult> f;

        d(java.util.ArrayList<java.nio.file.Path> r1, kotlin.jvm.functions.Function3<? super kotlin.io.path.a, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r2, java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r6) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                java.lang.String r5 = "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;"
                r6 = 0
                r2 = 2
                java.lang.Class<kotlin.jvm.internal.g0$a> r3 = kotlin.jvm.internal.g0.a.class
                java.lang.String r4 = "copy"
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        public final java.nio.file.FileVisitResult c(java.nio.file.Path r10, java.nio.file.attribute.BasicFileAttributes r11) {
                r9 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.lang.String r0 = "p1"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.util.ArrayList<java.nio.file.Path> r1 = r9.a
                kotlin.jvm.functions.Function3<kotlin.io.path.a, java.nio.file.Path, java.nio.file.Path, kotlin.io.path.CopyActionResult> r2 = r9.b
                java.nio.file.Path r3 = r9.c
                java.nio.file.Path r4 = r9.d
                java.nio.file.Path r5 = r9.e
                kotlin.jvm.functions.Function3<java.nio.file.Path, java.nio.file.Path, java.lang.Exception, kotlin.io.path.OnErrorResult> r6 = r9.f
                r7 = r10
                r8 = r11
                java.nio.file.FileVisitResult r10 = kotlin.io.path.y1.M(r1, r2, r3, r4, r5, r6, r7, r8)
                return r10
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult invoke(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
                r0 = this;
                java.nio.file.Path r1 = kotlin.io.path.f.a(r1)
                java.nio.file.attribute.BasicFileAttributes r2 = kotlin.io.path.z1.a(r2)
                java.nio.file.FileVisitResult r1 = r0.c(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class e extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.nio.file.Path, java.lang.Exception, java.nio.file.FileVisitResult> {
        final /* synthetic */ kotlin.jvm.functions.Function3<java.nio.file.Path, java.nio.file.Path, java.lang.Exception, kotlin.io.path.OnErrorResult> a;
        final /* synthetic */ java.nio.file.Path b;
        final /* synthetic */ java.nio.file.Path c;
        final /* synthetic */ java.nio.file.Path d;

        e(kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r7, java.nio.file.Path r8, java.nio.file.Path r9, java.nio.file.Path r10) {
                r6 = this;
                r6.a = r7
                r6.b = r8
                r6.c = r9
                r6.d = r10
                java.lang.String r4 = "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;"
                r5 = 0
                r1 = 2
                java.lang.Class<kotlin.jvm.internal.g0$a> r2 = kotlin.jvm.internal.g0.a.class
                java.lang.String r3 = "error"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final java.nio.file.FileVisitResult c(java.nio.file.Path r8, java.lang.Exception r9) {
                r7 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "p1"
                kotlin.jvm.internal.g0.p(r9, r0)
                kotlin.jvm.functions.Function3<java.nio.file.Path, java.nio.file.Path, java.lang.Exception, kotlin.io.path.OnErrorResult> r1 = r7.a
                java.nio.file.Path r2 = r7.b
                java.nio.file.Path r3 = r7.c
                java.nio.file.Path r4 = r7.d
                r5 = r8
                r6 = r9
                java.nio.file.FileVisitResult r8 = kotlin.io.path.y1.N(r1, r2, r3, r4, r5, r6)
                return r8
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult invoke(java.nio.file.Path r1, java.lang.Exception r2) {
                r0 = this;
                java.nio.file.Path r1 = kotlin.io.path.f.a(r1)
                java.lang.Exception r2 = (java.lang.Exception) r2
                java.nio.file.FileVisitResult r1 = r0.c(r1, r2)
                return r1
        }
    }

    public y1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.io.path.CopyActionResult H(boolean r0, kotlin.io.path.a r1, java.nio.file.Path r2, java.nio.file.Path r3) {
            kotlin.io.path.CopyActionResult r0 = Z(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.nio.file.FileVisitResult I(java.util.ArrayList r0, kotlin.jvm.functions.Function3 r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5, java.io.IOException r6) {
            java.nio.file.FileVisitResult r0 = b0(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static /* synthetic */ kotlin.n1 J(java.util.ArrayList r0, kotlin.jvm.functions.Function3 r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, kotlin.jvm.functions.Function3 r5, kotlin.io.path.r r6) {
            kotlin.n1 r0 = c0(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static /* synthetic */ java.nio.file.FileVisitResult K(java.util.ArrayList r0, kotlin.jvm.functions.Function3 r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, kotlin.jvm.functions.Function3 r5, java.nio.file.Path r6, java.nio.file.attribute.BasicFileAttributes r7) {
            java.nio.file.FileVisitResult r0 = a0(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static /* synthetic */ kotlin.io.path.CopyActionResult L(boolean r0, kotlin.io.path.a r1, java.nio.file.Path r2, java.nio.file.Path r3) {
            kotlin.io.path.CopyActionResult r0 = Y(r0, r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ java.nio.file.FileVisitResult M(java.util.ArrayList r0, kotlin.jvm.functions.Function3 r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, kotlin.jvm.functions.Function3 r5, java.nio.file.Path r6, java.nio.file.attribute.BasicFileAttributes r7) {
            java.nio.file.FileVisitResult r0 = T(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static final /* synthetic */ java.nio.file.FileVisitResult N(kotlin.jvm.functions.Function3 r0, java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, java.lang.Exception r5) {
            java.nio.file.FileVisitResult r0 = X(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final void O(@org.jetbrains.annotations.NotNull java.nio.file.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = kotlin.io.path.e3.d1(r3)
            int r1 = r0.hashCode()
            r2 = 46
            if (r1 == r2) goto L55
            r2 = 1518(0x5ee, float:2.127E-42)
            if (r1 == r2) goto L4c
            r2 = 45679(0xb26f, float:6.401E-41)
            if (r1 == r2) goto L43
            r2 = 45724(0xb29c, float:6.4073E-41)
            if (r1 == r2) goto L3a
            r2 = 1472(0x5c0, float:2.063E-42)
            if (r1 == r2) goto L31
            r2 = 1473(0x5c1, float:2.064E-42)
            if (r1 == r2) goto L28
            goto L5d
        L28:
            java.lang.String r1 = "./"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L5d
        L31:
            java.lang.String r1 = ".."
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L5d
        L3a:
            java.lang.String r1 = "..\\"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L5d
        L43:
            java.lang.String r1 = "../"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L5d
        L4c:
            java.lang.String r1 = ".\\"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L5d
        L55:
            java.lang.String r1 = "."
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
        L5d:
            return
        L5e:
            kotlin.io.path.IllegalFileNameException r0 = new kotlin.io.path.IllegalFileNameException
            r0.<init>(r3)
            throw r0
    }

    private static final void P(java.nio.file.Path r1, java.nio.file.Path r2) {
            boolean r0 = cn.jiguang.av.d0.a(r1)
            if (r0 != 0) goto L19
            boolean r2 = kotlin.io.path.i0.a(r1, r2)
            if (r2 != 0) goto Ld
            goto L19
        Ld:
            kotlin.io.path.g0.a()
            java.lang.String r1 = r1.toString()
            java.nio.file.FileSystemLoopException r1 = kotlin.io.path.f0.a(r1)
            throw r1
        L19:
            return
    }

    private static final void Q(kotlin.io.path.q r0, kotlin.jvm.functions.Function0<kotlin.n1> r1) {
            r1.invoke()     // Catch: java.lang.Exception -> L4
            return
        L4:
            r1 = move-exception
            r0.a(r1)
            return
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.io.path.ExperimentalPathApi
    @org.jetbrains.annotations.NotNull
    public static final java.nio.file.Path R(@org.jetbrains.annotations.NotNull java.nio.file.Path r9, @org.jetbrains.annotations.NotNull java.nio.file.Path r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlin.io.path.a, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r13) {
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r1)
            java.lang.String r1 = "target"
            kotlin.jvm.internal.g0.p(r10, r1)
            java.lang.String r1 = "onError"
            kotlin.jvm.internal.g0.p(r11, r1)
            java.lang.String r1 = "copyAction"
            kotlin.jvm.internal.g0.p(r13, r1)
            kotlin.io.path.w r1 = kotlin.io.path.w.a
            java.nio.file.LinkOption[] r1 = r1.a(r12)
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = kotlin.io.path.e0.a(r9, r1)
            if (r1 == 0) goto Le0
            r1 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = kotlin.io.path.e0.a(r9, r3)
            if (r3 == 0) goto Lc3
            if (r12 != 0) goto L45
            boolean r3 = cn.jiguang.av.d0.a(r9)
            if (r3 != 0) goto Lc3
        L45:
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = kotlin.io.path.e0.a(r10, r3)
            r5 = 1
            if (r3 == 0) goto L5c
            boolean r3 = cn.jiguang.av.d0.a(r10)
            if (r3 != 0) goto L5c
            r3 = 1
            goto L5d
        L5c:
            r3 = 0
        L5d:
            if (r3 == 0) goto L65
            boolean r7 = kotlin.io.path.i0.a(r9, r10)
            if (r7 != 0) goto Lc3
        L65:
            java.nio.file.FileSystem r7 = com.huawei.secure.android.common.util.w.a(r9)
            java.nio.file.FileSystem r8 = com.huawei.secure.android.common.util.w.a(r10)
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r8)
            if (r7 != 0) goto L74
            goto Lae
        L74:
            if (r3 == 0) goto L87
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r3 = kotlin.io.path.q1.a(r10, r3)
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r1 = kotlin.io.path.q1.a(r9, r1)
            boolean r1 = kotlin.io.path.p1.a(r3, r1)
            goto Lae
        L87:
            java.nio.file.Path r3 = kotlin.io.path.l.a(r10)
            if (r3 == 0) goto Lae
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = kotlin.io.path.e0.a(r3, r7)
            if (r7 == 0) goto Lae
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r3 = kotlin.io.path.q1.a(r3, r7)
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r7 = kotlin.io.path.q1.a(r9, r7)
            boolean r3 = kotlin.io.path.p1.a(r3, r7)
            if (r3 == 0) goto Lae
            r1 = 1
        Lae:
            if (r1 != 0) goto Lb1
            goto Lc3
        Lb1:
            kotlin.io.path.p.a()
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = r10.toString()
            java.lang.String r2 = "Recursively copying a directory into its subdirectory is prohibited."
            java.nio.file.FileSystemException r0 = kotlin.io.path.j1.a(r0, r1, r2)
            throw r0
        Lc3:
            java.nio.file.Path r5 = kotlin.io.path.y.a(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kotlin.io.path.v1 r3 = new kotlin.io.path.v1
            r4 = r10
            r6 = r11
            r2 = r13
            r0 = r3
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r4 = 1
            r5 = 0
            r1 = 0
            r2 = r12
            r3 = r0
            r0 = r9
            kotlin.io.path.e3.O1(r0, r1, r2, r3, r4, r5)
            return r10
        Le0:
            kotlin.io.path.k1.a()
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = r10.toString()
            java.lang.String r2 = "The source file doesn't exist."
            java.nio.file.NoSuchFileException r0 = kotlin.io.path.i1.a(r0, r1, r2)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.io.path.ExperimentalPathApi
    @org.jetbrains.annotations.NotNull
    public static final java.nio.file.Path S(@org.jetbrains.annotations.NotNull java.nio.file.Path r7, @org.jetbrains.annotations.NotNull java.nio.file.Path r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r9, boolean r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r11 == 0) goto L1b
            kotlin.io.path.u1 r11 = new kotlin.io.path.u1
            r11.<init>(r10)
            java.nio.file.Path r7 = R(r7, r8, r9, r10, r11)
            return r7
        L1b:
            r5 = 8
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            java.nio.file.Path r7 = U(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static final java.nio.file.FileVisitResult T(java.util.ArrayList<java.nio.file.Path> r1, kotlin.jvm.functions.Function3<? super kotlin.io.path.a, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r2, java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r6, java.nio.file.Path r7, java.nio.file.attribute.BasicFileAttributes r8) {
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Exception -> L1a
            if (r8 != 0) goto L20
            O(r7)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = kotlin.collections.f0.u3(r1)     // Catch: java.lang.Exception -> L1a
            java.lang.String r8 = "last(...)"
            kotlin.jvm.internal.g0.o(r1, r8)     // Catch: java.lang.Exception -> L1a
            java.nio.file.Path r1 = kotlin.io.path.f.a(r1)     // Catch: java.lang.Exception -> L1a
            P(r7, r1)     // Catch: java.lang.Exception -> L1a
            goto L20
        L1a:
            r0 = move-exception
            r1 = r0
            r2 = r6
            r6 = r7
            r7 = r1
            goto L31
        L20:
            kotlin.io.path.d r1 = kotlin.io.path.d.a     // Catch: java.lang.Exception -> L1a
            java.nio.file.Path r8 = W(r3, r4, r5, r7)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r2.invoke(r1, r7, r8)     // Catch: java.lang.Exception -> L1a
            kotlin.io.path.CopyActionResult r1 = (kotlin.io.path.CopyActionResult) r1     // Catch: java.lang.Exception -> L1a
            java.nio.file.FileVisitResult r1 = k0(r1)     // Catch: java.lang.Exception -> L1a
            return r1
        L31:
            java.nio.file.FileVisitResult r1 = X(r2, r3, r4, r5, r6, r7)
            return r1
    }

    public static /* synthetic */ java.nio.file.Path U(java.nio.file.Path r0, java.nio.file.Path r1, kotlin.jvm.functions.Function3 r2, boolean r3, kotlin.jvm.functions.Function3 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L6
            kotlin.io.path.y1$c r2 = kotlin.io.path.y1.c.a
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Lf
            kotlin.io.path.t1 r4 = new kotlin.io.path.t1
            r4.<init>(r3)
        Lf:
            java.nio.file.Path r0 = R(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path V(java.nio.file.Path r0, java.nio.file.Path r1, kotlin.jvm.functions.Function3 r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            kotlin.io.path.y1$b r2 = kotlin.io.path.y1.b.a
        L6:
            java.nio.file.Path r0 = S(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.nio.file.Path W(java.nio.file.Path r0, java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.Path r3) {
            java.nio.file.Path r0 = kotlin.io.path.e3.C1(r3, r0)
            java.lang.String r0 = r0.toString()
            java.nio.file.Path r0 = kotlin.io.path.e1.a(r1, r0)
            java.nio.file.Path r1 = kotlin.io.path.y.a(r0)
            boolean r1 = kotlin.io.path.p1.a(r1, r2)
            if (r1 == 0) goto L1a
            kotlin.jvm.internal.g0.m(r0)
            return r0
        L1a:
            kotlin.io.path.IllegalFileNameException r1 = new kotlin.io.path.IllegalFileNameException
            java.lang.String r2 = "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name."
            r1.<init>(r3, r0, r2)
            throw r1
    }

    private static final java.nio.file.FileVisitResult X(kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r0, java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, java.lang.Exception r5) {
            java.nio.file.Path r1 = W(r1, r2, r3, r4)
            java.lang.Object r0 = r0.invoke(r4, r1, r5)
            kotlin.io.path.OnErrorResult r0 = (kotlin.io.path.OnErrorResult) r0
            java.nio.file.FileVisitResult r0 = l0(r0)
            return r0
    }

    private static final kotlin.io.path.CopyActionResult Y(boolean r3, kotlin.io.path.a r4, java.nio.file.Path r5, java.nio.file.Path r6) {
            java.lang.String r0 = "$this$copyToRecursively"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r4 = "src"
            kotlin.jvm.internal.g0.p(r5, r4)
            java.lang.String r4 = "dst"
            kotlin.jvm.internal.g0.p(r6, r4)
            kotlin.io.path.w r4 = kotlin.io.path.w.a
            java.nio.file.LinkOption[] r3 = r4.a(r3)
            r4 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r4]
            r1 = 0
            java.nio.file.LinkOption r2 = com.huawei.secure.android.common.util.b0.a()
            r0[r1] = r2
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            boolean r4 = kotlin.io.path.b.a(r6, r4)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = kotlin.io.path.b.a(r5, r0)
            if (r0 == 0) goto L3f
            if (r4 != 0) goto L70
        L3f:
            if (r4 == 0) goto L44
            d0(r6)
        L44:
            kotlin.jvm.internal.s0 r4 = new kotlin.jvm.internal.s0
            r0 = 2
            r4.<init>(r0)
            r4.b(r3)
            java.nio.file.StandardCopyOption r3 = kotlin.io.path.r1.a()
            r4.a(r3)
            int r3 = r4.c()
            java.nio.file.CopyOption[] r3 = new java.nio.file.CopyOption[r3]
            java.lang.Object[] r3 = r4.d(r3)
            java.nio.file.CopyOption[] r3 = (java.nio.file.CopyOption[]) r3
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.CopyOption[] r3 = (java.nio.file.CopyOption[]) r3
            java.nio.file.Path r3 = kotlin.io.path.c.a(r5, r6, r3)
            java.lang.String r4 = "copy(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
        L70:
            kotlin.io.path.CopyActionResult r3 = kotlin.io.path.CopyActionResult.CONTINUE
            return r3
    }

    private static final kotlin.io.path.CopyActionResult Z(boolean r1, kotlin.io.path.a r2, java.nio.file.Path r3, java.nio.file.Path r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "src"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "dst"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.io.path.CopyActionResult r1 = r2.a(r3, r4, r1)
            return r1
    }

    private static final java.nio.file.FileVisitResult a0(java.util.ArrayList r1, kotlin.jvm.functions.Function3 r2, java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5, kotlin.jvm.functions.Function3 r6, java.nio.file.Path r7, java.nio.file.attribute.BasicFileAttributes r8) {
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.nio.file.FileVisitResult r2 = T(r1, r2, r3, r4, r5, r6, r7, r8)
            java.nio.file.FileVisitResult r3 = kotlin.io.path.v0.a()
            if (r2 != r3) goto L17
            r1.add(r7)
        L17:
            return r2
    }

    private static final java.nio.file.FileVisitResult b0(java.util.ArrayList r1, kotlin.jvm.functions.Function3 r2, java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5, java.nio.file.Path r6, java.io.IOException r7) {
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.collections.f0.Q0(r1)
            if (r7 != 0) goto Lf
            java.nio.file.FileVisitResult r1 = kotlin.io.path.v0.a()
            return r1
        Lf:
            java.nio.file.FileVisitResult r1 = X(r2, r3, r4, r5, r6, r7)
            return r1
    }

    private static final kotlin.n1 c0(java.util.ArrayList r9, kotlin.jvm.functions.Function3 r10, java.nio.file.Path r11, java.nio.file.Path r12, java.nio.file.Path r13, kotlin.jvm.functions.Function3 r14, kotlin.io.path.r r15) {
            java.lang.String r0 = "$this$visitFileTree"
            kotlin.jvm.internal.g0.p(r15, r0)
            kotlin.io.path.w1 r1 = new kotlin.io.path.w1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10 = r2
            r12 = r4
            r13 = r5
            r14 = r6
            r11 = r7
            r15.c(r1)
            kotlin.io.path.y1$d r2 = new kotlin.io.path.y1$d
            r8 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r4 = r3
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r15.b(r2)
            kotlin.io.path.y1$e r9 = new kotlin.io.path.y1$e
            r9.<init>(r11, r12, r13, r14)
            r15.d(r9)
            kotlin.io.path.x1 r9 = new kotlin.io.path.x1
            r9.<init>(r10, r11, r12, r13, r14)
            r15.a(r9)
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.io.path.ExperimentalPathApi
    public static final void d0(@org.jetbrains.annotations.NotNull java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = e0(r2)
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2f
            java.lang.String r0 = "Failed to delete one or more files. See suppressed exceptions for details."
            java.nio.file.FileSystemException r0 = kotlin.io.path.o.a(r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            java.lang.Exception r1 = (java.lang.Exception) r1
            kotlin.l.a(r0, r1)
            goto L1e
        L2e:
            throw r0
        L2f:
            return
    }

    private static final java.util.List<java.lang.Exception> e0(java.nio.file.Path r9) {
            kotlin.io.path.q r0 = new kotlin.io.path.q
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.nio.file.Path r4 = kotlin.io.path.k.a(r9)
            if (r4 == 0) goto L4e
            java.nio.file.Path r5 = kotlin.io.path.l.a(r9)
            if (r5 != 0) goto L20
            java.nio.file.FileSystem r5 = com.huawei.secure.android.common.util.w.a(r9)
            java.lang.String r6 = ""
            java.lang.String[] r7 = new java.lang.String[r1]
            java.nio.file.Path r5 = kotlin.io.path.a0.a(r5, r6, r7)
        L20:
            java.nio.file.DirectoryStream r6 = kotlin.io.path.l1.a(r5)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r6 = r3
        L27:
            if (r6 == 0) goto L4e
            java.nio.file.DirectoryStream r7 = kotlin.io.path.m1.a(r6)     // Catch: java.lang.Throwable -> L3e
            boolean r8 = kotlin.io.path.n1.a(r7)     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L40
            r0.g(r5)     // Catch: java.lang.Throwable -> L3e
            java.nio.file.SecureDirectoryStream r2 = kotlin.io.path.o1.a(r7)     // Catch: java.lang.Throwable -> L3e
            g0(r2, r4, r3, r0)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r9 = move-exception
            goto L48
        L40:
            r1 = 1
        L41:
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L3e
            kotlin.io.b.a(r6, r3)
            r2 = r1
            goto L4e
        L48:
            throw r9     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            kotlin.io.b.a(r6, r9)
            throw r0
        L4e:
            if (r2 == 0) goto L53
            i0(r9, r3, r0)
        L53:
            java.util.List r9 = r0.d()
            return r9
    }

    private static final void f0(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r4, java.nio.file.Path r5, kotlin.io.path.q r6) {
            r0 = 1
            r1 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]     // Catch: java.lang.Exception -> L10 java.nio.file.NoSuchFileException -> L12
            java.nio.file.LinkOption r2 = com.huawei.secure.android.common.util.b0.a()     // Catch: java.lang.Exception -> L10 java.nio.file.NoSuchFileException -> L12
            r3 = 0
            r0[r3] = r2     // Catch: java.lang.Exception -> L10 java.nio.file.NoSuchFileException -> L12
            java.nio.file.SecureDirectoryStream r4 = kotlin.io.path.g1.a(r4, r5, r0)     // Catch: java.lang.Exception -> L10 java.nio.file.NoSuchFileException -> L12
            goto L14
        L10:
            r4 = move-exception
            goto L50
        L12:
            r4 = r1
        L14:
            if (r4 == 0) goto L53
            java.nio.file.SecureDirectoryStream r5 = kotlin.io.path.o1.a(r4)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = kotlin.io.path.h1.a(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r2)     // Catch: java.lang.Throwable -> L42
        L23:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L44
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L42
            java.nio.file.Path r2 = kotlin.io.path.f.a(r2)     // Catch: java.lang.Throwable -> L42
            java.nio.file.Path r2 = kotlin.io.path.k.a(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "getFileName(...)"
            kotlin.jvm.internal.g0.o(r2, r3)     // Catch: java.lang.Throwable -> L42
            java.nio.file.Path r3 = r6.e()     // Catch: java.lang.Throwable -> L42
            g0(r5, r2, r3, r6)     // Catch: java.lang.Throwable -> L42
            goto L23
        L42:
            r5 = move-exception
            goto L4a
        L44:
            kotlin.n1 r5 = kotlin.n1.a     // Catch: java.lang.Throwable -> L42
            kotlin.io.b.a(r4, r1)     // Catch: java.lang.Exception -> L10
            goto L53
        L4a:
            throw r5     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            kotlin.io.b.a(r4, r5)     // Catch: java.lang.Exception -> L10
            throw r0     // Catch: java.lang.Exception -> L10
        L50:
            r6.a(r4)
        L53:
            return
    }

    private static final void g0(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r2, java.nio.file.Path r3, java.nio.file.Path r4, kotlin.io.path.q r5) {
            r5.b(r3)
            if (r4 == 0) goto L15
            java.nio.file.Path r0 = r5.e()     // Catch: java.lang.Exception -> L13
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Exception -> L13
            O(r0)     // Catch: java.lang.Exception -> L13
            P(r0, r4)     // Catch: java.lang.Exception -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L3e
        L15:
            r4 = 1
            java.nio.file.LinkOption[] r4 = new java.nio.file.LinkOption[r4]     // Catch: java.lang.Exception -> L13
            java.nio.file.LinkOption r0 = com.huawei.secure.android.common.util.b0.a()     // Catch: java.lang.Exception -> L13
            r1 = 0
            r4[r1] = r0     // Catch: java.lang.Exception -> L13
            boolean r4 = j0(r2, r3, r4)     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L38
            int r4 = r5.f()     // Catch: java.lang.Exception -> L13
            f0(r2, r3, r5)     // Catch: java.lang.Exception -> L13
            int r0 = r5.f()     // Catch: java.lang.Exception -> L13
            if (r4 != r0) goto L41
            kotlin.io.path.u0.a(r2, r3)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L41
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L41
            goto L41
        L38:
            kotlin.io.path.f1.a(r2, r3)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L41
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L41
            goto L41
        L3e:
            r5.a(r2)
        L41:
            r5.c(r3)
            return
    }

    private static final void h0(java.nio.file.Path r4, kotlin.io.path.q r5) {
            r0 = 0
            java.nio.file.DirectoryStream r1 = kotlin.io.path.l1.a(r4)     // Catch: java.lang.Exception -> L6 java.nio.file.NoSuchFileException -> L8
            goto La
        L6:
            r4 = move-exception
            goto L3c
        L8:
            r1 = r0
        La:
            if (r1 == 0) goto L3f
            java.nio.file.DirectoryStream r2 = kotlin.io.path.m1.a(r1)     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = kotlin.io.path.d1.a(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r2, r3)     // Catch: java.lang.Throwable -> L2e
        L19:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            java.nio.file.Path r3 = kotlin.io.path.f.a(r3)     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.g0.m(r3)     // Catch: java.lang.Throwable -> L2e
            i0(r3, r4, r5)     // Catch: java.lang.Throwable -> L2e
            goto L19
        L2e:
            r4 = move-exception
            goto L36
        L30:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2e
            kotlin.io.b.a(r1, r0)     // Catch: java.lang.Exception -> L6
            goto L3f
        L36:
            throw r4     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            kotlin.io.b.a(r1, r4)     // Catch: java.lang.Exception -> L6
            throw r0     // Catch: java.lang.Exception -> L6
        L3c:
            r5.a(r4)
        L3f:
            return
    }

    private static final void i0(java.nio.file.Path r3, java.nio.file.Path r4, kotlin.io.path.q r5) {
            if (r4 == 0) goto Lb
            O(r3)     // Catch: java.lang.Exception -> L9
            P(r3, r4)     // Catch: java.lang.Exception -> L9
            goto Lb
        L9:
            r3 = move-exception
            goto L36
        Lb:
            r4 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r4]     // Catch: java.lang.Exception -> L9
            java.nio.file.LinkOption r1 = com.huawei.secure.android.common.util.b0.a()     // Catch: java.lang.Exception -> L9
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Exception -> L9
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Exception -> L9
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4     // Catch: java.lang.Exception -> L9
            boolean r4 = kotlin.io.path.b.a(r3, r4)     // Catch: java.lang.Exception -> L9
            if (r4 == 0) goto L32
            int r4 = r5.f()     // Catch: java.lang.Exception -> L9
            h0(r3, r5)     // Catch: java.lang.Exception -> L9
            int r0 = r5.f()     // Catch: java.lang.Exception -> L9
            if (r4 != r0) goto L31
            kotlin.io.path.s1.a(r3)     // Catch: java.lang.Exception -> L9
        L31:
            return
        L32:
            kotlin.io.path.s1.a(r3)     // Catch: java.lang.Exception -> L9
            return
        L36:
            r5.a(r3)
            return
    }

    private static final boolean j0(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r2, java.nio.file.Path r3, java.nio.file.LinkOption... r4) {
            java.lang.Class r0 = kotlin.io.path.y0.a()     // Catch: java.nio.file.NoSuchFileException -> L20
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L20
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.attribute.FileAttributeView r2 = kotlin.io.path.z0.a(r2, r3, r0, r4)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.attribute.BasicFileAttributeView r2 = kotlin.io.path.a1.a(r2)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.attribute.BasicFileAttributes r2 = kotlin.io.path.b1.a(r2)     // Catch: java.nio.file.NoSuchFileException -> L20
            boolean r2 = kotlin.io.path.c1.a(r2)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.nio.file.NoSuchFileException -> L20
            goto L21
        L20:
            r2 = 0
        L21:
            if (r2 == 0) goto L28
            boolean r2 = r2.booleanValue()
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }

    @kotlin.io.path.ExperimentalPathApi
    private static final java.nio.file.FileVisitResult k0(kotlin.io.path.CopyActionResult r1) {
            int[] r0 = kotlin.io.path.y1.a.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L21
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L16
            java.nio.file.FileVisitResult r1 = kotlin.io.path.x0.a()
            return r1
        L16:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L1c:
            java.nio.file.FileVisitResult r1 = kotlin.io.path.w0.a()
            return r1
        L21:
            java.nio.file.FileVisitResult r1 = kotlin.io.path.v0.a()
            return r1
    }

    @kotlin.io.path.ExperimentalPathApi
    private static final java.nio.file.FileVisitResult l0(kotlin.io.path.OnErrorResult r1) {
            int[] r0 = kotlin.io.path.y1.a.b
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 != r0) goto L13
            java.nio.file.FileVisitResult r1 = kotlin.io.path.x0.a()
            return r1
        L13:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L19:
            java.nio.file.FileVisitResult r1 = kotlin.io.path.w0.a()
            return r1
    }

    private static final <R> R m0(kotlin.jvm.functions.Function0<? extends R> r0) {
            java.lang.Object r0 = r0.invoke()     // Catch: java.nio.file.NoSuchFileException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }
}
