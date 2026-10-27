package com.umeng.commonsdk.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMModuleRegister {
    public static final java.lang.String ANALYTICS = "analytics";
    public static final java.lang.String APPSTATUS = "appstatus";
    private static final int APPSTATUS_SWITCH_HIGH = 37136;
    private static final int APPSTATUS_SWITCH_LOW = 37121;
    public static final java.lang.String INNER = "internal";
    private static final int INNER_EVENT_VALUE_HIGH = 36864;
    private static final int INNER_EVENT_VALUE_LOW = 32769;
    public static final java.lang.String PROCESS = "process";
    private static final int PROCESS_EVENT_VALUE_HIGH = 37120;
    private static final int PROCESS_EVENT_VALUE_LOW = 36945;
    public static final java.lang.String PUSH = "push";
    private static final int PUSH_EVENT_VALUE_HIGH = 20480;
    private static final int PUSH_EVENT_VALUE_LOW = 16385;
    public static final java.lang.String SHARE = "share";
    private static final int SHARE_EVENT_VALUE_HIGH = 28672;
    private static final int SHARE_EVENT_VALUE_LOW = 24577;
    private static android.content.Context mModuleAppContext;
    private static java.util.HashMap<java.lang.String, com.umeng.commonsdk.framework.UMLogDataProtocol> mModuleMap;

    static {
            return
    }

    public UMModuleRegister() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String eventType2ModuleName(int r2) {
            r0 = 16385(0x4001, float:2.296E-41)
            if (r2 < r0) goto Lb
            r0 = 20480(0x5000, float:2.8699E-41)
            if (r2 > r0) goto Lb
            java.lang.String r0 = "push"
            goto Ld
        Lb:
            java.lang.String r0 = "analytics"
        Ld:
            r1 = 24577(0x6001, float:3.444E-41)
            if (r2 < r1) goto L17
            r1 = 28672(0x7000, float:4.0178E-41)
            if (r2 > r1) goto L17
            java.lang.String r0 = "share"
        L17:
            r1 = 32769(0x8001, float:4.5919E-41)
            if (r2 < r1) goto L23
            r1 = 36864(0x9000, float:5.1657E-41)
            if (r2 > r1) goto L23
            java.lang.String r0 = "internal"
        L23:
            r1 = 36945(0x9051, float:5.1771E-41)
            if (r2 < r1) goto L2f
            r1 = 37120(0x9100, float:5.2016E-41)
            if (r2 > r1) goto L2f
            java.lang.String r0 = "process"
        L2f:
            r1 = 37121(0x9101, float:5.2018E-41)
            if (r2 < r1) goto L3c
            r1 = 37136(0x9110, float:5.2039E-41)
            if (r2 > r1) goto L3c
            java.lang.String r2 = "appstatus"
            return r2
        L3c:
            return r0
    }

    public static android.content.Context getAppContext() {
            android.content.Context r0 = com.umeng.commonsdk.framework.UMModuleRegister.mModuleAppContext
            return r0
    }

    public static com.umeng.commonsdk.framework.UMLogDataProtocol getCallbackFromModuleName(java.lang.String r1) {
            java.util.HashMap<java.lang.String, com.umeng.commonsdk.framework.UMLogDataProtocol> r0 = com.umeng.commonsdk.framework.UMModuleRegister.mModuleMap
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, com.umeng.commonsdk.framework.UMLogDataProtocol> r0 = com.umeng.commonsdk.framework.UMModuleRegister.mModuleMap
            java.lang.Object r1 = r0.get(r1)
            com.umeng.commonsdk.framework.UMLogDataProtocol r1 = (com.umeng.commonsdk.framework.UMLogDataProtocol) r1
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static void registerAppContext(android.content.Context r1) {
            android.content.Context r0 = com.umeng.commonsdk.framework.UMModuleRegister.mModuleAppContext
            if (r0 != 0) goto Le
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.commonsdk.framework.UMModuleRegister.mModuleAppContext = r1
        Le:
            return
    }

    public static boolean registerCallback(int r1, com.umeng.commonsdk.framework.UMLogDataProtocol r2) {
            java.util.HashMap<java.lang.String, com.umeng.commonsdk.framework.UMLogDataProtocol> r0 = com.umeng.commonsdk.framework.UMModuleRegister.mModuleMap
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.framework.UMModuleRegister.mModuleMap = r0
        Lb:
            java.lang.String r1 = eventType2ModuleName(r1)
            java.util.HashMap<java.lang.String, com.umeng.commonsdk.framework.UMLogDataProtocol> r0 = com.umeng.commonsdk.framework.UMModuleRegister.mModuleMap
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1c
            java.util.HashMap<java.lang.String, com.umeng.commonsdk.framework.UMLogDataProtocol> r0 = com.umeng.commonsdk.framework.UMModuleRegister.mModuleMap
            r0.put(r1, r2)
        L1c:
            r1 = 1
            return r1
    }
}
