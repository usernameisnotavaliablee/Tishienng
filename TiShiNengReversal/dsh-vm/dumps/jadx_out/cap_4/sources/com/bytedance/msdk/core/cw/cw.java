package com.bytedance.msdk.core.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void cw(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.cw.xt r0 = r0.n()
            if (r0 == 0) goto L13
            com.bytedance.msdk.tl.j.cw r0 = com.bytedance.msdk.tl.j.cw.j()
            java.lang.String r1 = "fill"
            r0.insert(r2, r3, r4, r1)
        L13:
            return
    }

    private static int j(com.bytedance.msdk.core.oq.xt r1, com.bytedance.msdk.core.cw.xt r2, int r3) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.c()
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            if (r2 == 0) goto L61
            org.json.JSONObject r0 = r2.up()
            if (r0 != 0) goto L15
            goto L61
        L15:
            boolean r3 = r2.j(r3)
            if (r3 != 0) goto L1d
            r1 = 2
            return r1
        L1d:
            int r3 = r2.xt()
            if (r3 != 0) goto L25
            r1 = 3
            return r1
        L25:
            int r3 = r2.j()
            if (r3 != 0) goto L2d
            r1 = 4
            return r1
        L2d:
            boolean r3 = r2.ae()
            if (r3 != 0) goto L35
            r1 = 5
            return r1
        L35:
            if (r1 == 0) goto L5f
            java.lang.String r3 = r1.rn()
            boolean r3 = r2.j(r3)
            if (r3 != 0) goto L42
            goto L5f
        L42:
            int r3 = r1.b()
            if (r3 != 0) goto L4a
            r1 = 7
            return r1
        L4a:
            boolean r2 = j(r1, r2)
            if (r2 != 0) goto L53
            r1 = 8
            return r1
        L53:
            boolean r1 = j(r1)
            if (r1 == 0) goto L5c
            r1 = 9
            return r1
        L5c:
            r1 = 200(0xc8, float:2.8E-43)
            return r1
        L5f:
            r1 = 6
            return r1
        L61:
            r1 = 1
            return r1
    }

    public static com.bytedance.msdk.core.oq.xt j(com.bytedance.msdk.api.j.xt r29, com.bytedance.msdk.core.oq.xt r30) {
            r1 = r30
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.cw.xt r2 = r0.n()
            java.lang.String r0 = "----预缓存优化判断是否可以发起预缓存开始"
            java.lang.String r3 = "TMe"
            com.bytedance.msdk.j.up.cw.xt(r3, r0)
            r0 = 0
            if (r29 != 0) goto L15
            return r0
        L15:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "待检测的 behaviorState = "
            r4.<init>(r5)
            int r5 = r29.g()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r4)
            int r4 = r29.g()
            int r4 = j(r1, r2, r4)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 != r6) goto L264
            java.util.List r0 = r1.ol()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r6 = r0.iterator()
        L48:
            boolean r7 = r6.hasNext()
            java.lang.String r8 = " adnrit = "
            java.lang.String r9 = "adnName = "
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r6.next()
            com.bytedance.msdk.core.oq.oq r7 = (com.bytedance.msdk.core.oq.oq) r7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            java.lang.String r9 = r7.i()
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r7.w()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r8)
            java.lang.String r7 = r7.i()
            r4.add(r7)
            goto L48
        L7d:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r10 = r0.iterator()
        L8b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1dc
            java.lang.Object r11 = r10.next()
            com.bytedance.msdk.core.oq.oq r11 = (com.bytedance.msdk.core.oq.oq) r11
            if (r11 == 0) goto L1d0
            java.lang.String r12 = r11.i()
            java.lang.Object r12 = r7.get(r12)
            com.bytedance.msdk.core.cw.j r12 = (com.bytedance.msdk.core.cw.j) r12
            if (r12 != 0) goto L1a3
            java.lang.String r14 = r11.i()
            java.lang.String r15 = r1.rn()
            int r13 = r1.b()
            double r21 = r2.j(r14, r15)
            double r23 = r2.xt(r14, r15)
            r27 = r0
            java.lang.String r0 = " adnRit "
            r25 = 0
            int r16 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r16 != 0) goto Lec
            int r16 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r16 != 0) goto Lec
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "没有配置规则，直接添加到adn list中 adnName = "
            r12.<init>(r13)
            java.lang.String r13 = r11.i()
            r12.append(r13)
            r12.append(r0)
            java.lang.String r0 = r11.w()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r0)
            r6.add(r11)
            r0 = r27
            goto L8b
        Lec:
            long r18 = java.lang.System.currentTimeMillis()
            r16 = 3600000(0x36ee80, float:5.044674E-39)
            int r13 = r13 * r16
            r28 = r2
            long r1 = (long) r13
            long r16 = r18 - r1
            com.bytedance.msdk.tl.j.cw r13 = com.bytedance.msdk.tl.j.cw.j()
            java.util.List r1 = r13.query(r14, r15, r16, r18)
            if (r1 == 0) goto L180
            int r2 = r1.size()
            if (r2 == 0) goto L180
            java.util.Iterator r0 = r1.iterator()
            r1 = 0
            r2 = 0
            r12 = 0
        L111:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L14a
            java.lang.Object r13 = r0.next()
            com.bytedance.msdk.tl.j.xt r13 = (com.bytedance.msdk.tl.j.xt) r13
            java.lang.String r14 = r13.j()
            java.lang.String r15 = "send"
            boolean r14 = android.text.TextUtils.equals(r14, r15)
            if (r14 == 0) goto L12c
            int r12 = r12 + 1
            goto L111
        L12c:
            java.lang.String r14 = r13.j()
            java.lang.String r15 = "fill"
            boolean r14 = android.text.TextUtils.equals(r14, r15)
            if (r14 == 0) goto L13b
            int r1 = r1 + 1
            goto L111
        L13b:
            java.lang.String r13 = r13.j()
            java.lang.String r14 = "show"
            boolean r13 = android.text.TextUtils.equals(r13, r14)
            if (r13 == 0) goto L111
            int r2 = r2 + 1
            goto L111
        L14a:
            if (r1 == 0) goto L154
            double r13 = (double) r2
            r15 = r13
            double r13 = (double) r1
            double r13 = r15 / r13
            r17 = r13
            goto L156
        L154:
            r17 = r25
        L156:
            if (r12 == 0) goto L15d
            double r13 = (double) r1
            r15 = r13
            double r13 = (double) r12
            double r25 = r15 / r13
        L15d:
            r19 = r25
            com.bytedance.msdk.core.cw.j r16 = new com.bytedance.msdk.core.cw.j
            int r25 = r28.j()
            java.lang.String r26 = r28.m()
            r16.<init>(r17, r19, r21, r23, r25, r26)
            r0 = r16
            r0.xt(r1)
            r0.j(r12)
            r0.cw(r2)
            java.lang.String r1 = r11.i()
            r7.put(r1, r0)
            r12 = r0
            goto L1a7
        L180:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "数据库里没有查询到数据，直接添加到adn list中 adnName = "
            r1.<init>(r2)
            java.lang.String r2 = r11.i()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r11.w()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r0)
            r6.add(r11)
            goto L1a7
        L1a3:
            r27 = r0
            r28 = r2
        L1a7:
            if (r12 == 0) goto L1c4
            java.lang.String r0 = r11.i()
            r12.j(r0)
            java.lang.String r0 = r11.w()
            r12.xt(r0)
            java.lang.String r0 = "compareData "
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = r0.concat(r1)
            com.bytedance.msdk.j.up.cw.xt(r3, r0)
        L1c4:
            if (r12 == 0) goto L1d4
            boolean r0 = r12.j()
            if (r0 == 0) goto L1d4
            r6.add(r11)
            goto L1d4
        L1d0:
            r27 = r0
            r28 = r2
        L1d4:
            r1 = r30
            r0 = r27
            r2 = r28
            goto L8b
        L1dc:
            r27 = r0
            r28 = r2
            java.lang.String r0 = "筛选掉代码位 后留下的代码位 ------- "
            com.bytedance.msdk.j.up.cw.xt(r3, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L1ee:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21f
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            java.lang.String r11 = r2.i()
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = r2.w()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r10)
            java.lang.String r2 = r2.i()
            r0.add(r2)
            goto L1ee
        L21f:
            java.util.Iterator r1 = r4.iterator()
        L223:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L239
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L223
            r5.add(r2)
            goto L223
        L239:
            int r0 = r27.size()
            int r1 = r6.size()
            if (r0 != r1) goto L248
            r0 = 11
            r4 = 11
            goto L24c
        L248:
            r0 = 10
            r4 = 10
        L24c:
            com.bytedance.msdk.core.oq.xt r0 = r30.av()
            r0.j(r6)
            boolean r1 = r0.qv()
            if (r1 == 0) goto L25d
            r0.xt(r6)
            goto L260
        L25d:
            r0.j(r6)
        L260:
            r6 = r0
            r0 = r7
        L262:
            r3 = r4
            goto L268
        L264:
            r28 = r2
            r6 = r0
            goto L262
        L268:
            if (r6 != 0) goto L277
            r1 = r30
            r4 = r5
            r2 = r28
            r5 = r0
            r0 = r29
            j(r0, r1, r2, r3, r4, r5)
            r2 = r6
            goto L281
        L277:
            r1 = r29
            r4 = r3
            r2 = r6
            r3 = r28
            r6 = r0
            j(r1, r2, r3, r4, r5, r6)
        L281:
            if (r30 == 0) goto L28e
            java.lang.String r0 = r29.v()
            int r1 = r30.b()
            j(r0, r1)
        L28e:
            return r2
    }

    private static org.json.JSONArray j(com.bytedance.msdk.core.cw.xt r2) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r2 == 0) goto L1f
            java.util.List<java.lang.Integer> r2 = r2.j
            if (r2 == 0) goto L1f
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r2.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0.put(r1)
            goto Lf
        L1f:
            return r0
    }

    private static org.json.JSONObject j(int r8, com.bytedance.msdk.core.cw.xt r9, java.util.Map<java.lang.String, com.bytedance.msdk.core.cw.j> r10) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "rule_id"
            java.lang.String r2 = r9.cw()
            r0.put(r1, r2)
            java.lang.String r1 = "rule_timestamp"
            java.lang.String r2 = r9.r()
            r0.put(r1, r2)
            boolean r1 = xt(r8)
            if (r1 == 0) goto L1f
            goto L9f
        L1f:
            java.lang.String r1 = "condition"
            int r9 = r9.j()
            r0.put(r1, r9)
            r9 = 10
            if (r8 == r9) goto L33
            r9 = 11
            if (r8 != r9) goto L31
            goto L33
        L31:
            r8 = 0
            goto L34
        L33:
            r8 = 1
        L34:
            java.lang.String r9 = "rule_inuse"
            r0.put(r9, r8)
            if (r10 == 0) goto L9f
            java.text.DecimalFormat r8 = new java.text.DecimalFormat     // Catch: org.json.JSONException -> L9f
            java.lang.String r9 = "#0.000"
            r8.<init>(r9)     // Catch: org.json.JSONException -> L9f
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9f
            r9.<init>()     // Catch: org.json.JSONException -> L9f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9f
            r1.<init>()     // Catch: org.json.JSONException -> L9f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9f
            r2.<init>()     // Catch: org.json.JSONException -> L9f
            java.util.Set r10 = r10.entrySet()     // Catch: org.json.JSONException -> L9f
            java.util.Iterator r10 = r10.iterator()     // Catch: org.json.JSONException -> L9f
        L59:
            boolean r3 = r10.hasNext()     // Catch: org.json.JSONException -> L9f
            if (r3 == 0) goto L90
            java.lang.Object r3 = r10.next()     // Catch: org.json.JSONException -> L9f
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: org.json.JSONException -> L9f
            java.lang.Object r4 = r3.getValue()     // Catch: org.json.JSONException -> L9f
            com.bytedance.msdk.core.cw.j r4 = (com.bytedance.msdk.core.cw.j) r4     // Catch: org.json.JSONException -> L9f
            if (r4 == 0) goto L59
            java.lang.Object r5 = r3.getKey()     // Catch: org.json.JSONException -> L9f
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> L9f
            double r6 = r4.xt()     // Catch: org.json.JSONException -> L9f
            java.lang.String r6 = r8.format(r6)     // Catch: org.json.JSONException -> L9f
            r1.put(r5, r6)     // Catch: org.json.JSONException -> L9f
            java.lang.Object r3 = r3.getKey()     // Catch: org.json.JSONException -> L9f
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L9f
            double r4 = r4.cw()     // Catch: org.json.JSONException -> L9f
            java.lang.String r4 = r8.format(r4)     // Catch: org.json.JSONException -> L9f
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L9f
            goto L59
        L90:
            java.lang.String r8 = "ssr"
            r9.put(r8, r1)     // Catch: org.json.JSONException -> L9f
            java.lang.String r8 = "srr"
            r9.put(r8, r2)     // Catch: org.json.JSONException -> L9f
            java.lang.String r8 = "res"
            r0.put(r8, r9)     // Catch: org.json.JSONException -> L9f
        L9f:
            return r0
    }

    private static void j(com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.core.oq.xt r3, com.bytedance.msdk.core.cw.xt r4, int r5, java.util.Set<java.lang.String> r6, java.util.Map<java.lang.String, com.bytedance.msdk.core.cw.j> r7) {
            org.json.JSONObject r0 = r2.oq()
            if (r0 == 0) goto Le
            java.lang.String r2 = "TMe"
            java.lang.String r3 = "预缓存优化存在埋点数据 无需重新存储"
            com.bytedance.msdk.j.up.cw.xt(r2, r3)
            return
        Le:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "result"
            r0.put(r1, r5)     // Catch: org.json.JSONException -> L7d
            boolean r1 = j(r5)     // Catch: org.json.JSONException -> L7d
            if (r1 == 0) goto L22
            r2.j(r0)     // Catch: org.json.JSONException -> L7d
            return
        L22:
            java.lang.String r1 = "perform"
            org.json.JSONObject r7 = j(r5, r4, r7)     // Catch: org.json.JSONException -> L7d
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L7d
            boolean r5 = xt(r5)     // Catch: org.json.JSONException -> L7d
            if (r5 == 0) goto L35
            r2.j(r0)     // Catch: org.json.JSONException -> L7d
            return
        L35:
            java.lang.String r5 = "behavior_state"
            org.json.JSONArray r7 = j(r4)     // Catch: org.json.JSONException -> L7d
            r0.put(r5, r7)     // Catch: org.json.JSONException -> L7d
            java.lang.String r5 = "condition"
            int r4 = r4.xt()     // Catch: org.json.JSONException -> L7d
            r0.put(r5, r4)     // Catch: org.json.JSONException -> L7d
            if (r3 == 0) goto L54
            java.lang.String r4 = "behavior_ttl"
            int r3 = r3.b()     // Catch: org.json.JSONException -> L53
            r0.put(r4, r3)     // Catch: org.json.JSONException -> L53
            goto L54
        L53:
        L54:
            if (r6 == 0) goto L7a
            int r3 = r6.size()     // Catch: org.json.JSONException -> L7d
            if (r3 == 0) goto L7a
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L7d
            r3.<init>()     // Catch: org.json.JSONException -> L7d
            java.util.Iterator r4 = r6.iterator()     // Catch: org.json.JSONException -> L7d
        L65:
            boolean r5 = r4.hasNext()     // Catch: org.json.JSONException -> L7d
            if (r5 == 0) goto L75
            java.lang.Object r5 = r4.next()     // Catch: org.json.JSONException -> L7d
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> L7d
            r3.put(r5)     // Catch: org.json.JSONException -> L7d
            goto L65
        L75:
            java.lang.String r4 = "filtered_adn"
            r0.put(r4, r3)     // Catch: org.json.JSONException -> L7d
        L7a:
            r2.j(r0)     // Catch: org.json.JSONException -> L7d
        L7d:
            return
    }

    public static void j(java.lang.String r4, int r5) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.cw.xt r0 = r0.n()
            if (r0 == 0) goto L4d
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L4d
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 3600000(0x36ee80, float:5.044674E-39)
            int r5 = r5 * r2
            long r2 = (long) r5
            long r0 = r0 - r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "---预缓存优化删除存储的过期数据 primeRit = "
            r5.<init>(r2)
            r5.append(r4)
            java.lang.String r2 = " startTime = "
            r5.append(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            r2.<init>(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r0)
            java.lang.String r2 = r2.format(r3)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "TMe"
            com.bytedance.msdk.j.up.cw.xt(r2, r5)
            com.bytedance.msdk.tl.j.cw r5 = com.bytedance.msdk.tl.j.cw.j()
            r5.j(r4, r0)
        L4d:
            return
    }

    public static void j(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.cw.xt r0 = r0.n()
            if (r0 == 0) goto L13
            com.bytedance.msdk.tl.j.cw r0 = com.bytedance.msdk.tl.j.cw.j()
            java.lang.String r1 = "show"
            r0.insert(r2, r3, r4, r1)
        L13:
            return
    }

    private static boolean j(int r2) {
            r0 = 1
            if (r2 == 0) goto Lb
            if (r2 == r0) goto Lb
            r1 = 2
            if (r2 != r1) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            return r0
    }

    private static boolean j(com.bytedance.msdk.core.oq.xt r8) {
            r0 = 0
            if (r8 == 0) goto L2d
            long r6 = java.lang.System.currentTimeMillis()
            int r1 = r8.b()
            long r1 = (long) r1
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r1 = r1 * r3
            long r4 = r6 - r1
            com.bytedance.msdk.tl.j.cw r1 = com.bytedance.msdk.tl.j.cw.j()
            java.lang.String r2 = ""
            java.lang.String r3 = r8.rn()
            java.util.List r8 = r1.query(r2, r3, r4, r6)
            if (r8 == 0) goto L2b
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L2a
            goto L2b
        L2a:
            return r0
        L2b:
            r8 = 1
            return r8
        L2d:
            return r0
    }

    private static boolean j(com.bytedance.msdk.core.oq.xt r8, com.bytedance.msdk.core.cw.xt r9) {
            if (r8 == 0) goto L42
            java.util.List r0 = r8.ol()
            if (r0 == 0) goto L42
            if (r9 == 0) goto L42
            java.util.List r0 = r8.ol()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1
            java.lang.String r2 = r1.i()
            java.lang.String r3 = r8.rn()
            double r2 = r9.j(r2, r3)
            java.lang.String r1 = r1.i()
            java.lang.String r4 = r8.rn()
            double r4 = r9.xt(r1, r4)
            r6 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L40
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L12
        L40:
            r8 = 1
            return r8
        L42:
            r8 = 0
            return r8
    }

    public static void xt(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.cw.xt r0 = r0.n()
            if (r0 == 0) goto L13
            com.bytedance.msdk.tl.j.cw r0 = com.bytedance.msdk.tl.j.cw.j()
            java.lang.String r1 = "send"
            r0.insert(r2, r3, r4, r1)
        L13:
            return
    }

    private static boolean xt(int r1) {
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 == r0) goto L1a
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 6
            if (r1 == r0) goto L1a
            r0 = 7
            if (r1 == r0) goto L1a
            r0 = 8
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 != r0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }
}
