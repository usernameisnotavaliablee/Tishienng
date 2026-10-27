package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FileMetadata {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long createdAtMillis;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.d<?>, java.lang.Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long lastAccessedAtMillis;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long lastModifiedAtMillis;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long size;

    @org.jetbrains.annotations.Nullable
    private final okio.Path symlinkTarget;

    public FileMetadata() {
            r11 = this;
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public FileMetadata(boolean r2, boolean r3, @org.jetbrains.annotations.Nullable okio.Path r4, @org.jetbrains.annotations.Nullable java.lang.Long r5, @org.jetbrains.annotations.Nullable java.lang.Long r6, @org.jetbrains.annotations.Nullable java.lang.Long r7, @org.jetbrains.annotations.Nullable java.lang.Long r8, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.d<?>, ? extends java.lang.Object> r9) {
            r1 = this;
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.g0.p(r9, r0)
            r1.<init>()
            r1.isRegularFile = r2
            r1.isDirectory = r3
            r1.symlinkTarget = r4
            r1.size = r5
            r1.createdAtMillis = r6
            r1.lastModifiedAtMillis = r7
            r1.lastAccessedAtMillis = r8
            java.util.Map r2 = kotlin.collections.i1.D0(r9)
            r1.extras = r2
            return
    }

    public /* synthetic */ FileMetadata(boolean r2, boolean r3, okio.Path r4, java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.lang.Long r8, java.util.Map r9, int r10, kotlin.jvm.internal.v r11) {
            r1 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L6
            r2 = 0
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Lb
            r3 = 0
        Lb:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto L11
            r4 = r0
        L11:
            r11 = r10 & 8
            if (r11 == 0) goto L16
            r5 = r0
        L16:
            r11 = r10 & 16
            if (r11 == 0) goto L1b
            r6 = r0
        L1b:
            r11 = r10 & 32
            if (r11 == 0) goto L20
            r7 = r0
        L20:
            r11 = r10 & 64
            if (r11 == 0) goto L25
            r8 = r0
        L25:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L2d
            java.util.Map r9 = kotlin.collections.i1.z()
        L2d:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static /* synthetic */ okio.FileMetadata copy$default(okio.FileMetadata r0, boolean r1, boolean r2, okio.Path r3, java.lang.Long r4, java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.util.Map r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            boolean r1 = r0.isRegularFile
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            boolean r2 = r0.isDirectory
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L12
            okio.Path r3 = r0.symlinkTarget
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            java.lang.Long r4 = r0.size
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L1e
            java.lang.Long r5 = r0.createdAtMillis
        L1e:
            r10 = r9 & 32
            if (r10 == 0) goto L24
            java.lang.Long r6 = r0.lastModifiedAtMillis
        L24:
            r10 = r9 & 64
            if (r10 == 0) goto L2a
            java.lang.Long r7 = r0.lastAccessedAtMillis
        L2a:
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L30
            java.util.Map<kotlin.reflect.d<?>, java.lang.Object> r8 = r0.extras
        L30:
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            okio.FileMetadata r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.FileMetadata copy(boolean r11, boolean r12, @org.jetbrains.annotations.Nullable okio.Path r13, @org.jetbrains.annotations.Nullable java.lang.Long r14, @org.jetbrains.annotations.Nullable java.lang.Long r15, @org.jetbrains.annotations.Nullable java.lang.Long r16, @org.jetbrains.annotations.Nullable java.lang.Long r17, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.d<?>, ? extends java.lang.Object> r18) {
            r10 = this;
            java.lang.String r0 = "extras"
            r9 = r18
            kotlin.jvm.internal.g0.p(r9, r0)
            okio.FileMetadata r1 = new okio.FileMetadata
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final <T> T extra(@org.jetbrains.annotations.NotNull kotlin.reflect.d<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.d<?>, java.lang.Object> r0 = r1.extras
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto Lf
            r2 = 0
            return r2
        Lf:
            java.lang.Object r2 = kotlin.reflect.e.a(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getCreatedAtMillis() {
            r1 = this;
            java.lang.Long r0 = r1.createdAtMillis
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<kotlin.reflect.d<?>, java.lang.Object> getExtras() {
            r1 = this;
            java.util.Map<kotlin.reflect.d<?>, java.lang.Object> r0 = r1.extras
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLastAccessedAtMillis() {
            r1 = this;
            java.lang.Long r0 = r1.lastAccessedAtMillis
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLastModifiedAtMillis() {
            r1 = this;
            java.lang.Long r0 = r1.lastModifiedAtMillis
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getSize() {
            r1 = this;
            java.lang.Long r0 = r1.size
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okio.Path getSymlinkTarget() {
            r1 = this;
            okio.Path r0 = r1.symlinkTarget
            return r0
    }

    public final boolean isDirectory() {
            r1 = this;
            boolean r0 = r1.isDirectory
            return r0
    }

    public final boolean isRegularFile() {
            r1 = this;
            boolean r0 = r1.isRegularFile
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r9.isRegularFile
            if (r1 == 0) goto Le
            java.lang.String r1 = "isRegularFile"
            r0.add(r1)
        Le:
            boolean r1 = r9.isDirectory
            if (r1 == 0) goto L17
            java.lang.String r1 = "isDirectory"
            r0.add(r1)
        L17:
            java.lang.Long r1 = r9.size
            if (r1 == 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount="
            r1.append(r2)
            java.lang.Long r2 = r9.size
            long r2 = r2.longValue()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L35:
            java.lang.Long r1 = r9.createdAtMillis
            if (r1 == 0) goto L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "createdAt="
            r1.append(r2)
            java.lang.Long r2 = r9.createdAtMillis
            long r2 = r2.longValue()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L53:
            java.lang.Long r1 = r9.lastModifiedAtMillis
            if (r1 == 0) goto L71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "lastModifiedAt="
            r1.append(r2)
            java.lang.Long r2 = r9.lastModifiedAtMillis
            long r2 = r2.longValue()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L71:
            java.lang.Long r1 = r9.lastAccessedAtMillis
            if (r1 == 0) goto L8f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "lastAccessedAt="
            r1.append(r2)
            java.lang.Long r2 = r9.lastAccessedAtMillis
            long r2 = r2.longValue()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L8f:
            java.util.Map<kotlin.reflect.d<?>, java.lang.Object> r1 = r9.extras
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "extras="
            r1.append(r2)
            java.util.Map<kotlin.reflect.d<?>, java.lang.Object> r2 = r9.extras
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        Lad:
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "FileMetadata("
            java.lang.String r3 = ")"
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
