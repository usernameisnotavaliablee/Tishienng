package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AppCompatBackgroundHelper {
    private int mBackgroundResId;
    private androidx.appcompat.widget.TintInfo mBackgroundTint;
    private final androidx.appcompat.widget.AppCompatDrawableManager mDrawableManager;
    private androidx.appcompat.widget.TintInfo mInternalBackgroundTint;
    private androidx.appcompat.widget.TintInfo mTmpInfo;

    @androidx.annotation.NonNull
    private final android.view.View mView;

    AppCompatBackgroundHelper(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mBackgroundResId = r0
            r1.mView = r2
            androidx.appcompat.widget.AppCompatDrawableManager r2 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            r1.mDrawableManager = r2
            return
    }

    private boolean applyFrameworkTintUsingColorFilter(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
            r3 = this;
            androidx.appcompat.widget.TintInfo r0 = r3.mTmpInfo
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r3.mTmpInfo = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r3.mTmpInfo
            r0.clear()
            android.view.View r1 = r3.mView
            android.content.res.ColorStateList r1 = androidx.core.view.ViewCompat.getBackgroundTintList(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.mHasTintList = r2
            r0.mTintList = r1
        L1d:
            android.view.View r1 = r3.mView
            android.graphics.PorterDuff$Mode r1 = androidx.core.view.ViewCompat.getBackgroundTintMode(r1)
            if (r1 == 0) goto L29
            r0.mHasTintMode = r2
            r0.mTintMode = r1
        L29:
            boolean r1 = r0.mHasTintList
            if (r1 != 0) goto L34
            boolean r1 = r0.mHasTintMode
            if (r1 == 0) goto L32
            goto L34
        L32:
            r4 = 0
            return r4
        L34:
            android.view.View r1 = r3.mView
            int[] r1 = r1.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r4, r0, r1)
            return r2
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 21
            if (r0 <= r3) goto Le
            androidx.appcompat.widget.TintInfo r0 = r4.mInternalBackgroundTint
            if (r0 == 0) goto Ld
            return r2
        Ld:
            return r1
        Le:
            if (r0 != r3) goto L11
            return r2
        L11:
            return r1
    }

    void applySupportBackgroundTint() {
            r3 = this;
            android.view.View r0 = r3.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L30
            boolean r1 = r3.shouldApplyFrameworkTintUsingColorFilter()
            if (r1 == 0) goto L15
            boolean r1 = r3.applyFrameworkTintUsingColorFilter(r0)
            if (r1 == 0) goto L15
            goto L30
        L15:
            androidx.appcompat.widget.TintInfo r1 = r3.mBackgroundTint
            if (r1 == 0) goto L23
            android.view.View r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
            return
        L23:
            androidx.appcompat.widget.TintInfo r1 = r3.mInternalBackgroundTint
            if (r1 == 0) goto L30
            android.view.View r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
        L30:
            return
    }

    android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            return r0
        L7:
            r0 = 0
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            return r0
        L7:
            r0 = 0
            return r0
    }

    void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.view.View r0 = r9.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.ViewBackgroundHelper
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r8 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r10, r3, r11, r1)
            android.view.View r1 = r9.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r8.getWrappedTypeArray()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L40
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L40
            r0 = -1
            if (r11 == 0) goto L43
            int r10 = r8.getResourceId(r10, r0)     // Catch: java.lang.Throwable -> L40
            r9.mBackgroundResId = r10     // Catch: java.lang.Throwable -> L40
            androidx.appcompat.widget.AppCompatDrawableManager r10 = r9.mDrawableManager     // Catch: java.lang.Throwable -> L40
            android.view.View r11 = r9.mView     // Catch: java.lang.Throwable -> L40
            android.content.Context r11 = r11.getContext()     // Catch: java.lang.Throwable -> L40
            int r1 = r9.mBackgroundResId     // Catch: java.lang.Throwable -> L40
            android.content.res.ColorStateList r10 = r10.getTintList(r11, r1)     // Catch: java.lang.Throwable -> L40
            if (r10 == 0) goto L43
            r9.setInternalBackgroundTint(r10)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
            r10 = r0
            goto L6e
        L43:
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L40
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L40
            if (r11 == 0) goto L54
            android.view.View r11 = r9.mView     // Catch: java.lang.Throwable -> L40
            android.content.res.ColorStateList r10 = r8.getColorStateList(r10)     // Catch: java.lang.Throwable -> L40
            androidx.core.view.ViewCompat.setBackgroundTintList(r11, r10)     // Catch: java.lang.Throwable -> L40
        L54:
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L40
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L40
            if (r11 == 0) goto L6a
            android.view.View r11 = r9.mView     // Catch: java.lang.Throwable -> L40
            int r10 = r8.getInt(r10, r0)     // Catch: java.lang.Throwable -> L40
            r0 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r10, r0)     // Catch: java.lang.Throwable -> L40
            androidx.core.view.ViewCompat.setBackgroundTintMode(r11, r10)     // Catch: java.lang.Throwable -> L40
        L6a:
            r8.recycle()
            return
        L6e:
            r8.recycle()
            throw r10
    }

    void onSetBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r1 = -1
            r0.mBackgroundResId = r1
            r1 = 0
            r0.setInternalBackgroundTint(r1)
            r0.applySupportBackgroundTint()
            return
    }

    void onSetBackgroundResource(int r3) {
            r2 = this;
            r2.mBackgroundResId = r3
            androidx.appcompat.widget.AppCompatDrawableManager r0 = r2.mDrawableManager
            if (r0 == 0) goto L11
            android.view.View r1 = r2.mView
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r3 = r0.getTintList(r1, r3)
            goto L12
        L11:
            r3 = 0
        L12:
            r2.setInternalBackgroundTint(r3)
            r2.applySupportBackgroundTint()
            return
    }

    void setInternalBackgroundTint(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalBackgroundTint
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mInternalBackgroundTint = r0
        Ld:
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalBackgroundTint
            r0.mTintList = r2
            r2 = 1
            r0.mHasTintList = r2
            goto L18
        L15:
            r2 = 0
            r1.mInternalBackgroundTint = r2
        L18:
            r1.applySupportBackgroundTint()
            return
    }

    void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mBackgroundTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            r0.mTintList = r2
            r2 = 1
            r0.mHasTintList = r2
            r1.applySupportBackgroundTint()
            return
    }

    void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mBackgroundTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            r0.mTintMode = r2
            r2 = 1
            r0.mHasTintMode = r2
            r1.applySupportBackgroundTint()
            return
    }
}
