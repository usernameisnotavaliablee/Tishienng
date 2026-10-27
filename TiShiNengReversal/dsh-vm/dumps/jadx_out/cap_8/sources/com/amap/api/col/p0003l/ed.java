package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ed extends android.view.View {

    /* renamed from: b, reason: collision with root package name */
    public static final int f3195b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3196c = 0;
    private android.graphics.Paint a;

    static {
            r0 = 235(0xeb, float:3.3E-43)
            r1 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r1, r0, r0, r0)
            com.amap.api.col.p0003l.ed.f3195b = r0
            r0 = 21
            int r0 = android.graphics.Color.argb(r1, r0, r0, r0)
            com.amap.api.col.p0003l.ed.f3196c = r0
            return
    }

    public ed(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.a = r2
            r0 = 1
            r2.setAntiAlias(r0)
            android.graphics.Paint r2 = r1.a
            int r0 = com.amap.api.col.p0003l.ed.f3195b
            r2.setColor(r0)
            return
    }

    public final void a() {
            r1 = this;
            r0 = 8
            r1.setVisibility(r0)
            return
    }

    public final void b(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.a
            if (r0 == 0) goto La
            r0.setColor(r2)
            r1.postInvalidate()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            int r0 = r7.getWidth()
            float r4 = (float) r0
            int r0 = r7.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r7.a
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
            return
    }
}
