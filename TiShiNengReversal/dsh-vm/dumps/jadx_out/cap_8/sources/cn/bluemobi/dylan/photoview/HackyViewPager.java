package cn.bluemobi.dylan.photoview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HackyViewPager extends androidx.viewpager.widget.ViewPager {

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f147i = "HackyViewPager";

    public HackyViewPager(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public HackyViewPager(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            r0 = 0
            boolean r2 = super.onInterceptTouchEvent(r2)     // Catch: java.lang.Throwable -> L6
            return r2
        L6:
            return r0
    }
}
