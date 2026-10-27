package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j0 extends com.acse.ottn.c0 {

    /* renamed from: d, reason: collision with root package name */
    public int f2392d;

    /* renamed from: e, reason: collision with root package name */
    public int f2393e;

    /* renamed from: f, reason: collision with root package name */
    public int f2394f;

    public j0(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public j0(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public j0(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.acse.ottn.v1 r1 = r0.a
            int r1 = r1.h()
            int r1 = r1 / 2
            r0.f2392d = r1
            com.acse.ottn.v1 r1 = r0.a
            int r1 = r1.k()
            int r1 = r1 / 2
            r0.f2393e = r1
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
            goto L64
        Ld:
            r1 = 0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L64
            android.graphics.Paint r3 = r8.f2203b
            com.acse.ottn.v1 r4 = r8.a
            int r4 = r4.a()
            if (r4 != r2) goto L22
            com.acse.ottn.v1 r4 = r8.a
            int r4 = r4.j()
            goto L28
        L22:
            com.acse.ottn.v1 r4 = r8.a
            int r4 = r4.g()
        L28:
            r3.setColor(r4)
            com.acse.ottn.v1 r3 = r8.a
            int r3 = r3.a()
            if (r3 != r2) goto L3a
            com.acse.ottn.v1 r3 = r8.a
            int r3 = r3.k()
            goto L40
        L3a:
            com.acse.ottn.v1 r3 = r8.a
            int r3 = r3.h()
        L40:
            com.acse.ottn.v1 r4 = r8.a
            int r4 = r4.a()
            if (r4 != r2) goto L4b
            int r4 = r8.f2393e
            goto L4d
        L4b:
            int r4 = r8.f2392d
        L4d:
            float r4 = (float) r4
            float r5 = r1 + r4
            int r6 = r8.f2394f
            float r6 = (float) r6
            android.graphics.Paint r7 = r8.f2203b
            r9.drawCircle(r5, r6, r4, r7)
            com.acse.ottn.v1 r4 = r8.a
            int r4 = r4.e()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r1 = r1 + r3
            int r2 = r2 + 1
            goto Lf
        L64:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            com.acse.ottn.v1 r3 = r2.a
            int r3 = r3.d()
            r4 = 1
            if (r3 > r4) goto Ld
            return
        Ld:
            com.acse.ottn.v1 r0 = r2.a
            int r0 = r0.h()
            int r0 = r0 / 2
            r2.f2392d = r0
            com.acse.ottn.v1 r0 = r2.a
            int r0 = r0.k()
            int r0 = r0 / 2
            r2.f2393e = r0
            int r1 = r2.f2392d
            int r0 = java.lang.Math.max(r0, r1)
            r2.f2394f = r0
            int r3 = r3 - r4
            com.acse.ottn.v1 r4 = r2.a
            int r4 = r4.e()
            int r4 = r4 * r3
            com.acse.ottn.v1 r0 = r2.a
            int r0 = r0.k()
            int r4 = r4 + r0
            com.acse.ottn.v1 r0 = r2.a
            int r0 = r0.h()
            int r0 = r0 * r3
            int r4 = r4 + r0
            com.acse.ottn.v1 r3 = r2.a
            int r3 = r3.h()
            com.acse.ottn.v1 r0 = r2.a
            int r0 = r0.k()
            int r3 = java.lang.Math.max(r3, r0)
            r2.setMeasuredDimension(r4, r3)
            return
    }
}
