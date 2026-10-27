package com.beizi.ad.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o extends com.beizi.ad.internal.h.d {
    private java.lang.String a;

    public o(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            r1.a = r2
            return
    }

    @Override // com.beizi.ad.internal.h.d
    protected java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // com.beizi.ad.internal.h.d
    protected void a(com.beizi.ad.internal.h.e r3) {
            r2 = this;
            if (r3 == 0) goto L22
            boolean r0 = r3.a()
            if (r0 == 0) goto L22
            int r0 = r3.f()
            java.lang.String r3 = r3.g()
            r1 = 302(0x12e, float:4.23E-43)
            if (r0 != r1) goto L22
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L22
            com.beizi.ad.internal.o r0 = new com.beizi.ad.internal.o
            r0.<init>(r3)
            r0.b()
        L22:
            return
    }

    public void b() {
            r3 = this;
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.e()
            com.beizi.ad.internal.f.d r0 = com.beizi.ad.internal.f.d.a(r0)
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()
            android.content.Context r1 = r1.e()
            boolean r1 = r0.b(r1)
            if (r1 == 0) goto L29
            com.beizi.ad.lance.a.c r0 = com.beizi.ad.lance.a.c.b()
            java.util.concurrent.ExecutorService r0 = r0.f()
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r3.executeOnExecutor(r0, r1)
            return
        L29:
            java.lang.String r1 = r3.a
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()
            android.content.Context r2 = r2.e()
            r0.a(r1, r2)
            return
    }

    @Override // com.beizi.ad.internal.h.d, android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(com.beizi.ad.internal.h.e r1) {
            r0 = this;
            com.beizi.ad.internal.h.e r1 = (com.beizi.ad.internal.h.e) r1
            r0.a(r1)
            return
    }
}
