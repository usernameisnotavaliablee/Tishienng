package com.autonavi.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MsgProcessor {
    private static com.amap.api.col.p0003l.z5 mDelegate;

    static {
            com.amap.api.col.3l.z5 r0 = new com.amap.api.col.3l.z5
            r0.<init>()
            com.autonavi.amap.mapcore.MsgProcessor.mDelegate = r0
            return
    }

    public MsgProcessor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native int nativeInit(android.content.Context r0);

    public static void nativeInitInfo(android.content.Context r7, boolean r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12) {
            com.amap.api.col.3l.z5 r0 = com.autonavi.amap.mapcore.MsgProcessor.mDelegate
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.a(r1, r2, r3, r4, r5, r6)
            nativeInit(r1)
            return
    }

    public static void nativeMsgProcessor(java.lang.String r1, java.lang.String r2) {
            com.amap.api.col.3l.z5 r0 = com.autonavi.amap.mapcore.MsgProcessor.mDelegate
            r0.b(r1, r2)
            return
    }
}
