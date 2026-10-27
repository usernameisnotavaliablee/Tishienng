package com.github.barteksc.pdfviewer.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum SnapEdge extends java.lang.Enum<com.github.barteksc.pdfviewer.util.SnapEdge> {
    private static final /* synthetic */ com.github.barteksc.pdfviewer.util.SnapEdge[] $VALUES = null;
    public static final com.github.barteksc.pdfviewer.util.SnapEdge CENTER = null;
    public static final com.github.barteksc.pdfviewer.util.SnapEdge END = null;
    public static final com.github.barteksc.pdfviewer.util.SnapEdge NONE = null;
    public static final com.github.barteksc.pdfviewer.util.SnapEdge START = null;

    static {
            com.github.barteksc.pdfviewer.util.SnapEdge r0 = new com.github.barteksc.pdfviewer.util.SnapEdge
            java.lang.String r1 = "START"
            r2 = 0
            r0.<init>(r1, r2)
            com.github.barteksc.pdfviewer.util.SnapEdge.START = r0
            com.github.barteksc.pdfviewer.util.SnapEdge r1 = new com.github.barteksc.pdfviewer.util.SnapEdge
            java.lang.String r3 = "CENTER"
            r4 = 1
            r1.<init>(r3, r4)
            com.github.barteksc.pdfviewer.util.SnapEdge.CENTER = r1
            com.github.barteksc.pdfviewer.util.SnapEdge r3 = new com.github.barteksc.pdfviewer.util.SnapEdge
            java.lang.String r5 = "END"
            r6 = 2
            r3.<init>(r5, r6)
            com.github.barteksc.pdfviewer.util.SnapEdge.END = r3
            com.github.barteksc.pdfviewer.util.SnapEdge r5 = new com.github.barteksc.pdfviewer.util.SnapEdge
            java.lang.String r7 = "NONE"
            r8 = 3
            r5.<init>(r7, r8)
            com.github.barteksc.pdfviewer.util.SnapEdge.NONE = r5
            r7 = 4
            com.github.barteksc.pdfviewer.util.SnapEdge[] r7 = new com.github.barteksc.pdfviewer.util.SnapEdge[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.github.barteksc.pdfviewer.util.SnapEdge.$VALUES = r7
            return
    }

    SnapEdge(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.github.barteksc.pdfviewer.util.SnapEdge valueOf(java.lang.String r1) {
            java.lang.Class<com.github.barteksc.pdfviewer.util.SnapEdge> r0 = com.github.barteksc.pdfviewer.util.SnapEdge.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.barteksc.pdfviewer.util.SnapEdge r1 = (com.github.barteksc.pdfviewer.util.SnapEdge) r1
            return r1
    }

    public static com.github.barteksc.pdfviewer.util.SnapEdge[] values() {
            com.github.barteksc.pdfviewer.util.SnapEdge[] r0 = com.github.barteksc.pdfviewer.util.SnapEdge.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.barteksc.pdfviewer.util.SnapEdge[] r0 = (com.github.barteksc.pdfviewer.util.SnapEdge[]) r0
            return r0
    }
}
