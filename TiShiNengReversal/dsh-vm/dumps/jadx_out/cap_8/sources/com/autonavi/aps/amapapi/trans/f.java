package com.autonavi.aps.amapapi.trans;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f {
    protected static java.lang.String I;
    protected static java.lang.String K;
    protected java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> A;
    protected java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> B;
    protected java.lang.String C;
    protected java.lang.String D;
    protected java.util.ArrayList<com.amap.api.col.p0003l.m9> E;
    protected java.lang.String F;
    protected java.lang.String G;
    protected byte[] H;
    protected java.lang.String J;
    protected java.lang.String L;
    protected java.lang.String M;
    protected java.lang.String N;
    protected int O;
    final int P;
    private byte[] Q;
    private int R;
    private java.util.List<com.autonavi.aps.amapapi.restruct.f> S;
    private java.util.List<com.autonavi.aps.amapapi.restruct.d> T;
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    protected short f5827b;

    /* renamed from: c, reason: collision with root package name */
    protected java.lang.String f5828c;

    /* renamed from: d, reason: collision with root package name */
    protected java.lang.String f5829d;

    /* renamed from: e, reason: collision with root package name */
    protected java.lang.String f5830e;

    /* renamed from: f, reason: collision with root package name */
    protected java.lang.String f5831f;

    /* renamed from: g, reason: collision with root package name */
    protected java.lang.String f5832g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f5833h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f5834i;

    /* renamed from: j, reason: collision with root package name */
    protected java.lang.String f5835j;

    /* renamed from: k, reason: collision with root package name */
    protected java.lang.String f5836k;
    protected java.lang.String l;
    protected java.lang.String m;
    protected java.lang.String n;
    protected java.lang.String o;
    protected java.lang.String p;
    protected java.lang.String q;
    protected java.lang.String r;
    protected java.lang.String s;
    protected java.lang.String t;
    protected java.lang.String u;
    protected java.lang.String v;
    protected java.lang.String w;
    protected java.lang.String x;
    protected java.lang.String y;
    protected int z;

    static {
            return
    }

    public f() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "1"
            r3.a = r0
            r0 = 0
            r3.f5827b = r0
            r1 = 0
            r3.f5828c = r1
            r3.f5829d = r1
            r3.f5830e = r1
            r3.f5831f = r1
            r3.f5832g = r1
            r3.f5833h = r1
            r3.f5834i = r1
            r3.f5835j = r1
            r3.f5836k = r1
            r3.l = r1
            r3.m = r1
            r3.n = r1
            r3.o = r1
            r3.p = r1
            r3.q = r1
            r3.r = r1
            r3.s = r1
            r3.t = r1
            r3.u = r1
            r3.v = r1
            r3.w = r1
            r3.x = r1
            r3.y = r1
            r3.z = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.A = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.B = r2
            r3.C = r1
            r3.D = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.E = r2
            r3.F = r1
            r3.G = r1
            r3.H = r1
            r3.Q = r1
            r3.R = r0
            r3.J = r1
            r3.L = r1
            r3.M = r1
            r3.N = r1
            r3.O = r0
            r3.S = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r3.T = r0
            r0 = 3
            r3.P = r0
            return
    }

    private static int a(java.lang.String r3, byte[] r4, int r5) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lc
            int r5 = r5 + 1
            return r5
        Lc:
            r3 = move-exception
            goto L25
        Le:
            java.lang.String r1 = "GBK"
            byte[] r3 = r3.getBytes(r1)     // Catch: java.lang.Throwable -> Lc
            int r1 = r3.length     // Catch: java.lang.Throwable -> Lc
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 <= r2) goto L1b
            r1 = 127(0x7f, float:1.78E-43)
        L1b:
            byte r2 = (byte) r1     // Catch: java.lang.Throwable -> Lc
            r4[r5] = r2     // Catch: java.lang.Throwable -> Lc
            int r5 = r5 + 1
            java.lang.System.arraycopy(r3, r0, r4, r5, r1)     // Catch: java.lang.Throwable -> Lc
            int r5 = r5 + r1
            return r5
        L25:
            java.lang.String r1 = "Req"
            java.lang.String r2 = "copyContentWithByteLen"
            com.autonavi.aps.amapapi.utils.b.a(r3, r1, r2)
            r4[r5] = r0
            int r5 = r5 + 1
            return r5
    }

    private static void a(com.autonavi.aps.amapapi.restruct.d r9, java.util.List<com.autonavi.aps.amapapi.restruct.d> r10) {
            if (r9 == 0) goto L68
            if (r10 != 0) goto L5
            goto L68
        L5:
            int r0 = r10.size()
            if (r0 != 0) goto Lf
            r10.add(r9)
            return
        Lf:
            r1 = -1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r5 = -1
        L17:
            if (r4 >= r0) goto L50
            java.lang.Object r6 = r10.get(r4)
            com.autonavi.aps.amapapi.restruct.d r6 = (com.autonavi.aps.amapapi.restruct.d) r6
            java.lang.String r7 = r9.c()
            if (r7 == 0) goto L40
            java.lang.String r7 = r9.c()
            java.lang.String r8 = r6.c()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L40
            int r4 = r9.s
            int r5 = r6.s
            if (r4 == r5) goto L51
            long r7 = r9.t
            r6.t = r7
            r6.s = r4
            goto L51
        L40:
            long r7 = r6.t
            long r2 = java.lang.Math.min(r2, r7)
            long r6 = r6.t
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L4d
            r5 = r4
        L4d:
            int r4 = r4 + 1
            goto L17
        L50:
            r1 = r5
        L51:
            if (r1 < 0) goto L68
            r4 = 3
            if (r0 >= r4) goto L5a
            r10.add(r9)
            return
        L5a:
            long r4 = r9.t
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L68
            if (r1 >= r0) goto L68
            r10.remove(r1)
            r10.add(r9)
        L68:
            return
    }

    private void a(java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3, java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r4) {
            r2 = this;
            if (r4 == 0) goto L26
            int r0 = r4.size()
            if (r0 <= 0) goto L26
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r4.next()
            com.autonavi.aps.amapapi.restruct.d r0 = (com.autonavi.aps.amapapi.restruct.d) r0
            boolean r1 = r0.r
            if (r1 == 0) goto Lc
            boolean r1 = r0.n
            if (r1 == 0) goto Lc
            java.util.List<com.autonavi.aps.amapapi.restruct.d> r3 = r2.T
            a(r0, r3)
            return
        L26:
            if (r3 == 0) goto L3a
            int r4 = r3.size()
            if (r4 <= 0) goto L3a
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.autonavi.aps.amapapi.restruct.d r3 = (com.autonavi.aps.amapapi.restruct.d) r3
            java.util.List<com.autonavi.aps.amapapi.restruct.d> r4 = r2.T
            a(r3, r4)
        L3a:
            return
    }

    private byte[] a(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r7.split(r0)
            r1 = 6
            byte[] r2 = new byte[r1]
            r3 = 0
            if (r0 == 0) goto L12
            int r4 = r0.length     // Catch: java.lang.Throwable -> L10
            if (r4 == r1) goto L1e
            goto L12
        L10:
            r0 = move-exception
            goto L42
        L12:
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L10
            r4 = 0
        L15:
            if (r4 >= r1) goto L1e
            java.lang.String r5 = "0"
            r0[r4] = r5     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L15
        L1e:
            r1 = 0
        L1f:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L10
            if (r1 >= r4) goto L41
            r4 = r0[r1]     // Catch: java.lang.Throwable -> L10
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L10
            r5 = 2
            if (r4 <= r5) goto L33
            r4 = r0[r1]     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r4.substring(r3, r5)     // Catch: java.lang.Throwable -> L10
            r0[r1] = r4     // Catch: java.lang.Throwable -> L10
        L33:
            r4 = r0[r1]     // Catch: java.lang.Throwable -> L10
            r5 = 16
            int r4 = java.lang.Integer.parseInt(r4, r5)     // Catch: java.lang.Throwable -> L10
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L10
            r2[r1] = r4     // Catch: java.lang.Throwable -> L10
            int r1 = r1 + 1
            goto L1f
        L41:
            return r2
        L42:
            java.lang.String r1 = "getMacBa "
            java.lang.String r7 = r1.concat(r7)
            java.lang.String r1 = "Req"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r7)
            java.lang.String r7 = "00:00:00:00:00:00"
            byte[] r7 = r6.a(r7)
            return r7
    }

    private void b() {
            r5 = this;
            r0 = 27
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = r5.a
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = r5.f5828c
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = r5.f5829d
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = r5.f5830e
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = r5.f5831f
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = r5.f5832g
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = r5.f5833h
            r1[r2] = r4
            r2 = 7
            java.lang.String r4 = r5.f5834i
            r1[r2] = r4
            r2 = 8
            java.lang.String r4 = r5.l
            r1[r2] = r4
            r2 = 9
            java.lang.String r4 = r5.m
            r1[r2] = r4
            r2 = 10
            java.lang.String r4 = r5.n
            r1[r2] = r4
            r2 = 11
            java.lang.String r4 = r5.o
            r1[r2] = r4
            r2 = 12
            java.lang.String r4 = r5.p
            r1[r2] = r4
            r2 = 13
            java.lang.String r4 = r5.q
            r1[r2] = r4
            r2 = 14
            java.lang.String r4 = r5.r
            r1[r2] = r4
            r2 = 15
            java.lang.String r4 = r5.s
            r1[r2] = r4
            r2 = 16
            java.lang.String r4 = r5.t
            r1[r2] = r4
            r2 = 17
            java.lang.String r4 = r5.u
            r1[r2] = r4
            r2 = 18
            java.lang.String r4 = r5.v
            r1[r2] = r4
            r2 = 19
            java.lang.String r4 = r5.w
            r1[r2] = r4
            r2 = 20
            java.lang.String r4 = r5.x
            r1[r2] = r4
            r2 = 21
            java.lang.String r4 = r5.D
            r1[r2] = r4
            r2 = 22
            java.lang.String r4 = r5.F
            r1[r2] = r4
            r2 = 23
            java.lang.String r4 = r5.G
            r1[r2] = r4
            r2 = 24
            java.lang.String r4 = com.autonavi.aps.amapapi.trans.f.I
            r1[r2] = r4
            r2 = 25
            java.lang.String r4 = r5.M
            r1[r2] = r4
            r2 = 26
            java.lang.String r4 = r5.N
            r1[r2] = r4
            r2 = 0
        L9f:
            if (r2 >= r0) goto Lb0
            r4 = r1[r2]
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto Lad
            java.lang.String r4 = ""
            r1[r2] = r4
        Lad:
            int r2 = r2 + 1
            goto L9f
        Lb0:
            java.lang.String r0 = r5.f5835j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "2"
            java.lang.String r2 = "0"
            if (r0 == 0) goto Lbf
            r5.f5835j = r2
            goto Ld1
        Lbf:
            java.lang.String r0 = r5.f5835j
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = r5.f5835j
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Ld1
            r5.f5835j = r2
        Ld1:
            java.lang.String r0 = r5.f5836k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r4 = "1"
            if (r0 == 0) goto Lde
            r5.f5836k = r2
            goto Lf0
        Lde:
            java.lang.String r0 = r5.f5836k
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lf0
            java.lang.String r0 = r5.f5836k
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lf0
            r5.f5836k = r2
        Lf0:
            java.lang.String r0 = r5.y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lfb
            r5.y = r2
            goto L10d
        Lfb:
            java.lang.String r0 = r5.y
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L10d
            java.lang.String r0 = r5.y
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L10d
            r5.y = r2
        L10d:
            int r0 = r5.z
            boolean r0 = com.autonavi.aps.amapapi.restruct.e.a(r0)
            if (r0 != 0) goto L117
            r5.z = r3
        L117:
            byte[] r0 = r5.H
            if (r0 != 0) goto L11f
            byte[] r0 = new byte[r3]
            r5.H = r0
        L11f:
            return
    }

    public final void a(android.content.Context r19, boolean r20, boolean r21, com.autonavi.aps.amapapi.restruct.e r22, com.autonavi.aps.amapapi.restruct.k r23, android.net.ConnectivityManager r24, java.lang.String r25, com.autonavi.aps.amapapi.restruct.g r26) {
            r18 = this;
            r1 = r18
            java.lang.String r2 = com.amap.api.col.p0003l.f4.j(r19)
            int r3 = com.autonavi.aps.amapapi.utils.j.d()
            r0 = r25
            r1.J = r0
            r4 = 0
            r1.S = r4
            if (r21 != 0) goto L1a
            java.lang.String r0 = "UC_nlp_20131029"
            java.lang.String r5 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U"
        L17:
            r6 = r5
            r5 = r0
            goto L1f
        L1a:
            java.lang.String r0 = "api_serverSDK_130905"
            java.lang.String r5 = "S128DF1572465B890OE3F7A13167KLEI"
            goto L17
        L1f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r8 = r22.g()
            int r0 = r22.h()
            android.telephony.TelephonyManager r9 = r22.i()
            java.util.ArrayList r10 = r22.c()
            java.util.ArrayList r11 = r22.d()
            java.util.ArrayList r12 = r23.e()
            java.lang.String r13 = "1"
            r14 = 2
            java.lang.String r15 = "0"
            if (r0 != r14) goto L45
            r4 = r13
            goto L46
        L45:
            r4 = r15
        L46:
            java.lang.String r14 = "Aps"
            if (r9 == 0) goto L9c
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.f5852g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.amap.api.col.p0003l.i4.P()     // Catch: java.lang.Throwable -> L59
            com.autonavi.aps.amapapi.utils.b.f5852g = r0     // Catch: java.lang.Throwable -> L59
            goto L5f
        L59:
            r0 = move-exception
            java.lang.String r9 = "getApsReq part4"
            com.autonavi.aps.amapapi.utils.b.a(r0, r14, r9)
        L5f:
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.f5852g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r9 = "888888888888888"
            r16 = r3
            r3 = 29
            if (r0 == 0) goto L73
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L73
            com.autonavi.aps.amapapi.utils.b.f5852g = r9
        L73:
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.f5853h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L8b
            java.lang.String r0 = com.amap.api.col.p0003l.i4.U()     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            com.autonavi.aps.amapapi.utils.b.f5853h = r0     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            goto L8b
        L82:
            r0 = move-exception
            goto L86
        L84:
            goto L8b
        L86:
            java.lang.String r3 = "getApsReq part2"
            com.autonavi.aps.amapapi.utils.b.a(r0, r14, r3)
        L8b:
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.f5853h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9e
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 >= r3) goto L9e
            com.autonavi.aps.amapapi.utils.b.f5853h = r9
            goto L9e
        L9c:
            r16 = r3
        L9e:
            android.net.NetworkInfo r0 = r24.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> La3
            goto Laa
        La3:
            r0 = move-exception
            java.lang.String r3 = "getApsReq part"
            com.autonavi.aps.amapapi.utils.b.a(r0, r14, r3)
            r0 = 0
        Laa:
            boolean r3 = r23.a(r24)
            int r0 = com.autonavi.aps.amapapi.utils.j.a(r0)
            r9 = -1
            java.lang.String r14 = ""
            if (r0 == r9) goto Lc0
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.j.a(r24)
            if (r3 == 0) goto Lc2
            java.lang.String r13 = "2"
            goto Lc2
        Lc0:
            r0 = r14
            r13 = r0
        Lc2:
            r9 = r8 & 4
            r17 = r3
            r3 = 4
            if (r9 != r3) goto Lda
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto Lda
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r1.B
            r3.clear()
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r1.B
            r3.addAll(r11)
            goto Ldf
        Lda:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r1.B
            r3.clear()
        Ldf:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r1.A
            r3.clear()
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r1.A
            r3.addAll(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            boolean r9 = r23.k()
            if (r9 == 0) goto L155
            if (r17 == 0) goto L145
            com.autonavi.aps.amapapi.restruct.j r9 = r23.m()
            r11 = r23
            boolean r17 = r11.a(r9)
            if (r17 == 0) goto L145
            java.lang.String r10 = r9.a()
            r3.append(r10)
            java.lang.String r10 = ","
            r3.append(r10)
            r17 = r9
            int r9 = r17.c()
            r11 = -128(0xffffffffffffff80, float:NaN)
            if (r9 >= r11) goto L11a
        L118:
            r9 = 0
            goto L11f
        L11a:
            r11 = 127(0x7f, float:1.78E-43)
            if (r9 <= r11) goto L11f
            goto L118
        L11f:
            r3.append(r9)
            r3.append(r10)
            java.lang.String r9 = r17.b()
            r10 = 32
            java.lang.String r11 = "UTF-8"
            byte[] r11 = r9.getBytes(r11)     // Catch: java.lang.Exception -> L133
            int r11 = r11.length     // Catch: java.lang.Exception -> L133
            goto L136
        L133:
            r11 = 32
        L136:
            if (r11 < r10) goto L13a
            java.lang.String r9 = "unkwn"
        L13a:
            java.lang.String r10 = "*"
            java.lang.String r11 = "."
            java.lang.String r9 = r9.replace(r10, r11)
            r3.append(r9)
        L145:
            if (r12 == 0) goto L153
            java.util.ArrayList<com.amap.api.col.3l.m9> r9 = r1.E
            if (r9 == 0) goto L153
            r9.clear()
            java.util.ArrayList<com.amap.api.col.3l.m9> r9 = r1.E
            r9.addAll(r12)
        L153:
            r9 = 0
            goto L160
        L155:
            r23.g()
            java.util.ArrayList<com.amap.api.col.3l.m9> r9 = r1.E
            if (r9 == 0) goto L153
            r9.clear()
            goto L153
        L160:
            r1.f5827b = r9
            if (r20 != 0) goto L168
            r9 = 2
            short r9 = (short) r9
            r1.f5827b = r9
        L168:
            r1.f5828c = r5
            r1.f5829d = r6
            java.lang.String r5 = android.os.Build.MODEL
            r1.f5831f = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "android"
            r5.<init>(r6)
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.f5832g = r5
            java.lang.String r5 = com.autonavi.aps.amapapi.utils.j.b(r19)
            r1.f5833h = r5
            r1.f5834i = r4
            r1.f5835j = r15
            r1.f5836k = r15
            r1.l = r15
            r1.m = r15
            r1.n = r15
            r1.o = r2
            java.lang.String r2 = com.autonavi.aps.amapapi.utils.b.f5852g
            r1.p = r2
            java.lang.String r2 = com.autonavi.aps.amapapi.utils.b.f5853h
            r1.q = r2
            java.lang.String r2 = java.lang.String.valueOf(r16)
            r1.s = r2
            java.lang.String r2 = com.autonavi.aps.amapapi.utils.j.i(r19)
            r1.t = r2
            java.lang.String r2 = "6.4.3"
            r1.v = r2
            r2 = 0
            r1.w = r2
            r1.u = r14
            r1.x = r0
            r1.y = r13
            r1.z = r8
            java.lang.String r0 = r22.l()
            r1.C = r0
            java.lang.String r0 = com.autonavi.aps.amapapi.restruct.k.p()
            r1.F = r0
            java.lang.String r0 = r3.toString()
            r1.D = r0
            long r4 = com.autonavi.aps.amapapi.utils.j.b()
            long r8 = r23.q()
            long r4 = r4 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r8
            int r0 = (int) r4
            r1.O = r0
            java.lang.String r0 = com.autonavi.aps.amapapi.trans.f.I     // Catch: java.lang.Throwable -> L1e8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1e8
            if (r0 == 0) goto L1e8
            java.lang.String r0 = com.amap.api.col.p0003l.i4.F(r19)     // Catch: java.lang.Throwable -> L1e8
            com.autonavi.aps.amapapi.trans.f.I = r0     // Catch: java.lang.Throwable -> L1e8
        L1e8:
            java.lang.String r0 = com.autonavi.aps.amapapi.trans.f.K     // Catch: java.lang.Throwable -> L1f6
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1f6
            if (r0 == 0) goto L1f6
            java.lang.String r0 = com.amap.api.col.p0003l.i4.o(r19)     // Catch: java.lang.Throwable -> L1f6
            com.autonavi.aps.amapapi.trans.f.K = r0     // Catch: java.lang.Throwable -> L1f6
        L1f6:
            java.lang.String r0 = r1.M     // Catch: java.lang.Throwable -> L204
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L204
            if (r0 == 0) goto L204
            java.lang.String r0 = com.amap.api.col.p0003l.i4.E()     // Catch: java.lang.Throwable -> L204
            r1.M = r0     // Catch: java.lang.Throwable -> L204
        L204:
            java.lang.String r0 = r1.N     // Catch: java.lang.Throwable -> L212
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L212
            if (r0 == 0) goto L212
            java.lang.String r0 = com.amap.api.col.p0003l.i4.D(r19)     // Catch: java.lang.Throwable -> L212
            r1.N = r0     // Catch: java.lang.Throwable -> L212
        L212:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r0 = r1.B     // Catch: java.lang.Throwable -> L225
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r1.E     // Catch: java.lang.Throwable -> L225
            r4 = r26
            java.util.List r0 = r4.a(r0, r2)     // Catch: java.lang.Throwable -> L225
            r1.S = r0     // Catch: java.lang.Throwable -> L225
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r0 = r1.A     // Catch: java.lang.Throwable -> L225
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r2 = r1.B     // Catch: java.lang.Throwable -> L225
            r1.a(r0, r2)     // Catch: java.lang.Throwable -> L225
        L225:
            int r0 = r7.length()
            r9 = 0
            r7.delete(r9, r0)
            int r0 = r3.length()
            r3.delete(r9, r0)
            return
    }

    public final byte[] a() {
            r32 = this;
            r1 = r32
            java.lang.String r2 = "Req"
            r1.b()
            r3 = 2
            byte[] r4 = new byte[r3]
            r5 = 4
            byte[] r6 = new byte[r5]
            byte[] r0 = r1.H
            if (r0 == 0) goto L15
            int r0 = r0.length
            int r0 = r0 + 4097
            goto L17
        L15:
            r0 = 4096(0x1000, float:5.74E-42)
        L17:
            byte[] r7 = r1.Q
            if (r7 == 0) goto L1f
            int r8 = r1.R
            if (r0 <= r8) goto L25
        L1f:
            byte[] r7 = new byte[r0]
            r1.Q = r7
            r1.R = r0
        L25:
            java.lang.String r0 = r1.a
            byte r0 = com.autonavi.aps.amapapi.utils.j.g(r0)
            r8 = 0
            r7[r8] = r0
            short r0 = r1.f5827b
            r9 = 0
            byte[] r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r9)
            int r10 = r0.length
            r11 = 1
            java.lang.System.arraycopy(r0, r8, r7, r11, r10)
            int r0 = r0.length
            int r0 = r0 + r11
            java.lang.String r10 = r1.f5828c
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.f5829d
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.o
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.f5830e
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.f5831f
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.f5832g
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.u
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.f5833h
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.p
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.q
            int r10 = a(r10, r7, r0)
            java.lang.String r0 = r1.t     // Catch: java.lang.Throwable -> L84
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L86
            r7[r10] = r8     // Catch: java.lang.Throwable -> L84
        L82:
            int r10 = r10 + r11
            goto La1
        L84:
            r0 = move-exception
            goto L99
        L86:
            java.lang.String r0 = r1.t     // Catch: java.lang.Throwable -> L84
            byte[] r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L84
            int r12 = r0.length     // Catch: java.lang.Throwable -> L84
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L84
            r7[r10] = r12     // Catch: java.lang.Throwable -> L84
            int r10 = r10 + 1
            int r12 = r0.length     // Catch: java.lang.Throwable -> L84
            java.lang.System.arraycopy(r0, r8, r7, r10, r12)     // Catch: java.lang.Throwable -> L84
            int r0 = r0.length     // Catch: java.lang.Throwable -> L84
            int r10 = r10 + r0
            goto La1
        L99:
            java.lang.String r12 = "buildV4Dot219"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r12)
            r7[r10] = r8
            goto L82
        La1:
            java.lang.String r0 = r1.v
            int r0 = a(r0, r7, r10)
            java.lang.String r10 = r1.w
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = com.autonavi.aps.amapapi.trans.f.I
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = com.autonavi.aps.amapapi.trans.f.K
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.x
            int r0 = a(r10, r7, r0)
            java.lang.String r10 = r1.y
            byte r10 = java.lang.Byte.parseByte(r10)
            r7[r0] = r10
            int r10 = r0 + 1
            java.lang.String r12 = r1.f5835j
            byte r12 = java.lang.Byte.parseByte(r12)
            r7[r10] = r12
            int r10 = r0 + 2
            int r12 = r1.z
            r13 = r12 & 3
            byte r12 = (byte) r12
            r7[r10] = r12
            r10 = 3
            int r0 = r0 + r10
            r12 = -128(0xffffffffffffff80, float:NaN)
            r16 = 1000(0x3e8, double:4.94E-321)
            r18 = 0
            r20 = 4617540697942969549(0x4014cccccccccccd, double:5.2)
            r14 = 127(0x7f, float:1.78E-43)
            if (r13 == r11) goto Lf4
            if (r13 != r3) goto Lee
            goto Lf4
        Lee:
            r25 = r6
            r24 = 4
            goto L337
        Lf4:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r15 = r1.A
            int r15 = r15.size()
            if (r15 <= 0) goto L107
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r15 = r1.A
            java.lang.Object r15 = r15.get(r8)
            com.autonavi.aps.amapapi.restruct.d r15 = (com.autonavi.aps.amapapi.restruct.d) r15
            int r15 = r15.a
            goto L108
        L107:
            r15 = 0
        L108:
            byte[] r15 = com.autonavi.aps.amapapi.utils.j.a(r15, r9)
            int r10 = r15.length
            java.lang.System.arraycopy(r15, r8, r7, r0, r10)
            int r10 = r15.length
            int r0 = r0 + r10
            if (r13 != r11) goto L170
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L127
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5735b
            goto L128
        L127:
            r10 = 0
        L128:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r9)
            int r15 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r15)
            int r10 = r10.length
            int r0 = r0 + r10
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L145
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5736c
            goto L146
        L145:
            r10 = 0
        L146:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r9)
            int r15 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r15)
            int r10 = r10.length
            int r0 = r0 + r10
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L163
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5737d
            goto L164
        L163:
            r10 = 0
        L164:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.b(r10, r9)
            int r15 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r15)
            int r10 = r10.length
        L16d:
            int r0 = r0 + r10
            goto L209
        L170:
            if (r13 != r3) goto L209
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L185
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5741h
            goto L186
        L185:
            r10 = 0
        L186:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r9)
            int r15 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r15)
            int r10 = r10.length
            int r0 = r0 + r10
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L1a3
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5742i
            goto L1a4
        L1a3:
            r10 = 0
        L1a4:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r9)
            int r15 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r15)
            int r10 = r10.length
            int r0 = r0 + r10
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L1c1
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5743j
            goto L1c2
        L1c1:
            r10 = 0
        L1c2:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r9)
            int r15 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r15)
            int r10 = r10.length
            int r0 = r0 + r10
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L1df
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5740g
            goto L1e0
        L1df:
            r10 = 0
        L1e0:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.b(r10, r9)
            int r15 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r15)
            int r10 = r10.length
            int r0 = r0 + r10
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L1fd
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5739f
            goto L1fe
        L1fd:
            r10 = 0
        L1fe:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.b(r10, r9)
            int r15 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r15)
            int r10 = r10.length
            goto L16d
        L209:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L21c
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5744k
            goto L21d
        L21c:
            r10 = 0
        L21d:
            if (r10 <= r14) goto L221
        L21f:
            r10 = 0
            goto L224
        L221:
            if (r10 >= r12) goto L224
            goto L21f
        L224:
            byte r10 = (byte) r10
            r7[r0] = r10
            int r10 = r0 + 1
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r15 = r1.A
            int r15 = r15.size()
            if (r15 <= 0) goto L248
            long r22 = com.autonavi.aps.amapapi.utils.j.b()
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r15 = r1.A
            java.lang.Object r15 = r15.get(r8)
            com.autonavi.aps.amapapi.restruct.d r15 = (com.autonavi.aps.amapapi.restruct.d) r15
            r25 = r6
            r24 = 4
            long r5 = r15.t
            long r22 = r22 - r5
            long r22 = r22 / r16
            goto L24e
        L248:
            r25 = r6
            r24 = 4
            r22 = r18
        L24e:
            r5 = 65535(0xffff, double:3.23786E-319)
            int r15 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r15 <= 0) goto L257
            r22 = r5
        L257:
            int r15 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            r26 = r5
            if (r15 >= 0) goto L260
            r5 = r18
            goto L262
        L260:
            r5 = r22
        L262:
            int r6 = (int) r5
            byte[] r5 = com.autonavi.aps.amapapi.utils.j.a(r6, r4)
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r8, r7, r10, r6)
            int r5 = r0 + 3
            if (r13 != r11) goto L330
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r6 = r1.A
            int r6 = r6.size()
            if (r6 != 0) goto L27d
            r7[r5] = r8
        L279:
            int r0 = r0 + 4
            goto L337
        L27d:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r6 = r1.A
            int r6 = r6.size()
            byte r10 = (byte) r6
            r7[r5] = r10
            int r0 = r0 + 4
            r5 = 0
        L289:
            if (r5 >= r6) goto L337
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L29e
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r5)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5736c
            goto L29f
        L29e:
            r10 = 0
        L29f:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r9)
            int r13 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r13)
            int r10 = r10.length
            int r0 = r0 + r10
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L2bc
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r5)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5737d
            goto L2bd
        L2bc:
            r10 = 0
        L2bd:
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.b(r10, r9)
            int r13 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r13)
            int r10 = r10.length
            int r0 = r0 + r10
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L2da
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r5)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            int r10 = r10.f5744k
            goto L2db
        L2da:
            r10 = 0
        L2db:
            if (r10 <= r14) goto L2df
        L2dd:
            r10 = 0
            goto L2e2
        L2df:
            if (r10 >= r12) goto L2e2
            goto L2dd
        L2e2:
            byte r10 = (byte) r10
            r7[r0] = r10
            int r0 = r0 + r11
            java.lang.String r10 = com.autonavi.aps.amapapi.utils.b.a
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            double r22 = r10.doubleValue()
            int r10 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r10 < 0) goto L32b
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            int r10 = r10.size()
            if (r10 <= 0) goto L30f
            long r22 = com.autonavi.aps.amapapi.utils.j.b()
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r10 = r1.A
            java.lang.Object r10 = r10.get(r8)
            com.autonavi.aps.amapapi.restruct.d r10 = (com.autonavi.aps.amapapi.restruct.d) r10
            long r9 = r10.t
            long r22 = r22 - r9
            long r22 = r22 / r16
            goto L311
        L30f:
            r22 = r18
        L311:
            int r9 = (r22 > r26 ? 1 : (r22 == r26 ? 0 : -1))
            if (r9 <= 0) goto L317
            r22 = r26
        L317:
            int r9 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r9 >= 0) goto L31e
            r9 = r18
            goto L320
        L31e:
            r9 = r22
        L320:
            int r10 = (int) r9
            byte[] r9 = com.autonavi.aps.amapapi.utils.j.a(r10, r4)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r8, r7, r0, r10)
            int r9 = r9.length
            int r0 = r0 + r9
        L32b:
            int r5 = r5 + 1
            r9 = 0
            goto L289
        L330:
            if (r13 != r3) goto L336
            r7[r5] = r8
            goto L279
        L336:
            r0 = r5
        L337:
            java.lang.String r5 = r1.C
            java.lang.String r6 = "GBK"
            r9 = 8
            if (r5 == 0) goto L359
            int r10 = r1.z
            r10 = r10 & r9
            if (r10 != r9) goto L359
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Exception -> L359
            int r10 = r5.length     // Catch: java.lang.Exception -> L359
            r13 = 60
            int r10 = java.lang.Math.min(r10, r13)     // Catch: java.lang.Exception -> L359
            byte r13 = (byte) r10     // Catch: java.lang.Exception -> L359
            r7[r0] = r13     // Catch: java.lang.Exception -> L359
            int r0 = r0 + 1
            java.lang.System.arraycopy(r5, r8, r7, r0, r10)     // Catch: java.lang.Exception -> L359
            int r0 = r0 + r10
            goto L35c
        L359:
            r7[r0] = r8
            int r0 = r0 + r11
        L35c:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r5 = r1.B
            int r10 = r5.size()
            int r13 = r1.z
            r13 = r13 & 4
            r22 = 4617315517961601024(0x4014000000000000, double:5.0)
            r26 = 4617653287933653811(0x4015333333333333, double:5.3)
            r15 = 5
            r12 = 4
            if (r13 != r12) goto L555
            if (r10 <= 0) goto L555
            r5.get(r8)
            byte r12 = (byte) r10
            r7[r0] = r12
            int r0 = r0 + r11
            r12 = 0
        L37b:
            if (r12 >= r10) goto L54e
            java.lang.Object r13 = r5.get(r12)
            com.autonavi.aps.amapapi.restruct.d r13 = (com.autonavi.aps.amapapi.restruct.d) r13
            int r14 = r13.l
            if (r14 == r11) goto L43c
            r11 = 3
            r28 = 1
            if (r14 == r11) goto L38f
            r11 = 4
            if (r14 != r11) goto L397
        L38f:
            r29 = r10
            r3 = r25
            r25 = 2
            goto L444
        L397:
            if (r14 != r3) goto L3f6
            byte r11 = (byte) r14
            boolean r14 = r13.n
            if (r14 == 0) goto L3a1
            r11 = r11 | 8
            byte r11 = (byte) r11
        L3a1:
            r7[r0] = r11
            int r0 = r0 + 1
            int r11 = r13.a
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.a(r11, r4)
            int r14 = r11.length
            java.lang.System.arraycopy(r11, r8, r7, r0, r14)
            int r11 = r11.length
            int r0 = r0 + r11
            int r11 = r13.f5741h
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.a(r11, r4)
            int r14 = r11.length
            java.lang.System.arraycopy(r11, r8, r7, r0, r14)
            int r11 = r11.length
            int r0 = r0 + r11
            int r11 = r13.f5742i
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.a(r11, r4)
            int r14 = r11.length
            java.lang.System.arraycopy(r11, r8, r7, r0, r14)
            int r11 = r11.length
            int r0 = r0 + r11
            int r11 = r13.f5743j
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.a(r11, r4)
            int r14 = r11.length
            java.lang.System.arraycopy(r11, r8, r7, r0, r14)
            int r11 = r11.length
            int r0 = r0 + r11
            int r11 = r13.f5740g
            r14 = r25
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.b(r11, r14)
            r25 = 2
            int r3 = r11.length
            java.lang.System.arraycopy(r11, r8, r7, r0, r3)
            int r3 = r11.length
            int r0 = r0 + r3
            int r3 = r13.f5739f
            byte[] r3 = com.autonavi.aps.amapapi.utils.j.b(r3, r14)
            int r11 = r3.length
            java.lang.System.arraycopy(r3, r8, r7, r0, r11)
            int r3 = r3.length
            int r0 = r0 + r3
            r29 = r10
            r3 = r14
            goto L480
        L3f6:
            r3 = r25
            r25 = 2
            if (r14 != r15) goto L439
            byte r11 = (byte) r14
            boolean r14 = r13.n
            if (r14 == 0) goto L404
            r11 = r11 | 8
            byte r11 = (byte) r11
        L404:
            r7[r0] = r11
            int r0 = r0 + 1
            int r11 = r13.a
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.a(r11, r4)
            int r14 = r11.length
            java.lang.System.arraycopy(r11, r8, r7, r0, r14)
            int r11 = r11.length
            int r0 = r0 + r11
            int r11 = r13.f5735b
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.a(r11, r4)
            int r14 = r11.length
            java.lang.System.arraycopy(r11, r8, r7, r0, r14)
            int r11 = r11.length
            int r0 = r0 + r11
            int r11 = r13.f5736c
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.a(r11, r4)
            int r14 = r11.length
            java.lang.System.arraycopy(r11, r8, r7, r0, r14)
            int r11 = r11.length
            int r0 = r0 + r11
            r29 = r10
            long r10 = r13.f5738e
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10)
            java.lang.System.arraycopy(r10, r8, r7, r0, r9)
            int r0 = r0 + r9
            goto L480
        L439:
            r29 = r10
            goto L480
        L43c:
            r29 = r10
            r3 = r25
            r25 = 2
            r28 = 1
        L444:
            byte r10 = (byte) r14
            boolean r11 = r13.n
            if (r11 == 0) goto L44c
            r10 = r10 | 8
            byte r10 = (byte) r10
        L44c:
            r7[r0] = r10
            int r0 = r0 + 1
            int r10 = r13.a
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r4)
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r11)
            int r10 = r10.length
            int r0 = r0 + r10
            int r10 = r13.f5735b
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r4)
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r11)
            int r10 = r10.length
            int r0 = r0 + r10
            int r10 = r13.f5736c
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r4)
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r11)
            int r10 = r10.length
            int r0 = r0 + r10
            int r10 = r13.f5737d
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.b(r10, r3)
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r8, r7, r0, r11)
            int r10 = r10.length
            int r0 = r0 + r10
        L480:
            int r10 = r13.f5744k
            r11 = 99
            r14 = 127(0x7f, float:1.78E-43)
            if (r10 <= r14) goto L48b
        L488:
            r10 = 99
            goto L490
        L48b:
            r14 = -128(0xffffffffffffff80, float:NaN)
            if (r10 >= r14) goto L490
            goto L488
        L490:
            byte r10 = (byte) r10
            r7[r0] = r10
            int r0 = r0 + 1
            long r10 = com.autonavi.aps.amapapi.utils.j.b()
            r30 = r10
            long r9 = r13.t
            long r9 = r30 - r9
            long r9 = r9 / r16
            int r10 = (int) r9
            short r9 = (short) r10
            byte[] r9 = com.autonavi.aps.amapapi.utils.j.a(r9, r4)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r8, r7, r0, r10)
            int r9 = r9.length
            int r0 = r0 + r9
            int r9 = r13.l
            r10 = 32767(0x7fff, float:4.5916E-41)
            r11 = 3
            if (r9 == r11) goto L4f8
            r11 = 4
            if (r9 == r11) goto L4f8
            if (r9 != r15) goto L4ba
            goto L4f8
        L4ba:
            r11 = 1
            if (r9 != r11) goto L540
            java.lang.String r9 = com.autonavi.aps.amapapi.utils.b.a
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            double r30 = r9.doubleValue()
            int r9 = (r30 > r26 ? 1 : (r30 == r26 ? 0 : -1))
            if (r9 < 0) goto L540
            int r9 = r13.o
            if (r9 <= r10) goto L4d1
            r9 = 32767(0x7fff, float:4.5916E-41)
        L4d1:
            if (r9 >= 0) goto L4d4
            goto L4d5
        L4d4:
            r10 = r9
        L4d5:
            byte[] r9 = com.autonavi.aps.amapapi.utils.j.a(r10, r4)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r8, r7, r0, r10)
            int r9 = r9.length
            int r0 = r0 + r9
            int r9 = r13.p
            byte[] r9 = com.autonavi.aps.amapapi.utils.j.b(r9, r3)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r8, r7, r0, r10)
            int r9 = r9.length
            int r0 = r0 + r9
            int r9 = r13.q
            byte[] r9 = com.autonavi.aps.amapapi.utils.j.b(r9, r3)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r8, r7, r0, r10)
            int r9 = r9.length
        L4f6:
            int r0 = r0 + r9
            goto L540
        L4f8:
            java.lang.String r9 = com.autonavi.aps.amapapi.utils.b.a
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            double r30 = r9.doubleValue()
            int r9 = (r30 > r22 ? 1 : (r30 == r22 ? 0 : -1))
            if (r9 < 0) goto L540
            int r9 = r13.o
            if (r9 <= r10) goto L50c
            r9 = 32767(0x7fff, float:4.5916E-41)
        L50c:
            if (r9 >= 0) goto L50f
            goto L510
        L50f:
            r10 = r9
        L510:
            byte[] r9 = com.autonavi.aps.amapapi.utils.j.a(r10, r4)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r8, r7, r0, r10)
            int r9 = r9.length
            int r0 = r0 + r9
            java.lang.String r9 = com.autonavi.aps.amapapi.utils.b.a
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            double r9 = r9.doubleValue()
            int r11 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r11 < 0) goto L540
            int r9 = r13.p
            byte[] r9 = com.autonavi.aps.amapapi.utils.j.b(r9, r3)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r8, r7, r0, r10)
            int r9 = r9.length
            int r0 = r0 + r9
            int r9 = r13.q
            byte[] r9 = com.autonavi.aps.amapapi.utils.j.b(r9, r3)
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r8, r7, r0, r10)
            int r9 = r9.length
            goto L4f6
        L540:
            int r12 = r12 + 1
            r25 = r3
            r10 = r29
            r3 = 2
            r9 = 8
            r11 = 1
            r14 = 127(0x7f, float:1.78E-43)
            goto L37b
        L54e:
            r3 = r25
            r25 = 2
            r28 = 1
            goto L55f
        L555:
            r3 = r25
            r25 = 2
            r7[r0] = r8
            r28 = 1
            int r0 = r0 + 1
        L55f:
            java.lang.String r5 = r1.D
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L60a
            java.lang.String r5 = r1.D
            int r5 = r5.length()
            if (r5 != 0) goto L571
            goto L60a
        L571:
            r7[r0] = r28
            int r5 = r0 + 1
            java.lang.String r0 = r1.D     // Catch: java.lang.Throwable -> L5e5
            java.lang.String r9 = ","
            java.lang.String[] r9 = r0.split(r9)     // Catch: java.lang.Throwable -> L5e5
            r0 = r9[r8]     // Catch: java.lang.Throwable -> L5e5
            byte[] r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L5e5
            int r10 = r0.length     // Catch: java.lang.Throwable -> L5e5
            java.lang.System.arraycopy(r0, r8, r7, r5, r10)     // Catch: java.lang.Throwable -> L5e5
            int r0 = r0.length     // Catch: java.lang.Throwable -> L5e5
            int r5 = r5 + r0
            r0 = r9[r25]     // Catch: java.lang.Throwable -> L5a2
            byte[] r0 = r0.getBytes(r6)     // Catch: java.lang.Throwable -> L5a2
            int r10 = r0.length     // Catch: java.lang.Throwable -> L5a2
            r11 = 127(0x7f, float:1.78E-43)
            if (r10 <= r11) goto L596
            r10 = 127(0x7f, float:1.78E-43)
        L596:
            byte r11 = (byte) r10     // Catch: java.lang.Throwable -> L5a2
            r7[r5] = r11     // Catch: java.lang.Throwable -> L5a2
            int r5 = r5 + 1
            java.lang.System.arraycopy(r0, r8, r7, r5, r10)     // Catch: java.lang.Throwable -> L5a2
            int r5 = r5 + r10
        L59f:
            r28 = 1
            goto L5ad
        L5a2:
            r0 = move-exception
            java.lang.String r10 = "buildV4Dot214"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r10)     // Catch: java.lang.Throwable -> L5e5
            r7[r5] = r8     // Catch: java.lang.Throwable -> L5e5
            int r5 = r5 + 1
            goto L59f
        L5ad:
            r0 = r9[r28]     // Catch: java.lang.Throwable -> L5e5
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5e5
            r11 = 127(0x7f, float:1.78E-43)
            if (r0 <= r11) goto L5b9
        L5b7:
            r0 = 0
            goto L5be
        L5b9:
            r9 = -128(0xffffffffffffff80, float:NaN)
            if (r0 >= r9) goto L5be
            goto L5b7
        L5be:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L5e5
            byte r0 = java.lang.Byte.parseByte(r0)     // Catch: java.lang.Throwable -> L5e5
            r7[r5] = r0     // Catch: java.lang.Throwable -> L5e5
            int r5 = r5 + 1
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.a     // Catch: java.lang.Throwable -> L5e5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Throwable -> L5e5
            double r9 = r0.doubleValue()     // Catch: java.lang.Throwable -> L5e5
            int r0 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r0 < 0) goto L5e7
            int r0 = r1.O     // Catch: java.lang.Throwable -> L5e5
            byte[] r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r4)     // Catch: java.lang.Throwable -> L5e5
            int r9 = r0.length     // Catch: java.lang.Throwable -> L5e5
            java.lang.System.arraycopy(r0, r8, r7, r5, r9)     // Catch: java.lang.Throwable -> L5e5
            int r0 = r0.length     // Catch: java.lang.Throwable -> L5e5
            int r5 = r5 + r0
            goto L5e7
        L5e5:
            r0 = move-exception
            goto L5ea
        L5e7:
            r28 = 1
            goto L610
        L5ea:
            java.lang.String r9 = "buildV4Dot216"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r9)
            java.lang.String r0 = "00:00:00:00:00:00"
            byte[] r0 = r1.a(r0)
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r8, r7, r5, r2)
            int r0 = r0.length
            int r5 = r5 + r0
            r7[r5] = r8
            int r0 = r5 + 1
            java.lang.String r2 = "0"
            byte r2 = java.lang.Byte.parseByte(r2)
            r7[r0] = r2
            int r5 = r5 + 2
            goto L5e7
        L60a:
            r7[r0] = r8
            r28 = 1
            int r5 = r0 + 1
        L610:
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r1.E
            int r2 = r0.size()
            r9 = 25
            int r2 = java.lang.Math.min(r2, r9)
            r9 = 65535(0xffff, float:9.1834E-41)
            if (r2 != 0) goto L627
            r7[r5] = r8
            int r5 = r5 + 1
            goto L6c9
        L627:
            byte r10 = (byte) r2
            r7[r5] = r10
            int r5 = r5 + 1
            int r10 = com.autonavi.aps.amapapi.utils.j.c()
            r11 = 17
            if (r10 < r11) goto L636
            r10 = 1
            goto L637
        L636:
            r10 = 0
        L637:
            if (r10 == 0) goto L63f
            long r11 = com.autonavi.aps.amapapi.utils.j.b()
            long r18 = r11 / r16
        L63f:
            r11 = 0
        L640:
            if (r11 >= r2) goto L6b9
            java.lang.Object r12 = r0.get(r11)
            com.amap.api.col.3l.m9 r12 = (com.amap.api.col.p0003l.m9) r12
            long r14 = r12.a
            java.lang.String r14 = com.amap.api.col.p0003l.m9.c(r14)
            byte[] r14 = r1.a(r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r8, r7, r5, r15)
            int r14 = r14.length
            int r5 = r5 + r14
            java.lang.String r14 = r12.f3685b     // Catch: java.lang.Exception -> L66d
            byte[] r14 = r14.getBytes(r6)     // Catch: java.lang.Exception -> L66d
            int r15 = r14.length     // Catch: java.lang.Exception -> L66d
            byte r15 = (byte) r15     // Catch: java.lang.Exception -> L66d
            r7[r5] = r15     // Catch: java.lang.Exception -> L66d
            int r5 = r5 + 1
            int r15 = r14.length     // Catch: java.lang.Exception -> L66d
            java.lang.System.arraycopy(r14, r8, r7, r5, r15)     // Catch: java.lang.Exception -> L66d
            int r14 = r14.length     // Catch: java.lang.Exception -> L66d
            int r5 = r5 + r14
            r28 = 1
            goto L673
        L66d:
            r7[r5] = r8
            r28 = 1
            int r5 = r5 + 1
        L673:
            int r14 = r12.f3686c
            r15 = 127(0x7f, float:1.78E-43)
            if (r14 <= r15) goto L67d
            r14 = 0
            r15 = -128(0xffffffffffffff80, float:NaN)
            goto L682
        L67d:
            r15 = -128(0xffffffffffffff80, float:NaN)
            if (r14 >= r15) goto L682
            r14 = 0
        L682:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            byte r14 = java.lang.Byte.parseByte(r14)
            r7[r5] = r14
            int r5 = r5 + 1
            if (r10 == 0) goto L699
            long r13 = r12.f3689f
            long r13 = r13 / r16
            long r13 = r18 - r13
            int r14 = (int) r13
            if (r14 >= 0) goto L69a
        L699:
            r14 = 0
        L69a:
            if (r14 <= r9) goto L69f
            r14 = 65535(0xffff, float:9.1834E-41)
        L69f:
            byte[] r13 = com.autonavi.aps.amapapi.utils.j.a(r14, r4)
            int r14 = r13.length
            java.lang.System.arraycopy(r13, r8, r7, r5, r14)
            int r13 = r13.length
            int r5 = r5 + r13
            int r12 = r12.f3687d
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.a(r12, r4)
            int r13 = r12.length
            java.lang.System.arraycopy(r12, r8, r7, r5, r13)
            int r12 = r12.length
            int r5 = r5 + r12
            int r11 = r11 + 1
            r15 = 5
            goto L640
        L6b9:
            java.lang.String r0 = r1.F
            int r0 = java.lang.Integer.parseInt(r0)
            byte[] r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r4)
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r8, r7, r5, r2)
            int r0 = r0.length
            int r5 = r5 + r0
        L6c9:
            r7[r5] = r8
            int r0 = r5 + 1
            java.lang.String r2 = r1.G     // Catch: java.lang.Throwable -> L6f6
            if (r2 != 0) goto L6d9
            r7[r0] = r8     // Catch: java.lang.Throwable -> L6f6
        L6d3:
            int r5 = r5 + 2
        L6d5:
            r2 = 2
            r28 = 1
            goto L6fd
        L6d9:
            byte[] r2 = r2.getBytes(r6)     // Catch: java.lang.Throwable -> L6f6
            int r10 = r2.length     // Catch: java.lang.Throwable -> L6f6
            r11 = 127(0x7f, float:1.78E-43)
            if (r10 <= r11) goto L6e3
            r2 = 0
        L6e3:
            if (r2 != 0) goto L6e8
            r7[r0] = r8     // Catch: java.lang.Throwable -> L6f6
            goto L6d3
        L6e8:
            int r10 = r2.length     // Catch: java.lang.Throwable -> L6f6
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L6f6
            r7[r0] = r10     // Catch: java.lang.Throwable -> L6f6
            int r0 = r5 + 2
            int r5 = r2.length     // Catch: java.lang.Throwable -> L6f6
            java.lang.System.arraycopy(r2, r8, r7, r0, r5)     // Catch: java.lang.Throwable -> L6f6
            int r2 = r2.length     // Catch: java.lang.Throwable -> L6f6
            int r5 = r0 + r2
            goto L6d5
        L6f6:
            r7[r0] = r8
            r28 = 1
            int r5 = r0 + 1
            r2 = 2
        L6fd:
            byte[] r0 = new byte[r2]
            r0[r8] = r8
            r0[r28] = r8
            java.lang.String r2 = r1.J     // Catch: java.lang.Throwable -> L717
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L717
            if (r2 != 0) goto L715
            java.lang.String r0 = r1.J     // Catch: java.lang.Throwable -> L717
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L717
            byte[] r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r4)     // Catch: java.lang.Throwable -> L717
        L715:
            r10 = 2
            goto L719
        L717:
            r2 = 2
            goto L72d
        L719:
            java.lang.System.arraycopy(r0, r8, r7, r5, r10)     // Catch: java.lang.Throwable -> L717
            int r5 = r5 + r10
            if (r2 != 0) goto L72b
            java.lang.String r0 = r1.J     // Catch: java.lang.Throwable -> L72b
            byte[] r0 = r0.getBytes(r6)     // Catch: java.lang.Throwable -> L72b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L72b
            java.lang.System.arraycopy(r0, r8, r7, r5, r2)     // Catch: java.lang.Throwable -> L72b
            int r0 = r0.length     // Catch: java.lang.Throwable -> L72b
            int r5 = r5 + r0
        L72b:
            r2 = 2
            goto L72e
        L72d:
            int r5 = r5 + r2
        L72e:
            byte[] r0 = com.autonavi.aps.amapapi.utils.j.a(r8, r4)     // Catch: java.lang.Throwable -> L735
            java.lang.System.arraycopy(r0, r8, r7, r5, r2)     // Catch: java.lang.Throwable -> L735
        L735:
            int r5 = r5 + r2
            byte[] r0 = new byte[r2]
            r0 = {x0928: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            java.lang.System.arraycopy(r0, r8, r7, r5, r2)     // Catch: java.lang.Throwable -> L73e
        L73e:
            int r5 = r5 + r2
            byte[] r0 = r1.H
            if (r0 == 0) goto L746
            int r0 = r0.length
        L744:
            r15 = 0
            goto L748
        L746:
            r0 = 0
            goto L744
        L748:
            byte[] r2 = com.autonavi.aps.amapapi.utils.j.a(r0, r15)
            int r6 = r2.length
            java.lang.System.arraycopy(r2, r8, r7, r5, r6)
            int r2 = r2.length
            int r5 = r5 + r2
            if (r0 <= 0) goto L75e
            byte[] r0 = r1.H
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r8, r7, r5, r2)
            byte[] r0 = r1.H
            int r0 = r0.length
            int r5 = r5 + r0
        L75e:
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.a
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r10 = r0.doubleValue()
            int r0 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r0 < 0) goto L84c
            java.util.List<com.autonavi.aps.amapapi.restruct.d> r0 = r1.T
            if (r0 == 0) goto L775
            int r0 = r0.size()
            goto L776
        L775:
            r0 = 0
        L776:
            byte r2 = (byte) r0
            r7[r5] = r2
            int r2 = r5 + 1
            byte[] r6 = new byte[r2]
            java.lang.System.arraycopy(r7, r8, r6, r8, r2)
            if (r0 <= 0) goto L846
            java.util.List<com.autonavi.aps.amapapi.restruct.d> r0 = r1.T     // Catch: java.lang.Throwable -> L841
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L841
            r10 = r2
        L789:
            boolean r11 = r0.hasNext()     // Catch: java.lang.Throwable -> L841
            if (r11 == 0) goto L83f
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> L841
            com.autonavi.aps.amapapi.restruct.d r11 = (com.autonavi.aps.amapapi.restruct.d) r11     // Catch: java.lang.Throwable -> L841
            int r12 = r11.l     // Catch: java.lang.Throwable -> L841
            r13 = 1
            if (r12 == r13) goto L802
            r15 = 3
            if (r12 == r15) goto L7a0
            r14 = 4
            if (r12 != r14) goto L7a2
        L7a0:
            r13 = 5
            goto L804
        L7a2:
            r14 = 2
            if (r12 != r14) goto L7d6
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L841
            boolean r14 = r11.n     // Catch: java.lang.Throwable -> L841
            if (r14 == 0) goto L7ad
            r12 = r12 | 8
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L841
        L7ad:
            r7[r10] = r12     // Catch: java.lang.Throwable -> L841
            int r10 = r10 + 1
            int r12 = r11.f5741h     // Catch: java.lang.Throwable -> L841
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.a(r12, r4)     // Catch: java.lang.Throwable -> L841
            int r14 = r12.length     // Catch: java.lang.Throwable -> L841
            java.lang.System.arraycopy(r12, r8, r7, r10, r14)     // Catch: java.lang.Throwable -> L841
            int r12 = r12.length     // Catch: java.lang.Throwable -> L841
            int r10 = r10 + r12
            int r12 = r11.f5742i     // Catch: java.lang.Throwable -> L841
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.a(r12, r4)     // Catch: java.lang.Throwable -> L841
            int r14 = r12.length     // Catch: java.lang.Throwable -> L841
            java.lang.System.arraycopy(r12, r8, r7, r10, r14)     // Catch: java.lang.Throwable -> L841
            int r12 = r12.length     // Catch: java.lang.Throwable -> L841
            int r10 = r10 + r12
            int r12 = r11.f5743j     // Catch: java.lang.Throwable -> L841
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.a(r12, r4)     // Catch: java.lang.Throwable -> L841
            int r14 = r12.length     // Catch: java.lang.Throwable -> L841
            java.lang.System.arraycopy(r12, r8, r7, r10, r14)     // Catch: java.lang.Throwable -> L841
            int r12 = r12.length     // Catch: java.lang.Throwable -> L841
        L7d4:
            int r10 = r10 + r12
            goto L828
        L7d6:
            r14 = 5
            if (r12 != r14) goto L800
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L841
            boolean r13 = r11.n     // Catch: java.lang.Throwable -> L841
            if (r13 == 0) goto L7e1
            r12 = r12 | 8
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L841
        L7e1:
            r7[r10] = r12     // Catch: java.lang.Throwable -> L841
            int r10 = r10 + 1
            int r12 = r11.f5736c     // Catch: java.lang.Throwable -> L841
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.a(r12, r4)     // Catch: java.lang.Throwable -> L841
            int r13 = r12.length     // Catch: java.lang.Throwable -> L841
            java.lang.System.arraycopy(r12, r8, r7, r10, r13)     // Catch: java.lang.Throwable -> L841
            int r12 = r12.length     // Catch: java.lang.Throwable -> L841
            int r10 = r10 + r12
            long r12 = r11.f5738e     // Catch: java.lang.Throwable -> L841
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.a(r12)     // Catch: java.lang.Throwable -> L841
            r13 = 8
            java.lang.System.arraycopy(r12, r8, r7, r10, r13)     // Catch: java.lang.Throwable -> L841
            r13 = 5
            int r10 = r10 + 8
            goto L828
        L800:
            r13 = 5
            goto L828
        L802:
            r13 = 5
            r15 = 3
        L804:
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L841
            boolean r13 = r11.n     // Catch: java.lang.Throwable -> L841
            if (r13 == 0) goto L80c
            r12 = r12 | 8
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L841
        L80c:
            r7[r10] = r12     // Catch: java.lang.Throwable -> L841
            int r10 = r10 + 1
            int r12 = r11.f5736c     // Catch: java.lang.Throwable -> L841
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.a(r12, r4)     // Catch: java.lang.Throwable -> L841
            int r13 = r12.length     // Catch: java.lang.Throwable -> L841
            java.lang.System.arraycopy(r12, r8, r7, r10, r13)     // Catch: java.lang.Throwable -> L841
            int r12 = r12.length     // Catch: java.lang.Throwable -> L841
            int r10 = r10 + r12
            int r12 = r11.f5737d     // Catch: java.lang.Throwable -> L841
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.b(r12, r3)     // Catch: java.lang.Throwable -> L841
            int r13 = r12.length     // Catch: java.lang.Throwable -> L841
            java.lang.System.arraycopy(r12, r8, r7, r10, r13)     // Catch: java.lang.Throwable -> L841
            int r12 = r12.length     // Catch: java.lang.Throwable -> L841
            goto L7d4
        L828:
            long r12 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L841
            long r14 = r11.t     // Catch: java.lang.Throwable -> L841
            long r12 = r12 - r14
            long r12 = r12 / r16
            int r11 = (int) r12     // Catch: java.lang.Throwable -> L841
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L841
            byte[] r11 = com.autonavi.aps.amapapi.utils.j.a(r11, r4)     // Catch: java.lang.Throwable -> L841
            int r12 = r11.length     // Catch: java.lang.Throwable -> L841
            java.lang.System.arraycopy(r11, r8, r7, r10, r12)     // Catch: java.lang.Throwable -> L841
            int r11 = r11.length     // Catch: java.lang.Throwable -> L841
            int r10 = r10 + r11
            goto L789
        L83f:
            r2 = r10
            goto L846
        L841:
            java.lang.System.arraycopy(r6, r8, r7, r8, r2)
            r7[r5] = r8
        L846:
            java.lang.String r0 = r1.M
            int r5 = a(r0, r7, r2)
        L84c:
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.a
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r10 = r0.doubleValue()
            int r0 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r0 < 0) goto L8f1
            java.util.List<com.autonavi.aps.amapapi.restruct.f> r0 = r1.S
            if (r0 != 0) goto L860
            r0 = 0
            goto L864
        L860:
            int r0 = r0.size()
        L864:
            byte r2 = (byte) r0
            r7[r5] = r2
            int r5 = r5 + 1
            if (r0 <= 0) goto L8f1
            java.util.List<com.autonavi.aps.amapapi.restruct.f> r0 = r1.S
            java.util.Iterator r0 = r0.iterator()
        L871:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8f1
            java.lang.Object r2 = r0.next()
            com.autonavi.aps.amapapi.restruct.f r2 = (com.autonavi.aps.amapapi.restruct.f) r2
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r2.f5757d
            long r10 = r10 - r12
            int r6 = (int) r10
            int r6 = r6 / 1000
            if (r6 <= r9) goto L88c
            r6 = 65535(0xffff, float:9.1834E-41)
        L88c:
            byte[] r6 = com.autonavi.aps.amapapi.utils.j.a(r6, r4)
            r10 = 2
            java.lang.System.arraycopy(r6, r8, r7, r5, r10)
            int r6 = r5 + 2
            double r10 = r2.f5756c
            r12 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            double r10 = r10 * r12
            long r10 = java.lang.Math.round(r10)
            int r11 = (int) r10
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.b(r11, r3)
            r11 = 4
            java.lang.System.arraycopy(r10, r8, r7, r6, r11)
            int r6 = r5 + 6
            double r14 = r2.f5755b
            double r14 = r14 * r12
            long r12 = java.lang.Math.round(r14)
            int r10 = (int) r12
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.b(r10, r3)
            java.lang.System.arraycopy(r10, r8, r7, r6, r11)
            int r6 = r5 + 10
            int r10 = r2.f5758e
            float r10 = (float) r10
            r12 = 1199570688(0x477fff00, float:65535.0)
            int r13 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r13 <= 0) goto L8cd
            r10 = 1199570688(0x477fff00, float:65535.0)
        L8cd:
            int r10 = (int) r10
            byte[] r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r4)
            r14 = 2
            java.lang.System.arraycopy(r10, r8, r7, r6, r14)
            int r6 = r5 + 12
            int r10 = r2.a
            int r10 = r10 << 13
            int r12 = r2.f5760g
            int r12 = r12 << 6
            r10 = r10 | r12
            int r2 = r2.f5761h
            r2 = r2 | r10
            r2 = r2 & r9
            short r2 = (short) r2
            byte[] r2 = com.autonavi.aps.amapapi.utils.j.a(r2, r4)
            r10 = 2
            java.lang.System.arraycopy(r2, r8, r7, r6, r10)
            int r5 = r5 + 14
            goto L871
        L8f1:
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.a
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r2 = r0.doubleValue()
            int r0 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r0 < 0) goto L905
            java.lang.String r0 = r1.N
            int r5 = a(r0, r7, r5)
        L905:
            byte[] r0 = new byte[r5]
            java.lang.System.arraycopy(r7, r8, r0, r8, r5)
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32
            r2.<init>()
            r2.update(r0)
            long r2 = r2.getValue()
            byte[] r2 = com.autonavi.aps.amapapi.utils.j.a(r2)
            int r3 = r5 + 8
            byte[] r3 = new byte[r3]
            java.lang.System.arraycopy(r0, r8, r3, r8, r5)
            r14 = 8
            java.lang.System.arraycopy(r2, r8, r3, r5, r14)
            return r3
    }
}
