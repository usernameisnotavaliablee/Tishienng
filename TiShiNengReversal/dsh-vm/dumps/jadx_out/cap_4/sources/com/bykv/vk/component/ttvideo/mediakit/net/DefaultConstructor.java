package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class DefaultConstructor implements com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor {
    public DefaultConstructor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor
    public com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS createDns(java.lang.String r2, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r3, int r4, android.os.Handler r5) {
            r1 = this;
            com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS r0 = new com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS     // Catch: java.lang.Exception -> L6
            r0.<init>(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L6
            return r0
        L6:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }
}
