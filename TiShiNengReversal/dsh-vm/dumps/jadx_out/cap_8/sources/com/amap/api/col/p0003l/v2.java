package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v2 {
    private static boolean a;

    static {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/framework/amap.jar"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            com.amap.api.col.p0003l.v2.a = r0
            return
    }

    public v2() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static android.content.res.AssetManager b(android.content.Context r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            android.content.res.AssetManager r6 = r6.getAssets()
            boolean r0 = com.amap.api.col.p0003l.v2.a
            if (r0 == 0) goto L30
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "addAssetPath"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L28
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "/system/framework/amap.jar"
            r1[r5] = r2     // Catch: java.lang.Throwable -> L28
            r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L28
            return r6
        L28:
            r0 = move-exception
            java.lang.String r1 = "ResourcesUtil"
            java.lang.String r2 = "getSelfAssets"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
        L30:
            return r6
    }
}
