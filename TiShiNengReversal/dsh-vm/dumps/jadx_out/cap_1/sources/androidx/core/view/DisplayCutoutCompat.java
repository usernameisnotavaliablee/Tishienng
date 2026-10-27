package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DisplayCutoutCompat {
    private final android.view.DisplayCutout mDisplayCutout;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.DisplayCutout createDisplayCutout(android.graphics.Rect r1, java.util.List<android.graphics.Rect> r2) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.util.List<android.graphics.Rect> getBoundingRects(android.view.DisplayCutout r0) {
                java.util.List r0 = r0.getBoundingRects()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getSafeInsetBottom(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetBottom()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getSafeInsetLeft(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetLeft()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getSafeInsetRight(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetRight()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getSafeInsetTop(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetTop()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets r6, android.graphics.Rect r7, android.graphics.Rect r8, android.graphics.Rect r9, android.graphics.Rect r10) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r1 = r6
                r2 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets r7, android.graphics.Rect r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Insets r12) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.Insets getWaterfallInsets(android.view.DisplayCutout r0) {
                android.graphics.Insets r0 = r0.getWaterfallInsets()
                return r0
        }
    }

    public DisplayCutoutCompat(@androidx.annotation.Nullable android.graphics.Rect r3, @androidx.annotation.Nullable java.util.List<android.graphics.Rect> r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.DisplayCutout r3 = androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(r3, r4)
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r2.<init>(r3)
            return
    }

    private DisplayCutoutCompat(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.mDisplayCutout = r1
            return
    }

    public DisplayCutoutCompat(@androidx.annotation.NonNull androidx.core.graphics.Insets r1, @androidx.annotation.Nullable android.graphics.Rect r2, @androidx.annotation.Nullable android.graphics.Rect r3, @androidx.annotation.Nullable android.graphics.Rect r4, @androidx.annotation.Nullable android.graphics.Rect r5, @androidx.annotation.NonNull androidx.core.graphics.Insets r6) {
            r0 = this;
            android.view.DisplayCutout r1 = constructDisplayCutout(r1, r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return
    }

    private static android.view.DisplayCutout constructDisplayCutout(@androidx.annotation.NonNull androidx.core.graphics.Insets r3, @androidx.annotation.Nullable android.graphics.Rect r4, @androidx.annotation.Nullable android.graphics.Rect r5, @androidx.annotation.Nullable android.graphics.Rect r6, @androidx.annotation.Nullable android.graphics.Rect r7, @androidx.annotation.NonNull androidx.core.graphics.Insets r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L13
            android.graphics.Insets r3 = r3.toPlatformInsets()
            android.graphics.Insets r8 = r8.toPlatformInsets()
            android.view.DisplayCutout r3 = androidx.core.view.DisplayCutoutCompat.Api30Impl.createDisplayCutout(r3, r4, r5, r6, r7, r8)
            return r3
        L13:
            r8 = 29
            if (r0 < r8) goto L20
            android.graphics.Insets r3 = r3.toPlatformInsets()
            android.view.DisplayCutout r3 = androidx.core.view.DisplayCutoutCompat.Api29Impl.createDisplayCutout(r3, r4, r5, r6, r7)
            return r3
        L20:
            r8 = 28
            if (r0 < r8) goto L4f
            android.graphics.Rect r8 = new android.graphics.Rect
            int r0 = r3.left
            int r1 = r3.top
            int r2 = r3.right
            int r3 = r3.bottom
            r8.<init>(r0, r1, r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r4 == 0) goto L3b
            r3.add(r4)
        L3b:
            if (r5 == 0) goto L40
            r3.add(r5)
        L40:
            if (r6 == 0) goto L45
            r3.add(r6)
        L45:
            if (r7 == 0) goto L4a
            r3.add(r7)
        L4a:
            android.view.DisplayCutout r3 = androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(r8, r3)
            return r3
        L4f:
            r3 = 0
            return r3
    }

    static androidx.core.view.DisplayCutoutCompat wrap(android.view.DisplayCutout r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            androidx.core.view.DisplayCutoutCompat r0 = new androidx.core.view.DisplayCutoutCompat
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<androidx.core.view.DisplayCutoutCompat> r0 = androidx.core.view.DisplayCutoutCompat.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            androidx.core.view.DisplayCutoutCompat r3 = (androidx.core.view.DisplayCutoutCompat) r3
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            android.view.DisplayCutout r3 = r3.mDisplayCutout
            boolean r3 = androidx.core.util.ObjectsCompat.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @androidx.annotation.NonNull
    public java.util.List<android.graphics.Rect> getBoundingRects() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            java.util.List r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getBoundingRects(r0)
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public int getSafeInsetBottom() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetBottom(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetLeft() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetLeft(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetRight() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetRight(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetTop() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetTop(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.Insets getWaterfallInsets() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            android.graphics.Insets r0 = androidx.core.view.DisplayCutoutCompat.Api30Impl.getWaterfallInsets(r0)
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
            return r0
        L11:
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = androidx.core.view.s.a(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.append(r1)
            android.view.DisplayCutout r1 = r2.mDisplayCutout
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.RequiresApi(28)
    android.view.DisplayCutout unwrap() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            return r0
    }
}
