package com.beizi.ad.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i extends com.beizi.ad.internal.h.d {
    private java.lang.String a;

    public i(java.lang.String r2) {
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
            if (r3 == 0) goto L25
            boolean r0 = r3.a()
            if (r0 == 0) goto L25
            int r0 = r3.f()
            java.lang.String r3 = r3.g()
            r1 = 302(0x12e, float:4.23E-43)
            if (r0 != r1) goto L25
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L25
            com.beizi.ad.internal.i r0 = new com.beizi.ad.internal.i
            r0.<init>(r3)
            r3 = 0
            java.lang.Void[] r3 = new java.lang.Void[r3]
            r0.execute(r3)
        L25:
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
