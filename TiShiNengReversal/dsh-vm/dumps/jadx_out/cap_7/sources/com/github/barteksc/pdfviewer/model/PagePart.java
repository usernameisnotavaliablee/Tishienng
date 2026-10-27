package com.github.barteksc.pdfviewer.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PagePart {
    private int cacheOrder;
    private int page;
    private android.graphics.RectF pageRelativeBounds;
    private android.graphics.Bitmap renderedBitmap;
    private boolean thumbnail;

    public PagePart(int r1, android.graphics.Bitmap r2, android.graphics.RectF r3, boolean r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.page = r1
            r0.renderedBitmap = r2
            r0.pageRelativeBounds = r3
            r0.thumbnail = r4
            r0.cacheOrder = r5
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.github.barteksc.pdfviewer.model.PagePart
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.github.barteksc.pdfviewer.model.PagePart r4 = (com.github.barteksc.pdfviewer.model.PagePart) r4
            int r0 = r4.getPage()
            int r2 = r3.page
            if (r0 != r2) goto L4a
            android.graphics.RectF r0 = r4.getPageRelativeBounds()
            float r0 = r0.left
            android.graphics.RectF r2 = r3.pageRelativeBounds
            float r2 = r2.left
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.graphics.RectF r0 = r4.getPageRelativeBounds()
            float r0 = r0.right
            android.graphics.RectF r2 = r3.pageRelativeBounds
            float r2 = r2.right
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.graphics.RectF r0 = r4.getPageRelativeBounds()
            float r0 = r0.top
            android.graphics.RectF r2 = r3.pageRelativeBounds
            float r2 = r2.top
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.graphics.RectF r4 = r4.getPageRelativeBounds()
            float r4 = r4.bottom
            android.graphics.RectF r0 = r3.pageRelativeBounds
            float r0 = r0.bottom
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L4a
            r4 = 1
            return r4
        L4a:
            return r1
    }

    public int getCacheOrder() {
            r1 = this;
            int r0 = r1.cacheOrder
            return r0
    }

    public int getPage() {
            r1 = this;
            int r0 = r1.page
            return r0
    }

    public android.graphics.RectF getPageRelativeBounds() {
            r1 = this;
            android.graphics.RectF r0 = r1.pageRelativeBounds
            return r0
    }

    public android.graphics.Bitmap getRenderedBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.renderedBitmap
            return r0
    }

    public boolean isThumbnail() {
            r1 = this;
            boolean r0 = r1.thumbnail
            return r0
    }

    public void setCacheOrder(int r1) {
            r0 = this;
            r0.cacheOrder = r1
            return
    }
}
