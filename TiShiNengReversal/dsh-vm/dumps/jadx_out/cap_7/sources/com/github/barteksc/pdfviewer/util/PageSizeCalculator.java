package com.github.barteksc.pdfviewer.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PageSizeCalculator {
    private boolean fitEachPage;
    private com.github.barteksc.pdfviewer.util.FitPolicy fitPolicy;
    private float heightRatio;
    private com.shockwave.pdfium.util.SizeF optimalMaxHeightPageSize;
    private com.shockwave.pdfium.util.SizeF optimalMaxWidthPageSize;
    private final com.shockwave.pdfium.util.Size originalMaxHeightPageSize;
    private final com.shockwave.pdfium.util.Size originalMaxWidthPageSize;
    private final com.shockwave.pdfium.util.Size viewSize;
    private float widthRatio;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.barteksc.pdfviewer.util.PageSizeCalculator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$barteksc$pdfviewer$util$FitPolicy = null;

        static {
                com.github.barteksc.pdfviewer.util.FitPolicy[] r0 = com.github.barteksc.pdfviewer.util.FitPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.barteksc.pdfviewer.util.PageSizeCalculator.AnonymousClass1.$SwitchMap$com$github$barteksc$pdfviewer$util$FitPolicy = r0
                com.github.barteksc.pdfviewer.util.FitPolicy r1 = com.github.barteksc.pdfviewer.util.FitPolicy.HEIGHT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.github.barteksc.pdfviewer.util.PageSizeCalculator.AnonymousClass1.$SwitchMap$com$github$barteksc$pdfviewer$util$FitPolicy     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.barteksc.pdfviewer.util.FitPolicy r1 = com.github.barteksc.pdfviewer.util.FitPolicy.BOTH     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public PageSizeCalculator(com.github.barteksc.pdfviewer.util.FitPolicy r1, com.shockwave.pdfium.util.Size r2, com.shockwave.pdfium.util.Size r3, com.shockwave.pdfium.util.Size r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.fitPolicy = r1
            r0.originalMaxWidthPageSize = r2
            r0.originalMaxHeightPageSize = r3
            r0.viewSize = r4
            r0.fitEachPage = r5
            r0.calculateMaxPages()
            return
    }

    private void calculateMaxPages() {
            r4 = this;
            int[] r0 = com.github.barteksc.pdfviewer.util.PageSizeCalculator.AnonymousClass1.$SwitchMap$com$github$barteksc$pdfviewer$util$FitPolicy
            com.github.barteksc.pdfviewer.util.FitPolicy r1 = r4.fitPolicy
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto Lac
            r1 = 2
            if (r0 == r1) goto L3f
            com.shockwave.pdfium.util.Size r0 = r4.originalMaxWidthPageSize
            com.shockwave.pdfium.util.Size r1 = r4.viewSize
            int r1 = r1.b()
            float r1 = (float) r1
            com.shockwave.pdfium.util.SizeF r0 = r4.fitWidth(r0, r1)
            r4.optimalMaxWidthPageSize = r0
            float r0 = r0.b()
            com.shockwave.pdfium.util.Size r1 = r4.originalMaxWidthPageSize
            int r1 = r1.b()
            float r1 = (float) r1
            float r0 = r0 / r1
            r4.widthRatio = r0
            com.shockwave.pdfium.util.Size r0 = r4.originalMaxHeightPageSize
            int r1 = r0.b()
            float r1 = (float) r1
            float r2 = r4.widthRatio
            float r1 = r1 * r2
            com.shockwave.pdfium.util.SizeF r0 = r4.fitWidth(r0, r1)
            r4.optimalMaxHeightPageSize = r0
            return
        L3f:
            com.shockwave.pdfium.util.Size r0 = r4.originalMaxWidthPageSize
            com.shockwave.pdfium.util.Size r1 = r4.viewSize
            int r1 = r1.b()
            float r1 = (float) r1
            com.shockwave.pdfium.util.Size r2 = r4.viewSize
            int r2 = r2.a()
            float r2 = (float) r2
            com.shockwave.pdfium.util.SizeF r0 = r4.fitBoth(r0, r1, r2)
            float r0 = r0.b()
            com.shockwave.pdfium.util.Size r1 = r4.originalMaxWidthPageSize
            int r1 = r1.b()
            float r1 = (float) r1
            float r0 = r0 / r1
            com.shockwave.pdfium.util.Size r1 = r4.originalMaxHeightPageSize
            int r2 = r1.b()
            float r2 = (float) r2
            float r2 = r2 * r0
            com.shockwave.pdfium.util.Size r0 = r4.viewSize
            int r0 = r0.a()
            float r0 = (float) r0
            com.shockwave.pdfium.util.SizeF r0 = r4.fitBoth(r1, r2, r0)
            r4.optimalMaxHeightPageSize = r0
            float r0 = r0.a()
            com.shockwave.pdfium.util.Size r1 = r4.originalMaxHeightPageSize
            int r1 = r1.a()
            float r1 = (float) r1
            float r0 = r0 / r1
            r4.heightRatio = r0
            com.shockwave.pdfium.util.Size r0 = r4.originalMaxWidthPageSize
            com.shockwave.pdfium.util.Size r1 = r4.viewSize
            int r1 = r1.b()
            float r1 = (float) r1
            com.shockwave.pdfium.util.Size r2 = r4.originalMaxWidthPageSize
            int r2 = r2.a()
            float r2 = (float) r2
            float r3 = r4.heightRatio
            float r2 = r2 * r3
            com.shockwave.pdfium.util.SizeF r0 = r4.fitBoth(r0, r1, r2)
            r4.optimalMaxWidthPageSize = r0
            float r0 = r0.b()
            com.shockwave.pdfium.util.Size r1 = r4.originalMaxWidthPageSize
            int r1 = r1.b()
            float r1 = (float) r1
            float r0 = r0 / r1
            r4.widthRatio = r0
            return
        Lac:
            com.shockwave.pdfium.util.Size r0 = r4.originalMaxHeightPageSize
            com.shockwave.pdfium.util.Size r1 = r4.viewSize
            int r1 = r1.a()
            float r1 = (float) r1
            com.shockwave.pdfium.util.SizeF r0 = r4.fitHeight(r0, r1)
            r4.optimalMaxHeightPageSize = r0
            float r0 = r0.a()
            com.shockwave.pdfium.util.Size r1 = r4.originalMaxHeightPageSize
            int r1 = r1.a()
            float r1 = (float) r1
            float r0 = r0 / r1
            r4.heightRatio = r0
            com.shockwave.pdfium.util.Size r0 = r4.originalMaxWidthPageSize
            int r1 = r0.a()
            float r1 = (float) r1
            float r2 = r4.heightRatio
            float r1 = r1 * r2
            com.shockwave.pdfium.util.SizeF r0 = r4.fitHeight(r0, r1)
            r4.optimalMaxWidthPageSize = r0
            return
    }

    private com.shockwave.pdfium.util.SizeF fitBoth(com.shockwave.pdfium.util.Size r4, float r5, float r6) {
            r3 = this;
            int r0 = r4.b()
            float r0 = (float) r0
            int r4 = r4.a()
            float r4 = (float) r4
            float r0 = r0 / r4
            float r4 = r5 / r0
            double r1 = (double) r4
            double r1 = java.lang.Math.floor(r1)
            float r4 = (float) r1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L20
            float r0 = r0 * r6
            double r4 = (double) r0
            double r4 = java.lang.Math.floor(r4)
            float r5 = (float) r4
            goto L21
        L20:
            r6 = r4
        L21:
            com.shockwave.pdfium.util.SizeF r4 = new com.shockwave.pdfium.util.SizeF
            r4.<init>(r5, r6)
            return r4
    }

    private com.shockwave.pdfium.util.SizeF fitHeight(com.shockwave.pdfium.util.Size r3, float r4) {
            r2 = this;
            int r0 = r3.b()
            float r0 = (float) r0
            int r3 = r3.a()
            float r3 = (float) r3
            float r3 = r3 / r0
            float r3 = r4 / r3
            double r0 = (double) r3
            double r0 = java.lang.Math.floor(r0)
            float r3 = (float) r0
            com.shockwave.pdfium.util.SizeF r0 = new com.shockwave.pdfium.util.SizeF
            r0.<init>(r3, r4)
            return r0
    }

    private com.shockwave.pdfium.util.SizeF fitWidth(com.shockwave.pdfium.util.Size r3, float r4) {
            r2 = this;
            int r0 = r3.b()
            float r0 = (float) r0
            int r3 = r3.a()
            float r3 = (float) r3
            float r0 = r0 / r3
            float r3 = r4 / r0
            double r0 = (double) r3
            double r0 = java.lang.Math.floor(r0)
            float r3 = (float) r0
            com.shockwave.pdfium.util.SizeF r0 = new com.shockwave.pdfium.util.SizeF
            r0.<init>(r4, r3)
            return r0
    }

    public com.shockwave.pdfium.util.SizeF calculate(com.shockwave.pdfium.util.Size r5) {
            r4 = this;
            int r0 = r5.b()
            if (r0 <= 0) goto L56
            int r0 = r5.a()
            if (r0 > 0) goto Ld
            goto L56
        Ld:
            boolean r0 = r4.fitEachPage
            if (r0 == 0) goto L19
            com.shockwave.pdfium.util.Size r0 = r4.viewSize
            int r0 = r0.b()
            float r0 = (float) r0
            goto L22
        L19:
            int r0 = r5.b()
            float r0 = (float) r0
            float r1 = r4.widthRatio
            float r0 = r0 * r1
        L22:
            boolean r1 = r4.fitEachPage
            if (r1 == 0) goto L2e
            com.shockwave.pdfium.util.Size r1 = r4.viewSize
            int r1 = r1.a()
            float r1 = (float) r1
            goto L37
        L2e:
            int r1 = r5.a()
            float r1 = (float) r1
            float r2 = r4.heightRatio
            float r1 = r1 * r2
        L37:
            int[] r2 = com.github.barteksc.pdfviewer.util.PageSizeCalculator.AnonymousClass1.$SwitchMap$com$github$barteksc$pdfviewer$util$FitPolicy
            com.github.barteksc.pdfviewer.util.FitPolicy r3 = r4.fitPolicy
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L51
            r3 = 2
            if (r2 == r3) goto L4c
            com.shockwave.pdfium.util.SizeF r5 = r4.fitWidth(r5, r0)
            return r5
        L4c:
            com.shockwave.pdfium.util.SizeF r5 = r4.fitBoth(r5, r0, r1)
            return r5
        L51:
            com.shockwave.pdfium.util.SizeF r5 = r4.fitHeight(r5, r1)
            return r5
        L56:
            com.shockwave.pdfium.util.SizeF r5 = new com.shockwave.pdfium.util.SizeF
            r0 = 0
            r5.<init>(r0, r0)
            return r5
    }

    public com.shockwave.pdfium.util.SizeF getOptimalMaxHeightPageSize() {
            r1 = this;
            com.shockwave.pdfium.util.SizeF r0 = r1.optimalMaxHeightPageSize
            return r0
    }

    public com.shockwave.pdfium.util.SizeF getOptimalMaxWidthPageSize() {
            r1 = this;
            com.shockwave.pdfium.util.SizeF r0 = r1.optimalMaxWidthPageSize
            return r0
    }
}
