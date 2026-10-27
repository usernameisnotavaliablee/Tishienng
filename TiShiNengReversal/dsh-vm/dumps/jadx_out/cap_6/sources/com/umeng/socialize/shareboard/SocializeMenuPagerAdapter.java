package com.umeng.socialize.shareboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class SocializeMenuPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    private android.content.Context mContext;
    private com.umeng.socialize.shareboard.ShareBoardMenuHelper mMenuHelper;
    private java.util.List<com.umeng.socialize.shareboard.SnsPlatform[][]> mPageData;

    public SocializeMenuPagerAdapter(android.content.Context r2, com.umeng.socialize.shareboard.ShareBoardConfig r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SocializeMenuPagerAdapter(android.content.Context r2, com.umeng.socialize.shareboard.ShareBoardConfig r3, java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPageData = r0
            r1.mContext = r2
            com.umeng.socialize.shareboard.ShareBoardMenuHelper r2 = new com.umeng.socialize.shareboard.ShareBoardMenuHelper
            r2.<init>(r3)
            r1.mMenuHelper = r2
            r1.setData(r4)
            return
    }

    public void destroyItem(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
            r0 = this;
            android.view.View r3 = (android.view.View) r3
            r1.removeView(r3)
            return
    }

    public int getCount() {
            r1 = this;
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform[][]> r0 = r1.mPageData
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public java.lang.Object instantiateItem(android.view.ViewGroup r4, int r5) {
            r3 = this;
            com.umeng.socialize.shareboard.ShareBoardMenuHelper r0 = r3.mMenuHelper
            android.content.Context r1 = r3.mContext
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform[][]> r2 = r3.mPageData
            java.lang.Object r5 = r2.get(r5)
            com.umeng.socialize.shareboard.SnsPlatform[][] r5 = (com.umeng.socialize.shareboard.SnsPlatform[][]) r5
            android.view.View r5 = r0.createPageLayout(r1, r5)
            r4.addView(r5)
            return r5
    }

    public boolean isViewFromObject(android.view.View r1, java.lang.Object r2) {
            r0 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public void setData(java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r3) {
            r2 = this;
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform[][]> r0 = r2.mPageData
            r0.clear()
            if (r3 == 0) goto L12
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform[][]> r0 = r2.mPageData
            com.umeng.socialize.shareboard.ShareBoardMenuHelper r1 = r2.mMenuHelper
            java.util.List r3 = r1.formatPageData(r3)
            r0.addAll(r3)
        L12:
            r2.notifyDataSetChanged()
            return
    }
}
