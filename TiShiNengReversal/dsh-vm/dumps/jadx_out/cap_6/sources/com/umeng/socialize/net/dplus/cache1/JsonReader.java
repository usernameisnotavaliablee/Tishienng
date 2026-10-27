package com.umeng.socialize.net.dplus.cache1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JsonReader extends com.umeng.socialize.net.dplus.cache1.IReader<org.json.JSONObject> {
    public JsonReader(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.umeng.socialize.net.dplus.cache1.IReader
    public void create(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8
            r0.<init>(r2)     // Catch: org.json.JSONException -> L8
            r1.result = r0     // Catch: org.json.JSONException -> L8
            return
        L8:
            r2 = move-exception
            com.umeng.socialize.utils.SLog.error(r2)
            return
    }
}
