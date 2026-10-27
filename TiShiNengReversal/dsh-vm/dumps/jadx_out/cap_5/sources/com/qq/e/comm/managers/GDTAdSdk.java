package com.qq.e.comm.managers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class GDTAdSdk {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnStartListener {
        void onStartFailed(java.lang.Exception r1);

        void onStartSuccess();
    }

    public GDTAdSdk() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.qq.e.comm.managers.IGDTAdManager getGDTAdManger() {
            com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.b()
            return r0
    }

    @java.lang.Deprecated
    public static void init(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "该方法已被废弃，请尽快切换初始化接口为GDTAdSdk#initWithoutStart、GDTAdSdk#start，详见接入文档或咨询技术支持。"
            com.qq.e.comm.util.GDTLogger.w(r0)
            com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.b()
            r1 = 1
            r0.b(r2, r3, r1)
            return
    }

    public static void initWithoutStart(android.content.Context r2, java.lang.String r3) {
            com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.b()
            r1 = 0
            r0.b(r2, r3, r1)
            return
    }

    public static void start(com.qq.e.comm.managers.GDTAdSdk.OnStartListener r1) {
            com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.b()
            r0.a(r1)
            return
    }
}
