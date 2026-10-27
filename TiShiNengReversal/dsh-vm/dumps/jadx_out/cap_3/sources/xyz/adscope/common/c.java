package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static org.json.JSONObject a(java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog> r5) {
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 != 0) goto L38
            org.json.JSONArray r0 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONArray()
            java.util.Iterator r5 = r5.iterator()
            r2 = r1
        L10:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r5.next()
            xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog r3 = (xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog) r3
            if (r3 == 0) goto L10
            xyz.adscope.common.analyse2.base.model.biz.AnalyseAdCommon r4 = r3.c()
            if (r4 == 0) goto L28
            org.json.JSONObject r2 = r4.a()
        L28:
            org.json.JSONObject r3 = r3.a()
            r0.put(r3)
            goto L10
        L30:
            if (r2 == 0) goto L38
            java.lang.String r5 = "event_list"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r2, r5, r0)
            return r2
        L38:
            return r1
    }

    private static org.json.JSONObject a(org.json.JSONObject r2, java.util.List<xyz.adscope.common.v2.crash.ScopeCrashLog> r3) {
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L27
            org.json.JSONArray r0 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONArray()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            xyz.adscope.common.v2.crash.ScopeCrashLog r1 = (xyz.adscope.common.v2.crash.ScopeCrashLog) r1
            org.json.JSONObject r1 = r1.getAnalyseJsonObject()
            r0.put(r1)
            goto Le
        L22:
            java.lang.String r3 = "crash"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r2, r3, r0)
        L27:
            return r2
    }

    private static xyz.adscope.common.analyse2.db.AnalyseEventDBModel a(android.content.Context r3, java.lang.String r4, java.lang.String r5, org.json.JSONObject r6) {
            xyz.adscope.common.analyse2.db.AnalyseEventDBModel r0 = new xyz.adscope.common.analyse2.db.AnalyseEventDBModel
            r0.<init>()
            r0.setUrl(r4)
            r0.setEncrypt(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r4.append(r1)
            java.lang.String r1 = ""
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.b(r4)
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r4 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            java.lang.Object r3 = r4.getOrCreateImplement(r3)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r3 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r3
            java.lang.String r4 = r6.toString()
            byte[] r4 = r4.getBytes()
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r6 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.NOT_APPEND
            r1 = 0
            byte[] r3 = r3.encrypt(r4, r5, r6, r1)
            if (r3 == 0) goto L46
            java.lang.String r3 = xyz.adscope.common.v2.tool.str.StringUtil.bytesToHexString(r3)
            r0.a(r3)
            return r0
        L46:
            r3 = 0
            return r3
    }

    public static xyz.adscope.common.analyse2.db.AnalyseEventDBModel a(android.content.Context r1, java.lang.String r2, java.lang.String r3, org.json.JSONObject r4, java.util.List<xyz.adscope.common.v2.crash.ScopeCrashLog> r5) {
            if (r4 == 0) goto L13
            if (r5 == 0) goto L13
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L13
            org.json.JSONObject r4 = a(r4, r5)
            xyz.adscope.common.analyse2.db.AnalyseEventDBModel r1 = a(r1, r2, r3, r4)
            return r1
        L13:
            r1 = 0
            return r1
    }

    private static org.json.JSONObject b(org.json.JSONObject r5, java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        Le:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r6.next()
            xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog r2 = (xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog) r2
            boolean r3 = r2 instanceof xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog
            if (r3 == 0) goto L42
            xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog r2 = (xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog) r2
            xyz.adscope.common.analyse2.base.model.biz.AnalyseAdCommon r3 = r2.c()
            if (r3 == 0) goto Le
            java.lang.String r3 = r3.b()
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L36
            r4.add(r2)
            goto Le
        L36:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r2)
            r0.put(r3, r4)
            goto Le
        L42:
            r1.add(r2)
            goto Le
        L46:
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L6d
            org.json.JSONArray r6 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONArray()
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r1.next()
            xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog r2 = (xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog) r2
            org.json.JSONObject r2 = r2.a()
            r6.put(r2)
            goto L54
        L68:
            java.lang.String r1 = "event_list"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r6)
        L6d:
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L98
            org.json.JSONArray r6 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONArray()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            org.json.JSONObject r1 = a(r1)
            r6.put(r1)
            goto L7f
        L93:
            java.lang.String r0 = "session_list"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r0, r6)
        L98:
            return r5
    }

    public static xyz.adscope.common.analyse2.db.AnalyseEventDBModel b(android.content.Context r1, java.lang.String r2, java.lang.String r3, org.json.JSONObject r4, java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r5) {
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lf
            org.json.JSONObject r4 = b(r4, r5)
            xyz.adscope.common.analyse2.db.AnalyseEventDBModel r1 = a(r1, r2, r3, r4)
            return r1
        Lf:
            r1 = 0
            return r1
    }
}
