package com.kwai.adclient.kscommerciallogger.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private final com.kwai.adclient.kscommerciallogger.model.d avM;
    private final com.kwai.adclient.kscommerciallogger.model.BusinessType biz;
    private final java.lang.String category;
    private final java.lang.String eventId;
    private final org.json.JSONObject extraParam;
    private final org.json.JSONObject msg;
    private final com.kwai.adclient.kscommerciallogger.model.SubBusinessType subBiz;
    private final java.lang.String tag;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private final java.lang.String beV;
        private com.kwai.adclient.kscommerciallogger.model.BusinessType beW;
        private com.kwai.adclient.kscommerciallogger.model.SubBusinessType beX;
        private com.kwai.adclient.kscommerciallogger.model.d beY;
        private org.json.JSONObject beZ;
        private java.lang.String bfa;
        private java.lang.String mTag;
        private org.json.JSONObject msg;

        private a(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.beV = r1
                return
        }

        public static com.kwai.adclient.kscommerciallogger.model.c.a Tn() {
                com.kwai.adclient.kscommerciallogger.model.c$a r0 = new com.kwai.adclient.kscommerciallogger.model.c$a
                java.lang.String r1 = "ad_client_error_log"
                r0.<init>(r1)
                return r0
        }

        public static com.kwai.adclient.kscommerciallogger.model.c.a To() {
                com.kwai.adclient.kscommerciallogger.model.c$a r0 = new com.kwai.adclient.kscommerciallogger.model.c$a
                java.lang.String r1 = "ad_client_apm_log"
                r0.<init>(r1)
                return r0
        }

        static /* synthetic */ java.lang.String a(com.kwai.adclient.kscommerciallogger.model.c.a r0) {
                java.lang.String r0 = r0.beV
                return r0
        }

        static /* synthetic */ com.kwai.adclient.kscommerciallogger.model.BusinessType b(com.kwai.adclient.kscommerciallogger.model.c.a r0) {
                com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = r0.beW
                return r0
        }

        static /* synthetic */ com.kwai.adclient.kscommerciallogger.model.SubBusinessType c(com.kwai.adclient.kscommerciallogger.model.c.a r0) {
                com.kwai.adclient.kscommerciallogger.model.SubBusinessType r0 = r0.beX
                return r0
        }

        static /* synthetic */ java.lang.String d(com.kwai.adclient.kscommerciallogger.model.c.a r0) {
                java.lang.String r0 = r0.mTag
                return r0
        }

        static /* synthetic */ com.kwai.adclient.kscommerciallogger.model.d e(com.kwai.adclient.kscommerciallogger.model.c.a r0) {
                com.kwai.adclient.kscommerciallogger.model.d r0 = r0.beY
                return r0
        }

        static /* synthetic */ org.json.JSONObject f(com.kwai.adclient.kscommerciallogger.model.c.a r0) {
                org.json.JSONObject r0 = r0.beZ
                return r0
        }

        static /* synthetic */ java.lang.String g(com.kwai.adclient.kscommerciallogger.model.c.a r0) {
                java.lang.String r0 = r0.bfa
                return r0
        }

        static /* synthetic */ org.json.JSONObject h(com.kwai.adclient.kscommerciallogger.model.c.a r0) {
                org.json.JSONObject r0 = r0.msg
                return r0
        }

        public final com.kwai.adclient.kscommerciallogger.model.c.a A(org.json.JSONObject r1) {
                r0 = this;
                r0.msg = r1
                return r0
        }

        public final com.kwai.adclient.kscommerciallogger.model.c Tp() {
                r2 = this;
                com.kwai.adclient.kscommerciallogger.a r0 = com.kwai.adclient.kscommerciallogger.a.Te()
                boolean r0 = r0.isDebug()
                if (r0 == 0) goto L45
                java.lang.String r0 = r2.beV
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L3d
                java.lang.String r0 = r2.mTag
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L3d
                java.lang.String r0 = r2.bfa
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L3d
                com.kwai.adclient.kscommerciallogger.a r0 = com.kwai.adclient.kscommerciallogger.a.Te()
                boolean r0 = r0.Tg()
                if (r0 == 0) goto L72
                java.lang.String r0 = r2.bfa
                boolean r0 = com.kwai.adclient.kscommerciallogger.b.hM(r0)
                if (r0 == 0) goto L35
                goto L72
            L35:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "event_id format error, please check it"
                r0.<init>(r1)
                throw r0
            L3d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "param is error, please check it"
                r0.<init>(r1)
                throw r0
            L45:
                java.lang.String r0 = r2.beV
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 0
                if (r0 != 0) goto L8d
                java.lang.String r0 = r2.mTag
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L8d
                java.lang.String r0 = r2.bfa
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L5f
                goto L8d
            L5f:
                com.kwai.adclient.kscommerciallogger.a r0 = com.kwai.adclient.kscommerciallogger.a.Te()
                boolean r0 = r0.Tg()
                if (r0 == 0) goto L72
                java.lang.String r0 = r2.bfa
                boolean r0 = com.kwai.adclient.kscommerciallogger.b.hM(r0)
                if (r0 != 0) goto L72
                return r1
            L72:
                com.kwai.adclient.kscommerciallogger.a r0 = com.kwai.adclient.kscommerciallogger.a.Te()
                org.json.JSONObject r0 = r0.Tf()
                if (r0 == 0) goto L86
                com.kwai.adclient.kscommerciallogger.a r0 = com.kwai.adclient.kscommerciallogger.a.Te()
                org.json.JSONObject r0 = r0.Tf()
                r2.beZ = r0
            L86:
                com.kwai.adclient.kscommerciallogger.model.c r0 = new com.kwai.adclient.kscommerciallogger.model.c
                r1 = 0
                r0.<init>(r2, r1)
                return r0
            L8d:
                return r1
        }

        public final com.kwai.adclient.kscommerciallogger.model.c.a b(com.kwai.adclient.kscommerciallogger.model.SubBusinessType r1) {
                r0 = this;
                r0.beX = r1
                return r0
        }

        public final com.kwai.adclient.kscommerciallogger.model.c.a b(com.kwai.adclient.kscommerciallogger.model.d r1) {
                r0 = this;
                r0.beY = r1
                return r0
        }

        public final com.kwai.adclient.kscommerciallogger.model.c.a c(com.kwai.adclient.kscommerciallogger.model.BusinessType r1) {
                r0 = this;
                r0.beW = r1
                return r0
        }

        public final com.kwai.adclient.kscommerciallogger.model.c.a hN(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.mTag = r1
                return r0
        }

        public final com.kwai.adclient.kscommerciallogger.model.c.a hO(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.bfa = r1
                return r0
        }
    }

    private c(com.kwai.adclient.kscommerciallogger.model.c.a r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = com.kwai.adclient.kscommerciallogger.model.c.a.a(r2)
            r1.category = r0
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwai.adclient.kscommerciallogger.model.c.a.b(r2)
            r1.biz = r0
            com.kwai.adclient.kscommerciallogger.model.SubBusinessType r0 = com.kwai.adclient.kscommerciallogger.model.c.a.c(r2)
            r1.subBiz = r0
            java.lang.String r0 = com.kwai.adclient.kscommerciallogger.model.c.a.d(r2)
            r1.tag = r0
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.c.a.e(r2)
            r1.avM = r0
            org.json.JSONObject r0 = com.kwai.adclient.kscommerciallogger.model.c.a.f(r2)
            r1.extraParam = r0
            java.lang.String r0 = com.kwai.adclient.kscommerciallogger.model.c.a.g(r2)
            r1.eventId = r0
            org.json.JSONObject r0 = com.kwai.adclient.kscommerciallogger.model.c.a.h(r2)
            if (r0 != 0) goto L39
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            goto L3d
        L39:
            org.json.JSONObject r2 = com.kwai.adclient.kscommerciallogger.model.c.a.h(r2)
        L3d:
            r1.msg = r2
            return
    }

    /* synthetic */ c(com.kwai.adclient.kscommerciallogger.model.c.a r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final java.lang.String Th() {
            r1 = this;
            java.lang.String r0 = r1.category
            return r0
    }

    public final com.kwai.adclient.kscommerciallogger.model.SubBusinessType Ti() {
            r1 = this;
            com.kwai.adclient.kscommerciallogger.model.SubBusinessType r0 = r1.subBiz
            return r0
    }

    public final com.kwai.adclient.kscommerciallogger.model.d Tj() {
            r1 = this;
            com.kwai.adclient.kscommerciallogger.model.d r0 = r1.avM
            return r0
    }

    public final org.json.JSONObject Tk() {
            r1 = this;
            org.json.JSONObject r0 = r1.msg
            return r0
    }

    public final org.json.JSONObject Tl() {
            r1 = this;
            org.json.JSONObject r0 = r1.extraParam
            return r0
    }

    public final java.lang.String Tm() {
            r1 = this;
            java.lang.String r0 = r1.eventId
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = r3.biz     // Catch: org.json.JSONException -> L48
            if (r1 == 0) goto L10
            java.lang.String r2 = "biz"
            java.lang.String r1 = r1.value     // Catch: org.json.JSONException -> L48
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L48
        L10:
            com.kwai.adclient.kscommerciallogger.model.SubBusinessType r1 = r3.subBiz     // Catch: org.json.JSONException -> L48
            if (r1 == 0) goto L1b
            java.lang.String r2 = "sub_biz"
            java.lang.String r1 = r1.value     // Catch: org.json.JSONException -> L48
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L48
        L1b:
            java.lang.String r1 = "tag"
            java.lang.String r2 = r3.tag     // Catch: org.json.JSONException -> L48
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L48
            com.kwai.adclient.kscommerciallogger.model.d r1 = r3.avM     // Catch: org.json.JSONException -> L48
            if (r1 == 0) goto L2f
            java.lang.String r2 = "type"
            java.lang.String r1 = r1.getValue()     // Catch: org.json.JSONException -> L48
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L48
        L2f:
            org.json.JSONObject r1 = r3.msg     // Catch: org.json.JSONException -> L48
            if (r1 == 0) goto L38
            java.lang.String r2 = "msg"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L48
        L38:
            org.json.JSONObject r1 = r3.extraParam     // Catch: org.json.JSONException -> L48
            if (r1 == 0) goto L41
            java.lang.String r2 = "extra_param"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L48
        L41:
            java.lang.String r1 = "event_id"
            java.lang.String r2 = r3.eventId     // Catch: org.json.JSONException -> L48
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L48
        L48:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
