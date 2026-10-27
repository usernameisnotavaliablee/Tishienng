package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class j extends master.flame.danmaku.danmaku.model.android.i {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void a(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            super.a(r2)
            java.lang.Object r2 = r2.e
            boolean r0 = r2 instanceof java.lang.ref.SoftReference
            if (r0 == 0) goto Le
            java.lang.ref.SoftReference r2 = (java.lang.ref.SoftReference) r2
            r2.clear()
        Le:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.i, master.flame.danmaku.danmaku.model.android.b
    public void b() {
            r0 = this;
            super.b()
            java.lang.System.gc()
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.i, master.flame.danmaku.danmaku.model.android.b
    public void e(master.flame.danmaku.danmaku.model.d r9, android.text.TextPaint r10, boolean r11) {
            r8 = this;
            java.lang.CharSequence r1 = r9.c
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L36
            if (r1 == 0) goto L36
            android.text.StaticLayout r0 = new android.text.StaticLayout
            java.lang.CharSequence r11 = r9.c
            float r11 = android.text.Layout.getDesiredWidth(r11, r10)
            double r2 = (double) r11
            double r2 = java.lang.Math.ceil(r2)
            int r3 = (int) r2
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            r6 = 0
            r7 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r10 = r0.getWidth()
            float r10 = (float) r10
            r9.p = r10
            int r10 = r0.getHeight()
            float r10 = (float) r10
            r9.q = r10
            java.lang.ref.SoftReference r10 = new java.lang.ref.SoftReference
            r10.<init>(r0)
            r9.e = r10
            return
        L36:
            r2 = r10
            super.e(r9, r2, r11)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void g(master.flame.danmaku.danmaku.model.d r1) {
            r0 = this;
            r0.a(r1)
            super.g(r1)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.i
    public void j(master.flame.danmaku.danmaku.model.d r2, java.lang.String r3, android.graphics.Canvas r4, float r5, float r6, android.graphics.Paint r7) {
            r1 = this;
            java.lang.Object r0 = r2.e
            if (r0 != 0) goto L7
            super.j(r2, r3, r4, r5, r6, r7)
        L7:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.i
    public void k(master.flame.danmaku.danmaku.model.d r17, java.lang.String r18, android.graphics.Canvas r19, float r20, float r21, android.text.TextPaint r22, boolean r23) {
            r16 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            java.lang.Object r3 = r0.e
            if (r3 != 0) goto Le
            super.k(r17, r18, r19, r20, r21, r22, r23)
            return
        Le:
            java.lang.ref.SoftReference r3 = (java.lang.ref.SoftReference) r3
            java.lang.Object r3 = r3.get()
            android.text.StaticLayout r3 = (android.text.StaticLayout) r3
            int r4 = r0.J
            r5 = r4 & 1
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            r8 = r4 & 2
            if (r8 == 0) goto L27
            r8 = 1
            goto L28
        L27:
            r8 = 0
        L28:
            if (r8 != 0) goto L2c
            if (r3 != 0) goto L7f
        L2c:
            if (r8 == 0) goto L32
            r3 = r4 & (-3)
            r0.J = r3
        L32:
            java.lang.CharSequence r9 = r0.c
            if (r9 == 0) goto L9d
            if (r5 == 0) goto L67
            android.text.StaticLayout r8 = new android.text.StaticLayout
            java.lang.CharSequence r3 = r0.c
            r10 = r22
            float r3 = android.text.Layout.getDesiredWidth(r3, r10)
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r11 = (int) r3
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_NORMAL
            r14 = 0
            r15 = 1
            r13 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            int r3 = r8.getWidth()
            float r3 = (float) r3
            r0.p = r3
            int r3 = r8.getHeight()
            float r3 = (float) r3
            r0.q = r3
            int r3 = r0.J
            r3 = r3 & (-2)
            r0.J = r3
        L65:
            r3 = r8
            goto L78
        L67:
            android.text.StaticLayout r8 = new android.text.StaticLayout
            float r3 = r0.p
            int r11 = (int) r3
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_NORMAL
            r14 = 0
            r15 = 1
            r13 = 1065353216(0x3f800000, float:1.0)
            r10 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L65
        L78:
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference
            r4.<init>(r3)
            r0.e = r4
        L7f:
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L95
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 == 0) goto L95
            r1.save()
            float r0 = r22.ascent()
            float r0 = r21 + r0
            r1.translate(r2, r0)
            r6 = 1
        L95:
            r3.draw(r1)
            if (r6 == 0) goto L9d
            r1.restore()
        L9d:
            return
    }
}
