package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-FileSystem")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n58#2,4:156\n58#2,22:160\n66#2,10:182\n62#2,3:192\n77#2,3:195\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,4\n66#1:160,22\n65#1:182,10\n65#1:192,3\n65#1:195,3\n*E\n"})
/* renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FileSystem {
    public FileSystem() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object collectRecursively(@org.jetbrains.annotations.NotNull kotlin.sequences.o<? super okio.Path> r17, @org.jetbrains.annotations.NotNull okio.FileSystem r18, @org.jetbrains.annotations.NotNull kotlin.collections.m<okio.Path> r19, @org.jetbrains.annotations.NotNull okio.Path r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r23) {
            r0 = r17
            r1 = r20
            r2 = r22
            r3 = r23
            boolean r4 = r3 instanceof okio.internal.FileSystem$collectRecursively$1
            if (r4 == 0) goto L1b
            r4 = r3
            okio.internal.-FileSystem$collectRecursively$1 r4 = (okio.internal.FileSystem$collectRecursively$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.label = r5
            goto L20
        L1b:
            okio.internal.-FileSystem$collectRecursively$1 r4 = new okio.internal.-FileSystem$collectRecursively$1
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            int r6 = r4.label
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto Laa
            if (r6 == r9) goto L8c
            if (r6 == r8) goto L54
            if (r6 != r7) goto L4c
            java.lang.Object r0 = r4.L$4
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r4.L$3
            okio.Path r0 = (okio.Path) r0
            java.lang.Object r0 = r4.L$2
            kotlin.collections.m r0 = (kotlin.collections.m) r0
            java.lang.Object r0 = r4.L$1
            okio.FileSystem r0 = (okio.FileSystem) r0
            java.lang.Object r0 = r4.L$0
            kotlin.sequences.o r0 = (kotlin.sequences.o) r0
            kotlin.g0.n(r3)
            goto L1ce
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L54:
            int r0 = r4.I$0
            boolean r1 = r4.Z$1
            boolean r2 = r4.Z$0
            java.lang.Object r6 = r4.L$7
            okio.Path r6 = (okio.Path) r6
            java.lang.Object r6 = r4.L$6
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r9 = r4.L$5
            okio.Path r9 = (okio.Path) r9
            java.lang.Object r10 = r4.L$4
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r4.L$3
            okio.Path r11 = (okio.Path) r11
            java.lang.Object r12 = r4.L$2
            kotlin.collections.m r12 = (kotlin.collections.m) r12
            java.lang.Object r13 = r4.L$1
            okio.FileSystem r13 = (okio.FileSystem) r13
            java.lang.Object r14 = r4.L$0
            kotlin.sequences.o r14 = (kotlin.sequences.o) r14
            kotlin.g0.n(r3)     // Catch: java.lang.Throwable -> L89
            r3 = r11
            r11 = r0
            r0 = r2
            r2 = r1
            r1 = r12
            r12 = r9
            r9 = r13
            r13 = r3
            r3 = r10
        L86:
            r10 = r14
            goto L121
        L89:
            r0 = move-exception
            goto L191
        L8c:
            boolean r0 = r4.Z$1
            boolean r1 = r4.Z$0
            java.lang.Object r2 = r4.L$3
            okio.Path r2 = (okio.Path) r2
            java.lang.Object r6 = r4.L$2
            kotlin.collections.m r6 = (kotlin.collections.m) r6
            java.lang.Object r9 = r4.L$1
            okio.FileSystem r9 = (okio.FileSystem) r9
            java.lang.Object r10 = r4.L$0
            kotlin.sequences.o r10 = (kotlin.sequences.o) r10
            kotlin.g0.n(r3)
            r16 = r2
            r2 = r0
            r0 = r1
            r1 = r16
            goto Ld5
        Laa:
            kotlin.g0.n(r3)
            if (r2 != 0) goto Lcb
            r4.L$0 = r0
            r3 = r18
            r4.L$1 = r3
            r6 = r19
            r4.L$2 = r6
            r4.L$3 = r1
            r10 = r21
            r4.Z$0 = r10
            r4.Z$1 = r2
            r4.label = r9
            java.lang.Object r9 = r0.c(r1, r4)
            if (r9 != r5) goto Ld1
            goto L1cd
        Lcb:
            r3 = r18
            r6 = r19
            r10 = r21
        Ld1:
            r9 = r10
            r10 = r0
            r0 = r9
            r9 = r3
        Ld5:
            java.util.List r3 = r9.listOrNull(r1)
            if (r3 != 0) goto Ldf
            java.util.List r3 = kotlin.collections.f0.J()
        Ldf:
            r11 = r3
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L19a
            r11 = 0
            r12 = r1
        Lea:
            if (r0 == 0) goto L10a
            boolean r13 = r6.contains(r12)
            if (r13 != 0) goto Lf3
            goto L10a
        Lf3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "symlink cycle at "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L10a:
            okio.Path r13 = symlinkTarget(r9, r12)
            if (r13 != 0) goto L195
            if (r0 != 0) goto L114
            if (r11 != 0) goto L19a
        L114:
            r6.addLast(r12)
            java.util.Iterator r13 = r3.iterator()     // Catch: java.lang.Throwable -> L18f
            r16 = r13
            r13 = r1
            r1 = r6
            r6 = r16
        L121:
            boolean r14 = r6.hasNext()     // Catch: java.lang.Throwable -> L17e
            if (r14 == 0) goto L181
            java.lang.Object r14 = r6.next()     // Catch: java.lang.Throwable -> L17e
            okio.Path r14 = (okio.Path) r14     // Catch: java.lang.Throwable -> L17e
            r4.L$0 = r10     // Catch: java.lang.Throwable -> L17e
            r4.L$1 = r9     // Catch: java.lang.Throwable -> L17e
            r4.L$2 = r1     // Catch: java.lang.Throwable -> L17e
            r4.L$3 = r13     // Catch: java.lang.Throwable -> L17e
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.j.a(r3)     // Catch: java.lang.Throwable -> L17e
            r4.L$4 = r15     // Catch: java.lang.Throwable -> L17e
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.j.a(r12)     // Catch: java.lang.Throwable -> L17e
            r4.L$5 = r15     // Catch: java.lang.Throwable -> L17e
            r4.L$6 = r6     // Catch: java.lang.Throwable -> L17e
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.j.a(r14)     // Catch: java.lang.Throwable -> L17e
            r4.L$7 = r15     // Catch: java.lang.Throwable -> L17e
            r4.Z$0 = r0     // Catch: java.lang.Throwable -> L17e
            r4.Z$1 = r2     // Catch: java.lang.Throwable -> L17e
            r4.I$0 = r11     // Catch: java.lang.Throwable -> L17e
            r4.label = r8     // Catch: java.lang.Throwable -> L17e
            r21 = r0
            r19 = r1
            r22 = r2
            r23 = r4
            r18 = r9
            r17 = r10
            r20 = r14
            java.lang.Object r0 = collectRecursively(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L179
            r14 = r17
            r10 = r18
            r9 = r19
            r2 = r21
            r1 = r22
            r4 = r23
            if (r0 != r5) goto L173
            goto L1cd
        L173:
            r0 = r2
            r2 = r1
            r1 = r9
            r9 = r10
            goto L86
        L179:
            r0 = move-exception
            r9 = r19
        L17c:
            r12 = r9
            goto L191
        L17e:
            r0 = move-exception
            r9 = r1
            goto L17c
        L181:
            r14 = r10
            r10 = r9
            r9 = r1
            r1 = r2
            r2 = r0
            r9.removeLast()
            r6 = r9
            r9 = r10
            r10 = r14
            r2 = r1
            r1 = r13
            goto L19a
        L18f:
            r0 = move-exception
            r12 = r6
        L191:
            r12.removeLast()
            throw r0
        L195:
            int r11 = r11 + 1
            r12 = r13
            goto Lea
        L19a:
            if (r2 == 0) goto L1d1
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r10)
            r4.L$0 = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r9)
            r4.L$1 = r8
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r6)
            r4.L$2 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r1)
            r4.L$3 = r6
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r3)
            r4.L$4 = r3
            r3 = 0
            r4.L$5 = r3
            r4.L$6 = r3
            r4.L$7 = r3
            r4.Z$0 = r0
            r4.Z$1 = r2
            r4.label = r7
            java.lang.Object r0 = r10.c(r1, r4)
            if (r0 != r5) goto L1ce
        L1cd:
            return r5
        L1ce:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
        L1d1:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static final void commonCopy(@org.jetbrains.annotations.NotNull okio.FileSystem r3, @org.jetbrains.annotations.NotNull okio.Path r4, @org.jetbrains.annotations.NotNull okio.Path r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r5, r0)
            okio.Source r4 = r3.source(r4)
            r0 = 0
            r1 = 2
            r2 = 0
            okio.Sink r3 = okio.FileSystem.sink$default(r3, r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            okio.BufferedSink r3 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L3c
            long r0 = r3.writeAll(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2e
            r3.close()     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r3 = move-exception
            goto L40
        L2e:
            r3 = r2
            goto L40
        L30:
            r5 = move-exception
            if (r3 == 0) goto L3e
            r3.close()     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r3 = move-exception
            kotlin.l.a(r5, r3)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r3 = move-exception
            goto L4e
        L3e:
            r3 = r5
            r5 = r2
        L40:
            if (r3 != 0) goto L4d
            r5.longValue()     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.lang.Throwable -> L4b
            goto L59
        L4b:
            r2 = move-exception
            goto L59
        L4d:
            throw r3     // Catch: java.lang.Throwable -> L3c
        L4e:
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r4 = move-exception
            kotlin.l.a(r3, r4)
        L58:
            r2 = r3
        L59:
            if (r2 != 0) goto L5c
            return
        L5c:
            throw r2
    }

    public static final void commonCreateDirectories(@org.jetbrains.annotations.NotNull okio.FileSystem r3, @org.jetbrains.annotations.NotNull okio.Path r4, boolean r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.collections.m r0 = new kotlin.collections.m
            r0.<init>()
            r1 = r4
        L10:
            if (r1 == 0) goto L20
            boolean r2 = r3.exists(r1)
            if (r2 != 0) goto L20
            r0.addFirst(r1)
            okio.Path r1 = r1.parent()
            goto L10
        L20:
            if (r5 == 0) goto L40
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L29
            goto L40
        L29:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " already exists."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L40:
            java.util.Iterator r4 = r0.iterator()
        L44:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L57
            java.lang.Object r5 = r4.next()
            okio.Path r5 = (okio.Path) r5
            r0 = 2
            r1 = 0
            r2 = 0
            okio.FileSystem.createDirectory$default(r3, r5, r2, r0, r1)
            goto L44
        L57:
            return
    }

    public static final void commonDeleteRecursively(@org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fileOrDirectory"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.m r3 = kotlin.sequences.p.b(r0)
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            okio.Path r0 = (okio.Path) r0
            if (r4 == 0) goto L2e
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r2.delete(r0, r1)
            goto L18
        L33:
            return
    }

    public static final boolean commonExists(@org.jetbrains.annotations.NotNull okio.FileSystem r1, @org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.FileMetadata r1 = r1.metadataOrNull(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<okio.Path> commonListRecursively(@org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
            r1 = 0
            r0.<init>(r3, r2, r4, r1)
            kotlin.sequences.m r2 = kotlin.sequences.p.b(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.FileMetadata commonMetadata(@org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.NotNull okio.Path r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.FileMetadata r2 = r2.metadataOrNull(r3)
            if (r2 == 0) goto L11
            return r2
        L11:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.Nullable
    public static final okio.Path symlinkTarget(@org.jetbrains.annotations.NotNull okio.FileSystem r1, @org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.FileMetadata r1 = r1.metadata(r2)
            okio.Path r1 = r1.getSymlinkTarget()
            if (r1 != 0) goto L16
            r1 = 0
            return r1
        L16:
            okio.Path r2 = r2.parent()
            kotlin.jvm.internal.g0.m(r2)
            okio.Path r1 = r2.resolve(r1)
            return r1
    }
}
