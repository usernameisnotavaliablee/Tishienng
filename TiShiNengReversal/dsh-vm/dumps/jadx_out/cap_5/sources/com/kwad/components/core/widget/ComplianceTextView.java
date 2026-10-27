package com.kwad.components.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"AppCompatCustomView"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ComplianceTextView extends android.widget.TextView {
    private java.lang.String aij;
    private java.lang.String aik;
    private java.lang.String ail;
    private java.lang.String aim;
    private java.lang.String ain;
    private java.lang.String aio;
    private java.lang.String aip;
    private int aiq;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.ColorInt
    private int textColor;





    public ComplianceTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ComplianceTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ComplianceTextView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.lang.String r3 = "...\n"
            r0.aij = r3
            r3 = 154(0x9a, float:2.16E-43)
            r0.aiq = r3
            r0.init(r1, r2)
            return
    }

    static /* synthetic */ java.lang.String a(com.kwad.components.core.widget.ComplianceTextView r0) {
            java.lang.String r0 = r0.aik
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.core.widget.ComplianceTextView r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private void a(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto Lc
            r10 = 8
            r9.setVisibility(r10)
            return
        Lc:
            r9.getContext()
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L25
            int r0 = r9.aiq
            int r3 = r9.getPaddingLeft()
            int r0 = r0 - r3
            int r3 = r9.getPaddingRight()
            int r0 = r0 - r3
            r3 = 1
            goto L34
        L25:
            int r0 = r9.getWidth()
            int r3 = r9.getPaddingLeft()
            int r0 = r0 - r3
            int r3 = r9.getPaddingRight()
            int r0 = r0 - r3
            r3 = 0
        L34:
            if (r0 >= 0) goto L37
            return
        L37:
            java.lang.String r4 = ""
            if (r3 != 0) goto L9e
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L9e
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            float r5 = r9.getTextSize()
            r3.setTextSize(r5)
            float r5 = r3.measureText(r10)
            float r0 = (float) r0
            float r0 = r0 - r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " "
            r5.append(r6)
            r5.append(r11)
            java.lang.String r7 = r5.toString()
            float r7 = r3.measureText(r7)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L9b
            r7 = 0
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 <= 0) goto L9b
        L71:
            int r4 = r11.length()
            if (r4 <= r1) goto La0
            int r4 = r11.length()
            int r4 = r4 - r1
            java.lang.String r11 = r11.substring(r2, r4)
            r5.setLength(r2)
            r5.append(r6)
            r5.append(r11)
            java.lang.String r4 = r9.aij
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            float r4 = r3.measureText(r4)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L71
            goto La0
        L9b:
            r9.aij = r4
            goto La0
        L9e:
            r9.aij = r4
        La0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = r9.aij
            r0.append(r11)
            java.lang.String r3 = r0.toString()
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r1.b(r2, r3, r4, r5, r6, r7, r8)
            r9.requestLayout()
            return
    }

    static /* synthetic */ java.lang.String b(com.kwad.components.core.widget.ComplianceTextView r0) {
            java.lang.String r0 = r0.ail
            return r0
    }

    private void b(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r2 = this;
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto Le
            r0.append(r3)
        Le:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = " "
            if (r3 != 0) goto L1d
            android.text.SpannableStringBuilder r3 = r0.append(r1)
            r3.append(r4)
        L1d:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L2a
            android.text.SpannableStringBuilder r3 = r0.append(r1)
            r3.append(r5)
        L2a:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L39
            java.lang.String r3 = " | 版本 "
            android.text.SpannableStringBuilder r3 = r0.append(r3)
            r3.append(r6)
        L39:
            java.lang.String r3 = r2.aio
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 33
            java.lang.String r5 = " | "
            if (r3 != 0) goto L5c
            int r3 = r0.length()
            android.text.SpannableStringBuilder r6 = r0.append(r5)
            r6.append(r7)
            com.kwad.components.core.widget.ComplianceTextView$2 r6 = new com.kwad.components.core.widget.ComplianceTextView$2
            r6.<init>(r2)
            int r7 = r0.length()
            r0.setSpan(r6, r3, r7, r4)
        L5c:
            java.lang.String r3 = r2.ain
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L7b
            int r3 = r0.length()
            android.text.SpannableStringBuilder r6 = r0.append(r5)
            r6.append(r8)
            com.kwad.components.core.widget.ComplianceTextView$3 r6 = new com.kwad.components.core.widget.ComplianceTextView$3
            r6.<init>(r2)
            int r7 = r0.length()
            r0.setSpan(r6, r3, r7, r4)
        L7b:
            java.lang.String r3 = r2.aip
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L9a
            int r3 = r0.length()
            android.text.SpannableStringBuilder r5 = r0.append(r5)
            r5.append(r9)
            com.kwad.components.core.widget.ComplianceTextView$4 r5 = new com.kwad.components.core.widget.ComplianceTextView$4
            r5.<init>(r2)
            int r6 = r0.length()
            r0.setSpan(r5, r3, r6, r4)
        L9a:
            r0.append(r1)
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r3)
            android.content.Context r3 = r2.getContext()
            int r4 = com.kwad.sdk.R.color.ksad_translucent
            int r3 = androidx.core.content.ContextCompat.getColor(r3, r4)
            r2.setHighlightColor(r3)
            r2.setText(r0)
            return
    }

    static /* synthetic */ java.lang.String c(com.kwad.components.core.widget.ComplianceTextView r0) {
            java.lang.String r0 = r0.aim
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate d(com.kwad.components.core.widget.ComplianceTextView r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ java.lang.String e(com.kwad.components.core.widget.ComplianceTextView r0) {
            java.lang.String r0 = r0.aio
            return r0
    }

    static /* synthetic */ int f(com.kwad.components.core.widget.ComplianceTextView r0) {
            int r0 = r0.textColor
            return r0
    }

    static /* synthetic */ java.lang.String g(com.kwad.components.core.widget.ComplianceTextView r0) {
            java.lang.String r0 = r0.ain
            return r0
    }

    static /* synthetic */ java.lang.String h(com.kwad.components.core.widget.ComplianceTextView r0) {
            java.lang.String r0 = r0.aip
            return r0
    }

    @android.annotation.SuppressLint({"CustomViewStyleable"})
    private void init(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            int[] r0 = com.kwad.sdk.R.styleable.ksad_ComplianceTextView
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
            int r0 = com.kwad.sdk.R.styleable.ksad_ComplianceTextView_ksad_width_in_landscape
            r1 = 154(0x9a, float:2.16E-43)
            int r0 = r4.getDimensionPixelOffset(r0, r1)
            r2.aiq = r0
            int r0 = com.kwad.sdk.R.styleable.ksad_ComplianceTextView_ksad_privacy_color
            java.lang.String r1 = "#99FFFFFF"
            int r1 = android.graphics.Color.parseColor(r1)
            int r0 = r4.getColor(r0, r1)
            r2.textColor = r0
            r2.setTextColor(r0)
            boolean r0 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r0 == 0) goto L2c
            r3 = 0
            r2.setBackgroundColor(r3)
            goto L35
        L2c:
            int r0 = com.kwad.sdk.R.drawable.ksad_compliance_view_bg
            android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r3, r0)
            r2.setBackground(r3)
        L35:
            r4.recycle()
            return
    }

    public void setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            r3.mAdTemplate = r4
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            java.lang.String r0 = "功能"
            r3.aik = r0
            java.lang.String r0 = "权限"
            r3.ail = r0
            java.lang.String r0 = "隐私"
            r3.aim = r0
            com.kwad.sdk.core.response.model.AdInfo$DownloadSafeInfo r0 = r4.downloadSafeInfo
            java.lang.String r1 = r0.appPermissionInfoUrl
            r3.ain = r1
            java.lang.String r1 = r0.appPrivacyUrl
            r3.aip = r1
            java.lang.String r0 = r0.introductionInfoUrl
            r3.aio = r0
            int r0 = r3.aiq
            if (r0 <= 0) goto L45
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r3.getContext()
            boolean r1 = com.kwad.sdk.utils.aq.QW()
            if (r1 != 0) goto L3f
            android.content.Context r1 = r3.getContext()
            int r2 = r3.aiq
            float r2 = (float) r2
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            r0.width = r1
            goto L42
        L3f:
            r1 = -1
            r0.width = r1
        L42:
            r3.setLayoutParams(r0)
        L45:
            com.kwad.components.core.widget.ComplianceTextView$1 r0 = new com.kwad.components.core.widget.ComplianceTextView$1
            r0.<init>(r3, r4)
            r3.post(r0)
            return
    }
}
