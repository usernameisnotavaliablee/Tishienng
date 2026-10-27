package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ProviderRemoteView extends android.widget.LinearLayout {
    public ProviderRemoteView(android.content.Context r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public ProviderRemoteView(android.content.Context r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.a(r2, r3)
            return
    }

    private void a(boolean r1, boolean r2) {
            r0 = this;
            if (r1 == 0) goto L10
            android.content.Context r1 = r0.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.huawei.hms.scankit.R.layout.scankit_zxl_capture_customed
            r1.inflate(r2, r0)
            return
        L10:
            if (r2 == 0) goto L20
            android.content.Context r1 = r0.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.huawei.hms.scankit.R.layout.scankit_zxl_capture
            r1.inflate(r2, r0)
            return
        L20:
            android.content.Context r1 = r0.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.huawei.hms.scankit.R.layout.scankit_zxl_capture_new
            r1.inflate(r2, r0)
            return
    }
}
