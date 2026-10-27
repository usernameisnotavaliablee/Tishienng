package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class fk extends java.lang.Exception {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f3317b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f3318c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f3319d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f3320e;

    /* renamed from: f, reason: collision with root package name */
    private int f3321f;

    /* renamed from: g, reason: collision with root package name */
    private int f3322g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f3323h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f3324i;

    /* renamed from: j, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> f3325j;

    public fk(java.lang.String r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>(r17)
            java.lang.String r2 = "未知的错误"
            r0.a = r2
            java.lang.String r3 = ""
            r0.f3317b = r3
            r0.f3318c = r3
            java.lang.String r3 = "1900"
            r0.f3319d = r3
            java.lang.String r3 = "UnknownError"
            r0.f3320e = r3
            r3 = -1
            r0.f3321f = r3
            r0.f3322g = r3
            r4 = 0
            r0.f3323h = r4
            r0.a = r1
            java.lang.String r4 = "IO 操作异常 - IOException"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "DNS解析失败"
            r7 = 7
            r8 = 2
            java.lang.String r9 = "http连接失败 - ConnectionException"
            java.lang.String r10 = "未知主机 - UnKnowHostException"
            java.lang.String r11 = "socket 连接超时 - SocketTimeoutException"
            java.lang.String r12 = "socket 连接异常 - SocketException"
            r13 = 6
            r14 = 3
            if (r5 == 0) goto L47
            r3 = 21
            r0.f3321f = r3
            java.lang.String r3 = "1902"
            r0.f3319d = r3
            java.lang.String r3 = "IOException"
            r0.f3320e = r3
            goto L1ae
        L47:
            boolean r5 = r12.equals(r1)
            if (r5 == 0) goto L53
            r3 = 22
            r0.f3321f = r3
            goto L1ae
        L53:
            boolean r5 = r11.equals(r1)
            if (r5 == 0) goto L67
            r3 = 23
            r0.f3321f = r3
            java.lang.String r3 = "1802"
            r0.f3319d = r3
            java.lang.String r3 = "SocketTimeoutException"
            r0.f3320e = r3
            goto L1ae
        L67:
            java.lang.String r5 = "无效的参数 - IllegalArgumentException"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L7d
            r3 = 24
            r0.f3321f = r3
            java.lang.String r3 = "1901"
            r0.f3319d = r3
            java.lang.String r3 = "IllegalArgumentException"
            r0.f3320e = r3
            goto L1ae
        L7d:
            java.lang.String r5 = "空指针异常 - NullPointException"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L93
            r3 = 25
            r0.f3321f = r3
            java.lang.String r3 = "1903"
            r0.f3319d = r3
            java.lang.String r3 = "NullPointException"
            r0.f3320e = r3
            goto L1ae
        L93:
            java.lang.String r5 = "url异常 - MalformedURLException"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto La9
            r3 = 26
            r0.f3321f = r3
            java.lang.String r3 = "1803"
            r0.f3319d = r3
            java.lang.String r3 = "MalformedURLException"
            r0.f3320e = r3
            goto L1ae
        La9:
            boolean r5 = r10.equals(r1)
            if (r5 == 0) goto Lbd
            r3 = 27
            r0.f3321f = r3
            java.lang.String r3 = "1804"
            r0.f3319d = r3
            java.lang.String r3 = "UnknownHostException"
            r0.f3320e = r3
            goto L1ae
        Lbd:
            java.lang.String r5 = "服务器连接失败 - UnknownServiceException"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto Ld3
            r3 = 28
            r0.f3321f = r3
            java.lang.String r3 = "1805"
            r0.f3319d = r3
            java.lang.String r3 = "CannotConnectToHostException"
            r0.f3320e = r3
            goto L1ae
        Ld3:
            java.lang.String r5 = "协议解析错误 - ProtocolException"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto Le9
            r3 = 29
            r0.f3321f = r3
            java.lang.String r3 = "1801"
            r0.f3319d = r3
            java.lang.String r3 = "ProtocolException"
            r0.f3320e = r3
            goto L1ae
        Le9:
            boolean r5 = r9.equals(r1)
            java.lang.String r15 = "ConnectionException"
            r3 = 30
            if (r5 == 0) goto Lfd
            r0.f3321f = r3
            java.lang.String r3 = "1806"
            r0.f3319d = r3
            r0.f3320e = r15
            goto L1ae
        Lfd:
            java.lang.String r5 = "服务QPS超限"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L10f
            r0.f3321f = r3
            java.lang.String r3 = "2001"
            r0.f3319d = r3
            r0.f3320e = r15
            goto L1ae
        L10f:
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L11b
            r3 = 31
            r0.f3321f = r3
            goto L1ae
        L11b:
            java.lang.String r3 = "key鉴权失败"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L129
            r3 = 32
            r0.f3321f = r3
            goto L1ae
        L129:
            java.lang.String r3 = "限制访问的接口"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L137
            r3 = 33
            r0.f3321f = r3
            goto L1ae
        L137:
            java.lang.String r3 = "requeust is null"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L144
            r3 = 1
            r0.f3321f = r3
            goto L1ae
        L144:
            java.lang.String r3 = "request url is empty"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L14f
            r0.f3321f = r8
            goto L1ae
        L14f:
            java.lang.String r3 = "response is null"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L15a
            r0.f3321f = r14
            goto L1ae
        L15a:
            java.lang.String r3 = "thread pool has exception"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L166
            r3 = 4
            r0.f3321f = r3
            goto L1ae
        L166:
            java.lang.String r3 = "sdk name is invalid"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L172
            r3 = 5
            r0.f3321f = r3
            goto L1ae
        L172:
            java.lang.String r3 = "sdk info is null"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L17d
            r0.f3321f = r13
            goto L1ae
        L17d:
            java.lang.String r3 = "sdk packages is null"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L188
            r0.f3321f = r7
            goto L1ae
        L188:
            java.lang.String r3 = "线程池为空"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L195
            r3 = 8
            r0.f3321f = r3
            goto L1ae
        L195:
            java.lang.String r3 = "获取对象错误"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L1a2
            r3 = 101(0x65, float:1.42E-43)
            r0.f3321f = r3
            goto L1ae
        L1a2:
            boolean r3 = r6.equals(r1)
            if (r3 == 0) goto L1ab
            r0.f3321f = r14
            goto L1ae
        L1ab:
            r3 = -1
            r0.f3321f = r3
        L1ae:
            boolean r3 = r4.equals(r1)
            if (r3 == 0) goto L1b7
            r0.f3322g = r7
            return
        L1b7:
            boolean r3 = r12.equals(r1)
            if (r3 == 0) goto L1c0
            r0.f3322g = r13
            return
        L1c0:
            boolean r3 = r11.equals(r1)
            if (r3 == 0) goto L1c9
            r0.f3322g = r8
            return
        L1c9:
            boolean r3 = r10.equals(r1)
            if (r3 != 0) goto L1e7
            boolean r3 = r9.equals(r1)
            if (r3 == 0) goto L1d8
            r0.f3322g = r13
            return
        L1d8:
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L1e7
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L1e7
            r0.f3322g = r14
            return
        L1e7:
            r1 = 9
            r0.f3322g = r1
            return
    }

    public fk(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f3317b = r2
            r0.f3318c = r3
            return
    }

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final void a(int r1) {
            r0 = this;
            r0.f3321f = r1
            return
    }

    public final void a(java.lang.String r1) {
            r0 = this;
            r0.f3324i = r1
            return
    }

    public final void a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1) {
            r0 = this;
            r0.f3325j = r1
            return
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f3319d
            return r0
    }

    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f3320e
            return r0
    }

    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f3317b
            return r0
    }

    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f3318c
            return r0
    }

    public final int f() {
            r1 = this;
            int r0 = r1.f3321f
            return r0
    }

    public final int g() {
            r1 = this;
            int r0 = r1.f3322g
            return r0
    }

    public final int h() {
            r1 = this;
            r0 = 10
            r1.f3322g = r0
            return r0
    }

    public final boolean i() {
            r1 = this;
            boolean r0 = r1.f3323h
            return r0
    }

    public final void j() {
            r1 = this;
            r0 = 1
            r1.f3323h = r0
            return
    }
}
