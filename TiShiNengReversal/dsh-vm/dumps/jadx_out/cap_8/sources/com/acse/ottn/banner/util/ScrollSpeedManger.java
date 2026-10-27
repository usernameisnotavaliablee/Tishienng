package com.acse.ottn.banner.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ScrollSpeedManger extends androidx.recyclerview.widget.LinearLayoutManager {
    public com.acse.ottn.banner.Banner a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends androidx.recyclerview.widget.LinearSmoothScroller {
        public final /* synthetic */ com.acse.ottn.banner.util.ScrollSpeedManger a;

        public a(com.acse.ottn.banner.util.ScrollSpeedManger r1, android.content.Context r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        public int calculateTimeForDeceleration(int r1) {
                r0 = this;
                com.acse.ottn.banner.util.ScrollSpeedManger r1 = r0.a
                com.acse.ottn.banner.Banner r1 = com.acse.ottn.banner.util.ScrollSpeedManger.a(r1)
                int r1 = r1.getScrollTime()
                return r1
        }
    }

    public ScrollSpeedManger(com.acse.ottn.banner.Banner r3, androidx.recyclerview.widget.LinearLayoutManager r4) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            int r4 = r4.getOrientation()
            r1 = 0
            r2.<init>(r0, r4, r1)
            r2.a = r3
            return
    }

    public static /* synthetic */ com.acse.ottn.banner.Banner a(com.acse.ottn.banner.util.ScrollSpeedManger r0) {
            com.acse.ottn.banner.Banner r0 = r0.a
            return r0
    }

    public static void a(com.acse.ottn.banner.Banner r6) {
            java.lang.String r0 = "mLayoutManager"
            java.lang.Class<androidx.viewpager2.widget.ViewPager2> r1 = androidx.viewpager2.widget.ViewPager2.class
            int r2 = r6.getScrollTime()
            r3 = 100
            if (r2 >= r3) goto Ld
            goto L6f
        Ld:
            androidx.viewpager2.widget.ViewPager2 r2 = r6.getViewPager2()     // Catch: java.lang.Exception -> L6f
            r3 = 0
            android.view.View r3 = r2.getChildAt(r3)     // Catch: java.lang.Exception -> L6f
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3     // Catch: java.lang.Exception -> L6f
            r4 = 2
            r3.setOverScrollMode(r4)     // Catch: java.lang.Exception -> L6f
            com.acse.ottn.banner.util.ScrollSpeedManger r4 = new com.acse.ottn.banner.util.ScrollSpeedManger     // Catch: java.lang.Exception -> L6f
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r3.getLayoutManager()     // Catch: java.lang.Exception -> L6f
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5     // Catch: java.lang.Exception -> L6f
            r4.<init>(r6, r5)     // Catch: java.lang.Exception -> L6f
            r3.setLayoutManager(r4)     // Catch: java.lang.Exception -> L6f
            java.lang.reflect.Field r6 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> L6f
            r3 = 1
            r6.setAccessible(r3)     // Catch: java.lang.Exception -> L6f
            r6.set(r2, r4)     // Catch: java.lang.Exception -> L6f
            java.lang.String r6 = "mPageTransformerAdapter"
            java.lang.reflect.Field r6 = r1.getDeclaredField(r6)     // Catch: java.lang.Exception -> L6f
            r6.setAccessible(r3)     // Catch: java.lang.Exception -> L6f
            java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.Exception -> L6f
            if (r6 == 0) goto L52
            java.lang.Class r5 = r6.getClass()     // Catch: java.lang.Exception -> L6f
            java.lang.reflect.Field r5 = r5.getDeclaredField(r0)     // Catch: java.lang.Exception -> L6f
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L6f
            r5.set(r6, r4)     // Catch: java.lang.Exception -> L6f
        L52:
            java.lang.String r6 = "mScrollEventAdapter"
            java.lang.reflect.Field r6 = r1.getDeclaredField(r6)     // Catch: java.lang.Exception -> L6f
            r6.setAccessible(r3)     // Catch: java.lang.Exception -> L6f
            java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.Exception -> L6f
            if (r6 == 0) goto L6f
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L6f
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> L6f
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L6f
            r0.set(r6, r4)     // Catch: java.lang.Exception -> L6f
        L6f:
            return
    }

    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            com.acse.ottn.banner.util.ScrollSpeedManger$a r2 = new com.acse.ottn.banner.util.ScrollSpeedManger$a
            android.content.Context r1 = r1.getContext()
            r2.<init>(r0, r1)
            r2.setTargetPosition(r3)
            r0.startSmoothScroll(r2)
            return
    }
}
