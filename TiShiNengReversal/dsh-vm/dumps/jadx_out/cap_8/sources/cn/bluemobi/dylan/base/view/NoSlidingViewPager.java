package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NoSlidingViewPager extends androidx.viewpager.widget.ViewPager {
    private boolean isCanScroll;

    public NoSlidingViewPager(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.isCanScroll = r1
            return
    }

    public NoSlidingViewPager(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.isCanScroll = r1
            return
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.isCanScroll
            if (r0 == 0) goto L9
            boolean r2 = super.onInterceptTouchEvent(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.isCanScroll
            if (r0 == 0) goto L9
            boolean r2 = super.onTouchEvent(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void scrollTo(int r1, int r2) {
            r0 = this;
            super/*android.view.ViewGroup*/.scrollTo(r1, r2)
            return
    }

    public void setCurrentItem(int r1) {
            r0 = this;
            super.setCurrentItem(r1)
            return
    }

    public void setCurrentItem(int r1, boolean r2) {
            r0 = this;
            super.setCurrentItem(r1, r2)
            return
    }

    public void setScanScroll(boolean r1) {
            r0 = this;
            r0.isCanScroll = r1
            return
    }
}
