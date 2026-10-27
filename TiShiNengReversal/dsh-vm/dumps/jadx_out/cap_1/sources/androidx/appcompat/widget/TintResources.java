package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class TintResources extends androidx.appcompat.widget.ResourcesWrapper {
    private final java.lang.ref.WeakReference<android.content.Context> mContextRef;

    public TintResources(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.mContextRef = r2
            return
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r4) throws android.content.res.Resources.NotFoundException {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getDrawableCanonical(r4)
            java.lang.ref.WeakReference<android.content.Context> r1 = r3.mContextRef
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r0 == 0) goto L17
            if (r1 == 0) goto L17
            androidx.appcompat.widget.ResourceManagerInternal r2 = androidx.appcompat.widget.ResourceManagerInternal.get()
            r2.tintDrawableUsingColorFilter(r1, r4, r0)
        L17:
            return r0
    }
}
