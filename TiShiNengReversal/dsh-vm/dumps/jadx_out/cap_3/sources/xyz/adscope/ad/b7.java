package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b7 {
    private xyz.adscope.ad.publish.ASNPConstants.UiModel a;
    private java.lang.String b;
    private java.lang.String c;
    private boolean d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        static final xyz.adscope.ad.b7 a = null;

        static {
                xyz.adscope.ad.b7 r0 = new xyz.adscope.ad.b7
                r0.<init>()
                xyz.adscope.ad.b7.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public b7() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String a(int r3) {
            r2 = this;
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r0 = r3.length()
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L1c:
            return r3
    }

    public static xyz.adscope.ad.b7 a() {
            xyz.adscope.ad.b7 r0 = xyz.adscope.ad.b7.a.a
            return r0
    }

    private boolean a(android.content.Context r3) {
            r2 = this;
            r0 = 0
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L15
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L15
            int r3 = r3.uiMode     // Catch: java.lang.Throwable -> L15
            r3 = r3 & 48
            r1 = 32
            if (r3 != r1) goto L15
            r3 = 1
            return r3
        L15:
            return r0
    }

    private int b(java.lang.String r2) {
            r1 = this;
            r0 = 16
            int r2 = java.lang.Integer.parseInt(r2, r0)
            return r2
    }

    private boolean d(java.lang.String r3) {
            r2 = this;
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "^[A-Fa-f0-9]{2}$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Exception -> L18
            java.util.regex.Matcher r3 = r1.matcher(r3)     // Catch: java.lang.Exception -> L18
            boolean r3 = r3.matches()     // Catch: java.lang.Exception -> L18
            r3 = r3 ^ r0
            return r3
        L18:
            return r0
    }

    public java.lang.String a(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "#"
            java.lang.String r1 = ""
            xyz.adscope.ad.publish.ASNPConstants$UiModel r2 = r10.a     // Catch: java.lang.Throwable -> Ldc
            xyz.adscope.ad.publish.ASNPConstants$UiModel r3 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_LIGHT     // Catch: java.lang.Throwable -> Ldc
            if (r2 != r3) goto L15
            boolean r0 = r10.c(r11)     // Catch: java.lang.Throwable -> Ldc
            if (r0 == 0) goto L12
            goto Ldc
        L12:
            java.lang.String r11 = r10.b     // Catch: java.lang.Throwable -> Ldc
            return r11
        L15:
            java.lang.String r2 = r11.replace(r0, r1)     // Catch: java.lang.Throwable -> Ldc
            int r3 = r2.length()     // Catch: java.lang.Throwable -> Ldc
            r4 = 0
            r5 = 4
            r6 = 2
            r7 = 6
            java.lang.String r8 = "FF"
            if (r3 == r7) goto L4f
            r9 = 8
            if (r3 == r9) goto L36
            xyz.adscope.ad.publish.ASNPConstants$UiModel r2 = r10.a     // Catch: java.lang.Throwable -> Ldc
            xyz.adscope.ad.publish.ASNPConstants$UiModel r3 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_DARK     // Catch: java.lang.Throwable -> Ldc
            if (r2 != r3) goto L34
            java.lang.String r2 = "00"
        L31:
            r3 = r2
            r4 = r3
            goto L5b
        L34:
            r2 = r8
            goto L31
        L36:
            java.lang.String r3 = r2.substring(r4, r6)     // Catch: java.lang.Throwable -> Ldc
            boolean r4 = r10.d(r3)     // Catch: java.lang.Throwable -> Ldc
            if (r4 == 0) goto L41
            goto L42
        L41:
            r8 = r3
        L42:
            java.lang.String r3 = r2.substring(r6, r5)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r4 = r2.substring(r5, r7)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r2 = r2.substring(r7, r9)     // Catch: java.lang.Throwable -> Ldc
            goto L5b
        L4f:
            java.lang.String r3 = r2.substring(r4, r6)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r4 = r2.substring(r6, r5)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r2 = r2.substring(r5, r7)     // Catch: java.lang.Throwable -> Ldc
        L5b:
            boolean r5 = r10.d(r3)     // Catch: java.lang.Throwable -> Ldc
            if (r5 != 0) goto Lb0
            boolean r5 = r10.d(r4)     // Catch: java.lang.Throwable -> Ldc
            if (r5 != 0) goto Lb0
            boolean r5 = r10.d(r2)     // Catch: java.lang.Throwable -> Ldc
            if (r5 == 0) goto L6e
            goto Lb0
        L6e:
            int r3 = r10.b(r3)     // Catch: java.lang.Throwable -> Ldc
            int r4 = r10.b(r4)     // Catch: java.lang.Throwable -> Ldc
            int r2 = r10.b(r2)     // Catch: java.lang.Throwable -> Ldc
            if (r3 != r4) goto Laf
            if (r4 != r2) goto Laf
            xyz.adscope.ad.publish.ASNPConstants$UiModel r2 = r10.a     // Catch: java.lang.Throwable -> Ldc
            xyz.adscope.ad.publish.ASNPConstants$UiModel r4 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_DARK     // Catch: java.lang.Throwable -> Ldc
            if (r2 != r4) goto Laf
            int r2 = 255 - r3
            java.lang.String r2 = r10.a(r2)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r2 = r2.toUpperCase()     // Catch: java.lang.Throwable -> Ldc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldc
            r3.<init>()     // Catch: java.lang.Throwable -> Ldc
            r3.append(r0)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r8)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r1)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r2)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r1)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r2)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r1)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r2)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> Ldc
        Laf:
            return r11
        Lb0:
            xyz.adscope.ad.publish.ASNPConstants$UiModel r2 = r10.a     // Catch: java.lang.Throwable -> Ldc
            xyz.adscope.ad.publish.ASNPConstants$UiModel r3 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_DARK     // Catch: java.lang.Throwable -> Ldc
            if (r2 != r3) goto Lbd
            java.lang.String r2 = r10.c     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r2 = r2.replace(r0, r1)     // Catch: java.lang.Throwable -> Ldc
            goto Lc3
        Lbd:
            java.lang.String r2 = r10.b     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r2 = r2.replace(r0, r1)     // Catch: java.lang.Throwable -> Ldc
        Lc3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldc
            r3.<init>()     // Catch: java.lang.Throwable -> Ldc
            r3.append(r0)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r8)     // Catch: java.lang.Throwable -> Ldc
            r3.append(r1)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r0 = r2.toUpperCase()     // Catch: java.lang.Throwable -> Ldc
            r3.append(r0)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> Ldc
        Ldc:
            return r11
    }

    public void a(android.content.Context r2, xyz.adscope.ad.publish.ASNPConstants.UiModel r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto L5
            goto L30
        L5:
            r0 = 1
            r1.d = r0
            r1.a = r3
            r1.b = r4
            r1.c = r5
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L18
            java.lang.String r4 = "#FFFFFF"
            r1.b = r4
        L18:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L22
            java.lang.String r4 = "#000000"
            r1.c = r4
        L22:
            boolean r2 = r1.a(r2)
            xyz.adscope.ad.publish.ASNPConstants$UiModel r4 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_AUTO
            if (r3 != r4) goto L30
            if (r2 == 0) goto L30
            xyz.adscope.ad.publish.ASNPConstants$UiModel r2 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_DARK
            r1.a = r2
        L30:
            return
    }

    public boolean b() {
            r2 = this;
            xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = r2.a
            xyz.adscope.ad.publish.ASNPConstants$UiModel r1 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_DARK
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean c(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{8})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Exception -> Lf
            java.util.regex.Matcher r2 = r0.matcher(r2)     // Catch: java.lang.Exception -> Lf
            boolean r2 = r2.matches()     // Catch: java.lang.Exception -> Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }
}
