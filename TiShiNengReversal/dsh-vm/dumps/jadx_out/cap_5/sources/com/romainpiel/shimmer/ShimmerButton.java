package com.romainpiel.shimmer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ShimmerButton extends android.widget.Button implements com.romainpiel.shimmer.c {
    private com.romainpiel.shimmer.d a;

    public ShimmerButton(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            com.romainpiel.shimmer.d r3 = new com.romainpiel.shimmer.d
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            r3.<init>(r2, r0, r1)
            r2.a = r3
            int r0 = r2.getCurrentTextColor()
            r3.l(r0)
            return
    }

    public ShimmerButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            com.romainpiel.shimmer.d r2 = new com.romainpiel.shimmer.d
            android.text.TextPaint r0 = r1.getPaint()
            r2.<init>(r1, r0, r3)
            r1.a = r2
            int r3 = r1.getCurrentTextColor()
            r2.l(r3)
            return
    }

    public ShimmerButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.romainpiel.shimmer.d r1 = new com.romainpiel.shimmer.d
            android.text.TextPaint r3 = r0.getPaint()
            r1.<init>(r0, r3, r2)
            r0.a = r1
            int r2 = r0.getCurrentTextColor()
            r1.l(r2)
            return
    }

    @Override // com.romainpiel.shimmer.c
    public boolean a() {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            boolean r0 = r0.e()
            return r0
    }

    @Override // com.romainpiel.shimmer.c
    public boolean b() {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            boolean r0 = r0.f()
            return r0
    }

    @Override // com.romainpiel.shimmer.c
    public float getGradientX() {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            float r0 = r0.a()
            return r0
    }

    @Override // com.romainpiel.shimmer.c
    public int getPrimaryColor() {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            int r0 = r0.b()
            return r0
    }

    @Override // com.romainpiel.shimmer.c
    public int getReflectionColor() {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            int r0 = r0.c()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            if (r0 == 0) goto L7
            r0.g()
        L7:
            super.onDraw(r2)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            com.romainpiel.shimmer.d r1 = r0.a
            if (r1 == 0) goto La
            r1.h()
        La:
            return
    }

    @Override // com.romainpiel.shimmer.c
    public void setAnimationSetupCallback(com.romainpiel.shimmer.d.a r2) {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            r0.j(r2)
            return
    }

    @Override // com.romainpiel.shimmer.c
    public void setGradientX(float r2) {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            r0.k(r2)
            return
    }

    @Override // com.romainpiel.shimmer.c
    public void setPrimaryColor(int r2) {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            r0.l(r2)
            return
    }

    @Override // com.romainpiel.shimmer.c
    public void setReflectionColor(int r2) {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            r0.m(r2)
            return
    }

    @Override // com.romainpiel.shimmer.c
    public void setShimmering(boolean r2) {
            r1 = this;
            com.romainpiel.shimmer.d r0 = r1.a
            r0.n(r2)
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(int r2) {
            r1 = this;
            super.setTextColor(r2)
            com.romainpiel.shimmer.d r2 = r1.a
            if (r2 == 0) goto Le
            int r0 = r1.getCurrentTextColor()
            r2.l(r0)
        Le:
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            super.setTextColor(r2)
            com.romainpiel.shimmer.d r2 = r1.a
            if (r2 == 0) goto Le
            int r0 = r1.getCurrentTextColor()
            r2.l(r0)
        Le:
            return
    }
}
