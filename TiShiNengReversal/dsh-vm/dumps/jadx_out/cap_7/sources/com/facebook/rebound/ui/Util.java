package com.facebook.rebound.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class Util {
    public Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final android.widget.FrameLayout.LayoutParams a(int r1, int r2) {
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r2)
            return r0
    }

    public static final android.widget.FrameLayout.LayoutParams b() {
            r0 = -1
            android.widget.FrameLayout$LayoutParams r0 = a(r0, r0)
            return r0
    }

    public static final android.widget.FrameLayout.LayoutParams c() {
            r0 = -1
            r1 = -2
            android.widget.FrameLayout$LayoutParams r0 = a(r0, r1)
            return r0
    }

    public static final android.widget.FrameLayout.LayoutParams d() {
            r0 = -2
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = a(r0, r1)
            return r0
    }

    public static final android.widget.FrameLayout.LayoutParams e() {
            r0 = -2
            android.widget.FrameLayout$LayoutParams r0 = a(r0, r0)
            return r0
    }

    public static final int f(float r1, android.content.res.Resources r2) {
            r0 = 1
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r0, r1, r2)
            int r1 = (int) r1
            return r1
    }
}
