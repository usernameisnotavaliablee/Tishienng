package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ActionBarBackgroundDrawable extends android.graphics.drawable.Drawable {
    final androidx.appcompat.widget.ActionBarContainer mContainer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void getOutline(android.graphics.drawable.Drawable r0, android.graphics.Outline r1) {
                r0.getOutline(r1)
                return
        }
    }

    public ActionBarBackgroundDrawable(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.mContainer = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.mContainer
            boolean r1 = r0.mIsSplit
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r0.mSplitBackground
            if (r0 == 0) goto L22
            r0.draw(r3)
            return
        Le:
            android.graphics.drawable.Drawable r0 = r0.mBackground
            if (r0 == 0) goto L15
            r0.draw(r3)
        L15:
            androidx.appcompat.widget.ActionBarContainer r0 = r2.mContainer
            android.graphics.drawable.Drawable r1 = r0.mStackedBackground
            if (r1 == 0) goto L22
            boolean r0 = r0.mIsStacked
            if (r0 == 0) goto L22
            r1.draw(r3)
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.RequiresApi(21)
    public void getOutline(@androidx.annotation.NonNull android.graphics.Outline r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.mContainer
            boolean r1 = r0.mIsSplit
            if (r1 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r0.mSplitBackground
            if (r1 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r0.mBackground
            androidx.appcompat.widget.ActionBarBackgroundDrawable.Api21Impl.getOutline(r0, r3)
            return
        L10:
            android.graphics.drawable.Drawable r0 = r0.mBackground
            if (r0 == 0) goto L17
            androidx.appcompat.widget.ActionBarBackgroundDrawable.Api21Impl.getOutline(r0, r3)
        L17:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }
}
