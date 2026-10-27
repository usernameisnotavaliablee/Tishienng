package com.github.barteksc.pdfviewer.listener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Callbacks {
    private com.github.barteksc.pdfviewer.link.LinkHandler linkHandler;
    private com.github.barteksc.pdfviewer.listener.OnDrawListener onDrawAllListener;
    private com.github.barteksc.pdfviewer.listener.OnDrawListener onDrawListener;
    private com.github.barteksc.pdfviewer.listener.OnErrorListener onErrorListener;
    private com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener onLoadCompleteListener;
    private com.github.barteksc.pdfviewer.listener.OnLongPressListener onLongPressListener;
    private com.github.barteksc.pdfviewer.listener.OnPageChangeListener onPageChangeListener;
    private com.github.barteksc.pdfviewer.listener.OnPageErrorListener onPageErrorListener;
    private com.github.barteksc.pdfviewer.listener.OnPageScrollListener onPageScrollListener;
    private com.github.barteksc.pdfviewer.listener.OnRenderListener onRenderListener;
    private com.github.barteksc.pdfviewer.listener.OnTapListener onTapListener;

    public Callbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    public void callLinkHandler(com.github.barteksc.pdfviewer.model.LinkTapEvent r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.link.LinkHandler r0 = r1.linkHandler
            if (r0 == 0) goto L7
            r0.handleLinkEvent(r2)
        L7:
            return
    }

    public void callOnLoadComplete(int r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener r0 = r1.onLoadCompleteListener
            if (r0 == 0) goto L7
            r0.loadComplete(r2)
        L7:
            return
    }

    public void callOnLongPress(android.view.MotionEvent r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnLongPressListener r0 = r1.onLongPressListener
            if (r0 == 0) goto L7
            r0.onLongPress(r2)
        L7:
            return
    }

    public void callOnPageChange(int r2, int r3) {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnPageChangeListener r0 = r1.onPageChangeListener
            if (r0 == 0) goto L7
            r0.onPageChanged(r2, r3)
        L7:
            return
    }

    public boolean callOnPageError(int r2, java.lang.Throwable r3) {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnPageErrorListener r0 = r1.onPageErrorListener
            if (r0 == 0) goto L9
            r0.onPageError(r2, r3)
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void callOnPageScroll(int r2, float r3) {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnPageScrollListener r0 = r1.onPageScrollListener
            if (r0 == 0) goto L7
            r0.onPageScrolled(r2, r3)
        L7:
            return
    }

    public void callOnRender(int r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnRenderListener r0 = r1.onRenderListener
            if (r0 == 0) goto L7
            r0.onInitiallyRendered(r2)
        L7:
            return
    }

    public boolean callOnTap(android.view.MotionEvent r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnTapListener r0 = r1.onTapListener
            if (r0 == 0) goto Lc
            boolean r2 = r0.onTap(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public com.github.barteksc.pdfviewer.listener.OnDrawListener getOnDraw() {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnDrawListener r0 = r1.onDrawListener
            return r0
    }

    public com.github.barteksc.pdfviewer.listener.OnDrawListener getOnDrawAll() {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnDrawListener r0 = r1.onDrawAllListener
            return r0
    }

    public com.github.barteksc.pdfviewer.listener.OnErrorListener getOnError() {
            r1 = this;
            com.github.barteksc.pdfviewer.listener.OnErrorListener r0 = r1.onErrorListener
            return r0
    }

    public void setLinkHandler(com.github.barteksc.pdfviewer.link.LinkHandler r1) {
            r0 = this;
            r0.linkHandler = r1
            return
    }

    public void setOnDraw(com.github.barteksc.pdfviewer.listener.OnDrawListener r1) {
            r0 = this;
            r0.onDrawListener = r1
            return
    }

    public void setOnDrawAll(com.github.barteksc.pdfviewer.listener.OnDrawListener r1) {
            r0 = this;
            r0.onDrawAllListener = r1
            return
    }

    public void setOnError(com.github.barteksc.pdfviewer.listener.OnErrorListener r1) {
            r0 = this;
            r0.onErrorListener = r1
            return
    }

    public void setOnLoadComplete(com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener r1) {
            r0 = this;
            r0.onLoadCompleteListener = r1
            return
    }

    public void setOnLongPress(com.github.barteksc.pdfviewer.listener.OnLongPressListener r1) {
            r0 = this;
            r0.onLongPressListener = r1
            return
    }

    public void setOnPageChange(com.github.barteksc.pdfviewer.listener.OnPageChangeListener r1) {
            r0 = this;
            r0.onPageChangeListener = r1
            return
    }

    public void setOnPageError(com.github.barteksc.pdfviewer.listener.OnPageErrorListener r1) {
            r0 = this;
            r0.onPageErrorListener = r1
            return
    }

    public void setOnPageScroll(com.github.barteksc.pdfviewer.listener.OnPageScrollListener r1) {
            r0 = this;
            r0.onPageScrollListener = r1
            return
    }

    public void setOnRender(com.github.barteksc.pdfviewer.listener.OnRenderListener r1) {
            r0 = this;
            r0.onRenderListener = r1
            return
    }

    public void setOnTap(com.github.barteksc.pdfviewer.listener.OnTapListener r1) {
            r0 = this;
            r0.onTapListener = r1
            return
    }
}
