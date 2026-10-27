package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class ed extends com.bytedance.embedapplog.uq<com.bytedance.embedapplog.az> {


    ed() {
            r1 = this;
            java.lang.String r0 = "com.asus.msa.SupplementaryDID"
            r1.<init>(r0)
            return
    }

    @Override // com.bytedance.embedapplog.uq
    protected android.content.Intent cw(android.content.Context r4) {
            r3 = this;
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r0 = "com.asus.msa.action.ACCESS_DID"
            r4.setAction(r0)
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "com.asus.msa.SupplementaryDID"
            java.lang.String r2 = "com.asus.msa.SupplementaryDID.SupplementaryDIDService"
            r0.<init>(r1, r2)
            r4.setComponent(r0)
            return r4
    }

    @Override // com.bytedance.embedapplog.uq
    protected com.bytedance.embedapplog.oq.xt<com.bytedance.embedapplog.az, java.lang.String> j() {
            r1 = this;
            com.bytedance.embedapplog.ed$1 r0 = new com.bytedance.embedapplog.ed$1
            r0.<init>(r1)
            return r0
    }
}
