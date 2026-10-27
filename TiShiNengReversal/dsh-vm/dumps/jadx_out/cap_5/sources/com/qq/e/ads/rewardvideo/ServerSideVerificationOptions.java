package com.qq.e.ads.rewardvideo;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ServerSideVerificationOptions {
    public static final java.lang.String ACTION = "rewardAction";
    public static final java.lang.String TRANS_ID = "transId";
    private java.lang.String a;
    private java.lang.String b;
    private final org.json.JSONObject c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.qq.e.ads.rewardvideo.ServerSideVerificationOptions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.lang.String a;
        private java.lang.String b;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.String a(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.Builder r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ java.lang.String b(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.Builder r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        public com.qq.e.ads.rewardvideo.ServerSideVerificationOptions build() {
                r2 = this;
                com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r0 = new com.qq.e.ads.rewardvideo.ServerSideVerificationOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.Builder setCustomData(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.Builder setUserId(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }
    }

    private ServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.Builder r2) {
            r1 = this;
            r1.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.c = r0
            java.lang.String r0 = com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.Builder.a(r2)
            r1.a = r0
            java.lang.String r2 = com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.Builder.b(r2)
            r1.b = r2
            return
    }

    /* synthetic */ ServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.Builder r1, com.qq.e.ads.rewardvideo.ServerSideVerificationOptions.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public org.json.JSONObject getOptions() {
            r1 = this;
            org.json.JSONObject r0 = r1.c
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
