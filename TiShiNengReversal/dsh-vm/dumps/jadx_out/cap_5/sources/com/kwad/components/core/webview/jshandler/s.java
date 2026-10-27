package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class s implements android.hardware.SensorEventListener, com.kwad.sdk.core.webview.c.a {
    private java.util.Map<java.lang.Integer, com.kwad.sdk.core.webview.c.c> acz;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int acC;
        public java.util.ArrayList<java.lang.Float> acD;
        public int accuracy;
        public long timestamp;
        public int type;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r4) {
                r3 = this;
                if (r4 != 0) goto L3
                return
            L3:
                java.lang.String r0 = "type"
                int r0 = r4.optInt(r0)
                r3.type = r0
                java.lang.String r0 = "interval"
                int r0 = r4.optInt(r0)
                r3.acC = r0
                java.lang.String r0 = "timestamp"
                long r0 = r4.optLong(r0)
                r3.timestamp = r0
                java.lang.String r0 = "accuracy"
                int r0 = r4.optInt(r0)
                r3.accuracy = r0
                java.lang.String r0 = "values"
                org.json.JSONArray r4 = r4.optJSONArray(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                if (r4 != 0) goto L33
                r3.acD = r0
                return
            L33:
                r1 = 0
            L34:
                int r2 = r4.length()     // Catch: java.lang.Throwable -> L48
                if (r1 >= r2) goto L48
                java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Throwable -> L48
                if (r2 == 0) goto L45
                java.lang.Float r2 = (java.lang.Float) r2     // Catch: java.lang.Throwable -> L48
                r0.add(r2)     // Catch: java.lang.Throwable -> L48
            L45:
                int r1 = r1 + 1
                goto L34
            L48:
                r3.acD = r0
                return
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r6 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                int r1 = r6.type
                if (r1 == 0) goto Le
                java.lang.String r2 = "type"
                com.kwad.sdk.utils.aa.putValue(r0, r2, r1)
            Le:
                int r1 = r6.acC
                if (r1 == 0) goto L17
                java.lang.String r2 = "interval"
                com.kwad.sdk.utils.aa.putValue(r0, r2, r1)
            L17:
                long r1 = r6.timestamp
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L24
                java.lang.String r3 = "timestamp"
                com.kwad.sdk.utils.aa.putValue(r0, r3, r1)
            L24:
                int r1 = r6.accuracy
                if (r1 == 0) goto L2d
                java.lang.String r2 = "accuracy"
                com.kwad.sdk.utils.aa.putValue(r0, r2, r1)
            L2d:
                java.util.ArrayList<java.lang.Float> r1 = r6.acD
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L3c
                java.lang.String r1 = "values"
                java.util.ArrayList<java.lang.Float> r2 = r6.acD
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            L3c:
                return r0
        }
    }

    public s() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.acz = r0
            return
    }

    private void a(int r3, int r4, com.kwad.sdk.core.webview.c.c r5) {
            r2 = this;
            com.kwad.sdk.utils.bi r0 = com.kwad.sdk.utils.bi.Rx()
            com.kwad.components.core.webview.jshandler.s$1 r1 = new com.kwad.components.core.webview.jshandler.s$1
            r1.<init>(r2, r5)
            r0.a(r3, r4, r2, r1)
            return
    }

    private void a(android.hardware.SensorEvent r6) {
            r5 = this;
            android.hardware.Sensor r0 = r6.sensor
            int r0 = r0.getType()
            r1 = 4
            if (r0 == r1) goto L10
            r1 = 10
            if (r0 == r1) goto Le
            goto L11
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 2
        L11:
            java.util.Map<java.lang.Integer, com.kwad.sdk.core.webview.c.c> r1 = r5.acz
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            com.kwad.sdk.core.webview.c.c r0 = (com.kwad.sdk.core.webview.c.c) r0
            if (r0 == 0) goto L48
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L25:
            float[] r3 = r6.values
            int r4 = r3.length
            if (r2 >= r4) goto L36
            r3 = r3[r2]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L25
        L36:
            com.kwad.components.core.webview.jshandler.s$a r2 = new com.kwad.components.core.webview.jshandler.s$a
            r2.<init>()
            r2.acD = r1
            long r3 = r6.timestamp
            r2.timestamp = r3
            int r6 = r6.accuracy
            r2.accuracy = r6
            r0.a(r2)
        L48:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L26
            com.kwad.components.core.webview.jshandler.s$a r0 = new com.kwad.components.core.webview.jshandler.s$a
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L13
            r1.<init>(r3)     // Catch: org.json.JSONException -> L13
            r0.parseJson(r1)     // Catch: org.json.JSONException -> L13
        L13:
            java.util.Map<java.lang.Integer, com.kwad.sdk.core.webview.c.c> r3 = r2.acz
            int r1 = r0.type
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r1, r4)
            int r3 = r0.type
            int r0 = r0.acC
            r2.a(r3, r0, r4)
            return
        L26:
            r3 = -1
            java.lang.String r0 = "data is empty"
            r4.onError(r3, r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerSensorListener"
            return r0
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            com.kwad.sdk.utils.bi r0 = com.kwad.sdk.utils.bi.Rx()
            r0.a(r1)
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent r1) {
            r0 = this;
            r0.a(r1)
            return
    }
}
