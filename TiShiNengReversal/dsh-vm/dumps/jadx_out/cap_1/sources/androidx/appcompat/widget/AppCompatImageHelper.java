package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AppCompatImageHelper {
    private androidx.appcompat.widget.TintInfo mImageTint;
    private androidx.appcompat.widget.TintInfo mInternalImageTint;
    private int mLevel;
    private androidx.appcompat.widget.TintInfo mTmpInfo;

    @androidx.annotation.NonNull
    private final android.widget.ImageView mView;

    public AppCompatImageHelper(@androidx.annotation.NonNull android.widget.ImageView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLevel = r0
            r1.mView = r2
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
            android.widget.ImageView r1 = r3.mView
            android.content.res.ColorStateList r1 = androidx.core.widget.ImageViewCompat.getImageTintList(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.mHasTintList = r2
            r0.mTintList = r1
        L1d:
            android.widget.ImageView r1 = r3.mView
            android.graphics.PorterDuff$Mode r1 = androidx.core.widget.ImageViewCompat.getImageTintMode(r1)
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
            android.widget.ImageView r1 = r3.mView
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
            androidx.appcompat.widget.TintInfo r0 = r4.mInternalImageTint
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

    void applyImageLevel() {
            r2 = this;
            android.widget.ImageView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L13
            android.widget.ImageView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            int r1 = r2.mLevel
            r0.setLevel(r1)
        L13:
            return
    }

    void applySupportImageTint() {
            r3 = this;
            android.widget.ImageView r0 = r3.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r0)
        Lb:
            if (r0 == 0) goto L35
            boolean r1 = r3.shouldApplyFrameworkTintUsingColorFilter()
            if (r1 == 0) goto L1a
            boolean r1 = r3.applyFrameworkTintUsingColorFilter(r0)
            if (r1 == 0) goto L1a
            goto L35
        L1a:
            androidx.appcompat.widget.TintInfo r1 = r3.mImageTint
            if (r1 == 0) goto L28
            android.widget.ImageView r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
            return
        L28:
            androidx.appcompat.widget.TintInfo r1 = r3.mInternalImageTint
            if (r1 == 0) goto L35
            android.widget.ImageView r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
        L35:
            return
    }

    android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            return r0
        L7:
            r0 = 0
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            return r0
        L7:
            r0 = 0
            return r0
    }

    boolean hasOverlappingRendering() {
            r1 = this;
            android.widget.ImageView r0 = r1.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 1
            return r0
    }

    public void loadFromAttributes(android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.widget.ImageView r0 = r9.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatImageView
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r8 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r10, r3, r11, r1)
            android.widget.ImageView r1 = r9.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r8.getWrappedTypeArray()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ImageView r10 = r9.mView     // Catch: java.lang.Throwable -> L40
            android.graphics.drawable.Drawable r10 = r10.getDrawable()     // Catch: java.lang.Throwable -> L40
            r11 = -1
            if (r10 != 0) goto L43
            int r0 = androidx.appcompat.R.styleable.AppCompatImageView_srcCompat     // Catch: java.lang.Throwable -> L40
            int r0 = r8.getResourceId(r0, r11)     // Catch: java.lang.Throwable -> L40
            if (r0 == r11) goto L43
            android.widget.ImageView r10 = r9.mView     // Catch: java.lang.Throwable -> L40
            android.content.Context r10 = r10.getContext()     // Catch: java.lang.Throwable -> L40
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r10, r0)     // Catch: java.lang.Throwable -> L40
            if (r10 == 0) goto L43
            android.widget.ImageView r0 = r9.mView     // Catch: java.lang.Throwable -> L40
            r0.setImageDrawable(r10)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
            r10 = r0
            goto L73
        L43:
            if (r10 == 0) goto L48
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r10)     // Catch: java.lang.Throwable -> L40
        L48:
            int r10 = androidx.appcompat.R.styleable.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L40
            boolean r0 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L59
            android.widget.ImageView r0 = r9.mView     // Catch: java.lang.Throwable -> L40
            android.content.res.ColorStateList r10 = r8.getColorStateList(r10)     // Catch: java.lang.Throwable -> L40
            androidx.core.widget.ImageViewCompat.setImageTintList(r0, r10)     // Catch: java.lang.Throwable -> L40
        L59:
            int r10 = androidx.appcompat.R.styleable.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L40
            boolean r0 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L6f
            android.widget.ImageView r0 = r9.mView     // Catch: java.lang.Throwable -> L40
            int r10 = r8.getInt(r10, r11)     // Catch: java.lang.Throwable -> L40
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r10, r11)     // Catch: java.lang.Throwable -> L40
            androidx.core.widget.ImageViewCompat.setImageTintMode(r0, r10)     // Catch: java.lang.Throwable -> L40
        L6f:
            r8.recycle()
            return
        L73:
            r8.recycle()
            throw r10
    }

    void obtainLevelFromDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            r0 = this;
            int r1 = r1.getLevel()
            r0.mLevel = r1
            return
    }

    public void setImageResource(int r2) {
            r1 = this;
            if (r2 == 0) goto L17
            android.widget.ImageView r0 = r1.mView
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            if (r2 == 0) goto L11
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r2)
        L11:
            android.widget.ImageView r0 = r1.mView
            r0.setImageDrawable(r2)
            goto L1d
        L17:
            android.widget.ImageView r2 = r1.mView
            r0 = 0
            r2.setImageDrawable(r0)
        L1d:
            r1.applySupportImageTint()
            return
    }

    void setInternalImageTint(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalImageTint
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mInternalImageTint = r0
        Ld:
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalImageTint
            r0.mTintList = r2
            r2 = 1
            r0.mHasTintList = r2
            goto L18
        L15:
            r2 = 0
            r1.mInternalImageTint = r2
        L18:
            r1.applySupportImageTint()
            return
    }

    void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mImageTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            r0.mTintList = r2
            r2 = 1
            r0.mHasTintList = r2
            r1.applySupportImageTint()
            return
    }

    void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mImageTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            r0.mTintMode = r2
            r2 = 1
            r0.mHasTintMode = r2
            r1.applySupportImageTint()
            return
    }
}
