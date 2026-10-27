package com.autonavi.base.ae.gmap.glyph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GlyphBreakIterator {
    public static final int BREAK_BY_CHARACTER_SEQUENCES = 2;
    public static final int BREAK_BY_WORDS = 1;
    public java.util.ArrayList<java.lang.Integer> breakResult;
    public int mBreakMode;

    public GlyphBreakIterator(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.breakResult = r0
            r1.mBreakMode = r2
            return
    }

    public int[] setText(java.lang.String r6) {
            r5 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList<java.lang.Integer> r0 = r5.breakResult
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15
            java.util.ArrayList<java.lang.Integer> r0 = r5.breakResult
            r0.clear()
        L15:
            int r0 = r5.mBreakMode
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 == r2) goto L1e
            goto L27
        L1e:
            java.text.BreakIterator r1 = java.text.BreakIterator.getCharacterInstance()
            goto L27
        L23:
            java.text.BreakIterator r1 = java.text.BreakIterator.getWordInstance()
        L27:
            r1.setText(r6)
            int r0 = r1.first()
        L2e:
            int r2 = r1.next()
            r4 = r2
            r2 = r0
            r0 = r4
            r3 = -1
            if (r0 == r3) goto L42
            java.util.ArrayList<java.lang.Integer> r3 = r5.breakResult
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L2e
        L42:
            java.util.ArrayList<java.lang.Integer> r0 = r5.breakResult
            int r6 = r6.length()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.add(r6)
            java.util.ArrayList<java.lang.Integer> r6 = r5.breakResult
            int r6 = r6.size()
            java.lang.Integer[] r0 = new java.lang.Integer[r6]
            java.util.ArrayList<java.lang.Integer> r1 = r5.breakResult
            r1.toArray(r0)
            int[] r1 = new int[r6]
            r2 = 0
        L5f:
            if (r2 >= r6) goto L6c
            r3 = r0[r2]
            int r3 = r3.intValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5f
        L6c:
            return r1
    }
}
