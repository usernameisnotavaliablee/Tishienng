package com.umeng.tunnel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMChannelAgent {
    private static final java.lang.String TAG = "UMChannelAgent";
    private static final java.lang.String UMENG_VCHANNEL = "com.umeng.commonsdk.vchannel.Sender";
    private static boolean vChannelReady;

    static {
            java.lang.String r0 = "com.umeng.commonsdk.vchannel.Sender"
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L8
            r0 = 1
            com.umeng.tunnel.UMChannelAgent.vChannelReady = r0     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public UMChannelAgent() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean init() {
            boolean r0 = com.umeng.tunnel.UMChannelAgent.vChannelReady
            return r0
    }

    public static void onDebugEvent(android.content.Context r0, java.lang.String r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            reflectOnEvent(r0, r1, r2)
            return
    }

    private static void reflectOnEvent(android.content.Context r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
            java.lang.String r0 = "com.umeng.commonsdk.vchannel.Sender"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "onEvent"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            r7 = 2
            r3[r7] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2a
            r1[r5] = r8     // Catch: java.lang.Throwable -> L2a
            r1[r6] = r9     // Catch: java.lang.Throwable -> L2a
            r1[r7] = r10     // Catch: java.lang.Throwable -> L2a
            r8 = 0
            r0.invoke(r8, r1)     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    private static void reflectSetCustomHeader(java.util.Map<java.lang.String, java.lang.String> r6) {
            java.lang.String r0 = "com.umeng.commonsdk.vchannel.Sender"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "setCustomHeader"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            r1[r5] = r6     // Catch: java.lang.Throwable -> L1c
            r6 = 0
            r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }

    public static void setCustomHeader(java.util.Map<java.lang.String, java.lang.String> r0) {
            reflectSetCustomHeader(r0)
            return
    }
}
