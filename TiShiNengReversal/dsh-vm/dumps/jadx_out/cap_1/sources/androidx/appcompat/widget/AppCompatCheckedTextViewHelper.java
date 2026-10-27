package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AppCompatCheckedTextViewHelper {
    private android.content.res.ColorStateList mCheckMarkTintList;
    private android.graphics.PorterDuff.Mode mCheckMarkTintMode;
    private boolean mHasCheckMarkTint;
    private boolean mHasCheckMarkTintMode;
    private boolean mSkipNextApply;

    @androidx.annotation.NonNull
    private final android.widget.CheckedTextView mView;

    AppCompatCheckedTextViewHelper(@androidx.annotation.NonNull android.widget.CheckedTextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCheckMarkTintList = r0
            r1.mCheckMarkTintMode = r0
            r0 = 0
            r1.mHasCheckMarkTint = r0
            r1.mHasCheckMarkTintMode = r0
            r1.mView = r2
            return
    }

    void applyCheckMarkTint() {
            r2 = this;
            android.widget.CheckedTextView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CheckedTextViewCompat.getCheckMarkDrawable(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.mHasCheckMarkTint
            if (r1 != 0) goto L10
            boolean r1 = r2.mHasCheckMarkTintMode
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.mHasCheckMarkTint
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.mCheckMarkTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L21:
            boolean r1 = r2.mHasCheckMarkTintMode
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.mCheckMarkTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CheckedTextView r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CheckedTextView r1 = r2.mView
            r1.setCheckMarkDrawable(r0)
        L3e:
            return
    }

    android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mCheckMarkTintList
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mCheckMarkTintMode
            return r0
    }

    void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.widget.CheckedTextView r0 = r10.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.CheckedTextView
            r8 = 0
            androidx.appcompat.widget.TintTypedArray r9 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r3, r12, r8)
            android.widget.CheckedTextView r1 = r10.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r9.getWrappedTypeArray()
            r7 = 0
            r4 = r11
            r6 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L3c
            int r11 = r9.getResourceId(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3c
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            goto L57
        L39:
            r0 = move-exception
            r11 = r0
            goto L83
        L3c:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L57
            int r11 = r9.getResourceId(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L57
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r11)     // Catch: java.lang.Throwable -> L39
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L39
        L57:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L68
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r11 = r9.getColorStateList(r11)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(r12, r11)     // Catch: java.lang.Throwable -> L39
        L68:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L7f
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            r0 = -1
            int r11 = r9.getInt(r11, r0)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r11, r0)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(r12, r11)     // Catch: java.lang.Throwable -> L39
        L7f:
            r9.recycle()
            return
        L83:
            r9.recycle()
            throw r11
    }

    void onSetCheckMarkDrawable() {
            r1 = this;
            boolean r0 = r1.mSkipNextApply
            if (r0 == 0) goto L8
            r0 = 0
            r1.mSkipNextApply = r0
            return
        L8:
            r0 = 1
            r1.mSkipNextApply = r0
            r1.applyCheckMarkTint()
            return
    }

    void setSupportCheckMarkTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mCheckMarkTintList = r1
            r1 = 1
            r0.mHasCheckMarkTint = r1
            r0.applyCheckMarkTint()
            return
    }

    void setSupportCheckMarkTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mCheckMarkTintMode = r1
            r1 = 1
            r0.mHasCheckMarkTintMode = r1
            r0.applyCheckMarkTint()
            return
    }
}
