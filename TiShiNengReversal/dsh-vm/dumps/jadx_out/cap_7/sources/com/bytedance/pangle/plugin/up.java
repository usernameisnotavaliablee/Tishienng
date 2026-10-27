package com.bytedance.pangle.plugin;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class up implements java.lang.Runnable {


    up() {
            r0 = this;
            r0.<init>()
            return
    }

    private void j(java.io.File r3) {
            r2 = this;
            java.lang.String r0 = "ZeusScanRunnable listPluginDownloadDir, dir = "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r1, r0)
            com.bytedance.pangle.plugin.up$1 r0 = new com.bytedance.pangle.plugin.up$1
            r0.<init>(r2)
            r3.listFiles(r0)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = com.bytedance.pangle.up.cw.xt()
            r0.<init>(r1)
            r2.j(r0)
            java.lang.String r0 = com.bytedance.pangle.up.cw.r()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r2.j(r1)
        L1e:
            return
    }
}
