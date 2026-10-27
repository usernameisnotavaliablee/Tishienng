package com.github.barteksc.pdfviewer.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum FitPolicy extends java.lang.Enum<com.github.barteksc.pdfviewer.util.FitPolicy> {
    private static final /* synthetic */ com.github.barteksc.pdfviewer.util.FitPolicy[] $VALUES = null;
    public static final com.github.barteksc.pdfviewer.util.FitPolicy BOTH = null;
    public static final com.github.barteksc.pdfviewer.util.FitPolicy HEIGHT = null;
    public static final com.github.barteksc.pdfviewer.util.FitPolicy WIDTH = null;

    static {
            com.github.barteksc.pdfviewer.util.FitPolicy r0 = new com.github.barteksc.pdfviewer.util.FitPolicy
            java.lang.String r1 = "WIDTH"
            r2 = 0
            r0.<init>(r1, r2)
            com.github.barteksc.pdfviewer.util.FitPolicy.WIDTH = r0
            com.github.barteksc.pdfviewer.util.FitPolicy r1 = new com.github.barteksc.pdfviewer.util.FitPolicy
            java.lang.String r3 = "HEIGHT"
            r4 = 1
            r1.<init>(r3, r4)
            com.github.barteksc.pdfviewer.util.FitPolicy.HEIGHT = r1
            com.github.barteksc.pdfviewer.util.FitPolicy r3 = new com.github.barteksc.pdfviewer.util.FitPolicy
            java.lang.String r5 = "BOTH"
            r6 = 2
            r3.<init>(r5, r6)
            com.github.barteksc.pdfviewer.util.FitPolicy.BOTH = r3
            r5 = 3
            com.github.barteksc.pdfviewer.util.FitPolicy[] r5 = new com.github.barteksc.pdfviewer.util.FitPolicy[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.github.barteksc.pdfviewer.util.FitPolicy.$VALUES = r5
            return
    }

    FitPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.github.barteksc.pdfviewer.util.FitPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.github.barteksc.pdfviewer.util.FitPolicy> r0 = com.github.barteksc.pdfviewer.util.FitPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.barteksc.pdfviewer.util.FitPolicy r1 = (com.github.barteksc.pdfviewer.util.FitPolicy) r1
            return r1
    }

    public static com.github.barteksc.pdfviewer.util.FitPolicy[] values() {
            com.github.barteksc.pdfviewer.util.FitPolicy[] r0 = com.github.barteksc.pdfviewer.util.FitPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.barteksc.pdfviewer.util.FitPolicy[] r0 = (com.github.barteksc.pdfviewer.util.FitPolicy[]) r0
            return r0
    }
}
