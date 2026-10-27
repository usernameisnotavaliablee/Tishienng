package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1292#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class o extends kotlin.io.m {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements kotlin.jvm.functions.Function2 {
        public static final kotlin.io.o.a a = null;

        static {
                kotlin.io.o$a r0 = new kotlin.io.o$a
                r0.<init>()
                kotlin.io.o.a.a = r0
                return
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Void a(java.io.File r2, java.io.IOException r3) {
                r1 = this;
                java.lang.String r0 = "<unused var>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "exception"
                kotlin.jvm.internal.g0.p(r3, r2)
                throw r3
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.IOException r2 = (java.io.IOException) r2
                java.lang.Void r1 = r0.a(r1, r2)
                return r1
        }
    }

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 S(kotlin.jvm.functions.Function2 r0, java.io.File r1, java.io.IOException r2) {
            kotlin.n1 r0 = V(r0, r1, r2)
            return r0
    }

    public static final boolean T(@org.jetbrains.annotations.NotNull java.io.File r12, @org.jetbrains.annotations.NotNull java.io.File r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.g0.p(r15, r0)
            boolean r0 = r12.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2c
            kotlin.io.NoSuchFileException r3 = new kotlin.io.NoSuchFileException
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r12 = r15.invoke(r4, r3)
            kotlin.io.OnErrorAction r13 = kotlin.io.OnErrorAction.TERMINATE
            if (r12 == r13) goto L2b
            return r1
        L2b:
            return r2
        L2c:
            r4 = r12
            kotlin.io.h r12 = kotlin.io.m.R(r4)     // Catch: kotlin.io.s -> Lda
            kotlin.io.n r0 = new kotlin.io.n     // Catch: kotlin.io.s -> Lda
            r0.<init>(r15)     // Catch: kotlin.io.s -> Lda
            kotlin.io.h r12 = r12.k(r0)     // Catch: kotlin.io.s -> Lda
            java.util.Iterator r12 = r12.iterator()     // Catch: kotlin.io.s -> Lda
        L3e:
            boolean r0 = r12.hasNext()     // Catch: kotlin.io.s -> Lda
            if (r0 == 0) goto Ld9
            java.lang.Object r0 = r12.next()     // Catch: kotlin.io.s -> Lda
            r5 = r0
            java.io.File r5 = (java.io.File) r5     // Catch: kotlin.io.s -> Lda
            boolean r0 = r5.exists()     // Catch: kotlin.io.s -> Lda
            if (r0 != 0) goto L65
            r6 = r5
            kotlin.io.NoSuchFileException r5 = new kotlin.io.NoSuchFileException     // Catch: kotlin.io.s -> Lda
            java.lang.String r8 = "The source file doesn't exist."
            r9 = 2
            r10 = 0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: kotlin.io.s -> Lda
            java.lang.Object r0 = r15.invoke(r6, r5)     // Catch: kotlin.io.s -> Lda
            kotlin.io.OnErrorAction r3 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.s -> Lda
            if (r0 != r3) goto L3e
            return r2
        L65:
            r6 = r5
            java.lang.String r0 = u0(r6, r4)     // Catch: kotlin.io.s -> Lda
            java.io.File r6 = new java.io.File     // Catch: kotlin.io.s -> Lda
            r6.<init>(r13, r0)     // Catch: kotlin.io.s -> Lda
            boolean r0 = r6.exists()     // Catch: kotlin.io.s -> Lda
            if (r0 == 0) goto La7
            boolean r0 = r5.isDirectory()     // Catch: kotlin.io.s -> Lda
            if (r0 == 0) goto L81
            boolean r0 = r6.isDirectory()     // Catch: kotlin.io.s -> Lda
            if (r0 != 0) goto La7
        L81:
            if (r14 != 0) goto L84
            goto L97
        L84:
            boolean r0 = r6.isDirectory()     // Catch: kotlin.io.s -> Lda
            if (r0 == 0) goto L91
            boolean r0 = c0(r6)     // Catch: kotlin.io.s -> Lda
            if (r0 != 0) goto La7
            goto L97
        L91:
            boolean r0 = r6.delete()     // Catch: kotlin.io.s -> Lda
            if (r0 != 0) goto La7
        L97:
            kotlin.io.FileAlreadyExistsException r0 = new kotlin.io.FileAlreadyExistsException     // Catch: kotlin.io.s -> Lda
            java.lang.String r3 = "The destination file already exists."
            r0.<init>(r5, r6, r3)     // Catch: kotlin.io.s -> Lda
            java.lang.Object r0 = r15.invoke(r6, r0)     // Catch: kotlin.io.s -> Lda
            kotlin.io.OnErrorAction r3 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.s -> Lda
            if (r0 != r3) goto L3e
            return r2
        La7:
            boolean r0 = r5.isDirectory()     // Catch: kotlin.io.s -> Lda
            if (r0 == 0) goto Lb1
            r6.mkdirs()     // Catch: kotlin.io.s -> Lda
            goto L3e
        Lb1:
            r9 = 4
            r10 = 0
            r8 = 0
            r7 = r14
            java.io.File r14 = X(r5, r6, r7, r8, r9, r10)     // Catch: kotlin.io.s -> Lda
            r6 = r5
            long r8 = r14.length()     // Catch: kotlin.io.s -> Lda
            long r10 = r6.length()     // Catch: kotlin.io.s -> Lda
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 == 0) goto Ld6
            java.io.IOException r14 = new java.io.IOException     // Catch: kotlin.io.s -> Lda
            java.lang.String r0 = "Source file wasn't copied completely, length of destination file differs."
            r14.<init>(r0)     // Catch: kotlin.io.s -> Lda
            java.lang.Object r14 = r15.invoke(r6, r14)     // Catch: kotlin.io.s -> Lda
            kotlin.io.OnErrorAction r0 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.s -> Lda
            if (r14 != r0) goto Ld6
            return r2
        Ld6:
            r14 = r7
            goto L3e
        Ld9:
            return r1
        Lda:
            return r2
    }

    public static /* synthetic */ boolean U(java.io.File r0, java.io.File r1, boolean r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            kotlin.io.o$a r3 = kotlin.io.o.a.a
        Lb:
            boolean r0 = T(r0, r1, r2, r3)
            return r0
    }

    private static final kotlin.n1 V(kotlin.jvm.functions.Function2 r1, java.io.File r2, java.io.IOException r3) {
            java.lang.String r0 = "f"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "e"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r1 = r1.invoke(r2, r3)
            kotlin.io.OnErrorAction r3 = kotlin.io.OnErrorAction.TERMINATE
            if (r1 == r3) goto L15
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L15:
            kotlin.io.s r1 = new kotlin.io.s
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File W(@org.jetbrains.annotations.NotNull java.io.File r6, @org.jetbrains.annotations.NotNull java.io.File r7, boolean r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L75
            boolean r0 = r7.exists()
            if (r0 == 0) goto L2f
            if (r8 == 0) goto L27
            boolean r8 = r7.delete()
            if (r8 == 0) goto L1f
            goto L2f
        L1f:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L27:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L2f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L44
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L3c
            return r7
        L3c:
            kotlin.io.FileSystemException r8 = new kotlin.io.FileSystemException
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L44:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L4d
            r8.mkdirs()
        L4d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L62
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L62
            kotlin.io.a.k(r8, r6, r9)     // Catch: java.lang.Throwable -> L65
            r9 = 0
            kotlin.io.b.a(r6, r9)     // Catch: java.lang.Throwable -> L62
            kotlin.io.b.a(r8, r9)
            return r7
        L62:
            r0 = move-exception
            r6 = r0
            goto L6e
        L65:
            r0 = move-exception
            r7 = r0
            throw r7     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            r9 = r0
            kotlin.io.b.a(r6, r7)     // Catch: java.lang.Throwable -> L62
            throw r9     // Catch: java.lang.Throwable -> L62
        L6e:
            throw r6     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            r7 = r0
            kotlin.io.b.a(r8, r6)
            throw r7
        L75:
            kotlin.io.NoSuchFileException r0 = new kotlin.io.NoSuchFileException
            r4 = 2
            r5 = 0
            r2 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
    }

    public static /* synthetic */ java.io.File X(java.io.File r0, java.io.File r1, boolean r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 8192(0x2000, float:1.148E-41)
        Lb:
            java.io.File r0 = W(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @org.jetbrains.annotations.NotNull
    public static final java.io.File Y(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.io.File r3) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)
            r1.delete()
            boolean r2 = r1.mkdir()
            if (r2 == 0) goto L16
            kotlin.jvm.internal.g0.m(r1)
            return r1
        L16:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Unable to create temporary directory "
            r3.append(r0)
            r3.append(r1)
            r1 = 46
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ java.io.File Z(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = Y(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @org.jetbrains.annotations.NotNull
    public static final java.io.File a0(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.io.File r3) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)
            java.lang.String r2 = "createTempFile(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ java.io.File b0(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = a0(r1, r2, r3)
            return r1
    }

    public static final boolean c0(@org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.io.h r4 = kotlin.io.m.Q(r4)
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
        Le:
            r1 = 1
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r4.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.delete()
            if (r3 != 0) goto L27
            boolean r2 = r2.exists()
            if (r2 != 0) goto L2a
        L27:
            if (r1 == 0) goto L2a
            goto Le
        L2a:
            r1 = 0
            goto Lf
        L2c:
            return r1
    }

    public static final boolean d0(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.io.g r0 = kotlin.io.j.f(r3)
            kotlin.io.g r1 = kotlin.io.j.f(r4)
            boolean r2 = r1.i()
            if (r2 == 0) goto L1d
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            return r3
        L1d:
            int r3 = r0.h()
            int r4 = r1.h()
            int r3 = r3 - r4
            if (r3 >= 0) goto L2a
            r3 = 0
            return r3
        L2a:
            java.util.List r4 = r0.g()
            int r0 = r0.h()
            java.util.List r3 = r4.subList(r3, r0)
            java.util.List r4 = r1.g()
            boolean r3 = r3.equals(r4)
            return r3
    }

    public static final boolean e0(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = d0(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String f0(@org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r2 = kotlin.text.u.L5(r2, r0, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String g0(@org.jetbrains.annotations.NotNull java.io.File r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            char r2 = java.io.File.separatorChar
            r0 = 47
            java.lang.String r1 = "getPath(...)"
            if (r2 == r0) goto L1f
            r0 = r1
            java.lang.String r1 = r7.getPath()
            kotlin.jvm.internal.g0.o(r1, r0)
            r5 = 4
            r6 = 0
            r3 = 47
            r4 = 0
            java.lang.String r7 = kotlin.text.u.w2(r1, r2, r3, r4, r5, r6)
            return r7
        L1f:
            r0 = r1
            java.lang.String r7 = r7.getPath()
            kotlin.jvm.internal.g0.o(r7, r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String h0(@org.jetbrains.annotations.NotNull java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "getName(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r0 = 0
            r1 = 2
            java.lang.String r2 = "."
            java.lang.String r3 = kotlin.text.u.W5(r3, r2, r0, r1, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File i0(@org.jetbrains.annotations.NotNull java.io.File r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.io.g r10 = kotlin.io.j.f(r10)
            java.io.File r0 = r10.e()
            java.util.List r10 = r10.g()
            java.util.List r10 = j0(r10)
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r2 = java.io.File.separator
            java.lang.String r10 = "separator"
            kotlin.jvm.internal.g0.o(r2, r10)
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.io.File r10 = p0(r0, r10)
            return r10
    }

    private static final java.util.List<java.io.File> j0(java.util.List<? extends java.io.File> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r4.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "."
            boolean r3 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r3 == 0) goto L28
            kotlin.n1 r1 = kotlin.n1.a
            goto Ld
        L28:
            java.lang.String r3 = ".."
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L57
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L53
            java.lang.Object r2 = kotlin.collections.f0.u3(r0)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L53
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r1 = r0.remove(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            goto Ld
        L53:
            r0.add(r1)
            goto Ld
        L57:
            r0.add(r1)
            goto Ld
        L5b:
            return r0
    }

    private static final kotlin.io.g k0(kotlin.io.g r2) {
            kotlin.io.g r0 = new kotlin.io.g
            java.io.File r1 = r2.e()
            java.util.List r2 = r2.g()
            java.util.List r2 = j0(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File l0(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = u0(r1, r2)
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.io.File m0(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = v0(r1, r2)
            if (r1 == 0) goto L16
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            return r2
        L16:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File n0(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = v0(r1, r2)
            if (r2 == 0) goto L15
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
        L15:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File o0(@org.jetbrains.annotations.NotNull java.io.File r4, @org.jetbrains.annotations.NotNull java.io.File r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = kotlin.io.j.d(r5)
            if (r0 == 0) goto L11
            return r5
        L11:
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            int r0 = r4.length()
            if (r0 != 0) goto L21
            goto L2c
        L21:
            char r0 = java.io.File.separatorChar
            r1 = 2
            r2 = 0
            r3 = 0
            boolean r1 = kotlin.text.u.q3(r4, r0, r3, r1, r2)
            if (r1 == 0) goto L41
        L2c:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            return r0
        L41:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File p0(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r1 = o0(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File q0(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.io.g r2 = kotlin.io.j.f(r2)
            int r0 = r2.h()
            if (r0 != 0) goto L1c
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".."
            r0.<init>(r1)
            goto L27
        L1c:
            int r0 = r2.h()
            int r0 = r0 + (-1)
            r1 = 0
            java.io.File r0 = r2.j(r1, r0)
        L27:
            java.io.File r2 = r2.e()
            java.io.File r2 = o0(r2, r0)
            java.io.File r2 = o0(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File r0(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r1 = q0(r1, r0)
            return r1
    }

    public static final boolean s0(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.io.g r3 = kotlin.io.j.f(r3)
            kotlin.io.g r4 = kotlin.io.j.f(r4)
            java.io.File r0 = r3.e()
            java.io.File r1 = r4.e()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 != 0) goto L22
            return r1
        L22:
            int r0 = r3.h()
            int r2 = r4.h()
            if (r0 >= r2) goto L2d
            return r1
        L2d:
            java.util.List r3 = r3.g()
            int r0 = r4.h()
            java.util.List r3 = r3.subList(r1, r0)
            java.util.List r4 = r4.g()
            boolean r3 = r3.equals(r4)
            return r3
    }

    public static final boolean t0(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = s0(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String u0(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = v0(r3, r4)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "this and base files have different roots: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            r1.append(r4)
            r3 = 46
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final java.lang.String v0(java.io.File r17, java.io.File r18) {
            kotlin.io.g r0 = kotlin.io.j.f(r17)
            kotlin.io.g r0 = k0(r0)
            kotlin.io.g r1 = kotlin.io.j.f(r18)
            kotlin.io.g r1 = k0(r1)
            java.io.File r2 = r0.e()
            java.io.File r3 = r1.e()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            r3 = 0
            if (r2 != 0) goto L20
            return r3
        L20:
            int r2 = r1.h()
            int r4 = r0.h()
            int r5 = java.lang.Math.min(r4, r2)
            r6 = 0
        L2d:
            if (r6 >= r5) goto L48
            java.util.List r7 = r0.g()
            java.lang.Object r7 = r7.get(r6)
            java.util.List r8 = r1.g()
            java.lang.Object r8 = r8.get(r6)
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r8)
            if (r7 == 0) goto L48
            int r6 = r6 + 1
            goto L2d
        L48:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r5 = r2 + (-1)
            if (r6 > r5) goto L77
        L51:
            java.util.List r7 = r1.g()
            java.lang.Object r7 = r7.get(r5)
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getName()
            java.lang.String r9 = ".."
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r9)
            if (r7 == 0) goto L68
            return r3
        L68:
            r8.append(r9)
            if (r5 == r6) goto L72
            char r7 = java.io.File.separatorChar
            r8.append(r7)
        L72:
            if (r5 == r6) goto L77
            int r5 = r5 + (-1)
            goto L51
        L77:
            if (r6 >= r4) goto La0
            if (r6 >= r2) goto L80
            char r1 = java.io.File.separatorChar
            r8.append(r1)
        L80:
            java.util.List r0 = r0.g()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.g2(r0, r6)
            r7 = r0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.String r9 = java.io.File.separator
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.o(r9, r0)
            r15 = 124(0x7c, float:1.74E-43)
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            kotlin.collections.f0.p3(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        La0:
            java.lang.String r0 = r8.toString()
            return r0
    }
}
