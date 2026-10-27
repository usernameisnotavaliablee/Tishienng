package com.qq.e.ads.nativ;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class NativeExpressADView extends android.widget.FrameLayout implements com.qq.e.comm.compliance.DownloadConfirmListener, com.qq.e.comm.pi.LADI, com.qq.e.comm.pi.NFBI {
    private int a;
    private double b;
    private double c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ViewBindStatusListener {
        void onAttachedToWindow();

        void onDetachedFromWindow();

        void onFinishTemporaryDetach();

        void onStartTemporaryDetach();
    }

    public NativeExpressADView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = -1
            r2.a = r3
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r2.b = r0
            r2.c = r0
            return
    }

    public abstract void destroy();

    public abstract com.qq.e.comm.pi.AdData getBoundData();

    public abstract void negativeFeedback();

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r14, int r15) {
            r13 = this;
            int r0 = r13.a
            if (r0 <= 0) goto La0
            double r0 = r13.b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La0
            double r0 = r13.c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L14
            goto La0
        L14:
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            int r1 = android.view.View.MeasureSpec.getMode(r15)
            int r2 = android.view.View.MeasureSpec.getSize(r14)
            int r3 = android.view.View.MeasureSpec.getSize(r15)
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 != r6) goto L53
            if (r1 != r6) goto L53
            int r1 = r13.a
            if (r3 < r1) goto L3a
            double r7 = (double) r2
            double r9 = r13.b
            double r11 = (double) r3
            double r9 = r9 * r11
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 >= 0) goto L6c
        L3a:
            double r7 = (double) r3
            double r9 = r13.c
            double r7 = r7 * r9
            double r11 = (double) r2
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 >= 0) goto L4b
            double r7 = r7 + r4
            int r14 = (int) r7
        L46:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r6)
            goto L6c
        L4b:
            double r11 = r11 / r9
            double r11 = r11 + r4
            int r15 = (int) r11
        L4e:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r6)
            goto L6c
        L53:
            if (r1 != r6) goto L61
            double r7 = (double) r3
            double r9 = r13.c
            double r7 = r7 * r9
            double r7 = r7 + r4
            int r14 = (int) r7
            int r14 = java.lang.Math.min(r14, r2)
            goto L46
        L61:
            double r7 = (double) r2
            double r9 = r13.c
            double r7 = r7 / r9
            double r7 = r7 + r4
            int r15 = (int) r7
            int r15 = java.lang.Math.min(r15, r3)
            goto L4e
        L6c:
            android.view.View.MeasureSpec.getSize(r14)
            android.view.View.MeasureSpec.getSize(r15)
            super.onMeasure(r14, r15)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r14) goto L9f
            int r15 = r13.getMeasuredWidth()
            if (r2 != r15) goto L80
            goto L9f
        L80:
            int r15 = r13.getMeasuredWidth()
            double r0 = (double) r15
            double r2 = r13.c
            double r0 = r0 / r2
            double r0 = r0 + r4
            int r15 = (int) r0
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r6)
            int r0 = r13.getMeasuredWidth()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r14)
            android.view.View.MeasureSpec.getSize(r14)
            android.view.View.MeasureSpec.getSize(r15)
            super.onMeasure(r14, r15)
        L9f:
            return
        La0:
            super.onMeasure(r14, r15)
            return
    }

    public abstract void preloadVideo();

    public abstract void render();

    @java.lang.Deprecated
    public abstract void setAdSize(com.qq.e.ads.nativ.ADSize r1);

    public abstract void setMediaListener(com.qq.e.ads.nativ.NativeExpressMediaListener r1);

    public void setSizeRules(int r1, double r2, double r4) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    public abstract void setViewBindStatusListener(com.qq.e.ads.nativ.NativeExpressADView.ViewBindStatusListener r1);
}
