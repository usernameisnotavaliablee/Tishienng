package com.github.barteksc.pdfviewer.scroll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class DefaultScrollHandle extends android.widget.RelativeLayout implements com.github.barteksc.pdfviewer.scroll.ScrollHandle {
    private static final int DEFAULT_TEXT_SIZE = 16;
    private static final int HANDLE_LONG = 65;
    private static final int HANDLE_SHORT = 40;
    protected android.content.Context context;
    private float currentPos;
    private android.os.Handler handler;
    private java.lang.Runnable hidePageScrollerRunnable;
    private boolean inverted;
    private com.github.barteksc.pdfviewer.PDFView pdfView;
    private float relativeHandlerMiddle;
    protected android.widget.TextView textView;


    public DefaultScrollHandle(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultScrollHandle(android.content.Context r2, boolean r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.relativeHandlerMiddle = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.handler = r0
            com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle$1 r0 = new com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle$1
            r0.<init>(r1)
            r1.hidePageScrollerRunnable = r0
            r1.context = r2
            r1.inverted = r3
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r2)
            r1.textView = r3
            r2 = 4
            r1.setVisibility(r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setTextColor(r2)
            r2 = 16
            r1.setTextSize(r2)
            return
    }

    private void calculateMiddle() {
            r4 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r4.pdfView
            boolean r0 = r0.isSwipeVertical()
            if (r0 == 0) goto L19
            float r0 = r4.getY()
            int r1 = r4.getHeight()
            float r1 = (float) r1
            com.github.barteksc.pdfviewer.PDFView r2 = r4.pdfView
            int r2 = r2.getHeight()
        L17:
            float r2 = (float) r2
            goto L29
        L19:
            float r0 = r4.getX()
            int r1 = r4.getWidth()
            float r1 = (float) r1
            com.github.barteksc.pdfviewer.PDFView r2 = r4.pdfView
            int r2 = r2.getWidth()
            goto L17
        L29:
            float r3 = r4.relativeHandlerMiddle
            float r0 = r0 + r3
            float r0 = r0 / r2
            float r0 = r0 * r1
            r4.relativeHandlerMiddle = r0
            return
    }

    private boolean isPDFViewReady() {
            r1 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            if (r0 == 0) goto L14
            int r0 = r0.getPageCount()
            if (r0 <= 0) goto L14
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            boolean r0 = r0.documentFitsView()
            if (r0 != 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    private void setPosition(float r4) {
            r3 = this;
            boolean r0 = java.lang.Float.isInfinite(r4)
            if (r0 != 0) goto L5b
            boolean r0 = java.lang.Float.isNaN(r4)
            if (r0 == 0) goto Ld
            goto L5b
        Ld:
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            boolean r0 = r0.isSwipeVertical()
            if (r0 == 0) goto L1d
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            int r0 = r0.getHeight()
        L1b:
            float r0 = (float) r0
            goto L24
        L1d:
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            int r0 = r0.getWidth()
            goto L1b
        L24:
            float r1 = r3.relativeHandlerMiddle
            float r4 = r4 - r1
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r4 = 0
            goto L46
        L2e:
            android.content.Context r1 = r3.context
            r2 = 40
            int r1 = com.github.barteksc.pdfviewer.util.Util.getDP(r1, r2)
            float r1 = (float) r1
            float r1 = r0 - r1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L46
            android.content.Context r4 = r3.context
            int r4 = com.github.barteksc.pdfviewer.util.Util.getDP(r4, r2)
            float r4 = (float) r4
            float r4 = r0 - r4
        L46:
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            boolean r0 = r0.isSwipeVertical()
            if (r0 == 0) goto L52
            r3.setY(r4)
            goto L55
        L52:
            r3.setX(r4)
        L55:
            r3.calculateMiddle()
            r3.invalidate()
        L5b:
            return
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void destroyLayout() {
            r1 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            r0.removeView(r1)
            return
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void hide() {
            r1 = this;
            r0 = 4
            r1.setVisibility(r0)
            return
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void hideDelayed() {
            r4 = this;
            android.os.Handler r0 = r4.handler
            java.lang.Runnable r1 = r4.hidePageScrollerRunnable
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            boolean r0 = r4.isPDFViewReady()
            if (r0 != 0) goto Lb
            boolean r5 = super.onTouchEvent(r5)
            return r5
        Lb:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L25
            r2 = 2
            if (r0 == r2) goto L59
            r2 = 3
            if (r0 == r2) goto L25
            r2 = 5
            if (r0 == r2) goto L2e
            r2 = 6
            if (r0 == r2) goto L25
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L25:
            r4.hideDelayed()
            com.github.barteksc.pdfviewer.PDFView r5 = r4.pdfView
            r5.performPageSnap()
            return r1
        L2e:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.pdfView
            r0.stopFling()
            android.os.Handler r0 = r4.handler
            java.lang.Runnable r2 = r4.hidePageScrollerRunnable
            r0.removeCallbacks(r2)
            com.github.barteksc.pdfviewer.PDFView r0 = r4.pdfView
            boolean r0 = r0.isSwipeVertical()
            if (r0 == 0) goto L4e
            float r0 = r5.getRawY()
            float r2 = r4.getY()
            float r0 = r0 - r2
            r4.currentPos = r0
            goto L59
        L4e:
            float r0 = r5.getRawX()
            float r2 = r4.getX()
            float r0 = r0 - r2
            r4.currentPos = r0
        L59:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.pdfView
            boolean r0 = r0.isSwipeVertical()
            r2 = 0
            if (r0 == 0) goto L7d
            float r5 = r5.getRawY()
            float r0 = r4.currentPos
            float r5 = r5 - r0
            float r0 = r4.relativeHandlerMiddle
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.pdfView
            float r0 = r4.relativeHandlerMiddle
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.setPositionOffset(r0, r2)
            goto L97
        L7d:
            float r5 = r5.getRawX()
            float r0 = r4.currentPos
            float r5 = r5 - r0
            float r0 = r4.relativeHandlerMiddle
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.pdfView
            float r0 = r4.relativeHandlerMiddle
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.setPositionOffset(r0, r2)
        L97:
            return r1
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void setPageNum(int r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.widget.TextView r0 = r1.textView
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L15
            android.widget.TextView r0 = r1.textView
            r0.setText(r2)
        L15:
            return
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void setScroll(float r3) {
            r2 = this;
            boolean r0 = r2.shown()
            if (r0 != 0) goto La
            r2.show()
            goto L11
        La:
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.hidePageScrollerRunnable
            r0.removeCallbacks(r1)
        L11:
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            if (r0 == 0) goto L2e
            boolean r0 = r0.isSwipeVertical()
            if (r0 == 0) goto L22
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            int r0 = r0.getHeight()
            goto L28
        L22:
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            int r0 = r0.getWidth()
        L28:
            float r0 = (float) r0
            float r0 = r0 * r3
            r2.setPosition(r0)
        L2e:
            return
    }

    public void setTextColor(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setTextColor(r2)
            return
    }

    public void setTextSize(int r3) {
            r2 = this;
            android.widget.TextView r0 = r2.textView
            r1 = 1
            float r3 = (float) r3
            r0.setTextSize(r1, r3)
            return
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void setupLayout(com.github.barteksc.pdfviewer.PDFView r6) {
            r5 = this;
            boolean r0 = r6.isSwipeVertical()
            r1 = 40
            r2 = 65
            if (r0 == 0) goto L28
            boolean r0 = r5.inverted
            if (r0 == 0) goto L1d
            android.content.Context r0 = r5.context
            int r3 = com.github.barteksc.pdfviewer.R.drawable.default_scroll_handle_left
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r3)
            r3 = 9
        L18:
            r1 = 65
            r2 = 40
            goto L41
        L1d:
            android.content.Context r0 = r5.context
            int r3 = com.github.barteksc.pdfviewer.R.drawable.default_scroll_handle_right
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r3)
            r3 = 11
            goto L18
        L28:
            boolean r0 = r5.inverted
            if (r0 == 0) goto L37
            android.content.Context r0 = r5.context
            int r3 = com.github.barteksc.pdfviewer.R.drawable.default_scroll_handle_top
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r3)
            r3 = 10
            goto L41
        L37:
            android.content.Context r0 = r5.context
            int r3 = com.github.barteksc.pdfviewer.R.drawable.default_scroll_handle_bottom
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r3)
            r3 = 12
        L41:
            r5.setBackground(r0)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            android.content.Context r4 = r5.context
            int r1 = com.github.barteksc.pdfviewer.util.Util.getDP(r4, r1)
            android.content.Context r4 = r5.context
            int r2 = com.github.barteksc.pdfviewer.util.Util.getDP(r4, r2)
            r0.<init>(r1, r2)
            r1 = 0
            r0.setMargins(r1, r1, r1, r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r2 = 13
            r4 = -1
            r1.addRule(r2, r4)
            android.widget.TextView r2 = r5.textView
            r5.addView(r2, r1)
            r0.addRule(r3)
            r6.addView(r5, r0)
            r5.pdfView = r6
            return
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void show() {
            r1 = this;
            r0 = 0
            r1.setVisibility(r0)
            return
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public boolean shown() {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
