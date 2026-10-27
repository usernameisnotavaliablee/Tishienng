package androidx.legacy.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Space extends android.view.View {
    @java.lang.Deprecated
    public Space(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public Space(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public Space(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto Ld
            r1 = 4
            r0.setVisibility(r1)
        Ld:
            return
    }

    private static int getDefaultSize2(int r2, int r3) {
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L12
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L11
            return r2
        L11:
            return r3
        L12:
            int r2 = java.lang.Math.min(r2, r3)
            return r2
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"MissingSuperCall"})
    @java.lang.Deprecated
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = getDefaultSize2(r0, r2)
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = getDefaultSize2(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            return
    }
}
