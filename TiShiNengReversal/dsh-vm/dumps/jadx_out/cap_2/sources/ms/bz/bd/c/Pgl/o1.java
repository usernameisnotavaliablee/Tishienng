package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o1 extends ms.bz.bd.c.Pgl.pblw {
    private com.bytedance.framwork.core.sdkmonitor.SDKMonitor b;

    final class pgla implements com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams {
        final /* synthetic */ org.json.JSONObject a;
        final /* synthetic */ java.lang.String b;

        pgla(org.json.JSONObject r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }
    }

    public o1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pblw
    public final void d(long r11, long r13, java.lang.String r15, java.lang.String r16, int r17) {
            r10 = this;
            com.bytedance.framwork.core.sdkmonitor.SDKMonitor r0 = r10.b
            if (r0 != 0) goto L5
            return
        L5:
            r6 = 0
            r9 = 0
            r1 = r11
            r3 = r13
            r5 = r15
            r7 = r16
            r8 = r17
            r0.monitorSLA(r1, r3, r5, r6, r7, r8, r9)
            return
    }

    @Override // ms.bz.bd.c.Pgl.pblw
    public final void e(java.lang.String r10, org.json.JSONObject r11, org.json.JSONObject r12, org.json.JSONObject r13) {
            r9 = this;
            r0 = 39
            byte[] r6 = new byte[r0]
            r6 = {x00ac: FILL_ARRAY_DATA , data: [16, 54, 74, 95, 14, 117, 35, 60, 127, 108, 45, 46, 103, 66, 13, 89, 48, 23, 104, 110, 38, 40, 11, 94, 15, 102, 39, 16, 106, 108, 45, 59, 70, 72, 74, 57, 124, 84, 41} // fill-array
            r3 = 0
            java.lang.String r5 = "28895c"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            com.bytedance.framwork.core.sdkmonitor.SDKMonitor r0 = r9.b
            if (r0 != 0) goto L18
            goto Lab
        L18:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L96
            r0.<init>()     // Catch: org.json.JSONException -> L96
            java.lang.String r5 = "218b31"
            r1 = 11
            byte[] r6 = new byte[r1]     // Catch: org.json.JSONException -> L96
            r6 = {x00c4: FILL_ARRAY_DATA , data: [48, 54, 89, 0, 5, 37, 52, 30, 104, 63, 38} // fill-array     // Catch: org.json.JSONException -> L96
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)     // Catch: org.json.JSONException -> L96
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L96
            r0.put(r1, r10)     // Catch: org.json.JSONException -> L96
            java.lang.String r6 = "d7d139"
            r1 = 8
            byte[] r7 = new byte[r1]     // Catch: org.json.JSONException -> L96
            r7 = {x00ce: FILL_ARRAY_DATA , data: [118, 52, 3, 64, 11, 33, 117, 15} // fill-array     // Catch: org.json.JSONException -> L96
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: org.json.JSONException -> L96
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L96
            r0.put(r1, r11)     // Catch: org.json.JSONException -> L96
            java.lang.String r6 = "4e2978"
            r1 = 6
            byte[] r7 = new byte[r1]     // Catch: org.json.JSONException -> L96
            r7 = {x00d6: FILL_ARRAY_DATA , data: [40, 98, 85, 95, 1, 44} // fill-array     // Catch: org.json.JSONException -> L96
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: org.json.JSONException -> L96
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L96
            r0.put(r1, r12)     // Catch: org.json.JSONException -> L96
            java.lang.String r6 = "157b25"
            r1 = 7
            byte[] r7 = new byte[r1]     // Catch: org.json.JSONException -> L96
            r7 = {x00de: FILL_ARRAY_DATA , data: [44, 56, 67, 51, 21, 54, 32} // fill-array     // Catch: org.json.JSONException -> L96
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: org.json.JSONException -> L96
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L96
            r0.put(r2, r13)     // Catch: org.json.JSONException -> L96
            java.lang.String r7 = "1d042f"
            byte[] r8 = new byte[r1]     // Catch: org.json.JSONException -> L96
            r8 = {x00e6: FILL_ARRAY_DATA , data: [13, 67, 119, 97, 62, 84, 17} // fill-array     // Catch: org.json.JSONException -> L96
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: org.json.JSONException -> L96
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L96
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L96
            com.bytedance.sdk.component.utils.vl.r(r1, r0)     // Catch: org.json.JSONException -> L96
            goto L9a
        L96:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L9a:
            int r0 = r11.length()
            if (r0 > 0) goto La6
            int r0 = r12.length()
            if (r0 <= 0) goto Lab
        La6:
            com.bytedance.framwork.core.sdkmonitor.SDKMonitor r0 = r9.b
            r0.monitorEvent(r10, r11, r12, r13)
        Lab:
            return
    }

    @Override // ms.bz.bd.c.Pgl.pblw
    public final boolean g(java.lang.String r15) {
            r14 = this;
            ms.bz.bd.c.Pgl.pblv r0 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r0 = r0.c()
            r1 = 0
            if (r15 == 0) goto L22
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L11
            r2.<init>(r15)     // Catch: org.json.JSONException -> L11
            goto L23
        L11:
            r15 = 3
            byte[] r7 = new byte[r15]
            r7 = {x0116: FILL_ARRAY_DATA , data: [49, 49, 72} // fill-array
            r4 = 0
            java.lang.String r6 = "3662ab"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
        L22:
            r2 = r1
        L23:
            r15 = 0
            if (r2 != 0) goto L27
            return r15
        L27:
            r3 = 10
            java.lang.String r8 = "dffdb7"
            r4 = 7
            byte[] r9 = new byte[r4]     // Catch: org.json.JSONException -> Lcb
            r9 = {x011c: FILL_ARRAY_DATA , data: [102, 96, 30, 47, 92, 41, 99} // fill-array     // Catch: org.json.JSONException -> Lcb
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: org.json.JSONException -> Lcb
            java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> Lcb
            java.lang.String r4 = r2.getString(r4)     // Catch: org.json.JSONException -> Lcb
            java.lang.String r9 = "166135"
            r5 = 8
            byte[] r10 = new byte[r5]     // Catch: org.json.JSONException -> Lc8
            r10 = {x0124: FILL_ARRAY_DATA , data: [40, 59, 86, 81, 51, 35, 59, 19} // fill-array     // Catch: org.json.JSONException -> Lc8
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.Object r5 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)     // Catch: org.json.JSONException -> Lc8
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> Lc8
            java.lang.String r1 = r2.getString(r5)     // Catch: org.json.JSONException -> Lc8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: org.json.JSONException -> Lc8
            r5.<init>()     // Catch: org.json.JSONException -> Lc8
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: org.json.JSONException -> Lc8
            r6.<init>()     // Catch: org.json.JSONException -> Lc8
            java.lang.String r11 = "37d1a7"
            byte[] r12 = new byte[r3]     // Catch: org.json.JSONException -> Lc8
            r12 = {x012c: FILL_ARRAY_DATA , data: [33, 58, 25, 67, 87, 39, 5, 36, 25, 114} // fill-array     // Catch: org.json.JSONException -> Lc8
            r7 = 16777217(0x1000001, float:2.350989E-38)
            r8 = 0
            r9 = 0
            java.lang.Object r7 = com.volcengine.mobsecBiz.matrix.pgla.a(r7, r8, r9, r11, r12)     // Catch: org.json.JSONException -> Lc8
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> Lc8
            org.json.JSONArray r7 = r2.getJSONArray(r7)     // Catch: org.json.JSONException -> Lc8
            java.lang.String r12 = "995c48"
            byte[] r13 = new byte[r3]     // Catch: org.json.JSONException -> Lc8
            r13 = {x0136: FILL_ARRAY_DATA , data: [58, 62, 86, 24, 25, 59, 15, 42, 72, 32} // fill-array     // Catch: org.json.JSONException -> Lc8
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r8, r9, r10, r12, r13)     // Catch: org.json.JSONException -> Lc8
            java.lang.String r8 = (java.lang.String) r8     // Catch: org.json.JSONException -> Lc8
            org.json.JSONArray r8 = r2.getJSONArray(r8)     // Catch: org.json.JSONException -> Lc8
            r9 = 0
        L93:
            int r10 = r7.length()     // Catch: org.json.JSONException -> Lc8
            if (r9 >= r10) goto La3
            java.lang.String r10 = r7.getString(r9)     // Catch: org.json.JSONException -> Lc8
            r5.add(r10)     // Catch: org.json.JSONException -> Lc8
            int r9 = r9 + 1
            goto L93
        La3:
            r7 = 0
        La4:
            int r9 = r8.length()     // Catch: org.json.JSONException -> Lc8
            if (r7 >= r9) goto Lb4
            java.lang.String r9 = r8.getString(r7)     // Catch: org.json.JSONException -> Lc8
            r6.add(r9)     // Catch: org.json.JSONException -> Lc8
            int r7 = r7 + 1
            goto La4
        Lb4:
            int r7 = r5.size()     // Catch: org.json.JSONException -> Lc8
            if (r7 <= 0) goto Lc7
            int r7 = r6.size()     // Catch: org.json.JSONException -> Lc8
            if (r7 <= 0) goto Lc7
            com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.setConfigUrl(r4, r5)     // Catch: org.json.JSONException -> Lc8
            com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.setDefaultReportUrl(r4, r6)     // Catch: org.json.JSONException -> Lc8
            goto Ldf
        Lc7:
            return r15
        Lc8:
            r15 = r1
            r1 = r4
            goto Lcc
        Lcb:
            r15 = r1
        Lcc:
            r4 = 5
            byte[] r10 = new byte[r4]
            r10 = {x0140: FILL_ARRAY_DATA , data: [99, 51, 72, 127, 5} // fill-array
            r7 = 0
            java.lang.String r9 = "a46430"
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)
            r4 = r1
            r1 = r15
        Ldf:
            byte[] r10 = new byte[r3]
            r10 = {x0148: FILL_ARRAY_DATA , data: [33, 108, 77, 68, 1, 37, 5, 114, 77, 117} // fill-array
            r7 = 0
            java.lang.String r9 = "3a0675"
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            java.lang.Object r15 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)
            java.lang.String r15 = (java.lang.String) r15
            r2.remove(r15)
            byte[] r10 = new byte[r3]
            r10 = {x0152: FILL_ARRAY_DATA , data: [97, 51, 91, 67, 26, 96, 84, 39, 69, 123} // fill-array
            java.lang.String r9 = "b4887c"
            java.lang.Object r15 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)
            java.lang.String r15 = (java.lang.String) r15
            r2.remove(r15)
            ms.bz.bd.c.Pgl.o1$pgla r15 = new ms.bz.bd.c.Pgl.o1$pgla
            r15.<init>(r2, r1)
            com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.initMonitor(r0, r4, r2, r15)
            com.bytedance.framwork.core.sdkmonitor.SDKMonitor r15 = com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.getInstance(r4)
            r14.b = r15
            r15 = 1
            return r15
    }

    @Override // ms.bz.bd.c.Pgl.pblw
    public final void h(long r11, long r13, java.lang.String r15, java.lang.String r16, int r17) {
            r10 = this;
            com.bytedance.framwork.core.sdkmonitor.SDKMonitor r0 = r10.b
            if (r0 != 0) goto L5
            return
        L5:
            r6 = 0
            r9 = 0
            r1 = r11
            r3 = r13
            r5 = r15
            r7 = r16
            r8 = r17
            r0.monitorApiError(r1, r3, r5, r6, r7, r8, r9)
            return
    }
}
