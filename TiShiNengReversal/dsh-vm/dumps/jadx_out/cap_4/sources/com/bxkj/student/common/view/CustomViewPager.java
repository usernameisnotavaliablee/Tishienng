package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CustomViewPager extends androidx.viewpager.widget.ViewPager {
    private boolean isPagingEnabled;

    public CustomViewPager(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.isPagingEnabled = r1
            return
    }

    public CustomViewPager(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.isPagingEnabled = r1
            return
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.isPagingEnabled
            if (r0 == 0) goto Lc
            boolean r2 = super.onInterceptTouchEvent(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.isPagingEnabled
            if (r0 == 0) goto Lc
            boolean r2 = super.onTouchEvent(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public void setPagingEnabled(boolean r1) {
            r0 = this;
            r0.isPagingEnabled = r1
            return
    }
}
