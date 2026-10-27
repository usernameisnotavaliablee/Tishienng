package com.bytedance.msdk.core.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j {
    protected final java.util.Map<java.lang.String, java.lang.String> j;
    protected final com.bytedance.msdk.tl.l xt;

    public j(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.j = r0
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r2 = com.bytedance.msdk.tl.l.j(r2, r0)
            r1.xt = r2
            r1.cw()
            return
    }

    private java.lang.String cw(int r8, java.lang.String r9) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "0"
            if (r0 != 0) goto L84
            r0 = 3
            if (r8 != r0) goto L84
            com.bytedance.msdk.tl.l r8 = r7.xt
            java.lang.String r8 = r8.xt(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L84
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L84
            java.lang.String r0 = "_"
            java.lang.String[] r0 = r8.split(r0)
            r2 = 0
            r2 = r0[r2]
            r3 = 1
            r0 = r0[r3]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L84
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L84
            java.lang.String r3 = "[0-9]+"
            boolean r3 = r0.matches(r3)
            if (r3 == 0) goto L6e
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L57
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L57
            long r5 = r5 - r3
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.NumberFormatException -> L57
            boolean r0 = r0.j(r5)     // Catch: java.lang.NumberFormatException -> L57
            if (r0 == 0) goto L51
            return r2
        L51:
            com.bytedance.msdk.tl.l r0 = r7.xt     // Catch: java.lang.NumberFormatException -> L57
            r0.m(r9)     // Catch: java.lang.NumberFormatException -> L57
            goto L84
        L57:
            com.bytedance.msdk.tl.l r0 = r7.xt
            r0.m(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "自定义上报 saveTime format exception valueTimestamp "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.bytedance.j.xt.a.f(r8)
            goto L84
        L6e:
            com.bytedance.msdk.tl.l r0 = r7.xt
            r0.m(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "自定义上报 saveTime is not number valueTimestamp "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.bytedance.j.xt.a.f(r8)
        L84:
            return r1
    }

    private void cw(int r2, java.lang.String r3, double r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L29
            r0 = 3
            if (r2 != r0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "_"
            r2.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.bytedance.msdk.tl.l r4 = r1.xt
            r4.j(r3, r2)
            r1.j(r3)
        L29:
            return
    }

    public static java.lang.String j(int r0) {
            switch(r0) {
                case 1: goto L1a;
                case 2: goto L17;
                case 3: goto L14;
                case 4: goto L14;
                case 5: goto L11;
                case 6: goto L3;
                case 7: goto Le;
                case 8: goto Lb;
                case 9: goto L8;
                case 10: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            java.lang.String r0 = "interstitialFull"
            return r0
        L8:
            java.lang.String r0 = "draw"
            return r0
        Lb:
            java.lang.String r0 = "fullscreenVideo"
            return r0
        Le:
            java.lang.String r0 = "rewardVideo"
            return r0
        L11:
            java.lang.String r0 = "native"
            return r0
        L14:
            java.lang.String r0 = "splash"
            return r0
        L17:
            java.lang.String r0 = "interstitial"
            return r0
        L1a:
            java.lang.String r0 = "banner"
            return r0
    }

    private java.lang.String j(int r13, java.lang.String r14) {
            r12 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto La9
            r0 = 3
            if (r13 != r0) goto La9
            java.util.Map r13 = r12.j()
            java.util.Set r13 = r13.entrySet()
            r0 = 2
            double[] r1 = new double[r0]
            java.util.Iterator r13 = r13.iterator()
        L18:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r13.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L18
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L18
            boolean r4 = r3.contains(r14)
            if (r4 == 0) goto L18
            java.lang.String r4 = "_"
            java.lang.String[] r3 = r3.split(r4)
            r4 = 0
            r5 = r3[r4]
            r6 = 1
            r7 = r3[r6]
            r3 = r3[r0]
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L18
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L18
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L18
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = java.lang.Long.parseLong(r3)
            long r8 = r8 - r10
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()
            boolean r3 = r3.j(r8)
            if (r3 == 0) goto L7c
            r2 = r1[r4]
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r8
            r1[r4] = r2
            r2 = r1[r6]
            double r4 = java.lang.Double.parseDouble(r7)
            double r2 = r2 + r4
            r1[r6] = r2
            goto L18
        L7c:
            r13.remove()
            com.bytedance.msdk.tl.l r3 = r12.xt
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r3.m(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "label_size_"
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.bytedance.msdk.tl.l r3 = r12.xt
            int r4 = r3.cw(r2)
            int r4 = r4 - r6
            r3.j(r2, r4)
            goto L18
        La4:
            java.lang.String r13 = r12.j(r1)
            return r13
        La9:
            java.lang.String r13 = "0"
            return r13
    }

    private java.lang.String j(java.lang.String r2, double r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private java.lang.String j(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "cpm_key_"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "_"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private synchronized void j(int r4, java.lang.String r5, double r6) {
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "label_size_"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            r0.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2f
            com.bytedance.msdk.tl.l r1 = r3.xt     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            int r1 = r1.xt(r0, r2)     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 + 1
            java.lang.String r2 = r3.j(r5, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r3.j(r5, r6)     // Catch: java.lang.Throwable -> L2f
            r3.j(r2, r4, r5)     // Catch: java.lang.Throwable -> L2f
            com.bytedance.msdk.tl.l r4 = r3.xt     // Catch: java.lang.Throwable -> L2f
            r4.j(r2, r5)     // Catch: java.lang.Throwable -> L2f
            com.bytedance.msdk.tl.l r4 = r3.xt     // Catch: java.lang.Throwable -> L2f
            r4.j(r0, r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return
        L2f:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4
    }

    private java.lang.String xt(int r7, java.lang.String r8) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = "0"
            if (r0 != 0) goto L4e
            r0 = 3
            if (r7 != r0) goto L4e
            com.bytedance.msdk.tl.l r7 = r6.xt
            java.lang.String r7 = r7.xt(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L4e
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "_"
            java.lang.String[] r7 = r7.split(r0)
            r0 = 0
            r0 = r7[r0]
            r2 = 1
            r7 = r7[r2]
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4e
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L4e
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = java.lang.Long.parseLong(r7)
            long r2 = r2 - r4
            com.bytedance.msdk.core.ws.cw r7 = com.bytedance.msdk.core.xt.xt()
            boolean r7 = r7.j(r2)
            if (r7 == 0) goto L49
            return r0
        L49:
            com.bytedance.msdk.tl.l r7 = r6.xt
            r7.m(r8)
        L4e:
            return r1
    }

    private void xt(int r2, java.lang.String r3, double r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L29
            r0 = 3
            if (r2 != r0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "_"
            r2.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.bytedance.msdk.tl.l r4 = r1.xt
            r4.j(r3, r2)
            r1.j(r3)
        L29:
            return
    }

    protected void cw() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "0"
            java.lang.String r2 = "a"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "1"
            java.lang.String r2 = "b"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "2"
            java.lang.String r2 = "c"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "3"
            java.lang.String r2 = "d"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "4"
            java.lang.String r2 = "e"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "5"
            java.lang.String r2 = "f"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "6"
            java.lang.String r2 = "g"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "7"
            java.lang.String r2 = "h"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "8"
            java.lang.String r2 = "i"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "9"
            java.lang.String r2 = "j"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.j
            java.lang.String r1 = "."
            java.lang.String r2 = "k"
            r0.put(r1, r2)
            return
    }

    protected double j(int r3, java.lang.String r4, int r5) {
            r2 = this;
            r0 = 1
            r1 = 2
            if (r5 != r0) goto L1b
            java.lang.String r3 = r2.j(r3, r4)
            double r3 = java.lang.Double.parseDouble(r3)
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r3)
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r3 = r3.setScale(r1, r4)
            double r3 = r3.doubleValue()
            return r3
        L1b:
            r0 = 3
            if (r5 != r0) goto L35
            java.lang.String r3 = r2.xt(r3, r4)
            double r3 = java.lang.Double.parseDouble(r3)
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r3)
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r3 = r3.setScale(r1, r4)
            double r3 = r3.doubleValue()
            return r3
        L35:
            if (r5 != r1) goto L4e
            java.lang.String r3 = r2.cw(r3, r4)
            double r3 = java.lang.Double.parseDouble(r3)
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r3)
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r3 = r3.setScale(r1, r4)
            double r3 = r3.doubleValue()
            return r3
        L4e:
            r3 = 0
            return r3
    }

    public java.lang.String j(double[] r6) {
            r5 = this;
            r0 = 0
            r0 = r6[r0]
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1e
            r2 = 1
            r2 = r6[r2]
            double r2 = r2 / r0
            java.math.BigDecimal r6 = new java.math.BigDecimal
            r6.<init>(r2)
            r0 = 2
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r6 = r6.setScale(r0, r1)
            java.lang.String r6 = r6.toString()
            return r6
        L1e:
            java.lang.String r6 = "-1.0"
            return r6
    }

    protected abstract java.util.Map<java.lang.String, java.lang.String> j();

    protected abstract org.json.JSONObject j(com.bytedance.msdk.core.oq.cw r1);

    public void j(double r8, double r10, java.lang.String r12, java.lang.String r13) {
            r7 = this;
            com.bytedance.msdk.tl.l r0 = r7.xt
            if (r0 == 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L11
            goto L23
        L11:
            java.lang.String r3 = "_last_post_cpm_"
            r1 = r7
            r5 = r8
            r2 = r12
            r4 = r13
            r1.j(r2, r3, r4, r5)
            r12 = r10
            r9 = r2
            java.lang.String r10 = "_last_bidding_cpm_"
            r8 = r7
            r11 = r4
            r8.j(r9, r10, r11, r12)
        L23:
            return
    }

    protected void j(int r2, java.lang.String r3, int r4, double r5) {
            r1 = this;
            r0 = 1
            if (r4 != r0) goto L7
            r1.j(r2, r3, r5)
            return
        L7:
            r0 = 3
            if (r4 != r0) goto Le
            r1.xt(r2, r3, r5)
            return
        Le:
            r0 = 2
            if (r4 != r0) goto L14
            r1.cw(r2, r3, r5)
        L14:
            return
    }

    public void j(java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "label_size_"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.tl.l r1 = r4.xt
            int r0 = r1.cw(r0)
        L14:
            if (r0 <= 0) goto L42
            java.lang.String r1 = r4.j(r5, r0)     // Catch: java.lang.Throwable -> L27
            com.bytedance.msdk.tl.l r2 = r4.xt     // Catch: java.lang.Throwable -> L27
            r2.m(r1)     // Catch: java.lang.Throwable -> L27
            java.util.Map r2 = r4.j()     // Catch: java.lang.Throwable -> L27
            r2.remove(r1)     // Catch: java.lang.Throwable -> L27
            goto L3f
        L27:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "clearFromSpByRit,ignore:"
            r2.<init>(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "CalculateLabelValueImpl"
            com.bytedance.msdk.j.up.cw.r(r2, r1)
        L3f:
            int r0 = r0 + (-1)
            goto L14
        L42:
            return
    }

    protected abstract void j(java.lang.String r1, int r2, java.lang.String r3);

    protected abstract void j(java.lang.String r1, java.lang.String r2);

    protected void j(java.lang.String r2, java.lang.String r3, java.lang.String r4, double r5) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            com.bytedance.msdk.tl.l r3 = r1.xt
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "_"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r3.j(r2, r4)
            return
    }

    protected void j(java.lang.String r4, org.json.JSONObject r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
            r3 = this;
            java.lang.String r0 = "cost_time"
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.hl()
            if (r1 == 0) goto L44
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L13
            goto L44
        L13:
            if (r5 == 0) goto L44
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r6 != 0) goto L22
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            goto L23
        L22:
            r2 = r6
        L23:
            boolean r4 = r3.xt(r4, r1, r2)
            if (r4 == 0) goto L44
            java.lang.String r4 = "label"
            r5.putOpt(r4, r1)     // Catch: org.json.JSONException -> L40
            if (r6 == 0) goto L44
            java.lang.Object r4 = r6.get(r0)     // Catch: org.json.JSONException -> L40
            if (r4 == 0) goto L44
            java.lang.String r4 = "uvalueExcTime"
            java.lang.Object r6 = r6.get(r0)     // Catch: org.json.JSONException -> L40
            r5.put(r4, r6)     // Catch: org.json.JSONException -> L40
            return
        L40:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L44:
            return
    }

    public double[] j(int r19, double r20, double r22, java.lang.String r24, java.lang.String r25) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r24
            r3 = r25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r5 = "_last_post_cpm_"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = "_last_load_cpm_"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = "_last_bidding_cpm_"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.bytedance.msdk.tl.l r6 = r0.xt
            java.lang.String r4 = r6.xt(r4)
            com.bytedance.msdk.tl.l r6 = r0.xt
            java.lang.String r5 = r6.xt(r5)
            com.bytedance.msdk.tl.l r6 = r0.xt
            java.lang.String r3 = r6.xt(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = "0"
            r8 = 0
            java.lang.String r9 = "_"
            r10 = 1
            r11 = 2
            r12 = 0
            if (r6 != 0) goto L8d
            java.lang.String[] r4 = r4.split(r9)
            int r6 = r4.length
            if (r6 != r11) goto L8d
            r6 = r4[r8]
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            if (r14 != 0) goto L8d
            boolean r6 = android.text.TextUtils.equals(r6, r2)
            if (r6 == 0) goto L8d
            r4 = r4[r10]
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L7a
            r4 = r7
        L7a:
            double r14 = java.lang.Double.parseDouble(r4)
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r14)
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r4 = r4.setScale(r11, r6)
            double r14 = r4.doubleValue()
            goto L8e
        L8d:
            r14 = r12
        L8e:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto Lc5
            java.lang.String[] r4 = r5.split(r9)
            int r5 = r4.length
            if (r5 != r11) goto Lc5
            r5 = r4[r8]
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto Lc5
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            if (r5 == 0) goto Lc5
            r4 = r4[r10]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto Lb2
            r4 = r7
        Lb2:
            double r4 = java.lang.Double.parseDouble(r4)
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r4)
            java.math.RoundingMode r5 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r4 = r4.setScale(r11, r5)
            double r4 = r4.doubleValue()
            goto Lc6
        Lc5:
            r4 = r12
        Lc6:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto Lfe
            java.lang.String[] r3 = r3.split(r9)
            int r6 = r3.length
            if (r6 != r11) goto Lfe
            r6 = r3[r8]
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 != 0) goto Lfe
            boolean r2 = android.text.TextUtils.equals(r6, r2)
            if (r2 == 0) goto Lfe
            r2 = r3[r10]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto Lea
            goto Leb
        Lea:
            r7 = r2
        Leb:
            double r2 = java.lang.Double.parseDouble(r7)
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r2)
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r2 = r2.setScale(r11, r3)
            double r2 = r2.doubleValue()
            goto Lff
        Lfe:
            r2 = r12
        Lff:
            int r6 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r6 != 0) goto L119
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 != 0) goto L119
            int r7 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r7 != 0) goto L119
            int r7 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r7 != 0) goto L119
            int r7 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r7 != 0) goto L119
            double[] r1 = new double[r11]
            r1 = {x0152: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            return r1
        L119:
            r7 = 3
            if (r6 == 0) goto L120
            r14 = r20
            r6 = 2
            goto L121
        L120:
            r6 = 3
        L121:
            r9 = 4
            r16 = 5
            int r17 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r17 == 0) goto L12c
            r2 = r22
            r12 = 5
            goto L12d
        L12c:
            r12 = 4
        L12d:
            int r13 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r13 < 0) goto L137
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 < 0) goto L13d
            r4 = r14
            goto L13f
        L137:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L13d
            r6 = 1
            goto L13f
        L13d:
            r4 = r2
            r6 = r12
        L13f:
            if (r1 != r7) goto L144
            if (r6 != r7) goto L144
            r6 = 2
        L144:
            if (r1 != r7) goto L149
            if (r6 != r9) goto L149
            r6 = 5
        L149:
            double r1 = (double) r6
            double[] r3 = new double[r11]
            r3[r8] = r4
            r3[r10] = r1
            return r3
    }

    protected java.lang.String xt(java.lang.String r6) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L2b
            char[] r6 = r6.toCharArray()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L27
            char r3 = r6[r2]
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.j
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto L11
        L27:
            java.lang.String r6 = r0.toString()
        L2b:
            return r6
    }

    protected void xt() {
            r3 = this;
            com.bytedance.msdk.tl.l r0 = r3.xt
            java.util.Map r0 = r0.xt()
            if (r0 == 0) goto L32
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L10
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.j(r2, r1)
            goto L10
        L32:
            return
    }

    protected abstract boolean xt(java.lang.String r1, org.json.JSONObject r2, java.util.Map<java.lang.String, java.lang.Object> r3);
}
