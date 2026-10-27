package com.github.barteksc.pdfviewer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class PagesLoader {
    private int cacheOrder;
    private float pageRelativePartHeight;
    private float pageRelativePartWidth;
    private float partRenderHeight;
    private float partRenderWidth;
    private com.github.barteksc.pdfviewer.PDFView pdfView;
    private final int preloadOffset;
    private final android.graphics.RectF thumbnailRect;
    private float xOffset;
    private float yOffset;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.barteksc.pdfviewer.PagesLoader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class GridSize {
        int cols;
        int rows;
        final /* synthetic */ com.github.barteksc.pdfviewer.PagesLoader this$0;

        private GridSize(com.github.barteksc.pdfviewer.PagesLoader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ GridSize(com.github.barteksc.pdfviewer.PagesLoader r1, com.github.barteksc.pdfviewer.PagesLoader.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "GridSize{rows="
                r0.append(r1)
                int r1 = r2.rows
                r0.append(r1)
                java.lang.String r1 = ", cols="
                r0.append(r1)
                int r1 = r2.cols
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class Holder {
        int col;
        int row;
        final /* synthetic */ com.github.barteksc.pdfviewer.PagesLoader this$0;

        private Holder(com.github.barteksc.pdfviewer.PagesLoader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ Holder(com.github.barteksc.pdfviewer.PagesLoader r1, com.github.barteksc.pdfviewer.PagesLoader.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Holder{row="
                r0.append(r1)
                int r1 = r2.row
                r0.append(r1)
                java.lang.String r1 = ", col="
                r0.append(r1)
                int r1 = r2.col
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class RenderRange {
        com.github.barteksc.pdfviewer.PagesLoader.GridSize gridSize;
        com.github.barteksc.pdfviewer.PagesLoader.Holder leftTop;
        int page;
        com.github.barteksc.pdfviewer.PagesLoader.Holder rightBottom;
        final /* synthetic */ com.github.barteksc.pdfviewer.PagesLoader this$0;

        RenderRange(com.github.barteksc.pdfviewer.PagesLoader r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r0 = 0
                r2.page = r0
                com.github.barteksc.pdfviewer.PagesLoader$GridSize r0 = new com.github.barteksc.pdfviewer.PagesLoader$GridSize
                r1 = 0
                r0.<init>(r3, r1)
                r2.gridSize = r0
                com.github.barteksc.pdfviewer.PagesLoader$Holder r0 = new com.github.barteksc.pdfviewer.PagesLoader$Holder
                r0.<init>(r3, r1)
                r2.leftTop = r0
                com.github.barteksc.pdfviewer.PagesLoader$Holder r0 = new com.github.barteksc.pdfviewer.PagesLoader$Holder
                r0.<init>(r3, r1)
                r2.rightBottom = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "RenderRange{page="
                r0.append(r1)
                int r1 = r2.page
                r0.append(r1)
                java.lang.String r1 = ", gridSize="
                r0.append(r1)
                com.github.barteksc.pdfviewer.PagesLoader$GridSize r1 = r2.gridSize
                r0.append(r1)
                java.lang.String r1 = ", leftTop="
                r0.append(r1)
                com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r2.leftTop
                r0.append(r1)
                java.lang.String r1 = ", rightBottom="
                r0.append(r1)
                com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r2.rightBottom
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    PagesLoader(com.github.barteksc.pdfviewer.PDFView r4) {
            r3 = this;
            r3.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r2, r2)
            r3.thumbnailRect = r0
            r3.pdfView = r4
            android.content.Context r4 = r4.getContext()
            int r0 = com.github.barteksc.pdfviewer.util.Constants.PRELOAD_OFFSET
            int r4 = com.github.barteksc.pdfviewer.util.Util.getDP(r4, r0)
            r3.preloadOffset = r4
            return
    }

    private void calculatePartSize(com.github.barteksc.pdfviewer.PagesLoader.GridSize r3) {
            r2 = this;
            int r0 = r3.cols
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 / r0
            r2.pageRelativePartWidth = r0
            int r3 = r3.rows
            float r3 = (float) r3
            float r1 = r1 / r3
            r2.pageRelativePartHeight = r1
            float r3 = com.github.barteksc.pdfviewer.util.Constants.PART_SIZE
            float r0 = r3 / r0
            r2.partRenderWidth = r0
            float r3 = r3 / r1
            r2.partRenderHeight = r3
            return
    }

    private void getPageColsRows(com.github.barteksc.pdfviewer.PagesLoader.GridSize r4, int r5) {
            r3 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            com.github.barteksc.pdfviewer.PdfFile r0 = r0.pdfFile
            com.shockwave.pdfium.util.SizeF r5 = r0.getPageSize(r5)
            float r0 = r5.b()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 / r0
            float r5 = r5.a()
            float r5 = r1 / r5
            float r2 = com.github.barteksc.pdfviewer.util.Constants.PART_SIZE
            float r2 = r2 * r5
            com.github.barteksc.pdfviewer.PDFView r5 = r3.pdfView
            float r5 = r5.getZoom()
            float r2 = r2 / r5
            float r5 = com.github.barteksc.pdfviewer.util.Constants.PART_SIZE
            float r5 = r5 * r0
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            float r0 = r0.getZoom()
            float r5 = r5 / r0
            float r0 = r1 / r2
            int r0 = com.github.barteksc.pdfviewer.util.MathUtils.ceil(r0)
            r4.rows = r0
            float r1 = r1 / r5
            int r5 = com.github.barteksc.pdfviewer.util.MathUtils.ceil(r1)
            r4.cols = r5
            return
    }

    private java.util.List<com.github.barteksc.pdfviewer.PagesLoader.RenderRange> getRenderRangeList(float r21, float r22, float r23, float r24) {
            r20 = this;
            r0 = r20
            r1 = 0
            r2 = r21
            float r2 = com.github.barteksc.pdfviewer.util.MathUtils.max(r2, r1)
            float r2 = -r2
            r3 = r22
            float r3 = com.github.barteksc.pdfviewer.util.MathUtils.max(r3, r1)
            float r3 = -r3
            r4 = r23
            float r4 = com.github.barteksc.pdfviewer.util.MathUtils.max(r4, r1)
            float r4 = -r4
            r5 = r24
            float r5 = com.github.barteksc.pdfviewer.util.MathUtils.max(r5, r1)
            float r5 = -r5
            com.github.barteksc.pdfviewer.PDFView r6 = r0.pdfView
            boolean r6 = r6.isSwipeVertical()
            if (r6 == 0) goto L29
            r6 = r3
            goto L2a
        L29:
            r6 = r2
        L2a:
            com.github.barteksc.pdfviewer.PDFView r7 = r0.pdfView
            boolean r7 = r7.isSwipeVertical()
            if (r7 == 0) goto L34
            r7 = r5
            goto L35
        L34:
            r7 = r4
        L35:
            com.github.barteksc.pdfviewer.PDFView r8 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r9 = r8.pdfFile
            float r8 = r8.getZoom()
            int r6 = r9.getPageAtOffset(r6, r8)
            com.github.barteksc.pdfviewer.PDFView r8 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r9 = r8.pdfFile
            float r8 = r8.getZoom()
            int r7 = r9.getPageAtOffset(r7, r8)
            int r8 = r7 - r6
            r9 = 1
            int r8 = r8 + r9
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            r11 = r6
        L57:
            if (r11 > r7) goto L209
            com.github.barteksc.pdfviewer.PagesLoader$RenderRange r12 = new com.github.barteksc.pdfviewer.PagesLoader$RenderRange
            r12.<init>(r0)
            r12.page = r11
            if (r11 != r6) goto L9f
            if (r8 != r9) goto L6b
            r13 = r2
            r15 = r3
            r14 = r4
        L67:
            r16 = r5
            goto Lf0
        L6b:
            com.github.barteksc.pdfviewer.PDFView r13 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r14 = r13.pdfFile
            float r13 = r13.getZoom()
            float r13 = r14.getPageOffset(r11, r13)
            com.github.barteksc.pdfviewer.PDFView r14 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r15 = r14.pdfFile
            float r14 = r14.getZoom()
            com.shockwave.pdfium.util.SizeF r14 = r15.getScaledPageSize(r11, r14)
            com.github.barteksc.pdfviewer.PDFView r15 = r0.pdfView
            boolean r15 = r15.isSwipeVertical()
            if (r15 == 0) goto L93
            float r14 = r14.a()
            float r13 = r13 + r14
            r14 = r13
            r13 = r4
            goto L99
        L93:
            float r14 = r14.b()
            float r13 = r13 + r14
            r14 = r5
        L99:
            r15 = r3
            r16 = r14
            r14 = r13
            r13 = r2
            goto Lf0
        L9f:
            if (r11 != r7) goto Lbe
            com.github.barteksc.pdfviewer.PDFView r13 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r14 = r13.pdfFile
            float r13 = r13.getZoom()
            float r13 = r14.getPageOffset(r11, r13)
            com.github.barteksc.pdfviewer.PDFView r14 = r0.pdfView
            boolean r14 = r14.isSwipeVertical()
            if (r14 == 0) goto Lb8
            r14 = r13
            r13 = r2
            goto Lb9
        Lb8:
            r14 = r3
        Lb9:
            r16 = r5
            r15 = r14
        Lbc:
            r14 = r4
            goto Lf0
        Lbe:
            com.github.barteksc.pdfviewer.PDFView r13 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r14 = r13.pdfFile
            float r13 = r13.getZoom()
            float r13 = r14.getPageOffset(r11, r13)
            com.github.barteksc.pdfviewer.PDFView r14 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r15 = r14.pdfFile
            float r14 = r14.getZoom()
            com.shockwave.pdfium.util.SizeF r14 = r15.getScaledPageSize(r11, r14)
            com.github.barteksc.pdfviewer.PDFView r15 = r0.pdfView
            boolean r15 = r15.isSwipeVertical()
            if (r15 == 0) goto Le8
            float r14 = r14.a()
            float r14 = r14 + r13
            r15 = r13
            r16 = r14
            r13 = r2
            goto Lbc
        Le8:
            float r14 = r14.b()
            float r14 = r14 + r13
            r15 = r3
            goto L67
        Lf0:
            com.github.barteksc.pdfviewer.PagesLoader$GridSize r9 = r12.gridSize
            int r1 = r12.page
            r0.getPageColsRows(r9, r1)
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r9 = r1.pdfFile
            r22 = r1
            int r1 = r12.page
            r17 = r2
            float r2 = r22.getZoom()
            com.shockwave.pdfium.util.SizeF r1 = r9.getScaledPageSize(r1, r2)
            float r2 = r1.a()
            com.github.barteksc.pdfviewer.PagesLoader$GridSize r9 = r12.gridSize
            int r9 = r9.rows
            float r9 = (float) r9
            float r2 = r2 / r9
            float r1 = r1.b()
            com.github.barteksc.pdfviewer.PagesLoader$GridSize r9 = r12.gridSize
            int r9 = r9.cols
            float r9 = (float) r9
            float r1 = r1 / r9
            com.github.barteksc.pdfviewer.PDFView r9 = r0.pdfView
            r22 = r1
            com.github.barteksc.pdfviewer.PdfFile r1 = r9.pdfFile
            float r9 = r9.getZoom()
            float r1 = r1.getSecondaryPageOffset(r11, r9)
            com.github.barteksc.pdfviewer.PDFView r9 = r0.pdfView
            boolean r9 = r9.isSwipeVertical()
            if (r9 == 0) goto L19a
            com.github.barteksc.pdfviewer.PagesLoader$Holder r9 = r12.leftTop
            r23 = r1
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            r24 = r2
            com.github.barteksc.pdfviewer.PdfFile r2 = r1.pdfFile
            r18 = r1
            int r1 = r12.page
            r19 = r3
            float r3 = r18.getZoom()
            float r1 = r2.getPageOffset(r1, r3)
            float r15 = r15 - r1
            float r1 = java.lang.Math.abs(r15)
            float r1 = r1 / r24
            int r1 = com.github.barteksc.pdfviewer.util.MathUtils.floor(r1)
            r9.row = r1
            com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r12.leftTop
            float r13 = r13 - r23
            r2 = 0
            float r3 = com.github.barteksc.pdfviewer.util.MathUtils.min(r13, r2)
            float r3 = r3 / r22
            int r2 = com.github.barteksc.pdfviewer.util.MathUtils.floor(r3)
            r1.col = r2
            com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r12.rightBottom
            com.github.barteksc.pdfviewer.PDFView r2 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r3 = r2.pdfFile
            int r9 = r12.page
            float r2 = r2.getZoom()
            float r2 = r3.getPageOffset(r9, r2)
            float r16 = r16 - r2
            float r2 = java.lang.Math.abs(r16)
            float r2 = r2 / r24
            int r2 = com.github.barteksc.pdfviewer.util.MathUtils.ceil(r2)
            r1.row = r2
            com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r12.rightBottom
            float r14 = r14 - r23
            r2 = 0
            float r3 = com.github.barteksc.pdfviewer.util.MathUtils.min(r14, r2)
            float r3 = r3 / r22
            int r2 = com.github.barteksc.pdfviewer.util.MathUtils.floor(r3)
            r1.col = r2
            r3 = 0
            goto L1fc
        L19a:
            r23 = r1
            r24 = r2
            r19 = r3
            com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r12.leftTop
            com.github.barteksc.pdfviewer.PDFView r2 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r3 = r2.pdfFile
            int r9 = r12.page
            float r2 = r2.getZoom()
            float r2 = r3.getPageOffset(r9, r2)
            float r13 = r13 - r2
            float r2 = java.lang.Math.abs(r13)
            float r2 = r2 / r22
            int r2 = com.github.barteksc.pdfviewer.util.MathUtils.floor(r2)
            r1.col = r2
            com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r12.leftTop
            float r15 = r15 - r23
            r2 = 0
            float r3 = com.github.barteksc.pdfviewer.util.MathUtils.min(r15, r2)
            float r3 = r3 / r24
            int r2 = com.github.barteksc.pdfviewer.util.MathUtils.floor(r3)
            r1.row = r2
            com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r12.rightBottom
            com.github.barteksc.pdfviewer.PDFView r2 = r0.pdfView
            com.github.barteksc.pdfviewer.PdfFile r3 = r2.pdfFile
            int r9 = r12.page
            float r2 = r2.getZoom()
            float r2 = r3.getPageOffset(r9, r2)
            float r14 = r14 - r2
            float r2 = java.lang.Math.abs(r14)
            float r2 = r2 / r22
            int r2 = com.github.barteksc.pdfviewer.util.MathUtils.floor(r2)
            r1.col = r2
            com.github.barteksc.pdfviewer.PagesLoader$Holder r1 = r12.rightBottom
            float r2 = r16 - r23
            r3 = 0
            float r2 = com.github.barteksc.pdfviewer.util.MathUtils.min(r2, r3)
            float r2 = r2 / r24
            int r2 = com.github.barteksc.pdfviewer.util.MathUtils.floor(r2)
            r1.row = r2
        L1fc:
            r10.add(r12)
            int r11 = r11 + 1
            r2 = r17
            r3 = r19
            r1 = 0
            r9 = 1
            goto L57
        L209:
            return r10
    }

    private boolean loadCell(int r17, int r18, int r19, float r20, float r21) {
            r16 = this;
            r0 = r16
            r1 = r19
            float r1 = (float) r1
            float r1 = r1 * r20
            r2 = r18
            float r2 = (float) r2
            float r2 = r2 * r21
            float r3 = r0.partRenderWidth
            float r4 = r0.partRenderHeight
            float r5 = r1 + r20
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L1b
            float r5 = r6 - r1
            goto L1d
        L1b:
            r5 = r20
        L1d:
            float r7 = r2 + r21
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto L25
            float r6 = r6 - r2
            goto L27
        L25:
            r6 = r21
        L27:
            float r9 = r3 * r5
            float r10 = r4 * r6
            android.graphics.RectF r11 = new android.graphics.RectF
            float r5 = r5 + r1
            float r6 = r6 + r2
            r11.<init>(r1, r2, r5, r6)
            r1 = 0
            int r2 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r2 <= 0) goto L64
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L64
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            com.github.barteksc.pdfviewer.CacheManager r1 = r1.cacheManager
            int r2 = r0.cacheOrder
            r8 = r17
            boolean r1 = r1.upPartIfContained(r8, r11, r2)
            if (r1 != 0) goto L5d
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            com.github.barteksc.pdfviewer.RenderingHandler r7 = r1.renderingHandler
            int r13 = r0.cacheOrder
            boolean r14 = r1.isBestQuality()
            com.github.barteksc.pdfviewer.PDFView r1 = r0.pdfView
            boolean r15 = r1.isAnnotationRendering()
            r12 = 0
            r7.addRenderingTask(r8, r9, r10, r11, r12, r13, r14, r15)
        L5d:
            int r1 = r0.cacheOrder
            r2 = 1
            int r1 = r1 + r2
            r0.cacheOrder = r1
            return r2
        L64:
            r1 = 0
            return r1
    }

    private int loadPage(int r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            r0 = 0
            r3 = r9
        L2:
            if (r3 > r10) goto L20
            r4 = r11
        L5:
            if (r4 > r12) goto L1c
            float r5 = r7.pageRelativePartWidth
            float r6 = r7.pageRelativePartHeight
            r1 = r7
            r2 = r8
            boolean r8 = r1.loadCell(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L15
            int r0 = r0 + 1
        L15:
            if (r0 < r13) goto L18
            return r0
        L18:
            int r4 = r4 + 1
            r8 = r2
            goto L5
        L1c:
            r2 = r8
            int r3 = r3 + 1
            goto L2
        L20:
            return r0
    }

    private void loadThumbnail(int r13) {
            r12 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r12.pdfView
            com.github.barteksc.pdfviewer.PdfFile r0 = r0.pdfFile
            com.shockwave.pdfium.util.SizeF r0 = r0.getPageSize(r13)
            float r1 = r0.b()
            float r2 = com.github.barteksc.pdfviewer.util.Constants.THUMBNAIL_RATIO
            float r5 = r1 * r2
            float r0 = r0.a()
            float r1 = com.github.barteksc.pdfviewer.util.Constants.THUMBNAIL_RATIO
            float r6 = r0 * r1
            com.github.barteksc.pdfviewer.PDFView r0 = r12.pdfView
            com.github.barteksc.pdfviewer.CacheManager r0 = r0.cacheManager
            android.graphics.RectF r1 = r12.thumbnailRect
            boolean r0 = r0.containsThumbnail(r13, r1)
            if (r0 != 0) goto L3a
            com.github.barteksc.pdfviewer.PDFView r0 = r12.pdfView
            com.github.barteksc.pdfviewer.RenderingHandler r3 = r0.renderingHandler
            android.graphics.RectF r7 = r12.thumbnailRect
            boolean r10 = r0.isBestQuality()
            com.github.barteksc.pdfviewer.PDFView r0 = r12.pdfView
            boolean r11 = r0.isAnnotationRendering()
            r8 = 1
            r9 = 0
            r4 = r13
            r3.addRenderingTask(r4, r5, r6, r7, r8, r9, r10, r11)
        L3a:
            return
    }

    private void loadVisible() {
            r11 = this;
            int r0 = r11.preloadOffset
            float r0 = (float) r0
            float r1 = r11.xOffset
            float r2 = -r1
            float r2 = r2 + r0
            float r1 = -r1
            com.github.barteksc.pdfviewer.PDFView r3 = r11.pdfView
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = r1 - r0
            float r3 = r11.yOffset
            float r4 = -r3
            float r4 = r4 + r0
            float r3 = -r3
            com.github.barteksc.pdfviewer.PDFView r5 = r11.pdfView
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r3 = r3 - r5
            float r3 = r3 - r0
            java.util.List r0 = r11.getRenderRangeList(r2, r4, r1, r3)
            java.util.Iterator r1 = r0.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            com.github.barteksc.pdfviewer.PagesLoader$RenderRange r2 = (com.github.barteksc.pdfviewer.PagesLoader.RenderRange) r2
            int r2 = r2.page
            r11.loadThumbnail(r2)
            goto L27
        L39:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L3e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            com.github.barteksc.pdfviewer.PagesLoader$RenderRange r2 = (com.github.barteksc.pdfviewer.PagesLoader.RenderRange) r2
            com.github.barteksc.pdfviewer.PagesLoader$GridSize r3 = r2.gridSize
            r11.calculatePartSize(r3)
            int r5 = r2.page
            com.github.barteksc.pdfviewer.PagesLoader$Holder r3 = r2.leftTop
            int r6 = r3.row
            com.github.barteksc.pdfviewer.PagesLoader$Holder r2 = r2.rightBottom
            int r7 = r2.row
            int r8 = r3.col
            int r9 = r2.col
            int r2 = com.github.barteksc.pdfviewer.util.Constants.Cache.CACHE_SIZE
            int r10 = r2 - r1
            r4 = r11
            int r2 = r4.loadPage(r5, r6, r7, r8, r9, r10)
            int r1 = r1 + r2
            int r2 = com.github.barteksc.pdfviewer.util.Constants.Cache.CACHE_SIZE
            if (r1 < r2) goto L3e
        L6b:
            return
    }

    void loadPages() {
            r2 = this;
            r0 = 1
            r2.cacheOrder = r0
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            float r0 = r0.getCurrentXOffset()
            r1 = 0
            float r0 = com.github.barteksc.pdfviewer.util.MathUtils.max(r0, r1)
            float r0 = -r0
            r2.xOffset = r0
            com.github.barteksc.pdfviewer.PDFView r0 = r2.pdfView
            float r0 = r0.getCurrentYOffset()
            float r0 = com.github.barteksc.pdfviewer.util.MathUtils.max(r0, r1)
            float r0 = -r0
            r2.yOffset = r0
            r2.loadVisible()
            return
    }
}
