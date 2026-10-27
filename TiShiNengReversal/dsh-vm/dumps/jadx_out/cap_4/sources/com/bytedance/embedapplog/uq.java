package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class uq<SERVICE> implements com.bytedance.embedapplog.tk {
    private final java.lang.String j;
    private com.bytedance.embedapplog.wf<java.lang.Boolean> xt;


    uq(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            com.bytedance.embedapplog.uq$1 r0 = new com.bytedance.embedapplog.uq$1
            r0.<init>(r1)
            r1.xt = r0
            r1.j = r2
            return
    }

    private com.bytedance.embedapplog.tk.j j(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            com.bytedance.embedapplog.tk$j r0 = new com.bytedance.embedapplog.tk$j
            r0.<init>()
            r0.xt = r2
            return r0
    }

    static /* synthetic */ java.lang.String j(com.bytedance.embedapplog.uq r0) {
            java.lang.String r0 = r0.j
            return r0
    }

    protected abstract android.content.Intent cw(android.content.Context r1);

    protected abstract com.bytedance.embedapplog.oq.xt<SERVICE, java.lang.String> j();

    @Override // com.bytedance.embedapplog.tk
    public boolean j(android.content.Context r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.bytedance.embedapplog.wf<java.lang.Boolean> r1 = r3.xt
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            java.lang.Object r4 = r1.xt(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
    }

    @Override // com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r4) {
            r3 = this;
            android.content.Intent r0 = r3.cw(r4)
            com.bytedance.embedapplog.oq$xt r1 = r3.j()
            com.bytedance.embedapplog.oq r2 = new com.bytedance.embedapplog.oq
            r2.<init>(r4, r0, r1)
            java.lang.Object r4 = r2.j()
            java.lang.String r4 = (java.lang.String) r4
            com.bytedance.embedapplog.tk$j r4 = r3.j(r4)
            return r4
    }
}
