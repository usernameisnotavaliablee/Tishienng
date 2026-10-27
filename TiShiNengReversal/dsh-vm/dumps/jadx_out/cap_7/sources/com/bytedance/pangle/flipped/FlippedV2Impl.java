package com.bytedance.pangle.flipped;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class FlippedV2Impl implements com.bytedance.pangle.flipped.cw {
    private static final java.lang.String TAG = "FlippedV2Impl";

    static {
            java.lang.String r0 = "pangleflipped"
            com.bytedance.sdk.openadsdk.l.m.j(r0)
            return
    }

    public FlippedV2Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private native java.lang.reflect.Method getDeclaredMethod(java.lang.Object r1, java.lang.String r2, java.lang.Class<?>[] r3);

    @Override // com.bytedance.pangle.flipped.cw
    public void invokeHiddenApiRestrictions() {
            r8 = this;
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "v2"
            java.lang.String r2 = "zeus_stage_flipped"
            r0.saveRecord(r2, r1)
            java.lang.String r0 = "dalvik.system.VMRuntime"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "getRuntime"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L44
            java.lang.reflect.Method r1 = r8.getDeclaredMethod(r0, r1, r4)     // Catch: java.lang.Exception -> L44
            r4 = 1
            r1.setAccessible(r4)     // Catch: java.lang.Exception -> L44
            r5 = 0
            java.lang.Object r1 = r1.invoke(r5, r5)     // Catch: java.lang.Exception -> L44
            java.lang.String r5 = "setHiddenApiExemptions"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L44
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r6[r3] = r7     // Catch: java.lang.Exception -> L44
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r0, r5, r6)     // Catch: java.lang.Exception -> L44
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r5 = "L"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Exception -> L44
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L44
            r4[r3] = r5     // Catch: java.lang.Exception -> L44
            r0.invoke(r1, r4)     // Catch: java.lang.Exception -> L44
            return
        L44:
            r0 = move-exception
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r1 = r1.getReporter()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "V2 invokeHiddenApiRestrictions fail: "
            r3.<init>(r4)
            java.lang.String r5 = android.util.Log.getStackTraceString(r0)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.saveRecord(r2, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FlippedV2Impl"
            com.bytedance.sdk.openadsdk.api.m.up(r1, r0)
            return
    }
}
