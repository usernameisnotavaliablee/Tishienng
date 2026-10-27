package com.bytedance.adsdk.lottie.cw;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.adsdk.lottie.cw.m {
    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.lottie.cw.m
    public com.bytedance.adsdk.lottie.cw.r j(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            java.net.URLConnection r2 = r0.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            java.lang.String r0 = "GET"
            r2.setRequestMethod(r0)
            r2.connect()
            com.bytedance.adsdk.lottie.cw.j r0 = new com.bytedance.adsdk.lottie.cw.j
            r0.<init>(r2)
            return r0
    }
}
