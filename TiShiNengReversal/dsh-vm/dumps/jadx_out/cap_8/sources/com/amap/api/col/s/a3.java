package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a3<T, V> extends com.amap.api.col.s.f1 {
    protected boolean m;
    protected T n;
    protected int o;
    protected java.lang.String p;
    protected android.content.Context q;
    private int r;
    protected java.lang.String s;

    public a3(android.content.Context r3, T r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.m = r0
            r2.o = r0
            java.lang.String r1 = ""
            r2.p = r1
            r2.r = r0
            r2.s = r1
            r2.K(r3, r4)
            return
    }

    private V H() throws com.amap.api.services.core.AMapException {
            r16 = this;
            r1 = r16
            com.amap.api.col.s.n$b r2 = r1.P()     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            com.amap.api.col.s.n r0 = com.amap.api.col.s.n.b()     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            boolean r3 = r0.h(r2)     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L12:
            int r0 = r1.o     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            if (r6 >= r0) goto L160
            long r9 = java.lang.System.currentTimeMillis()     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            r11 = 1
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            int r0 = r0.getProtocol()     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            com.amap.api.col.s.e1 r12 = com.amap.api.col.s.e1.a()     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            android.content.Context r13 = r1.q     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            r12.c(r13)     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            com.amap.api.col.s.z2 r12 = com.amap.api.col.s.z2.l()     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            if (r3 == 0) goto L61
            com.amap.api.col.s.n r13 = com.amap.api.col.s.n.b()     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            com.amap.api.col.s.n$c r13 = r13.a(r2)     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            if (r13 == 0) goto L61
            java.lang.Object r14 = r13.a     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            if (r14 == 0) goto L61
            android.content.Context r7 = r1.q     // Catch: java.lang.Throwable -> L4c com.amap.api.services.core.AMapException -> L51 com.amap.api.col.s.bv -> L55
            java.lang.String r8 = r2.a     // Catch: java.lang.Throwable -> L4c com.amap.api.services.core.AMapException -> L51 com.amap.api.col.s.bv -> L55
            boolean r13 = r13.f4574b     // Catch: java.lang.Throwable -> L4c com.amap.api.services.core.AMapException -> L51 com.amap.api.col.s.bv -> L55
            com.amap.api.col.s.x.e(r7, r8, r13)     // Catch: java.lang.Throwable -> L4c com.amap.api.services.core.AMapException -> L51 com.amap.api.col.s.bv -> L55
            r7 = r14
            r8 = 1
            goto L61
        L4c:
            r0 = move-exception
            r4 = r14
            r8 = 1
            goto L154
        L51:
            r0 = move-exception
            r7 = r14
            r8 = 1
            goto L8a
        L55:
            r0 = move-exception
            r7 = r14
            r8 = 1
            goto La8
        L59:
            r0 = move-exception
            r4 = r7
            goto L154
        L5d:
            r0 = move-exception
            goto L8a
        L5f:
            r0 = move-exception
            goto La8
        L61:
            if (r7 != 0) goto L79
            byte[] r0 = r1.L(r0, r12, r1)     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            java.lang.Object r7 = r1.N(r0)     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            android.content.Context r0 = r1.q     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            java.lang.String r14 = r1.R()     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            long r12 = r12 - r9
            com.amap.api.col.s.x.d(r0, r14, r12, r11)     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
        L79:
            int r6 = r1.o     // Catch: java.lang.Throwable -> L59 com.amap.api.services.core.AMapException -> L5d com.amap.api.col.s.bv -> L5f
            if (r3 == 0) goto Ld7
            if (r8 != 0) goto Ld7
        L7f:
            com.amap.api.col.s.n r0 = com.amap.api.col.s.n.b()     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            r0.e(r2, r7)     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            goto L12
        L87:
            r0 = move-exception
            goto L169
        L8a:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            android.content.Context r13 = r1.q     // Catch: java.lang.Throwable -> L59
            java.lang.String r14 = r1.R()     // Catch: java.lang.Throwable -> L59
            long r11 = r11 - r9
            com.amap.api.col.s.x.d(r13, r14, r11, r5)     // Catch: java.lang.Throwable -> L59
            int r6 = r6 + 1
            int r9 = r1.o     // Catch: java.lang.Throwable -> L59
            if (r6 >= r9) goto La3
            if (r3 == 0) goto Ld7
            if (r8 != 0) goto Ld7
            goto L7f
        La3:
            throw r0     // Catch: java.lang.Throwable -> La4
        La4:
            r0 = move-exception
            r4 = 0
            goto L154
        La8:
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            android.content.Context r14 = r1.q     // Catch: java.lang.Throwable -> L59
            java.lang.String r15 = r1.R()     // Catch: java.lang.Throwable -> L59
            long r12 = r12 - r9
            com.amap.api.col.s.x.d(r14, r15, r12, r5)     // Catch: java.lang.Throwable -> L59
            int r6 = r6 + 1
            int r9 = r1.o     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = "http或socket连接失败 - ConnectionException"
            java.lang.String r12 = "服务器连接失败 - UnknownServiceException"
            java.lang.String r13 = "socket 连接异常 - SocketException"
            java.lang.String r14 = "http连接失败 - ConnectionException"
            if (r6 >= r9) goto L111
            int r9 = r1.r     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> Lda
            int r9 = r9 * 1000
            long r4 = (long) r9     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> Lda
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> Lda
            if (r3 == 0) goto Ld7
            if (r8 != 0) goto Ld7
            com.amap.api.col.s.n r0 = com.amap.api.col.s.n.b()     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            r0.e(r2, r7)     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
        Ld7:
            r5 = 0
            goto L12
        Lda:
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L59
            boolean r4 = r14.equals(r4)     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L107
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L59
            boolean r4 = r13.equals(r4)     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L107
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L59
            boolean r4 = r12.equals(r4)     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto Lf9
            goto L107
        Lf9:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r0.a()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> L59
            r4.<init>(r5, r11, r0)     // Catch: java.lang.Throwable -> L59
            throw r4     // Catch: java.lang.Throwable -> L59
        L107:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> L59
            r4.<init>(r10, r11, r0)     // Catch: java.lang.Throwable -> L59
            throw r4     // Catch: java.lang.Throwable -> L59
        L111:
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> La4
            boolean r4 = r14.equals(r4)     // Catch: java.lang.Throwable -> La4
            if (r4 != 0) goto L14a
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> La4
            boolean r4 = r13.equals(r4)     // Catch: java.lang.Throwable -> La4
            if (r4 != 0) goto L14a
            java.lang.String r4 = "未知的错误"
            java.lang.String r5 = r0.a()     // Catch: java.lang.Throwable -> La4
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La4
            if (r4 != 0) goto L14a
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> La4
            boolean r4 = r12.equals(r4)     // Catch: java.lang.Throwable -> La4
            if (r4 == 0) goto L13c
            goto L14a
        L13c:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = r0.a()     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> La4
            r4.<init>(r5, r11, r0)     // Catch: java.lang.Throwable -> La4
            throw r4     // Catch: java.lang.Throwable -> La4
        L14a:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> La4
            r4.<init>(r10, r11, r0)     // Catch: java.lang.Throwable -> La4
            throw r4     // Catch: java.lang.Throwable -> La4
        L154:
            if (r3 == 0) goto L15f
            if (r8 != 0) goto L15f
            com.amap.api.col.s.n r3 = com.amap.api.col.s.n.b()     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
            r3.e(r2, r4)     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
        L15f:
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L87 java.lang.Throwable -> L161
        L160:
            return r7
        L161:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r2 = "未知错误"
            r0.<init>(r2)
            throw r0
        L169:
            throw r0
    }

    private void K(android.content.Context r1, T r2) {
            r0 = this;
            r0.q = r1
            r0.n = r2
            r1 = 1
            r0.o = r1
            com.amap.api.services.core.ServiceSettings r1 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r1 = r1.getSoTimeOut()
            r0.j(r1)
            com.amap.api.services.core.ServiceSettings r1 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r1 = r1.getConnectionTimeOut()
            r0.d(r1)
            return
    }

    private byte[] L(int r1, com.amap.api.col.s.z2 r2, com.amap.api.col.s.f1 r3) throws com.amap.api.col.s.bv {
            r0 = this;
            r2 = 1
            if (r1 != r2) goto L6
            com.amap.api.col.s.dz$c r1 = com.amap.api.col.s.dz.c.a
            goto L8
        L6:
            com.amap.api.col.s.dz$c r1 = com.amap.api.col.s.dz.c.f4428b
        L8:
            r0.g(r1)
            boolean r1 = r0.m
            if (r1 == 0) goto L14
            com.amap.api.col.s.b3 r1 = com.amap.api.col.s.u2.d(r3)
            goto L18
        L14:
            com.amap.api.col.s.b3 r1 = com.amap.api.col.s.z2.n(r3)
        L18:
            if (r1 == 0) goto L21
            byte[] r2 = r1.a
            java.lang.String r1 = r1.f4317d
            r0.s = r1
            return r2
        L21:
            r1 = 0
            return r1
    }

    private V N(byte[] r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            java.lang.Object r1 = r0.J(r1)
            return r1
    }

    private java.lang.String Q() {
            r1 = this;
            java.lang.String r0 = r1.s
            return r0
    }

    private java.lang.String R() {
            r4 = this;
            java.lang.String r0 = r4.a()
            if (r0 == 0) goto L23
            java.lang.String r1 = ".com/"
            java.lang.String r2 = "?"
            int r1 = r0.indexOf(r1)     // Catch: java.lang.Throwable -> L23
            int r2 = r0.indexOf(r2)     // Catch: java.lang.Throwable -> L23
            r3 = -1
            if (r2 != r3) goto L1c
            int r1 = r1 + 5
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Throwable -> L23
            return r0
        L1c:
            int r1 = r1 + 5
            java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.lang.Throwable -> L23
            return r0
        L23:
            r0 = 0
            return r0
    }

    protected abstract V I(java.lang.String r1) throws com.amap.api.services.core.AMapException;

    protected V J(byte[] r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r0 = 0
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "utf-8"
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L9
            goto L12
        L9:
            r4 = move-exception
            java.lang.String r1 = "ProtocalHandler"
            java.lang.String r2 = "loadData"
            com.amap.api.col.s.j4.i(r4, r1, r2)
            r1 = r0
        L12:
            if (r1 == 0) goto L25
            java.lang.String r4 = ""
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L1d
            goto L25
        L1d:
            com.amap.api.col.s.j4.l(r1)
            java.lang.Object r4 = r3.I(r1)
            return r4
        L25:
            return r0
    }

    protected abstract java.lang.String M();

    public final V O() throws com.amap.api.services.core.AMapException {
            r3 = this;
            T r0 = r3.n
            if (r0 == 0) goto L16
            java.lang.Object r0 = r3.H()     // Catch: com.amap.api.services.core.AMapException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = r3.R()
            java.lang.String r2 = r3.Q()
            com.amap.api.col.s.x.f(r1, r2, r0)
            throw r0
        L16:
            r0 = 0
            return r0
    }

    protected com.amap.api.col.s.n.b P() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String m() {
            r1 = this;
            java.lang.String r0 = "sea"
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public java.util.Map<java.lang.String, java.lang.String> o() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public java.util.Map<java.lang.String, java.lang.String> p() {
            r1 = this;
            r0 = 0
            return r0
    }
}
