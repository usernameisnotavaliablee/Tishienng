package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class v3 extends com.acse.ottn.c0 {
    public v3(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public v3(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public v3(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Paint r1 = r0.f2203b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            super.onDraw(r6)
            com.acse.ottn.v1 r0 = r5.a
            int r0 = r0.d()
            r1 = 1
            if (r0 > r1) goto Ld
            return
        Ld:
            android.graphics.Paint r0 = r5.f2203b
            com.acse.ottn.v1 r1 = r5.a
            int r1 = r1.g()
            r0.setColor(r1)
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = r6.getWidth()
            float r1 = (float) r1
            com.acse.ottn.v1 r2 = r5.a
            int r2 = r2.c()
            float r2 = (float) r2
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            com.acse.ottn.v1 r1 = r5.a
            int r1 = r1.i()
            float r1 = (float) r1
            com.acse.ottn.v1 r2 = r5.a
            int r2 = r2.i()
            float r2 = (float) r2
            android.graphics.Paint r4 = r5.f2203b
            r6.drawRoundRect(r0, r1, r2, r4)
            android.graphics.Paint r0 = r5.f2203b
            com.acse.ottn.v1 r1 = r5.a
            int r1 = r1.j()
            r0.setColor(r1)
            com.acse.ottn.v1 r0 = r5.a
            int r0 = r0.a()
            com.acse.ottn.v1 r1 = r5.a
            int r1 = r1.k()
            int r0 = r0 * r1
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = (float) r0
            com.acse.ottn.v1 r4 = r5.a
            int r4 = r4.k()
            int r0 = r0 + r4
            float r0 = (float) r0
            com.acse.ottn.v1 r4 = r5.a
            int r4 = r4.c()
            float r4 = (float) r4
            r1.<init>(r2, r3, r0, r4)
            com.acse.ottn.v1 r0 = r5.a
            int r0 = r0.i()
            float r0 = (float) r0
            com.acse.ottn.v1 r2 = r5.a
            int r2 = r2.i()
            float r2 = (float) r2
            android.graphics.Paint r3 = r5.f2203b
            r6.drawRoundRect(r1, r0, r2, r3)
            return
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            com.acse.ottn.v1 r1 = r0.a
            int r1 = r1.d()
            r2 = 1
            if (r1 > r2) goto Ld
            return
        Ld:
            com.acse.ottn.v1 r2 = r0.a
            int r2 = r2.k()
            int r2 = r2 * r1
            com.acse.ottn.v1 r1 = r0.a
            int r1 = r1.c()
            r0.setMeasuredDimension(r2, r1)
            return
    }
}
