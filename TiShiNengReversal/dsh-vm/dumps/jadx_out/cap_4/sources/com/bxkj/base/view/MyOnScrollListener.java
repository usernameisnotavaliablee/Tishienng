package com.bxkj.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyOnScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    public MyOnScrollListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r1, int r2) {
            r0 = this;
            super.onScrollStateChanged(r1, r2)
            if (r2 != 0) goto L8
            r1.removeOnScrollListener(r0)
        L8:
            return
    }
}
