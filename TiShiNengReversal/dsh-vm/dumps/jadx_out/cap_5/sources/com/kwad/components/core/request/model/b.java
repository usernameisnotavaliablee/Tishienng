package com.kwad.components.core.request.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.sdk.core.b {
    private java.lang.String LP;
    private int Qh;
    private int Qk;
    private java.util.List<com.kwad.components.core.request.model.b.a> XA;
    private com.kwad.sdk.l.a.f XB;
    private com.kwad.sdk.l.a.d XC;
    private com.kwad.sdk.l.a.b XD;
    private java.util.List<com.kwad.sdk.l.a.e> XE;
    private int Xk;
    private java.lang.String Xl;
    private java.lang.Long Xm;
    private java.lang.Long Xn;
    private java.lang.Long Xo;
    private java.lang.Long Xp;
    private java.lang.String Xq;
    private java.lang.String Xr;
    private java.util.List<com.kwad.sdk.utils.cd.a> Xs;
    private long Xt;
    private java.lang.String Xu;
    private long Xv;
    private int Xw;
    private java.lang.String Xx;
    private java.lang.String Xy;
    private boolean Xz;
    private float screenBrightness;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int XF;
        public int XG;
        public int XH;
        public int streamType;

        private a(int r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.XF = r0
                r1.XG = r0
                r1.XH = r0
                r1.streamType = r2
                return
        }

        public static java.util.List<com.kwad.components.core.request.model.b.a> aB(android.content.Context r6) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                if (r6 != 0) goto L8
                goto L47
            L8:
                r1 = 256(0x100, double:1.265E-321)
                boolean r1 = com.kwad.sdk.core.config.e.ai(r1)
                if (r1 == 0) goto L11
                goto L47
            L11:
                java.lang.String r1 = "audio"
                java.lang.Object r6 = r6.getSystemService(r1)     // Catch: java.lang.Exception -> L47
                android.media.AudioManager r6 = (android.media.AudioManager) r6     // Catch: java.lang.Exception -> L47
                if (r6 != 0) goto L1c
                goto L47
            L1c:
                r1 = 0
            L1d:
                r2 = 5
                if (r1 > r2) goto L47
                com.kwad.components.core.request.model.b$a r2 = new com.kwad.components.core.request.model.b$a     // Catch: java.lang.Exception -> L47
                r2.<init>(r1)     // Catch: java.lang.Exception -> L47
                int r3 = aV(r1)     // Catch: java.lang.Exception -> L47
                int r4 = r6.getStreamVolume(r3)     // Catch: java.lang.Exception -> L47
                r2.XH = r4     // Catch: java.lang.Exception -> L47
                int r4 = r6.getStreamMaxVolume(r3)     // Catch: java.lang.Exception -> L47
                r2.XF = r4     // Catch: java.lang.Exception -> L47
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L47
                r5 = 28
                if (r4 < r5) goto L41
                int r3 = com.kwad.components.core.request.model.d.a(r6, r3)     // Catch: java.lang.Exception -> L47
                r2.XG = r3     // Catch: java.lang.Exception -> L47
            L41:
                r0.add(r2)     // Catch: java.lang.Exception -> L47
                int r1 = r1 + 1
                goto L1d
            L47:
                return r0
        }

        private static int aV(int r2) {
                r0 = 0
                if (r2 == 0) goto L14
                r1 = 1
                if (r2 == r1) goto L13
                r1 = 2
                if (r2 == r1) goto L13
                r1 = 3
                if (r2 == r1) goto L13
                r1 = 4
                if (r2 == r1) goto L13
                r1 = 5
                if (r2 == r1) goto L13
                return r0
            L13:
                return r1
            L14:
                return r0
        }
    }

    public b() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.Xs = r0
            r0 = -1
            r2.Xw = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.screenBrightness = r1
            r2.Qk = r0
            return
    }

    private void aA(@androidx.annotation.NonNull android.content.Context r7) {
            r6 = this;
            r0 = 512(0x200, double:2.53E-321)
            boolean r0 = com.kwad.sdk.core.config.e.ai(r0)
            if (r0 == 0) goto L9
            goto L56
        L9:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.addAction(r1)
            r1 = 0
            android.content.Intent r7 = r7.registerReceiver(r1, r0)     // Catch: java.lang.Exception -> L44
            if (r7 == 0) goto L56
            java.lang.String r0 = "status"
            r1 = -1
            int r0 = r7.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L44
            r2 = 0
            r3 = 1
            r4 = 2
            if (r0 == r4) goto L36
            r5 = 5
            if (r0 != r5) goto L34
            goto L36
        L34:
            r0 = 0
            goto L37
        L36:
            r0 = 1
        L37:
            r6.Xz = r0     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "plugged"
            int r7 = r7.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L44
            if (r7 != r4) goto L46
            r6.Qk = r3     // Catch: java.lang.Exception -> L44
            return
        L44:
            r7 = move-exception
            goto L57
        L46:
            if (r7 != r3) goto L4b
            r6.Qk = r4     // Catch: java.lang.Exception -> L44
            return
        L4b:
            r0 = 4
            if (r7 != r0) goto L52
            r7 = 3
            r6.Qk = r7     // Catch: java.lang.Exception -> L44
            return
        L52:
            if (r7 != 0) goto L56
            r6.Qk = r2     // Catch: java.lang.Exception -> L44
        L56:
            return
        L57:
            com.kwad.sdk.core.d.c.printStackTrace(r7)
            return
    }

    private static android.content.Context getContext() {
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.Pp()
            return r0
    }

    @androidx.annotation.WorkerThread
    public static com.kwad.components.core.request.model.b sx() {
            com.kwad.components.core.request.model.b r0 = new com.kwad.components.core.request.model.b
            r0.<init>()
            int r1 = com.kwad.sdk.utils.br.RS()
            r0.Xk = r1
            android.content.Context r1 = getContext()
            java.lang.String r1 = com.kwad.sdk.utils.AbiUtil.cp(r1)
            r0.Xl = r1
            android.content.Context r1 = getContext()
            int r1 = com.kwad.sdk.utils.br.dR(r1)
            r0.Qh = r1
            android.content.Context r1 = getContext()
            long r1 = com.kwad.sdk.utils.br.dS(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.Xm = r1
            android.content.Context r1 = getContext()
            long r1 = com.kwad.sdk.utils.br.dO(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.Xn = r1
            long r1 = com.kwad.sdk.utils.br.RP()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.Xo = r1
            long r1 = com.kwad.sdk.utils.br.RQ()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.Xp = r1
            android.content.Context r1 = getContext()
            java.lang.String r1 = com.kwad.sdk.utils.bd.dt(r1)
            r0.Xq = r1
            android.content.Context r1 = getContext()
            java.lang.String r1 = com.kwad.sdk.utils.bd.du(r1)
            r0.Xr = r1
            java.util.List<com.kwad.sdk.utils.cd$a> r1 = r0.Xs
            android.content.Context r2 = getContext()
            r3 = 15
            java.util.List r2 = com.kwad.sdk.utils.bd.o(r2, r3)
            r1.addAll(r2)
            long r1 = com.kwad.sdk.utils.br.RX()
            r0.Xt = r1
            long r1 = com.kwad.sdk.utils.br.RY()
            r0.Xv = r1
            java.lang.String r1 = com.kwad.sdk.utils.br.RZ()
            r0.Xy = r1
            java.lang.String r1 = com.kwad.sdk.utils.br.Sa()
            r0.Xx = r1
            java.lang.String r1 = com.kwad.sdk.utils.br.Sb()
            r0.LP = r1
            java.lang.String r1 = com.kwad.sdk.utils.br.Sc()
            r0.Xu = r1
            android.content.Context r1 = getContext()
            if (r1 == 0) goto Lb0
            int r2 = com.kwad.sdk.utils.br.dZ(r1)
            r0.Xw = r2
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List r3 = com.kwad.components.core.request.model.b.a.aB(r1)
            r2.<init>(r3)
            r0.XA = r2
            r0.aA(r1)
        Lb0:
            com.kwad.sdk.l.a.d r1 = com.kwad.sdk.utils.r.PQ()
            r0.XC = r1
            com.kwad.sdk.l.a.b r1 = com.kwad.sdk.utils.bd.OO()
            r0.XD = r1
            com.kwad.sdk.utils.bj r1 = com.kwad.sdk.utils.bj.Ry()
            java.util.List r1 = r1.Rz()
            r0.XE = r1
            com.kwad.sdk.l.a.f r1 = com.kwad.sdk.utils.bd.OP()
            r0.XB = r1
            return r0
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.b
    public final org.json.JSONObject toJson() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "cpuCount"
            int r2 = r4.Xk
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "cpuAbi"
            java.lang.String r2 = r4.Xl
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "batteryPercent"
            int r2 = r4.Qh
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.Long r1 = r4.Xm
            long r1 = r1.longValue()
            java.lang.String r3 = "totalMemorySize"
            com.kwad.sdk.utils.aa.putValue(r0, r3, r1)
            java.lang.Long r1 = r4.Xn
            long r1 = r1.longValue()
            java.lang.String r3 = "availableMemorySize"
            com.kwad.sdk.utils.aa.putValue(r0, r3, r1)
            java.lang.Long r1 = r4.Xo
            long r1 = r1.longValue()
            java.lang.String r3 = "totalDiskSize"
            com.kwad.sdk.utils.aa.putValue(r0, r3, r1)
            java.lang.Long r1 = r4.Xp
            long r1 = r1.longValue()
            java.lang.String r3 = "availableDiskSize"
            com.kwad.sdk.utils.aa.putValue(r0, r3, r1)
            java.lang.String r1 = "imsi"
            java.lang.String r2 = r4.Xq
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "iccid"
            java.lang.String r2 = r4.Xr
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "wifiList"
            java.util.List<com.kwad.sdk.utils.cd$a> r2 = r4.Xs
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "bootTime"
            long r2 = r4.Xt
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "romName"
            java.lang.String r2 = r4.LP
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "romVersion"
            java.lang.String r2 = r4.Xu
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "romBuildTimestamp"
            long r2 = r4.Xv
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "ringerMode"
            int r2 = r4.Xw
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "audioStreamInfo"
            java.util.List<com.kwad.components.core.request.model.b$a> r2 = r4.XA
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "baseBandVersion"
            java.lang.String r2 = r4.Xx
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "fingerPrint"
            java.lang.String r2 = r4.Xy
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "screenBrightness"
            float r2 = r4.screenBrightness
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "isCharging"
            boolean r2 = r4.Xz
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "chargeType"
            int r2 = r4.Qk
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            com.kwad.sdk.l.a.f r1 = r4.XB
            if (r1 == 0) goto Lb1
            java.lang.String r2 = "simCardInfo"
            com.kwad.sdk.utils.aa.a(r0, r2, r1)
        Lb1:
            com.kwad.sdk.l.a.d r1 = r4.XC
            if (r1 == 0) goto Lba
            java.lang.String r2 = "environmentInfo"
            com.kwad.sdk.utils.aa.a(r0, r2, r1)
        Lba:
            com.kwad.sdk.l.a.b r1 = r4.XD
            if (r1 == 0) goto Lc3
            java.lang.String r2 = "baseStationInfo"
            com.kwad.sdk.utils.aa.a(r0, r2, r1)
        Lc3:
            java.util.List<com.kwad.sdk.l.a.e> r1 = r4.XE
            if (r1 == 0) goto Lcc
            java.lang.String r2 = "sensorEventInfoList"
            com.kwad.sdk.utils.aa.putValue(r0, r2, r1)
        Lcc:
            return r0
    }
}
