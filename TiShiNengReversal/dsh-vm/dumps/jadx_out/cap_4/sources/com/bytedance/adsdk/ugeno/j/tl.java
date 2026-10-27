package com.bytedance.adsdk.ugeno.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl implements com.bytedance.adsdk.ugeno.j.ae {
    private float cw;
    private android.view.View j;

    /* renamed from: m, reason: collision with root package name */
    private float f1965m;

    /* renamed from: r, reason: collision with root package name */
    private float f1966r;
    private float up;
    private float xt;

    public tl(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    public void cw(float r2) {
            r1 = this;
            android.view.View r0 = r1.j
            if (r0 != 0) goto L5
            return
        L5:
            r1.f1966r = r2
            r0.postInvalidate()
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getRipple() {
            r1 = this;
            float r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getRubIn() {
            r1 = this;
            float r0 = r1.f1965m
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getShine() {
            r1 = this;
            float r0 = r1.f1966r
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getStretch() {
            r1 = this;
            float r0 = r1.up
            return r0
    }

    public float j() {
            r1 = this;
            float r0 = r1.xt
            return r0
    }

    public void j(float r3) {
            r2 = this;
            android.view.View r0 = r2.j
            if (r0 != 0) goto L5
            goto L14
        L5:
            r2.xt = r3
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L14
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.setCornerRadius(r3)
        L14:
            return
    }

    public void j(int r3) {
            r2 = this;
            android.view.View r0 = r2.j
            if (r0 != 0) goto L5
            goto L20
        L5:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L13
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.setColor(r3)
            return
        L13:
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L20
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            r0.setColor(r3)
        L20:
            return
    }

    public void r(float r1) {
            r0 = this;
            r0.up = r1
            android.view.View r1 = r0.j
            r1.postInvalidate()
            return
    }

    public void up(float r1) {
            r0 = this;
            r0.f1965m = r1
            android.view.View r1 = r0.j
            r1.postInvalidate()
            return
    }

    public void xt(float r2) {
            r1 = this;
            android.view.View r0 = r1.j
            if (r0 != 0) goto L5
            return
        L5:
            r1.cw = r2
            r0.postInvalidate()
            return
    }
}
