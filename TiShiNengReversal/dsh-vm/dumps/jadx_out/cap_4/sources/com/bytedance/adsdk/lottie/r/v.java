package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class v {
    public v() {
            r1 = this;
            r1.<init>()
            return
    }

    private static org.json.JSONArray cw(android.util.JsonReader r7) {
            java.lang.String r0 = "hd"
            java.lang.String r1 = "vid"
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r7.beginArray()     // Catch: java.lang.Exception -> L43
        Lc:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L65
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L43
            r3.<init>()     // Catch: java.lang.Exception -> L43
            r2.put(r3)     // Catch: java.lang.Exception -> L43
            r7.beginObject()     // Catch: java.lang.Exception -> L43
        L1d:
            boolean r4 = r7.hasNext()     // Catch: java.lang.Exception -> L43
            if (r4 == 0) goto L61
            java.lang.String r4 = r7.nextName()     // Catch: java.lang.Exception -> L43
            int r5 = r4.hashCode()     // Catch: java.lang.Exception -> L43
            r6 = 3324(0xcfc, float:4.658E-42)
            if (r5 == r6) goto L4a
            r6 = 116753(0x1c811, float:1.63606E-40)
            if (r5 == r6) goto L35
            goto L5d
        L35:
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Exception -> L43
            if (r4 == 0) goto L5d
            java.lang.String r4 = r7.nextString()     // Catch: java.lang.Exception -> L43 org.json.JSONException -> L45
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L43 org.json.JSONException -> L45
            goto L1d
        L43:
            r7 = move-exception
            goto L69
        L45:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Exception -> L43
            goto L1d
        L4a:
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Exception -> L43
            if (r4 == 0) goto L5d
            int r4 = r7.nextInt()     // Catch: java.lang.Exception -> L43 org.json.JSONException -> L58
            r3.put(r0, r4)     // Catch: java.lang.Exception -> L43 org.json.JSONException -> L58
            goto L1d
        L58:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Exception -> L43
            goto L1d
        L5d:
            r7.skipValue()     // Catch: java.lang.Exception -> L43
            goto L1d
        L61:
            r7.endObject()     // Catch: java.lang.Exception -> L43
            goto Lc
        L65:
            r7.endArray()     // Catch: java.lang.Exception -> L43
            goto L6c
        L69:
            com.bytedance.sdk.component.utils.vl.j(r7)
        L6c:
            return r2
    }

    public static com.bytedance.adsdk.lottie.m j(android.util.JsonReader r31) throws java.io.IOException {
            r0 = r31
            float r1 = com.bytedance.adsdk.lottie.up.g.j()
            android.util.LongSparseArray r8 = new android.util.LongSparseArray
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            com.bytedance.adsdk.lottie.m$r r14 = new com.bytedance.adsdk.lottie.m$r
            r14.<init>()
            com.bytedance.adsdk.lottie.m$xt r2 = new com.bytedance.adsdk.lottie.m$xt
            r2.<init>()
            com.bytedance.adsdk.lottie.m$cw r3 = new com.bytedance.adsdk.lottie.m$cw
            r3.<init>()
            com.bytedance.adsdk.lottie.m$j r4 = new com.bytedance.adsdk.lottie.m$j
            r4.<init>()
            com.bytedance.adsdk.lottie.m r5 = new com.bytedance.adsdk.lottie.m
            r5.<init>()
            r0.beginObject()
            r15 = 0
            r20 = r1
            r18 = r15
            r1 = 0
            r6 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
        L53:
            boolean r21 = r0.hasNext()
            if (r21 == 0) goto L212
            r21 = r15
            java.lang.String r15 = r0.nextName()
            r15.getClass()
            int r22 = r15.hashCode()
            r23 = 2
            r24 = 1
            r25 = -1
            switch(r22) {
                case -1408207997: goto L157;
                case -1109732030: goto L149;
                case -865448777: goto L13b;
                case 104: goto L12d;
                case 118: goto L11f;
                case 119: goto L111;
                case 3208: goto L103;
                case 3276: goto Lf3;
                case 3292: goto Le3;
                case 3367: goto Ld3;
                case 3553: goto Lc3;
                case 3002509: goto Lb3;
                case 94623709: goto La3;
                case 97615364: goto L93;
                case 110364485: goto L83;
                case 839250809: goto L73;
                default: goto L6f;
            }
        L6f:
            r22 = r1
            goto L164
        L73:
            r22 = r1
            java.lang.String r1 = "markers"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L7f
            goto L164
        L7f:
            r25 = 15
            goto L164
        L83:
            r22 = r1
            java.lang.String r1 = "timer"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L8f
            goto L164
        L8f:
            r25 = 14
            goto L164
        L93:
            r22 = r1
            java.lang.String r1 = "fonts"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L9f
            goto L164
        L9f:
            r25 = 13
            goto L164
        La3:
            r22 = r1
            java.lang.String r1 = "chars"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto Laf
            goto L164
        Laf:
            r25 = 12
            goto L164
        Lb3:
            r22 = r1
            java.lang.String r1 = "area"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto Lbf
            goto L164
        Lbf:
            r25 = 11
            goto L164
        Lc3:
            r22 = r1
            java.lang.String r1 = "op"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto Lcf
            goto L164
        Lcf:
            r25 = 10
            goto L164
        Ld3:
            r22 = r1
            java.lang.String r1 = "ip"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto Ldf
            goto L164
        Ldf:
            r25 = 9
            goto L164
        Le3:
            r22 = r1
            java.lang.String r1 = "gc"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto Lef
            goto L164
        Lef:
            r25 = 8
            goto L164
        Lf3:
            r22 = r1
            java.lang.String r1 = "fr"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto Lff
            goto L164
        Lff:
            r25 = 7
            goto L164
        L103:
            r22 = r1
            java.lang.String r1 = "dl"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L10e
            goto L164
        L10e:
            r25 = 6
            goto L164
        L111:
            r22 = r1
            java.lang.String r1 = "w"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L11c
            goto L164
        L11c:
            r25 = 5
            goto L164
        L11f:
            r22 = r1
            java.lang.String r1 = "v"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L12a
            goto L164
        L12a:
            r25 = 4
            goto L164
        L12d:
            r22 = r1
            java.lang.String r1 = "h"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L138
            goto L164
        L138:
            r25 = 3
            goto L164
        L13b:
            r22 = r1
            java.lang.String r1 = "globalEvent"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L146
            goto L164
        L146:
            r25 = 2
            goto L164
        L149:
            r22 = r1
            java.lang.String r1 = "layers"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L154
            goto L164
        L154:
            r25 = 1
            goto L164
        L157:
            r22 = r1
            java.lang.String r1 = "assets"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L162
            goto L164
        L162:
            r25 = 0
        L164:
            switch(r25) {
                case 0: goto L20b;
                case 1: goto L205;
                case 2: goto L1ff;
                case 3: goto L1f3;
                case 4: goto L1c3;
                case 5: goto L1bc;
                case 6: goto L1b5;
                case 7: goto L1aa;
                case 8: goto L1a3;
                case 9: goto L195;
                case 10: goto L182;
                case 11: goto L17e;
                case 12: goto L17a;
                case 13: goto L176;
                case 14: goto L172;
                case 15: goto L16b;
                default: goto L167;
            }
        L167:
            r0.skipValue()
            goto L16e
        L16b:
            j(r0, r13)
        L16e:
            r15 = r11
            r1 = r12
            goto L210
        L172:
            j(r0, r14)
            goto L16e
        L176:
            j(r0, r12)
            goto L16e
        L17a:
            j(r0, r5, r11)
            goto L16e
        L17e:
            j(r0, r4)
            goto L16e
        L182:
            r15 = r11
            r1 = r12
            double r11 = r0.nextDouble()
            float r11 = (float) r11
            r12 = 1008981770(0x3c23d70a, float:0.01)
            float r11 = r11 - r12
            r12 = r15
            r15 = r11
            r11 = r12
            r12 = r1
        L191:
            r1 = r22
            goto L53
        L195:
            r15 = r11
            r1 = r12
            double r11 = r0.nextDouble()
            float r11 = (float) r11
            r12 = r1
            r16 = r11
        L19f:
            r11 = r15
        L1a0:
            r15 = r21
            goto L191
        L1a3:
            r15 = r11
            r1 = r12
            j(r0, r2)
            goto L210
        L1aa:
            r15 = r11
            r1 = r12
            double r11 = r0.nextDouble()
            float r11 = (float) r11
            r12 = r1
            r17 = r11
            goto L19f
        L1b5:
            r15 = r11
            r1 = r12
            java.lang.String r18 = r0.nextString()
            goto L1a0
        L1bc:
            r15 = r11
            r1 = r12
            int r6 = r0.nextInt()
            goto L1a0
        L1c3:
            r15 = r11
            r1 = r12
            java.lang.String r11 = r0.nextString()
            java.lang.String r12 = "\\."
            java.lang.String[] r11 = r11.split(r12)
            r12 = r11[r19]
            int r25 = java.lang.Integer.parseInt(r12)
            r12 = r11[r24]
            int r26 = java.lang.Integer.parseInt(r12)
            r11 = r11[r23]
            int r27 = java.lang.Integer.parseInt(r11)
            r29 = 4
            r30 = 0
            r28 = 4
            boolean r11 = com.bytedance.adsdk.lottie.up.g.j(r25, r26, r27, r28, r29, r30)
            if (r11 != 0) goto L210
            java.lang.String r11 = "Lottie only supports bodymovin >= 4.4.0"
            r5.j(r11)
            goto L210
        L1f3:
            r15 = r11
            r1 = r12
            int r11 = r0.nextInt()
            r1 = r11
            r11 = r15
            r15 = r21
            goto L53
        L1ff:
            r15 = r11
            r1 = r12
            j(r0, r3)
            goto L210
        L205:
            r15 = r11
            r1 = r12
            j(r0, r5, r7, r8)
            goto L210
        L20b:
            r15 = r11
            r1 = r12
            j(r0, r5, r9, r10)
        L210:
            r12 = r1
            goto L19f
        L212:
            r22 = r1
            r1 = r12
            r21 = r15
            r15 = r11
            r0.endObject()
            float r0 = (float) r6
            float r0 = r0 * r20
            int r0 = (int) r0
            r6 = r22
            float r6 = (float) r6
            float r6 = r6 * r20
            int r6 = (int) r6
            r11 = r17
            r17 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r12 = 0
            r3.<init>(r12, r12, r0, r6)
            r12 = r1
            r6 = r11
            r11 = r15
            r15 = r18
            r18 = r4
            r4 = r16
            r16 = r2
            r2 = r5
            r5 = r21
            r2.j(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r2
    }

    private static void j(android.util.JsonReader r3, com.bytedance.adsdk.lottie.g.j r4) {
        L0:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L76
            java.lang.String r0 = r3.nextName()     // Catch: java.lang.Exception -> L77
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L77
            r2 = -2128704353(0xffffffff811e8c9f, float:-2.9120907E-38)
            if (r1 == r2) goto L63
            r2 = 3308(0xcec, float:4.635E-42)
            if (r1 == r2) goto L18
            goto L72
        L18:
            java.lang.String r1 = "gs"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L72
            android.util.JsonToken r0 = r3.peek()     // Catch: java.lang.Exception -> L77
            android.util.JsonToken r1 = android.util.JsonToken.NULL     // Catch: java.lang.Exception -> L77
            if (r0 != r1) goto L2c
            r3.nextNull()     // Catch: java.lang.Exception -> L77
            goto L0
        L2c:
            com.bytedance.adsdk.lottie.g$j$j r0 = new com.bytedance.adsdk.lottie.g$j$j     // Catch: java.lang.Exception -> L77
            r0.<init>()     // Catch: java.lang.Exception -> L77
            r4.j = r0     // Catch: java.lang.Exception -> L77
            r3.beginObject()     // Catch: java.lang.Exception -> L77
        L36:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L5f
            java.lang.String r0 = r3.nextName()     // Catch: java.lang.Exception -> L77
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L77
            r2 = 114(0x72, float:1.6E-43)
            if (r1 == r2) goto L49
            goto L5b
        L49:
            java.lang.String r1 = "r"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L5b
            com.bytedance.adsdk.lottie.g$j$j r0 = r4.j     // Catch: java.lang.Exception -> L77
            double r1 = r3.nextDouble()     // Catch: java.lang.Exception -> L77
            float r1 = (float) r1     // Catch: java.lang.Exception -> L77
            r0.j = r1     // Catch: java.lang.Exception -> L77
            goto L36
        L5b:
            r3.skipValue()     // Catch: java.lang.Exception -> L77
            goto L36
        L5f:
            r3.endObject()     // Catch: java.lang.Exception -> L77
            goto L0
        L63:
            java.lang.String r1 = "is_secondary"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L72
            boolean r0 = r3.nextBoolean()     // Catch: java.lang.Exception -> L77
            r4.xt = r0     // Catch: java.lang.Exception -> L77
            goto L0
        L72:
            r3.skipValue()     // Catch: java.lang.Exception -> L77
            goto L0
        L76:
            return
        L77:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private static void j(android.util.JsonReader r4, com.bytedance.adsdk.lottie.m.cw r5) {
            r4.beginObject()     // Catch: java.lang.Exception -> L85
        L3:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L81
            java.lang.String r0 = r4.nextName()     // Catch: java.lang.Exception -> L85
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L85
            r2 = 3239(0xca7, float:4.539E-42)
            if (r1 == r2) goto L6e
            r2 = 107027(0x1a213, float:1.49977E-40)
            if (r1 == r2) goto L5f
            r2 = 3237004(0x31648c, float:4.536009E-39)
            if (r1 == r2) goto L20
            goto L7d
        L20:
            java.lang.String r1 = "inel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L7d
            r0 = -1
            int[] r0 = new int[]{r0, r0}     // Catch: java.lang.Exception -> L85
            r1 = 1
            int[][] r1 = new int[r1][]     // Catch: java.lang.Exception -> L85
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Exception -> L85
            r5.xt = r1     // Catch: java.lang.Exception -> L85
            r4.beginArray()     // Catch: java.lang.Exception -> L85
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L5b
            r4.beginArray()     // Catch: java.lang.Exception -> L85
            r0 = 0
        L42:
            r1 = 2
            if (r0 >= r1) goto L58
            boolean r1 = r4.hasNext()     // Catch: java.lang.Exception -> L85
            if (r1 == 0) goto L55
            int[][] r1 = r5.xt     // Catch: java.lang.Exception -> L85
            r1 = r1[r2]     // Catch: java.lang.Exception -> L85
            int r3 = r4.nextInt()     // Catch: java.lang.Exception -> L85
            r1[r0] = r3     // Catch: java.lang.Exception -> L85
        L55:
            int r0 = r0 + 1
            goto L42
        L58:
            r4.endArray()     // Catch: java.lang.Exception -> L85
        L5b:
            r4.endArray()     // Catch: java.lang.Exception -> L85
            goto L3
        L5f:
            java.lang.String r1 = "lel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L7d
            org.json.JSONArray r0 = cw(r4)     // Catch: java.lang.Exception -> L85
            r5.cw = r0     // Catch: java.lang.Exception -> L85
            goto L3
        L6e:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L7d
            java.lang.String r0 = r4.nextString()     // Catch: java.lang.Exception -> L85
            r5.j = r0     // Catch: java.lang.Exception -> L85
            goto L3
        L7d:
            r4.skipValue()     // Catch: java.lang.Exception -> L85
            goto L3
        L81:
            r4.endObject()     // Catch: java.lang.Exception -> L85
            return
        L85:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    private static void j(android.util.JsonReader r3, com.bytedance.adsdk.lottie.m.j r4) {
            r3.beginObject()     // Catch: java.lang.Exception -> L5d
        L3:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L59
            java.lang.String r0 = r3.nextName()     // Catch: java.lang.Exception -> L5d
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L5d
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L46
            switch(r1) {
                case 119: goto L37;
                case 120: goto L28;
                case 121: goto L19;
                default: goto L18;
            }     // Catch: java.lang.Exception -> L5d
        L18:
            goto L55
        L19:
            java.lang.String r1 = "y"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L55
            java.lang.String r0 = r3.nextString()     // Catch: java.lang.Exception -> L5d
            r4.xt = r0     // Catch: java.lang.Exception -> L5d
            goto L3
        L28:
            java.lang.String r1 = "x"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L55
            java.lang.String r0 = r3.nextString()     // Catch: java.lang.Exception -> L5d
            r4.j = r0     // Catch: java.lang.Exception -> L5d
            goto L3
        L37:
            java.lang.String r1 = "w"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L55
            java.lang.String r0 = r3.nextString()     // Catch: java.lang.Exception -> L5d
            r4.cw = r0     // Catch: java.lang.Exception -> L5d
            goto L3
        L46:
            java.lang.String r1 = "h"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L55
            java.lang.String r0 = r3.nextString()     // Catch: java.lang.Exception -> L5d
            r4.f1819r = r0     // Catch: java.lang.Exception -> L5d
            goto L3
        L55:
            r3.skipValue()     // Catch: java.lang.Exception -> L5d
            goto L3
        L59:
            r3.endObject()     // Catch: java.lang.Exception -> L5d
            return
        L5d:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private static void j(android.util.JsonReader r3, com.bytedance.adsdk.lottie.m.r r4) {
            r3.beginObject()     // Catch: java.lang.Exception -> Lc3
        L3:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r3.nextName()     // Catch: java.lang.Exception -> Lc3
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> Lc3
            r2 = 3123(0xc33, float:4.376E-42)
            if (r1 == r2) goto Laa
            r2 = 3239(0xca7, float:4.539E-42)
            if (r1 == r2) goto L9a
            r2 = 3355(0xd1b, float:4.701E-42)
            if (r1 == r2) goto L8a
            r2 = 3418(0xd5a, float:4.79E-42)
            if (r1 == r2) goto L7a
            r2 = 3704(0xe78, float:5.19E-42)
            if (r1 == r2) goto L6b
            r2 = 107027(0x1a213, float:1.49977E-40)
            if (r1 == r2) goto L5c
            r2 = 3237004(0x31648c, float:4.536009E-39)
            if (r1 == r2) goto L31
            goto Lba
        L31:
            java.lang.String r1 = "inel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lba
            r0 = -1
            int[] r0 = new int[]{r0, r0}     // Catch: java.lang.Exception -> Lc3
            r4.up = r0     // Catch: java.lang.Exception -> Lc3
            r3.beginArray()     // Catch: java.lang.Exception -> Lc3
            r0 = 0
        L44:
            r1 = 2
            if (r0 >= r1) goto L58
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> Lc3
            if (r1 == 0) goto L55
            int[] r1 = r4.up     // Catch: java.lang.Exception -> Lc3
            int r2 = r3.nextInt()     // Catch: java.lang.Exception -> Lc3
            r1[r0] = r2     // Catch: java.lang.Exception -> Lc3
        L55:
            int r0 = r0 + 1
            goto L44
        L58:
            r3.endArray()     // Catch: java.lang.Exception -> Lc3
            goto L3
        L5c:
            java.lang.String r1 = "lel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lba
            org.json.JSONArray r0 = cw(r3)     // Catch: java.lang.Exception -> Lc3
            r4.ae = r0     // Catch: java.lang.Exception -> Lc3
            goto L3
        L6b:
            java.lang.String r1 = "tl"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lba
            java.lang.String r0 = r3.nextString()     // Catch: java.lang.Exception -> Lc3
            r4.cw = r0     // Catch: java.lang.Exception -> Lc3
            goto L3
        L7a:
            java.lang.String r1 = "ke"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lba
            int r0 = r3.nextInt()     // Catch: java.lang.Exception -> Lc3
            r4.j = r0     // Catch: java.lang.Exception -> Lc3
            goto L3
        L8a:
            java.lang.String r1 = "id"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lba
            java.lang.String r0 = r3.nextString()     // Catch: java.lang.Exception -> Lc3
            r4.xt = r0     // Catch: java.lang.Exception -> Lc3
            goto L3
        L9a:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lba
            java.lang.String r0 = r3.nextString()     // Catch: java.lang.Exception -> Lc3
            r4.f1822m = r0     // Catch: java.lang.Exception -> Lc3
            goto L3
        Laa:
            java.lang.String r1 = "at"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lba
            java.lang.String r0 = r3.nextString()     // Catch: java.lang.Exception -> Lc3
            r4.f1823r = r0     // Catch: java.lang.Exception -> Lc3
            goto L3
        Lba:
            r3.skipValue()     // Catch: java.lang.Exception -> Lc3
            goto L3
        Lbf:
            r3.endObject()     // Catch: java.lang.Exception -> Lc3
            return
        Lc3:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private static void j(android.util.JsonReader r3, com.bytedance.adsdk.lottie.m.xt r4) {
            r3.beginObject()     // Catch: java.lang.Exception -> L77
        L3:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L73
            java.lang.String r0 = r3.nextName()     // Catch: java.lang.Exception -> L77
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L77
            r2 = 3139(0xc43, float:4.399E-42)
            if (r1 == r2) goto L60
            r2 = 3232(0xca0, float:4.529E-42)
            if (r1 == r2) goto L51
            r2 = 3571(0xdf3, float:5.004E-42)
            if (r1 == r2) goto L42
            r2 = 3666(0xe52, float:5.137E-42)
            if (r1 == r2) goto L33
            r2 = 98713(0x18199, float:1.38326E-40)
            if (r1 == r2) goto L27
            goto L6f
        L27:
            java.lang.String r1 = "cpf"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L6f
            xt(r3, r4)     // Catch: java.lang.Exception -> L77
            goto L3
        L33:
            java.lang.String r1 = "se"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L6f
            int r0 = r3.nextInt()     // Catch: java.lang.Exception -> L77
            r4.j = r0     // Catch: java.lang.Exception -> L77
            goto L3
        L42:
            java.lang.String r1 = "pc"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L6f
            int r0 = r3.nextInt()     // Catch: java.lang.Exception -> L77
            r4.f1827r = r0     // Catch: java.lang.Exception -> L77
            goto L3
        L51:
            java.lang.String r1 = "ee"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L6f
            java.util.Map r0 = xt(r3)     // Catch: java.lang.Exception -> L77
            r4.cw = r0     // Catch: java.lang.Exception -> L77
            goto L3
        L60:
            java.lang.String r1 = "be"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L6f
            java.util.Map r0 = xt(r3)     // Catch: java.lang.Exception -> L77
            r4.xt = r0     // Catch: java.lang.Exception -> L77
            goto L3
        L6f:
            r3.skipValue()     // Catch: java.lang.Exception -> L77
            goto L3
        L73:
            r3.endObject()     // Catch: java.lang.Exception -> L77
            return
        L77:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private static void j(android.util.JsonReader r2, com.bytedance.adsdk.lottie.m r3, android.util.SparseArray<com.bytedance.adsdk.lottie.model.r> r4) throws java.io.IOException {
            r2.beginArray()
        L3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L15
            com.bytedance.adsdk.lottie.model.r r0 = com.bytedance.adsdk.lottie.r.jy.j(r2, r3)
            int r1 = r0.hashCode()
            r4.put(r1, r0)
            goto L3
        L15:
            r2.endArray()
            return
    }

    private static void j(android.util.JsonReader r4, com.bytedance.adsdk.lottie.m r5, java.util.List<com.bytedance.adsdk.lottie.model.layer.tl> r6, android.util.LongSparseArray<com.bytedance.adsdk.lottie.model.layer.tl> r7) throws java.io.IOException {
            r4.beginArray()
            r0 = 0
        L4:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3c
            com.bytedance.adsdk.lottie.model.layer.tl r1 = com.bytedance.adsdk.lottie.r.f.j(r4, r5)
            com.bytedance.adsdk.lottie.model.layer.tl$j r2 = r1.qv()
            com.bytedance.adsdk.lottie.model.layer.tl$j r3 = com.bytedance.adsdk.lottie.model.layer.tl.j.cw
            if (r2 != r3) goto L18
            int r0 = r0 + 1
        L18:
            r6.add(r1)
            long r2 = r1.up()
            r7.put(r2, r1)
            r1 = 4
            if (r0 <= r1) goto L4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "You have "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.adsdk.lottie.up.up.xt(r1)
            goto L4
        L3c:
            r4.endArray()
            return
    }

    private static void j(android.util.JsonReader r20, com.bytedance.adsdk.lottie.m r21, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.lottie.model.layer.tl>> r22, java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> r23) throws java.io.IOException {
            r20.beginArray()
        L3:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L1d9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.LongSparseArray r1 = new android.util.LongSparseArray
            r1.<init>()
            r20.beginObject()
            r3 = 0
            r7 = r3
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r5 = 0
            r6 = 0
        L26:
            boolean r3 = r20.hasNext()
            if (r3 == 0) goto L1bb
            java.lang.String r3 = r20.nextName()
            r3.getClass()
            int r4 = r3.hashCode()
            r18 = 0
            r2 = 1
            switch(r4) {
                case -1109732030: goto Lde;
                case -847116302: goto Ld2;
                case 104: goto Lc6;
                case 112: goto Lba;
                case 117: goto Laf;
                case 119: goto La4;
                case 3239: goto L99;
                case 3355: goto L8e;
                case 3633: goto L81;
                case 3695: goto L74;
                case 107027: goto L67;
                case 107902: goto L5a;
                case 112793: goto L4d;
                case 3237004: goto L40;
                default: goto L3d;
            }
        L3d:
            r3 = -1
            goto Le9
        L40:
            java.lang.String r4 = "inel"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L49
            goto L3d
        L49:
            r3 = 13
            goto Le9
        L4d:
            java.lang.String r4 = "rel"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L56
            goto L3d
        L56:
            r3 = 12
            goto Le9
        L5a:
            java.lang.String r4 = "md5"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L63
            goto L3d
        L63:
            r3 = 11
            goto Le9
        L67:
            java.lang.String r4 = "lel"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L70
            goto L3d
        L70:
            r3 = 10
            goto Le9
        L74:
            java.lang.String r4 = "tc"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L7d
            goto L3d
        L7d:
            r3 = 9
            goto Le9
        L81:
            java.lang.String r4 = "rc"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L8a
            goto L3d
        L8a:
            r3 = 8
            goto Le9
        L8e:
            java.lang.String r4 = "id"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L97
            goto L3d
        L97:
            r3 = 7
            goto Le9
        L99:
            java.lang.String r4 = "el"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La2
            goto L3d
        La2:
            r3 = 6
            goto Le9
        La4:
            java.lang.String r4 = "w"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lad
            goto L3d
        Lad:
            r3 = 5
            goto Le9
        Laf:
            java.lang.String r4 = "u"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lb8
            goto L3d
        Lb8:
            r3 = 4
            goto Le9
        Lba:
            java.lang.String r4 = "p"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lc4
            goto L3d
        Lc4:
            r3 = 3
            goto Le9
        Lc6:
            java.lang.String r4 = "h"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Ld0
            goto L3d
        Ld0:
            r3 = 2
            goto Le9
        Ld2:
            java.lang.String r4 = "ugen_v"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Ldc
            goto L3d
        Ldc:
            r3 = 1
            goto Le9
        Lde:
            java.lang.String r4 = "layers"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Le8
            goto L3d
        Le8:
            r3 = 0
        Le9:
            switch(r3) {
                case 0: goto L19a;
                case 1: goto L192;
                case 2: goto L18a;
                case 3: goto L182;
                case 4: goto L17a;
                case 5: goto L172;
                case 6: goto L16a;
                case 7: goto L162;
                case 8: goto L141;
                case 9: goto L135;
                case 10: goto L12f;
                case 11: goto L129;
                case 12: goto L123;
                case 13: goto Lf1;
                default: goto Lec;
            }
        Lec:
            r20.skipValue()
            goto L26
        Lf1:
            int[][] r13 = new int[r2][]
            r2 = -1
            int[] r2 = new int[]{r2, r2}
            r13[r18] = r2
            r20.beginArray()
            boolean r2 = r20.hasNext()
            if (r2 == 0) goto L11e
            r20.beginArray()
            r2 = 0
            r3 = 2
        L108:
            if (r2 >= r3) goto L11b
            boolean r4 = r20.hasNext()
            if (r4 == 0) goto L118
            r4 = r13[r18]
            int r19 = r20.nextInt()
            r4[r2] = r19
        L118:
            int r2 = r2 + 1
            goto L108
        L11b:
            r20.endArray()
        L11e:
            r20.endArray()
            goto L26
        L123:
            java.lang.String r10 = r20.nextString()
            goto L26
        L129:
            java.lang.String r15 = r20.nextString()
            goto L26
        L12f:
            org.json.JSONArray r14 = cw(r20)
            goto L26
        L135:
            r20.beginArray()
            java.util.List r11 = r(r20)
            r20.endArray()
            goto L26
        L141:
            android.util.JsonToken r2 = r20.peek()
            android.util.JsonToken r3 = android.util.JsonToken.NULL
            if (r2 != r3) goto L14e
            r20.nextNull()
            goto L26
        L14e:
            com.bytedance.adsdk.lottie.g$j r2 = new com.bytedance.adsdk.lottie.g$j
            r2.<init>()
            r20.beginObject()
            r3 = r20
            j(r3, r2)
            r3.endObject()
            r17 = r2
            goto L26
        L162:
            r3 = r20
            java.lang.String r7 = r3.nextString()
            goto L26
        L16a:
            r3 = r20
            java.lang.String r12 = r3.nextString()
            goto L26
        L172:
            r3 = r20
            int r5 = r3.nextInt()
            goto L26
        L17a:
            r3 = r20
            java.lang.String r9 = r3.nextString()
            goto L26
        L182:
            r3 = r20
            java.lang.String r8 = r3.nextString()
            goto L26
        L18a:
            r3 = r20
            int r6 = r3.nextInt()
            goto L26
        L192:
            r3 = r20
            java.lang.String r16 = r3.nextString()
            goto L26
        L19a:
            r3 = r20
            r3.beginArray()
        L19f:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1b6
            com.bytedance.adsdk.lottie.model.layer.tl r2 = com.bytedance.adsdk.lottie.r.f.j(r20, r21)
            long r3 = r2.up()
            r1.put(r3, r2)
            r0.add(r2)
            r3 = r20
            goto L19f
        L1b6:
            r20.endArray()
            goto L26
        L1bb:
            r20.endObject()
            if (r8 == 0) goto L1d0
            com.bytedance.adsdk.lottie.g r4 = new com.bytedance.adsdk.lottie.g
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = r4.qv()
            r1 = r23
            r1.put(r0, r4)
            goto L3
        L1d0:
            r2 = r22
            r1 = r23
            r2.put(r7, r0)
            goto L3
        L1d9:
            r20.endArray()
            return
    }

    private static void j(android.util.JsonReader r6, java.util.List<com.bytedance.adsdk.lottie.model.m> r7) throws java.io.IOException {
            r6.beginArray()
        L3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            r6.beginObject()
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = 0
        L10:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L5e
            java.lang.String r3 = r6.nextName()
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3178: goto L3c;
                case 3214: goto L31;
                case 3705: goto L26;
                default: goto L25;
            }
        L25:
            goto L46
        L26:
            java.lang.String r4 = "tm"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2f
            goto L46
        L2f:
            r5 = 2
            goto L46
        L31:
            java.lang.String r4 = "dr"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3a
            goto L46
        L3a:
            r5 = 1
            goto L46
        L3c:
            java.lang.String r4 = "cm"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L45
            goto L46
        L45:
            r5 = 0
        L46:
            switch(r5) {
                case 0: goto L59;
                case 1: goto L53;
                case 2: goto L4d;
                default: goto L49;
            }
        L49:
            r6.skipValue()
            goto L10
        L4d:
            double r3 = r6.nextDouble()
            float r0 = (float) r3
            goto L10
        L53:
            double r3 = r6.nextDouble()
            float r1 = (float) r3
            goto L10
        L59:
            java.lang.String r2 = r6.nextString()
            goto L10
        L5e:
            r6.endObject()
            com.bytedance.adsdk.lottie.model.m r3 = new com.bytedance.adsdk.lottie.model.m
            r3.<init>(r2, r0, r1)
            r7.add(r3)
            goto L3
        L6a:
            r6.endArray()
            return
    }

    private static void j(android.util.JsonReader r2, java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.model.cw> r3) throws java.io.IOException {
            r2.beginObject()
        L3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.String r0 = r2.nextName()
            r0.getClass()
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            r2.skipValue()
            goto L3
        L1c:
            r2.beginArray()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L31
            com.bytedance.adsdk.lottie.model.cw r0 = com.bytedance.adsdk.lottie.r.ws.j(r2)
            java.lang.String r1 = r0.xt()
            r3.put(r1, r0)
            goto L1f
        L31:
            r2.endArray()
            goto L3
        L35:
            r2.endObject()
            return
    }

    private static java.util.List<com.bytedance.adsdk.lottie.g.xt> r(android.util.JsonReader r5) {
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le4
            r0.<init>()     // Catch: java.lang.Exception -> Le4
        L5:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> Le4
            if (r1 == 0) goto Le3
            com.bytedance.adsdk.lottie.g$xt r1 = new com.bytedance.adsdk.lottie.g$xt     // Catch: java.lang.Exception -> Le4
            r1.<init>()     // Catch: java.lang.Exception -> Le4
            r5.beginObject()     // Catch: java.lang.Exception -> Le4
        L13:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ldb
            java.lang.String r2 = r5.nextName()     // Catch: java.lang.Exception -> Le4
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> Le4
            r4 = 99
            if (r3 == r4) goto Lc6
            r4 = 102(0x66, float:1.43E-43)
            if (r3 == r4) goto Lb6
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto La6
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L96
            r4 = 3153(0xc51, float:4.418E-42)
            if (r3 == r4) goto L86
            r4 = 3449(0xd79, float:4.833E-42)
            if (r3 == r4) goto L77
            r4 = 96670(0x1799e, float:1.35464E-40)
            if (r3 == r4) goto L68
            r4 = 101199(0x18b4f, float:1.4181E-40)
            if (r3 == r4) goto L59
            r4 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r3 == r4) goto L4a
            goto Ld6
        L4a:
            java.lang.String r3 = "bold"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Le4
            r1.ae = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        L59:
            java.lang.String r3 = "fcl"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            java.lang.String r2 = r5.nextString()     // Catch: java.lang.Exception -> Le4
            r1.cw = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        L68:
            java.lang.String r3 = "ali"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            java.lang.String r2 = r5.nextString()     // Catch: java.lang.Exception -> Le4
            r1.g = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        L77:
            java.lang.String r3 = "le"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Le4
            r1.xt = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        L86:
            java.lang.String r3 = "bs"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Le4
            r1.tl = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        L96:
            java.lang.String r3 = "s"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Le4
            r1.f1764m = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        La6:
            java.lang.String r3 = "l"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Le4
            r1.j = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        Lb6:
            java.lang.String r3 = "f"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            java.lang.String r2 = r5.nextString()     // Catch: java.lang.Exception -> Le4
            r1.up = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        Lc6:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Le4
            if (r2 == 0) goto Ld6
            java.lang.String r2 = r5.nextString()     // Catch: java.lang.Exception -> Le4
            r1.f1765r = r2     // Catch: java.lang.Exception -> Le4
            goto L13
        Ld6:
            r5.skipValue()     // Catch: java.lang.Exception -> Le4
            goto L13
        Ldb:
            r5.endObject()     // Catch: java.lang.Exception -> Le4
            r0.add(r1)     // Catch: java.lang.Exception -> Le4
            goto L5
        Le3:
            return r0
        Le4:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
            r5 = 0
            return r5
    }

    private static java.util.Map<java.lang.String, java.lang.Object> xt(android.util.JsonReader r5) throws java.io.IOException {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.beginObject()
        L8:
            boolean r1 = r5.hasNext()
            java.lang.String r2 = "lel"
            java.lang.String r3 = "lottie_back"
            if (r1 == 0) goto L6f
            java.lang.String r1 = r5.nextName()
            r1.getClass()
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L67
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            r5.skipValue()
            goto L8
        L29:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r0.put(r3, r1)
            r5.beginObject()
        L34:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L63
            java.lang.String r2 = r5.nextName()
            r2.getClass()
            java.lang.String r4 = "hd"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4d
            r5.skipValue()
            goto L34
        L4d:
            int r2 = r5.nextInt()     // Catch: org.json.JSONException -> L5e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L5e
            r1.putOpt(r4, r2)     // Catch: org.json.JSONException -> L5e
            java.lang.String r2 = "vid"
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L5e
            goto L34
        L5e:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            goto L34
        L63:
            r5.endObject()
            goto L8
        L67:
            org.json.JSONArray r1 = cw(r5)
            r0.put(r2, r1)
            goto L8
        L6f:
            r5.endObject()
            java.lang.Object r5 = r0.remove(r3)
            boolean r1 = r5 instanceof org.json.JSONObject
            if (r1 == 0) goto L93
            java.lang.Object r1 = r0.get(r2)
            boolean r3 = r1 instanceof org.json.JSONArray
            if (r3 == 0) goto L88
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            r1.put(r5)
            goto L93
        L88:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r1.put(r5)
            r0.put(r2, r1)
        L93:
            return r0
    }

    private static void xt(android.util.JsonReader r3, com.bytedance.adsdk.lottie.m.xt r4) {
            r3.beginObject()     // Catch: java.io.IOException -> L54
        L3:
            boolean r0 = r3.hasNext()     // Catch: java.io.IOException -> L54
            if (r0 == 0) goto L50
            java.lang.String r0 = r3.nextName()     // Catch: java.io.IOException -> L54
            int r1 = r0.hashCode()     // Catch: java.io.IOException -> L54
            r2 = 3239(0xca7, float:4.539E-42)
            if (r1 == r2) goto L3d
            r2 = 3276(0xccc, float:4.59E-42)
            if (r1 == r2) goto L2e
            r2 = 107027(0x1a213, float:1.49977E-40)
            if (r1 == r2) goto L1f
            goto L4c
        L1f:
            java.lang.String r1 = "lel"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L54
            if (r0 == 0) goto L4c
            org.json.JSONArray r0 = cw(r3)     // Catch: java.io.IOException -> L54
            r4.ae = r0     // Catch: java.io.IOException -> L54
            goto L3
        L2e:
            java.lang.String r1 = "fr"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L54
            if (r0 == 0) goto L4c
            int r0 = r3.nextInt()     // Catch: java.io.IOException -> L54
            r4.up = r0     // Catch: java.io.IOException -> L54
            goto L3
        L3d:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L54
            if (r0 == 0) goto L4c
            java.lang.String r0 = r3.nextString()     // Catch: java.io.IOException -> L54
            r4.f1826m = r0     // Catch: java.io.IOException -> L54
            goto L3
        L4c:
            r3.skipValue()     // Catch: java.io.IOException -> L54
            goto L3
        L50:
            r3.endObject()     // Catch: java.io.IOException -> L54
            return
        L54:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }
}
