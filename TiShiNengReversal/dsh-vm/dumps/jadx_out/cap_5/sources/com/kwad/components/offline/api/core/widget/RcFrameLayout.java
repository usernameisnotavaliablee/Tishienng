package com.kwad.components.offline.api.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RcFrameLayout extends android.widget.FrameLayout {
    private float mRatio;
    private com.kwad.components.offline.api.core.utils.TkViewRCHelper mViewRCHelper;
    private boolean widthBasedRatio;

    public RcFrameLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.mRatio = r0
            r0 = 1
            r1.widthBasedRatio = r0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public RcFrameLayout(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.mRatio = r2
            r2 = 1
            r0.widthBasedRatio = r2
            r2 = 0
            r0.init(r1, r2)
            return
    }

    public RcFrameLayout(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.mRatio = r2
            r2 = 1
            r0.widthBasedRatio = r2
            r2 = 0
            r0.init(r1, r2)
            return
    }

    private float[] getRadius(float r3, float r4, float r5, float r6) {
            r2 = this;
            r0 = 8
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            r3 = 2
            r0[r3] = r4
            r3 = 3
            r0[r3] = r4
            r3 = 4
            r0[r3] = r5
            r3 = 5
            r0[r3] = r5
            r3 = 6
            r0[r3] = r6
            r3 = 7
            r0[r3] = r6
            return r0
    }

    private void init(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            com.kwad.components.offline.api.core.utils.TkViewRCHelper r0 = new com.kwad.components.offline.api.core.utils.TkViewRCHelper
            r0.<init>()
            r1.mViewRCHelper = r0
            r0.initAttrs(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r2) {
            r1 = this;
            com.kwad.components.offline.api.core.utils.TkViewRCHelper r0 = r1.mViewRCHelper
            r0.beforeDispatchDraw(r2)
            super.dispatchDraw(r2)
            com.kwad.components.offline.api.core.utils.TkViewRCHelper r0 = r1.mViewRCHelper
            r0.afterDispatchDraw(r2)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            com.kwad.components.offline.api.core.utils.TkViewRCHelper r0 = r1.mViewRCHelper
            r0.beforeDraw(r2)
            super.draw(r2)
            com.kwad.components.offline.api.core.utils.TkViewRCHelper r0 = r1.mViewRCHelper
            r0.afterDraw(r2)
            return
    }

    protected boolean enableFirstVisible() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isWidthBasedRatio() {
            r1 = this;
            boolean r0 = r1.widthBasedRatio
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            float r0 = r2.mRatio
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L29
            boolean r0 = r2.widthBasedRatio
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L1c
            int r4 = android.view.View.MeasureSpec.getSize(r3)
            float r4 = (float) r4
            float r0 = r2.mRatio
            float r4 = r4 * r0
            int r4 = (int) r4
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L29
        L1c:
            int r3 = android.view.View.MeasureSpec.getSize(r4)
            float r3 = (float) r3
            float r0 = r2.mRatio
            float r3 = r3 / r0
            int r3 = (int) r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
        L29:
            super.onMeasure(r3, r4)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            com.kwad.components.offline.api.core.utils.TkViewRCHelper r3 = r0.mViewRCHelper
            r3.onSizeChanged(r1, r2)
            return
    }

    public void setRadius(float r2) {
            r1 = this;
            com.kwad.components.offline.api.core.utils.TkViewRCHelper r0 = r1.mViewRCHelper
            r0.setRadius(r2)
            r1.postInvalidate()
            return
    }

    public void setRadius(float r1, float r2, float r3, float r4) {
            r0 = this;
            float[] r1 = r0.getRadius(r1, r2, r3, r4)
            com.kwad.components.offline.api.core.utils.TkViewRCHelper r2 = r0.mViewRCHelper
            r2.setRadius(r1)
            r0.postInvalidate()
            return
    }

    public void setRatio(float r1) {
            r0 = this;
            r0.mRatio = r1
            return
    }

    public void setWidthBasedRatio(boolean r1) {
            r0 = this;
            r0.widthBasedRatio = r1
            return
    }
}
