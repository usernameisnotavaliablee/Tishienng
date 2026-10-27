package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qe extends com.bytedance.embedapplog.uq<com.bytedance.embedapplog.t> {
    final com.bytedance.embedapplog.oy j;
    final com.bytedance.embedapplog.yl xt;


    qe() {
            r1 = this;
            java.lang.String r0 = "com.hihonor.id"
            r1.<init>(r0)
            com.bytedance.embedapplog.oy r0 = new com.bytedance.embedapplog.oy
            r0.<init>()
            r1.j = r0
            com.bytedance.embedapplog.yl r0 = new com.bytedance.embedapplog.yl
            r0.<init>()
            r1.xt = r0
            return
    }

    @Override // com.bytedance.embedapplog.uq
    protected android.content.Intent cw(android.content.Context r2) {
            r1 = this;
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r0 = "com.hihonor.id.HnOaIdService"
            r2.setAction(r0)
            java.lang.String r0 = "com.hihonor.id"
            r2.setPackage(r0)
            return r2
    }

    @Override // com.bytedance.embedapplog.uq
    protected com.bytedance.embedapplog.oq.xt<com.bytedance.embedapplog.t, java.lang.String> j() {
            r1 = this;
            com.bytedance.embedapplog.qe$1 r0 = new com.bytedance.embedapplog.qe$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.embedapplog.uq, com.bytedance.embedapplog.tk
    public /* bridge */ /* synthetic */ boolean j(android.content.Context r1) {
            r0 = this;
            boolean r1 = super.j(r1)
            return r1
    }

    @Override // com.bytedance.embedapplog.uq, com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r4) {
            r3 = this;
            android.content.Intent r0 = r3.cw(r4)
            com.bytedance.embedapplog.oq$xt r1 = r3.j()
            com.bytedance.embedapplog.oq r2 = new com.bytedance.embedapplog.oq
            r2.<init>(r4, r0, r1)
            r2.j()
            com.bytedance.embedapplog.tk$j r4 = new com.bytedance.embedapplog.tk$j
            r4.<init>()
            com.bytedance.embedapplog.oy r0 = r3.j
            java.lang.String r0 = r0.xt()
            r4.xt = r0
            com.bytedance.embedapplog.yl r0 = r3.xt
            boolean r0 = r0.xt()
            r4.cw = r0
            return r4
    }
}
