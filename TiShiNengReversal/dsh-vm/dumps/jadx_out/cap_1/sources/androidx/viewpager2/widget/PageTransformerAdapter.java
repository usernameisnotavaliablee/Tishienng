package androidx.viewpager2.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PageTransformerAdapter extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    private final androidx.recyclerview.widget.LinearLayoutManager mLayoutManager;
    private androidx.viewpager2.widget.ViewPager2.PageTransformer mPageTransformer;

    PageTransformerAdapter(androidx.recyclerview.widget.LinearLayoutManager r1) {
            r0 = this;
            r0.<init>()
            r0.mLayoutManager = r1
            return
    }

    androidx.viewpager2.widget.ViewPager2.PageTransformer getPageTransformer() {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$PageTransformer r0 = r1.mPageTransformer
            return r0
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int r5, float r6, int r7) {
            r4 = this;
            androidx.viewpager2.widget.ViewPager2$PageTransformer r7 = r4.mPageTransformer
            if (r7 != 0) goto L5
            goto L4d
        L5:
            float r6 = -r6
            r7 = 0
            r0 = 0
        L8:
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.mLayoutManager
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L4d
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.mLayoutManager
            android.view.View r1 = r1.getChildAt(r0)
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.LinearLayoutManager r2 = r4.mLayoutManager
            int r2 = r2.getPosition(r1)
            int r2 = r2 - r5
            float r2 = (float) r2
            float r2 = r2 + r6
            androidx.viewpager2.widget.ViewPager2$PageTransformer r3 = r4.mPageTransformer
            r3.transformPage(r1, r2)
            int r0 = r0 + 1
            goto L8
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.mLayoutManager
            int r1 = r1.getChildCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r7] = r0
            r7 = 1
            r2[r7] = r1
            java.lang.String r7 = "LayoutManager returned a null child at pos %d/%d while transforming pages"
            java.lang.String r6 = java.lang.String.format(r6, r7, r2)
            r5.<init>(r6)
            throw r5
        L4d:
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int r1) {
            r0 = this;
            return
    }

    void setPageTransformer(@androidx.annotation.Nullable androidx.viewpager2.widget.ViewPager2.PageTransformer r1) {
            r0 = this;
            r0.mPageTransformer = r1
            return
    }
}
