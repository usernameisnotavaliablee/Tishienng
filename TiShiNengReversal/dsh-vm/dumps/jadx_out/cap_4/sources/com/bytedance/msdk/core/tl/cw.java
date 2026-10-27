package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.xt> j;
    private java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> xt;

    /* renamed from: com.bytedance.msdk.core.tl.cw$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class j {
        private static com.bytedance.msdk.core.tl.cw j;

        static {
                com.bytedance.msdk.core.tl.cw r0 = new com.bytedance.msdk.core.tl.cw
                r1 = 0
                r0.<init>(r1)
                com.bytedance.msdk.core.tl.cw.j.j = r0
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.bytedance.msdk.core.tl.cw j() {
                com.bytedance.msdk.core.tl.cw r0 = com.bytedance.msdk.core.tl.cw.j.j
                return r0
        }
    }

    private cw() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.xt = r0
            return
    }

    /* synthetic */ cw(com.bytedance.msdk.core.tl.cw.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.msdk.core.tl.cw j() {
            com.bytedance.msdk.core.tl.cw r0 = com.bytedance.msdk.core.tl.cw.j.j()
            return r0
    }

    public com.bytedance.msdk.api.j j(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkLoad adnName = "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " slotId = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK_AdnShowControl"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> r0 = r7.xt
            r2 = 0
            if (r0 == 0) goto L3c
            java.lang.Object r8 = r0.get(r8)
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            if (r8 == 0) goto L3c
            java.lang.Object r8 = r8.get(r9)
            com.bytedance.msdk.core.tl.j r8 = (com.bytedance.msdk.core.tl.j) r8
            java.lang.String r9 = "checkLoad 取出的showBean = "
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r9 = r9.concat(r0)
            com.bytedance.msdk.j.up.cw.j(r1, r9)
            goto L3d
        L3c:
            r8 = r2
        L3d:
            if (r8 == 0) goto L95
            long r3 = r8.j()
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L95
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            long r3 = r9.getTime()
            long r5 = r8.j()
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 > 0) goto L95
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "checkLoad 当前时间 = "
            r9.<init>(r0)
            java.lang.String r0 = com.bytedance.msdk.core.tl.m.xt(r3)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "checkLoad 规则有效时间 = "
            r9.<init>(r0)
            long r2 = r8.j()
            java.lang.String r8 = com.bytedance.msdk.core.tl.m.xt(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r8)
            com.bytedance.msdk.api.xt.j r8 = new com.bytedance.msdk.api.xt.j
            r9 = 40044(0x9c6c, float:5.6114E-41)
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r9)
            r8.<init>(r9, r0)
            return r8
        L95:
            return r2
    }

    public void j(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setAdnError adnName = "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " slotId = "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " error = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK_AdnShowControl"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.xt> r0 = r6.j
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.get(r7)
            com.bytedance.msdk.core.tl.xt r0 = (com.bytedance.msdk.core.tl.xt) r0
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto La4
            java.util.List r2 = r0.xt()
            java.util.Iterator r2 = r2.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.equals(r3, r9)
            if (r4 == 0) goto L39
            java.lang.String r9 = "setAdnError 命中errorCode = "
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r9 = r9.concat(r2)
            com.bytedance.msdk.j.up.cw.j(r1, r9)
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            long r2 = r9.getTime()
            long r4 = r0.j()
            long r2 = r2 + r4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "setAdnError 更新时间 = "
            r9.<init>(r0)
            java.lang.String r0 = com.bytedance.msdk.core.tl.m.xt(r2)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r9)
            com.bytedance.msdk.core.tl.j r9 = new com.bytedance.msdk.core.tl.j
            r9.<init>(r7, r8, r2)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> r0 = r6.xt
            if (r0 == 0) goto La4
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r0.put(r8, r9)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> r8 = r6.xt
            r8.put(r7, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "setAdnError mAdnControlMap = "
            r7.<init>(r8)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.j>> r8 = r6.xt
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r7)
        La4:
            return
    }

    public void j(java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.core.tl.xt> r3) {
            r2 = this;
            r2.j = r3
            java.lang.String r0 = "TTMediationSDK_AdnShowControl"
            if (r3 == 0) goto L14
            java.lang.String r1 = "mAdnControlMap = "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            com.bytedance.msdk.j.up.cw.j(r0, r3)
            return
        L14:
            java.lang.String r3 = "mAdnControlMap is null "
            com.bytedance.msdk.j.up.cw.j(r0, r3)
            return
    }
}
