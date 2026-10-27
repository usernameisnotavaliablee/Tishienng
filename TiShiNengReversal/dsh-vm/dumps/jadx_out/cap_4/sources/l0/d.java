package l0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Entity(tableName = "sports")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d {

    @androidx.room.ColumnInfo(defaultValue = "", name = "remarkId", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String A;

    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "identify", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String a;

    @androidx.room.ColumnInfo(name = "userNumber", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String b;

    @androidx.room.ColumnInfo(name = "sportsType", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String c;

    @androidx.room.ColumnInfo(name = "sportsSet", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String d;

    @androidx.room.ColumnInfo(name = "startTime", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String e;

    @androidx.room.ColumnInfo(name = "endTime", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f;

    @androidx.room.ColumnInfo(name = "countTime", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String g;

    @androidx.room.ColumnInfo(name = "distance", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String h;

    @androidx.room.ColumnInfo(name = "gpsDistance", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String i;

    @androidx.room.ColumnInfo(name = "latLngList", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String j;

    @androidx.room.ColumnInfo(name = "stepList", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "passLatLngList", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2336l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "isFaceOut", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2337m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "faceDetectCount", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2338n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "uploadType", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2339o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "isException", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2340p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "startFace", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2341q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "midFace", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2342r;

    /* renamed from: s, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "endFace", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2343s;

    /* renamed from: t, reason: collision with root package name */
    @androidx.room.ColumnInfo(defaultValue = "0", name = "isValid", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2344t;

    /* renamed from: u, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "faceCheckingDistance", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2345u;

    /* renamed from: v, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "pauseLatLng", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2346v;

    /* renamed from: w, reason: collision with root package name */
    @androidx.room.ColumnInfo(defaultValue = "0", name = "isOpenDevelop", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2347w;

    /* renamed from: x, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "confirmCount", typeAffinity = 3)
    private int f2348x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.room.ColumnInfo(name = "momentIsValid", typeAffinity = 3)
    private int f2349y;

    /* renamed from: z, reason: collision with root package name */
    @androidx.room.ColumnInfo(defaultValue = "", name = "faceOutIndex", typeAffinity = 2)
    @org.jetbrains.annotations.NotNull
    private java.lang.String f2350z;

    public d(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull java.lang.String r33, @org.jetbrains.annotations.NotNull java.lang.String r34, @org.jetbrains.annotations.NotNull java.lang.String r35, @org.jetbrains.annotations.NotNull java.lang.String r36, @org.jetbrains.annotations.NotNull java.lang.String r37, @org.jetbrains.annotations.NotNull java.lang.String r38, @org.jetbrains.annotations.NotNull java.lang.String r39, int r40, int r41, @org.jetbrains.annotations.NotNull java.lang.String r42, @org.jetbrains.annotations.NotNull java.lang.String r43) {
            r16 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            java.lang.String r0 = "identify"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "userNumber"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sportsType"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "sportsSet"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "startTime"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "endTime"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "countTime"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "distance"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "gpsDistance"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "latLngList"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "stepList"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "passLatLngList"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "isFaceOut"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "faceDetectCount"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "uploadType"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "isException"
            r15 = r32
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "startFace"
            r15 = r33
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "midFace"
            r15 = r34
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "endFace"
            r15 = r35
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "isValid"
            r15 = r36
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "faceCheckingDistance"
            r15 = r37
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "pauseLatLng"
            r15 = r38
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "isOpenDevelop"
            r15 = r39
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "faceOutIndex"
            r15 = r42
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "remarkId"
            r15 = r43
            kotlin.jvm.internal.g0.p(r15, r0)
            r16.<init>()
            r0 = r16
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.f2336l = r12
            r0.f2337m = r13
            r0.f2338n = r14
            r1 = r31
            r0.f2339o = r1
            r1 = r32
            r0.f2340p = r1
            r1 = r33
            r0.f2341q = r1
            r1 = r34
            r0.f2342r = r1
            r1 = r35
            r0.f2343s = r1
            r1 = r36
            r0.f2344t = r1
            r1 = r37
            r0.f2345u = r1
            r1 = r38
            r0.f2346v = r1
            r1 = r39
            r0.f2347w = r1
            r1 = r40
            r0.f2348x = r1
            r1 = r41
            r0.f2349y = r1
            r1 = r42
            r0.f2350z = r1
            r0.A = r15
            return
    }

    public /* synthetic */ d(java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, int r54, int r55, java.lang.String r56, java.lang.String r57, int r58, kotlin.jvm.internal.v r59) {
            r30 = this;
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r58 & r0
            r1 = 0
            if (r0 == 0) goto La
            r26 = 0
            goto Lc
        La:
            r26 = r54
        Lc:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r58 & r0
            if (r0 == 0) goto L15
            r27 = 0
            goto L17
        L15:
            r27 = r55
        L17:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r58 & r0
            java.lang.String r1 = ""
            if (r0 == 0) goto L22
            r28 = r1
            goto L24
        L22:
            r28 = r56
        L24:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r58 & r0
            if (r0 == 0) goto L5d
            r29 = r1
        L2c:
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r40
            r13 = r41
            r14 = r42
            r15 = r43
            r16 = r44
            r17 = r45
            r18 = r46
            r19 = r47
            r20 = r48
            r21 = r49
            r22 = r50
            r23 = r51
            r24 = r52
            r25 = r53
            goto L60
        L5d:
            r29 = r57
            goto L2c
        L60:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
    }

    public static /* synthetic */ l0.d C(l0.d r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, int r42, java.lang.String r43, java.lang.String r44, int r45, java.lang.Object r46) {
            r0 = r17
            r1 = r45
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            java.lang.String r2 = r0.a
            goto Ld
        Lb:
            r2 = r18
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            java.lang.String r3 = r0.b
            goto L16
        L14:
            r3 = r19
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            java.lang.String r4 = r0.c
            goto L1f
        L1d:
            r4 = r20
        L1f:
            r5 = r1 & 8
            if (r5 == 0) goto L26
            java.lang.String r5 = r0.d
            goto L28
        L26:
            r5 = r21
        L28:
            r6 = r1 & 16
            if (r6 == 0) goto L2f
            java.lang.String r6 = r0.e
            goto L31
        L2f:
            r6 = r22
        L31:
            r7 = r1 & 32
            if (r7 == 0) goto L38
            java.lang.String r7 = r0.f
            goto L3a
        L38:
            r7 = r23
        L3a:
            r8 = r1 & 64
            if (r8 == 0) goto L41
            java.lang.String r8 = r0.g
            goto L43
        L41:
            r8 = r24
        L43:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4a
            java.lang.String r9 = r0.h
            goto L4c
        L4a:
            r9 = r25
        L4c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L53
            java.lang.String r10 = r0.i
            goto L55
        L53:
            r10 = r26
        L55:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L5c
            java.lang.String r11 = r0.j
            goto L5e
        L5c:
            r11 = r27
        L5e:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L65
            java.lang.String r12 = r0.k
            goto L67
        L65:
            r12 = r28
        L67:
            r13 = r1 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L6e
            java.lang.String r13 = r0.f2336l
            goto L70
        L6e:
            r13 = r29
        L70:
            r14 = r1 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L77
            java.lang.String r14 = r0.f2337m
            goto L79
        L77:
            r14 = r30
        L79:
            r15 = r1 & 8192(0x2000, float:1.148E-41)
            if (r15 == 0) goto L80
            java.lang.String r15 = r0.f2338n
            goto L82
        L80:
            r15 = r31
        L82:
            r18 = r2
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L8b
            java.lang.String r2 = r0.f2339o
            goto L8d
        L8b:
            r2 = r32
        L8d:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L97
            java.lang.String r1 = r0.f2340p
            goto L99
        L97:
            r1 = r33
        L99:
            r16 = 65536(0x10000, float:9.1835E-41)
            r16 = r45 & r16
            r19 = r1
            if (r16 == 0) goto La4
            java.lang.String r1 = r0.f2341q
            goto La6
        La4:
            r1 = r34
        La6:
            r16 = 131072(0x20000, float:1.83671E-40)
            r16 = r45 & r16
            r20 = r1
            if (r16 == 0) goto Lb1
            java.lang.String r1 = r0.f2342r
            goto Lb3
        Lb1:
            r1 = r35
        Lb3:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r45 & r16
            r21 = r1
            if (r16 == 0) goto Lbe
            java.lang.String r1 = r0.f2343s
            goto Lc0
        Lbe:
            r1 = r36
        Lc0:
            r16 = 524288(0x80000, float:7.34684E-40)
            r16 = r45 & r16
            r22 = r1
            if (r16 == 0) goto Lcb
            java.lang.String r1 = r0.f2344t
            goto Lcd
        Lcb:
            r1 = r37
        Lcd:
            r16 = 1048576(0x100000, float:1.469368E-39)
            r16 = r45 & r16
            r23 = r1
            if (r16 == 0) goto Ld8
            java.lang.String r1 = r0.f2345u
            goto Lda
        Ld8:
            r1 = r38
        Lda:
            r16 = 2097152(0x200000, float:2.938736E-39)
            r16 = r45 & r16
            r24 = r1
            if (r16 == 0) goto Le5
            java.lang.String r1 = r0.f2346v
            goto Le7
        Le5:
            r1 = r39
        Le7:
            r16 = 4194304(0x400000, float:5.877472E-39)
            r16 = r45 & r16
            r25 = r1
            if (r16 == 0) goto Lf2
            java.lang.String r1 = r0.f2347w
            goto Lf4
        Lf2:
            r1 = r40
        Lf4:
            r16 = 8388608(0x800000, float:1.1754944E-38)
            r16 = r45 & r16
            r26 = r1
            if (r16 == 0) goto Lff
            int r1 = r0.f2348x
            goto L101
        Lff:
            r1 = r41
        L101:
            r16 = 16777216(0x1000000, float:2.3509887E-38)
            r16 = r45 & r16
            r27 = r1
            if (r16 == 0) goto L10c
            int r1 = r0.f2349y
            goto L10e
        L10c:
            r1 = r42
        L10e:
            r16 = 33554432(0x2000000, float:9.403955E-38)
            r16 = r45 & r16
            r28 = r1
            if (r16 == 0) goto L119
            java.lang.String r1 = r0.f2350z
            goto L11b
        L119:
            r1 = r43
        L11b:
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            r16 = r45 & r16
            if (r16 == 0) goto L15e
            r29 = r1
            java.lang.String r1 = r0.A
            r44 = r29
            r45 = r1
        L129:
            r34 = r19
            r35 = r20
            r36 = r21
            r37 = r22
            r38 = r23
            r39 = r24
            r40 = r25
            r41 = r26
            r42 = r27
            r43 = r28
            r33 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r19 = r18
            r18 = r0
            goto L163
        L15e:
            r45 = r44
            r44 = r1
            goto L129
        L163:
            l0.d r0 = r18.B(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String A() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public final void A0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.e = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final l0.d B(@org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull java.lang.String r33, @org.jetbrains.annotations.NotNull java.lang.String r34, @org.jetbrains.annotations.NotNull java.lang.String r35, @org.jetbrains.annotations.NotNull java.lang.String r36, @org.jetbrains.annotations.NotNull java.lang.String r37, @org.jetbrains.annotations.NotNull java.lang.String r38, @org.jetbrains.annotations.NotNull java.lang.String r39, @org.jetbrains.annotations.NotNull java.lang.String r40, @org.jetbrains.annotations.NotNull java.lang.String r41, @org.jetbrains.annotations.NotNull java.lang.String r42, @org.jetbrains.annotations.NotNull java.lang.String r43, @org.jetbrains.annotations.NotNull java.lang.String r44, @org.jetbrains.annotations.NotNull java.lang.String r45, @org.jetbrains.annotations.NotNull java.lang.String r46, @org.jetbrains.annotations.NotNull java.lang.String r47, @org.jetbrains.annotations.NotNull java.lang.String r48, @org.jetbrains.annotations.NotNull java.lang.String r49, @org.jetbrains.annotations.NotNull java.lang.String r50, @org.jetbrains.annotations.NotNull java.lang.String r51, @org.jetbrains.annotations.NotNull java.lang.String r52, int r53, int r54, @org.jetbrains.annotations.NotNull java.lang.String r55, @org.jetbrains.annotations.NotNull java.lang.String r56) {
            r29 = this;
            java.lang.String r0 = "identify"
            r2 = r30
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "userNumber"
            r3 = r31
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "sportsType"
            r4 = r32
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "sportsSet"
            r5 = r33
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "startTime"
            r6 = r34
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "endTime"
            r7 = r35
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "countTime"
            r8 = r36
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "distance"
            r9 = r37
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "gpsDistance"
            r10 = r38
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "latLngList"
            r11 = r39
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "stepList"
            r12 = r40
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "passLatLngList"
            r13 = r41
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "isFaceOut"
            r14 = r42
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "faceDetectCount"
            r15 = r43
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "uploadType"
            r1 = r44
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "isException"
            r1 = r45
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "startFace"
            r1 = r46
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "midFace"
            r1 = r47
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "endFace"
            r1 = r48
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "isValid"
            r1 = r49
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "faceCheckingDistance"
            r1 = r50
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pauseLatLng"
            r1 = r51
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "isOpenDevelop"
            r1 = r52
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "faceOutIndex"
            r1 = r55
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "remarkId"
            r1 = r56
            kotlin.jvm.internal.g0.p(r1, r0)
            l0.d r1 = new l0.d
            r16 = r44
            r17 = r45
            r18 = r46
            r19 = r47
            r20 = r48
            r21 = r49
            r22 = r50
            r23 = r51
            r24 = r52
            r25 = r53
            r26 = r54
            r27 = r55
            r28 = r56
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r1
    }

    public final void B0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.k = r2
            return
    }

    public final void C0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2339o = r2
            return
    }

    public final int D() {
            r1 = this;
            int r0 = r1.f2348x
            return r0
    }

    public final void D0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String E() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public final void E0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2344t = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String F() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String G() {
            r1 = this;
            java.lang.String r0 = r1.f2343s
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String H() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String I() {
            r1 = this;
            java.lang.String r0 = r1.f2345u
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String J() {
            r1 = this;
            java.lang.String r0 = r1.f2338n
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String K() {
            r1 = this;
            java.lang.String r0 = r1.f2350z
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String L() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String M() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String N() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String O() {
            r1 = this;
            java.lang.String r0 = r1.f2342r
            return r0
    }

    public final int P() {
            r1 = this;
            int r0 = r1.f2349y
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String Q() {
            r1 = this;
            java.lang.String r0 = r1.f2336l
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String R() {
            r1 = this;
            java.lang.String r0 = r1.f2346v
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String S() {
            r1 = this;
            java.lang.String r0 = r1.A
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String T() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String U() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String V() {
            r1 = this;
            java.lang.String r0 = r1.f2341q
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String W() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String X() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String Y() {
            r1 = this;
            java.lang.String r0 = r1.f2339o
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String Z() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a0() {
            r1 = this;
            java.lang.String r0 = r1.f2340p
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b0() {
            r1 = this;
            java.lang.String r0 = r1.f2337m
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c0() {
            r1 = this;
            java.lang.String r0 = r1.f2347w
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f2336l
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String d0() {
            r1 = this;
            java.lang.String r0 = r1.f2344t
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f2337m
            return r0
    }

    public final void e0(int r1) {
            r0 = this;
            r0.f2348x = r1
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof l0.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l0.d r5 = (l0.d) r5
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
            java.lang.String r1 = r4.g
            java.lang.String r3 = r5.g
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r4.h
            java.lang.String r3 = r5.h
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r4.i
            java.lang.String r3 = r5.i
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r4.j
            java.lang.String r3 = r5.j
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L7a
            return r2
        L7a:
            java.lang.String r1 = r4.k
            java.lang.String r3 = r5.k
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L85
            return r2
        L85:
            java.lang.String r1 = r4.f2336l
            java.lang.String r3 = r5.f2336l
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L90
            return r2
        L90:
            java.lang.String r1 = r4.f2337m
            java.lang.String r3 = r5.f2337m
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L9b
            return r2
        L9b:
            java.lang.String r1 = r4.f2338n
            java.lang.String r3 = r5.f2338n
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto La6
            return r2
        La6:
            java.lang.String r1 = r4.f2339o
            java.lang.String r3 = r5.f2339o
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto Lb1
            return r2
        Lb1:
            java.lang.String r1 = r4.f2340p
            java.lang.String r3 = r5.f2340p
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto Lbc
            return r2
        Lbc:
            java.lang.String r1 = r4.f2341q
            java.lang.String r3 = r5.f2341q
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto Lc7
            return r2
        Lc7:
            java.lang.String r1 = r4.f2342r
            java.lang.String r3 = r5.f2342r
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto Ld2
            return r2
        Ld2:
            java.lang.String r1 = r4.f2343s
            java.lang.String r3 = r5.f2343s
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto Ldd
            return r2
        Ldd:
            java.lang.String r1 = r4.f2344t
            java.lang.String r3 = r5.f2344t
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto Le8
            return r2
        Le8:
            java.lang.String r1 = r4.f2345u
            java.lang.String r3 = r5.f2345u
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto Lf3
            return r2
        Lf3:
            java.lang.String r1 = r4.f2346v
            java.lang.String r3 = r5.f2346v
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto Lfe
            return r2
        Lfe:
            java.lang.String r1 = r4.f2347w
            java.lang.String r3 = r5.f2347w
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L109
            return r2
        L109:
            int r1 = r4.f2348x
            int r3 = r5.f2348x
            if (r1 == r3) goto L110
            return r2
        L110:
            int r1 = r4.f2349y
            int r3 = r5.f2349y
            if (r1 == r3) goto L117
            return r2
        L117:
            java.lang.String r1 = r4.f2350z
            java.lang.String r3 = r5.f2350z
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L122
            return r2
        L122:
            java.lang.String r1 = r4.A
            java.lang.String r5 = r5.A
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L12d
            return r2
        L12d:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f2338n
            return r0
    }

    public final void f0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.g = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f2339o
            return r0
    }

    public final void g0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.h = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.f2340p
            return r0
    }

    public final void h0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2343s = r2
            return
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
            java.lang.String r1 = r2.g
            int r1 = r1.hashCode()
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
            java.lang.String r1 = r2.f2336l
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2337m
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2338n
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2339o
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2340p
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2341q
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2342r
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2343s
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2344t
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2345u
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2346v
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2347w
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f2348x
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f2349y
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2350z
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.A
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.f2341q
            return r0
    }

    public final void i0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.f2342r
            return r0
    }

    public final void j0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2340p = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.f2343s
            return r0
    }

    public final void k0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2345u = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public final void l0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2338n = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f2344t
            return r0
    }

    public final void m0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2337m = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String n() {
            r1 = this;
            java.lang.String r0 = r1.f2345u
            return r0
    }

    public final void n0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2350z = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String o() {
            r1 = this;
            java.lang.String r0 = r1.f2346v
            return r0
    }

    public final void o0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.i = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String p() {
            r1 = this;
            java.lang.String r0 = r1.f2347w
            return r0
    }

    public final void p0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    public final int q() {
            r1 = this;
            int r0 = r1.f2348x
            return r0
    }

    public final void q0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.j = r2
            return
    }

    public final int r() {
            r1 = this;
            int r0 = r1.f2349y
            return r0
    }

    public final void r0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2342r = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String s() {
            r1 = this;
            java.lang.String r0 = r1.f2350z
            return r0
    }

    public final void s0(int r1) {
            r0 = this;
            r0.f2349y = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String t() {
            r1 = this;
            java.lang.String r0 = r1.A
            return r0
    }

    public final void t0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2347w = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r29 = this;
            r0 = r29
            java.lang.String r1 = r0.a
            java.lang.String r2 = r0.b
            java.lang.String r3 = r0.c
            java.lang.String r4 = r0.d
            java.lang.String r5 = r0.e
            java.lang.String r6 = r0.f
            java.lang.String r7 = r0.g
            java.lang.String r8 = r0.h
            java.lang.String r9 = r0.i
            java.lang.String r10 = r0.j
            java.lang.String r11 = r0.k
            java.lang.String r12 = r0.f2336l
            java.lang.String r13 = r0.f2337m
            java.lang.String r14 = r0.f2338n
            java.lang.String r15 = r0.f2339o
            r16 = r15
            java.lang.String r15 = r0.f2340p
            r17 = r15
            java.lang.String r15 = r0.f2341q
            r18 = r15
            java.lang.String r15 = r0.f2342r
            r19 = r15
            java.lang.String r15 = r0.f2343s
            r20 = r15
            java.lang.String r15 = r0.f2344t
            r21 = r15
            java.lang.String r15 = r0.f2345u
            r22 = r15
            java.lang.String r15 = r0.f2346v
            r23 = r15
            java.lang.String r15 = r0.f2347w
            r24 = r15
            int r15 = r0.f2348x
            r25 = r15
            int r15 = r0.f2349y
            r26 = r15
            java.lang.String r15 = r0.f2350z
            r27 = r15
            java.lang.String r15 = r0.A
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r28 = r15
            java.lang.String r15 = "SportsDb(identify="
            r0.append(r15)
            r0.append(r1)
            java.lang.String r1 = ", userNumber="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", sportsType="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", sportsSet="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", startTime="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", endTime="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", countTime="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", distance="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", gpsDistance="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", latLngList="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", stepList="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", passLatLngList="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", isFaceOut="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", faceDetectCount="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", uploadType="
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", isException="
            r0.append(r1)
            r1 = r17
            r0.append(r1)
            java.lang.String r1 = ", startFace="
            r0.append(r1)
            r1 = r18
            r0.append(r1)
            java.lang.String r1 = ", midFace="
            r0.append(r1)
            r1 = r19
            r0.append(r1)
            java.lang.String r1 = ", endFace="
            r0.append(r1)
            r1 = r20
            r0.append(r1)
            java.lang.String r1 = ", isValid="
            r0.append(r1)
            r1 = r21
            r0.append(r1)
            java.lang.String r1 = ", faceCheckingDistance="
            r0.append(r1)
            r1 = r22
            r0.append(r1)
            java.lang.String r1 = ", pauseLatLng="
            r0.append(r1)
            r1 = r23
            r0.append(r1)
            java.lang.String r1 = ", isOpenDevelop="
            r0.append(r1)
            r1 = r24
            r0.append(r1)
            java.lang.String r1 = ", confirmCount="
            r0.append(r1)
            r1 = r25
            r0.append(r1)
            java.lang.String r1 = ", momentIsValid="
            r0.append(r1)
            r1 = r26
            r0.append(r1)
            java.lang.String r1 = ", faceOutIndex="
            r0.append(r1)
            r1 = r27
            r0.append(r1)
            java.lang.String r1 = ", remarkId="
            r0.append(r1)
            r1 = r28
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String u() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public final void u0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2336l = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String v() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public final void v0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2346v = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String w() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public final void w0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.A = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String x() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public final void x0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String y() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public final void y0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String z() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public final void z0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f2341q = r2
            return
    }
}
