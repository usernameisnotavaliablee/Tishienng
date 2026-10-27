package com.github.barteksc.pdfviewer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class DragPinchManager implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.ScaleGestureDetector.OnScaleGestureListener, android.view.View.OnTouchListener {
    private com.github.barteksc.pdfviewer.AnimationManager animationManager;
    private boolean enabled;
    private android.view.GestureDetector gestureDetector;
    private com.github.barteksc.pdfviewer.PDFView pdfView;
    private android.view.ScaleGestureDetector scaleGestureDetector;
    private boolean scaling;
    private boolean scrolling;

    DragPinchManager(com.github.barteksc.pdfviewer.PDFView r2, com.github.barteksc.pdfviewer.AnimationManager r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.scrolling = r0
            r1.scaling = r0
            r1.enabled = r0
            r1.pdfView = r2
            r1.animationManager = r3
            android.view.GestureDetector r3 = new android.view.GestureDetector
            android.content.Context r0 = r2.getContext()
            r3.<init>(r0, r1)
            r1.gestureDetector = r3
            android.view.ScaleGestureDetector r3 = new android.view.ScaleGestureDetector
            android.content.Context r0 = r2.getContext()
            r3.<init>(r0, r1)
            r1.scaleGestureDetector = r3
            r2.setOnTouchListener(r1)
            return
    }

    private boolean checkDoPageFling(float r4, float r5) {
            r3 = this;
            float r4 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            boolean r0 = r0.isSwipeVertical()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L17
            return r2
        L17:
            return r1
        L18:
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1d
            return r2
        L1d:
            return r1
    }

    private boolean checkLinkTapped(float r18, float r19) {
            r17 = this;
            r0 = r17
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r2 = r1.pdfFile
            r9 = 0
            if (r2 != 0) goto La
            return r9
        La:
            float r1 = r1.getCurrentXOffset()
            float r1 = -r1
            float r13 = r1 + r18
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            float r1 = r1.getCurrentYOffset()
            float r1 = -r1
            float r14 = r1 + r19
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            boolean r1 = r1.isSwipeVertical()
            if (r1 == 0) goto L24
            r1 = r14
            goto L25
        L24:
            r1 = r13
        L25:
            com.github.barteksc.pdfviewer.PDFView r3 = r0.pdfView
            float r3 = r3.getZoom()
            int r3 = r2.getPageAtOffset(r1, r3)
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            float r1 = r1.getZoom()
            com.shockwave.pdfium.util.SizeF r1 = r2.getScaledPageSize(r3, r1)
            com.github.barteksc.pdfviewer.PDFView r4 = r0.pdfView
            boolean r4 = r4.isSwipeVertical()
            if (r4 == 0) goto L58
            com.github.barteksc.pdfviewer.PDFView r4 = r0.pdfView
            float r4 = r4.getZoom()
            float r4 = r2.getSecondaryPageOffset(r3, r4)
            int r4 = (int) r4
            com.github.barteksc.pdfviewer.PDFView r5 = r0.pdfView
            float r5 = r5.getZoom()
            float r5 = r2.getPageOffset(r3, r5)
            int r5 = (int) r5
            goto L6e
        L58:
            com.github.barteksc.pdfviewer.PDFView r4 = r0.pdfView
            float r4 = r4.getZoom()
            float r4 = r2.getSecondaryPageOffset(r3, r4)
            int r5 = (int) r4
            com.github.barteksc.pdfviewer.PDFView r4 = r0.pdfView
            float r4 = r4.getZoom()
            float r4 = r2.getPageOffset(r3, r4)
            int r4 = (int) r4
        L6e:
            java.util.List r6 = r2.getPageLinks(r3)
            java.util.Iterator r10 = r6.iterator()
        L76:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto Lb1
            java.lang.Object r6 = r10.next()
            r16 = r6
            com.shockwave.pdfium.PdfDocument$Link r16 = (com.shockwave.pdfium.PdfDocument.Link) r16
            float r6 = r1.b()
            int r6 = (int) r6
            float r7 = r1.a()
            int r7 = (int) r7
            android.graphics.RectF r8 = r16.a()
            android.graphics.RectF r15 = r2.mapRectToDevice(r3, r4, r5, r6, r7, r8)
            r15.sort()
            boolean r6 = r15.contains(r13, r14)
            if (r6 == 0) goto L76
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            com.github.barteksc.pdfviewer.listener.Callbacks r1 = r1.callbacks
            com.github.barteksc.pdfviewer.model.LinkTapEvent r10 = new com.github.barteksc.pdfviewer.model.LinkTapEvent
            r11 = r18
            r12 = r19
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.callLinkHandler(r10)
            r1 = 1
            return r1
        Lb1:
            return r9
    }

    private void hideHandle() {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r0 = r0.getScrollHandle()
            if (r0 == 0) goto L11
            boolean r1 = r0.shown()
            if (r1 == 0) goto L11
            r0.hideDelayed()
        L11:
            return
    }

    private void onBoundedFling(float r12, float r13) {
            r11 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            float r0 = r0.getCurrentXOffset()
            int r2 = (int) r0
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            float r0 = r0.getCurrentYOffset()
            int r3 = (int) r0
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            com.github.barteksc.pdfviewer.PdfFile r1 = r0.pdfFile
            int r0 = r0.getCurrentPage()
            com.github.barteksc.pdfviewer.PDFView r4 = r11.pdfView
            float r4 = r4.getZoom()
            float r0 = r1.getPageOffset(r0, r4)
            float r0 = -r0
            com.github.barteksc.pdfviewer.PDFView r4 = r11.pdfView
            int r4 = r4.getCurrentPage()
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            float r5 = r5.getZoom()
            float r4 = r1.getPageLength(r4, r5)
            float r4 = r0 - r4
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            boolean r5 = r5.isSwipeVertical()
            r6 = 0
            if (r5 == 0) goto L5a
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            float r1 = r1.getMaxPageWidth()
            float r1 = r5.toCurrentScale(r1)
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = -r1
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r4 = r4 + r5
            r6 = r0
            r0 = 0
            goto L78
        L5a:
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 + r5
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            float r1 = r1.getMaxPageHeight()
            float r1 = r5.toCurrentScale(r1)
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = -r1
            r10 = r4
            r4 = r1
            r1 = r10
        L78:
            com.github.barteksc.pdfviewer.AnimationManager r5 = r11.animationManager
            int r12 = (int) r12
            int r13 = (int) r13
            int r1 = (int) r1
            int r7 = (int) r0
            int r8 = (int) r4
            int r9 = (int) r6
            r4 = r12
            r6 = r1
            r1 = r5
            r5 = r13
            r1.startFlingAnimation(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void onScrollEnd(android.view.MotionEvent r1) {
            r0 = this;
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            r1.loadPages()
            r0.hideHandle()
            com.github.barteksc.pdfviewer.AnimationManager r1 = r0.animationManager
            boolean r1 = r1.isFlinging()
            if (r1 != 0) goto L15
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            r1.performPageSnap()
        L15:
            return
    }

    private void startPageFling(android.view.MotionEvent r5, android.view.MotionEvent r6, float r7, float r8) {
            r4 = this;
            boolean r0 = r4.checkDoPageFling(r7, r8)
            if (r0 != 0) goto L7
            return
        L7:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.pdfView
            boolean r0 = r0.isSwipeVertical()
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L19
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 <= 0) goto L17
            goto L1d
        L17:
            r1 = 1
            goto L1d
        L19:
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L17
        L1d:
            com.github.barteksc.pdfviewer.PDFView r7 = r4.pdfView
            boolean r7 = r7.isSwipeVertical()
            if (r7 == 0) goto L2f
            float r6 = r6.getY()
            float r5 = r5.getY()
        L2d:
            float r6 = r6 - r5
            goto L38
        L2f:
            float r6 = r6.getX()
            float r5 = r5.getX()
            goto L2d
        L38:
            com.github.barteksc.pdfviewer.PDFView r5 = r4.pdfView
            float r5 = r5.getCurrentXOffset()
            com.github.barteksc.pdfviewer.PDFView r7 = r4.pdfView
            float r7 = r7.getZoom()
            float r7 = r7 * r6
            float r5 = r5 - r7
            com.github.barteksc.pdfviewer.PDFView r7 = r4.pdfView
            float r7 = r7.getCurrentYOffset()
            com.github.barteksc.pdfviewer.PDFView r8 = r4.pdfView
            float r8 = r8.getZoom()
            float r6 = r6 * r8
            float r7 = r7 - r6
            com.github.barteksc.pdfviewer.PDFView r6 = r4.pdfView
            int r5 = r6.findFocusPage(r5, r7)
            com.github.barteksc.pdfviewer.PDFView r6 = r4.pdfView
            int r6 = r6.getPageCount()
            int r6 = r6 - r3
            int r5 = r5 + r1
            int r5 = java.lang.Math.min(r6, r5)
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            com.github.barteksc.pdfviewer.PDFView r6 = r4.pdfView
            com.github.barteksc.pdfviewer.util.SnapEdge r6 = r6.findSnapEdge(r5)
            com.github.barteksc.pdfviewer.PDFView r7 = r4.pdfView
            float r5 = r7.snapOffsetForPage(r5, r6)
            com.github.barteksc.pdfviewer.AnimationManager r6 = r4.animationManager
            float r5 = -r5
            r6.startPageFlingAnimation(r5)
            return
    }

    void disable() {
            r1 = this;
            r0 = 0
            r1.enabled = r0
            return
    }

    void disableLongpress() {
            r2 = this;
            android.view.GestureDetector r0 = r2.gestureDetector
            r1 = 0
            r0.setIsLongpressEnabled(r1)
            return
    }

    void enable() {
            r1 = this;
            r0 = 1
            r1.enabled = r0
            return
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent r4) {
            r3 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            boolean r0 = r0.isDoubletapEnabled()
            if (r0 != 0) goto La
            r4 = 0
            return r4
        La:
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            float r0 = r0.getZoom()
            com.github.barteksc.pdfviewer.PDFView r1 = r3.pdfView
            float r1 = r1.getMidZoom()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2e
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            float r1 = r4.getX()
            float r4 = r4.getY()
            com.github.barteksc.pdfviewer.PDFView r2 = r3.pdfView
            float r2 = r2.getMidZoom()
            r0.zoomWithAnimation(r1, r4, r2)
            goto L57
        L2e:
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            float r0 = r0.getZoom()
            com.github.barteksc.pdfviewer.PDFView r1 = r3.pdfView
            float r1 = r1.getMaxZoom()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L52
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            float r1 = r4.getX()
            float r4 = r4.getY()
            com.github.barteksc.pdfviewer.PDFView r2 = r3.pdfView
            float r2 = r2.getMaxZoom()
            r0.zoomWithAnimation(r1, r4, r2)
            goto L57
        L52:
            com.github.barteksc.pdfviewer.PDFView r4 = r3.pdfView
            r4.resetZoomWithAnimation()
        L57:
            r4 = 1
            return r4
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent r1) {
            r0 = this;
            com.github.barteksc.pdfviewer.AnimationManager r1 = r0.animationManager
            r1.stopFling()
            r1 = 1
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent r12, android.view.MotionEvent r13, float r14, float r15) {
            r11 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            boolean r0 = r0.isSwipeEnabled()
            if (r0 != 0) goto La
            r12 = 0
            return r12
        La:
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            boolean r0 = r0.isPageFlingEnabled()
            r1 = 1
            if (r0 == 0) goto L23
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            boolean r0 = r0.pageFillsScreen()
            if (r0 == 0) goto L1f
            r11.onBoundedFling(r14, r15)
            goto L22
        L1f:
            r11.startPageFling(r12, r13, r14, r15)
        L22:
            return r1
        L23:
            com.github.barteksc.pdfviewer.PDFView r12 = r11.pdfView
            float r12 = r12.getCurrentXOffset()
            int r3 = (int) r12
            com.github.barteksc.pdfviewer.PDFView r12 = r11.pdfView
            float r12 = r12.getCurrentYOffset()
            int r4 = (int) r12
            com.github.barteksc.pdfviewer.PDFView r12 = r11.pdfView
            com.github.barteksc.pdfviewer.PdfFile r13 = r12.pdfFile
            boolean r12 = r12.isSwipeVertical()
            if (r12 == 0) goto L62
            com.github.barteksc.pdfviewer.PDFView r12 = r11.pdfView
            float r0 = r13.getMaxPageWidth()
            float r12 = r12.toCurrentScale(r0)
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r12 = r12 - r0
            float r12 = -r12
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            float r0 = r0.getZoom()
            float r13 = r13.getDocLen(r0)
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            int r0 = r0.getHeight()
        L5e:
            float r0 = (float) r0
            float r13 = r13 - r0
            float r13 = -r13
            goto L86
        L62:
            com.github.barteksc.pdfviewer.PDFView r12 = r11.pdfView
            float r12 = r12.getZoom()
            float r12 = r13.getDocLen(r12)
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r12 = r12 - r0
            float r12 = -r12
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            float r13 = r13.getMaxPageHeight()
            float r13 = r0.toCurrentScale(r13)
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            int r0 = r0.getHeight()
            goto L5e
        L86:
            com.github.barteksc.pdfviewer.AnimationManager r2 = r11.animationManager
            int r5 = (int) r14
            int r6 = (int) r15
            int r7 = (int) r12
            int r9 = (int) r13
            r10 = 0
            r8 = 0
            r2.startFlingAnimation(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
            r0.callOnLongPress(r2)
            return
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector r6) {
            r5 = this;
            float r0 = r6.getScaleFactor()
            com.github.barteksc.pdfviewer.PDFView r1 = r5.pdfView
            float r1 = r1.getZoom()
            float r1 = r1 * r0
            float r2 = com.github.barteksc.pdfviewer.util.Constants.Pinch.MINIMUM_ZOOM
            com.github.barteksc.pdfviewer.PDFView r3 = r5.pdfView
            float r3 = r3.getMinZoom()
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = com.github.barteksc.pdfviewer.util.Constants.Pinch.MAXIMUM_ZOOM
            com.github.barteksc.pdfviewer.PDFView r4 = r5.pdfView
            float r4 = r4.getMaxZoom()
            float r3 = java.lang.Math.min(r3, r4)
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 >= 0) goto L31
            com.github.barteksc.pdfviewer.PDFView r0 = r5.pdfView
            float r0 = r0.getZoom()
            float r0 = r2 / r0
            goto L3d
        L31:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3d
            com.github.barteksc.pdfviewer.PDFView r0 = r5.pdfView
            float r0 = r0.getZoom()
            float r0 = r3 / r0
        L3d:
            com.github.barteksc.pdfviewer.PDFView r1 = r5.pdfView
            android.graphics.PointF r2 = new android.graphics.PointF
            float r3 = r6.getFocusX()
            float r6 = r6.getFocusY()
            r2.<init>(r3, r6)
            r1.zoomCenteredRelativeTo(r0, r2)
            r6 = 1
            return r6
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector r1) {
            r0 = this;
            r1 = 1
            r0.scaling = r1
            return r1
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector r1) {
            r0 = this;
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            r1.loadPages()
            r0.hideHandle()
            r1 = 0
            r0.scaling = r1
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
            r0 = this;
            r1 = 1
            r0.scrolling = r1
            com.github.barteksc.pdfviewer.PDFView r2 = r0.pdfView
            boolean r2 = r2.isZooming()
            if (r2 != 0) goto L13
            com.github.barteksc.pdfviewer.PDFView r2 = r0.pdfView
            boolean r2 = r2.isSwipeEnabled()
            if (r2 == 0) goto L1a
        L13:
            com.github.barteksc.pdfviewer.PDFView r2 = r0.pdfView
            float r3 = -r3
            float r4 = -r4
            r2.moveRelativeTo(r3, r4)
        L1a:
            boolean r2 = r0.scaling
            if (r2 == 0) goto L26
            com.github.barteksc.pdfviewer.PDFView r2 = r0.pdfView
            boolean r2 = r2.doRenderDuringScale()
            if (r2 == 0) goto L2b
        L26:
            com.github.barteksc.pdfviewer.PDFView r2 = r0.pdfView
            r2.loadPageByOffset()
        L2b:
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent r3) {
            r2 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            com.github.barteksc.pdfviewer.listener.Callbacks r0 = r0.callbacks
            boolean r0 = r0.callOnTap(r3)
            float r1 = r3.getX()
            float r3 = r3.getY()
            boolean r3 = r2.checkLinkTapped(r1, r3)
            if (r0 != 0) goto L35
            if (r3 != 0) goto L35
            com.github.barteksc.pdfviewer.PDFView r3 = r2.pdfView
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r3 = r3.getScrollHandle()
            if (r3 == 0) goto L35
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            boolean r0 = r0.documentFitsView()
            if (r0 != 0) goto L35
            boolean r0 = r3.shown()
            if (r0 != 0) goto L32
            r3.show()
            goto L35
        L32:
            r3.hide()
        L35:
            com.github.barteksc.pdfviewer.PDFView r3 = r2.pdfView
            r3.performClick()
            r3 = 1
            return r3
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
            r3 = this;
            boolean r4 = r3.enabled
            r0 = 0
            if (r4 != 0) goto L6
            return r0
        L6:
            android.view.ScaleGestureDetector r4 = r3.scaleGestureDetector
            boolean r4 = r4.onTouchEvent(r5)
            android.view.GestureDetector r1 = r3.gestureDetector
            boolean r1 = r1.onTouchEvent(r5)
            r2 = 1
            if (r1 != 0) goto L1a
            if (r4 == 0) goto L18
            goto L1a
        L18:
            r4 = 0
            goto L1b
        L1a:
            r4 = 1
        L1b:
            int r1 = r5.getAction()
            if (r1 != r2) goto L2a
            boolean r1 = r3.scrolling
            if (r1 == 0) goto L2a
            r3.scrolling = r0
            r3.onScrollEnd(r5)
        L2a:
            return r4
    }
}
