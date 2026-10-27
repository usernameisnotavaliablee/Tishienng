package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SkipView extends android.widget.TextView {
    private int a;
    private android.text.TextPaint b;
    private float c;
    private float d;
    private boolean e;
    private android.graphics.RectF f;
    private android.graphics.RectF g;
    private int h;
    private boolean i;
    private android.util.SparseIntArray j;
    private final com.beizi.fusion.widget.SkipView.a k;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface a {
        int a(int r1, android.graphics.RectF r2);
    }

    public SkipView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1101004800(0x41a00000, float:20.0)
            r1.d = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f = r0
            r0 = 1
            r1.i = r0
            com.beizi.fusion.widget.SkipView$1 r0 = new com.beizi.fusion.widget.SkipView$1
            r0.<init>(r1)
            r1.k = r0
            r1.init(r2)
            return
    }

    public SkipView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 1101004800(0x41a00000, float:20.0)
            r0.d = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r0.f = r2
            r2 = 1
            r0.i = r2
            com.beizi.fusion.widget.SkipView$1 r2 = new com.beizi.fusion.widget.SkipView$1
            r2.<init>(r0)
            r0.k = r2
            r0.init(r1)
            return
    }

    public SkipView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 1101004800(0x41a00000, float:20.0)
            r0.d = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r0.f = r2
            r2 = 1
            r0.i = r2
            com.beizi.fusion.widget.SkipView$1 r2 = new com.beizi.fusion.widget.SkipView$1
            r2.<init>(r0)
            r0.k = r2
            r0.init(r1)
            return
    }

    private int a(int r3, int r4, com.beizi.fusion.widget.SkipView.a r5, android.graphics.RectF r6) {
            r2 = this;
            boolean r0 = r2.i
            if (r0 != 0) goto L9
            int r3 = b(r3, r4, r5, r6)
            return r3
        L9:
            java.lang.CharSequence r0 = r2.getText()
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L15
            r0 = 0
            goto L19
        L15:
            int r0 = r0.length()
        L19:
            android.util.SparseIntArray r1 = r2.j
            int r1 = r1.get(r0)
            if (r1 == 0) goto L22
            return r1
        L22:
            int r3 = b(r3, r4, r5, r6)
            android.util.SparseIntArray r4 = r2.j
            r4.put(r0, r3)
            return r3
    }

    static /* synthetic */ android.text.TextPaint a(com.beizi.fusion.widget.SkipView r0) {
            android.text.TextPaint r0 = r0.b
            return r0
    }

    private void a() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            r1.a(r0)
            return
    }

    private void a(android.content.Context r3, int r4) {
            r2 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r1 = "#80000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            r1 = 1
            if (r4 != r1) goto L1a
            java.lang.String r4 = "#C0C0C0"
            int r4 = android.graphics.Color.parseColor(r4)
            r0.setStroke(r1, r4)
        L1a:
            r4 = 1110704128(0x42340000, float:45.0)
            int r3 = com.beizi.fusion.tool.ap.a(r3, r4)
            float r3 = (float) r3
            r0.setCornerRadius(r3)
            r2.setBackgroundDrawable(r0)
            return
    }

    private void a(java.lang.String r5) {
            r4 = this;
            boolean r5 = r4.e
            if (r5 != 0) goto L5
            return
        L5:
            float r5 = r4.d
            int r5 = (int) r5
            int r0 = r4.getMeasuredHeight()
            int r1 = r4.getCompoundPaddingBottom()
            int r0 = r0 - r1
            int r1 = r4.getCompoundPaddingTop()
            int r0 = r0 - r1
            int r1 = r4.a
            int r0 = r0 - r1
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getCompoundPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getCompoundPaddingRight()
            int r1 = r1 - r2
            android.content.Context r2 = r4.getContext()
            r3 = 1090519040(0x41000000, float:8.0)
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)
            int r1 = r1 - r2
            r4.h = r1
            android.graphics.RectF r2 = r4.g
            float r1 = (float) r1
            r2.right = r1
            float r0 = (float) r0
            r2.bottom = r0
            float r0 = r4.c
            int r0 = (int) r0
            com.beizi.fusion.widget.SkipView$a r1 = r4.k
            int r5 = r4.a(r5, r0, r1, r2)
            float r5 = (float) r5
            r0 = 0
            super.setTextSize(r0, r5)
            return
    }

    private static int b(int r3, int r4, com.beizi.fusion.widget.SkipView.a r5, android.graphics.RectF r6) {
            int r4 = r4 + (-1)
            r0 = r4
            r4 = r3
        L4:
            if (r3 > r0) goto L1c
            int r4 = r3 + r0
            int r4 = r4 >>> 1
            int r1 = r5.a(r4, r6)
            if (r1 >= 0) goto L16
            int r4 = r4 + 1
            r2 = r4
            r4 = r3
            r3 = r2
            goto L4
        L16:
            if (r1 <= 0) goto L1c
            int r4 = r4 + (-1)
            r0 = r4
            goto L4
        L1c:
            return r4
    }

    static /* synthetic */ android.graphics.RectF b(com.beizi.fusion.widget.SkipView r0) {
            android.graphics.RectF r0 = r0.f
            return r0
    }

    public void init(android.content.Context r3) {
            r2 = this;
            r0 = 17
            r2.setGravity(r0)
            r0 = 1
            r2.setLines(r0)
            r2.setMaxLines(r0)
            r1 = -1
            r2.setTextColor(r1)
            r1 = 0
            r2.a(r3, r1)
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r2.b = r3
            android.text.TextPaint r1 = r2.getPaint()
            r3.set(r1)
            float r3 = r2.getTextSize()
            r2.c = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r2.g = r3
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            r2.j = r3
            r2.e = r0
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r1 = 53
            r3.<init>(r0, r0, r1)
            r2.setLayoutParams(r3)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.util.SparseIntArray r0 = r1.j
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            super.onSizeChanged(r2, r3, r4, r5)
            if (r2 != r4) goto L10
            if (r3 == r5) goto Lf
            goto L10
        Lf:
            return
        L10:
            r1.a()
            return
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            r0.a()
            return
    }

    public void setData(int r2, int r3) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            r1.a(r0, r2)
            r1.a = r3
            return
    }
}
