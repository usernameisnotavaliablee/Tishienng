package com.baidu.idl.main.facesdk.statistic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PostDeviceInfo {


    public PostDeviceInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void uploadDeviceInfo(android.content.Context r1, com.baidu.idl.main.facesdk.callback.Callback r2) {
            com.baidu.idl.main.facesdk.statistic.PostDeviceInfo$1 r0 = new com.baidu.idl.main.facesdk.statistic.PostDeviceInfo$1
            r0.<init>(r1, r2)
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r0)
            r1.start()
            return
    }
}
