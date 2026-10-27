package com.umeng.commonsdk.stateless;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMSLEnvelopeBuild {
    private static final java.lang.String TAG = "UMSLEnvelopeBuild";
    private static boolean isEncryptEnabled;
    public static android.content.Context mContext;
    public static java.lang.String module;


    public UMSLEnvelopeBuild() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isReadyBuildNew(android.content.Context r0, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r1) {
            r0 = 0
            return r0
    }

    public static void setEncryptEnabled(boolean r0) {
            com.umeng.commonsdk.stateless.UMSLEnvelopeBuild.isEncryptEnabled = r0
            return
    }

    public org.json.JSONObject buildSLBaseHeader(android.content.Context r2) {
            r1 = this;
            com.umeng.commonsdk.stateless.UMSLEnvelopeBuild$1 r0 = new com.umeng.commonsdk.stateless.UMSLEnvelopeBuild$1
            r0.<init>(r1, r2)
            r0.start()
            r2 = 0
            return r2
    }

    public org.json.JSONObject buildSLEnvelope(android.content.Context r1, org.json.JSONObject r2, org.json.JSONObject r3, java.lang.String r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
