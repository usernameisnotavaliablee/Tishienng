package com.kwad.components.ad.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"AppCompatCustomView"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsPriceView extends android.widget.TextView implements com.kwad.components.core.widget.d {
    private static java.lang.String MI = "¥%s 到手约 ¥%s";
    private static java.lang.String MJ = "¥%s  ¥%s";
    private static java.lang.String MK = "¥%s";
    private com.kwad.components.ad.widget.KsPriceView.a MH;
    private java.lang.String ML;
    private java.lang.String MM;
    private boolean MN;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private int MO;
        private int MP;
        private int MQ;
        private int MR;
        private int MS;
        private int MT;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int a(com.kwad.components.ad.widget.KsPriceView.a r0, int r1) {
                r0.MQ = r1
                return r1
        }

        static /* synthetic */ int b(com.kwad.components.ad.widget.KsPriceView.a r0, int r1) {
                r0.MR = r1
                return r1
        }

        static /* synthetic */ int c(com.kwad.components.ad.widget.KsPriceView.a r0, int r1) {
                r0.MS = r1
                return r1
        }

        static /* synthetic */ int d(com.kwad.components.ad.widget.KsPriceView.a r0, int r1) {
                r0.MT = r1
                return r1
        }

        static /* synthetic */ int e(com.kwad.components.ad.widget.KsPriceView.a r0, int r1) {
                r0.MO = r1
                return r1
        }

        static /* synthetic */ int f(com.kwad.components.ad.widget.KsPriceView.a r0, int r1) {
                r0.MP = r1
                return r1
        }

        public final com.kwad.components.ad.widget.KsPriceView.a as(int r1) {
                r0 = this;
                r0.MP = r1
                return r0
        }

        public final com.kwad.components.ad.widget.KsPriceView.a at(int r1) {
                r0 = this;
                r0.MS = r1
                return r0
        }

        public final com.kwad.components.ad.widget.KsPriceView.a au(int r1) {
                r0 = this;
                r0.MT = r1
                return r0
        }

        public final int nQ() {
                r1 = this;
                int r0 = r1.MQ
                return r0
        }

        public final int nR() {
                r1 = this;
                int r0 = r1.MS
                return r0
        }

        public final int nS() {
                r1 = this;
                int r0 = r1.MR
                return r0
        }

        public final int nT() {
                r1 = this;
                int r0 = r1.MT
                return r0
        }

        public final int nU() {
                r1 = this;
                int r0 = r1.MO
                return r0
        }

        public final int nV() {
                r1 = this;
                int r0 = r1.MP
                return r0
        }
    }

    static {
            return
    }

    public KsPriceView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            com.kwad.components.ad.widget.KsPriceView$a r0 = new com.kwad.components.ad.widget.KsPriceView$a
            r0.<init>()
            r1.MH = r0
            r1.A(r2)
            return
    }

    public KsPriceView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.kwad.components.ad.widget.KsPriceView$a r2 = new com.kwad.components.ad.widget.KsPriceView$a
            r2.<init>()
            r0.MH = r2
            r0.A(r1)
            return
    }

    public KsPriceView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.kwad.components.ad.widget.KsPriceView$a r2 = new com.kwad.components.ad.widget.KsPriceView$a
            r2.<init>()
            r0.MH = r2
            r0.A(r1)
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public KsPriceView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            com.kwad.components.ad.widget.KsPriceView$a r2 = new com.kwad.components.ad.widget.KsPriceView$a
            r2.<init>()
            r0.MH = r2
            r0.A(r1)
            return
    }

    private void A(android.content.Context r6) {
            r5 = this;
            r0 = 1
            r5.setMaxLines(r0)
            com.kwad.components.ad.widget.KsPriceView$a r0 = r5.MH
            android.content.res.Resources r1 = r6.getResources()
            int r2 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r1 = r1.getColor(r2)
            com.kwad.components.ad.widget.KsPriceView.a.a(r0, r1)
            com.kwad.components.ad.widget.KsPriceView$a r0 = r5.MH
            android.content.res.Resources r1 = r6.getResources()
            int r3 = com.kwad.sdk.R.dimen.ksad_reward_order_price_size
            int r1 = r1.getDimensionPixelSize(r3)
            com.kwad.components.ad.widget.KsPriceView.a.b(r0, r1)
            com.kwad.components.ad.widget.KsPriceView$a r0 = r5.MH
            android.content.res.Resources r1 = r6.getResources()
            int r4 = com.kwad.sdk.R.color.ksad_reward_original_price
            int r1 = r1.getColor(r4)
            com.kwad.components.ad.widget.KsPriceView.a.c(r0, r1)
            com.kwad.components.ad.widget.KsPriceView$a r0 = r5.MH
            android.content.res.Resources r1 = r6.getResources()
            int r4 = com.kwad.sdk.R.dimen.ksad_reward_order_original_price_size
            int r1 = r1.getDimensionPixelSize(r4)
            com.kwad.components.ad.widget.KsPriceView.a.d(r0, r1)
            com.kwad.components.ad.widget.KsPriceView$a r0 = r5.MH
            android.content.res.Resources r1 = r6.getResources()
            int r1 = r1.getColor(r2)
            com.kwad.components.ad.widget.KsPriceView.a.e(r0, r1)
            com.kwad.components.ad.widget.KsPriceView$a r0 = r5.MH
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getDimensionPixelSize(r3)
            com.kwad.components.ad.widget.KsPriceView.a.f(r0, r6)
            return
    }

    @androidx.annotation.Nullable
    private static android.text.SpannableString a(java.lang.String r6, @androidx.annotation.Nullable java.lang.String r7, boolean r8, com.kwad.components.ad.widget.KsPriceView.a r9) {
            r0 = 0
            r1 = 1
            if (r7 != 0) goto Lf
            java.lang.String r8 = com.kwad.components.ad.widget.KsPriceView.MK
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r6
            java.lang.String r8 = java.lang.String.format(r8, r2)
            goto L21
        Lf:
            if (r8 == 0) goto L14
            java.lang.String r8 = com.kwad.components.ad.widget.KsPriceView.MJ
            goto L16
        L14:
            java.lang.String r8 = com.kwad.components.ad.widget.KsPriceView.MI
        L16:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r6
            r2[r1] = r7
            java.lang.String r8 = java.lang.String.format(r8, r2)
        L21:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r8)
            java.lang.String r3 = "¥"
            boolean r3 = r8.startsWith(r3)
            if (r3 == 0) goto L48
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            int r4 = r9.nU()
            r3.<init>(r4)
            r4 = 17
            r2.setSpan(r3, r0, r1, r4)
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            int r5 = r9.nV()
            r3.<init>(r5)
            r2.setSpan(r3, r0, r1, r4)
        L48:
            int r0 = r8.indexOf(r6)
            if (r0 >= 0) goto L50
            r6 = 0
            return r6
        L50:
            int r6 = r6.length()
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            int r4 = r9.nQ()
            r3.<init>(r4)
            int r6 = r6 + r0
            r4 = 18
            r2.setSpan(r3, r0, r6, r4)
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            int r5 = r9.nS()
            r3.<init>(r5)
            r2.setSpan(r3, r0, r6, r4)
            if (r7 == 0) goto L9c
            int r6 = r8.lastIndexOf(r7)
            int r6 = r6 - r1
            int r7 = r7.length()
            int r7 = r7 + r1
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            int r0 = r9.nR()
            r8.<init>(r0)
            int r7 = r7 + r6
            r2.setSpan(r8, r6, r7, r4)
            android.text.style.AbsoluteSizeSpan r8 = new android.text.style.AbsoluteSizeSpan
            int r9 = r9.nT()
            r8.<init>(r9)
            r2.setSpan(r8, r6, r7, r4)
            android.text.style.StrikethroughSpan r8 = new android.text.style.StrikethroughSpan
            r8.<init>()
            r2.setSpan(r8, r6, r7, r4)
        L9c:
            return r2
    }

    @Override // com.kwad.components.core.widget.d
    public final void a(com.kwad.components.core.widget.e r3) {
            r2 = this;
            com.kwad.components.ad.widget.KsPriceView$a r0 = r2.MH
            int r3 = r3.wf()
            com.kwad.components.ad.widget.KsPriceView.a.a(r0, r3)
            java.lang.String r3 = r2.ML
            java.lang.String r0 = r2.MM
            boolean r1 = r2.MN
            r2.d(r3, r0, r1)
            return
    }

    public final void d(java.lang.String r3, java.lang.String r4, boolean r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Ld
            goto L47
        Ld:
            r2.ML = r3
            r2.MM = r4
            r2.MN = r5
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r4 == 0) goto L1c
            r2.MM = r0
        L1c:
            if (r3 == 0) goto L2c
            java.lang.String r4 = "¥"
            boolean r1 = r3.startsWith(r4)
            if (r1 == 0) goto L2c
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceFirst(r4, r1)
        L2c:
            com.kwad.components.ad.widget.KsPriceView$a r4 = r2.MH
            int r4 = r4.nQ()
            r2.setTextColor(r4)
            java.lang.String r4 = r2.MM     // Catch: java.lang.Exception -> L3e
            com.kwad.components.ad.widget.KsPriceView$a r1 = r2.MH     // Catch: java.lang.Exception -> L3e
            android.text.SpannableString r0 = a(r3, r4, r5, r1)     // Catch: java.lang.Exception -> L3e
            goto L42
        L3e:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L42:
            if (r0 == 0) goto L47
            r2.setText(r0)
        L47:
            return
    }

    @androidx.annotation.NonNull
    public com.kwad.components.ad.widget.KsPriceView.a getConfig() {
            r1 = this;
            com.kwad.components.ad.widget.KsPriceView$a r0 = r1.MH
            return r0
    }

    public final void h(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.d(r2, r3, r0)
            return
    }
}
