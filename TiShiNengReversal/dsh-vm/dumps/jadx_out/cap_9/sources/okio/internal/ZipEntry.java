package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ZipEntry {

    @org.jetbrains.annotations.NotNull
    private final okio.Path canonicalPath;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okio.Path> children;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final int dosLastModifiedAtDate;
    private final int dosLastModifiedAtTime;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer extendedCreatedAtSeconds;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer extendedLastAccessedAtSeconds;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer extendedLastModifiedAtSeconds;
    private final boolean isDirectory;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long ntfsCreatedAtFiletime;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long ntfsLastAccessedAtFiletime;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long ntfsLastModifiedAtFiletime;
    private final long offset;
    private final long size;

    public ZipEntry(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3, @org.jetbrains.annotations.NotNull java.lang.String r4, long r5, long r7, long r9, int r11, long r12, int r14, int r15, @org.jetbrains.annotations.Nullable java.lang.Long r16, @org.jetbrains.annotations.Nullable java.lang.Long r17, @org.jetbrains.annotations.Nullable java.lang.Long r18, @org.jetbrains.annotations.Nullable java.lang.Integer r19, @org.jetbrains.annotations.Nullable java.lang.Integer r20, @org.jetbrains.annotations.Nullable java.lang.Integer r21) {
            r1 = this;
            java.lang.String r0 = "canonicalPath"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "comment"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.canonicalPath = r2
            r1.isDirectory = r3
            r1.comment = r4
            r1.crc = r5
            r1.compressedSize = r7
            r1.size = r9
            r1.compressionMethod = r11
            r1.offset = r12
            r1.dosLastModifiedAtDate = r14
            r1.dosLastModifiedAtTime = r15
            r2 = r16
            r1.ntfsLastModifiedAtFiletime = r2
            r2 = r17
            r1.ntfsLastAccessedAtFiletime = r2
            r2 = r18
            r1.ntfsCreatedAtFiletime = r2
            r2 = r19
            r1.extendedLastModifiedAtSeconds = r2
            r2 = r20
            r1.extendedLastAccessedAtSeconds = r2
            r2 = r21
            r1.extendedCreatedAtSeconds = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.children = r2
            return
    }

    public /* synthetic */ ZipEntry(okio.Path r18, boolean r19, java.lang.String r20, long r21, long r23, long r25, int r27, long r28, int r30, int r31, java.lang.Long r32, java.lang.Long r33, java.lang.Long r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.Integer r37, int r38, kotlin.jvm.internal.v r39) {
            r17 = this;
            r0 = r38
            r1 = r0 & 2
            if (r1 == 0) goto L8
            r1 = 0
            goto La
        L8:
            r1 = r19
        La:
            r2 = r0 & 4
            if (r2 == 0) goto L11
            java.lang.String r2 = ""
            goto L13
        L11:
            r2 = r20
        L13:
            r3 = r0 & 8
            r4 = -1
            if (r3 == 0) goto L1b
            r6 = r4
            goto L1d
        L1b:
            r6 = r21
        L1d:
            r3 = r0 & 16
            if (r3 == 0) goto L23
            r8 = r4
            goto L25
        L23:
            r8 = r23
        L25:
            r3 = r0 & 32
            if (r3 == 0) goto L2b
            r10 = r4
            goto L2d
        L2b:
            r10 = r25
        L2d:
            r3 = r0 & 64
            r12 = -1
            if (r3 == 0) goto L34
            r3 = -1
            goto L36
        L34:
            r3 = r27
        L36:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L3b
            goto L3d
        L3b:
            r4 = r28
        L3d:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L43
            r13 = -1
            goto L45
        L43:
            r13 = r30
        L45:
            r14 = r0 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L4a
            goto L4c
        L4a:
            r12 = r31
        L4c:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L52
            r14 = 0
            goto L54
        L52:
            r14 = r32
        L54:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L5a
            r15 = 0
            goto L5c
        L5a:
            r15 = r33
        L5c:
            r39 = r1
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L64
            r1 = 0
            goto L66
        L64:
            r1 = r34
        L66:
            r20 = r1
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L6e
            r1 = 0
            goto L70
        L6e:
            r1 = r35
        L70:
            r21 = r1
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L78
            r1 = 0
            goto L7a
        L78:
            r1 = r36
        L7a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto La4
            r37 = r21
            r21 = r39
            r39 = 0
        L87:
            r19 = r17
            r36 = r20
            r38 = r1
            r22 = r2
            r29 = r3
            r30 = r4
            r23 = r6
            r25 = r8
            r27 = r10
            r33 = r12
            r32 = r13
            r34 = r14
            r35 = r15
            r20 = r18
            goto Lad
        La4:
            r19 = r37
            r37 = r21
            r21 = r39
            r39 = r19
            goto L87
        Lad:
            r19.<init>(r20, r21, r22, r23, r25, r27, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.internal.ZipEntry copy$okio(@org.jetbrains.annotations.Nullable java.lang.Integer r23, @org.jetbrains.annotations.Nullable java.lang.Integer r24, @org.jetbrains.annotations.Nullable java.lang.Integer r25) {
            r22 = this;
            r0 = r22
            okio.internal.ZipEntry r1 = new okio.internal.ZipEntry
            okio.Path r2 = r0.canonicalPath
            boolean r3 = r0.isDirectory
            java.lang.String r4 = r0.comment
            long r5 = r0.crc
            long r7 = r0.compressedSize
            long r9 = r0.size
            int r11 = r0.compressionMethod
            long r12 = r0.offset
            int r14 = r0.dosLastModifiedAtDate
            int r15 = r0.dosLastModifiedAtTime
            r16 = r1
            java.lang.Long r1 = r0.ntfsLastModifiedAtFiletime
            r17 = r1
            java.lang.Long r1 = r0.ntfsLastAccessedAtFiletime
            r18 = r1
            java.lang.Long r1 = r0.ntfsCreatedAtFiletime
            r19 = r18
            r18 = r1
            r1 = r16
            r16 = r17
            r17 = r19
            r19 = r23
            r20 = r24
            r21 = r25
            r1.<init>(r2, r3, r4, r5, r7, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21)
            r16 = r1
            return r16
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Path getCanonicalPath() {
            r1 = this;
            okio.Path r0 = r1.canonicalPath
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okio.Path> getChildren() {
            r1 = this;
            java.util.List<okio.Path> r0 = r1.children
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getComment() {
            r1 = this;
            java.lang.String r0 = r1.comment
            return r0
    }

    public final long getCompressedSize() {
            r2 = this;
            long r0 = r2.compressedSize
            return r0
    }

    public final int getCompressionMethod() {
            r1 = this;
            int r0 = r1.compressionMethod
            return r0
    }

    public final long getCrc() {
            r2 = this;
            long r0 = r2.crc
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getCreatedAtMillis$okio() {
            r4 = this;
            java.lang.Long r0 = r4.ntfsCreatedAtFiletime
            if (r0 == 0) goto L11
            long r0 = r0.longValue()
            long r0 = okio.internal.ZipFilesKt.filetimeToEpochMillis(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L11:
            java.lang.Integer r0 = r4.extendedCreatedAtSeconds
            if (r0 == 0) goto L23
            int r0 = r0.intValue()
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L23:
            r0 = 0
            return r0
    }

    public final int getDosLastModifiedAtDate() {
            r1 = this;
            int r0 = r1.dosLastModifiedAtDate
            return r0
    }

    public final int getDosLastModifiedAtTime() {
            r1 = this;
            int r0 = r1.dosLastModifiedAtTime
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getExtendedCreatedAtSeconds() {
            r1 = this;
            java.lang.Integer r0 = r1.extendedCreatedAtSeconds
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getExtendedLastAccessedAtSeconds() {
            r1 = this;
            java.lang.Integer r0 = r1.extendedLastAccessedAtSeconds
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getExtendedLastModifiedAtSeconds() {
            r1 = this;
            java.lang.Integer r0 = r1.extendedLastModifiedAtSeconds
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLastAccessedAtMillis$okio() {
            r4 = this;
            java.lang.Long r0 = r4.ntfsLastAccessedAtFiletime
            if (r0 == 0) goto L11
            long r0 = r0.longValue()
            long r0 = okio.internal.ZipFilesKt.filetimeToEpochMillis(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L11:
            java.lang.Integer r0 = r4.extendedLastAccessedAtSeconds
            if (r0 == 0) goto L23
            int r0 = r0.intValue()
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L23:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLastModifiedAtMillis$okio() {
            r4 = this;
            java.lang.Long r0 = r4.ntfsLastModifiedAtFiletime
            if (r0 == 0) goto L11
            long r0 = r0.longValue()
            long r0 = okio.internal.ZipFilesKt.filetimeToEpochMillis(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L11:
            java.lang.Integer r0 = r4.extendedLastModifiedAtSeconds
            if (r0 == 0) goto L23
            int r0 = r0.intValue()
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L23:
            int r0 = r4.dosLastModifiedAtTime
            r1 = -1
            if (r0 == r1) goto L2f
            int r1 = r4.dosLastModifiedAtDate
            java.lang.Long r0 = okio.internal.ZipFilesKt.dosDateTimeToEpochMillis(r1, r0)
            return r0
        L2f:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getNtfsCreatedAtFiletime() {
            r1 = this;
            java.lang.Long r0 = r1.ntfsCreatedAtFiletime
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getNtfsLastAccessedAtFiletime() {
            r1 = this;
            java.lang.Long r0 = r1.ntfsLastAccessedAtFiletime
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getNtfsLastModifiedAtFiletime() {
            r1 = this;
            java.lang.Long r0 = r1.ntfsLastModifiedAtFiletime
            return r0
    }

    public final long getOffset() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }

    public final long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    public final boolean isDirectory() {
            r1 = this;
            boolean r0 = r1.isDirectory
            return r0
    }
}
