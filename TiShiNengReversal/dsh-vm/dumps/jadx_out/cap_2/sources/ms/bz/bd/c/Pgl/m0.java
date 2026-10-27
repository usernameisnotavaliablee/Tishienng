package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m0 implements ms.bz.bd.c.Pgl.n0.pgla {
    private final long a;
    private final android.content.Context b;
    private final ms.bz.bd.c.Pgl.pblu c;

    m0(ms.bz.bd.c.Pgl.pblu r1, android.content.Context r2, long r3) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L14
            r0.c = r1
            android.content.Context r1 = r2.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.b = r1
            r0.a = r3
            return
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "context could not be null"
            r1.<init>(r2)
            throw r1
    }

    @Override // ms.bz.bd.c.Pgl.n0.pgla
    public final java.lang.String a() {
            r6 = this;
            long r2 = r6.a
            r0 = -1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L17
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r4 = 0
            r0 = 33554439(0x2000007, float:9.403963E-38)
            r1 = 0
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L17:
            java.lang.String r0 = ""
            return r0
    }

    @Override // ms.bz.bd.c.Pgl.n0.pgla
    public final java.util.Map<java.lang.String, java.lang.String> b(java.lang.String r9, byte[] r10) {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r9 == 0) goto L38
            int r1 = r9.length()
            if (r1 == 0) goto L38
            long r4 = r8.a
            int r1 = ms.bz.bd.c.Pgl.pbly.b
            r2 = 33554438(0x2000006, float:9.403962E-38)
            r3 = 0
            r6 = r9
            r7 = r10
            java.lang.Object r9 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String[] r9 = (java.lang.String[]) r9
            if (r9 == 0) goto L38
            int r10 = r9.length
            int r10 = r10 % 2
            if (r10 != 0) goto L38
            r10 = 0
        L25:
            int r1 = r9.length
            if (r10 >= r1) goto L38
            r1 = r9[r10]
            int r2 = r10 + 1
            r2 = r9[r2]
            if (r1 == 0) goto L35
            if (r2 == 0) goto L35
            r0.put(r1, r2)
        L35:
            int r10 = r10 + 2
            goto L25
        L38:
            return r0
    }

    @Override // ms.bz.bd.c.Pgl.n0.pgla
    public final void c(java.lang.String r8) {
            r7 = this;
            ms.bz.bd.c.Pgl.pblu r0 = r7.c
            r0.e = r8
            long r3 = r7.a
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L18
            android.content.Context r6 = r7.b
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r1 = 33554435(0x2000003, float:9.403958E-38)
            r2 = 0
            r5 = r8
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
        L18:
            return
    }

    @Override // ms.bz.bd.c.Pgl.n0.pgla
    public final void d(java.lang.String r8) {
            r7 = this;
            long r0 = r7.a
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L1c
            long r3 = r7.a
            android.content.Context r6 = r7.b
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r1 = 33554433(0x2000001, float:9.403956E-38)
            r2 = 0
            r5 = r8
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
        L1c:
            return
    }

    @Override // ms.bz.bd.c.Pgl.n0.pgla
    public final void e(java.lang.String r8) {
            r7 = this;
            ms.bz.bd.c.Pgl.pblu r0 = r7.c
            r0.c = r8
            long r3 = r7.a
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L18
            android.content.Context r6 = r7.b
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r1 = 33554434(0x2000002, float:9.403957E-38)
            r2 = 0
            r5 = r8
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
        L18:
            return
    }

    @Override // ms.bz.bd.c.Pgl.n0.pgla
    public final void f(java.lang.String r8) {
            r7 = this;
            ms.bz.bd.c.Pgl.pblu r0 = r7.c
            r0.d = r8
            long r3 = r7.a
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L18
            android.content.Context r6 = r7.b
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r1 = 33554437(0x2000005, float:9.40396E-38)
            r2 = 0
            r5 = r8
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
        L18:
            return
    }

    @Override // ms.bz.bd.c.Pgl.n0.pgla
    public final void g(int r7) {
            r6 = this;
            long r2 = r6.a
            r0 = -1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L13
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r4 = 0
            r5 = 0
            r0 = 33554441(0x2000009, float:9.403965E-38)
            r1 = r7
            com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
        L13:
            return
    }
}
