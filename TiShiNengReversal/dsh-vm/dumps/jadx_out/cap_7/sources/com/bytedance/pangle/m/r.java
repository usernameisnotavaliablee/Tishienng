package com.bytedance.pangle.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r implements com.bytedance.pangle.m.m.j {
    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    private void j(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L13
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            r0.renameTo(r1)
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L1c
            java.lang.String r0 = ".odex"
            goto L1e
        L1c:
            java.lang.String r0 = ".dex"
        L1e:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".vdex"
            java.lang.String r4 = r4.replace(r0, r2)
            r1.<init>(r4)
            boolean r4 = r1.exists()
            if (r4 == 0) goto L3b
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r5.replace(r0, r2)
            r4.<init>(r5)
            r1.renameTo(r4)
        L3b:
            return
    }

    private static boolean xt(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            int r0 = com.bytedance.pangle.m.xt.xt     // Catch: java.lang.Exception -> Lb
            java.lang.String[] r1 = com.bytedance.pangle.m.xt.j(r1, r2, r0)     // Catch: java.lang.Exception -> Lb
            boolean r1 = com.bytedance.pangle.m.j.j(r1)     // Catch: java.lang.Exception -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // com.bytedance.pangle.m.m.j
    public boolean j(java.lang.String r5, int r6) {
            r4 = this;
            java.lang.String r0 = com.bytedance.pangle.up.cw.xt(r5, r6)
            java.lang.String r1 = "full DexOpt:"
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = "Zeus/install_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r2, r1)
            java.lang.String r5 = com.bytedance.pangle.up.cw.cw(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r1 = java.io.File.separator
            r6.append(r1)
            java.lang.String r3 = "compFully"
            r6.append(r3)
            java.lang.String r3 = com.bytedance.pangle.m.xt.xt(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = com.bytedance.pangle.m.xt.j(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            boolean r0 = xt(r0, r6)
            if (r0 == 0) goto L69
            r4.j(r6, r5)
            java.lang.String[] r5 = new java.lang.String[]{r5}
            boolean r5 = com.bytedance.pangle.m.xt.j(r5)
            java.lang.String r6 = "full DexOpt result:"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r6.concat(r0)
            com.bytedance.pangle.log.ZeusLogger.i(r2, r6)
            return r5
        L69:
            r5 = 0
            return r5
    }
}
