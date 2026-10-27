package com.bxkj.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyTextView extends androidx.appcompat.widget.AppCompatTextView {
    private int c;

    public MyTextView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.c = r1
            return
    }

    public MyTextView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.c = r1
            return
    }

    public MyTextView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.c = r1
            return
    }

    protected void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            r2 = 0
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            float r1 = (float) r1
            android.content.Context r3 = r5.getContext()
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            float r3 = (float) r3
            r0.moveTo(r1, r3)
            android.content.Context r1 = r5.getContext()
            r3 = 1112014848(0x42480000, float:50.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r3, r1)
            float r1 = (float) r1
            android.content.Context r4 = r5.getContext()
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r4)
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            android.content.Context r1 = r5.getContext()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r3, r1)
            float r1 = (float) r1
            android.content.Context r2 = r5.getContext()
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            r0.close()
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L60
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r1 = r1.getColor()
            if (r1 == 0) goto L5c
            r5.c = r1
        L5c:
            r1 = 0
            r5.setBackgroundColor(r1)
        L60:
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            int r2 = r5.c
            r1.setColor(r2)
            r6.drawPath(r0, r1)
            r0 = 1109393408(0x42200000, float:40.0)
            android.content.Context r1 = r5.getContext()
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r0, r1)
            float r0 = (float) r0
            r1 = 1106247680(0x41f00000, float:30.0)
            android.content.Context r2 = r5.getContext()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            float r1 = (float) r1
            r2 = 1110704128(0x42340000, float:45.0)
            r6.rotate(r2, r0, r1)
            super/*android.widget.TextView*/.onDraw(r6)
            return
    }
}
