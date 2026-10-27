package com.umeng.commonsdk.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g implements com.umeng.commonsdk.config.e {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.umeng.commonsdk.config.e
    public void a(java.lang.String r7, java.lang.Object r8, java.lang.String[] r9) {
            r6 = this;
            java.lang.String r0 = "Config"
            if (r7 == 0) goto L57
            int r1 = r7.length()
            if (r1 > 0) goto Lb
            goto L57
        Lb:
            long r1 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L52
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1b
            java.lang.String r7 = "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r7)
            return
        L1b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "--->>> CollectFieldJudgment: handleConfigItem: item : "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r7)
            if (r8 == 0) goto L57
            boolean r7 = r8 instanceof com.umeng.commonsdk.config.b
            if (r7 == 0) goto L57
            r7 = 0
        L36:
            int r0 = r9.length     // Catch: java.lang.Throwable -> L57
            if (r7 >= r0) goto L57
            r0 = r9[r7]     // Catch: java.lang.Throwable -> L57
            boolean r3 = com.umeng.commonsdk.config.d.a(r0)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L4f
            boolean r3 = com.umeng.commonsdk.config.a.a(r1, r7)     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L57
            r4 = r8
            com.umeng.commonsdk.config.b r4 = (com.umeng.commonsdk.config.b) r4     // Catch: java.lang.Throwable -> L57
            r4.a(r0, r3)     // Catch: java.lang.Throwable -> L57
        L4f:
            int r7 = r7 + 1
            goto L36
        L52:
            java.lang.String r7 = "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r7)
        L57:
            return
    }
}
