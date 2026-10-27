package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class b<T extends android.graphics.drawable.Drawable> implements com.bumptech.glide.load.engine.u<T>, com.bumptech.glide.load.engine.q {
    protected final T a;

    public b(T r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0.a = r1
            return
    }

    @androidx.annotation.NonNull
    public final T b() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.a
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            if (r0 != 0) goto Lb
            T extends android.graphics.drawable.Drawable r0 = r1.a
            return r0
        Lb:
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.b()
            return r0
    }

    public void initialize() {
            r2 = this;
            T extends android.graphics.drawable.Drawable r0 = r2.a
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L10
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            r0.prepareToDraw()
            return
        L10:
            boolean r1 = r0 instanceof com.bumptech.glide.load.resource.gif.GifDrawable
            if (r1 == 0) goto L1d
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            android.graphics.Bitmap r0 = r0.e()
            r0.prepareToDraw()
        L1d:
            return
    }
}
