package com.bytedance.dutexplorer;

@com.bytedance.component.sdk.annotation.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tmapcloak {
    static int DexNum;
    public static boolean loadLibSuccess;

    static {
            int r0 = com.bytedance.dutexplorer.tmapcloak.DexNum     // Catch: java.lang.Exception -> Ld
            if (r0 <= 0) goto L9
            java.lang.String r0 = "maparmor"
            com.bytedance.sdk.openadsdk.l.m.j(r0)     // Catch: java.lang.Exception -> Ld
        L9:
            r0 = 1
            com.bytedance.dutexplorer.tmapcloak.loadLibSuccess = r0     // Catch: java.lang.Exception -> Ld
            return
        Ld:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public tmapcloak() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native byte bob_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static native char cob_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static native double dob_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static native float fob_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static native int iob_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static native long job_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static native java.lang.Object obj_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static void setaccessible(java.lang.reflect.Constructor r1) {
            r0 = 1
            r1.setAccessible(r0)
            return
    }

    public static void setaccessible(java.lang.reflect.Field r1) {
            r0 = 1
            r1.setAccessible(r0)
            return
    }

    public static void setaccessible(java.lang.reflect.Method r1) {
            r0 = 1
            r1.setAccessible(r0)
            return
    }

    public static java.lang.Object setaccessibleobj(java.lang.Class r2) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            r0 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r0)
            r1 = 1
            r2.setAccessible(r1)
            java.lang.Object r2 = r2.newInstance(r0)
            return r2
    }

    public static native short sob_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static native void voi_bytedance_call(int r0, int r1, java.lang.Object... r2);

    public static native boolean zob_bytedance_call(int r0, int r1, java.lang.Object... r2);
}
