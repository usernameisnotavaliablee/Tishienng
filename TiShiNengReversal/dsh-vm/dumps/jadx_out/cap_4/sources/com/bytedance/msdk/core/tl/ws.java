package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ws {
    private static volatile com.bytedance.msdk.core.tl.ws j;
    private java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> cw;
    private java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.tl.xt>> xt;

    private ws() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cw = r0
            return
    }

    public static com.bytedance.msdk.core.tl.ws j() {
            com.bytedance.msdk.core.tl.ws r0 = com.bytedance.msdk.core.tl.ws.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.tl.ws> r0 = com.bytedance.msdk.core.tl.ws.class
            monitor-enter(r0)
            com.bytedance.msdk.core.tl.ws r1 = com.bytedance.msdk.core.tl.ws.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.tl.ws r1 = new com.bytedance.msdk.core.tl.ws     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.tl.ws.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.core.tl.ws r0 = com.bytedance.msdk.core.tl.ws.j
            return r0
    }

    public com.bytedance.msdk.api.j j(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkLoad rit_level adnName = "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " slotId = "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " primeRit = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK_RitAdnShowControl"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r0 != 0) goto Ldd
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto Ldd
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L38
            goto Ldd
        L38:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> r0 = r5.cw
            if (r0 == 0) goto L6c
            java.lang.Object r7 = r0.get(r7)
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            if (r7 == 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "_"
            r0.append(r6)
            r0.append(r8)
            java.lang.String r6 = r0.toString()
            java.lang.Object r6 = r7.get(r6)
            com.bytedance.msdk.core.tl.j r6 = (com.bytedance.msdk.core.tl.j) r6
            java.lang.String r7 = "checkLoad rit_level 取出的showBean = "
            java.lang.String r8 = java.lang.String.valueOf(r6)
            java.lang.String r7 = r7.concat(r8)
            com.bytedance.msdk.j.up.cw.j(r1, r7)
            goto L6d
        L6c:
            r6 = r2
        L6d:
            if (r6 == 0) goto Ldd
            long r7 = r6.j()
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto Ldd
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            long r7 = r7.getTime()
            long r3 = r6.j()
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto Ldd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "checkLoad rit_level 当前时间 = "
            r0.<init>(r2)
            java.lang.String r7 = com.bytedance.msdk.core.tl.m.xt(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "checkLoad rit_level 规则有效时间 = "
            r7.<init>(r8)
            long r2 = r6.j()
            java.lang.String r8 = com.bytedance.msdk.core.tl.m.xt(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r7)
            com.bytedance.msdk.api.xt.j r7 = new com.bytedance.msdk.api.xt.j
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r0 = 40064(0x9c80, float:5.6142E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r8.append(r1)
            java.lang.String r1 = ", "
            r8.append(r1)
            java.lang.String r6 = r6.xt()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r0, r6)
            return r7
        Ldd:
            return r2
    }

    public void j(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "setRitAdnError rit_level adnName = "
            r1.<init>(r4)
            r1.append(r12)
            java.lang.String r4 = " slotId = "
            r1.append(r4)
            r1.append(r13)
            java.lang.String r4 = " error = "
            r1.append(r4)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "TTMediationSDK_RitAdnShowControl"
            com.bytedance.msdk.j.up.cw.j(r7, r1)
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.tl.xt>> r1 = r10.xt
            if (r1 != 0) goto L29
            goto Le9
        L29:
            java.lang.Object r1 = r1.get(r12)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Le9
            int r4 = r1.size()
            if (r4 != 0) goto L39
            goto Le9
        L39:
            java.util.Iterator r1 = r1.iterator()
        L3d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r1.next()
            com.bytedance.msdk.core.tl.xt r4 = (com.bytedance.msdk.core.tl.xt) r4
            java.util.List r5 = r4.cw()
            boolean r5 = r5.contains(r11)
            if (r5 == 0) goto L3d
            goto L55
        L54:
            r4 = 0
        L55:
            if (r4 == 0) goto Le9
            java.util.List r1 = r4.xt()
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Le9
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r8 = android.text.TextUtils.equals(r5, r14)
            if (r8 == 0) goto L5f
            java.lang.String r1 = "setAdnError rit_level 命中errorCode = "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = r1.concat(r5)
            com.bytedance.msdk.j.up.cw.j(r7, r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r8 = r1.getTime()
            long r4 = r4.j()
            long r4 = r4 + r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "setRitAdnError rit_level 更新时间 = "
            r1.<init>(r8)
            java.lang.String r8 = com.bytedance.msdk.core.tl.m.xt(r4)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r7, r1)
            com.bytedance.msdk.core.tl.j r1 = new com.bytedance.msdk.core.tl.j
            r2 = r12
            r3 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r6)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> r4 = r10.cw
            if (r4 == 0) goto Le9
            java.lang.Object r4 = r4.get(r12)
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            if (r4 != 0) goto Lba
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
        Lba:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            java.lang.String r0 = "_"
            r5.append(r0)
            r5.append(r13)
            java.lang.String r0 = r5.toString()
            r4.put(r0, r1)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> r0 = r10.cw
            r0.put(r12, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setRitAdnError rit_level mAdnControlMap = "
            r0.<init>(r1)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> r1 = r10.cw
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r7, r0)
        Le9:
            return
    }

    public void j(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.tl.xt>> r3) {
            r2 = this;
            r2.xt = r3
            java.lang.String r0 = "TTMediationSDK_RitAdnShowControl"
            if (r3 == 0) goto L1a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "mRitAdnControlConfigMap = "
            r3.<init>(r1)
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.tl.xt>> r1 = r2.xt
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r3)
            return
        L1a:
            java.lang.String r3 = "mRitAdnControlConfigMap is null "
            com.bytedance.msdk.j.up.cw.j(r0, r3)
            return
    }

    public boolean j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "hasRitAdnConfig rit_level adnName = "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " primeRit = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK_RitAdnShowControl"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L62
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L62
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.tl.xt>> r0 = r2.xt
            if (r0 == 0) goto L62
            int r0 = r0.size()
            if (r0 != 0) goto L33
            goto L62
        L33:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.tl.xt>> r0 = r2.xt
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L62
            int r0 = r4.size()
            if (r0 != 0) goto L44
            goto L62
        L44:
            java.util.Iterator r4 = r4.iterator()
        L48:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r4.next()
            com.bytedance.msdk.core.tl.xt r0 = (com.bytedance.msdk.core.tl.xt) r0
            java.util.List r0 = r0.cw()
            if (r0 == 0) goto L48
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L48
            r3 = 1
            return r3
        L62:
            return r1
    }
}
