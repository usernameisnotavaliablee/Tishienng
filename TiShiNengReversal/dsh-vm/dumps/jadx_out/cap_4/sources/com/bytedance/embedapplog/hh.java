package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class hh extends com.bytedance.embedapplog.l {
    hh() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private boolean j() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "miui.os.Build"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L12
            int r1 = r1.length()     // Catch: java.lang.Exception -> L12
            if (r1 <= 0) goto L12
            r0 = 1
        L12:
            return r0
    }

    private boolean xt() {
            r2 = this;
            java.lang.String r0 = android.os.Build.DISPLAY
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L10
            java.lang.String r1 = "Flyme"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1a
        L10:
            java.lang.String r0 = "flyme"
            java.lang.String r1 = android.os.Build.USER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 16
            r0.<init>(r1)
            boolean r1 = r3.j()
            if (r1 == 0) goto L13
            java.lang.String r1 = "MIUI-"
            r0.append(r1)
            goto L3c
        L13:
            boolean r1 = r3.xt()
            if (r1 == 0) goto L1f
            java.lang.String r1 = "FLYME-"
            r0.append(r1)
            goto L3c
        L1f:
            java.lang.String r1 = com.bytedance.embedapplog.g.j()
            boolean r2 = com.bytedance.embedapplog.g.j(r1)
            if (r2 == 0) goto L2e
            java.lang.String r2 = "EMUI-"
            r0.append(r2)
        L2e:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3c
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
        L3c:
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            r0.append(r1)
            java.lang.String r1 = "rom"
            java.lang.String r0 = r0.toString()
            r4.put(r1, r0)
            r4 = 1
            return r4
    }
}
