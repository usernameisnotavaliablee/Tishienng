package cn.jiguang.api.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JCollectionAuth {
    public JCollectionAuth() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void enableAppTerminate(android.content.Context r7, boolean r8) {
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r2 = 0
            r3 = 119(0x77, float:1.67E-43)
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void enableAutoWakeup(android.content.Context r7, boolean r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action: enableAutoWakeup: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCollectAuth"
            cn.jiguang.w.f.e(r1, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r2 = 0
            r3 = 109(0x6d, float:1.53E-43)
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public static void enableDynamicLoad(android.content.Context r7, boolean r8) {
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r2 = 0
            r3 = 115(0x73, float:1.61E-43)
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public static void setAuth(android.content.Context r7, boolean r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:setAuth: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCollectionAuth"
            cn.jiguang.w.f.e(r1, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r2 = 0
            r3 = 96
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }
}
