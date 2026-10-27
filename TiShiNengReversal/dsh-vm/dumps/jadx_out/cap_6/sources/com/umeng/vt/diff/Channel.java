package com.umeng.vt.diff;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Channel {
    private static final java.lang.String UM_VISUAL_IMPRINT = "utm-visual";


    public Channel() {
            r0 = this;
            r0.<init>()
            return
    }

    private void download() {
            r4 = this;
            java.lang.String r0 = "com.umeng.vt.vismode.config.ConfigTools"
            java.lang.Class r0 = com.umeng.vt.diff.util.ClassLoadUtil.findClass(r0)     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L1e
            java.lang.String r1 = "download"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L1e
            if (r1 == 0) goto L1e
            java.lang.String r3 = "getInstance"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Exception -> L1e
            r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }

    private void storeConfig(java.util.Map<java.lang.String, java.lang.String> r7) {
            r6 = this;
            java.lang.String r0 = "com.umeng.vt.vismode.config.ConfigTools"
            java.lang.Class r0 = com.umeng.vt.diff.util.ClassLoadUtil.findClass(r0)     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L2a
            java.lang.String r1 = "storeConfig"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L2a
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L2a
            java.lang.String r3 = "getInstance"
            r4 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.Exception -> L2a
            java.lang.Object r0 = r0.invoke(r4, r4)     // Catch: java.lang.Exception -> L2a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2a
            r2[r5] = r7     // Catch: java.lang.Exception -> L2a
            r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L2a
        L2a:
            return
    }

    public void init(android.content.Context r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.loadConfig(r1)
            r0.registerListener(r1)
            return
    }

    public void loadConfig(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "utm-visual"
            r1 = 0
            java.lang.String r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r3, r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L24
            java.lang.String r0 = new java.lang.String
            r1 = 0
            byte[] r3 = android.util.Base64.decode(r3, r1)
            r0.<init>(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r1 = "data-track"
            r3.put(r1, r0)
            r2.storeConfig(r3)
        L24:
            return
    }

    public void registerListener(android.content.Context r3) {
            r2 = this;
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r3)
            com.umeng.vt.diff.Channel$1 r1 = new com.umeng.vt.diff.Channel$1
            r1.<init>(r2, r3)
            java.lang.String r3 = "utm-visual"
            r0.registImprintCallback(r3, r1)
            return
    }
}
