package com.umeng.commonsdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JSONArraySortUtil implements java.util.Comparator<org.json.JSONObject> {
    private java.lang.String mCompareKey;

    public JSONArraySortUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(org.json.JSONObject r1, org.json.JSONObject r2) {
            r0 = this;
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(org.json.JSONObject r3, org.json.JSONObject r4) {
            r2 = this;
            java.lang.String r0 = r2.mCompareKey     // Catch: org.json.JSONException -> Lf
            long r0 = r3.getLong(r0)     // Catch: org.json.JSONException -> Lf
            java.lang.String r3 = r2.mCompareKey     // Catch: org.json.JSONException -> Lf
            long r3 = r4.getLong(r3)     // Catch: org.json.JSONException -> Lf
            long r0 = r0 - r3
            int r3 = (int) r0
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public void setCompareKey(java.lang.String r1) {
            r0 = this;
            r0.mCompareKey = r1
            return
    }
}
