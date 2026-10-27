package l0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Entity(indices = {@androidx.room.Index({"type"}), @androidx.room.Index({"isShowIndex"}), @androidx.room.Index({"mkey"}), @androidx.room.Index({"sort"}), @androidx.room.Index({"homeSort"}), @androidx.room.Index({"type", "sort"}), @androidx.room.Index({"isShowIndex", "homeSort"})}, tableName = "menu")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {

    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "mkey", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String a;

    @androidx.room.ColumnInfo(name = "name", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String b;

    @androidx.room.ColumnInfo(name = "icon", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String c;

    @androidx.room.ColumnInfo(name = "iconS", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String d;

    @androidx.room.ColumnInfo(name = "isShow", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String e;

    @androidx.room.ColumnInfo(name = "isEnabled", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f;

    @androidx.room.ColumnInfo(name = "isLogin", typeAffinity = 3)
    private int g;

    @androidx.room.ColumnInfo(name = "linkUrl", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String h;

    @androidx.room.ColumnInfo(name = "type", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String i;

    @androidx.room.ColumnInfo(name = "lastUploadTime", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String j;

    @androidx.room.ColumnInfo(name = "sort", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "isShowIndex", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2333l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "homeSort", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2334m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "isShowH5Title", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2335n;

    public c(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, int r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15) {
            r1 = this;
            java.lang.String r0 = "mkey"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "iconS"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "isShow"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "isEnabled"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "linkUrl"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "lastUploadTime"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "sort"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "isShowIndex"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "homeSort"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "isShowH5Title"
            kotlin.jvm.internal.g0.p(r15, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.g = r8
            r1.h = r9
            r1.i = r10
            r1.j = r11
            r1.k = r12
            r1.f2333l = r13
            r1.f2334m = r14
            r1.f2335n = r15
            return
    }

    public static /* synthetic */ l0.c p(l0.c r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, java.lang.Object r30) {
            r0 = r29
            r1 = r0 & 1
            if (r1 == 0) goto L9
            java.lang.String r1 = r14.a
            goto La
        L9:
            r1 = r15
        La:
            r2 = r0 & 2
            if (r2 == 0) goto L11
            java.lang.String r2 = r14.b
            goto L13
        L11:
            r2 = r16
        L13:
            r3 = r0 & 4
            if (r3 == 0) goto L1a
            java.lang.String r3 = r14.c
            goto L1c
        L1a:
            r3 = r17
        L1c:
            r4 = r0 & 8
            if (r4 == 0) goto L23
            java.lang.String r4 = r14.d
            goto L25
        L23:
            r4 = r18
        L25:
            r5 = r0 & 16
            if (r5 == 0) goto L2c
            java.lang.String r5 = r14.e
            goto L2e
        L2c:
            r5 = r19
        L2e:
            r6 = r0 & 32
            if (r6 == 0) goto L35
            java.lang.String r6 = r14.f
            goto L37
        L35:
            r6 = r20
        L37:
            r7 = r0 & 64
            if (r7 == 0) goto L3e
            int r7 = r14.g
            goto L40
        L3e:
            r7 = r21
        L40:
            r8 = r0 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L47
            java.lang.String r8 = r14.h
            goto L49
        L47:
            r8 = r22
        L49:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L50
            java.lang.String r9 = r14.i
            goto L52
        L50:
            r9 = r23
        L52:
            r10 = r0 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto L59
            java.lang.String r10 = r14.j
            goto L5b
        L59:
            r10 = r24
        L5b:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L62
            java.lang.String r11 = r14.k
            goto L64
        L62:
            r11 = r25
        L64:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L6b
            java.lang.String r12 = r14.f2333l
            goto L6d
        L6b:
            r12 = r26
        L6d:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L74
            java.lang.String r13 = r14.f2334m
            goto L76
        L74:
            r13 = r27
        L76:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L9a
            java.lang.String r0 = r14.f2335n
            r29 = r0
        L7e:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            goto L9d
        L9a:
            r29 = r28
            goto L7e
        L9d:
            l0.c r14 = r15.o(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r14
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String A() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String B() {
            r1 = this;
            java.lang.String r0 = r1.f2335n
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String C() {
            r1 = this;
            java.lang.String r0 = r1.f2333l
            return r0
    }

    public final void D(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f = r2
            return
    }

    public final void E(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2334m = r2
            return
    }

    public final void F(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    public final void G(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d = r2
            return
    }

    public final void H(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.j = r2
            return
    }

    public final void I(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.h = r2
            return
    }

    public final void J(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public final void K(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    public final void L(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    public final void M(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.e = r2
            return
    }

    public final void N(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2335n = r2
            return
    }

    public final void O(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2333l = r2
            return
    }

    public final void P(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.k = r2
            return
    }

    public final void Q(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.i = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f2333l
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f2334m
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof l0.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l0.c r5 = (l0.c) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            int r1 = r4.g
            int r3 = r5.g
            if (r1 == r3) goto L55
            return r2
        L55:
            java.lang.String r1 = r4.h
            java.lang.String r3 = r5.h
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            java.lang.String r1 = r4.i
            java.lang.String r3 = r5.i
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L6b
            return r2
        L6b:
            java.lang.String r1 = r4.j
            java.lang.String r3 = r5.j
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L76
            return r2
        L76:
            java.lang.String r1 = r4.k
            java.lang.String r3 = r5.k
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L81
            return r2
        L81:
            java.lang.String r1 = r4.f2333l
            java.lang.String r3 = r5.f2333l
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L8c
            return r2
        L8c:
            java.lang.String r1 = r4.f2334m
            java.lang.String r3 = r5.f2334m
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L97
            return r2
        L97:
            java.lang.String r1 = r4.f2335n
            java.lang.String r5 = r5.f2335n
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto La2
            return r2
        La2:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f2335n
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.d
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.e
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.g
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.h
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.i
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.j
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.k
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2333l
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2334m
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2335n
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public final int l() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String n() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final l0.c o(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, int r23, @org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull java.lang.String r30) {
            r16 = this;
            java.lang.String r0 = "mkey"
            r2 = r17
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            r3 = r18
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "icon"
            r4 = r19
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "iconS"
            r5 = r20
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "isShow"
            r6 = r21
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "isEnabled"
            r7 = r22
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "linkUrl"
            r9 = r24
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "type"
            r10 = r25
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "lastUploadTime"
            r11 = r26
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "sort"
            r12 = r27
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "isShowIndex"
            r13 = r28
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "homeSort"
            r14 = r29
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "isShowH5Title"
            r15 = r30
            kotlin.jvm.internal.g0.p(r15, r0)
            l0.c r1 = new l0.c
            r8 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String q() {
            r1 = this;
            java.lang.String r0 = r1.f2334m
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String s() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String t() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r16 = this;
            r0 = r16
            java.lang.String r1 = r0.a
            java.lang.String r2 = r0.b
            java.lang.String r3 = r0.c
            java.lang.String r4 = r0.d
            java.lang.String r5 = r0.e
            java.lang.String r6 = r0.f
            int r7 = r0.g
            java.lang.String r8 = r0.h
            java.lang.String r9 = r0.i
            java.lang.String r10 = r0.j
            java.lang.String r11 = r0.k
            java.lang.String r12 = r0.f2333l
            java.lang.String r13 = r0.f2334m
            java.lang.String r14 = r0.f2335n
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "MenuDb(mkey="
            r15.append(r0)
            r15.append(r1)
            java.lang.String r0 = ", name="
            r15.append(r0)
            r15.append(r2)
            java.lang.String r0 = ", icon="
            r15.append(r0)
            r15.append(r3)
            java.lang.String r0 = ", iconS="
            r15.append(r0)
            r15.append(r4)
            java.lang.String r0 = ", isShow="
            r15.append(r0)
            r15.append(r5)
            java.lang.String r0 = ", isEnabled="
            r15.append(r0)
            r15.append(r6)
            java.lang.String r0 = ", isLogin="
            r15.append(r0)
            r15.append(r7)
            java.lang.String r0 = ", linkUrl="
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = ", type="
            r15.append(r0)
            r15.append(r9)
            java.lang.String r0 = ", lastUploadTime="
            r15.append(r0)
            r15.append(r10)
            java.lang.String r0 = ", sort="
            r15.append(r0)
            r15.append(r11)
            java.lang.String r0 = ", isShowIndex="
            r15.append(r0)
            r15.append(r12)
            java.lang.String r0 = ", homeSort="
            r15.append(r0)
            r15.append(r13)
            java.lang.String r0 = ", isShowH5Title="
            r15.append(r0)
            r15.append(r14)
            java.lang.String r0 = ")"
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String u() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String v() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String w() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String x() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String y() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public final int z() {
            r1 = this;
            int r0 = r1.g
            return r0
    }
}
