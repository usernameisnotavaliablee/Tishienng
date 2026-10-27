package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,503:1\n58#2,4:504\n58#2,4:508\n58#2,22:512\n66#2,10:534\n62#2,3:544\n77#2,3:547\n58#2,22:550\n66#2,10:572\n62#2,3:582\n77#2,3:585\n1056#3:588\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n66#1:504,4\n101#1:508,4\n109#1:512,22\n101#1:534,10\n101#1:544,3\n101#1:547,3\n125#1:550,22\n66#1:572,10\n66#1:582,3\n66#1:585,3\n155#1:588\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_NTFS_EXTRA = 10;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    public ZipFilesKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 a(okio.BufferedSource r0, kotlin.jvm.internal.Ref.ObjectRef r1, kotlin.jvm.internal.Ref.ObjectRef r2, kotlin.jvm.internal.Ref.ObjectRef r3, int r4, long r5) {
            kotlin.n1 r0 = readOrSkipLocalHeader$lambda$0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ boolean b(okio.internal.ZipEntry r0) {
            boolean r0 = openZip$lambda$0(r0)
            return r0
    }

    private static final java.util.Map<okio.Path, okio.internal.ZipEntry> buildIndex(java.util.List<okio.internal.ZipEntry> r28) {
            okio.Path$Companion r0 = okio.Path.Companion
            r1 = 0
            java.lang.String r2 = "/"
            r3 = 0
            r4 = 1
            okio.Path r6 = okio.Path.Companion.get$default(r0, r2, r3, r4, r1)
            okio.internal.ZipEntry r5 = new okio.internal.ZipEntry
            r26 = 65532(0xfffc, float:9.183E-41)
            r27 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r5.<init>(r6, r7, r8, r9, r11, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            kotlin.Pair r0 = kotlin.o0.a(r6, r5)
            kotlin.Pair[] r1 = new kotlin.Pair[r4]
            r1[r3] = r0
            java.util.Map r0 = kotlin.collections.i1.j0(r1)
            r1 = r28
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1 r2 = new okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            r2.<init>()
            java.util.List r1 = kotlin.collections.f0.z5(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L4d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r1.next()
            okio.internal.ZipEntry r2 = (okio.internal.ZipEntry) r2
            okio.Path r3 = r2.getCanonicalPath()
            java.lang.Object r3 = r0.put(r3, r2)
            okio.internal.ZipEntry r3 = (okio.internal.ZipEntry) r3
            if (r3 != 0) goto L4d
        L65:
            okio.Path r3 = r2.getCanonicalPath()
            okio.Path r5 = r3.parent()
            if (r5 != 0) goto L70
            goto L4d
        L70:
            java.lang.Object r3 = r0.get(r5)
            okio.internal.ZipEntry r3 = (okio.internal.ZipEntry) r3
            if (r3 == 0) goto L86
            java.util.List r3 = r3.getChildren()
            java.util.Collection r3 = (java.util.Collection) r3
            okio.Path r2 = r2.getCanonicalPath()
            r3.add(r2)
            goto L4d
        L86:
            okio.internal.ZipEntry r4 = new okio.internal.ZipEntry
            r25 = 65532(0xfffc, float:9.183E-41)
            r26 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.put(r5, r4)
            java.util.List r3 = r4.getChildren()
            java.util.Collection r3 = (java.util.Collection) r3
            okio.Path r2 = r2.getCanonicalPath()
            r3.add(r2)
            r2 = r4
            goto L65
        Lbd:
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(kotlin.jvm.internal.Ref.ObjectRef r0, okio.BufferedSource r1, kotlin.jvm.internal.Ref.ObjectRef r2, kotlin.jvm.internal.Ref.ObjectRef r3, int r4, long r5) {
            kotlin.n1 r0 = readCentralDirectoryZipEntry$lambda$1$0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ kotlin.n1 d(kotlin.jvm.internal.Ref.BooleanRef r0, long r1, kotlin.jvm.internal.Ref.LongRef r3, okio.BufferedSource r4, kotlin.jvm.internal.Ref.LongRef r5, kotlin.jvm.internal.Ref.LongRef r6, kotlin.jvm.internal.Ref.ObjectRef r7, kotlin.jvm.internal.Ref.ObjectRef r8, kotlin.jvm.internal.Ref.ObjectRef r9, int r10, long r11) {
            kotlin.n1 r0 = readCentralDirectoryZipEntry$lambda$1(r0, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long dosDateTimeToEpochMillis(int r7, int r8) {
            r0 = -1
            if (r8 != r0) goto L5
            r7 = 0
            return r7
        L5:
            int r0 = r7 >> 9
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r1 = r0 + 1980
            int r0 = r7 >> 5
            r2 = r0 & 15
            r3 = r7 & 31
            int r7 = r8 >> 11
            r4 = r7 & 31
            int r7 = r8 >> 5
            r5 = r7 & 63
            r7 = r8 & 31
            int r6 = r7 << 1
            long r7 = okio.internal._ZlibJvmKt.datePartsToEpochMillis(r1, r2, r3, r4, r5, r6)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            return r7
    }

    public static final long filetimeToEpochMillis(long r2) {
            r0 = 10000(0x2710, float:1.4013E-41)
            long r0 = (long) r0
            long r2 = r2 / r0
            r0 = 11644473600000(0xa9730b66800, double:5.7531343696653E-311)
            long r2 = r2 - r0
            return r2
    }

    private static final java.lang.String getHex(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.b.a(r1)
            java.lang.String r2 = java.lang.Integer.toString(r2, r1)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ZipFileSystem openZip(@org.jetbrains.annotations.NotNull okio.Path r19, @org.jetbrains.annotations.NotNull okio.FileSystem r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super okio.internal.ZipEntry, java.lang.Boolean> r21) throws java.io.IOException {
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.FileHandle r4 = r2.openReadOnly(r1)
            long r5 = r4.size()     // Catch: java.lang.Throwable -> L103
            r0 = 22
            long r7 = (long) r0     // Catch: java.lang.Throwable -> L103
            long r5 = r5 - r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L19a
            r9 = 65536(0x10000, double:3.2379E-319)
            long r9 = r5 - r9
            long r9 = java.lang.Math.max(r9, r7)     // Catch: java.lang.Throwable -> L103
        L30:
            okio.Source r0 = r4.source(r5)     // Catch: java.lang.Throwable -> L103
            okio.BufferedSource r11 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L103
            int r0 = r11.readIntLe()     // Catch: java.lang.Throwable -> L180
            r12 = 101010256(0x6054b50, float:2.506985E-35)
            if (r0 != r12) goto L182
            okio.internal.EocdRecord r9 = readEocdRecord(r11)     // Catch: java.lang.Throwable -> L180
            int r0 = r9.getCommentByteCount()     // Catch: java.lang.Throwable -> L180
            long r12 = (long) r0     // Catch: java.lang.Throwable -> L180
            java.lang.String r10 = r11.readUtf8(r12)     // Catch: java.lang.Throwable -> L180
            r11.close()     // Catch: java.lang.Throwable -> L103
            r0 = 20
            long r11 = (long) r0     // Catch: java.lang.Throwable -> L103
            long r5 = r5 - r11
            r11 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L10c
            okio.Source r0 = r4.source(r5)     // Catch: java.lang.Throwable -> L103
            okio.BufferedSource r5 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L103
            int r0 = r5.readIntLe()     // Catch: java.lang.Throwable -> Ldf
            r6 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r0 != r6) goto Lea
            int r0 = r5.readIntLe()     // Catch: java.lang.Throwable -> Ldf
            long r12 = r5.readLongLe()     // Catch: java.lang.Throwable -> Ldf
            int r6 = r5.readIntLe()     // Catch: java.lang.Throwable -> Ldf
            r14 = 1
            if (r6 != r14) goto Le2
            if (r0 != 0) goto Le2
            okio.Source r0 = r4.source(r12)     // Catch: java.lang.Throwable -> Ldf
            okio.BufferedSource r6 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> Ldf
            int r0 = r6.readIntLe()     // Catch: java.lang.Throwable -> L9d
            r12 = 101075792(0x6064b50, float:2.525793E-35)
            if (r0 != r12) goto La1
            okio.internal.EocdRecord r9 = readZip64EocdRecord(r6, r9)     // Catch: java.lang.Throwable -> L9d
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L9b
            r6.close()     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            r0 = move-exception
            goto Ldb
        L9b:
            r0 = r11
            goto Ldb
        L9d:
            r0 = move-exception
            r12 = r9
            r9 = r0
            goto Lc8
        La1:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r14.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r15 = "bad zip: expected "
            r14.append(r15)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r12 = getHex(r12)     // Catch: java.lang.Throwable -> L9d
            r14.append(r12)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r12 = " but was "
            r14.append(r12)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = getHex(r0)     // Catch: java.lang.Throwable -> L9d
            r14.append(r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L9d
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L9d
            throw r13     // Catch: java.lang.Throwable -> L9d
        Lc8:
            if (r6 == 0) goto Ld9
            r6.close()     // Catch: java.lang.Throwable -> Ld0
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Ld0
            goto Ld9
        Ld0:
            r0 = move-exception
            kotlin.l.a(r9, r0)     // Catch: java.lang.Throwable -> Ld5
            goto Ld9
        Ld5:
            r0 = move-exception
            r6 = r0
            r9 = r12
            goto Lf6
        Ld9:
            r0 = r9
            r9 = r12
        Ldb:
            if (r0 != 0) goto Lde
            goto Lea
        Lde:
            throw r0     // Catch: java.lang.Throwable -> Ldf
        Ldf:
            r0 = move-exception
            r6 = r0
            goto Lf6
        Le2:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r6 = "unsupported zip: spanned"
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Ldf
            throw r0     // Catch: java.lang.Throwable -> Ldf
        Lea:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Ldf
            if (r5 == 0) goto Lf4
            r5.close()     // Catch: java.lang.Throwable -> Lf2
            goto Lf4
        Lf2:
            r0 = move-exception
            goto L108
        Lf4:
            r0 = r11
            goto L108
        Lf6:
            if (r5 == 0) goto L107
            r5.close()     // Catch: java.lang.Throwable -> Lfe
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Lfe
            goto L107
        Lfe:
            r0 = move-exception
            kotlin.l.a(r6, r0)     // Catch: java.lang.Throwable -> L103
            goto L107
        L103:
            r0 = move-exception
            r1 = r0
            goto L1b5
        L107:
            r0 = r6
        L108:
            if (r0 != 0) goto L10b
            goto L10c
        L10b:
            throw r0     // Catch: java.lang.Throwable -> L103
        L10c:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L103
            r5.<init>()     // Catch: java.lang.Throwable -> L103
            long r12 = r9.getCentralDirectoryOffset()     // Catch: java.lang.Throwable -> L103
            okio.Source r0 = r4.source(r12)     // Catch: java.lang.Throwable -> L103
            okio.BufferedSource r6 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L103
            long r12 = r9.getEntryCount()     // Catch: java.lang.Throwable -> L145
        L121:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 >= 0) goto L154
            okio.internal.ZipEntry r0 = readCentralDirectoryZipEntry(r6)     // Catch: java.lang.Throwable -> L145
            long r14 = r0.getOffset()     // Catch: java.lang.Throwable -> L145
            long r16 = r9.getCentralDirectoryOffset()     // Catch: java.lang.Throwable -> L145
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L14c
            java.lang.Object r14 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L145
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L145
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L145
            if (r14 == 0) goto L148
            r5.add(r0)     // Catch: java.lang.Throwable -> L145
            goto L148
        L145:
            r0 = move-exception
            r3 = r0
            goto L15f
        L148:
            r14 = 1
            long r7 = r7 + r14
            goto L121
        L14c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L145
            java.lang.String r3 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L145
            throw r0     // Catch: java.lang.Throwable -> L145
        L154:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L145
            if (r6 == 0) goto L16c
            r6.close()     // Catch: java.lang.Throwable -> L15c
            goto L16c
        L15c:
            r0 = move-exception
            r11 = r0
            goto L16c
        L15f:
            if (r6 == 0) goto L16b
            r6.close()     // Catch: java.lang.Throwable -> L167
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L167
            goto L16b
        L167:
            r0 = move-exception
            kotlin.l.a(r3, r0)     // Catch: java.lang.Throwable -> L103
        L16b:
            r11 = r3
        L16c:
            if (r11 != 0) goto L17f
            java.util.Map r0 = buildIndex(r5)     // Catch: java.lang.Throwable -> L103
            okio.ZipFileSystem r3 = new okio.ZipFileSystem     // Catch: java.lang.Throwable -> L103
            r3.<init>(r1, r2, r0, r10)     // Catch: java.lang.Throwable -> L103
            if (r4 == 0) goto L17e
            r4.close()     // Catch: java.lang.Throwable -> L17e
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L17e
        L17e:
            return r3
        L17f:
            throw r11     // Catch: java.lang.Throwable -> L103
        L180:
            r0 = move-exception
            goto L196
        L182:
            r11.close()     // Catch: java.lang.Throwable -> L103
            r11 = -1
            long r5 = r5 + r11
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L18e
            goto L30
        L18e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L103
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L103
            throw r0     // Catch: java.lang.Throwable -> L103
        L196:
            r11.close()     // Catch: java.lang.Throwable -> L103
            throw r0     // Catch: java.lang.Throwable -> L103
        L19a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L103
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L103
            r1.<init>()     // Catch: java.lang.Throwable -> L103
            java.lang.String r2 = "not a zip: size="
            r1.append(r2)     // Catch: java.lang.Throwable -> L103
            long r2 = r4.size()     // Catch: java.lang.Throwable -> L103
            r1.append(r2)     // Catch: java.lang.Throwable -> L103
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L103
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L103
            throw r0     // Catch: java.lang.Throwable -> L103
        L1b5:
            if (r4 == 0) goto L1c1
            r4.close()     // Catch: java.lang.Throwable -> L1bd
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1bd
            goto L1c1
        L1bd:
            r0 = move-exception
            kotlin.l.a(r1, r0)
        L1c1:
            throw r1
    }

    public static /* synthetic */ okio.ZipFileSystem openZip$default(okio.Path r0, okio.FileSystem r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 4
            if (r3 == 0) goto L9
            okio.internal.c r2 = new okio.internal.c
            r2.<init>()
        L9:
            okio.ZipFileSystem r0 = openZip(r0, r1, r2)
            return r0
    }

    private static final boolean openZip$lambda$0(okio.internal.ZipEntry r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.internal.ZipEntry readCentralDirectoryZipEntry(@org.jetbrains.annotations.NotNull okio.BufferedSource r35) throws java.io.IOException {
            r5 = r35
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.readIntLe()
            r1 = 33639248(0x2014b50, float:9.499037E-38)
            if (r0 != r1) goto L146
            r0 = 4
            r5.skip(r0)
            short r0 = r5.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r0 & r1
            r11 = 1
            r0 = r0 & r11
            if (r0 != 0) goto L12b
            short r0 = r5.readShortLe()
            r22 = r0 & r1
            short r0 = r5.readShortLe()
            r26 = r0 & r1
            short r0 = r5.readShortLe()
            r25 = r0 & r1
            int r0 = r5.readIntLe()
            long r2 = (long) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r16 = r2 & r6
            r2 = r6
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            int r0 = r5.readIntLe()
            long r7 = (long) r0
            long r7 = r7 & r2
            r6.element = r7
            kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
            r4.<init>()
            int r0 = r5.readIntLe()
            long r7 = (long) r0
            long r7 = r7 & r2
            r4.element = r7
            short r0 = r5.readShortLe()
            r0 = r0 & r1
            short r7 = r5.readShortLe()
            r12 = r7 & r1
            short r7 = r5.readShortLe()
            r13 = r7 & r1
            r7 = 8
            r5.skip(r7)
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            int r1 = r5.readIntLe()
            long r8 = (long) r1
            long r8 = r8 & r2
            r7.element = r8
            long r0 = (long) r0
            java.lang.String r14 = r5.readUtf8(r0)
            r15 = 0
            r0 = 2
            r1 = 0
            boolean r8 = kotlin.text.u.k3(r14, r15, r15, r0, r1)
            if (r8 != 0) goto L123
            long r8 = r4.element
            r18 = 0
            r10 = 8
            int r20 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r20 != 0) goto L98
            long r8 = (long) r10
            goto L9a
        L98:
            r8 = r18
        L9a:
            long r0 = r6.element
            int r23 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r23 != 0) goto La2
            long r0 = (long) r10
            long r8 = r8 + r0
        La2:
            long r0 = r7.element
            int r23 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r23 != 0) goto Laa
            long r0 = (long) r10
            long r8 = r8 + r0
        Laa:
            r2 = r8
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            okio.internal.f r0 = new okio.internal.f
            r20 = r14
            r14 = 0
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10)
            readExtra(r5, r12, r0)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto Ldb
            boolean r0 = r1.element
            if (r0 == 0) goto Ld3
            goto Ldb
        Ld3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad zip: zip64 extra required but absent"
            r0.<init>(r1)
            throw r0
        Ldb:
            long r0 = (long) r13
            java.lang.String r0 = r5.readUtf8(r0)
            okio.Path$Companion r1 = okio.Path.Companion
            java.lang.String r2 = "/"
            okio.Path r1 = okio.Path.Companion.get$default(r1, r2, r15, r11, r14)
            r3 = r20
            okio.Path r13 = r1.resolve(r3)
            r1 = 2
            boolean r14 = kotlin.text.u.Z1(r3, r2, r15, r1, r14)
            okio.internal.ZipEntry r12 = new okio.internal.ZipEntry
            long r1 = r6.element
            long r3 = r4.element
            long r5 = r7.element
            java.lang.Object r7 = r8.element
            r27 = r7
            java.lang.Long r27 = (java.lang.Long) r27
            java.lang.Object r7 = r9.element
            r28 = r7
            java.lang.Long r28 = (java.lang.Long) r28
            java.lang.Object r7 = r10.element
            r29 = r7
            java.lang.Long r29 = (java.lang.Long) r29
            r33 = 57344(0xe000, float:8.0356E-41)
            r34 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r15 = r0
            r18 = r1
            r20 = r3
            r23 = r5
            r12.<init>(r13, r14, r15, r16, r18, r20, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r12
        L123:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad zip: filename contains 0x00"
            r0.<init>(r1)
            throw r0
        L12b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "unsupported zip: general purpose bit flag="
            r1.append(r3)
            java.lang.String r2 = getHex(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L146:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "bad zip: expected "
            r3.append(r4)
            java.lang.String r1 = getHex(r1)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            java.lang.String r0 = getHex(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    private static final kotlin.n1 readCentralDirectoryZipEntry$lambda$1(kotlin.jvm.internal.Ref.BooleanRef r1, long r2, kotlin.jvm.internal.Ref.LongRef r4, okio.BufferedSource r5, kotlin.jvm.internal.Ref.LongRef r6, kotlin.jvm.internal.Ref.LongRef r7, kotlin.jvm.internal.Ref.ObjectRef r8, kotlin.jvm.internal.Ref.ObjectRef r9, kotlin.jvm.internal.Ref.ObjectRef r10, int r11, long r12) {
            r0 = 1
            if (r11 == r0) goto L24
            r1 = 10
            if (r11 == r1) goto L8
            goto L5b
        L8:
            r1 = 4
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 < 0) goto L1c
            r5.skip(r1)
            long r12 = r12 - r1
            int r1 = (int) r12
            okio.internal.d r2 = new okio.internal.d
            r2.<init>(r8, r5, r9, r10)
            readExtra(r5, r1, r2)
            goto L5b
        L1c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "bad zip: NTFS extra too short"
            r1.<init>(r2)
            throw r1
        L24:
            boolean r8 = r1.element
            if (r8 != 0) goto L66
            r1.element = r0
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 < 0) goto L5e
            long r1 = r4.element
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L3d
            long r1 = r5.readLongLe()
        L3d:
            r4.element = r1
            long r1 = r6.element
            r3 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L4c
            long r1 = r5.readLongLe()
            goto L4d
        L4c:
            r1 = r3
        L4d:
            r6.element = r1
            long r1 = r7.element
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 != 0) goto L59
            long r3 = r5.readLongLe()
        L59:
            r7.element = r3
        L5b:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L5e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "bad zip: zip64 extra too short"
            r1.<init>(r2)
            throw r1
        L66:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "bad zip: zip64 extra repeated"
            r1.<init>(r2)
            throw r1
    }

    private static final kotlin.n1 readCentralDirectoryZipEntry$lambda$1$0(kotlin.jvm.internal.Ref.ObjectRef r2, okio.BufferedSource r3, kotlin.jvm.internal.Ref.ObjectRef r4, kotlin.jvm.internal.Ref.ObjectRef r5, int r6, long r7) {
            r0 = 1
            if (r6 != r0) goto L3c
            java.lang.Object r6 = r2.element
            if (r6 != 0) goto L34
            r0 = 24
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 != 0) goto L2c
            long r6 = r3.readLongLe()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.element = r6
            long r6 = r3.readLongLe()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r4.element = r2
            long r2 = r3.readLongLe()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.element = r2
            goto L3c
        L2c:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "bad zip: NTFS extra attribute tag 0x0001 size != 24"
            r2.<init>(r3)
            throw r2
        L34:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "bad zip: NTFS extra attribute tag 0x0001 repeated"
            r2.<init>(r3)
            throw r2
        L3c:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final okio.internal.EocdRecord readEocdRecord(okio.BufferedSource r10) throws java.io.IOException {
            short r0 = r10.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r2 = r10.readShortLe()
            r2 = r2 & r1
            short r3 = r10.readShortLe()
            r3 = r3 & r1
            long r5 = (long) r3
            short r3 = r10.readShortLe()
            r3 = r3 & r1
            long r3 = (long) r3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r0 != 0) goto L3d
            if (r2 != 0) goto L3d
            r2 = 4
            r10.skip(r2)
            int r0 = r10.readIntLe()
            long r2 = (long) r0
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            short r10 = r10.readShortLe()
            r9 = r10 & r1
            okio.internal.EocdRecord r4 = new okio.internal.EocdRecord
            r4.<init>(r5, r7, r9)
            return r4
        L3d:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r0 = "unsupported zip: spanned"
            r10.<init>(r0)
            throw r10
    }

    private static final void readExtra(okio.BufferedSource r10, int r11, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.n1> r12) {
            long r0 = (long) r11
        L1:
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L7b
            r4 = 4
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 < 0) goto L73
            short r11 = r10.readShortLe()
            r4 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r4
            short r4 = r10.readShortLe()
            long r4 = (long) r4
            r6 = 65535(0xffff, double:3.23786E-319)
            long r4 = r4 & r6
            r6 = 4
            long r6 = (long) r6
            long r0 = r0 - r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L6b
            r10.require(r4)
            okio.Buffer r6 = r10.getBuffer()
            long r6 = r6.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r12.invoke(r8, r9)
            okio.Buffer r8 = r10.getBuffer()
            long r8 = r8.size()
            long r8 = r8 + r4
            long r8 = r8 - r6
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 < 0) goto L54
            if (r6 <= 0) goto L52
            okio.Buffer r11 = r10.getBuffer()
            r11.skip(r8)
        L52:
            long r0 = r0 - r4
            goto L1
        L54:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "unsupported zip: too many bytes processed for "
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L6b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "bad zip: truncated value in extra field"
            r10.<init>(r11)
            throw r10
        L73:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "bad zip: truncated header in extra field"
            r10.<init>(r11)
            throw r10
        L7b:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.internal.ZipEntry readLocalHeader(@org.jetbrains.annotations.NotNull okio.BufferedSource r1, @org.jetbrains.annotations.NotNull okio.internal.ZipEntry r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "centralDirectoryZipEntry"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.internal.ZipEntry r1 = readOrSkipLocalHeader(r1, r2)
            kotlin.jvm.internal.g0.m(r1)
            return r1
    }

    private static final okio.internal.ZipEntry readOrSkipLocalHeader(okio.BufferedSource r6, okio.internal.ZipEntry r7) {
            int r0 = r6.readIntLe()
            r1 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r0 != r1) goto L7c
            r0 = 2
            r6.skip(r0)
            short r0 = r6.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r0 & r1
            r0 = r0 & 1
            if (r0 != 0) goto L61
            r2 = 18
            r6.skip(r2)
            short r0 = r6.readShortLe()
            long r2 = (long) r0
            r4 = 65535(0xffff, double:3.23786E-319)
            long r2 = r2 & r4
            short r0 = r6.readShortLe()
            r0 = r0 & r1
            r6.skip(r2)
            if (r7 != 0) goto L39
            long r0 = (long) r0
            r6.skip(r0)
            r6 = 0
            return r6
        L39:
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            okio.internal.e r4 = new okio.internal.e
            r4.<init>(r6, r1, r2, r3)
            readExtra(r6, r0, r4)
            java.lang.Object r6 = r1.element
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r0 = r2.element
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r1 = r3.element
            java.lang.Integer r1 = (java.lang.Integer) r1
            okio.internal.ZipEntry r6 = r7.copy$okio(r6, r0, r1)
            return r6
        L61:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "unsupported zip: general purpose bit flag="
            r7.append(r0)
            java.lang.String r0 = getHex(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L7c:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "bad zip: expected "
            r7.append(r2)
            java.lang.String r1 = getHex(r1)
            r7.append(r1)
            java.lang.String r1 = " but was "
            r7.append(r1)
            java.lang.String r0 = getHex(r0)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private static final kotlin.n1 readOrSkipLocalHeader$lambda$0(okio.BufferedSource r9, kotlin.jvm.internal.Ref.ObjectRef r10, kotlin.jvm.internal.Ref.ObjectRef r11, kotlin.jvm.internal.Ref.ObjectRef r12, int r13, long r14) {
            r0 = 21589(0x5455, float:3.0253E-41)
            if (r13 != r0) goto L67
            java.lang.String r13 = "bad zip: extended timestamp extra too short"
            r0 = 1
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto L61
            byte r2 = r9.readByte()
            r3 = r2 & 1
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            r6 = r2 & 2
            r7 = 2
            if (r6 != r7) goto L20
            r6 = 1
            goto L21
        L20:
            r6 = 0
        L21:
            r7 = 4
            r2 = r2 & r7
            if (r2 != r7) goto L26
            r4 = 1
        L26:
            if (r3 == 0) goto L2a
            r0 = 5
        L2a:
            r7 = 4
            if (r6 == 0) goto L2f
            long r0 = r0 + r7
        L2f:
            if (r4 == 0) goto L32
            long r0 = r0 + r7
        L32:
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto L5b
            if (r3 == 0) goto L42
            int r13 = r9.readIntLe()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10.element = r13
        L42:
            if (r6 == 0) goto L4e
            int r10 = r9.readIntLe()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.element = r10
        L4e:
            if (r4 == 0) goto L67
            int r9 = r9.readIntLe()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.element = r9
            goto L67
        L5b:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r13)
            throw r9
        L61:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r13)
            throw r9
        L67:
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }

    private static final okio.internal.EocdRecord readZip64EocdRecord(okio.BufferedSource r8, okio.internal.EocdRecord r9) throws java.io.IOException {
            r0 = 12
            r8.skip(r0)
            int r0 = r8.readIntLe()
            int r1 = r8.readIntLe()
            long r3 = r8.readLongLe()
            long r5 = r8.readLongLe()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L30
            if (r0 != 0) goto L30
            if (r1 != 0) goto L30
            r0 = 8
            r8.skip(r0)
            long r5 = r8.readLongLe()
            okio.internal.EocdRecord r2 = new okio.internal.EocdRecord
            int r7 = r9.getCommentByteCount()
            r2.<init>(r3, r5, r7)
            return r2
        L30:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "unsupported zip: spanned"
            r8.<init>(r9)
            throw r8
    }

    public static final void skipLocalHeader(@org.jetbrains.annotations.NotNull okio.BufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            readOrSkipLocalHeader(r1, r0)
            return
    }
}
