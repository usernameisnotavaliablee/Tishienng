package com.beizi.fusion.update;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private android.content.Context a;
    private boolean b;

    a(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.b = r0
            if (r3 != 0) goto L9
            return
        L9:
            r1.a = r2
            r1.a(r3)
            return
    }

    private void a(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "globalConfig"
            java.lang.String r1 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Exception -> L1cc
            java.lang.String r8 = com.beizi.fusion.tool.b.b(r1, r8)     // Catch: java.lang.Exception -> L1cc
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L1cc
            r2 = 0
            if (r1 == 0) goto L14
            r7.b = r2     // Catch: java.lang.Exception -> L1cc
            return
        L14:
            java.lang.String r8 = com.beizi.fusion.tool.t.b(r8)     // Catch: java.lang.Exception -> L1cc
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L1cc
            if (r1 != 0) goto L1ca
            java.lang.String r1 = "null"
            boolean r1 = r8.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L1cc
            if (r1 == 0) goto L28
            goto L1ca
        L28:
            android.content.Context r1 = r7.a     // Catch: java.lang.Exception -> L1cc
            java.lang.String r2 = ""
            java.lang.Object r1 = com.beizi.fusion.tool.an.b(r1, r0, r2)     // Catch: java.lang.Exception -> L1cc
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L1cc
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L1cc
            if (r2 == 0) goto L45
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            java.lang.String r3 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Exception -> L1cc
            java.lang.String r3 = com.beizi.fusion.tool.b.a(r3, r8)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.tool.an.a(r2, r0, r3)     // Catch: java.lang.Exception -> L1cc
        L45:
            java.lang.String r2 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Exception -> L1cc
            java.lang.String r1 = com.beizi.fusion.tool.b.b(r2, r1)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.GlobalConfig r8 = com.beizi.fusion.model.GlobalConfig.objectFromData(r8)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.GlobalConfig r1 = com.beizi.fusion.model.GlobalConfig.objectFromData(r1)     // Catch: java.lang.Exception -> L1cc
            if (r8 == 0) goto L1cc
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            r2.setGlobalConfig(r8)     // Catch: java.lang.Exception -> L1cc
            java.lang.String r2 = r8.getConfigVersion()     // Catch: java.lang.Exception -> L1cc
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1cc
            if (r2 != 0) goto L8c
            if (r1 == 0) goto L73
            java.lang.String r2 = r8.getConfigVersion()     // Catch: java.lang.Exception -> L1cc
            r1.setConfigVersion(r2)     // Catch: java.lang.Exception -> L1cc
        L73:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.Manager r2 = r2.getManager()     // Catch: java.lang.Exception -> L1cc
            if (r2 != 0) goto L8c
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            java.lang.String r3 = r8.getConfigVersion()     // Catch: java.lang.Exception -> L1cc
            r2.setConfigVersion(r3)     // Catch: java.lang.Exception -> L1cc
        L8c:
            int r2 = r8.getExpireTime()     // Catch: java.lang.Exception -> L1cc
            if (r2 <= 0) goto La9
            if (r1 == 0) goto L9b
            int r2 = r8.getExpireTime()     // Catch: java.lang.Exception -> L1cc
            r1.setExpireTime(r2)     // Catch: java.lang.Exception -> L1cc
        L9b:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            int r3 = r8.getExpireTime()     // Catch: java.lang.Exception -> L1cc
            long r3 = (long) r3     // Catch: java.lang.Exception -> L1cc
            r2.setExpireTime(r3)     // Catch: java.lang.Exception -> L1cc
        La9:
            long r2 = r8.getMaxValidTime()     // Catch: java.lang.Exception -> L1cc
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto Lc9
            if (r1 == 0) goto Lbc
            long r2 = r8.getMaxValidTime()     // Catch: java.lang.Exception -> L1cc
            r1.setMaxValidTime(r2)     // Catch: java.lang.Exception -> L1cc
        Lbc:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            long r3 = r8.getMaxValidTime()     // Catch: java.lang.Exception -> L1cc
            r2.setMaxValidTime(r3)     // Catch: java.lang.Exception -> L1cc
        Lc9:
            com.beizi.fusion.model.Configurator r2 = r8.getConfigurator()     // Catch: java.lang.Exception -> L1cc
            if (r2 == 0) goto Lf1
            if (r1 == 0) goto Ld8
            com.beizi.fusion.model.Configurator r2 = r8.getConfigurator()     // Catch: java.lang.Exception -> L1cc
            r1.setConfigurator(r2)     // Catch: java.lang.Exception -> L1cc
        Ld8:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.Manager r2 = r2.getManager()     // Catch: java.lang.Exception -> L1cc
            if (r2 != 0) goto Lf1
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.Configurator r3 = r8.getConfigurator()     // Catch: java.lang.Exception -> L1cc
            r2.setConfigurator(r3)     // Catch: java.lang.Exception -> L1cc
        Lf1:
            com.beizi.fusion.model.Messenger r2 = r8.getMessenger()     // Catch: java.lang.Exception -> L1cc
            if (r2 == 0) goto L119
            if (r1 == 0) goto L100
            com.beizi.fusion.model.Messenger r2 = r8.getMessenger()     // Catch: java.lang.Exception -> L1cc
            r1.setMessenger(r2)     // Catch: java.lang.Exception -> L1cc
        L100:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.Manager r2 = r2.getManager()     // Catch: java.lang.Exception -> L1cc
            if (r2 != 0) goto L119
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.Messenger r3 = r8.getMessenger()     // Catch: java.lang.Exception -> L1cc
            r2.setMessenger(r3)     // Catch: java.lang.Exception -> L1cc
        L119:
            com.beizi.fusion.model.Manager r2 = r8.getManager()     // Catch: java.lang.Exception -> L1cc
            if (r2 == 0) goto L141
            if (r1 == 0) goto L128
            com.beizi.fusion.model.Manager r2 = r8.getManager()     // Catch: java.lang.Exception -> L1cc
            r1.setManager(r2)     // Catch: java.lang.Exception -> L1cc
        L128:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.Manager r2 = r2.getManager()     // Catch: java.lang.Exception -> L1cc
            if (r2 != 0) goto L141
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.Manager r3 = r8.getManager()     // Catch: java.lang.Exception -> L1cc
            r2.setManager(r3)     // Catch: java.lang.Exception -> L1cc
        L141:
            com.beizi.fusion.model.TaskConfig r2 = r8.getTaskConfig()     // Catch: java.lang.Exception -> L1cc
            if (r2 == 0) goto L15d
            if (r1 == 0) goto L150
            com.beizi.fusion.model.TaskConfig r2 = r8.getTaskConfig()     // Catch: java.lang.Exception -> L1cc
            r1.setTaskConfig(r2)     // Catch: java.lang.Exception -> L1cc
        L150:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.TaskConfig r3 = r8.getTaskConfig()     // Catch: java.lang.Exception -> L1cc
            r2.setTaskConfig(r3)     // Catch: java.lang.Exception -> L1cc
        L15d:
            com.beizi.fusion.model.AdPlusConfig r2 = r8.getAdPlusConfig()     // Catch: java.lang.Exception -> L1cc
            if (r2 == 0) goto L17e
            if (r1 == 0) goto L16c
            com.beizi.fusion.model.AdPlusConfig r2 = r8.getAdPlusConfig()     // Catch: java.lang.Exception -> L1cc
            r1.setAdPlusConfig(r2)     // Catch: java.lang.Exception -> L1cc
        L16c:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.AdPlusConfig r3 = r8.getAdPlusConfig()     // Catch: java.lang.Exception -> L1cc
            r2.setAdPlusConfig(r3)     // Catch: java.lang.Exception -> L1cc
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.c.l.a(r2)     // Catch: java.lang.Exception -> L1cc
        L17e:
            com.beizi.fusion.model.IncentiveConfig r2 = r8.getIncentiveConfig()     // Catch: java.lang.Exception -> L1cc
            if (r2 == 0) goto L192
            if (r1 == 0) goto L189
            r1.setIncentiveConfig(r2)     // Catch: java.lang.Exception -> L1cc
        L189:
            android.content.Context r3 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r3 = com.beizi.fusion.model.ResponseInfo.getInstance(r3)     // Catch: java.lang.Exception -> L1cc
            r3.setIncentiveConfig(r2)     // Catch: java.lang.Exception -> L1cc
        L192:
            java.lang.String r2 = r8.getCrashUrl()     // Catch: java.lang.Exception -> L1cc
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1cc
            if (r2 != 0) goto L1b2
            if (r1 == 0) goto L1a5
            java.lang.String r2 = r8.getCrashUrl()     // Catch: java.lang.Exception -> L1cc
            r1.setCrashUrl(r2)     // Catch: java.lang.Exception -> L1cc
        L1a5:
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L1cc
            java.lang.String r8 = r8.getCrashUrl()     // Catch: java.lang.Exception -> L1cc
            r2.setCrashUrl(r8)     // Catch: java.lang.Exception -> L1cc
        L1b2:
            java.lang.String r8 = com.beizi.fusion.model.GlobalConfig.objectToJson(r1)     // Catch: java.lang.Exception -> L1cc
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L1cc
            if (r1 != 0) goto L1cc
            android.content.Context r1 = r7.a     // Catch: java.lang.Exception -> L1cc
            java.lang.String r2 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Exception -> L1cc
            java.lang.String r8 = com.beizi.fusion.tool.b.a(r2, r8)     // Catch: java.lang.Exception -> L1cc
            com.beizi.fusion.tool.an.a(r1, r0, r8)     // Catch: java.lang.Exception -> L1cc
            return
        L1ca:
            r7.b = r2     // Catch: java.lang.Exception -> L1cc
        L1cc:
            return
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }
}
