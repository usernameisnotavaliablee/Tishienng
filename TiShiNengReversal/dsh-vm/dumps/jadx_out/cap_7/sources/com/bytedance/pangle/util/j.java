package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.bytedance.pangle.activity.IPluginActivity r3, android.app.Activity r4) {
            java.lang.String r0 = "mTheme"
            r1 = 0
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r0, r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "mThemeResource"
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L25
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r0, r2)     // Catch: java.lang.Exception -> L25
            int[] r4 = j(r4)     // Catch: java.lang.Exception -> L25
            if (r4 != 0) goto L17
            goto L24
        L17:
            int r0 = r4.length     // Catch: java.lang.Exception -> L25
        L18:
            if (r1 >= r0) goto L24
            r2 = r4[r1]     // Catch: java.lang.Exception -> L25
            if (r2 == 0) goto L21
            r3.setProxyTheme2Plugin(r2)     // Catch: java.lang.Exception -> L25
        L21:
            int r1 = r1 + 1
            goto L18
        L24:
            return
        L25:
            r3 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r3)
            return
    }

    public static void j(com.bytedance.pangle.wrapper.j r3, android.app.Activity r4) {
            java.lang.String r0 = "mTheme"
            r1 = 0
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r0, r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "mThemeResource"
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L25
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r0, r2)     // Catch: java.lang.Exception -> L25
            int[] r4 = j(r4)     // Catch: java.lang.Exception -> L25
            if (r4 != 0) goto L17
            goto L24
        L17:
            int r0 = r4.length     // Catch: java.lang.Exception -> L25
        L18:
            if (r1 >= r0) goto L24
            r2 = r4[r1]     // Catch: java.lang.Exception -> L25
            if (r2 == 0) goto L21
            r3.setWrapperActivityTheme(r2)     // Catch: java.lang.Exception -> L25
        L21:
            int r1 = r1 + 1
            goto L18
        L24:
            return
        L25:
            r3 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r3)
            return
    }

    private static int[] j(android.app.Activity r6) {
            java.lang.String r0 = "Zeus/activity_pangle"
            android.content.res.Resources$Theme r6 = r6.getTheme()
            r1 = 0
            if (r6 != 0) goto La
            return r1
        La:
            boolean r2 = com.bytedance.pangle.util.g.qv()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "mResId"
            java.lang.String r4 = "getKey"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r2 = "mThemeImpl"
            java.lang.Object r6 = com.bytedance.pangle.util.FieldUtils.readField(r6, r2)     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L1e
            return r1
        L1e:
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r6, r4, r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r2 == 0) goto L2f
            java.lang.Object r2 = com.bytedance.pangle.util.FieldUtils.readField(r2, r3)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            int[] r2 = (int[]) r2     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            return r2
        L2d:
            r6 = move-exception
            goto La0
        L2f:
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r2 = com.bytedance.pangle.xt.xt.j.j(r2, r4, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r2.invoke(r6, r1)     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L45
            java.lang.String r6 = "getKey failed!"
            com.bytedance.pangle.log.ZeusLogger.d(r0, r6)     // Catch: java.lang.Throwable -> L2d
            return r1
        L45:
            java.lang.String r2 = "getKey success by doubleReflector!"
            com.bytedance.pangle.log.ZeusLogger.d(r0, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Field r2 = com.bytedance.pangle.xt.xt.j.j(r2, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Throwable -> L2d
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L2d
            return r6
        L59:
            boolean r2 = com.bytedance.pangle.util.g.xt()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L6f
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r6, r4, r2)     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L68
            return r1
        L68:
            java.lang.Object r6 = com.bytedance.pangle.util.FieldUtils.readField(r6, r3)     // Catch: java.lang.Throwable -> L2d
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L2d
            return r6
        L6f:
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r6, r4, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L7a
            return r1
        L7a:
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "!"
            java.lang.String r3 = ""
            java.lang.String r6 = r6.replace(r2, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = " "
            java.lang.String[] r6 = r6.split(r2)     // Catch: java.lang.Throwable -> L2d
            int r2 = r6.length     // Catch: java.lang.Throwable -> L2d
            int[] r2 = new int[r2]     // Catch: java.lang.Throwable -> L2d
        L8f:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L2d
            if (r5 >= r3) goto L9f
            r3 = r6[r5]     // Catch: java.lang.Throwable -> L2d
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)     // Catch: java.lang.Throwable -> L2d
            r2[r5] = r3     // Catch: java.lang.Throwable -> L2d
            int r5 = r5 + 1
            goto L8f
        L9f:
            return r2
        La0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getKey exception!"
            r2.<init>(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.bytedance.pangle.log.ZeusLogger.d(r0, r6)
            return r1
    }
}
