package com.github.barteksc.pdfviewer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class PdfFile {
    private static final java.lang.Object lock = null;
    private boolean autoSpacing;
    private float documentLength;
    private final boolean fitEachPage;
    private boolean isVertical;
    private com.shockwave.pdfium.util.SizeF maxHeightPageSize;
    private com.shockwave.pdfium.util.SizeF maxWidthPageSize;
    private android.util.SparseBooleanArray openedPages;
    private com.shockwave.pdfium.util.Size originalMaxHeightPageSize;
    private com.shockwave.pdfium.util.Size originalMaxWidthPageSize;
    private java.util.List<com.shockwave.pdfium.util.Size> originalPageSizes;
    private int[] originalUserPages;
    private final com.github.barteksc.pdfviewer.util.FitPolicy pageFitPolicy;
    private java.util.List<java.lang.Float> pageOffsets;
    private java.util.List<com.shockwave.pdfium.util.SizeF> pageSizes;
    private java.util.List<java.lang.Float> pageSpacing;
    private int pagesCount;
    private com.shockwave.pdfium.PdfDocument pdfDocument;
    private com.shockwave.pdfium.PdfiumCore pdfiumCore;
    private int spacingPx;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.github.barteksc.pdfviewer.PdfFile.lock = r0
            return
    }

    PdfFile(com.shockwave.pdfium.PdfiumCore r3, com.shockwave.pdfium.PdfDocument r4, com.github.barteksc.pdfviewer.util.FitPolicy r5, com.shockwave.pdfium.util.Size r6, int[] r7, boolean r8, int r9, boolean r10, boolean r11) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.pagesCount = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.originalPageSizes = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.pageSizes = r1
            android.util.SparseBooleanArray r1 = new android.util.SparseBooleanArray
            r1.<init>()
            r2.openedPages = r1
            com.shockwave.pdfium.util.Size r1 = new com.shockwave.pdfium.util.Size
            r1.<init>(r0, r0)
            r2.originalMaxWidthPageSize = r1
            com.shockwave.pdfium.util.Size r1 = new com.shockwave.pdfium.util.Size
            r1.<init>(r0, r0)
            r2.originalMaxHeightPageSize = r1
            com.shockwave.pdfium.util.SizeF r0 = new com.shockwave.pdfium.util.SizeF
            r1 = 0
            r0.<init>(r1, r1)
            r2.maxHeightPageSize = r0
            com.shockwave.pdfium.util.SizeF r0 = new com.shockwave.pdfium.util.SizeF
            r0.<init>(r1, r1)
            r2.maxWidthPageSize = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.pageOffsets = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.pageSpacing = r0
            r2.documentLength = r1
            r2.pdfiumCore = r3
            r2.pdfDocument = r4
            r2.pageFitPolicy = r5
            r2.originalUserPages = r7
            r2.isVertical = r8
            r2.spacingPx = r9
            r2.autoSpacing = r10
            r2.fitEachPage = r11
            r2.setup(r6)
            return
    }

    private void prepareAutoSpacing(com.shockwave.pdfium.util.Size r4) {
            r3 = this;
            java.util.List<java.lang.Float> r0 = r3.pageSpacing
            r0.clear()
            r0 = 0
        L6:
            int r1 = r3.getPagesCount()
            if (r0 >= r1) goto L4a
            java.util.List<com.shockwave.pdfium.util.SizeF> r1 = r3.pageSizes
            java.lang.Object r1 = r1.get(r0)
            com.shockwave.pdfium.util.SizeF r1 = (com.shockwave.pdfium.util.SizeF) r1
            boolean r2 = r3.isVertical
            if (r2 == 0) goto L23
            int r2 = r4.a()
            float r2 = (float) r2
            float r1 = r1.a()
        L21:
            float r2 = r2 - r1
            goto L2d
        L23:
            int r2 = r4.b()
            float r2 = (float) r2
            float r1 = r1.b()
            goto L21
        L2d:
            r1 = 0
            float r1 = java.lang.Math.max(r1, r2)
            int r2 = r3.getPagesCount()
            int r2 = r2 + (-1)
            if (r0 >= r2) goto L3e
            int r2 = r3.spacingPx
            float r2 = (float) r2
            float r1 = r1 + r2
        L3e:
            java.util.List<java.lang.Float> r2 = r3.pageSpacing
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.add(r1)
            int r0 = r0 + 1
            goto L6
        L4a:
            return
    }

    private void prepareDocLen() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.getPagesCount()
            if (r1 >= r2) goto L3f
            java.util.List<com.shockwave.pdfium.util.SizeF> r2 = r4.pageSizes
            java.lang.Object r2 = r2.get(r1)
            com.shockwave.pdfium.util.SizeF r2 = (com.shockwave.pdfium.util.SizeF) r2
            boolean r3 = r4.isVertical
            if (r3 == 0) goto L19
            float r2 = r2.a()
            goto L1d
        L19:
            float r2 = r2.b()
        L1d:
            float r0 = r0 + r2
            boolean r2 = r4.autoSpacing
            if (r2 == 0) goto L30
            java.util.List<java.lang.Float> r2 = r4.pageSpacing
            java.lang.Object r2 = r2.get(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L2e:
            float r0 = r0 + r2
            goto L3c
        L30:
            int r2 = r4.getPagesCount()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L3c
            int r2 = r4.spacingPx
            float r2 = (float) r2
            goto L2e
        L3c:
            int r1 = r1 + 1
            goto L2
        L3f:
            r4.documentLength = r0
            return
    }

    private void preparePagesOffset() {
            r6 = this;
            java.util.List<java.lang.Float> r0 = r6.pageOffsets
            r0.clear()
            r0 = 0
            r1 = 0
        L7:
            int r2 = r6.getPagesCount()
            if (r1 >= r2) goto L74
            java.util.List<com.shockwave.pdfium.util.SizeF> r2 = r6.pageSizes
            java.lang.Object r2 = r2.get(r1)
            com.shockwave.pdfium.util.SizeF r2 = (com.shockwave.pdfium.util.SizeF) r2
            boolean r3 = r6.isVertical
            if (r3 == 0) goto L1e
            float r2 = r2.a()
            goto L22
        L1e:
            float r2 = r2.b()
        L22:
            boolean r3 = r6.autoSpacing
            if (r3 == 0) goto L64
            java.util.List<java.lang.Float> r3 = r6.pageSpacing
            java.lang.Object r3 = r3.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r0 = r0 + r3
            if (r1 != 0) goto L3e
            int r3 = r6.spacingPx
            float r3 = (float) r3
            float r3 = r3 / r4
            float r0 = r0 - r3
            goto L4b
        L3e:
            int r3 = r6.getPagesCount()
            int r3 = r3 + (-1)
            if (r1 != r3) goto L4b
            int r3 = r6.spacingPx
            float r3 = (float) r3
            float r3 = r3 / r4
            float r0 = r0 + r3
        L4b:
            java.util.List<java.lang.Float> r3 = r6.pageOffsets
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r3.add(r5)
            java.util.List<java.lang.Float> r3 = r6.pageSpacing
            java.lang.Object r3 = r3.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            float r3 = r3 / r4
        L61:
            float r2 = r2 + r3
            float r0 = r0 + r2
            goto L71
        L64:
            java.util.List<java.lang.Float> r3 = r6.pageOffsets
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r3.add(r4)
            int r3 = r6.spacingPx
            float r3 = (float) r3
            goto L61
        L71:
            int r1 = r1 + 1
            goto L7
        L74:
            return
    }

    private void setup(com.shockwave.pdfium.util.Size r5) {
            r4 = this;
            int[] r0 = r4.originalUserPages
            if (r0 == 0) goto L8
            int r0 = r0.length
            r4.pagesCount = r0
            goto L12
        L8:
            com.shockwave.pdfium.PdfiumCore r0 = r4.pdfiumCore
            com.shockwave.pdfium.PdfDocument r1 = r4.pdfDocument
            int r0 = r0.d(r1)
            r4.pagesCount = r0
        L12:
            r0 = 0
        L13:
            int r1 = r4.pagesCount
            if (r0 >= r1) goto L47
            com.shockwave.pdfium.PdfiumCore r1 = r4.pdfiumCore
            com.shockwave.pdfium.PdfDocument r2 = r4.pdfDocument
            int r3 = r4.documentPage(r0)
            com.shockwave.pdfium.util.Size r1 = r1.h(r2, r3)
            int r2 = r1.b()
            com.shockwave.pdfium.util.Size r3 = r4.originalMaxWidthPageSize
            int r3 = r3.b()
            if (r2 <= r3) goto L31
            r4.originalMaxWidthPageSize = r1
        L31:
            int r2 = r1.a()
            com.shockwave.pdfium.util.Size r3 = r4.originalMaxHeightPageSize
            int r3 = r3.a()
            if (r2 <= r3) goto L3f
            r4.originalMaxHeightPageSize = r1
        L3f:
            java.util.List<com.shockwave.pdfium.util.Size> r2 = r4.originalPageSizes
            r2.add(r1)
            int r0 = r0 + 1
            goto L13
        L47:
            r4.recalculatePageSizes(r5)
            return
    }

    public int determineValidPageNumberFrom(int r3) {
            r2 = this;
            if (r3 > 0) goto L4
            r3 = 0
            return r3
        L4:
            int[] r0 = r2.originalUserPages
            if (r0 == 0) goto Lf
            int r1 = r0.length
            if (r3 < r1) goto L1a
            int r3 = r0.length
        Lc:
            int r3 = r3 + (-1)
            return r3
        Lf:
            int r0 = r2.getPagesCount()
            if (r3 < r0) goto L1a
            int r3 = r2.getPagesCount()
            goto Lc
        L1a:
            return r3
    }

    public void dispose() {
            r2 = this;
            com.shockwave.pdfium.PdfiumCore r0 = r2.pdfiumCore
            if (r0 == 0) goto Lb
            com.shockwave.pdfium.PdfDocument r1 = r2.pdfDocument
            if (r1 == 0) goto Lb
            r0.a(r1)
        Lb:
            r0 = 0
            r2.pdfDocument = r0
            r2.originalUserPages = r0
            return
    }

    public int documentPage(int r4) {
            r3 = this;
            int[] r0 = r3.originalUserPages
            r1 = -1
            if (r0 == 0) goto Lf
            if (r4 < 0) goto Le
            int r2 = r0.length
            if (r4 < r2) goto Lb
            goto Le
        Lb:
            r0 = r0[r4]
            goto L10
        Le:
            return r1
        Lf:
            r0 = r4
        L10:
            if (r0 < 0) goto L1a
            int r2 = r3.getPagesCount()
            if (r4 < r2) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            return r1
    }

    public java.util.List<com.shockwave.pdfium.PdfDocument.Bookmark> getBookmarks() {
            r2 = this;
            com.shockwave.pdfium.PdfDocument r0 = r2.pdfDocument
            if (r0 != 0) goto La
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        La:
            com.shockwave.pdfium.PdfiumCore r1 = r2.pdfiumCore
            java.util.List r0 = r1.k(r0)
            return r0
    }

    public float getDocLen(float r2) {
            r1 = this;
            float r0 = r1.documentLength
            float r0 = r0 * r2
            return r0
    }

    public float getMaxPageHeight() {
            r1 = this;
            com.shockwave.pdfium.util.SizeF r0 = r1.getMaxPageSize()
            float r0 = r0.a()
            return r0
    }

    public com.shockwave.pdfium.util.SizeF getMaxPageSize() {
            r1 = this;
            boolean r0 = r1.isVertical
            if (r0 == 0) goto L7
            com.shockwave.pdfium.util.SizeF r0 = r1.maxWidthPageSize
            return r0
        L7:
            com.shockwave.pdfium.util.SizeF r0 = r1.maxHeightPageSize
            return r0
    }

    public float getMaxPageWidth() {
            r1 = this;
            com.shockwave.pdfium.util.SizeF r0 = r1.getMaxPageSize()
            float r0 = r0.b()
            return r0
    }

    public com.shockwave.pdfium.PdfDocument.Meta getMetaData() {
            r2 = this;
            com.shockwave.pdfium.PdfDocument r0 = r2.pdfDocument
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.shockwave.pdfium.PdfiumCore r1 = r2.pdfiumCore
            com.shockwave.pdfium.PdfDocument$Meta r0 = r1.b(r0)
            return r0
    }

    public int getPageAtOffset(float r7, float r8) {
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r6.getPagesCount()
            if (r1 >= r3) goto L29
            java.util.List<java.lang.Float> r3 = r6.pageOffsets
            java.lang.Object r3 = r3.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            float r3 = r3 * r8
            float r4 = r6.getPageSpacing(r1, r8)
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 - r4
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 < 0) goto L24
            goto L29
        L24:
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L3
        L29:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L2e
            return r2
        L2e:
            return r0
    }

    public float getPageLength(int r2, float r3) {
            r1 = this;
            com.shockwave.pdfium.util.SizeF r2 = r1.getPageSize(r2)
            boolean r0 = r1.isVertical
            if (r0 == 0) goto Ld
            float r2 = r2.a()
            goto L11
        Ld:
            float r2 = r2.b()
        L11:
            float r2 = r2 * r3
            return r2
    }

    public java.util.List<com.shockwave.pdfium.PdfDocument.Link> getPageLinks(int r3) {
            r2 = this;
            int r3 = r2.documentPage(r3)
            com.shockwave.pdfium.PdfiumCore r0 = r2.pdfiumCore
            com.shockwave.pdfium.PdfDocument r1 = r2.pdfDocument
            java.util.List r3 = r0.g(r1, r3)
            return r3
    }

    public float getPageOffset(int r2, float r3) {
            r1 = this;
            int r0 = r1.documentPage(r2)
            if (r0 >= 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.List<java.lang.Float> r0 = r1.pageOffsets
            java.lang.Object r2 = r0.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r2 = r2 * r3
            return r2
    }

    public com.shockwave.pdfium.util.SizeF getPageSize(int r2) {
            r1 = this;
            int r0 = r1.documentPage(r2)
            if (r0 >= 0) goto Ld
            com.shockwave.pdfium.util.SizeF r2 = new com.shockwave.pdfium.util.SizeF
            r0 = 0
            r2.<init>(r0, r0)
            return r2
        Ld:
            java.util.List<com.shockwave.pdfium.util.SizeF> r0 = r1.pageSizes
            java.lang.Object r2 = r0.get(r2)
            com.shockwave.pdfium.util.SizeF r2 = (com.shockwave.pdfium.util.SizeF) r2
            return r2
    }

    public float getPageSpacing(int r2, float r3) {
            r1 = this;
            boolean r0 = r1.autoSpacing
            if (r0 == 0) goto L11
            java.util.List<java.lang.Float> r0 = r1.pageSpacing
            java.lang.Object r2 = r0.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L14
        L11:
            int r2 = r1.spacingPx
            float r2 = (float) r2
        L14:
            float r2 = r2 * r3
            return r2
    }

    public int getPagesCount() {
            r1 = this;
            int r0 = r1.pagesCount
            return r0
    }

    public com.shockwave.pdfium.util.SizeF getScaledPageSize(int r3, float r4) {
            r2 = this;
            com.shockwave.pdfium.util.SizeF r3 = r2.getPageSize(r3)
            com.shockwave.pdfium.util.SizeF r0 = new com.shockwave.pdfium.util.SizeF
            float r1 = r3.b()
            float r1 = r1 * r4
            float r3 = r3.a()
            float r3 = r3 * r4
            r0.<init>(r1, r3)
            return r0
    }

    public float getSecondaryPageOffset(int r3, float r4) {
            r2 = this;
            com.shockwave.pdfium.util.SizeF r3 = r2.getPageSize(r3)
            boolean r0 = r2.isVertical
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L17
            float r0 = r2.getMaxPageWidth()
            float r3 = r3.b()
        L12:
            float r0 = r0 - r3
            float r4 = r4 * r0
            float r4 = r4 / r1
            return r4
        L17:
            float r0 = r2.getMaxPageHeight()
            float r3 = r3.a()
            goto L12
    }

    public android.graphics.RectF mapRectToDevice(int r10, int r11, int r12, int r13, int r14, android.graphics.RectF r15) {
            r9 = this;
            int r2 = r9.documentPage(r10)
            com.shockwave.pdfium.PdfiumCore r0 = r9.pdfiumCore
            com.shockwave.pdfium.PdfDocument r1 = r9.pdfDocument
            r7 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r15
            android.graphics.RectF r10 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public boolean openPage(int r6) throws com.github.barteksc.pdfviewer.exception.PageRenderingException {
            r5 = this;
            int r0 = r5.documentPage(r6)
            r1 = 0
            if (r0 >= 0) goto L8
            return r1
        L8:
            java.lang.Object r2 = com.github.barteksc.pdfviewer.PdfFile.lock
            monitor-enter(r2)
            android.util.SparseBooleanArray r3 = r5.openedPages     // Catch: java.lang.Throwable -> L22
            int r3 = r3.indexOfKey(r0)     // Catch: java.lang.Throwable -> L22
            if (r3 >= 0) goto L30
            com.shockwave.pdfium.PdfiumCore r3 = r5.pdfiumCore     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            com.shockwave.pdfium.PdfDocument r4 = r5.pdfDocument     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            r3.r(r4, r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            android.util.SparseBooleanArray r3 = r5.openedPages     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            r4 = 1
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            return r4
        L22:
            r6 = move-exception
            goto L32
        L24:
            r3 = move-exception
            android.util.SparseBooleanArray r4 = r5.openedPages     // Catch: java.lang.Throwable -> L22
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L22
            com.github.barteksc.pdfviewer.exception.PageRenderingException r0 = new com.github.barteksc.pdfviewer.exception.PageRenderingException     // Catch: java.lang.Throwable -> L22
            r0.<init>(r6, r3)     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            return r1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r6
    }

    public boolean pageHasError(int r3) {
            r2 = this;
            int r3 = r2.documentPage(r3)
            android.util.SparseBooleanArray r0 = r2.openedPages
            r1 = 0
            boolean r3 = r0.get(r3, r1)
            r3 = r3 ^ 1
            return r3
    }

    public void recalculatePageSizes(com.shockwave.pdfium.util.Size r8) {
            r7 = this;
            java.util.List<com.shockwave.pdfium.util.SizeF> r0 = r7.pageSizes
            r0.clear()
            com.github.barteksc.pdfviewer.util.PageSizeCalculator r1 = new com.github.barteksc.pdfviewer.util.PageSizeCalculator
            com.github.barteksc.pdfviewer.util.FitPolicy r2 = r7.pageFitPolicy
            com.shockwave.pdfium.util.Size r3 = r7.originalMaxWidthPageSize
            com.shockwave.pdfium.util.Size r4 = r7.originalMaxHeightPageSize
            boolean r6 = r7.fitEachPage
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            com.shockwave.pdfium.util.SizeF r8 = r1.getOptimalMaxWidthPageSize()
            r7.maxWidthPageSize = r8
            com.shockwave.pdfium.util.SizeF r8 = r1.getOptimalMaxHeightPageSize()
            r7.maxHeightPageSize = r8
            java.util.List<com.shockwave.pdfium.util.Size> r8 = r7.originalPageSizes
            java.util.Iterator r8 = r8.iterator()
        L25:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r8.next()
            com.shockwave.pdfium.util.Size r0 = (com.shockwave.pdfium.util.Size) r0
            java.util.List<com.shockwave.pdfium.util.SizeF> r2 = r7.pageSizes
            com.shockwave.pdfium.util.SizeF r0 = r1.calculate(r0)
            r2.add(r0)
            goto L25
        L3b:
            boolean r8 = r7.autoSpacing
            if (r8 == 0) goto L42
            r7.prepareAutoSpacing(r5)
        L42:
            r7.prepareDocLen()
            r7.preparePagesOffset()
            return
    }

    public void renderPageBitmap(android.graphics.Bitmap r10, int r11, android.graphics.Rect r12, boolean r13) {
            r9 = this;
            int r3 = r9.documentPage(r11)
            com.shockwave.pdfium.PdfiumCore r0 = r9.pdfiumCore
            com.shockwave.pdfium.PdfDocument r1 = r9.pdfDocument
            int r4 = r12.left
            int r5 = r12.top
            int r6 = r12.width()
            int r7 = r12.height()
            r2 = r10
            r8 = r13
            r0.x(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
