package com.bytedance.j.xt.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a implements com.bytedance.j.xt.r.c {
    private android.content.Context a;

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bytedance.j.xt.r.c
    public void a(long r2, java.lang.Thread r4, java.lang.Throwable r5) {
            r1 = this;
            android.content.Context r0 = r1.a
            com.bytedance.j.xt.cw.b r2 = com.bytedance.j.xt.cw.b.d(r2, r0, r4, r5)
            android.content.Context r3 = r1.a
            com.bytedance.j.xt.cw r4 = com.bytedance.j.xt.cw.xt
            java.lang.String r5 = r4.j()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            com.bytedance.j.xt.tl.k.e(r3, r5, r0)
            com.bytedance.j.xt.up.j.f r3 = com.bytedance.j.xt.up.j.f.c()
            com.bytedance.j.xt.cw.b r2 = r3.a(r4, r2)
            com.bytedance.j.xt.a$d r3 = com.bytedance.j.xt.a.d.b()
            org.json.JSONObject r2 = r2.k()
            r3.c(r2)
            return
    }

    @Override // com.bytedance.j.xt.r.c
    public boolean j(java.lang.Throwable r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
