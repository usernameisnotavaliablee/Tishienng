package l0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Entity(tableName = "face")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {

    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id", typeAffinity = 3)
    private long a;

    @androidx.room.ColumnInfo(name = "identify", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String b;

    @androidx.room.ColumnInfo(name = "type", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String c;

    @androidx.room.ColumnInfo(name = "facePath", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String d;

    @androidx.room.ColumnInfo(name = "coordinates", typeAffinity = 2)
    @org.jetbrains.annotations.Nullable
    private java.lang.String e;

    @androidx.room.ColumnInfo(name = "timeStamp", typeAffinity = 2)
    @org.jetbrains.annotations.Nullable
    private java.lang.String f;

    public b(long r2, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8) {
            r1 = this;
            java.lang.String r0 = "identify"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "facePath"
            kotlin.jvm.internal.g0.p(r6, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r4
            r1.c = r5
            r1.d = r6
            r1.e = r7
            r1.f = r8
            return
    }

    public /* synthetic */ b(long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, kotlin.jvm.internal.v r17) {
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L6
            r9 = 0
        L6:
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ l0.b h(l0.b r8, long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, java.lang.Object r17) {
            r0 = r16 & 1
            if (r0 == 0) goto L6
            long r9 = r8.a
        L6:
            r1 = r9
            r9 = r16 & 2
            if (r9 == 0) goto Ld
            java.lang.String r11 = r8.b
        Ld:
            r3 = r11
            r9 = r16 & 4
            if (r9 == 0) goto L14
            java.lang.String r12 = r8.c
        L14:
            r4 = r12
            r9 = r16 & 8
            if (r9 == 0) goto L1b
            java.lang.String r13 = r8.d
        L1b:
            r5 = r13
            r9 = r16 & 16
            if (r9 == 0) goto L22
            java.lang.String r14 = r8.e
        L22:
            r6 = r14
            r9 = r16 & 32
            if (r9 == 0) goto L29
            java.lang.String r15 = r8.f
        L29:
            r0 = r8
            r7 = r15
            l0.b r8 = r0.g(r1, r3, r4, r5, r6, r7)
            return r8
    }

    public final long a() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof l0.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l0.b r8 = (l0.b) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L36
            return r2
        L36:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L41
            return r2
        L41:
            java.lang.String r1 = r7.f
            java.lang.String r8 = r8.f
            boolean r8 = kotlin.jvm.internal.g0.g(r1, r8)
            if (r8 != 0) goto L4c
            return r2
        L4c:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final l0.b g(long r10, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.Nullable java.lang.String r15, @org.jetbrains.annotations.Nullable java.lang.String r16) {
            r9 = this;
            java.lang.String r0 = "identify"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "facePath"
            kotlin.jvm.internal.g0.p(r14, r0)
            l0.b r1 = new l0.b
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r1.<init>(r2, r4, r5, r6, r7, r8)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r3.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.d
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.e
            r2 = 0
            if (r1 != 0) goto L2a
            r1 = 0
            goto L2e
        L2a:
            int r1 = r1.hashCode()
        L2e:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.f
            if (r1 != 0) goto L36
            goto L3a
        L36:
            int r2 = r1.hashCode()
        L3a:
            int r0 = r0 + r2
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public final long k() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public final void n(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public final void o(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d = r2
            return
    }

    public final void p(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void q(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    public final void r(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public final void s(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r9 = this;
            long r0 = r9.a
            java.lang.String r2 = r9.b
            java.lang.String r3 = r9.c
            java.lang.String r4 = r9.d
            java.lang.String r5 = r9.e
            java.lang.String r6 = r9.f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "FaceDb(id="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = ", identify="
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = ", type="
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = ", facePath="
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = ", coordinates="
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = ", timeStamp="
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = ")"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            return r0
    }
}
