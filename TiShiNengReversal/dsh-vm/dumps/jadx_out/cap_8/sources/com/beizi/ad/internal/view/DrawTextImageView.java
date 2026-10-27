package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DrawTextImageView extends androidx.appcompat.widget.AppCompatImageView {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private float f7171b;

    /* renamed from: c, reason: collision with root package name */
    private float f7172c;

    /* renamed from: d, reason: collision with root package name */
    private float f7173d;

    /* renamed from: e, reason: collision with root package name */
    private int f7174e;

    /* renamed from: f, reason: collision with root package name */
    private int f7175f;

    public DrawTextImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = ""
            r0.a = r1
            r1 = 1106247680(0x41f00000, float:30.0)
            r0.f7171b = r1
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r0.f7172c = r1
            r0.f7173d = r1
            r1 = 0
            r0.f7174e = r1
            r1 = 3
            r0.f7175f = r1
            return
    }

    public DrawTextImageView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = ""
            r0.a = r1
            r1 = 1106247680(0x41f00000, float:30.0)
            r0.f7171b = r1
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r0.f7172c = r1
            r0.f7173d = r1
            r1 = 0
            r0.f7174e = r1
            r1 = 3
            r0.f7175f = r1
            return
    }

    public DrawTextImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = ""
            r0.a = r1
            r1 = 1106247680(0x41f00000, float:30.0)
            r0.f7171b = r1
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r0.f7172c = r1
            r0.f7173d = r1
            r1 = 0
            r0.f7174e = r1
            r1 = 3
            r0.f7175f = r1
            return
    }

    protected void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            super/*android.widget.ImageView*/.onDraw(r7)
            java.lang.String r0 = r6.a
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            android.content.res.Resources r1 = r6.getResources()
            int r2 = r6.f7174e
            int r1 = r1.getColor(r2)
            r0.setColor(r1)
            int r1 = r6.f7175f
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            float r1 = r6.f7171b
            r0.setTextSize(r1)
            java.lang.String r1 = r6.a
            float r2 = r6.f7172c
            r3 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L4a
            int r2 = r7.getWidth()
            float r2 = (float) r2
            float r4 = r6.f7171b
            java.lang.String r5 = r6.a
            int r5 = r5.length()
            float r5 = (float) r5
            float r4 = r4 * r5
            float r2 = r2 - r4
        L4a:
            float r4 = r6.f7173d
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L57
            int r3 = r7.getHeight()
            int r3 = r3 + (-50)
            float r4 = (float) r3
        L57:
            r7.drawText(r1, r2, r4, r0)
        L5a:
            return
    }

    public void setDrawLocalXY(float r1, float r2) {
            r0 = this;
            r0.f7172c = r1
            r0.f7173d = r2
            r0.drawableStateChanged()
            return
    }

    public void setDrawText(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            r0.drawableStateChanged()
            return
    }

    public void setDrawTextColorResourse(int r1) {
            r0 = this;
            r0.f7174e = r1
            r0.drawableStateChanged()
            return
    }

    public void setDrawTextSize(float r1) {
            r0 = this;
            r0.f7171b = r1
            r0.drawableStateChanged()
            return
    }

    public void setDrawTextStrokeWidth(int r1) {
            r0 = this;
            r0.f7175f = r1
            r0.drawableStateChanged()
            return
    }
}
