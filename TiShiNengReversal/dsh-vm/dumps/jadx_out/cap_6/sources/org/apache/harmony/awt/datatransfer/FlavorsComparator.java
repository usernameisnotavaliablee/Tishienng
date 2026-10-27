package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FlavorsComparator implements java.util.Comparator<java.awt.datatransfer.DataFlavor> {
    public FlavorsComparator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.awt.datatransfer.DataFlavor r5, java.awt.datatransfer.DataFlavor r6) {
            r4 = this;
            boolean r0 = r5.isFlavorTextType()
            r1 = 0
            if (r0 != 0) goto Le
            boolean r0 = r6.isFlavorTextType()
            if (r0 != 0) goto Le
            return r1
        Le:
            boolean r0 = r5.isFlavorTextType()
            r2 = -1
            if (r0 != 0) goto L1c
            boolean r0 = r6.isFlavorTextType()
            if (r0 == 0) goto L1c
            return r2
        L1c:
            boolean r0 = r5.isFlavorTextType()
            r3 = 1
            if (r0 == 0) goto L2a
            boolean r0 = r6.isFlavorTextType()
            if (r0 != 0) goto L2a
            return r3
        L2a:
            r0 = 2
            java.awt.datatransfer.DataFlavor[] r0 = new java.awt.datatransfer.DataFlavor[r0]
            r0[r1] = r5
            r0[r3] = r6
            java.awt.datatransfer.DataFlavor r6 = java.awt.datatransfer.DataFlavor.selectBestTextFlavor(r0)
            if (r6 != r5) goto L38
            return r2
        L38:
            return r3
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.awt.datatransfer.DataFlavor r1, java.awt.datatransfer.DataFlavor r2) {
            r0 = this;
            java.awt.datatransfer.DataFlavor r1 = (java.awt.datatransfer.DataFlavor) r1
            java.awt.datatransfer.DataFlavor r2 = (java.awt.datatransfer.DataFlavor) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }
}
