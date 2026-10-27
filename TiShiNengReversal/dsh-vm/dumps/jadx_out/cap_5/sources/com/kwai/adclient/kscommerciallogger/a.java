package com.kwai.adclient.kscommerciallogger;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private com.kwai.adclient.kscommerciallogger.a.a bej;
    private com.kwai.adclient.kscommerciallogger.a.b bek;
    private org.json.JSONObject bel;
    private boolean bem;
    private boolean isDebug;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwai.adclient.kscommerciallogger.a$a, reason: collision with other inner class name */
    static final class C0171a {
        private static com.kwai.adclient.kscommerciallogger.a ben;

        public C0171a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static com.kwai.adclient.kscommerciallogger.a Te() {
                com.kwai.adclient.kscommerciallogger.a r0 = com.kwai.adclient.kscommerciallogger.a.C0171a.ben
                if (r0 != 0) goto Lc
                com.kwai.adclient.kscommerciallogger.a r0 = new com.kwai.adclient.kscommerciallogger.a
                r1 = 0
                r0.<init>(r1)
                com.kwai.adclient.kscommerciallogger.a.C0171a.ben = r0
            Lc:
                com.kwai.adclient.kscommerciallogger.a r0 = com.kwai.adclient.kscommerciallogger.a.C0171a.ben
                return r0
        }
    }

    private a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isDebug = r0
            r1.bem = r0
            return
    }

    /* synthetic */ a(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwai.adclient.kscommerciallogger.a Te() {
            com.kwai.adclient.kscommerciallogger.a r0 = com.kwai.adclient.kscommerciallogger.a.C0171a.Te()
            return r0
    }

    private void b(@androidx.annotation.NonNull com.kwai.adclient.kscommerciallogger.model.c r2) {
            r1 = this;
            com.kwai.adclient.kscommerciallogger.a.a r0 = r1.bej
            if (r0 == 0) goto L30
            com.kwai.adclient.kscommerciallogger.model.SubBusinessType r0 = r2.Ti()
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            com.kwai.adclient.kscommerciallogger.model.SubBusinessType r0 = r2.Ti()
            java.lang.String r0 = r0.value
        L11:
            com.kwai.adclient.kscommerciallogger.model.d r0 = r2.Tj()
            if (r0 != 0) goto L18
            goto L1f
        L18:
            com.kwai.adclient.kscommerciallogger.model.d r0 = r2.Tj()
            r0.getValue()
        L1f:
            r2.Tm()
            org.json.JSONObject r0 = r2.Tk()
            com.kwai.adclient.kscommerciallogger.b.z(r0)
            org.json.JSONObject r2 = r2.Tl()
            com.kwai.adclient.kscommerciallogger.b.z(r2)
        L30:
            return
    }

    public final org.json.JSONObject Tf() {
            r1 = this;
            org.json.JSONObject r0 = r1.bel
            return r0
    }

    public final boolean Tg() {
            r1 = this;
            boolean r0 = r1.bem
            return r0
    }

    public final void a(@androidx.annotation.NonNull com.kwai.adclient.kscommerciallogger.a.a r1, @androidx.annotation.NonNull com.kwai.adclient.kscommerciallogger.a.b r2, @androidx.annotation.Nullable org.json.JSONObject r3, boolean r4, boolean r5) {
            r0 = this;
            r0.bej = r1
            r0.bek = r2
            r0.bel = r3
            r0.isDebug = r4
            r0.bem = r5
            return
    }

    public final void a(com.kwai.adclient.kscommerciallogger.model.c r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L15
        L3:
            r2.b(r3)
            com.kwai.adclient.kscommerciallogger.a.b r0 = r2.bek
            if (r0 == 0) goto L15
            java.lang.String r1 = r3.Th()
            java.lang.String r3 = r3.toString()
            r0.M(r1, r3)
        L15:
            return
    }

    public final boolean isDebug() {
            r1 = this;
            boolean r0 = r1.isDebug
            return r0
    }
}
