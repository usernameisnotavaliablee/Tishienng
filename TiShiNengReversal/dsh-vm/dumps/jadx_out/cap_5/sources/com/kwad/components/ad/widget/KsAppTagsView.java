package com.kwad.components.ad.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsAppTagsView extends android.widget.LinearLayout {
    private int MG;

    public KsAppTagsView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 3
            r0.MG = r1
            return
    }

    public KsAppTagsView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 3
            r0.MG = r1
            return
    }

    public KsAppTagsView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 3
            r0.MG = r1
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public KsAppTagsView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 3
            r0.MG = r1
            return
    }

    private static void a(android.widget.LinearLayout r2, java.lang.String r3, @androidx.annotation.LayoutRes int r4) {
            android.content.Context r0 = r2.getContext()
            r1 = 0
            android.view.View r4 = com.kwad.sdk.o.m.a(r0, r4, r2, r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r3)
            r2.addView(r4)
            return
    }

    public final void a(java.util.List<java.lang.String> r4, @androidx.annotation.LayoutRes int r5) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L1e
        L3:
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r0 + 1
            int r2 = r3.MG
            if (r0 > r2) goto L1e
            a(r3, r1, r5)
            goto L8
        L1e:
            return
    }

    public void setAppTags(java.util.List<java.lang.String> r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_reward_apk_info_card_tag_item
            r1.a(r2, r0)
            return
    }

    public void setMaxCount(int r1) {
            r0 = this;
            r0.MG = r1
            return
    }
}
