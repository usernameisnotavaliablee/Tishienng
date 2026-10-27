package com.bytedance.pangle.flipped;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt implements com.bytedance.pangle.flipped.cw {
    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.pangle.flipped.cw
    @android.annotation.SuppressLint({"DiscouragedPrivateApi"})
    public void invokeHiddenApiRestrictions() {
            r9 = this;
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "v1"
            java.lang.String r2 = "zeus_stage_flipped"
            r0.saveRecord(r2, r1)
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "getDeclaredMethod"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L67
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L67
            java.lang.Class<java.lang.Class[]> r5 = java.lang.Class[].class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Exception -> L67
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r4)     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = "dalvik.system.VMRuntime"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L67
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L67
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L67
            java.lang.String r8 = "getRuntime"
            r5[r6] = r8     // Catch: java.lang.Exception -> L67
            r5[r7] = r4     // Catch: java.lang.Exception -> L67
            java.lang.Object r4 = r0.invoke(r1, r5)     // Catch: java.lang.Exception -> L67
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Exception -> L67
            r4.setAccessible(r7)     // Catch: java.lang.Exception -> L67
            r5 = 0
            java.lang.Object r4 = r4.invoke(r5, r5)     // Catch: java.lang.Exception -> L67
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L67
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r5[r6] = r8     // Catch: java.lang.Exception -> L67
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L67
            java.lang.String r8 = "setHiddenApiExemptions"
            r3[r6] = r8     // Catch: java.lang.Exception -> L67
            r3[r7] = r5     // Catch: java.lang.Exception -> L67
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L67
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L67
            r0.setAccessible(r7)     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = "L"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Exception -> L67
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L67
            r3[r6] = r1     // Catch: java.lang.Exception -> L67
            r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L67
            return
        L67:
            r0 = move-exception
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r1 = r1.getReporter()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "V1 invokeHiddenApiRestrictions fail: "
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
            java.lang.String r1 = "FlippedV1Impl"
            com.bytedance.sdk.openadsdk.api.m.up(r1, r0)
            return
    }
}
