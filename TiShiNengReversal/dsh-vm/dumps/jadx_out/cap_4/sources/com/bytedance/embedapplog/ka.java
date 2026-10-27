package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class ka extends com.bytedance.embedapplog.uq<com.bytedance.embedapplog.i> {


    ka() {
            r1 = this;
            java.lang.String r0 = "com.mdid.msa"
            r1.<init>(r0)
            return
    }

    private void j(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.mdid.msa"
            java.lang.String r2 = "com.mdid.msa.service.MsaKlService"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "com.bun.msa.action.start.service"
            r0.setAction(r1)
            java.lang.String r1 = "com.bun.msa.param.pkgname"
            r0.putExtra(r1, r5)
            java.lang.String r5 = "com.bun.msa.param.runinset"
            r1 = 1
            r0.putExtra(r5, r1)     // Catch: java.lang.Exception -> L20
            r4.startService(r0)     // Catch: java.lang.Exception -> L20
            return
        L20:
            r4 = move-exception
            com.bytedance.embedapplog.uc.j(r4)
            return
    }

    @Override // com.bytedance.embedapplog.uq
    protected android.content.Intent cw(android.content.Context r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.mdid.msa"
            java.lang.String r2 = "com.mdid.msa.service.MsaIdService"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "com.bun.msa.action.bindto.service"
            r0.setAction(r1)
            java.lang.String r1 = "com.bun.msa.param.pkgname"
            java.lang.String r4 = r4.getPackageName()
            r0.putExtra(r1, r4)
            return r0
    }

    @Override // com.bytedance.embedapplog.uq
    protected com.bytedance.embedapplog.oq.xt<com.bytedance.embedapplog.i, java.lang.String> j() {
            r1 = this;
            com.bytedance.embedapplog.ka$1 r0 = new com.bytedance.embedapplog.ka$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.embedapplog.uq, com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = r2.getPackageName()
            r1.j(r2, r0)
            com.bytedance.embedapplog.tk$j r2 = super.xt(r2)
            return r2
    }
}
