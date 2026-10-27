package com.github.barteksc.pdfviewer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class RenderingHandler extends android.os.Handler {
    static final int MSG_RENDER_TASK = 1;
    private static final java.lang.String TAG = "com.github.barteksc.pdfviewer.RenderingHandler";
    private com.github.barteksc.pdfviewer.PDFView pdfView;
    private android.graphics.RectF renderBounds;
    private android.graphics.Matrix renderMatrix;
    private android.graphics.Rect roundedRenderBounds;
    private boolean running;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class RenderingTask {
        boolean annotationRendering;
        boolean bestQuality;
        android.graphics.RectF bounds;
        int cacheOrder;
        float height;
        int page;
        final /* synthetic */ com.github.barteksc.pdfviewer.RenderingHandler this$0;
        boolean thumbnail;
        float width;

        RenderingTask(com.github.barteksc.pdfviewer.RenderingHandler r1, float r2, float r3, android.graphics.RectF r4, int r5, boolean r6, int r7, boolean r8, boolean r9) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.page = r5
                r0.width = r2
                r0.height = r3
                r0.bounds = r4
                r0.thumbnail = r6
                r0.cacheOrder = r7
                r0.bestQuality = r8
                r0.annotationRendering = r9
                return
        }
    }

    static {
            return
    }

    RenderingHandler(android.os.Looper r1, com.github.barteksc.pdfviewer.PDFView r2) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.renderBounds = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.roundedRenderBounds = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.renderMatrix = r1
            r1 = 0
            r0.running = r1
            r0.pdfView = r2
            return
    }

    static /* synthetic */ com.github.barteksc.pdfviewer.PDFView access$000(com.github.barteksc.pdfviewer.RenderingHandler r0) {
            com.github.barteksc.pdfviewer.PDFView r0 = r0.pdfView
            return r0
    }

    private void calculateBounds(int r4, int r5, android.graphics.RectF r6) {
            r3 = this;
            android.graphics.Matrix r0 = r3.renderMatrix
            r0.reset()
            android.graphics.Matrix r0 = r3.renderMatrix
            float r1 = r6.left
            float r1 = -r1
            float r4 = (float) r4
            float r1 = r1 * r4
            float r2 = r6.top
            float r2 = -r2
            float r5 = (float) r5
            float r2 = r2 * r5
            r0.postTranslate(r1, r2)
            android.graphics.Matrix r0 = r3.renderMatrix
            float r1 = r6.width()
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2 / r1
            float r6 = r6.height()
            float r2 = r2 / r6
            r0.postScale(r1, r2)
            android.graphics.RectF r6 = r3.renderBounds
            r0 = 0
            r6.set(r0, r0, r4, r5)
            android.graphics.Matrix r4 = r3.renderMatrix
            android.graphics.RectF r5 = r3.renderBounds
            r4.mapRect(r5)
            android.graphics.RectF r4 = r3.renderBounds
            android.graphics.Rect r5 = r3.roundedRenderBounds
            r4.round(r5)
            return
    }

    private com.github.barteksc.pdfviewer.model.PagePart proceed(com.github.barteksc.pdfviewer.RenderingHandler.RenderingTask r12) throws com.github.barteksc.pdfviewer.exception.PageRenderingException {
            r11 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r11.pdfView
            com.github.barteksc.pdfviewer.PdfFile r0 = r0.pdfFile
            int r1 = r12.page
            r0.openPage(r1)
            float r1 = r12.width
            int r1 = java.lang.Math.round(r1)
            float r2 = r12.height
            int r2 = java.lang.Math.round(r2)
            r3 = 0
            if (r1 == 0) goto L4c
            if (r2 == 0) goto L4c
            int r4 = r12.page
            boolean r4 = r0.pageHasError(r4)
            if (r4 == 0) goto L23
            goto L4c
        L23:
            boolean r4 = r12.bestQuality     // Catch: java.lang.IllegalArgumentException -> L4c
            if (r4 == 0) goto L2a
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.IllegalArgumentException -> L4c
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.IllegalArgumentException -> L4c
        L2c:
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r2, r4)     // Catch: java.lang.IllegalArgumentException -> L4c
            android.graphics.RectF r3 = r12.bounds
            r11.calculateBounds(r1, r2, r3)
            int r1 = r12.page
            android.graphics.Rect r2 = r11.roundedRenderBounds
            boolean r3 = r12.annotationRendering
            r0.renderPageBitmap(r7, r1, r2, r3)
            com.github.barteksc.pdfviewer.model.PagePart r5 = new com.github.barteksc.pdfviewer.model.PagePart
            int r6 = r12.page
            android.graphics.RectF r8 = r12.bounds
            boolean r9 = r12.thumbnail
            int r10 = r12.cacheOrder
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L4c:
            return r3
    }

    void addRenderingTask(int r11, float r12, float r13, android.graphics.RectF r14, boolean r15, int r16, boolean r17, boolean r18) {
            r10 = this;
            com.github.barteksc.pdfviewer.RenderingHandler$RenderingTask r0 = new com.github.barteksc.pdfviewer.RenderingHandler$RenderingTask
            r1 = r10
            r5 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = 1
            android.os.Message r11 = r10.obtainMessage(r11, r0)
            r10.sendMessage(r11)
            return
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r3) {
            r2 = this;
            java.lang.Object r3 = r3.obj
            com.github.barteksc.pdfviewer.RenderingHandler$RenderingTask r3 = (com.github.barteksc.pdfviewer.RenderingHandler.RenderingTask) r3
            com.github.barteksc.pdfviewer.model.PagePart r3 = r2.proceed(r3)     // Catch: com.github.barteksc.pdfviewer.exception.PageRenderingException -> L19
            if (r3 == 0) goto L22
            boolean r0 = r2.running     // Catch: com.github.barteksc.pdfviewer.exception.PageRenderingException -> L19
            if (r0 == 0) goto L1b
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView     // Catch: com.github.barteksc.pdfviewer.exception.PageRenderingException -> L19
            com.github.barteksc.pdfviewer.RenderingHandler$1 r1 = new com.github.barteksc.pdfviewer.RenderingHandler$1     // Catch: com.github.barteksc.pdfviewer.exception.PageRenderingException -> L19
            r1.<init>(r2, r3)     // Catch: com.github.barteksc.pdfviewer.exception.PageRenderingException -> L19
            r0.post(r1)     // Catch: com.github.barteksc.pdfviewer.exception.PageRenderingException -> L19
            return
        L19:
            r3 = move-exception
            goto L23
        L1b:
            android.graphics.Bitmap r3 = r3.getRenderedBitmap()     // Catch: com.github.barteksc.pdfviewer.exception.PageRenderingException -> L19
            r3.recycle()     // Catch: com.github.barteksc.pdfviewer.exception.PageRenderingException -> L19
        L22:
            return
        L23:
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            com.github.barteksc.pdfviewer.RenderingHandler$2 r1 = new com.github.barteksc.pdfviewer.RenderingHandler$2
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    void start() {
            r1 = this;
            r0 = 1
            r1.running = r0
            return
    }

    void stop() {
            r1 = this;
            r0 = 0
            r1.running = r0
            return
    }
}
