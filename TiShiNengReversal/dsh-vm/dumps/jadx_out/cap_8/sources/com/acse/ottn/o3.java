package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o3 extends com.acse.ottn.c0 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f2556d;

    public o3(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public o3(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public o3(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2556d = r1
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r9) {
            r8 = this;
            super.onDraw(r9)
            com.acse.ottn.v1 r0 = r8.a
            int r0 = r0.d()
            r1 = 1
            if (r0 > r1) goto Ld
            goto L70
        Ld:
            r1 = 0
            r2 = 0
            r3 = 0
        L10:
            if (r2 >= r0) goto L70
            android.graphics.Paint r4 = r8.f2203b
            com.acse.ottn.v1 r5 = r8.a
            int r5 = r5.a()
            if (r5 != r2) goto L23
            com.acse.ottn.v1 r5 = r8.a
            int r5 = r5.j()
            goto L29
        L23:
            com.acse.ottn.v1 r5 = r8.a
            int r5 = r5.g()
        L29:
            r4.setColor(r5)
            com.acse.ottn.v1 r4 = r8.a
            int r4 = r4.a()
            if (r4 != r2) goto L3b
            com.acse.ottn.v1 r4 = r8.a
            int r4 = r4.k()
            goto L41
        L3b:
            com.acse.ottn.v1 r4 = r8.a
            int r4 = r4.h()
        L41:
            android.graphics.RectF r5 = r8.f2556d
            float r6 = (float) r4
            float r6 = r6 + r3
            com.acse.ottn.v1 r7 = r8.a
            int r7 = r7.c()
            float r7 = (float) r7
            r5.set(r3, r1, r6, r7)
            com.acse.ottn.v1 r5 = r8.a
            int r5 = r5.e()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r3 = r3 + r4
            android.graphics.RectF r4 = r8.f2556d
            com.acse.ottn.v1 r5 = r8.a
            int r5 = r5.i()
            float r5 = (float) r5
            com.acse.ottn.v1 r6 = r8.a
            int r6 = r6.i()
            float r6 = (float) r6
            android.graphics.Paint r7 = r8.f2203b
            r9.drawRoundRect(r4, r5, r6, r7)
            int r2 = r2 + 1
            goto L10
        L70:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            com.acse.ottn.v1 r2 = r1.a
            int r2 = r2.d()
            r3 = 1
            if (r2 > r3) goto Ld
            return
        Ld:
            com.acse.ottn.v1 r0 = r1.a
            int r0 = r0.e()
            int r2 = r2 - r3
            int r0 = r0 * r2
            com.acse.ottn.v1 r3 = r1.a
            int r3 = r3.h()
            int r3 = r3 * r2
            int r0 = r0 + r3
            com.acse.ottn.v1 r2 = r1.a
            int r2 = r2.k()
            int r0 = r0 + r2
            com.acse.ottn.v1 r2 = r1.a
            int r2 = r2.c()
            r1.setMeasuredDimension(r0, r2)
            return
    }
}
