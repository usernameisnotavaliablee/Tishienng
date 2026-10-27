package androidx.constraintlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Guideline extends android.view.View {
    public Guideline(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Guideline(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Guideline(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Guideline(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setGuidelineBegin(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.guideBegin = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelineEnd(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.guideEnd = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelinePercent(float r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.guidePercent = r2
            r1.setLayoutParams(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            return
    }
}
