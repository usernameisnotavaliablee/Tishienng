package com.bytedance.pangle.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw implements com.bytedance.pangle.m.m.j {
    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean j(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r0 = 0
            dalvik.system.DexFile.loadDex(r2, r3, r0)     // Catch: java.io.IOException -> L6
            r2 = 1
            return r2
        L6:
            return r0
    }

    @Override // com.bytedance.pangle.m.m.j
    public boolean j(java.lang.String r10, int r11) {
            r9 = this;
            java.lang.String r0 = com.bytedance.pangle.m.ae.j(r10, r11)
            java.lang.String r10 = com.bytedance.pangle.up.cw.cw(r10, r11)
            java.lang.String r11 = ":"
            java.lang.String[] r11 = r0.split(r11)
            java.lang.String r1 = "full DexOpt start:"
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "Zeus/install_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = r11.length
            r4 = 0
            r5 = 0
            r6 = 0
        L21:
            if (r5 >= r0) goto L4c
            r6 = r11[r5]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r8 = java.io.File.separator
            r7.append(r8)
            java.lang.String r8 = com.bytedance.pangle.m.xt.j(r6)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r6 = r9.j(r6, r7)
            if (r6 == 0) goto L4d
            java.lang.String r6 = "full DexOpt result:true"
            com.bytedance.pangle.log.ZeusLogger.i(r1, r6)
            int r5 = r5 + 1
            r6 = 1
            goto L21
        L4c:
            r4 = r6
        L4d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "compile cost:"
            r10.<init>(r11)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r10.append(r0)
            java.lang.String r11 = " result:"
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "Zeus/load_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r11, r10)
            return r4
    }
}
