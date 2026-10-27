package com.bxkj.place.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyRecyclerViewOnScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {

    /* renamed from: t, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f686t;

    public MyRecyclerViewOnScrollListener(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.<init>()
            r0.f686t = r1
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

    public void onScrolled(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            super.onScrolled(r1, r2, r3)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f686t
            r1.scrollBy(r2, r3)
            return
    }
}
