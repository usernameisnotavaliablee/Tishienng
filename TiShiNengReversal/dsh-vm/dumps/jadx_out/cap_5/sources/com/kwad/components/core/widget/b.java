package com.kwad.components.core.widget;

import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class b<T extends com.kwad.sdk.core.response.model.AdResultData, R extends com.kwad.sdk.core.response.model.AdTemplate> extends com.kwad.sdk.widget.KSFrameLayout implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnShowListener, com.kwad.sdk.core.j.c {
    public com.kwad.components.core.widget.b.a aig;
    private long aih;
    private com.kwad.sdk.core.j.b dn;
    private com.kwad.components.core.widget.a.b fg;
    public com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    protected T mAdResultData;

    @androidx.annotation.NonNull
    public R mAdTemplate;

    @androidx.annotation.NonNull
    public android.content.Context mContext;
    private com.kwad.sdk.utils.bv mTimerHelper;
    protected boolean oR;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void onAdClicked();

        void onAdShow();

        void onDislikeClicked();

        void onDownloadTipsDialogDismiss();

        void onDownloadTipsDialogShow();
    }

    public b(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public b(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public b(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.mContext = r1
            r0.initView()
            return
    }

    static /* synthetic */ long a(com.kwad.components.core.widget.b r2, long r3) {
            long r0 = r2.aih
            long r0 = r0 + r3
            r2.aih = r0
            return r0
    }

    private void a(android.view.ViewGroup r3) {
            r2 = this;
            boolean r0 = com.kwad.sdk.core.config.e.FK()
            if (r0 != 0) goto L2a
            float r0 = com.kwad.sdk.core.config.e.FJ()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2a
            c(r3)
            com.kwad.components.core.widget.a r0 = new com.kwad.components.core.widget.a
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1, r3)
            r3.addView(r0)
            com.kwad.components.core.widget.b$1 r3 = new com.kwad.components.core.widget.b$1
            r3.<init>(r2)
            r0.setViewCallback(r3)
            r0.vU()
            return
        L2a:
            com.kwad.components.core.widget.c r0 = b(r3)
            if (r0 != 0) goto L3c
            com.kwad.components.core.widget.c r0 = new com.kwad.components.core.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1, r3)
            r3.addView(r0)
        L3c:
            com.kwad.components.core.widget.b$2 r3 = new com.kwad.components.core.widget.b$2
            r3.<init>(r2)
            r0.setViewCallback(r3)
            r3 = 1
            r0.setNeedCheckingShow(r3)
            return
    }

    private static com.kwad.components.core.widget.c b(android.view.ViewGroup r3) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof com.kwad.components.core.widget.c
            if (r2 == 0) goto L12
            com.kwad.components.core.widget.c r1 = (com.kwad.components.core.widget.c) r1
            return r1
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r3 = 0
            return r3
    }

    public static void c(android.view.ViewGroup r3) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof com.kwad.components.core.widget.a
            if (r2 == 0) goto L12
            r3.removeView(r1)
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    private void initView() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            int r1 = r2.getLayoutId()
            com.kwad.sdk.o.m.inflate(r0, r1, r2)
            float r0 = r2.getHWRatio()
            r2.setRatio(r0)
            r2.bw()
            com.kwad.components.core.widget.a.b r0 = new com.kwad.components.core.widget.a.b
            r1 = 70
            r0.<init>(r2, r1)
            r2.fg = r0
            return
    }

    protected void W() {
            r4 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            boolean r0 = r0.mPvReported
            if (r0 != 0) goto Ld
            com.kwad.components.core.widget.b$a r0 = r4.aig
            if (r0 == 0) goto Ld
            r0.onAdShow()
        Ld:
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.sdk.core.adlog.a$a r1 = new com.kwad.sdk.core.adlog.a$a
            r1.<init>()
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            int r3 = r2.type
            int r2 = r2.defaultType
            com.kwad.components.model.FeedType r2 = com.kwad.components.model.FeedType.fromInt(r3, r2)
            com.kwad.components.model.FeedType r3 = com.kwad.components.model.FeedType.FEED_TYPE_TEXT_NEW
            if (r2 != r3) goto L27
            com.kwad.components.model.FeedType r2 = com.kwad.components.model.FeedType.FEED_TYPE_TEXT_BELOW
        L27:
            int r3 = r2.getType()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.templateId = r3
            com.kwad.components.model.FeedType$FeedDefaultType r3 = r2.getFeedDefaultType()
            if (r3 != 0) goto L39
            r2 = 0
            goto L41
        L39:
            com.kwad.components.model.FeedType$FeedDefaultType r2 = r2.getFeedDefaultType()
            int r2 = r2.getDefaultType()
        L41:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.awW = r2
            r0.b(r1)
            int r1 = r4.getHeight()
            int r2 = r4.getWidth()
            r0.w(r1, r2)
            com.kwad.components.core.t.b r1 = com.kwad.components.core.t.b.sY()
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            r3 = 0
            r1.a(r2, r3, r0)
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void aa() {
            r2 = this;
            super.aa()
            com.kwad.components.core.widget.a.b r0 = r2.fg
            r0.a(r2)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            com.kwad.sdk.core.j.b r1 = r2.dn
            r0.a(r1)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            r0.wi()
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void ab() {
            r1 = this;
            super.ab()
            com.kwad.components.core.widget.a.b r0 = r1.fg
            r0.wj()
            com.kwad.components.core.widget.a.b r0 = r1.fg
            r0.b(r1)
            r1.cq()
            return
    }

    public final void ba(int r4) {
            r3 = this;
            com.kwad.sdk.core.adlog.c.a r0 = new com.kwad.sdk.core.adlog.c.a
            r0.<init>()
            r0.mI = r4
            com.kwad.sdk.core.adlog.a$a r4 = new com.kwad.sdk.core.adlog.a$a
            r4.<init>()
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            int r2 = r1.type
            int r1 = r1.defaultType
            com.kwad.components.model.FeedType r1 = com.kwad.components.model.FeedType.fromInt(r2, r1)
            int r2 = r1.getType()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.templateId = r2
            com.kwad.components.model.FeedType$FeedDefaultType r2 = r1.getFeedDefaultType()
            if (r2 != 0) goto L28
            r1 = 0
            goto L30
        L28:
            com.kwad.components.model.FeedType$FeedDefaultType r1 = r1.getFeedDefaultType()
            int r1 = r1.getDefaultType()
        L30:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.awW = r1
            r0.Pk = r4
            R extends com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            int r4 = r4.swipeAngle
            if (r4 == 0) goto L40
            r0.ayv = r4
        L40:
            com.kwad.sdk.utils.aj$a r4 = r3.getTouchCoords()
            if (r4 == 0) goto L4c
            com.kwad.sdk.utils.aj$a r4 = r3.getTouchCoords()
            r0.mK = r4
        L4c:
            R extends com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r4, r0, r1)
            com.kwad.components.core.widget.b$a r4 = r3.aig
            if (r4 == 0) goto L59
            r4.onAdClicked()
        L59:
            return
    }

    public void bt() {
            r0 = this;
            return
    }

    public void bu() {
            r0 = this;
            return
    }

    protected abstract void bw();

    public final void c(@androidx.annotation.NonNull com.kwad.sdk.core.adlog.c.b r3) {
            r2 = this;
            com.kwad.sdk.utils.aj$a r0 = r2.getTouchCoords()
            r3.f(r0)
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r0, r3, r1)
            com.kwad.components.core.widget.b$a r3 = r2.aig
            if (r3 == 0) goto L14
            r3.onAdClicked()
        L14:
            return
    }

    public void cq() {
            r0 = this;
            return
    }

    public void d(@androidx.annotation.NonNull T r1) {
            r0 = this;
            r0.mAdResultData = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r1)
            r0.mAdTemplate = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            r0.mAdInfo = r1
            r0.a(r0)
            return
    }

    public final boolean fq() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            int r0 = r0.status
            r1 = 2
            if (r0 == r1) goto Lc
            r1 = 3
            if (r0 == r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected float getHWRatio() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected abstract int getLayoutId();

    public long getStayTime() {
            r4 = this;
            long r0 = r4.aih
            com.kwad.sdk.utils.bv r2 = r4.getTimerHelper()
            long r2 = r2.getTime()
            long r0 = r0 + r2
            return r0
    }

    public com.kwad.sdk.utils.bv getTimerHelper() {
            r1 = this;
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            if (r0 != 0) goto Lb
            com.kwad.sdk.utils.bv r0 = new com.kwad.sdk.utils.bv
            r0.<init>()
            r1.mTimerHelper = r0
        Lb:
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            return r0
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            com.kwad.components.core.widget.b$a r1 = r0.aig
            if (r1 == 0) goto L7
            r1.onDownloadTipsDialogDismiss()
        L7:
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface r1) {
            r0 = this;
            com.kwad.components.core.widget.b$a r1 = r0.aig
            if (r1 == 0) goto L7
            r1.onDownloadTipsDialogShow()
        L7:
            return
    }

    public void setInnerAdInteractionListener(com.kwad.components.core.widget.b.a r1) {
            r0 = this;
            r0.aig = r1
            return
    }

    public void setMargin(int r1) {
            r0 = this;
            r0.setPadding(r1, r1, r1, r1)
            boolean r1 = com.kwad.sdk.core.config.e.Gh()
            if (r1 != 0) goto Ld
            r1 = -1
            r0.setBackgroundColor(r1)
        Ld:
            return
    }

    public void setPageExitListener(com.kwad.sdk.core.j.b r1) {
            r0 = this;
            r0.dn = r1
            return
    }

    public final void vV() {
            r1 = this;
            com.kwad.components.core.widget.b$a r0 = r1.aig
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    public final void vW() {
            r1 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.bR(r0)
            com.kwad.components.core.widget.b$a r0 = r1.aig
            if (r0 == 0) goto Lc
            r0.onDislikeClicked()
        Lc:
            return
    }
}
