package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class q4 extends com.amap.api.col.s.b4<com.amap.api.services.help.InputtipsQuery, java.util.ArrayList<com.amap.api.services.help.Tip>> {
    public q4(android.content.Context r1, com.amap.api.services.help.InputtipsQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static java.util.ArrayList<com.amap.api.services.help.Tip> U(java.lang.String r2) throws com.amap.api.services.core.AMapException {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> La
            r0.<init>(r2)     // Catch: org.json.JSONException -> La
            java.util.ArrayList r2 = com.amap.api.col.s.r4.u0(r0)     // Catch: org.json.JSONException -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r0 = "InputtipsHandler"
            java.lang.String r1 = "paseJSON"
            com.amap.api.col.s.j4.i(r2, r0, r1)
            r2 = 0
            return r2
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            java.util.ArrayList r1 = U(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "output=json"
            r0.append(r1)
            T r1 = r4.n
            com.amap.api.services.help.InputtipsQuery r1 = (com.amap.api.services.help.InputtipsQuery) r1
            java.lang.String r1 = r1.getKeyword()
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L24
            java.lang.String r2 = "&keywords="
            r0.append(r2)
            r0.append(r1)
        L24:
            T r1 = r4.n
            com.amap.api.services.help.InputtipsQuery r1 = (com.amap.api.services.help.InputtipsQuery) r1
            java.lang.String r1 = r1.getCity()
            boolean r2 = com.amap.api.col.s.r4.s0(r1)
            if (r2 != 0) goto L3e
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            java.lang.String r2 = "&city="
            r0.append(r2)
            r0.append(r1)
        L3e:
            T r1 = r4.n
            com.amap.api.services.help.InputtipsQuery r1 = (com.amap.api.services.help.InputtipsQuery) r1
            java.lang.String r1 = r1.getType()
            boolean r2 = com.amap.api.col.s.r4.s0(r1)
            if (r2 != 0) goto L58
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            java.lang.String r2 = "&type="
            r0.append(r2)
            r0.append(r1)
        L58:
            T r1 = r4.n
            com.amap.api.services.help.InputtipsQuery r1 = (com.amap.api.services.help.InputtipsQuery) r1
            boolean r1 = r1.getCityLimit()
            if (r1 == 0) goto L68
            java.lang.String r1 = "&citylimit=true"
            r0.append(r1)
            goto L6d
        L68:
            java.lang.String r1 = "&citylimit=false"
            r0.append(r1)
        L6d:
            T r1 = r4.n
            com.amap.api.services.help.InputtipsQuery r1 = (com.amap.api.services.help.InputtipsQuery) r1
            com.amap.api.services.core.LatLonPoint r1 = r1.getLocation()
            if (r1 == 0) goto L8f
            java.lang.String r2 = "&location="
            r0.append(r2)
            double r2 = r1.getLongitude()
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            double r1 = r1.getLatitude()
            r0.append(r1)
        L8f:
            java.lang.String r1 = "&key="
            r0.append(r1)
            android.content.Context r1 = r4.q
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.b()
            r0.append(r1)
            java.lang.String r1 = "/assistant/inputtips?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
