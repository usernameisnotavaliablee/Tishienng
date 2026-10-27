package com.tencent.mm.opensdk.modelmsg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WXAppLaunchData {
    public static final java.lang.String ACTION_HANDLE_WXAPPLAUNCH = ".ACTION_HANDLE_WXAPPLAUNCH";
    public static final java.lang.String ACTION_HANDLE_WXAPP_RESULT = ".ACTION_HANDLE_WXAPP_RESULT";
    public static final java.lang.String ACTION_HANDLE_WXAPP_SHOW = ".ACTION_HANDLE_WXAPP_SHOW";
    public int launchType;
    public java.lang.String message;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.tencent.mm.opensdk.modelmsg.WXAppLaunchData fromBundle(android.os.Bundle r2) {
                com.tencent.mm.opensdk.modelmsg.WXAppLaunchData r0 = new com.tencent.mm.opensdk.modelmsg.WXAppLaunchData
                r0.<init>()
                java.lang.String r1 = "_wxapplaunchdata_launchType"
                int r1 = r2.getInt(r1)
                r0.launchType = r1
                java.lang.String r1 = "_wxapplaunchdata_message"
                java.lang.String r2 = r2.getString(r1)
                r0.message = r2
                return r0
        }

        public static android.os.Bundle toBundle(com.tencent.mm.opensdk.modelmsg.WXAppLaunchData r3) {
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                int r1 = r3.launchType
                java.lang.String r2 = "_wxapplaunchdata_launchType"
                r0.putInt(r2, r1)
                java.lang.String r3 = r3.message
                java.lang.String r1 = "_wxapplaunchdata_message"
                r0.putString(r1, r3)
                return r0
        }
    }

    public WXAppLaunchData() {
            r0 = this;
            r0.<init>()
            return
    }
}
