package com.beizi.fusion.update;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c extends android.os.AsyncTask<java.lang.String, java.lang.Integer, com.beizi.fusion.update.a> {
    private android.content.Context a;
    private com.beizi.fusion.update.b b;

    c(android.content.Context r1, com.beizi.fusion.update.b r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1     // Catch: java.lang.Exception -> L7
            r0.b = r2     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    protected com.beizi.fusion.update.a a(java.lang.String... r6) {
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.a     // Catch: java.lang.Throwable -> Lac
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Throwable -> Lac
            boolean r1 = r1.isInit     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto L14
            android.content.Context r1 = r5.a     // Catch: java.lang.Throwable -> Lac
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Throwable -> Lac
            r1.init()     // Catch: java.lang.Throwable -> Lac
        L14:
            r1 = 0
            if (r6 == 0) goto L1d
            int r2 = r6.length     // Catch: java.lang.Throwable -> Lac
            if (r2 <= 0) goto L1d
            r6 = r6[r1]     // Catch: java.lang.Throwable -> Lac
            goto L38
        L1d:
            java.lang.String r6 = "aHR0cDovL3Nkay5iZWl6aS5iaXovdjQvYXBpL3Nkay9jZi9wP2FwcElkPV9fQVBQSURfXyZwYWNrYWdlTmFtZT1fX1BBQ0tBR0VOQU1FX18maW5zdGFsbFRpbWU9X19JTlNUQUxMVElNRV9fJnVwZGF0ZVRpbWU9X19VUERBVEVUSU1FX18mbm93VGltZT1fX05PV1RJTUVfXyZhcHBWZXJzaW9uPV9fQVBQVkVSU0lPTl9fJmFwcFZlcnNpb25Db2RlPV9fQVBQVkVSU0lPTkNPREVfXyZzZGtWZXJzaW9uPV9fU0RLVkVSU0lPTl9fJlVzZXJBZ2VudD1fX1VTRVJBR0VOVF9fJnNka1VJRD1fX1NES1VJRF9fJmlkZmE9X19JREZBX18maWRmdj1fX0lERlZfXyZvcz1fX09TX18mcGxhdGZvcm09X19QTEFURk9STV9fJmRldlR5cGU9X19ERVZUWVBFX18mYnJhbmQ9X19CUkFORF9fJm1vZGVsPV9fTU9ERUxfXyZyZXNvbHV0aW9uPV9fUkVTT0xVVElPTl9fJnNjcmVlblNpemU9X19TQ1JFRU5TSVpFX18mbGFuZ3VhZ2U9X19MQU5HVUFHRV9fJmRlbnNpdHk9X19ERU5TSVRZX18mcm9vdD1fX1JPT1RfXyZuZXQ9X19ORVRfXyZpc3A9X19JU1BfXyZiYXR0ZXJ5PV9fQkFUVEVSWV9fJmRldmVsb3Blck1vZGU9X19ERVZFTE9QRVJNT0RFX18maXNVc2I9X19JU1VTQl9fJmlzRGVidWdBcGs9X19JU0RFQlVHQVBLX18maXNEZWJ1Z0Nvbm5lY3RlZD1fX0lTREVCVUdDT05ORUNURURfXyZkZWJ1Z1N5c3RlbT1fX0RFQlVHU1lTVEVNX18maXNXaWZpUHJveHk9X19JU1dJRklQUk9YWV9fJmlzQmx1ZXRvb3RoPV9fSVNCTFVFVE9PVEhfXyZpc0NhbWVyYT1fX0lTQ0FNRVJBX18maXNMb2NrU2NyZWVuPV9fSVNMT0NLU0NSRUVOX18mbmVpZ2hib3JpbmdMYWM9X19ORUlHSEJPUklOR0xBQ19fJmlzVnBuPV9fSVNWUE5fXyZpc1NpbXVsYXRvcj1fX0lTU0lNVUxBVE9SX18mY29uZmlnVmVyc2lvbj1fX0NPTkZJR1ZFUlNJT05fXyZjb25maWd1cmF0b3JDb25maWdWZXJzaW9uPV9fQ09ORklHVVJBVE9SQ09ORklHVkVSU0lPTl9fJm1lc3NlbmdlckNvbmZpZ1ZlcnNpb249X19NRVNTRU5HRVJDT05GSUdWRVJTSU9OX18mYmFubmVyRXhjdXRvckZvckxpZVlpbmdDb25maWdWZXJzaW9uPV9fQkFOTkVSRVhDVVRPUkZPUkxJRVlJTkdDT05GSUdWRVJTSU9OX18maHJDb25maWdWZXJzaW9uPV9fSFJDT05GSUdWRVJTSU9OX18mbWFuYWdlckNvbmZpZ1ZlcnNpb249X19NQU5BR0VSQ09ORklHVkVSU0lPTl9fJmxvZ1ZlcnNpb249X19MT0dWRVJTSU9OX18mZXZlbnRUaW1lPV9fRVZFTlRUSU1FX18mdXBsb2FkdGltZT1fX1VQTE9BRFRJTUVfXyZTZXNzaW9uSUQ9X19TRVNTSU9OSURfXyZldmVudElEPV9fRVZFTlRJRF9fJmV2ZW50Q29kZT1fX0VWRU5UQ09ERV9fJmFkVHlwZT1fX0FEVFlQRV9fJnJlc2VydmVUaW1lPV9fUkVTRVJWRVRJTUVfXyZhZHhJRD1fX0FEWElEX18mYWRQb3NpdGlvbklkPV9fQURQT1NJVElPTklEX18mT0FJRD1fX09BSURfXyZHQUlEPV9fR0FJRF9fJl9fRVJSSU5GT19fJmFwcFN0YXJ0PV9fQVBQU1RBUlRfXyZhcHBJbml0PV9fQVBQU0RLSU5JVF9fJmFwcFNwbGFzaFJlcXVlc3Q9X19BUFBTUExBU0hSRVFVRVNUX18="
            java.lang.String r6 = com.beizi.fusion.tool.d.a(r6)     // Catch: java.lang.Throwable -> Lac
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L2a
            return r0
        L2a:
            boolean r2 = com.beizi.fusion.BeiZis.getTransferProtocol()     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L38
            java.lang.String r2 = "http:"
            java.lang.String r3 = "https:"
            java.lang.String r6 = r6.replace(r2, r3)     // Catch: java.lang.Throwable -> Lac
        L38:
            java.lang.String r2 = "?"
            int r2 = r6.indexOf(r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = r6.substring(r1, r2)     // Catch: java.lang.Throwable -> Lac
            int r2 = r2 + 1
            java.lang.String r6 = r6.substring(r2)     // Catch: java.lang.Throwable -> Lac
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = com.beizi.fusion.tool.ao.a(r2, r6, r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = com.beizi.fusion.tool.t.a(r6)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = com.beizi.fusion.tool.b.a(r2, r6)     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto Lac
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = com.beizi.fusion.tool.v.a(r1, r6)     // Catch: java.lang.Throwable -> Lac
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto Lac
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lac
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = "code"
            int r6 = r1.optInt(r6)     // Catch: java.lang.Throwable -> Lac
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 != r2) goto Lac
            android.content.Context r6 = r5.a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "lastUpdateTime"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lac
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lac
            com.beizi.fusion.tool.an.a(r6, r2, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = "data"
            java.lang.String r6 = r1.optString(r6)     // Catch: java.lang.Throwable -> Lac
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto Lac
            java.lang.String r1 = "null"
            boolean r1 = r6.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto Lac
            java.lang.String r1 = "{}"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto Lac
            com.beizi.fusion.update.a r1 = new com.beizi.fusion.update.a     // Catch: java.lang.Throwable -> Lac
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> Lac
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> Lac
            return r1
        Lac:
            return r0
    }

    protected void a(com.beizi.fusion.update.a r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            boolean r0 = r2.a()
            if (r0 != 0) goto L9
            goto Lf
        L9:
            com.beizi.fusion.update.b r0 = r1.b
            r0.a(r2)
            return
        Lf:
            com.beizi.fusion.update.b r2 = r1.b
            if (r2 == 0) goto L18
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.a(r0)
        L18:
            return
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ com.beizi.fusion.update.a doInBackground(java.lang.String[] r1) {
            r0 = this;
            java.lang.String[] r1 = (java.lang.String[]) r1
            com.beizi.fusion.update.a r1 = r0.a(r1)
            return r1
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(com.beizi.fusion.update.a r1) {
            r0 = this;
            com.beizi.fusion.update.a r1 = (com.beizi.fusion.update.a) r1
            r0.a(r1)
            return
    }
}
