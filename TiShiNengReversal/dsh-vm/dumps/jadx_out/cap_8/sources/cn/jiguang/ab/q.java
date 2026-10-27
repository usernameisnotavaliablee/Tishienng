package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class q extends cn.jiguang.au.b {
    private byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.ag.a f328b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f329c;

    q(cn.jiguang.ag.a r1, android.content.Context r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            android.content.Context r2 = cn.jiguang.av.c.a(r2)
            r0.f329c = r2
            r0.a = r3
            java.lang.String r2 = "TcpRecvAction"
            r0.f668h = r2
            r0.f328b = r1
            return
    }

    @Override // cn.jiguang.au.b
    public void a() {
            r4 = this;
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()     // Catch: java.lang.Throwable -> L16
            android.content.Context r1 = r4.f329c     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "tcp_a22"
            r3 = 0
            r0.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            cn.jiguang.ag.a r0 = r4.f328b     // Catch: java.lang.Throwable -> L16
            android.content.Context r1 = r4.f329c     // Catch: java.lang.Throwable -> L16
            byte[] r2 = r4.a     // Catch: java.lang.Throwable -> L16
            cn.jiguang.af.a.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TcpRecvAction failed:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "TcpRecvAction"
            cn.jiguang.w.f.i(r1, r0)
            return
    }
}
