package com.google.android.material.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DrawableAlphaProperty extends android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> {
    public static final android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> DRAWABLE_ALPHA_COMPAT = null;
    private final java.util.WeakHashMap<android.graphics.drawable.Drawable, java.lang.Integer> alphaCache;

    static {
            com.google.android.material.animation.DrawableAlphaProperty r0 = new com.google.android.material.animation.DrawableAlphaProperty
            r0.<init>()
            com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT = r0
            return
    }

    private DrawableAlphaProperty() {
            r2 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.String r1 = "drawableAlphaCompat"
            r2.<init>(r0, r1)
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.alphaCache = r0
            return
    }

    @androidx.annotation.Nullable
    /* renamed from: get, reason: avoid collision after fix types in other method */
    public java.lang.Integer get2(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            r0 = this;
            int r1 = r1.getAlpha()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @Override // android.util.Property
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Integer get(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Integer r1 = r0.get2(r1)
            return r1
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.NonNull java.lang.Integer r2) {
            r0 = this;
            int r2 = r2.intValue()
            r1.setAlpha(r2)
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.NonNull java.lang.Integer r2) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.set2(r1, r2)
            return
    }
}
