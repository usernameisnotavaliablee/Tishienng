package com.google.android.material.resources;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class CancelableFontCallback extends com.google.android.material.resources.TextAppearanceFontCallback {
    private final com.google.android.material.resources.CancelableFontCallback.ApplyFont applyFont;
    private boolean cancelled;
    private final android.graphics.Typeface fallbackFont;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ApplyFont {
        void apply(android.graphics.Typeface r1);
    }

    public CancelableFontCallback(com.google.android.material.resources.CancelableFontCallback.ApplyFont r1, android.graphics.Typeface r2) {
            r0 = this;
            r0.<init>()
            r0.fallbackFont = r2
            r0.applyFont = r1
            return
    }

    private void updateIfNotCancelled(android.graphics.Typeface r2) {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 != 0) goto L9
            com.google.android.material.resources.CancelableFontCallback$ApplyFont r0 = r1.applyFont
            r0.apply(r2)
        L9:
            return
    }

    public void cancel() {
            r1 = this;
            r0 = 1
            r1.cancelled = r0
            return
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrievalFailed(int r1) {
            r0 = this;
            android.graphics.Typeface r1 = r0.fallbackFont
            r0.updateIfNotCancelled(r1)
            return
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrieved(android.graphics.Typeface r1, boolean r2) {
            r0 = this;
            r0.updateIfNotCancelled(r1)
            return
    }
}
