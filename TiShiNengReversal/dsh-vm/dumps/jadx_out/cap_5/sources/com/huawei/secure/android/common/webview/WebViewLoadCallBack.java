package com.huawei.secure.android.common.webview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface WebViewLoadCallBack {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ErrorCode extends java.lang.Enum<com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode> {
        private static final /* synthetic */ com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode[] $VALUES = null;
        public static final com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode HTTP_URL = null;
        public static final com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode OTHER = null;
        public static final com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode URL_NOT_IN_WHITE_LIST = null;

        static {
                com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r0 = new com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode
                java.lang.String r1 = "HTTP_URL"
                r2 = 0
                r0.<init>(r1, r2)
                com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.HTTP_URL = r0
                com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r1 = new com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode
                java.lang.String r3 = "URL_NOT_IN_WHITE_LIST"
                r4 = 1
                r1.<init>(r3, r4)
                com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.URL_NOT_IN_WHITE_LIST = r1
                com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r3 = new com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode
                java.lang.String r5 = "OTHER"
                r6 = 2
                r3.<init>(r5, r6)
                com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.OTHER = r3
                r5 = 3
                com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode[] r5 = new com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.$VALUES = r5
                return
        }

        ErrorCode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode> r0 = com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r1 = (com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode) r1
                return r1
        }

        public static com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode[] values() {
                com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode[] r0 = com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode[] r0 = (com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode[]) r0
                return r0
        }
    }

    void a(java.lang.String r1, com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode r2);
}
