package com.kwad.components.core.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.commercial.c.a {
    private boolean QA;
    public int Qh;
    public boolean Qi;
    public boolean Qj;
    public int Qk;
    public boolean Ql;
    public java.lang.String Qm;
    public boolean Qn;
    public int Qo;
    public long Qp;
    public double Qq;
    public boolean Qr;
    public java.util.List<java.lang.String> Qs;
    public double Qt;
    public int Qu;
    public int Qv;
    public int Qw;
    public int Qx;
    private boolean Qy;
    private boolean Qz;
    public int defaultType;
    private android.content.Context mContext;

    private b() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.Qk = r0
            r1.Qo = r0
            r0 = 0
            r1.Qy = r0
            r1.Qz = r0
            r1.QA = r0
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.Pp()
            r1.mContext = r0
            return
    }

    private static void a(com.kwad.components.core.g.b r6) {
            java.lang.String r0 = com.kwad.sdk.core.config.e.Gs()     // Catch: java.lang.Throwable -> L6d
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto Lb
            goto L6c
        Lb:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "enableSlidingTrajectory"
            r2 = 0
            boolean r0 = r1.optBoolean(r0, r2)     // Catch: java.lang.Throwable -> L6d
            r3 = 1
            if (r0 == 0) goto L30
            android.util.Pair r0 = com.kwad.sdk.core.e.Eo()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r4 = r0.first     // Catch: java.lang.Throwable -> L6d
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L6d
            r6.Qs = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.second     // Catch: java.lang.Throwable -> L6d
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Throwable -> L6d
            double r4 = r0.doubleValue()     // Catch: java.lang.Throwable -> L6d
            r6.Qt = r4     // Catch: java.lang.Throwable -> L6d
            r6.Qy = r3     // Catch: java.lang.Throwable -> L6d
        L30:
            java.lang.String r0 = "enableAccessibility"
            boolean r0 = r1.optBoolean(r0, r2)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L5a
            android.content.Context r0 = r6.mContext     // Catch: java.lang.Throwable -> L6d
            android.util.Pair r0 = com.kwad.sdk.utils.br.ee(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.first     // Catch: java.lang.Throwable -> L6d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6d
            r6.Qi = r0     // Catch: java.lang.Throwable -> L6d
            android.content.Context r0 = r6.mContext     // Catch: java.lang.Throwable -> L6d
            android.util.Pair r0 = com.kwad.sdk.utils.br.ee(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.second     // Catch: java.lang.Throwable -> L6d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6d
            r6.Qj = r0     // Catch: java.lang.Throwable -> L6d
            r6.Qz = r3     // Catch: java.lang.Throwable -> L6d
        L5a:
            java.lang.String r0 = "enableKeyguardSecure"
            boolean r0 = r1.optBoolean(r0, r2)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6c
            android.content.Context r0 = r6.mContext     // Catch: java.lang.Throwable -> L6d
            boolean r0 = ar(r0)     // Catch: java.lang.Throwable -> L6d
            r6.Qr = r0     // Catch: java.lang.Throwable -> L6d
            r6.QA = r3     // Catch: java.lang.Throwable -> L6d
        L6c:
            return
        L6d:
            r6 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r6)
            return
    }

    private static void a(com.kwad.components.core.g.b r2, org.json.JSONObject r3) {
            if (r3 == 0) goto L93
            java.lang.String r0 = "c_batterylevel"
            int r0 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qh = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "t_accessibility_enabled"
            boolean r0 = r3.optBoolean(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qi = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "t_accessibility_service_existed"
            boolean r0 = r3.optBoolean(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qj = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "c_charging"
            int r0 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qk = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "is_cheat_user"
            boolean r0 = r3.optBoolean(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Ql = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "c_operator"
            java.lang.String r0 = r3.optString(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qm = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "t_root"
            boolean r0 = r3.optBoolean(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qn = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "c_screenlight"
            int r0 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qo = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "c_total_memory"
            long r0 = r3.optLong(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qp = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "c_volume"
            double r0 = r3.optDouble(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qq = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "t_is_keyguard_secure"
            boolean r0 = r3.optBoolean(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qr = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "s_origin_points"
            org.json.JSONArray r0 = r3.optJSONArray(r0)     // Catch: java.lang.Throwable -> L8f
            java.util.List r0 = com.kwad.sdk.utils.aa.h(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qs = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "s_swipe_max_curvature"
            double r0 = r3.optDouble(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qt = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "density_dpi"
            int r0 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qx = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "c_screen_height"
            int r0 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qv = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "c_screen_width"
            int r0 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Qw = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "default_type"
            int r3 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L8f
            r2.defaultType = r3     // Catch: java.lang.Throwable -> L8f
            return
        L8f:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r2)
        L93:
            return
    }

    private static java.lang.String ap(android.content.Context r2) {
            java.lang.String r0 = com.kwad.sdk.utils.bd.dt(r2)
            boolean r1 = com.kwad.sdk.utils.bc.useNetworkStateDisable()
            int r2 = com.kwad.sdk.utils.ao.d(r2, r0, r1)
            r0 = 1
            if (r2 == r0) goto L1e
            r0 = 2
            if (r2 == r0) goto L1b
            r0 = 3
            if (r2 == r0) goto L18
            java.lang.String r2 = "unknown"
            return r2
        L18:
            java.lang.String r2 = "CUCC"
            return r2
        L1b:
            java.lang.String r2 = "CTCC"
            return r2
        L1e:
            java.lang.String r2 = "CMCC"
            return r2
    }

    private static int aq(android.content.Context r0) {
            if (r0 != 0) goto L4
            r0 = -1
            return r0
        L4:
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            return r0
    }

    private static boolean ar(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = "keyguard"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L10
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L12
            boolean r2 = r2.isKeyguardSecure()     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            goto L13
        L12:
            return r0
        L13:
            com.kwad.sdk.core.d.c.printStackTrace(r2)
            return r0
    }

    private static int as(@androidx.annotation.NonNull android.content.Context r3) {
            r0 = 512(0x200, double:2.53E-321)
            boolean r0 = com.kwad.sdk.core.config.e.ai(r0)
            r1 = -1
            if (r0 == 0) goto La
            return r1
        La:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r2 = "android.intent.action.ACTION_POWER_CONNECTED"
            r0.addAction(r2)
            java.lang.String r2 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            r0.addAction(r2)
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r0.addAction(r2)
            r2 = 0
            android.content.Intent r3 = r3.registerReceiver(r2, r0)     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L3d
            java.lang.String r0 = "plugged"
            int r3 = r3.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L3b
            r0 = 2
            if (r3 != r0) goto L2f
            return r0
        L2f:
            r0 = 1
            if (r3 != r0) goto L33
            return r0
        L33:
            r0 = 4
            if (r3 != r0) goto L37
            return r0
        L37:
            if (r3 != 0) goto L3d
            r3 = 0
            return r3
        L3b:
            r3 = move-exception
            goto L3e
        L3d:
            return r1
        L3e:
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            return r1
    }

    private static org.json.JSONObject b(com.kwad.components.core.g.b r6) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "c_batterylevel"
            int r2 = r6.Qh     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "c_charging"
            int r2 = r6.Qk     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "is_cheat_user"
            boolean r2 = r6.Ql     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "c_operator"
            java.lang.String r2 = r6.Qm     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "t_root"
            boolean r2 = r6.Qn     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "c_screenlight"
            int r2 = r6.Qo     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "c_total_memory"
            long r2 = r6.Qp     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "c_volume"
            double r2 = r6.Qq     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "c_screen_height"
            int r2 = r6.Qv     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "c_screen_width"
            int r2 = r6.Qw     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "density_dpi"
            int r2 = r6.Qx     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "default_type"
            int r2 = r6.defaultType     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r6.Qy     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L7c
            java.util.List<java.lang.String> r1 = r6.Qs     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L6f
            java.lang.String r1 = "s_origin_points"
            java.util.List<java.lang.String> r2 = r6.Qs     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r6 = move-exception
            goto L9a
        L6f:
            double r1 = r6.Qt     // Catch: java.lang.Throwable -> L6d
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L7c
            java.lang.String r3 = "s_swipe_max_curvature"
            com.kwad.sdk.utils.aa.putValue(r0, r3, r1)     // Catch: java.lang.Throwable -> L6d
        L7c:
            boolean r1 = r6.Qz     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L8e
            java.lang.String r1 = "t_accessibility_enabled"
            boolean r2 = r6.Qi     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "t_accessibility_service_existed"
            boolean r2 = r6.Qj     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
        L8e:
            boolean r1 = r6.QA     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L99
            java.lang.String r1 = "t_is_keyguard_secure"
            boolean r6 = r6.Qr     // Catch: java.lang.Throwable -> L6d
            com.kwad.sdk.utils.aa.putValue(r0, r1, r6)     // Catch: java.lang.Throwable -> L6d
        L99:
            return r0
        L9a:
            com.kwad.sdk.core.d.c.printStackTrace(r6)
            return r0
    }

    private static int getScreenHeight(android.content.Context r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRealMetrics(r0)
            int r1 = r0.heightPixels
            return r1
    }

    private static int getScreenWidth(android.content.Context r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            int r1 = r0.widthPixels
            return r1
    }

    public static com.kwad.components.core.g.b qi() {
            com.kwad.components.core.g.b r0 = new com.kwad.components.core.g.b
            r0.<init>()
            android.content.Context r1 = r0.mContext
            int r1 = com.kwad.sdk.utils.br.dR(r1)
            r0.Qh = r1
            android.content.Context r1 = r0.mContext
            java.lang.String r1 = ap(r1)
            r0.Qm = r1
            android.content.Context r1 = r0.mContext
            int r1 = as(r1)
            r0.Qk = r1
            boolean r1 = qj()
            r0.Qn = r1
            android.content.Context r1 = r0.mContext
            int r1 = com.kwad.sdk.utils.SystemUtil.dQ(r1)
            r0.Qo = r1
            android.content.Context r1 = r0.mContext
            long r1 = com.kwad.sdk.utils.br.dS(r1)
            r0.Qp = r1
            android.content.Context r1 = r0.mContext
            float r1 = com.kwad.sdk.utils.SystemUtil.dP(r1)
            double r1 = (double) r1
            r0.Qq = r1
            android.content.Context r1 = r0.mContext
            int r1 = aq(r1)
            r0.Qx = r1
            android.content.Context r1 = r0.mContext
            int r1 = getScreenHeight(r1)
            r0.Qv = r1
            android.content.Context r1 = r0.mContext
            int r1 = getScreenWidth(r1)
            r0.Qw = r1
            a(r0)
            r1 = 1
            r0.defaultType = r1
            return r0
    }

    private static boolean qj() {
            com.kwad.sdk.l.a.d r0 = com.kwad.sdk.utils.r.PQ()
            r1 = 0
            if (r0 == 0) goto Ld
            int r0 = r0.aWI
            r2 = 1
            if (r0 != r2) goto Ld
            return r2
        Ld:
            return r1
    }

    public final com.kwad.components.core.g.b aE(boolean r1) {
            r0 = this;
            r0.Ql = r1
            return r0
    }

    public final com.kwad.components.core.g.b aH(int r1) {
            r0 = this;
            r0.Qu = r1
            return r0
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r1) {
            r0 = this;
            a(r0, r1)
            return
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final org.json.JSONObject toJson() {
            r1 = this;
            org.json.JSONObject r0 = b(r1)
            return r0
    }
}
