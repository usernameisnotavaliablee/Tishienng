package com.beizi.ad.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class m implements com.beizi.ad.internal.f {
    private java.util.LinkedList<com.beizi.ad.internal.d.a> a;

    /* renamed from: b, reason: collision with root package name */
    private long f7009b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.ArrayList<java.lang.String> f7010c;

    public m() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f7009b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f7010c = r0
            return
    }

    @Override // com.beizi.ad.internal.f
    public long a(long r6) {
            r5 = this;
            long r0 = r5.f7009b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            long r6 = r6 - r0
            return r6
        La:
            r6 = -1
            return r6
    }

    protected void a(java.util.LinkedList<com.beizi.ad.internal.d.a> r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.beizi.ad.internal.f
    public java.util.LinkedList<com.beizi.ad.internal.d.a> b() {
            r1 = this;
            java.util.LinkedList<com.beizi.ad.internal.d.a> r0 = r1.a
            return r0
    }

    public abstract void e();

    public void g() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.f7009b = r0
            return
    }

    protected void h() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.f7010c
            r0.clear()
            return
    }

    protected com.beizi.ad.internal.d.a i() {
            r2 = this;
            java.util.LinkedList<com.beizi.ad.internal.d.a> r0 = r2.a
            if (r0 == 0) goto L24
            java.lang.Object r0 = r0.getFirst()
            if (r0 == 0) goto L24
            java.util.ArrayList<java.lang.String> r0 = r2.f7010c
            java.util.LinkedList<com.beizi.ad.internal.d.a> r1 = r2.a
            java.lang.Object r1 = r1.getFirst()
            com.beizi.ad.internal.d.a r1 = (com.beizi.ad.internal.d.a) r1
            java.lang.String r1 = r1.a()
            r0.add(r1)
            java.util.LinkedList<com.beizi.ad.internal.d.a> r0 = r2.a
            java.lang.Object r0 = r0.removeFirst()
            com.beizi.ad.internal.d.a r0 = (com.beizi.ad.internal.d.a) r0
            return r0
        L24:
            r0 = 0
            return r0
    }
}
