package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class i extends master.flame.danmaku.danmaku.model.android.b {
    private static final java.util.Map<java.lang.Float, java.lang.Float> b = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            master.flame.danmaku.danmaku.model.android.i.b = r0
            return
    }

    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void b() {
            r1 = this;
            java.util.Map<java.lang.Float, java.lang.Float> r0 = master.flame.danmaku.danmaku.model.android.i.b
            r0.clear()
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void d(master.flame.danmaku.danmaku.model.d r17, android.graphics.Canvas r18, float r19, float r20, boolean r21, master.flame.danmaku.danmaku.model.android.a.C0124a r22) {
            r16 = this;
            r1 = r17
            r7 = r21
            r8 = r22
            int r0 = r1.n
            float r2 = (float) r0
            float r2 = r19 + r2
            float r0 = (float) r0
            float r0 = r20 + r0
            int r3 = r1.m
            if (r3 == 0) goto L16
            r3 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 + r3
            float r0 = r0 + r3
        L16:
            r9 = r0
            r10 = r2
            r8.j(r7)
            android.text.TextPaint r6 = r8.l(r1, r7)
            r16.i(r17, r18, r19, r20)
            java.lang.String[] r11 = r1.d
            r12 = 1
            r13 = 0
            if (r11 == 0) goto Lc9
            int r0 = r11.length
            if (r0 != r12) goto L66
            boolean r0 = r8.o(r1)
            if (r0 == 0) goto L52
            r8.g(r1, r6, r12)
            float r0 = r6.ascent()
            float r0 = r9 - r0
            boolean r2 = r8.s
            if (r2 == 0) goto L47
            float r2 = r8.k
            float r2 = r2 + r10
            float r3 = r8.l
            float r0 = r0 + r3
            r4 = r2
        L45:
            r5 = r0
            goto L49
        L47:
            r4 = r10
            goto L45
        L49:
            r2 = r11[r13]
            r0 = r16
            r3 = r18
            r0.j(r1, r2, r3, r4, r5, r6)
        L52:
            r8.g(r1, r6, r13)
            r2 = r11[r13]
            float r0 = r6.ascent()
            float r5 = r9 - r0
            r0 = r16
            r3 = r18
            r4 = r10
            r0.k(r1, r2, r3, r4, r5, r6, r7)
            goto Lc7
        L66:
            float r0 = r1.q
            int r2 = r1.n
            int r2 = r2 * 2
            float r2 = (float) r2
            float r0 = r0 - r2
            int r2 = r11.length
            float r2 = (float) r2
            float r14 = r0 / r2
            r15 = 0
        L73:
            int r0 = r11.length
            if (r15 >= r0) goto Lc7
            r0 = r11[r15]
            if (r0 == 0) goto Lc4
            int r0 = r0.length()
            if (r0 != 0) goto L81
            goto Lc4
        L81:
            boolean r0 = r8.o(r1)
            if (r0 == 0) goto Lab
            r8.g(r1, r6, r12)
            float r0 = (float) r15
            float r0 = r0 * r14
            float r0 = r0 + r9
            float r2 = r6.ascent()
            float r0 = r0 - r2
            boolean r2 = r8.s
            if (r2 == 0) goto La0
            float r2 = r8.k
            float r2 = r2 + r10
            float r3 = r8.l
            float r0 = r0 + r3
            r4 = r2
        L9e:
            r5 = r0
            goto La2
        La0:
            r4 = r10
            goto L9e
        La2:
            r2 = r11[r15]
            r0 = r16
            r3 = r18
            r0.j(r1, r2, r3, r4, r5, r6)
        Lab:
            r8.g(r1, r6, r13)
            r2 = r11[r15]
            float r0 = (float) r15
            float r0 = r0 * r14
            float r0 = r0 + r9
            float r3 = r6.ascent()
            float r5 = r0 - r3
            r0 = r16
            r3 = r18
            r7 = r21
            r4 = r10
            r0.k(r1, r2, r3, r4, r5, r6, r7)
        Lc4:
            int r15 = r15 + 1
            goto L73
        Lc7:
            r6 = r1
            goto L104
        Lc9:
            boolean r0 = r8.o(r1)
            if (r0 == 0) goto Lef
            r8.g(r1, r6, r12)
            float r0 = r6.ascent()
            float r0 = r9 - r0
            boolean r2 = r8.s
            if (r2 == 0) goto Le5
            float r2 = r8.k
            float r2 = r2 + r10
            float r3 = r8.l
            float r0 = r0 + r3
            r4 = r2
        Le3:
            r5 = r0
            goto Le7
        Le5:
            r4 = r10
            goto Le3
        Le7:
            r2 = 0
            r0 = r16
            r3 = r18
            r0.j(r1, r2, r3, r4, r5, r6)
        Lef:
            r8.g(r1, r6, r13)
            float r0 = r6.ascent()
            float r5 = r9 - r0
            r2 = 0
            r0 = r16
            r3 = r18
            r7 = r21
            r4 = r10
            r0.k(r1, r2, r3, r4, r5, r6, r7)
            goto Lc7
        L104:
            int r0 = r6.k
            if (r0 == 0) goto L121
            android.graphics.Paint r5 = r8.n(r6)
            float r0 = r6.q
            float r0 = r20 + r0
            int r1 = r8.h
            float r1 = (float) r1
            float r2 = r0 - r1
            float r0 = r6.p
            float r3 = r19 + r0
            r4 = r2
            r0 = r18
            r1 = r19
            r0.drawLine(r1, r2, r3, r4, r5)
        L121:
            int r0 = r6.m
            if (r0 == 0) goto L13a
            android.graphics.Paint r5 = r8.k(r6)
            float r0 = r6.p
            float r3 = r19 + r0
            float r0 = r6.q
            float r4 = r20 + r0
            r0 = r18
            r1 = r19
            r2 = r20
            r0.drawRect(r1, r2, r3, r4, r5)
        L13a:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void e(master.flame.danmaku.danmaku.model.d r7, android.text.TextPaint r8, boolean r9) {
            r6 = this;
            r9 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            java.lang.String[] r1 = r7.d
            if (r1 != 0) goto L23
            java.lang.CharSequence r1 = r7.c
            if (r1 != 0) goto Le
            goto L1a
        Le:
            java.lang.String r9 = r1.toString()
            float r9 = r8.measureText(r9)
            java.lang.Float r0 = r6.l(r7, r8)
        L1a:
            r7.p = r9
            float r8 = r0.floatValue()
            r7.q = r8
            return
        L23:
            java.lang.Float r0 = r6.l(r7, r8)
            java.lang.String[] r1 = r7.d
            int r2 = r1.length
            r3 = 0
        L2b:
            if (r3 >= r2) goto L40
            r4 = r1[r3]
            int r5 = r4.length()
            if (r5 <= 0) goto L3d
            float r4 = r8.measureText(r4)
            float r9 = java.lang.Math.max(r4, r9)
        L3d:
            int r3 = r3 + 1
            goto L2b
        L40:
            r7.p = r9
            java.lang.String[] r8 = r7.d
            int r8 = r8.length
            float r8 = (float) r8
            float r9 = r0.floatValue()
            float r8 = r8 * r9
            r7.q = r8
            return
    }

    protected void i(master.flame.danmaku.danmaku.model.d r1, android.graphics.Canvas r2, float r3, float r4) {
            r0 = this;
            return
    }

    protected void j(master.flame.danmaku.danmaku.model.d r1, java.lang.String r2, android.graphics.Canvas r3, float r4, float r5, android.graphics.Paint r6) {
            r0 = this;
            if (r2 == 0) goto L6
            r3.drawText(r2, r4, r5, r6)
            return
        L6:
            java.lang.CharSequence r1 = r1.c
            java.lang.String r1 = r1.toString()
            r3.drawText(r1, r4, r5, r6)
            return
    }

    protected void k(master.flame.danmaku.danmaku.model.d r1, java.lang.String r2, android.graphics.Canvas r3, float r4, float r5, android.text.TextPaint r6, boolean r7) {
            r0 = this;
            if (r2 == 0) goto L6
            r3.drawText(r2, r4, r5, r6)
            return
        L6:
            java.lang.CharSequence r1 = r1.c
            java.lang.String r1 = r1.toString()
            r3.drawText(r1, r4, r5, r6)
            return
    }

    protected java.lang.Float l(master.flame.danmaku.danmaku.model.d r4, android.graphics.Paint r5) {
            r3 = this;
            float r4 = r5.getTextSize()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.util.Map<java.lang.Float, java.lang.Float> r0 = master.flame.danmaku.danmaku.model.android.i.b
            java.lang.Object r1 = r0.get(r4)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 != 0) goto L26
            android.graphics.Paint$FontMetrics r5 = r5.getFontMetrics()
            float r1 = r5.descent
            float r2 = r5.ascent
            float r1 = r1 - r2
            float r5 = r5.leading
            float r1 = r1 + r5
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            r0.put(r4, r5)
            return r5
        L26:
            return r1
    }
}
